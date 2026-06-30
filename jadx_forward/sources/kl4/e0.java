package kl4;

/* loaded from: classes15.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f390435d;

    public e0(kl4.k0 k0Var) {
        this.f390435d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.k0 k0Var = this.f390435d;
        android.media.AudioTrack audioTrack = k0Var.f390462d;
        if (audioTrack != null) {
            kl4.b0 b0Var = k0Var.f390478w;
            kl4.b0 b0Var2 = kl4.b0.f390420g;
            if (b0Var != b0Var2) {
                java.lang.String str = k0Var.f390481z;
                try {
                    audioTrack.pause();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "pauseInner call audioTrack pause()");
                    k0Var.e(b0Var2);
                } catch (java.lang.IllegalStateException e17) {
                    rk4.k5.d(str, "AudioTrack pause error: " + e17.getMessage());
                }
            }
        }
    }
}
