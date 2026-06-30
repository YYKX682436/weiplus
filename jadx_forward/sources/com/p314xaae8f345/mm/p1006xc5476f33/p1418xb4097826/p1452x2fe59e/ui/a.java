package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class a implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13929xfdbd586b f191171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f f191172b;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13929xfdbd586b activityC13929xfdbd586b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f c13681xd53f292f) {
        this.f191171a = activityC13929xfdbd586b;
        this.f191172b = c13681xd53f292f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0
    /* renamed from: call */
    public void mo981x2e7a5e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13929xfdbd586b activityC13929xfdbd586b = this.f191171a;
        ab2.h0 h0Var = activityC13929xfdbd586b.f190729y;
        if (h0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = h0Var.m56068x4905e9fa().getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f c13681xd53f292f = this.f191172b;
        if (layoutManager != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager;
            int m56356xb1ee36ee = c13681xd53f292f.m56356xb1ee36ee();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(m56356xb1ee36ee));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c15415x74224fd8, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c15415x74224fd8.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c15415x74224fd8, "com/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        java.util.AbstractCollection<so2.j5> m56387xe6796cde = c13681xd53f292f.m56387xe6796cde();
        activityC13929xfdbd586b.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (so2.j5 j5Var : m56387xe6796cde) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject() : null;
            if (feedObject != null) {
                arrayList2.add(feedObject);
            }
        }
        pf5.u uVar = pf5.u.f435469a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.e(zy2.b6.class).a(xc2.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        xc2.k0.f7((xc2.k0) a17, arrayList2, 120, null, 0, null, null, 60, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg ggVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) uVar.c(activityC13929xfdbd586b).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class);
        ab2.h0 h0Var2 = activityC13929xfdbd586b.f190729y;
        if (h0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        ggVar.Q6(h0Var2.m56068x4905e9fa());
    }
}
