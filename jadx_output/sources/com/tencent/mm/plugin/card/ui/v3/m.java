package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI, boolean z17) {
        super(1);
        this.f95343d = cardHomePageV3UI;
        this.f95344e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean z17 = this.f95344e;
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95343d;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i(cardHomePageV3UI.f95234d, "errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
            if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                r45.ti3 ti3Var = (r45.ti3) fVar.f70618d;
                if (ti3Var != null) {
                    com.tencent.mars.xlog.Log.i(cardHomePageV3UI.f95234d, "retcode: " + ti3Var.f386464d + ", retmsg: " + ti3Var.f386465e);
                    if (ti3Var.f386464d == 0) {
                        cardHomePageV3UI.f95243p = ti3Var.f386467g;
                        cardHomePageV3UI.f95244q = ti3Var.f386468h >= 1;
                        cardHomePageV3UI.f95246s = true;
                        cardHomePageV3UI.Z6(ti3Var.f386471n);
                        cardHomePageV3UI.X6(ti3Var.f386466f);
                        if (z17) {
                            cardHomePageV3UI.f95242o.clear();
                        }
                        cardHomePageV3UI.V6(ti3Var.f386469i);
                        cardHomePageV3UI.W6(ti3Var.f386470m);
                    } else {
                        lu1.a0.r(cardHomePageV3UI.getContext(), ti3Var.f386465e);
                    }
                }
            } else {
                lu1.a0.q(cardHomePageV3UI.getContext(), "");
            }
        }
        cardHomePageV3UI.f95245r = false;
        if (!z17) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = cardHomePageV3UI.f95236f;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
            refreshLoadMoreLayout.N(0);
        }
        return jz5.f0.f302826a;
    }
}
