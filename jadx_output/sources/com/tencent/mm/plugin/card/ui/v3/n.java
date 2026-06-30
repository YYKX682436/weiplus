package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI, java.lang.String str) {
        super(1);
        this.f95347d = cardHomePageV3UI;
        this.f95348e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI.f95233y;
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95347d;
        cardHomePageV3UI.getClass();
        if (fVar == null) {
            return null;
        }
        java.lang.String str = "errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c;
        java.lang.String str2 = cardHomePageV3UI.f95234d;
        com.tencent.mars.xlog.Log.i(str2, str);
        int i18 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i18 == 0 && fVar.f70616b == 0) {
            r45.so5 so5Var = (r45.so5) fVar.f70618d;
            if (so5Var == null) {
                return null;
            }
            com.tencent.mars.xlog.Log.i(str2, "retcode: " + so5Var.f385887d + ", retmsg: " + so5Var.f385888e);
            if (so5Var.f385887d == 0) {
                java.util.ArrayList arrayList = cardHomePageV3UI.f95242o;
                boolean z17 = true;
                int size = arrayList.size() - 1;
                while (true) {
                    if (-1 >= size) {
                        z17 = false;
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.card.ui.v3.a) arrayList.get(size)).a().f391342e, this.f95348e)) {
                        arrayList.remove(size);
                        break;
                    }
                    size--;
                }
                if (z17) {
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = cardHomePageV3UI.f95241n;
                    if (wxRecyclerAdapter == null) {
                        kotlin.jvm.internal.o.o("mPageAdapter");
                        throw null;
                    }
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                cardHomePageV3UI.Y6();
            } else {
                lu1.a0.r(cardHomePageV3UI.getContext(), so5Var.f385888e);
            }
        } else {
            lu1.a0.q(cardHomePageV3UI.getContext(), "");
        }
        return f0Var;
    }
}
