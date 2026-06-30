package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class uj implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f229039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f229040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f229041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f229042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f229043e;

    public uj(long j17, android.view.View view, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, r45.wv3 wv3Var, android.view.View view2) {
        this.f229039a = j17;
        this.f229040b = view;
        this.f229041c = c22789xd23e9a9b;
        this.f229042d = wv3Var;
        this.f229043e = view2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 s1Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f229039a;
        if (s1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) {
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) s1Var).f295520a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "downloadComplete success，file path: %s", str);
            this.f229040b.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.tj(this, str, currentTimeMillis), 150L);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) s1Var).f295518a));
        android.view.View view = this.f229043e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$23", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$23", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, this.f229042d.f471034g.f472027x, 2, 2, java.lang.Long.valueOf(currentTimeMillis));
    }
}
