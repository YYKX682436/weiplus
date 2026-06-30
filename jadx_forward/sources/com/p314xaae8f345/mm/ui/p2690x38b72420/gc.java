package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes.dex */
public class gc implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22338x995877f0 f288268d;

    public gc(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22338x995877f0 activityC22338x995877f0) {
        this.f288268d = activityC22338x995877f0;
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
        yj0.a.b("com/tencent/mm/ui/contact/SnsTagContactListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22338x995877f0 activityC22338x995877f0 = this.f288268d;
        com.p314xaae8f345.mm.p670x38b72420.s sVar = (com.p314xaae8f345.mm.p670x38b72420.s) activityC22338x995877f0.f288104e.getItem(i17);
        p94.n0 b17 = p94.w0.b();
        if (b17 == null) {
            activityC22338x995877f0.finish();
            yj0.a.h(this, "com/tencent/mm/ui/contact/SnsTagContactListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6) b17).h(intent, sVar.d1());
        intent.putExtra("sns_adapter_type", 1);
        j45.l.j(activityC22338x995877f0.mo55332x76847179(), "sns", ".ui.SnsTimeLineUserPagerUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SnsTagContactListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
