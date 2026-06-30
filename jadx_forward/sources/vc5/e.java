package vc5;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 f516849d;

    public e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 c21816x74d192a3) {
        this.f516849d = c21816x74d192a3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryActionBarView$initializeTypeFilterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f516849d.m79668xf579a324(false);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryActionBarView$initializeTypeFilterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
