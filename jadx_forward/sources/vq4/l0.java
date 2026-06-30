package vq4;

/* loaded from: classes14.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f520866d;

    public l0(vq4.m0 m0Var) {
        this.f520866d = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vq4.m0 m0Var = this.f520866d;
        if (m0Var.f520871b != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoIP.VoIPAudioManager", "removeSensorCallBack", new java.lang.Object[0]);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = m0Var.f520871b;
            if (c21000x8b2f716 != null) {
                c21000x8b2f716.a();
            }
            m0Var.f520871b = null;
            m0Var.f520877h = false;
            m0Var.f520878i = 0L;
            m0Var.f520876g = -1L;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = m0Var.f520872c;
        if (s7Var != null) {
            s7Var.b();
        }
        m0Var.f520880k = -1L;
        m0Var.f520873d = -1L;
    }
}
