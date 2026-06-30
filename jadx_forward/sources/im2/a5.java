package im2;

/* loaded from: classes3.dex */
public final class a5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be f373780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f373781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be, im2.h6 h6Var) {
        super(0);
        this.f373780d = c5560x6f070be;
        this.f373781e = h6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        am.zd zdVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = this.f373780d;
        java.lang.Integer valueOf = (c5560x6f070be == null || (zdVar = c5560x6f070be.f135879g) == null) ? null : java.lang.Integer.valueOf(zdVar.f90085b);
        im2.h6 h6Var = this.f373781e;
        if (valueOf != null && valueOf.intValue() == 1) {
            java.lang.String string = h6Var.f373893J ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7f) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            pm0.v.X(new im2.w5(h6Var, string, com.p314xaae8f345.mm.R.raw.f80084xebd378da));
        } else if (valueOf != null && valueOf.intValue() == 2) {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573315e83);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            h6Var.getClass();
            pm0.v.X(new im2.w5(h6Var, string2, com.p314xaae8f345.mm.R.raw.f80084xebd378da));
        } else if (valueOf != null && valueOf.intValue() == 3) {
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573314e82);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            h6Var.getClass();
            pm0.v.X(new im2.w5(h6Var, string3, com.p314xaae8f345.mm.R.raw.f80084xebd378da));
        }
        return jz5.f0.f384359a;
    }
}
