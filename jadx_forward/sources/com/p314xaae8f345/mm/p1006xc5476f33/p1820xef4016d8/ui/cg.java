package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class cg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f228326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f228327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.kg f228328f;

    public cg(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.kg kgVar, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, boolean z17) {
        this.f228328f = kgVar;
        this.f228326d = interfaceC4987x84e327cb;
        this.f228327e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f228326d;
        if (interfaceC4987x84e327cb != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.kg kgVar = this.f228328f;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = kgVar.f228639a.P;
            if (interfaceC4987x84e327cb2 == null || !interfaceC4987x84e327cb2.mo42933xb5885648().equals(interfaceC4987x84e327cb.mo42933xb5885648())) {
                return;
            }
            if (!this.f228327e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "somethings error.");
                kgVar.f228639a.f227889v.setVisibility(8);
                kgVar.f228639a.f227891x.setVisibility(0);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "somethings success.");
            kgVar.f228639a.P = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6.class))).wi(kgVar.f228639a.P.mo42933xb5885648());
            kgVar.f228639a.f227889v.setVisibility(8);
            kgVar.f228639a.G.setVisibility(0);
            kgVar.f228639a.G.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e = kgVar.f228639a;
            activityC16380x9ede44e.G.m43719xc040f7d2(activityC16380x9ede44e.P);
        }
    }
}
