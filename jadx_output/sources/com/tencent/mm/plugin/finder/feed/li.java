package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class li implements fs2.c, ym5.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.uh f107294d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.vh f107295e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f107296f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f107297g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f107298h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f107299i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f107300m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f107301n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f107302o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f107303p;

    /* renamed from: q, reason: collision with root package name */
    public rl5.r f107304q;

    /* renamed from: r, reason: collision with root package name */
    public final int f107305r;

    public li(com.tencent.mm.ui.MMActivity activity, android.view.View notifyView, com.tencent.mm.plugin.finder.feed.uh presenter, com.tencent.mm.plugin.finder.feed.vh vhVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(notifyView, "notifyView");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f107294d = presenter;
        this.f107295e = vhVar;
        this.f107296f = true;
        this.f107297g = activity;
        this.f107298h = notifyView;
        this.f107305r = 100;
    }

    public static final java.lang.String l(com.tencent.mm.plugin.finder.feed.li liVar) {
        java.lang.String num;
        com.tencent.mm.ui.MMActivity mMActivity = liVar.f107297g;
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = mMActivity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) mMActivity : null;
        return (mMFinderUI == null || (num = java.lang.Integer.valueOf(mMFinderUI.W6()).toString()) == null) ? "" : num;
    }

    @Override // ym5.l1
    public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f107302o;
        if (mMProcessBar == null) {
            return false;
        }
        mMProcessBar.b(i18 / ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479684cj)));
        return false;
    }

    @Override // ym5.l1
    public void g(int i17) {
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f107302o;
        if (mMProcessBar != null) {
            mMProcessBar.d();
        }
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f107297g;
    }

    @Override // ym5.l1
    public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }
}
