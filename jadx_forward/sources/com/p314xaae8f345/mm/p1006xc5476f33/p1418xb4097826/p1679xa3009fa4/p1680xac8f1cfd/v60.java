package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class v60 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f217746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f217747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x60 f217748f;

    public v60(java.util.List list, yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x60 x60Var) {
        this.f217746d = list;
        this.f217747e = lVar;
        this.f217748f = x60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel$setupSpeedTextViews$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) tag).floatValue();
        for (android.widget.TextView textView : this.f217746d) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(textView, view)) {
                if (textView != null) {
                    textView.setTextColor(this.f217748f.f217938b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
                }
            } else if (textView != null) {
                textView.setTextColor(-1);
            }
        }
        yz5.l lVar = this.f217747e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Float.valueOf(floatValue));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x60.c(this.f217748f, false, false, floatValue, 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel$setupSpeedTextViews$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
