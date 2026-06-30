package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15214x628e84a f213661d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15214x628e84a c15214x628e84a) {
        this.f213661d = c15214x628e84a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/CommentHeaderCollapsibleExpandButton$onFinishInflate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a onExpandListener = this.f213661d.getOnExpandListener();
        if (onExpandListener != null) {
            onExpandListener.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/CommentHeaderCollapsibleExpandButton$onFinishInflate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
