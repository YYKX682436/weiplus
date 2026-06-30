package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class r8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI f110486d;

    public r8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        this.f110486d = finderLiveCreateVisitorModeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI$initLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f110486d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderLiveCreateVisitorModeUI.A;
        if (mMEditText != null) {
            mMEditText.setText("");
        }
        android.widget.ImageView imageView = finderLiveCreateVisitorModeUI.B;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI$initLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
