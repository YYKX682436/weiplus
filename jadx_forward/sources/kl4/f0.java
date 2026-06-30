package kl4;

/* loaded from: classes15.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f390437d;

    public f0(kl4.k0 k0Var) {
        this.f390437d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.k0 k0Var = this.f390437d;
        java.lang.String str = k0Var.f390481z;
        android.media.AudioTrack audioTrack = k0Var.f390462d;
        if (audioTrack != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "releaseAudioTrack");
                audioTrack.setPlaybackPositionUpdateListener(null);
                audioTrack.stop();
            } catch (java.lang.Exception e17) {
                rk4.k5.d(str, "releaseAudioTrack stop failed: " + e17.getMessage());
            }
            try {
                audioTrack.release();
            } catch (java.lang.Exception e18) {
                rk4.k5.d(str, "releaseAudioTrack stop failed: " + e18.getMessage());
            }
            k0Var.f390462d = null;
        }
    }
}
