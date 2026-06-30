package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes8.dex */
public class p implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.OnItemClickListener f234857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.q f234858e;

    public p(android.widget.AdapterView.OnItemClickListener onItemClickListener, com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.q qVar) {
        this.f234857d = onItemClickListener;
        this.f234858e = qVar;
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
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallListDialog$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f234857d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i17, j17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.q qVar = this.f234858e;
        qVar.f234866g = i17;
        qVar.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallListDialog$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
