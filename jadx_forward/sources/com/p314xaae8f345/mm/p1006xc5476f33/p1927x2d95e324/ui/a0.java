package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes.dex */
public class a0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640 f233846d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640 activityC16734xf3af640) {
        this.f233846d = activityC16734xf3af640;
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
        yj0.a.b("com/tencent/mm/plugin/nearlife/ui/SelectPoiCategoryUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640 activityC16734xf3af640 = this.f233846d;
        ((java.util.ArrayList) activityC16734xf3af640.f233828g).size();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("poi_category", (java.lang.String) ((java.util.ArrayList) activityC16734xf3af640.f233828g).get(i17));
        activityC16734xf3af640.setResult(-1, intent);
        activityC16734xf3af640.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/nearlife/ui/SelectPoiCategoryUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
