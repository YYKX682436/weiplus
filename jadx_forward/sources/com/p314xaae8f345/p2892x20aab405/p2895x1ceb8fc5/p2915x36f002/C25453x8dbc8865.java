package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002;

/* renamed from: com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor */
/* loaded from: classes16.dex */
public class C25453x8dbc8865 {

    /* renamed from: ENABLE */
    private static final boolean f46157x7a281983 = false;
    private static final java.lang.String TAG = "AudioTrackMonitor";

    /* renamed from: mAudioTrackRef */
    private java.lang.ref.WeakReference<android.media.AudioTrack> f46158x339999d1;

    /* renamed from: mLastTime */
    private long f46161xce00c610 = java.lang.System.nanoTime();

    /* renamed from: mLastPosition */
    private long f46160x5d9bb2ec = 0;

    /* renamed from: mLooperTime */
    private int f46162x16fde90b = 200;

    /* renamed from: mStop */
    private boolean f46164x6277e0f = false;

    /* renamed from: mBuilder */
    private java.lang.StringBuilder f46159xabdca26e = new java.lang.StringBuilder(100);

    /* renamed from: mMonitorThread */
    private java.lang.Thread f46163xc8b3d497 = new java.lang.Thread("Monitor-AudioTrack") { // from class: com.tencent.qqmusic.mediaplayer.util.AudioTrackMonitor.1
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (!com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46164x6277e0f) {
                try {
                    java.lang.Thread.currentThread();
                    java.lang.Thread.sleep(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46162x16fde90b);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.TAG, th6);
                }
                try {
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.TAG, th7);
                }
                if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46158x339999d1 == null || com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46158x339999d1.get() == null) {
                    return;
                }
                android.media.AudioTrack audioTrack = (android.media.AudioTrack) com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46158x339999d1.get();
                if (audioTrack != null) {
                    long playbackHeadPosition = audioTrack.getPlaybackHeadPosition();
                    long j17 = playbackHeadPosition - com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46160x5d9bb2ec;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46160x5d9bb2ec = playbackHeadPosition;
                    long nanoTime = java.lang.System.nanoTime() - com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46161xce00c610;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46161xce00c610 = java.lang.System.nanoTime();
                    java.lang.StringBuilder sb6 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46159xabdca26e;
                    sb6.append("play-speedTime-");
                    sb6.append(nanoTime);
                    sb6.append(",play-speedPosition-");
                    sb6.append(j17);
                    java.lang.StringBuilder sb7 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46159xabdca26e;
                    sb7.append(",playstate-");
                    sb7.append(audioTrack.getPlayState());
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.TAG, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46159xabdca26e.toString());
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46159xabdca26e.delete(0, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25453x8dbc8865.this.f46159xabdca26e.length());
                }
            }
        }
    };

    public C25453x8dbc8865(android.media.AudioTrack audioTrack) {
        this.f46158x339999d1 = null;
        this.f46158x339999d1 = new java.lang.ref.WeakReference<>(audioTrack);
    }

    /* renamed from: start */
    public void m94335x68ac462() {
    }

    /* renamed from: stop */
    public void m94336x360802() {
    }
}
