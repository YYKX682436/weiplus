package cp2;

/* loaded from: classes2.dex */
public final class m0 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f302384a;

    public m0(cp2.v0 v0Var) {
        this.f302384a = v0Var;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        cp2.v0 v0Var = this.f302384a;
        if (booleanValue) {
            v0Var.V();
            return;
        }
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.era);
        s3Var.f545050b = -2;
        v0Var.g(s3Var);
    }
}
