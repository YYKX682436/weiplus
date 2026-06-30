package r01;

/* loaded from: classes7.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.l1 f449618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b f449619e;

    public g1(r01.l1 l1Var, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar) {
        this.f449618d = l1Var;
        this.f449619e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r01.l1 l1Var = this.f449618d;
        r01.m0 m0Var = l1Var.f449681m;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = this.f449619e;
        java.lang.String biz = bVar.f299422e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(biz, "biz");
        m0Var.getClass();
        m0Var.f449686a = biz;
        byte[] m75960xfb7e5820 = bVar.m75960xfb7e5820();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75960xfb7e5820, "getData(...)");
        if (!(m75960xfb7e5820.length == 0)) {
            l1Var.f449681m.f449687b = bVar;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizPersonalCenterPluginAppHelper", "setupAllAccounts: photoResp empty, skip save photo resp cache");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "setupAllAccounts: photo cache initialized, biz=" + bVar.f299422e);
    }
}
