package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class f6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f103340e;

    public f6(in5.s0 s0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f103339d = s0Var;
        this.f103340e = finderItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.promotion.d dVar = com.tencent.mm.plugin.finder.ui.promotion.FinderPromotionUserListUI.f129654t;
        android.content.Context context = this.f103339d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        dVar.a(context, this.f103340e.getFeedObject(), false, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshPromotionInfo$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
