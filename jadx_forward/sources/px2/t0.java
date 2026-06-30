package px2;

/* loaded from: classes2.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c f440456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f440457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c c15413x7c45044c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd) {
        super(0);
        this.f440456d = c15413x7c45044c;
        this.f440457e = c15188xd8bd4bd;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in5.s0 s0Var;
        ow2.h hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.qj2 m59269xc27c9328;
        in5.s0 s0Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLockArea ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c c15413x7c45044c = this.f440456d;
        sb6.append(c15413x7c45044c.U);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalVideoPreviewLayout", sb6.toString());
        if (c15413x7c45044c.U != null) {
            float f17 = c15413x7c45044c.f214117x0;
            c15413x7c45044c.f214118x1 = true;
            c15413x7c45044c.f214119y0 = true;
            this.f440457e.m61420xeb2d9731(f17);
            px2.v0 v0Var = c15413x7c45044c.callback;
            so2.j5 j5Var = (v0Var == null || (s0Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.at) v0Var).f215336b.f217149q) == null) ? null : (so2.j5) s0Var2.f374658i;
            if (!(j5Var instanceof so2.j5)) {
                j5Var = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (m59269xc27c9328 = feedObject.m59269xc27c9328()) != null) {
                ey2.v2 v2Var = (ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class);
                java.lang.Long valueOf = java.lang.Long.valueOf(m59269xc27c9328.m75942xfb822ef2(0));
                android.content.Context context = c15413x7c45044c.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                v2Var.V6(valueOf, nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().m75939xb282bd08(5)) : null, f17);
            }
            px2.v0 v0Var2 = c15413x7c45044c.callback;
            if (v0Var2 != null && (s0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.at) v0Var2).f215336b.f217149q) != null && (hVar = c15413x7c45044c.W) != null) {
                hVar.g(f17, 2000L, new px2.o0(f17, c15413x7c45044c, s0Var), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yk.f214931d, s0Var, true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalVideoPreviewLayout", "lockSpeed: speed=" + f17);
            c15413x7c45044c.y();
        }
        return jz5.f0.f384359a;
    }
}
