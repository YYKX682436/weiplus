package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class n implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c f228745b;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c activityC16358x34a9fc3c, java.lang.String str) {
        this.f228745b = activityC16358x34a9fc3c;
        this.f228744a = str;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.vm3 vm3Var = (r45.vm3) obj;
        if (vm3Var != null && vm3Var.f469891d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "response.subtype_id：%s, %s", java.lang.Integer.valueOf(vm3Var.f469892e), java.lang.Integer.valueOf(vm3Var.f469891d.f463045u));
            vm3Var.f469891d.G = vm3Var.f469892e;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_STORY_DISABLE_AUTO_PLAY_INT_SYNC, java.lang.Integer.valueOf(vm3Var.f469891d.f463045u));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_STORY_AUTO_PLAY_DELAY_INT_SYNC, java.lang.Integer.valueOf(vm3Var.f469891d.f463046v));
            ((java.util.HashMap) gb3.l.f351551b).put(this.f228744a, vm3Var.f469891d);
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c.f227508u;
        this.f228745b.W6(false);
    }
}
