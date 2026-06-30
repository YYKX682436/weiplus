package bd5;

/* loaded from: classes10.dex */
public final class k extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI f19443d;

    public k(com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI msgHistoryGalleryPersonRecommendUI) {
        this.f19443d = msgHistoryGalleryPersonRecommendUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI$setupAdapterWithMsgIds$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI$setupAdapterWithMsgIds$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        xm3.t0 b17;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI$setupAdapterWithMsgIds$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i18 <= 0) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI$setupAdapterWithMsgIds$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI msgHistoryGalleryPersonRecommendUI = this.f19443d;
        if (!msgHistoryGalleryPersonRecommendUI.A && (b17 = xm3.u0.b(msgHistoryGalleryPersonRecommendUI.h7())) != null && (mvvmList = b17.I) != null && mvvmList.f152062i) {
            androidx.recyclerview.widget.f2 adapter = msgHistoryGalleryPersonRecommendUI.h7().getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount < 200) {
                msgHistoryGalleryPersonRecommendUI.A = true;
                com.tencent.mm.plugin.mvvmlist.MvvmList.g(mvvmList, null, 0, 3, null);
            } else {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = msgHistoryGalleryPersonRecommendUI.h7().getLayoutManager();
                if ((layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null) != null && ((itemCount - r5.y()) - 1) / itemCount < 0.2f) {
                    msgHistoryGalleryPersonRecommendUI.A = true;
                    com.tencent.mm.plugin.mvvmlist.MvvmList.g(mvvmList, null, 0, 3, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI$setupAdapterWithMsgIds$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
