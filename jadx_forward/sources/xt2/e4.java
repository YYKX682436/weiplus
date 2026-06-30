package xt2;

/* loaded from: classes3.dex */
public final class e4 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f538257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.j31 f538258b;

    public e4(xt2.b5 b5Var, r45.j31 j31Var) {
        this.f538257a = b5Var;
        this.f538258b = j31Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        int i17;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FLASH_SALE_ENABLED_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        xt2.b5 b5Var = this.f538257a;
        if (z17) {
            abstractActivityC21394xb3d2c0cf = b5Var.f538169h;
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.lqv;
        } else {
            abstractActivityC21394xb3d2c0cf = b5Var.f538169h;
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.lqu;
        }
        java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        db5.t7.i(b5Var.f538169h, string, com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        b5Var.C(z17, this.f538258b);
    }
}
