package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI */
/* loaded from: classes9.dex */
public class ActivityC16334x8c51adff extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f226665m = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f226666g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f226667h;

    /* renamed from: i, reason: collision with root package name */
    public wb3.a f226668i;

    public final void V6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "go to detail ui");
        android.app.Dialog dialog = this.f226666g;
        if (dialog != null) {
            dialog.dismiss();
        }
        xb3.b bVar = new xb3.b(this);
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(bVar, 100L);
        } else {
            bVar.run();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var;
        super.onCreate(bundle);
        overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559400dq);
        com.p314xaae8f345.mm.ui.bk.p0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo67598xf0aced2e(8);
        this.f226667h = getIntent().getStringExtra("key_sendid");
        java.lang.String stringExtra = getIntent().getStringExtra("key_native_url");
        int intExtra = getIntent().getIntExtra("key_jump_from", 2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendid=");
        java.lang.String str = this.f226667h;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", nativeurl=");
        sb6.append(stringExtra != null ? stringExtra : "");
        sb6.append(", jumpFrom=");
        sb6.append(intExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", sb6.toString());
        if (intExtra == 2) {
            if (gb3.l.a(this.f226667h) != null) {
                V6(false);
                return;
            }
            try {
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_detail_info");
                if (byteArrayExtra != null && (e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1) new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1().mo11468x92b714fd(byteArrayExtra)) != null) {
                    gb3.l.b(this.f226667h, e1Var);
                    V6(false);
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyHKBeforeDetailUI", "Parse LuckyMoneyDetail fail!" + e17.getLocalizedMessage());
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226667h) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            try {
                this.f226667h = android.net.Uri.parse(stringExtra).getQueryParameter("sendid");
            } catch (java.lang.Exception unused) {
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226667h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyHKBeforeDetailUI", "sendid null or nil, finish");
            finish();
            return;
        }
        java.lang.String str2 = this.f226667h;
        this.f226666g = db5.e1.O(mo55332x76847179(), null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new xb3.c(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "do query detail");
        wb3.a aVar = new wb3.a(stringExtra, str2, 11, 0, 1, getIntent().getIntExtra("key_hk_scene", 0));
        this.f226668i = aVar;
        aVar.l().h(new xb3.d(this, str2)).f(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
