package rk4;

/* loaded from: classes11.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25176x66a813 f478371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f478372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f478373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f478374g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25177xe9583a5 f478375h;

    public m2(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25176x66a813 c25176x66a813, rk4.l3 l3Var, android.app.Activity activity, bw5.lp0 lp0Var, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25177xe9583a5 c25177xe9583a5) {
        this.f478371d = c25176x66a813;
        this.f478372e = l3Var;
        this.f478373f = activity;
        this.f478374g = lp0Var;
        this.f478375h = c25177xe9583a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bw5.d60 d60Var;
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25176x66a813 c25176x66a813 = this.f478371d;
        long m93110x82fda3e3 = c25176x66a813.m93110x82fda3e3();
        bw5.lp0 tingItem = this.f478374g;
        android.app.Activity activity = this.f478373f;
        rk4.l3 l3Var = this.f478372e;
        if (m93110x82fda3e3 == 1) {
            cl4.v b17 = l3Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b17.k(activity, tingItem, c25176x66a813);
            return;
        }
        if (m93110x82fda3e3 == 2) {
            cl4.v b18 = l3Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b18.l(activity, tingItem);
        } else if (m93110x82fda3e3 == 3) {
            cl4.v b19 = l3Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b19.c(activity, tingItem);
        } else if (m93110x82fda3e3 == 4) {
            try {
                d60Var = new bw5.d60().mo11468x92b714fd(this.f478375h.m93125x5b0d16c1());
            } catch (java.lang.Exception unused) {
                d60Var = null;
            }
            cl4.v b27 = l3Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            b27.h(activity, tingItem, d60Var);
        }
    }
}
