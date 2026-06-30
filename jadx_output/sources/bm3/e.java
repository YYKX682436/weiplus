package bm3;

/* loaded from: classes3.dex */
public final class e implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f22511a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f22512b;

    public e(android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout, android.widget.TextView textView, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, android.widget.FrameLayout frameLayout2, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f22511a = frameLayout;
        this.f22512b = wxRecyclerView;
    }

    public static bm3.e a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.c5a, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.dfv;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.dfv);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.iml;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.iml);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.jxv;
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(inflate, com.tencent.mm.R.id.jxv);
                if (wxRecyclerView != null) {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
                    i17 = com.tencent.mm.R.id.nvg;
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) x4.b.a(inflate, com.tencent.mm.R.id.nvg);
                    if (refreshLoadMoreLayout != null) {
                        return new bm3.e(frameLayout, linearLayout, textView, wxRecyclerView, frameLayout, refreshLoadMoreLayout);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f22511a;
    }
}
