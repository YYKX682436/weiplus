package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class s6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f214558d;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34) {
        this.f214558d = c15270x6d877a34;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(((android.widget.ImageView) view).getTag(), "null cannot be cast to non-null type kotlin.Boolean");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34.c(this.f214558d, !((java.lang.Boolean) r7).booleanValue());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
