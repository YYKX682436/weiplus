package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class h5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103554d;

    public h5(in5.s0 s0Var) {
        this.f103554d = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onCreateViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        boolean performLongClick = this.f103554d.itemView.performLongClick();
        yj0.a.i(performLongClick, this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$onCreateViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return performLongClick;
    }
}
