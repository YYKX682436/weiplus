package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class p extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95355a;

    public p(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI) {
        this.f95355a = cardHomePageV3UI;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95355a;
        java.lang.String str = cardHomePageV3UI.f95234d;
        pm0.v.X(new com.tencent.mm.plugin.card.ui.v3.o(cardHomePageV3UI));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95355a;
        java.lang.String str = cardHomePageV3UI.f95234d;
        cardHomePageV3UI.getClass();
        if (cardHomePageV3UI.f95244q) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = cardHomePageV3UI.f95236f;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.H(null);
            } else {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
        }
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        java.lang.String str = this.f95355a.f95234d;
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        java.lang.String str = this.f95355a.f95234d;
    }
}
