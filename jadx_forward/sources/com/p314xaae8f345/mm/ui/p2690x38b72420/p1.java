package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes12.dex */
public class p1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901 f288607d;

    public p1(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901 activityC22294xac144901) {
        this.f288607d = activityC22294xac144901;
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
        yj0.a.b("com/tencent/mm/ui/contact/ContactRemarkImagePreviewUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901 activityC22294xac144901 = this.f288607d;
        if (activityC22294xac144901.m78543x79591497()) {
            activityC22294xac144901.m78531x8f8cf1fb();
        } else {
            activityC22294xac144901.m78602x5a7a36a0();
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/ContactRemarkImagePreviewUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
