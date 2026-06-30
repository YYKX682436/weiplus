package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.f f103316a = new com.tencent.mm.plugin.finder.convert.f();

    public final com.tencent.mm.plugin.finder.convert.e a(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        if (finderItem == null) {
            com.tencent.mars.xlog.Log.e("DrawerProgressMaskHelper", "getPlayParams, item is null");
            return new com.tencent.mm.plugin.finder.convert.e(0, 0, 0);
        }
        int videoDuration = finderItem.getVideoDuration() * 1000;
        kotlinx.coroutines.flow.i2 i2Var = cu2.z.f222457a;
        java.lang.Float f17 = (java.lang.Float) cu2.z.f222458b.get(java.lang.Long.valueOf(finderItem.getFeedObject().getId()));
        int floatValue = (int) ((f17 == null ? 0.0f : f17.floatValue()) * videoDuration);
        int max = java.lang.Math.max(finderItem.getProgressBarMs(), floatValue);
        if (videoDuration > 0 && max >= 0) {
            finderItem.getProgressBarMs();
            return new com.tencent.mm.plugin.finder.convert.e((max * 100) / videoDuration, max, videoDuration);
        }
        com.tencent.mars.xlog.Log.e("DrawerProgressMaskHelper", "getPlayParams, duration:" + videoDuration + ", progress:" + max + ", maxOf(" + finderItem.getProgressBarMs() + ", " + floatValue + ')');
        return new com.tencent.mm.plugin.finder.convert.e(0, 0, 0);
    }

    public final void b(android.view.View itemView, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(item, "item");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.s0().r()).booleanValue()) {
            com.tencent.mm.plugin.finder.convert.e a17 = a(item.getFeedObject());
            d(itemView, item, "onBind", a17);
            item.getUdfKv().put("play_progress", a17.f103208a);
        }
    }

    public final void c(android.view.View itemView, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(item, "item");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.s0().r()).booleanValue()) {
            com.tencent.mm.plugin.finder.convert.e a17 = a(item.getFeedObject());
            d(itemView, item, "ProgressUpdated", a17);
            item.getUdfKv().put("play_progress", a17.f103208a);
        }
    }

    public final void d(android.view.View view, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str, com.tencent.mm.plugin.finder.convert.e eVar) {
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.t5q);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.t5p);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.t5r);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        boolean showProgressBarMs = baseFinderFeed.getFeedObject().getShowProgressBarMs();
        com.tencent.mars.xlog.Log.i("DrawerProgressMaskHelper", "tryProgressMask from:" + str + ", feedId:" + pm0.v.u(baseFinderFeed.getFeedObject().getFeedObject().getId()) + " show:" + showProgressBarMs);
        if (showProgressBarMs) {
            int i17 = eVar.f103208a;
            if (i17 > 95) {
                i17 = 100;
            }
            if (eVar.f103209b <= 3000 && eVar.f103210c > 3000) {
                i17 = 0;
            }
            if (i17 <= 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper", "tryProgressMask", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper$PlayParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper", "tryProgressMask", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper$PlayParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper", "tryProgressMask", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper$PlayParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper", "tryProgressMask", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/convert/DrawerProgressMaskHelper$PlayParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i18 = 100 - i17;
            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = i17;
            findViewById2.setLayoutParams(layoutParams2);
            android.view.ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.weight = i18;
            findViewById3.setLayoutParams(layoutParams4);
        }
    }
}
