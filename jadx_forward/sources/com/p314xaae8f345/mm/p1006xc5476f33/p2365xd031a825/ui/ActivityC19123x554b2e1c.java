package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI */
/* loaded from: classes9.dex */
public class ActivityC19123x554b2e1c extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f261635g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19144x4e901f97 f261636d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f261637e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f261638f = false;

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "directToNext()");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) m83105x7498fe14().getParcelable("key_authen");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) m83105x7498fe14().getParcelable("key_bankcard");
        if (c19090x75920c71 == null || c19091x9511676c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletSwitchVerifyPhoneUI", "authen or bankcard is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.a(c19091x9511676c.f69223x58802fcb);
        m83105x7498fe14().putParcelable("elemt_query", a17);
        c19090x75920c71.f261078g = c19091x9511676c.f69223x58802fcb;
        c19090x75920c71.f261079h = c19091x9511676c.f69225xed6d60f6;
        c19091x9511676c.f69218x2f3ef78d = a17.f261195v;
        m83105x7498fe14().putBoolean("key_balance_change_phone_need_confirm_phone", true);
        m83105x7498fe14().putBoolean("key_is_changing_balance_phone_num", true);
        m83105x7498fe14().putInt("key_err_code", 418);
        com.p314xaae8f345.mm.p2802xd031a825.a.d(this, m83105x7498fe14());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d8h;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19144x4e901f97 c19144x4e901f97 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19144x4e901f97) findViewById(com.p314xaae8f345.mm.R.id.kub);
        this.f261636d = c19144x4e901f97;
        c19144x4e901f97.m73918x1f522784(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z8(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        super.onCreate(bundle);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575154l03));
        mo43517x10010bd5();
        boolean z17 = m83105x7498fe14().getBoolean("key_block_bind_new_card", false);
        this.f261638f = z17;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19145xd4a650f2 c19145xd4a650f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19145xd4a650f2(mo55332x76847179(), 0);
            c19145xd4a650f2.setTag(-1);
            c19145xd4a650f2.a(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzz), null);
            this.f261636d.a(c19145xd4a650f2, -1);
        }
        if (m83108x2b5a5a39() != null && m83108x2b5a5a39().e().equals("PayProcess") && m83105x7498fe14().getInt("key_can_verify_tail", 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "show verify id card item");
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmg);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19145xd4a650f2 c19145xd4a650f22 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19145xd4a650f2(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.d8f);
            c19145xd4a650f22.setTag(-2);
            c19145xd4a650f22.a(string, null);
            this.f261636d.a(c19145xd4a650f22, -1);
        }
        m83090x14f40144(1667);
        m83090x14f40144(461);
        m83090x14f40144(hc1.i.f69826x366c91de);
        m83098x5406100e(new ss4.h(m83107xcc3330f3()));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(1667);
        m83121xf6ff5b27(461);
        m83121xf6ff5b27(hc1.i.f69826x366c91de);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.text.SpannableString spannableString;
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.h) {
                ss4.h hVar = (ss4.h) m1Var;
                java.util.LinkedList linkedList = hVar.f493596f.f460804f;
                this.f261637e = linkedList;
                if (linkedList != null) {
                    java.util.Collections.sort(linkedList, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a9(this));
                }
                r45.t90 t90Var = hVar.f493596f.f460805g;
                if (t90Var != null) {
                    m83105x7498fe14().putString("key_true_name", t90Var.f467744d);
                    m83105x7498fe14().putString("key_cre_name", t90Var.f467746f);
                    m83105x7498fe14().putString("key_cre_type", t90Var.f467745e);
                }
                java.util.List list = this.f261637e;
                if (list == null || list.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "empty mobile info");
                    return true;
                }
                int size = this.f261637e.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return true;
                    }
                    r45.jd jdVar = (r45.jd) this.f261637e.get(size);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jdVar.f459243d) || !jdVar.f459243d.equals("cft")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19145xd4a650f2 c19145xd4a650f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19145xd4a650f2(mo55332x76847179(), 0);
                        c19145xd4a650f2.setTag(java.lang.Integer.valueOf(size));
                        c19145xd4a650f2.a(jdVar.f459244e, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575157l06));
                        this.f261636d.a(c19145xd4a650f2, 0);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19145xd4a650f2 c19145xd4a650f22 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19145xd4a650f2(mo55332x76847179(), 0);
                        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575151l00, jdVar.f459247h, (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jdVar.f459248i) || !jdVar.f459248i.equals("1")) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575152l01) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575153l02), jdVar.f459249m);
                        if (this.f261638f) {
                            spannableString = new android.text.SpannableString(string);
                        } else {
                            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575156l05);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(this);
                            java.lang.String str2 = string + "，";
                            b4Var.f261680e = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560257ff);
                            android.text.SpannableString spannableString2 = new android.text.SpannableString(str2 + string2);
                            spannableString2.setSpan(b4Var, str2.length(), str2.length() + string2.length(), 33);
                            b4Var.f261679d = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b9(this, jdVar);
                            spannableString = spannableString2;
                        }
                        c19145xd4a650f22.setTag(java.lang.Integer.valueOf(size));
                        c19145xd4a650f22.a(jdVar.f459244e, spannableString);
                        this.f261636d.a(c19145xd4a650f22, 0);
                    }
                }
            } else if (m1Var instanceof ss4.z) {
                U6();
            }
        }
        return false;
    }
}
