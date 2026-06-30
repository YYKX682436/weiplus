package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class dl implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.gl f228381a;

    public dl(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.gl glVar) {
        this.f228381a = glVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        boolean z17 = result instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.gl glVar = this.f228381a;
        if (z17) {
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) result).f295520a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "downloadComplete success，file path: %s", str);
            android.view.View view = glVar.f228492g;
            if (view != null) {
                view.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.cl(str, glVar), 170L);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagWidgetLl");
                throw null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) result).f295518a));
        android.view.View view2 = glVar.f228492g;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagWidgetLl");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
