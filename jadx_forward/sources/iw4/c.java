package iw4;

/* loaded from: classes15.dex */
public class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.C19248x6e465e5a f376776d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.C19248x6e465e5a c19248x6e465e5a) {
        this.f376776d = c19248x6e465e5a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y6 y6Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.C19248x6e465e5a c19248x6e465e5a = this.f376776d;
            if (!c19248x6e465e5a.f263582v2 && c19248x6e465e5a.getLayoutManager() != null && c19248x6e465e5a.mo7946xf939df19() != null) {
                if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) c19248x6e465e5a.getLayoutManager()).y() + 1 + ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) c19248x6e465e5a.getLayoutManager()).f93394w >= c19248x6e465e5a.mo7946xf939df19().mo1894x7e414b06() && (y6Var = c19248x6e465e5a.f263581u2) != null) {
                    c19248x6e465e5a.mo7946xf939df19();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 activityC19250xb79f2208 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208) y6Var;
                    iw4.d dVar = activityC19250xb79f2208.f263583d;
                    if (dVar.f376783m) {
                        android.view.ViewParent viewParent = activityC19250xb79f2208.f263585f;
                        boolean z17 = viewParent instanceof com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z6;
                        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z6 z6Var = z17 ? (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z6) viewParent : null;
                        if ((z6Var == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.C19248x6e465e5a) z6Var).f263582v2) ? false : true) {
                            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z6 z6Var2 = z17 ? (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z6) viewParent : null;
                            if (z6Var2 != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.C19248x6e465e5a c19248x6e465e5a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.C19248x6e465e5a) z6Var2;
                                if (!c19248x6e465e5a2.f263582v2) {
                                    c19248x6e465e5a2.f263582v2 = true;
                                }
                            }
                            activityC19250xb79f2208.W6();
                            dVar.b(activityC19250xb79f2208);
                        }
                    }
                }
                yj0.a.h(this, "com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/emojistore/ui/SimilarEmojiLoadMoreRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
