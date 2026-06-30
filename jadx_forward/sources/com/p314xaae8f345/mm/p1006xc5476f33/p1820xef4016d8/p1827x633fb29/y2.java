package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public final class y2 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f227254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f227255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f227256c;

    public y2(long j17, android.view.View view, int i17, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f227254a = view;
        this.f227255b = i17;
        this.f227256c = c22789xd23e9a9b;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.System.currentTimeMillis();
        if (result instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) {
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) result).f295520a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogicNew", "[renderFullAtmosphereDynamic] downloadComplete success，file path: %s", str);
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x2(this.f227254a, this.f227255b, str, this.f227256c));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogicNew", "[renderFullAtmosphereDynamic] downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) result).f295518a));
        android.view.View view = this.f227254a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
