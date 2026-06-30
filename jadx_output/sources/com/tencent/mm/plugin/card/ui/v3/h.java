package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes8.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95325d;

    public h(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI) {
        this.f95325d = cardHomePageV3UI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95325d;
        g4Var.d(1, cardHomePageV3UI.getResources().getColor(com.tencent.mm.R.color.f479482a31), cardHomePageV3UI.getString(com.tencent.mm.R.string.f490507x1));
    }
}
