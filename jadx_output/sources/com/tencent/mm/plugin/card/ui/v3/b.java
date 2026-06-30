package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f95290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f95291f;

    public b(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI, in5.s0 s0Var, yz5.a aVar) {
        this.f95289d = cardHomePageV3UI;
        this.f95290e = s0Var;
        this.f95291f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f95290e;
        int height = s0Var.itemView.getHeight();
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95289d;
        cardHomePageV3UI.f95250w = height;
        cardHomePageV3UI.f95251x = s0Var.itemView.getWidth();
        this.f95291f.invoke();
    }
}
