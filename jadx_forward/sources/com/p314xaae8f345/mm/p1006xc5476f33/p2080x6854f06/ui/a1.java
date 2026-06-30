package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class a1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17680x54e9523e f243771d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17680x54e9523e activityC17680x54e9523e) {
        this.f243771d = activityC17680x54e9523e;
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
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeTvHistoryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17680x54e9523e activityC17680x54e9523e = this.f243771d;
        h34.z.a((h34.h0) activityC17680x54e9523e.f243752d.getItem(i17), activityC17680x54e9523e.mo55332x76847179(), 2);
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeTvHistoryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
