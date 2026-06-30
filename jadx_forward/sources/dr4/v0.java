package dr4;

/* loaded from: classes14.dex */
public final class v0 extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324286d;

    public v0(dr4.p1 p1Var) {
        this.f324286d = p1Var;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onAppBackground: ");
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        pq4.c l17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("render in onAppForeground: ");
        dr4.p1 p1Var = this.f324286d;
        sb6.append(p1Var.h());
        sb6.append(" || ");
        sb6.append(p1Var.g());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", sb6.toString());
        boolean z17 = false;
        if (str != null && r26.n0.B(str, "com.tencent.mm", false)) {
            z17 = true;
        }
        if (!z17 || (l17 = gq4.v.Bi().l("CAMERA")) == null) {
            return;
        }
        l17.b(new dr4.u0(p1Var));
    }
}
