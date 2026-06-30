package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public class to implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f109090d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f109091e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f109092f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f109093g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f109094h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.no f109095i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f109096m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f109097n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f109098o;

    /* renamed from: p, reason: collision with root package name */
    public final int f109099p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.oo f109100q;

    public to(com.tencent.mm.ui.MMActivity context, androidx.fragment.app.Fragment fragment, android.view.View rootView, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f109090d = context;
        this.f109091e = fragment;
        this.f109092f = rootView;
        this.f109093g = z17;
        this.f109094h = "Finder.FinderPostPlaySquareContainerContract.ViewCallback";
        this.f109099p = -1;
        this.f109100q = new com.tencent.mm.plugin.finder.feed.oo(this);
    }

    public android.view.View a() {
        android.view.View findViewById = this.f109092f.findViewById(com.tencent.mm.R.id.f484229dg3);
        if (findViewById instanceof android.view.View) {
            return findViewById;
        }
        return null;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout g() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f109096m;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f109090d;
        kotlin.jvm.internal.o.e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        return mMActivity;
    }
}
