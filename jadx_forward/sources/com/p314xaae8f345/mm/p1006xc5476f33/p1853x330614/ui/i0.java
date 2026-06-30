package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes8.dex */
public class i0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q67 f229935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16477xce7d7b76 f229936e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16477xce7d7b76 activityC16477xce7d7b76, r45.q67 q67Var) {
        super(false);
        this.f229936e = activityC16477xce7d7b76;
        this.f229935d = q67Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        java.lang.String b17 = x51.j1.b(this.f229935d.f465250f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16477xce7d7b76 activityC16477xce7d7b76 = this.f229936e;
        g0Var.d(13867, b17, java.lang.Integer.valueOf(activityC16477xce7d7b76.f229781p));
        if (b17.equals("wxpay://bizmall/hk_offlinepay")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexOSUI", "click native hk offlinepay url");
            ((h45.q) i95.n0.c(h45.q.class)).mo24804x3b8ef1e3(activityC16477xce7d7b76.mo55332x76847179(), 1);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", b17);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("pay_channel", 1);
        intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC16477xce7d7b76.mo55332x76847179(), intent);
    }
}
