package r01;

/* loaded from: classes7.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b f449813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r01.m0 f449814e;

    public z0(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar, r01.m0 m0Var) {
        this.f449813d = bVar;
        this.f449814e = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = this.f449813d;
        java.lang.String str = bVar.f299422e;
        r01.m0 m0Var = this.f449814e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, m0Var.f449686a)) {
            m0Var.f449687b = bVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "onBizLogin: update acctResp");
        }
    }
}
