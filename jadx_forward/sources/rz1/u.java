package rz1;

/* loaded from: classes2.dex */
public class u implements android.widget.AbsListView.OnScrollListener {
    public u(com.tencent.mm.plugin.datareport.sample.ScrollSampleUI scrollSampleUI) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ScrollSampleUI", "onScroll");
        yj0.a.h(this, "com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ScrollSampleUI", "onScrollStateChanged");
        yj0.a.h(this, "com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
