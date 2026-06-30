package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* loaded from: classes9.dex */
public final class f0 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.g0 f260160a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.g0 g0Var) {
        this.f260160a = g0Var;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e data) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a activityC19027xea6090a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int mo27544xb58848b9 = data.mo27544xb58848b9("retcode");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.g0 g0Var = this.f260160a;
        if (mo27544xb58848b9 == 3) {
            ot5.g.c("MicroMsg.WalletJSAPIBindCardUIC", "callback from kinda, native jsapi bind card");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = g0Var.m158354x19263085();
            activityC19027xea6090a = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a ? (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a) m158354x19263085 : null;
            if (activityC19027xea6090a != null) {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(4);
                if (activityC19027xea6090a.getIntent() == null) {
                    activityC19027xea6090a.a7("");
                    return;
                }
                java.lang.String stringExtra = activityC19027xea6090a.getIntent().getStringExtra("appId");
                java.lang.String stringExtra2 = activityC19027xea6090a.getIntent().getStringExtra("timeStamp");
                java.lang.String stringExtra3 = activityC19027xea6090a.getIntent().getStringExtra("nonceStr");
                java.lang.String stringExtra4 = activityC19027xea6090a.getIntent().getStringExtra("packageExt");
                java.lang.String stringExtra5 = activityC19027xea6090a.getIntent().getStringExtra("signtype");
                java.lang.String stringExtra6 = activityC19027xea6090a.getIntent().getStringExtra("paySignature");
                java.lang.String stringExtra7 = activityC19027xea6090a.getIntent().getStringExtra("url");
                int intExtra = activityC19027xea6090a.getIntent().getIntExtra("pay_channel", 0);
                if (activityC19027xea6090a.f260109g == 6) {
                    activityC19027xea6090a.f260113n = new ss4.d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, 2, "getBrandWCPayCreateCreditCardRequest", intExtra);
                } else {
                    activityC19027xea6090a.f260113n = new ss4.d(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, 1, "getBrandWCPayBindCardRequest", intExtra);
                }
                activityC19027xea6090a.m83096xe7b1ccf7(activityC19027xea6090a.f260113n);
                return;
            }
            return;
        }
        if (data.mo27544xb58848b9("retcode") == 1) {
            ot5.g.c("MicroMsg.WalletJSAPIBindCardUIC", "callback from kinda, liteapp jsapi bind card succ");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = g0Var.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a activityC19027xea6090a2 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a ? (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a) m158354x192630852 : null;
            if (activityC19027xea6090a2 != null) {
                activityC19027xea6090a2.f260107e = true;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = g0Var.m158354x19263085();
            activityC19027xea6090a = m158354x192630853 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a ? (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a) m158354x192630853 : null;
            if (activityC19027xea6090a != null) {
                activityC19027xea6090a.X6(true, true);
                return;
            }
            return;
        }
        if (data.mo27544xb58848b9("retcode") != -1) {
            if (data.mo27544xb58848b9("retcode") == 2) {
                ot5.g.c("MicroMsg.WalletJSAPIBindCardUIC", "callback from kinda, liteapp jsapi bind card realname");
                return;
            }
            return;
        }
        ot5.g.c("MicroMsg.WalletJSAPIBindCardUIC", "callback from kinda, liteapp jsapi bind card calcen");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = g0Var.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a activityC19027xea6090a3 = m158354x192630854 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a ? (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a) m158354x192630854 : null;
        if (activityC19027xea6090a3 != null) {
            activityC19027xea6090a3.f260107e = true;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630855 = g0Var.m158354x19263085();
        activityC19027xea6090a = m158354x192630855 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a ? (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19027xea6090a) m158354x192630855 : null;
        if (activityC19027xea6090a != null) {
            activityC19027xea6090a.X6(false, true);
        }
    }
}
