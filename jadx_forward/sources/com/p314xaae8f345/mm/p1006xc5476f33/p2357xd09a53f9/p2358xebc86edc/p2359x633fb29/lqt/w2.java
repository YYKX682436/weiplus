package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.i2 f259264a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f259265b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f259266c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f259267d;

    /* renamed from: e, reason: collision with root package name */
    public int f259268e;

    /* renamed from: f, reason: collision with root package name */
    public int f259269f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f259270g;

    /* renamed from: h, reason: collision with root package name */
    public int f259271h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f259272i;

    /* renamed from: j, reason: collision with root package name */
    public int f259273j;

    /* renamed from: k, reason: collision with root package name */
    public int f259274k;

    /* renamed from: l, reason: collision with root package name */
    public km5.b f259275l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f259276m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f259277n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ff5 f259278o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f259279p;

    public w2() {
        this.f259264a = null;
        this.f259265b = null;
        this.f259276m = new java.util.HashMap();
        this.f259277n = false;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchLogic", "%s pre redeem finish get redeemListId: %s", java.lang.Integer.valueOf(hashCode()), this.f259270g);
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f259265b;
        android.content.Intent intent = new android.content.Intent(abstractActivityC22902xe37969e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19012xd0c85d9b.class);
        intent.putExtra("lqt_fetch_pwd_title", abstractActivityC22902xe37969e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kph));
        intent.putExtra("lqt_fetch_pwd_money", (this.f259269f / 100.0d) + "");
        intent.putExtra("lqt_redeem_listid", this.f259270g);
        abstractActivityC22902xe37969e.startActivityForResult(intent, 456);
    }

    public final void b(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchLogic", "doQueryPurchaseResult");
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f259265b;
        abstractActivityC22902xe37969e.m83134x2b33b77f(false);
        java.lang.String stringExtra = abstractActivityC22902xe37969e.getIntent().getStringExtra("operate_id");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.f2 f2Var = this.f259264a.f259189c;
        java.lang.String str2 = this.f259266c;
        java.lang.String str3 = this.f259267d;
        int i18 = this.f259268e;
        int i19 = this.f259271h;
        int i27 = this.f259274k;
        f2Var.getClass();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i27);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i17);
        km5.q qVar = new km5.q();
        qVar.y(str2, str3, valueOf, valueOf2, stringExtra, valueOf3, valueOf4);
        qVar.n(f2Var);
        ((km5.q) qVar.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.u2(this, str))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.t2(this));
    }

    public final void c(r45.ff5 ff5Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        int i17 = ff5Var.f455818i;
        int i18 = 52;
        if (i17 == 2) {
            java.lang.String str = ff5Var.f455815f;
            int i19 = ff5Var.f455817h;
            if (c19091x9511676c == null) {
                c19091x9511676c = this.f259272i;
            }
            if (!this.f259277n || this.f259275l == null) {
                this.f259275l = km5.u.b();
            }
            this.f259275l.b();
            if (i19 > 0) {
                i18 = i19;
            } else if (this.f259271h == 0) {
                i18 = 45;
            }
            java.lang.String str2 = c19091x9511676c != null ? c19091x9511676c.f69225xed6d60f6 : "";
            java.lang.String str3 = c19091x9511676c != null ? c19091x9511676c.f69223x58802fcb : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchLogic", "doKindaSaveLqt, startInWxAppPayUseCase reqKey:%s bindSerial:%s bankType:%s", str, str2, str3);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("prepayId", str);
            bundle.putString("bindSerial", str2);
            bundle.putString("bankType", str3);
            bundle.putInt("payScene", i18);
            bundle.putInt("payChannel", 0);
            if (this.f259274k == 14) {
                bundle.putInt("enableDuplicate", 1);
            } else {
                bundle.putInt("enableDuplicate", 0);
            }
            ((h45.q) i95.n0.c(h45.q.class)).mo24806xf00c9308(this.f259265b, bundle);
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc.mo27557xc5c55e60("payScene", 45);
            if (!android.text.TextUtils.isEmpty(ff5Var.f455815f)) {
                m27539xaf65a0fc.mo27566xe4673800("prepay_id", ff5Var.f455815f);
            }
            m27539xaf65a0fc.mo27566xe4673800("bankType", c19091x9511676c.f69223x58802fcb);
            m27539xaf65a0fc.mo27566xe4673800("bindSerial", c19091x9511676c.f69225xed6d60f6);
            if (this.f259274k == 14) {
                m27539xaf65a0fc.mo27556xf2e34299("enableDuplicate", true);
            }
            if (!this.f259277n || this.f259275l == null) {
                this.f259275l = km5.u.b();
            }
            this.f259275l.b();
            ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("jointPay", m27539xaf65a0fc, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.q2(this, ff5Var, c19091x9511676c));
            return;
        }
        java.lang.String str4 = ff5Var.f455815f;
        int i27 = ff5Var.f455817h;
        if (c19091x9511676c == null) {
            c19091x9511676c = this.f259272i;
        }
        if (!this.f259277n || this.f259275l == null) {
            this.f259275l = km5.u.b();
        }
        this.f259275l.b();
        if (i27 > 0) {
            i18 = i27;
        } else if (this.f259271h == 0) {
            i18 = 45;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f259265b;
        java.lang.String str5 = c19091x9511676c != null ? c19091x9511676c.f69225xed6d60f6 : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
        c19760x34448d56.f273647m = str4;
        c19760x34448d56.f273649o = "";
        c19760x34448d56.f273650p = null;
        c19760x34448d56.f273642e = i18;
        c19760x34448d56.f273654t = null;
        c19760x34448d56.f273644g = 0;
        h45.a0.g(abstractActivityC22902xe37969e, true, str5, c19760x34448d56, null, new android.content.Intent(), 123);
    }

    public void d(java.lang.String str) {
        if (this.f259273j == 1) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_DEFAULTCARD_SAVE_STRING_SYNC, str);
        } else {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_DEFAULTCARD_FETCH_STRING_SYNC, str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259202q;
        boolean z17 = false;
        boolean z18 = this.f259273j == 1;
        l0Var.a(z18);
        r45.be4 be4Var = z18 ? l0Var.f259205a : l0Var.f259206b;
        if (be4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtBindQueryInfoCache", "isReqAgainAfterDeal: %s", java.lang.Boolean.valueOf(be4Var.f452234i));
            z17 = be4Var.f452234i;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchLogic", "saveOrfetchDone, req again after deal");
            e(this.f259273j, this.f259271h, 1);
        }
    }

    public void e(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveFetchLogic", "updateBindBankcard, mode: %s, accountType: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        km5.b b17 = km5.u.b();
        this.f259275l = b17;
        b17.b();
        if (i17 == 1) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.j(i18, i19).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.k2(this, i19));
        } else {
            new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.k(i18, i19).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l2(this));
        }
    }

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.d2 d2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.i2 i2Var, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, int i17, int i18) {
        this.f259264a = null;
        this.f259265b = null;
        this.f259276m = new java.util.HashMap();
        this.f259277n = false;
        this.f259264a = i2Var;
        this.f259265b = abstractActivityC22902xe37969e;
        this.f259273j = i17;
    }
}
