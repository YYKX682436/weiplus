package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/remittance/ui/RemittanceLargeMoneyUI;", "Lcom/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceLargeMoneyUI */
/* loaded from: classes9.dex */
public class ActivityC17140xfc6f7677 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675 {

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f238960u;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675
    public void U6(double d17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5904x24321495 c5904x24321495 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5904x24321495();
        am.rq rqVar = c5904x24321495.f136209g;
        rqVar.f89368b = d17;
        rqVar.f89367a = this.f238960u;
        rqVar.getClass();
        c5904x24321495.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675
    public void V6() {
        this.f238953p = getIntent().getIntExtra("key_amount_remind_bit", 4);
        this.f238955r = getIntent().getStringExtra("key_title");
        this.f238956s = getIntent().getStringExtra("key_desc");
        getIntent().getStringExtra("key_display_name");
        this.f238960u = getIntent().getStringExtra("key_place_attach");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675
    public void W6() {
        this.f238945e.setText(this.f238955r);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.s1) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.s1.class);
        java.lang.String mTitle = this.f238955r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mTitle, "mTitle");
        s1Var.m42291x53d8522f("page_title_key", mTitle);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = this.f238956s;
        float textSize = this.f238946f.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f238946f.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceLargeMoneyUI", "onResume()");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h2.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.g2.f239252a.c(this);
    }
}
