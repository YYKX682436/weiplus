package l41;

/* loaded from: classes4.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f397412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397413f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(yz5.l lVar, k41.g0 g0Var, android.content.Context context) {
        super(1);
        this.f397411d = lVar;
        this.f397412e = g0Var;
        this.f397413f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f397411d.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        if (booleanValue) {
            k41.g0 g0Var = this.f397412e;
            java.lang.String str = g0Var.f68613xdec927b;
            if (str == null) {
                str = "";
            }
            java.lang.String string = this.f397413f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g0p, g0Var.f68604x21f9b213);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.e1(c01.id.a());
            f9Var.u1(str);
            f9Var.d1(string);
            f9Var.m124850x7650bebc(10000);
            cj6.M9(f9Var);
            g0Var.f68603x672cb5cf = false;
            k41.o0.f(g0Var);
        }
        return jz5.f0.f384359a;
    }
}
