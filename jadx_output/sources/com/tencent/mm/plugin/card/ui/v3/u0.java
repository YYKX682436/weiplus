package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f95382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f95383f;

    public u0(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, in5.s0 s0Var, yz5.a aVar) {
        this.f95381d = vipCardListUI;
        this.f95382e = s0Var;
        this.f95383f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f95382e;
        int height = s0Var.itemView.getHeight();
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95381d;
        vipCardListUI.N = height;
        vipCardListUI.P = s0Var.itemView.getWidth();
        this.f95383f.invoke();
    }
}
