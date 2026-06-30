package xn2;

/* loaded from: classes2.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5704xb2ebef43 f537042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(xn2.p0 p0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5704xb2ebef43 c5704xb2ebef43) {
        super(0);
        this.f537041d = p0Var;
        this.f537042e = c5704xb2ebef43;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xn2.p0 p0Var = this.f537041d;
        boolean i17 = p0Var.i();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5704xb2ebef43 c5704xb2ebef43 = this.f537042e;
        if (i17) {
            vn2.u0 u0Var = vn2.u0.f519920a;
            java.lang.String str = p0Var.f537078c;
            android.app.Activity activity = p0Var.f537076a;
            r45.qt2 l17 = p0Var.l();
            xn2.b bVar = p0Var.f537080e;
            ym5.q1 a17 = bVar != null ? ((xn2.f1) bVar).a() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca j17 = p0Var.j();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 finderFeed = c5704xb2ebef43.f136026g.f89247a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderFeed, "finderFeed");
            u0Var.d(str, activity, l17, a17, j17, 0, finderFeed, true, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 finderFeed2 = c5704xb2ebef43.f136026g.f89247a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderFeed2, "finderFeed");
            xn2.p0.b(p0Var, finderFeed2, false);
        }
        return jz5.f0.f384359a;
    }
}
