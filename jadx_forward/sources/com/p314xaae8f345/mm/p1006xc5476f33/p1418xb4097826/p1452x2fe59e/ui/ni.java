package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class ni implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14071x7133e7d3 f191878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14072x6386c4f6 f191879b;

    public ni(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14071x7133e7d3 c14071x7133e7d3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14072x6386c4f6 activityC14072x6386c4f6) {
        this.f191878a = c14071x7133e7d3;
        this.f191879b = activityC14072x6386c4f6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0
    /* renamed from: call */
    public void mo981x2e7a5e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14071x7133e7d3 c14071x7133e7d3 = this.f191878a;
        java.lang.Object Z = kz5.n0.Z(c14071x7133e7d3.m56387xe6796cde());
        so2.u1 u1Var = Z instanceof so2.u1 ? (so2.u1) Z : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14072x6386c4f6 activityC14072x6386c4f6 = this.f191879b;
        if (u1Var != null) {
            u1Var.getFeedObject().m59407x661b1f55();
            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(u1Var.getFeedObject().m59264x7efe73ec());
            if (mb4Var != null && u1Var.getIsPreview() && ((r45.h70) mb4Var.m75936x14adae67(21)) != null) {
                r45.h70 h70Var = (r45.h70) mb4Var.m75936x14adae67(21);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h70Var);
                r45.i70 i70Var = h70Var.f457435i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i70Var);
                if (i70Var.f458327z != null) {
                    if (activityC14072x6386c4f6.P) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
                        r45.vl5 vl5Var = i70Var.f458327z.f472263d;
                        ((b92.u2) vVar).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.f(vl5Var, rect);
                        mb4Var.set(4, java.lang.Float.valueOf(rect.width()));
                        mb4Var.set(5, java.lang.Float.valueOf(rect.height()));
                    } else {
                        android.graphics.Rect rect2 = new android.graphics.Rect();
                        bg0.v vVar2 = (bg0.v) i95.n0.c(bg0.v.class);
                        r45.vl5 vl5Var2 = i70Var.A.f472263d;
                        ((b92.u2) vVar2).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.f(vl5Var2, rect2);
                        mb4Var.set(4, java.lang.Float.valueOf(rect2.width()));
                        mb4Var.set(5, java.lang.Float.valueOf(rect2.height()));
                    }
                } else if (activityC14072x6386c4f6.P) {
                    mb4Var.set(4, java.lang.Float.valueOf(i70Var.f458309e));
                    mb4Var.set(5, java.lang.Float.valueOf(i70Var.f458310f));
                } else {
                    android.graphics.Rect rect3 = new android.graphics.Rect();
                    bg0.v vVar3 = (bg0.v) i95.n0.c(bg0.v.class);
                    r45.vl5 vl5Var3 = i70Var.f458311g;
                    ((b92.u2) vVar3).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.f(vl5Var3, rect3);
                    mb4Var.set(4, java.lang.Float.valueOf(rect3.width()));
                    mb4Var.set(5, java.lang.Float.valueOf(rect3.height()));
                }
            }
        }
        java.lang.Object Z2 = kz5.n0.Z(c14071x7133e7d3.m56387xe6796cde());
        so2.d1 d1Var = Z2 instanceof so2.d1 ? (so2.d1) Z2 : null;
        if (d1Var != null && d1Var.getIsPreview()) {
            d1Var.getFeedObject().m59407x661b1f55();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ap apVar = activityC14072x6386c4f6.f191036z;
        if (apVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = apVar.o().m82555x4905e9fa().getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        if (c15415x74224fd8 != null) {
            int m56356xb1ee36ee = c14071x7133e7d3.m56356xb1ee36ee();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(m56356xb1ee36ee));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c15415x74224fd8, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c15415x74224fd8.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c15415x74224fd8, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c15415x74224fd8.C = false;
        }
        java.lang.Object Z3 = kz5.n0.Z(c14071x7133e7d3.m56387xe6796cde());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = Z3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) Z3 : null;
        if (abstractC14490x69736cb5 != null && abstractC14490x69736cb5.getIsPreview()) {
            bg0.a0 a0Var = (bg0.a0) i95.n0.c(bg0.a0.class);
            int i18 = activityC14072x6386c4f6.P ? 1 : 2;
            ((b92.z2) a0Var).getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6559xe3d38208 c6559xe3d38208 = xo4.c.f537302a;
            c6559xe3d38208.f139084i = i18;
            c6559xe3d38208.f139085j = 2;
            c6559xe3d38208.k();
        }
        if (i17 > 0) {
            android.view.View findViewById = activityC14072x6386c4f6.findViewById(com.p314xaae8f345.mm.R.id.imf);
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = activityC14072x6386c4f6.findViewById(com.p314xaae8f345.mm.R.id.imf);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById3 = activityC14072x6386c4f6.findViewById(com.p314xaae8f345.mm.R.id.oai);
        if (findViewById3 == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$4$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
