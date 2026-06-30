package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class xo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.o90 f104964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yo f104966f;

    public xo(com.tencent.mm.plugin.finder.storage.o90 o90Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.yo yoVar) {
        this.f104964d = o90Var;
        this.f104965e = s0Var;
        this.f104966f = yoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.storage.o90 o90Var = this.f104964d;
        int a17 = o90Var.a();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        java.util.LinkedList linkedList = o90Var.f127299b;
        in5.s0 s0Var = this.f104965e;
        if (a17 == 1 || a17 == 2) {
            intent.putExtra("UI_TITLE", o90Var.d());
            r45.aa1 aa1Var = (r45.aa1) o90Var.c().getCustom(11);
            if (aa1Var == null) {
                aa1Var = new r45.aa1();
            }
            r45.z91 z91Var = new r45.z91();
            z91Var.set(2, aa1Var.getByteString(2));
            z91Var.set(4, 2);
            jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
            z91Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
            z91Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
            z91Var.set(11, o90Var.c());
            hc2.e0.b(intent, 0, linkedList, aa1Var.getByteString(2), null);
            intent.putExtra("SECTION_REQ", z91Var.toByteArray());
            intent.putExtra("SECTION_FIRST_RSP", aa1Var.toByteArray());
            intent.putExtra("KEY_MORE_ACTION_TYPE", o90Var.a());
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.content.Intent intent2 = null;
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            i0Var.getClass();
            if (!(context2 instanceof android.app.Activity)) {
                intent2 = intent;
            }
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            intent.setClass(context2, com.tencent.mm.plugin.finder.feed.ui.FinderRelatedFeedUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterRelatedFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterRelatedFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (a17 == 3 || a17 == 4) {
            r45.oa1 oa1Var = (r45.oa1) o90Var.c().getCustom(9);
            if (oa1Var == null) {
                oa1Var = new r45.oa1();
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.Z(linkedList);
            if (baseFinderFeed != null) {
                android.content.Intent intent3 = new android.content.Intent();
                if (o90Var.a() == 4) {
                    intent3.putExtra("key_topic_type", 2);
                    intent3.putExtra("key_topic_poi_location", baseFinderFeed.getFeedObject().getLocation().toByteArray());
                } else {
                    intent3.putExtra("key_topic_type", 1);
                }
                r45.r03 r03Var = (r45.r03) oa1Var.getCustom(5);
                if (r03Var == null || (str = r03Var.getString(0)) == null) {
                    str = "";
                }
                intent3.putExtra("key_topic_title", str);
                intent3.putExtra("key_ref_object_id", 0);
                intent3.removeExtra("key_ref_object_dup_flag");
                hc2.e0.b(intent3, 0, linkedList, oa1Var.getByteString(2), new com.tencent.mm.plugin.finder.feed.g30(null, oa1Var.getByteString(2)));
                intent3.putExtra("KEY_SECTION_INFO", o90Var.c().toByteArray());
                intent3.putExtra("KEY_TOPIC_RSP", oa1Var.toByteArray());
                android.content.Context context3 = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context3, intent3, 0L, null, 0, 0, false, 0, null, 508, null);
                com.tencent.mm.plugin.finder.assist.i0 i0Var2 = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                android.content.Context context4 = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                i0Var2.hl(context4, intent3);
            }
        }
        com.tencent.mm.plugin.finder.convert.yo yoVar = this.f104966f;
        yoVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct finderLbsCardActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardActionReportStruct();
        finderLbsCardActionReportStruct.f56994h = 1L;
        finderLbsCardActionReportStruct.f56995i = c01.id.c();
        yoVar.f105029e.y0(finderLbsCardActionReportStruct, o90Var, -1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMixLbsSectionFeedConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
