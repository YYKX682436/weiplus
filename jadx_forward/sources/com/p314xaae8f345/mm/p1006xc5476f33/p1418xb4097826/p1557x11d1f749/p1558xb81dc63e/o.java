package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e;

/* loaded from: classes8.dex */
public final class o extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f202409q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.app.Activity activity, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d, android.view.View mContentView) {
        super(activity, c21470xb673f8d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContentView, "mContentView");
        this.f202409q = mContentView;
    }

    @Override // ak3.i, ak3.c
    public boolean g() {
        return false;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getContentView */
    public android.view.View mo2159xc2a54588() {
        return this.f87115d instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? super.mo2159xc2a54588() : this.f202409q;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getMaskView */
    public android.view.View mo2161x8c409d27() {
        return this.f87115d instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? super.mo2161x8c409d27() : mo2159xc2a54588();
    }
}
