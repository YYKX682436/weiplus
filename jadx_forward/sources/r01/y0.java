package r01;

/* loaded from: classes7.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.m0 f449811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449812e;

    public y0(r01.m0 m0Var, java.lang.String str) {
        this.f449811d = m0Var;
        this.f449812e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r01.m0 m0Var = this.f449811d;
        m0Var.getClass();
        java.lang.String str = this.f449812e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        m0Var.f449686a = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "onBizLogin: biz=".concat(str));
    }
}
