package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78;

/* loaded from: classes2.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 f204907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f204908e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6, android.widget.TextView textView) {
        this.f204907d = c14879x7c6ab7a6;
        this.f204908e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/filter/FinderTopicFilterView$refreshArrow$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6 = this.f204907d;
        c14879x7c6ab7a6.m58625x764a3b83(!c14879x7c6ab7a6.isFold);
        boolean z17 = c14879x7c6ab7a6.isFold;
        android.widget.TextView textView = this.f204908e;
        if (z17) {
            textView.setText(c14879x7c6ab7a6.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0i));
        } else {
            textView.setText(c14879x7c6ab7a6.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0j));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6.b(c14879x7c6ab7a6, c14879x7c6ab7a6.isFold);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6.a(c14879x7c6ab7a6, true, c14879x7c6ab7a6.isFold);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/filter/FinderTopicFilterView$refreshArrow$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
