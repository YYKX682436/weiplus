package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class vn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderWxProfileShowUI f110673d;

    public vn(com.tencent.mm.plugin.finder.feed.ui.FinderWxProfileShowUI finderWxProfileShowUI) {
        this.f110673d = finderWxProfileShowUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderWxProfileShowUI finderWxProfileShowUI = this.f110673d;
        finderWxProfileShowUI.setResult(-1);
        finderWxProfileShowUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
