package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class u5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUI f110595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUI finderInteractionSearchUI) {
        super(0);
        this.f110595d = finderInteractionSearchUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f110595d.findViewById(com.tencent.mm.R.id.cgk);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        int i17 = com.tencent.mm.R.id.g4h;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.g4h);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.im7;
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.im7);
            if (linearLayout2 != null) {
                i17 = com.tencent.mm.R.id.kcj;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.kcj);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.lqa;
                    androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.lqa);
                    if (recyclerView != null) {
                        i17 = com.tencent.mm.R.id.m6e;
                        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m6e);
                        if (finderRefreshLayout != null) {
                            i17 = com.tencent.mm.R.id.oh8;
                            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.oh8);
                            if (wxRecyclerView != null) {
                                return new vb2.p(relativeLayout, relativeLayout, linearLayout, linearLayout2, textView, recyclerView, finderRefreshLayout, wxRecyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
