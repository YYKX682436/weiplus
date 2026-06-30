package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class s50 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 f217395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217396e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833, in5.s0 s0Var) {
        super(0);
        this.f217395d = c15477xbd78f833;
        this.f217396e = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.qj2 m59269xc27c9328;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833 = this.f217395d;
        float f17 = c15477xbd78f833.f215184v;
        in5.s0 s0Var = this.f217396e;
        if (s0Var.p(com.p314xaae8f345.mm.R.id.uql) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedControlUIC", "lockSpeed playSpeedLockLayout is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedControlUIC", "lockSpeed speed: " + f17);
            c15477xbd78f833.f215185w = true;
            so2.j5 j5Var = (so2.j5) s0Var.f374658i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (m59269xc27c9328 = feedObject.m59269xc27c9328()) != null) {
                ey2.v2 v2Var = (ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class);
                java.lang.Long valueOf = java.lang.Long.valueOf(m59269xc27c9328.m75942xfb822ef2(0));
                android.app.Activity context = c15477xbd78f833.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                v2Var.V6(valueOf, nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().m75939xb282bd08(5)) : null, f17);
            }
            c15477xbd78f833.f215181s.g(f17, 2000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v50(f17, c15477xbd78f833, s0Var), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yk.f214931d, s0Var, false);
            c15477xbd78f833.W6(s0Var);
        }
        return jz5.f0.f384359a;
    }
}
