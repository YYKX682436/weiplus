package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResendMsgUI */
/* loaded from: classes9.dex */
public class ActivityC17148xd250cbbc extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(4808);
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResendMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/remittance/ui/RemittanceResendMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78596x71afbec8(8);
        java.lang.String stringExtra = getIntent().getStringExtra(ya.b.f77506xba41a63c);
        java.lang.String stringExtra2 = getIntent().getStringExtra("transfer_id");
        java.lang.String stringExtra3 = getIntent().getStringExtra("receiver_name");
        int intExtra = getIntent().getIntExtra("resend_msg_from_flag", 1);
        int intExtra2 = getIntent().getIntExtra("invalid_time", 0);
        int intExtra3 = getIntent().getIntExtra("is_open_im", 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResendMsgUI", "onCreate() receiverName == null");
        } else {
            if (intExtra3 != 0) {
                m83098x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.m1(stringExtra2, intExtra));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h1(stringExtra, stringExtra2, stringExtra3, intExtra2, intExtra);
            h1Var.m82989x7c4af7d8("RemittanceProcess");
            m83098x5406100e(h1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(4808);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceResendMsgUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.mo808xfb85f7b0());
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h1) {
            if (i17 != 0 || i18 != 0) {
                db5.e1.y(this, str, "", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.z7(this));
                return true;
            }
            db5.h7.c(null, mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), mo55332x76847179(), 0, null);
            finish();
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5903x18aa0944().e();
            return true;
        }
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.m1)) {
            return false;
        }
        if (i17 == 0 && i18 == 0) {
            r45.dy dyVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.m1) m1Var).f238433r;
            if (dyVar.f454375d == 0) {
                db5.h7.c(null, mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), mo55332x76847179(), 0, null);
                finish();
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5903x18aa0944().e();
            } else {
                m83135x118607f0(dyVar.f454376e, true);
            }
        } else {
            m83135x118607f0(str, true);
        }
        return true;
    }
}
