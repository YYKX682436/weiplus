package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class dg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qg f103153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103154e;

    public dg(com.tencent.mm.plugin.finder.convert.qg qgVar, in5.s0 s0Var) {
        this.f103153d = qgVar;
        this.f103154e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$handleFeedBackBubble$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.qg qgVar = this.f103153d;
        qgVar.getClass();
        com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView finderHomeTabFeedBackBubbleView = qgVar.f104389q;
        if (finderHomeTabFeedBackBubbleView != null) {
            finderHomeTabFeedBackBubbleView.a("bubble_click");
        }
        in5.s0 s0Var = this.f103154e;
        if (s0Var != null) {
            qgVar.r(s0Var, true, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$handleFeedBackBubble$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
