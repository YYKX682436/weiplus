package rk4;

/* loaded from: classes11.dex */
public final class w3 {
    public w3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(pi0.l1 instance, w71.t0 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instance, "instance");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        bw5.j20 Pa = params.Pa();
        bw5.l20 l20Var = new bw5.l20();
        l20Var.f111143d = instance.f436180f;
        boolean[] zArr = l20Var.f111149m;
        zArr[1] = true;
        l20Var.f111144e = Pa.f110308h[2] ? Pa.f110305e : bw5.f20.HybridRouterBizTypeDefault;
        zArr[2] = true;
        l20Var.f111145f = Pa.b();
        zArr[3] = true;
        l20Var.f111146g = Pa.f110307g;
        zArr[4] = true;
        l20Var.f111147h = params.nb();
        zArr[5] = true;
        byte[] mo14344x5f01b1f6 = l20Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3380x6a61f93.p3386xf51b86f1.C30593x21b11a15.m170110x21b973d2(mo14344x5f01b1f6);
        rk4.v3 v3Var = new rk4.v3(instance, l20Var);
        int i17 = w71.s0.f524981d;
        java.lang.String str = zArr[1] ? l20Var.f111143d : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPageId(...)");
        p3380x6a61f93.p3386xf51b86f1.C30594x21b1b41c.m170116x21b80ec3(str, v3Var);
    }
}
