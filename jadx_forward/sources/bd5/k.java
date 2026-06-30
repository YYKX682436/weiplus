package bd5;

/* loaded from: classes10.dex */
public final class k extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c f100976d;

    public k(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c activityC21828xc79db19c) {
        this.f100976d = activityC21828xc79db19c;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI$setupAdapterWithMsgIds$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI$setupAdapterWithMsgIds$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        xm3.t0 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI$setupAdapterWithMsgIds$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i18 <= 0) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI$setupAdapterWithMsgIds$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c activityC21828xc79db19c = this.f100976d;
        if (!activityC21828xc79db19c.A && (b17 = xm3.u0.b(activityC21828xc79db19c.h7())) != null && (c16718x7059cefe = b17.I) != null && c16718x7059cefe.f233595i) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = activityC21828xc79db19c.h7().mo7946xf939df19();
            int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
            if (mo1894x7e414b06 < 200) {
                activityC21828xc79db19c.A = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.g(c16718x7059cefe, null, 0, 3, null);
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = activityC21828xc79db19c.h7().getLayoutManager();
                if ((layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null) != null && ((mo1894x7e414b06 - r5.y()) - 1) / mo1894x7e414b06 < 0.2f) {
                    activityC21828xc79db19c.A = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.g(c16718x7059cefe, null, 0, 3, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI$setupAdapterWithMsgIds$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
