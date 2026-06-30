package xt2;

/* loaded from: classes3.dex */
public final class o2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f538451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f538453f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(android.content.Context context, xt2.e3 e3Var, cm2.k0 k0Var) {
        super(5);
        this.f538451d = context;
        this.f538452e = e3Var;
        this.f538453f = k0Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        int intValue = ((java.lang.Number) obj3).intValue();
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = this.f538451d;
        r4Var.h3(context, false);
        xt2.e3 e3Var = this.f538452e;
        if (booleanValue || intValue == -200187) {
            this.f538453f.G = false;
            xt2.e3.b(e3Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e3Var.f538239h, "issue coupon failed");
            db5.t7.g(context, ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.edx, java.lang.Integer.valueOf(intValue)));
        }
        return jz5.f0.f384359a;
    }
}
