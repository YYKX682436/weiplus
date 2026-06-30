package org.p3371xd0ce3e8d.p3372x58d9bd6;

/* renamed from: org.webrtc.audio.LowLatencyAudioBufferManager */
/* loaded from: classes14.dex */
class C29923x81ae47e1 {
    private static final java.lang.String TAG = "LowLatencyAudioBufferManager";

    /* renamed from: prevUnderrunCount */
    private int f76210x8cc968a9 = 0;

    /* renamed from: ticksUntilNextDecrease */
    private int f76211x943e6359 = 10;

    /* renamed from: keepLoweringBufferSize */
    private boolean f76209xba42b8e7 = true;

    /* renamed from: bufferIncreaseCounter */
    private int f76208x11195cfa = 0;

    /* renamed from: maybeAdjustBufferSize */
    public void m156662x262d55d8(android.media.AudioTrack audioTrack) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            int underrunCount = audioTrack.getUnderrunCount();
            if (underrunCount > this.f76210x8cc968a9) {
                if (this.f76208x11195cfa < 5) {
                    int bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                    int playbackRate = (audioTrack.getPlaybackRate() / 100) + bufferSizeInFrames;
                    org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Underrun detected! Increasing AudioTrack buffer size from " + bufferSizeInFrames + " to " + playbackRate);
                    audioTrack.setBufferSizeInFrames(playbackRate);
                    this.f76208x11195cfa = this.f76208x11195cfa + 1;
                }
                this.f76209xba42b8e7 = false;
                this.f76210x8cc968a9 = underrunCount;
                this.f76211x943e6359 = 10;
                return;
            }
            if (this.f76209xba42b8e7) {
                int i17 = this.f76211x943e6359 - 1;
                this.f76211x943e6359 = i17;
                if (i17 <= 0) {
                    int playbackRate2 = audioTrack.getPlaybackRate() / 100;
                    int bufferSizeInFrames2 = audioTrack.getBufferSizeInFrames();
                    int max = java.lang.Math.max(playbackRate2, bufferSizeInFrames2 - playbackRate2);
                    if (max != bufferSizeInFrames2) {
                        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Lowering AudioTrack buffer size from " + bufferSizeInFrames2 + " to " + max);
                        audioTrack.setBufferSizeInFrames(max);
                    }
                    this.f76211x943e6359 = 10;
                }
            }
        }
    }
}
