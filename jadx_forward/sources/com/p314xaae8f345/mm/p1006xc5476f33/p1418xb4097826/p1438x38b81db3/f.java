package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.f f184849a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.f();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        if (c14994x9b99c079 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DrawerProgressMaskHelper", "getPlayParams, item is null");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e(0, 0, 0);
        }
        int m59300x36bbd779 = c14994x9b99c079.m59300x36bbd779() * 1000;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = cu2.z.f303990a;
        java.lang.Float f17 = (java.lang.Float) cu2.z.f303991b.get(java.lang.Long.valueOf(c14994x9b99c079.getFeedObject().m76784x5db1b11()));
        int floatValue = (int) ((f17 == null ? 0.0f : f17.floatValue()) * m59300x36bbd779);
        int max = java.lang.Math.max(c14994x9b99c079.m59282xea4e2b36(), floatValue);
        if (m59300x36bbd779 > 0 && max >= 0) {
            c14994x9b99c079.m59282xea4e2b36();
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e((max * 100) / m59300x36bbd779, max, m59300x36bbd779);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DrawerProgressMaskHelper", "getPlayParams, duration:" + m59300x36bbd779 + ", progress:" + max + ", maxOf(" + c14994x9b99c079.m59282xea4e2b36() + ", " + floatValue + ')');
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e(0, 0, 0);
    }

    public final void b(android.view.View itemView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.s0().r()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e a17 = a(item.getFeedObject());
            d(itemView, item, "onBind", a17);
            item.getUdfKv().put("play_progress", a17.f184741a);
        }
    }

    public final void c(android.view.View itemView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.s0().r()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e a17 = a(item.getFeedObject());
            d(itemView, item, "ProgressUpdated", a17);
            item.getUdfKv().put("play_progress", a17.f184741a);
        }
    }

    public final void d(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e eVar) {
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.t5q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.t5p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.t5r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        boolean m59291x838ece39 = abstractC14490x69736cb5.getFeedObject().m59291x838ece39();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DrawerProgressMaskHelper", "tryProgressMask from:" + str + ", feedId:" + pm0.v.u(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()) + " show:" + m59291x838ece39);
        if (m59291x838ece39) {
            int i17 = eVar.f184741a;
            if (i17 > 95) {
                i17 = 100;
            }
            if (eVar.f184742b <= 3000 && eVar.f184743c > 3000) {
                i17 = 0;
            }
            if (i17 <= 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper", "tryProgressMask", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper$PlayParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper", "tryProgressMask", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper$PlayParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper", "tryProgressMask", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper$PlayParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper", "tryProgressMask", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper$PlayParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i18 = 100 - i17;
            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = i17;
            findViewById2.setLayoutParams(layoutParams2);
            android.view.ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.weight = i18;
            findViewById3.setLayoutParams(layoutParams4);
        }
    }
}
