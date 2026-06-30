package cx;

/* loaded from: classes7.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bx.x f305929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx.f0 f305930e;

    public e0(bx.x xVar, cx.f0 f0Var) {
        this.f305929d = xVar;
        this.f305930e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jc3.j0 j0Var;
        cl0.g gVar = new cl0.g();
        cx.f0 f0Var = this.f305930e;
        gVar.o("bizExist", f0Var.f305955e != null ? 1 : 0);
        cx.w0 w0Var = f0Var.f305955e;
        gVar.h("bizStatus", (w0Var == null || (j0Var = w0Var.f364528g) == null) ? null : java.lang.Integer.valueOf(((rc3.w0) j0Var).f475632t));
        gVar.r("isProcessExist", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274592g));
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        bx.x xVar = bx.x.f117764f;
        bx.x xVar2 = this.f305929d;
        if (xVar2 == xVar) {
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandResortMbEnv", 1, gVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16455x3f8428aa.f37610xc8814b8.getValue());
        } else if (xVar2 == bx.x.f117765g) {
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandResortMbEnv", 0, gVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16455x3f8428aa.f37610xc8814b8.getValue());
        }
    }
}
