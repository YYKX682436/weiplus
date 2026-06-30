package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zv implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f111303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.cw f111304e;

    public zv(java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.feed.cw cwVar) {
        this.f111303d = arrayList;
        this.f111304e = cwVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return;
        }
        java.lang.Object obj = this.f111303d.get(i17 - a07);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("FEED_ID", ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId());
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            com.tencent.mm.plugin.finder.feed.cw cwVar = this.f111304e;
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, cwVar.f106505d, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
            com.tencent.mm.ui.MMActivity context = cwVar.f106505d;
            kotlin.jvm.internal.o.g(context, "context");
            intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelTimelineUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFeedRelUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderFeedRelUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
