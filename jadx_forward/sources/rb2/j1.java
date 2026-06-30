package rb2;

/* loaded from: classes15.dex */
public final class j1 implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 f475195d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15) {
        this.f475195d = c13709xbc18ee15;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$init$3", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15 = this.f475195d;
        if (!c13709xbc18ee15.f184611l1) {
            gd2.n menuData = c13709xbc18ee15.getMenuData();
            boolean z17 = false;
            if (menuData != null && menuData.a(c13709xbc18ee15.m55652x596791eb())) {
                z17 = true;
            }
            c13709xbc18ee15.f184611l1 = z17;
        }
        android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = c13709xbc18ee15.f184617z1;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(adapterView, view, i17, j17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$init$3", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
        android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.f475195d.f184617z1;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onNothingSelected(adapterView);
        }
    }
}
