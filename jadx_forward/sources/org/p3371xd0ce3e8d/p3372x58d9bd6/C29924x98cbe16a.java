package org.p3371xd0ce3e8d.p3372x58d9bd6;

/* renamed from: org.webrtc.audio.VolumeLogger */
/* loaded from: classes15.dex */
class C29924x98cbe16a {
    private static final java.lang.String TAG = "VolumeLogger";

    /* renamed from: THREAD_NAME */
    private static final java.lang.String f76212xf52cdfa0 = "WebRtcVolumeLevelLoggerThread";

    /* renamed from: TIMER_PERIOD_IN_SECONDS */
    private static final int f76213xdabce3e9 = 30;

    /* renamed from: audioManager */
    private final android.media.AudioManager f76214xd33b2ef7;

    /* renamed from: timer */
    private java.util.Timer f76215x6940745;

    /* renamed from: org.webrtc.audio.VolumeLogger$LogVolumeTask */
    /* loaded from: classes15.dex */
    public class LogVolumeTask extends java.util.TimerTask {

        /* renamed from: maxRingVolume */
        private final int f76216xd757edee;

        /* renamed from: maxVoiceCallVolume */
        private final int f76217x83bc13e6;

        public LogVolumeTask(int i17, int i18) {
            this.f76216xd757edee = i17;
            this.f76217x83bc13e6 = i18;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int mode = org.p3371xd0ce3e8d.p3372x58d9bd6.C29924x98cbe16a.this.f76214xd33b2ef7.getMode();
            if (mode == 1) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29924x98cbe16a.TAG, "STREAM_RING stream volume: " + org.p3371xd0ce3e8d.p3372x58d9bd6.C29924x98cbe16a.this.f76214xd33b2ef7.getStreamVolume(2) + " (max=" + this.f76216xd757edee + ")");
                return;
            }
            if (mode == 3) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.p3372x58d9bd6.C29924x98cbe16a.TAG, "VOICE_CALL stream volume: " + org.p3371xd0ce3e8d.p3372x58d9bd6.C29924x98cbe16a.this.f76214xd33b2ef7.getStreamVolume(0) + " (max=" + this.f76217x83bc13e6 + ")");
            }
        }
    }

    public C29924x98cbe16a(android.media.AudioManager audioManager) {
        this.f76214xd33b2ef7 = audioManager;
    }

    /* renamed from: start */
    public void m156664x68ac462() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "start" + org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156784xa79a89ce());
        if (this.f76215x6940745 != null) {
            return;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "audio mode is: " + org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156793x5b6d9d2f(this.f76214xd33b2ef7.getMode()));
        java.util.Timer timer = new java.util.Timer(f76212xf52cdfa0);
        this.f76215x6940745 = timer;
        timer.schedule(new org.p3371xd0ce3e8d.p3372x58d9bd6.C29924x98cbe16a.LogVolumeTask(this.f76214xd33b2ef7.getStreamMaxVolume(2), this.f76214xd33b2ef7.getStreamMaxVolume(0)), 0L, 30000L);
    }

    /* renamed from: stop */
    public void m156665x360802() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "stop" + org.p3371xd0ce3e8d.p3372x58d9bd6.C29930xdc90fce8.m156784xa79a89ce());
        java.util.Timer timer = this.f76215x6940745;
        if (timer != null) {
            timer.cancel();
            this.f76215x6940745 = null;
        }
    }
}
