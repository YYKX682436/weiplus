package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class ea implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15045x9eacaabe f210630d;

    public ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15045x9eacaabe activityC15045x9eacaabe) {
        this.f210630d = activityC15045x9eacaabe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI$checkPlay$1$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15045x9eacaabe.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15045x9eacaabe activityC15045x9eacaabe = this.f210630d;
        if (activityC15045x9eacaabe.d7().getVisibility() == 0) {
            activityC15045x9eacaabe.d7().setVisibility(8);
        } else {
            activityC15045x9eacaabe.d7().setVisibility(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderMediaPreviewUI$checkPlay$1$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
