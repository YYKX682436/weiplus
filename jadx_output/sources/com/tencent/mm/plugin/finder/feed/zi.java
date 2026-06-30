package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class zi implements fs2.c, ym5.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.yi f111268d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f111269e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f111270f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f111271g;

    public zi(com.tencent.mm.ui.MMActivity activity, android.view.View reservedNoticeListView, com.tencent.mm.plugin.finder.feed.yi presenter) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(reservedNoticeListView, "reservedNoticeListView");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f111268d = presenter;
        this.f111269e = activity;
        this.f111270f = reservedNoticeListView;
        this.f111271g = (android.widget.LinearLayout) reservedNoticeListView.findViewById(com.tencent.mm.R.id.t89);
    }

    @Override // ym5.l1
    public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    @Override // ym5.l1
    public void g(int i17) {
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f111269e;
    }

    @Override // ym5.l1
    public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }
}
