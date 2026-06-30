package yx3;

/* loaded from: classes15.dex */
public final class c0 implements m8.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.e0 f549428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx3.y f549429e;

    public c0(yx3.e0 e0Var, yx3.y yVar) {
        this.f549428d = e0Var;
        this.f549429e = yVar;
    }

    @Override // m8.z
    public void A() {
    }

    @Override // m8.z
    public void b(boolean z17) {
    }

    @Override // m8.z
    public void d(m8.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayerError error:");
        sb6.append(eVar != null ? eVar.getLocalizedMessage() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TTSFilePlayer", sb6.toString());
        ((ku5.t0) ku5.t0.f394148d).g(new yx3.z(this.f549428d, this.f549429e));
    }

    @Override // m8.z
    public void e(d9.l0 l0Var, q9.n nVar) {
    }

    @Override // m8.z
    public void t(m8.m0 m0Var, java.lang.Object obj) {
    }

    @Override // m8.z
    public void u(m8.y yVar) {
    }

    @Override // m8.z
    public void y(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TTSFilePlayer", "onPlayerStateChanged playWhenReady:" + z17 + ", playbackState:" + i17);
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TTSFilePlayer", "play ready");
            ((ku5.t0) ku5.t0.f394148d).g(new yx3.b0(this.f549429e));
            return;
        }
        if (i17 != 4) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TTSFilePlayer", "play end");
        ((ku5.t0) ku5.t0.f394148d).g(new yx3.a0(this.f549428d, this.f549429e));
    }

    @Override // m8.z
    public void z(int i17) {
    }
}
