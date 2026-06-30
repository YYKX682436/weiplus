package cp2;

/* loaded from: classes2.dex */
public final class n0 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f302387a;

    public n0(cp2.v0 v0Var) {
        this.f302387a = v0Var;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        cp2.v0 v0Var = this.f302387a;
        if (booleanValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = v0Var.f302476w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14500x958689dc);
            c14500x958689dc.d(v0Var.v(), v0Var.q(), v0Var.f302467n);
        } else {
            ym5.s3 s3Var = new ym5.s3(0);
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.era);
            s3Var.f545050b = -2;
            v0Var.g(s3Var);
        }
    }
}
