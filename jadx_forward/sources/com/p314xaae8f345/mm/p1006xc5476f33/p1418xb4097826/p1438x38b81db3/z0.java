package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1 f186606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f186607f;

    public z0(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1 b1Var, int i17) {
        this.f186605d = s0Var;
        this.f186606e = b1Var;
        this.f186607f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        jz5.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa;
        r45.ey0 ey0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert$refreshJumpToFeedListUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f186605d;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class)).f215183u) {
            int i17 = this.f186607f;
            android.view.View itemView = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1 b1Var = this.f186606e;
            ey2.u s17 = b1Var.s();
            if (s17 == null || (j0Var = s17.f339075x) == null || (lVar = (jz5.l) j0Var.mo3195x754a37bb()) == null || (c13920xa5f564aa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar.f384366d) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderColumnCardVideoConvert", "feedList is null or not DataBuffer<RVFeed> type");
            } else if (i17 < 0 || i17 >= c13920xa5f564aa.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderColumnCardVideoConvert", "Invalid position: " + i17 + ", feedList size: " + c13920xa5f564aa.size());
            } else {
                java.lang.Object obj = c13920xa5f564aa.get(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
                if (abstractC14490x69736cb5 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderColumnCardVideoConvert", "feed at position " + i17 + " is null or not BaseFinderFeed type");
                } else {
                    android.content.Context context2 = itemView.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                    r45.qt2 W6 = nyVar != null ? nyVar.W6(b1Var.f185590o) : new r45.qt2();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) itemView.findViewById(com.p314xaae8f345.mm.R.id.e_k);
                    if (c15196x85976f5f != null) {
                        c15196x85976f5f.W(abstractC14490x69736cb5.mo2128x1ed62e84(), false, true, 3);
                    }
                    r45.en2 en2Var = b1Var.f184451v;
                    int m75939xb282bd08 = (en2Var == null || (ey0Var = (r45.ey0) en2Var.m75936x14adae67(11)) == null) ? 0 : ey0Var.m75939xb282bd08(0);
                    if (!abstractC14490x69736cb5.getFeedObject().m59310xb9a58d36()) {
                        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17;
                        android.content.Context context3 = itemView.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                        i0Var.vj(context3, null, c13920xa5f564aa, s17.O6(), i17, en2Var != null ? en2Var.m75945x2fec8307(0) : null, m75939xb282bd08);
                    }
                    abstractC14490x69736cb5.l1(W6.m75939xb282bd08(5));
                    abstractC14490x69736cb5.a2(355);
                    abstractC14490x69736cb5.h1(true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert$refreshJumpToFeedListUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
