package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f95404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f95405f;

    public y(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI, kotlin.jvm.internal.h0 h0Var, yz5.a aVar) {
        this.f95403d = couponCardListUI;
        this.f95404e = h0Var;
        this.f95405f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = this.f95404e;
        int height = ((android.view.ViewGroup) h0Var.f310123d).getHeight();
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95403d;
        couponCardListUI.H = height;
        couponCardListUI.I = ((android.view.ViewGroup) h0Var.f310123d).getWidth();
        this.f95405f.invoke();
    }
}
