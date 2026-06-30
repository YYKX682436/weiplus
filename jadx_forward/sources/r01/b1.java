package r01;

/* loaded from: classes7.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.m0 f449558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449559e;

    public b1(r01.m0 m0Var, java.lang.String str) {
        this.f449558d = m0Var;
        this.f449559e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r01.m0 m0Var = this.f449558d;
        java.lang.String str = m0Var.f449686a;
        java.lang.String str2 = this.f449559e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
            m0Var.getClass();
            m0Var.f449686a = "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "onBizLogout: clear biz");
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = m0Var.f449687b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar != null ? bVar.f299422e : null, str2)) {
            m0Var.f449687b = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "onBizLogout: clear acctResp");
        }
    }
}
