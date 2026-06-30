package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class wo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o90 f186421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f186422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f186423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186424g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186425h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yo f186426i;

    public wo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o90 o90Var, int i17, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yo yoVar) {
        this.f186421d = o90Var;
        this.f186422e = i17;
        this.f186423f = view;
        this.f186424g = abstractC14490x69736cb5;
        this.f186425h = s0Var;
        this.f186426i = yoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o90 o90Var = this.f186421d;
        int a17 = o90Var.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        java.util.LinkedList linkedList = o90Var.f208832b;
        int i18 = this.f186422e;
        if (a17 == 1 || a17 == 2) {
            i17 = i18;
            intent.putExtra("UI_TITLE", o90Var.d());
            r45.aa1 aa1Var = (r45.aa1) o90Var.c().m75936x14adae67(11);
            if (aa1Var == null) {
                aa1Var = new r45.aa1();
            }
            r45.z91 z91Var = new r45.z91();
            z91Var.set(2, aa1Var.m75934xbce7f2f(2));
            z91Var.set(4, 2);
            jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
            z91Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
            z91Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
            z91Var.set(11, o90Var.c());
            hc2.e0.b(intent, i17, linkedList, aa1Var.m75934xbce7f2f(2), null);
            intent.putExtra("KEY_TITLE", o90Var.d());
            intent.putExtra("KEY_REQUEST_PB", z91Var.mo14344x5f01b1f6());
            intent.putExtra("KEY_MORE_ACTION_TYPE", o90Var.a());
            android.view.View view2 = this.f186423f;
            android.content.Context context = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context2 = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            i0Var.cl(context2, intent, 501);
        } else {
            if (a17 == 3 || a17 == 4) {
                r45.oa1 oa1Var = (r45.oa1) o90Var.c().m75936x14adae67(9);
                if (oa1Var == null) {
                    oa1Var = new r45.oa1();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) kz5.n0.Z(linkedList);
                if (abstractC14490x69736cb5 != null) {
                    android.content.Intent intent2 = new android.content.Intent();
                    if (o90Var.a() == 4) {
                        intent2.putExtra("key_topic_type", 2);
                        intent2.putExtra("KEY_FINDER_LOCATION", abstractC14490x69736cb5.getFeedObject().m59262xed29dd2b().mo14344x5f01b1f6());
                    } else {
                        intent2.putExtra("key_topic_type", 1);
                    }
                    r45.r03 r03Var = (r45.r03) oa1Var.m75936x14adae67(5);
                    if (r03Var == null || (str = r03Var.m75945x2fec8307(0)) == null) {
                        str = "";
                    }
                    intent2.putExtra("key_topic_title", str);
                    intent2.putExtra("key_ref_object_id", 0);
                    intent2.removeExtra("key_ref_object_dup_flag");
                    intent2.putExtra("KEY_CLICK_FEED_ID", this.f186424g.getFeedObject().m59251x5db1b11());
                    intent2.putExtra("KEY_CLICK_FEED_POSITION", i18);
                    hc2.e0.b(intent2, i18, linkedList, oa1Var.m75934xbce7f2f(2), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g30(null, oa1Var.m75934xbce7f2f(2)));
                    intent2.putExtra("KEY_SECTION_INFO", o90Var.c().mo14344x5f01b1f6());
                    in5.s0 s0Var = this.f186425h;
                    android.content.Context context3 = s0Var.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                    i17 = i18;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context3, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                    android.content.Context context4 = s0Var.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
                    i0Var2.il(context4, intent2);
                }
            }
            i17 = i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yo yoVar = this.f186426i;
        yoVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6508x880ec326 c6508x880ec326 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6508x880ec326();
        c6508x880ec326.f138527h = 2L;
        c6508x880ec326.f138528i = c01.id.c();
        yoVar.f186562e.y0(c6508x880ec326, o90Var, i17);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
