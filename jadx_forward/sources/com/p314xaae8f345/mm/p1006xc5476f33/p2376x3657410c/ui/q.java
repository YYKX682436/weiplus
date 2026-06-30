package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes.dex */
public class q implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Intent f262722d = new android.content.Intent();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.r f262723e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.r rVar) {
        this.f262723e = rVar;
    }

    public final void a(int i17, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "KindaBrand.kindaEndWithResult resultCode: %d, data: %s", java.lang.Integer.valueOf(i17), intent.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19168xd4c44a02 activityC19168xd4c44a02 = this.f262723e.f262724a;
        activityC19168xd4c44a02.f262627s = i17;
        activityC19168xd4c44a02.f262628t = intent;
        activityC19168xd4c44a02.setResult(i17, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 != this.f262723e.f262724a.f262620i) {
            return;
        }
        if (intent == null) {
            java.lang.Throwable th6 = new java.lang.Throwable("KindaBrand Intent data null!");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBrandUI", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
            return;
        }
        if (i18 != -1) {
            a(i18, intent);
            return;
        }
        if (!intent.hasExtra("key_jsapi_close_page_after_pay")) {
            this.f262722d.putExtras(intent);
            a(i18, this.f262722d);
            return;
        }
        int intExtra = intent.getIntExtra("key_jsapi_close_page_after_pay", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "KindaBrand.mmOnActivityResult resultCode:%s ClosePage:%s src requestCode:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(this.f262723e.f262724a.getIntent().getIntExtra("requestCode", -1)));
        this.f262722d.putExtra("key_jsapi_close_page_after_pay", intExtra);
        this.f262723e.f262724a.setResult(i18, this.f262722d);
        if (intExtra == 1 && this.f262723e.f262724a.getIntent().getIntExtra("requestCode", -1) == 214) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBrandUI", "store pay need close:%b, url:%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().D("key_jsapi_pay_need_close", this.f262723e.f262724a.f262619h.P)), this.f262723e.f262724a.f262619h.P);
            ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.p(this), 1000L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24610, "7", "1", "1", "");
        }
    }
}
