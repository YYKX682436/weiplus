package xt2;

/* loaded from: classes3.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f538434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f538435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 f538436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538437g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, cm2.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165, xt2.e3 e3Var) {
        super(2);
        this.f538434d = abstractActivityC21394xb3d2c0cf;
        this.f538435e = k0Var;
        this.f538436f = c15317x5870b165;
        this.f538437g = e3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.q62 q62Var = (r45.q62) obj2;
        zl2.r4 r4Var = zl2.r4.f555483a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f538434d;
        r4Var.h3(abstractActivityC21394xb3d2c0cf, false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Fj((ml2.r0) c17, ml2.f4.f408978s, this.f538435e, booleanValue ? "0" : "1", null, 8, null);
        java.lang.String m75945x2fec8307 = q62Var != null ? q62Var.m75945x2fec8307(2) : null;
        int m75939xb282bd08 = q62Var != null ? q62Var.m75939xb282bd08(3) : 0;
        java.lang.Integer valueOf = q62Var != null ? java.lang.Integer.valueOf(q62Var.m75939xb282bd08(4)) : null;
        cm2.k0 k0Var = this.f538435e;
        k0Var.j(m75945x2fec8307, m75939xb282bd08, valueOf, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165 = this.f538436f;
        if (c15317x5870b165 != null) {
            c15317x5870b165.c(k0Var, this.f538437g.e(), false);
        }
        if (booleanValue) {
            k0Var.i(abstractActivityC21394xb3d2c0cf);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "receive coupon failed");
        }
        return jz5.f0.f384359a;
    }
}
