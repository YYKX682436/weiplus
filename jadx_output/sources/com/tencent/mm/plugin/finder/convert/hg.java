package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qg f103584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f103585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.u4 f103586f;

    public hg(com.tencent.mm.plugin.finder.convert.qg qgVar, android.view.ViewGroup viewGroup, so2.u4 u4Var) {
        this.f103584d = qgVar;
        this.f103585e = viewGroup;
        this.f103586f = u4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$handlePostRemind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f103585e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        so2.u4 u4Var = this.f103586f;
        long j17 = u4Var.f410637b;
        long j18 = u4Var.f410640e;
        this.f103584d.getClass();
        android.content.Intent intent = new android.content.Intent();
        if (j18 != 0) {
            j17 = j18;
        }
        intent.putExtra("feed_object_id", j17);
        intent.putExtra("feed_is_local", j18 == 0);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
        android.content.Intent b17 = xy2.c.b(context, com.tencent.mm.plugin.finder.ui.FinderSingleFeedDetailUI.class, intent, false, false, 24, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(b17);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSingleFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderSingleFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$handlePostRemind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
