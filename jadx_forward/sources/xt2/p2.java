package xt2;

/* loaded from: classes3.dex */
public final class p2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f538476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f538477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538478f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gk2.e f538479g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f538480h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(android.content.Context context, boolean z17, xt2.e3 e3Var, gk2.e eVar, cm2.k0 k0Var) {
        super(0);
        this.f538476d = context;
        this.f538477e = z17;
        this.f538478f = e3Var;
        this.f538479g = eVar;
        this.f538480h = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = this.f538476d;
        r4Var.h3(context, false);
        boolean z17 = this.f538477e;
        xt2.e3 e3Var = this.f538478f;
        if (z17) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 m175927x1297bbe1 = e3Var.m175927x1297bbe1();
            cm2.k0 k0Var = this.f538480h;
            int m75939xb282bd08 = k0Var.f124893v.m75939xb282bd08(21);
            qo0.c cVar = e3Var.f538236e;
            if (m75939xb282bd08 == 1) {
                gk2.e eVar = e3Var.R;
                mm2.f6 f6Var = eVar != null ? (mm2.f6) eVar.a(mm2.f6.class) : null;
                if (f6Var != null) {
                    java.lang.String m75945x2fec8307 = k0Var.f124893v.m75945x2fec8307(20);
                    f6Var.U = m75945x2fec8307 != null ? m75945x2fec8307 : "";
                }
                qo0.c.a(cVar, qo0.b.f446901j2, null, 2, null);
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.Fj((ml2.r0) c17, ml2.f4.f408978s, k0Var, "0", null, 8, null);
            } else if (m75939xb282bd08 == 2) {
                r4Var.h3(abstractActivityC21394xb3d2c0cf, true);
                dk2.xf W0 = e3Var.f538238g.W0();
                if (W0 != null) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.lang.String str = k0Var.f124895x;
                    linkedList.add(str != null ? str : "");
                    ((dk2.r4) W0).m0(abstractActivityC21394xb3d2c0cf, linkedList, true, new xt2.n2(abstractActivityC21394xb3d2c0cf, k0Var, m175927x1297bbe1, e3Var));
                }
            } else if (m75939xb282bd08 == 3) {
                qo0.c.a(cVar, qo0.b.f446882f2, null, 2, null);
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.Fj((ml2.r0) c18, ml2.f4.f408978s, k0Var, "0", null, 8, null);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e3Var.f538239h, "get shop shelf failed");
        }
        return jz5.f0.f384359a;
    }
}
