package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx2.q f103592d;

    public hj(gx2.q qVar) {
        this.f103592d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$showRelJumpTipsConfirmDrawer$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(this.f103592d, false, null, false, null, 15, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$showRelJumpTipsConfirmDrawer$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
