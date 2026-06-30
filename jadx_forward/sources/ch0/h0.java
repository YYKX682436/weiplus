package ch0;

/* loaded from: classes8.dex */
public final class h0 implements tg0.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final qx4.d0 f122757a;

    /* renamed from: b, reason: collision with root package name */
    public final ch0.b0 f122758b;

    public h0(qx4.d0 real, ch0.b0 searchDataManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(real, "real");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchDataManager, "searchDataManager");
        this.f122757a = real;
        this.f122758b = searchDataManager;
    }

    public void a(int i17, tg0.c1 result) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        tg0.f2 f2Var = tg0.g2.f500606e;
        qx4.d0 jsApi = this.f122757a;
        ch0.b0 b0Var = this.f122758b;
        if (i17 == 1) {
            b0Var.a(result, jsApi);
            return;
        }
        b0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApi, "jsApi");
        java.lang.String c17 = tg0.m1.c(result);
        qx4.b l17 = jsApi.l();
        if (l17 == null || (mo9090x86b9ebe3 = l17.mo9090x86b9ebe3()) == null) {
            return;
        }
        av4.y0.f95883a.b(mo9090x86b9ebe3, "onFlutterResultReady", c17);
    }

    public void b(java.lang.String funcName, org.json.JSONObject params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f122757a.m(funcName, params);
    }

    public void c(int i17, tg0.c1 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        tg0.f2 f2Var = tg0.g2.f500606e;
        qx4.d0 d0Var = this.f122757a;
        ch0.b0 b0Var = this.f122758b;
        if (i17 == 1) {
            b0Var.c(result, d0Var);
        } else {
            b0Var.b(result, d0Var);
        }
    }
}
