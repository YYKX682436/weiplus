package l41;

/* loaded from: classes4.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f397401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397402f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(yz5.l lVar, k41.g0 g0Var, android.content.Context context) {
        super(1);
        this.f397400d = lVar;
        this.f397401e = g0Var;
        this.f397402f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f397400d.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuLocationReqController", "reportLocation success:%s", java.lang.Boolean.valueOf(booleanValue));
        if (booleanValue) {
            k41.g0 g0Var = this.f397401e;
            java.lang.String str = g0Var.f68613xdec927b;
            if (str == null) {
                str = "";
            }
            java.lang.String string = this.f397402f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g0o, g0Var.f68604x21f9b213);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.e1(c01.id.a());
            f9Var.u1(str);
            f9Var.d1(string);
            f9Var.m124850x7650bebc(10000);
            cj6.M9(f9Var);
            g0Var.f68603x672cb5cf = true;
            g0Var.f68598xec0735e1 = true;
            k41.o0.f(g0Var);
            java.lang.String str2 = g0Var.f68613xdec927b;
            java.lang.String str3 = str2 != null ? str2 : "";
            java.lang.String field_locationType = g0Var.f68602x8b26fb4;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_locationType, "field_locationType");
            l41.l1 l1Var = l41.l1.f397398d;
            java.lang.String lowerCase = field_locationType.toLowerCase(java.util.Locale.ROOT);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, "wgs84");
            if (l41.r1.f397447b == null) {
                l41.r1.f397447b = new l41.q1(str3, b17, 2, l1Var);
            }
            if (b17) {
                i11.h.e().k(l41.r1.f397447b, false);
            } else {
                i11.h.e().j(l41.r1.f397447b, false);
            }
        }
        return jz5.f0.f384359a;
    }
}
