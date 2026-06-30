package vq4;

/* loaded from: classes14.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f520833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f520834e;

    public h0(vq4.m0 m0Var, yz5.l lVar) {
        this.f520833d = m0Var;
        this.f520834e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716(context);
        vq4.m0 m0Var = this.f520833d;
        m0Var.f520871b = c21000x8b2f716;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPAudioManager", "initMgr setSensorCallBack context is " + context);
        vq4.f0 f0Var = new vq4.f0(m0Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f7162 = m0Var.f520871b;
        if (c21000x8b2f7162 != null) {
            c21000x8b2f7162.b(f0Var);
        }
        if (m0Var.f520872c == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.s7(context);
            m0Var.f520873d = s7Var.a(new vq4.g0(m0Var)) ? 0L : -1L;
            m0Var.f520872c = s7Var;
        }
        m0Var.f520875f = this.f520834e;
    }
}
