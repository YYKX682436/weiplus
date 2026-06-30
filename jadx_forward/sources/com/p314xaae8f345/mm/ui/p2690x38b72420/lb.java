package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes.dex */
public class lb implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22332x4b317cd6 f288551d;

    public lb(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22332x4b317cd6 activityC22332x4b317cd6) {
        this.f288551d = activityC22332x4b317cd6;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SnsLabelContactListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22332x4b317cd6 activityC22332x4b317cd6 = this.f288551d;
        com.p314xaae8f345.mm.p670x38b72420.s sVar = (com.p314xaae8f345.mm.p670x38b72420.s) activityC22332x4b317cd6.f288095e.getItem(i17);
        p94.n0 b17 = p94.w0.b();
        if (b17 == null) {
            activityC22332x4b317cd6.finish();
            yj0.a.h(this, "com/tencent/mm/ui/contact/SnsLabelContactListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6) b17).h(intent, sVar.d1());
        intent.putExtra("Contact_User", sVar.d1());
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, activityC22332x4b317cd6);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SnsLabelContactListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
