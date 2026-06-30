package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class nm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm f214257d;

    public nm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar) {
        this.f214257d = rmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar = this.f214257d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.om omVar = rmVar.f214499e;
        if (omVar != null) {
            rmVar.getClass();
            omVar.a(null);
        }
        rmVar.dismiss();
        android.view.View contentView = rmVar.getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qm(rmVar.f214509o));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
