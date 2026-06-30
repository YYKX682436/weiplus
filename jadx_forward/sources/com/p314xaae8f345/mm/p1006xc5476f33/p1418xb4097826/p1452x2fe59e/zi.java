package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class zi implements fs2.c, ym5.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yi f192801d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f192802e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f192803f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f192804g;

    public zi(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, android.view.View reservedNoticeListView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yi presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reservedNoticeListView, "reservedNoticeListView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f192801d = presenter;
        this.f192802e = activity;
        this.f192803f = reservedNoticeListView;
        this.f192804g = (android.widget.LinearLayout) reservedNoticeListView.findViewById(com.p314xaae8f345.mm.R.id.t89);
    }

    @Override // ym5.l1
    public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    @Override // ym5.l1
    public void g(int i17) {
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f192802e;
    }

    @Override // ym5.l1
    public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }
}
