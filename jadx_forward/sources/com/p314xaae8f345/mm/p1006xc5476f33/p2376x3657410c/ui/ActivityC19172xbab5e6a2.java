package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletSendC2CMsgUI */
/* loaded from: classes9.dex */
public class ActivityC19172xbab5e6a2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f262654d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f262655e;

    public final boolean U6(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        if (this.f262655e == 1) {
            java.lang.String stringExtra = getIntent().getStringExtra("key_receiver");
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_sender_des");
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_receiver_des");
            java.lang.String encode = java.net.URLEncoder.encode(getIntent().getStringExtra("key_url"));
            java.lang.String stringExtra4 = getIntent().getStringExtra("key_templateid");
            java.lang.String stringExtra5 = getIntent().getStringExtra("key_sceneid");
            java.lang.String stringExtra6 = getIntent().getStringExtra("key_receivertitle");
            str7 = stringExtra3;
            str8 = encode;
            str9 = stringExtra5;
            str4 = getIntent().getStringExtra("key_sendertitle");
            str2 = stringExtra;
            str6 = stringExtra2;
            str5 = stringExtra4;
            str3 = stringExtra6;
        } else {
            java.util.Map V6 = V6();
            if (V6 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str2 = str;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            } else {
                java.lang.String str10 = (java.lang.String) V6.get("receivertitle");
                if (str10 == null) {
                    str10 = "";
                }
                java.lang.String decode = java.net.URLDecoder.decode(str10);
                java.lang.String str11 = (java.lang.String) V6.get("sendertitle");
                if (str11 == null) {
                    str11 = "";
                }
                java.lang.String decode2 = java.net.URLDecoder.decode(str11);
                java.lang.String str12 = (java.lang.String) V6.get("senderdes");
                if (str12 == null) {
                    str12 = "";
                }
                java.lang.String decode3 = java.net.URLDecoder.decode(str12);
                java.lang.String str13 = (java.lang.String) V6.get("receiverdes");
                if (str13 == null) {
                    str13 = "";
                }
                java.lang.String decode4 = java.net.URLDecoder.decode(str13);
                java.lang.String str14 = (java.lang.String) V6.get("url");
                if (str14 == null) {
                    str14 = "";
                }
                java.lang.String str15 = (java.lang.String) V6.get("templateid");
                if (str15 == null) {
                    str15 = "";
                }
                java.lang.String decode5 = java.net.URLDecoder.decode(str15);
                java.lang.String str16 = (java.lang.String) V6.get("senceid");
                str2 = str;
                str9 = java.net.URLDecoder.decode(str16 != null ? str16 : "");
                str8 = str14;
                str4 = decode2;
                str6 = decode3;
                str7 = decode4;
                str3 = decode;
                str5 = decode5;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            m83098x5406100e(new nt4.o(str2, str3, str4, str5, str6, str7, str8, str9));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletSendC2CMsgUI", "url = " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8) + "templateId=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5));
        return false;
    }

    public final java.util.Map V6() {
        if (this.f262654d == null) {
            java.lang.String stringExtra = getIntent().getStringExtra("packageExt");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                java.lang.String[] split = stringExtra.split("&");
                this.f262654d = new java.util.HashMap();
                if (split != null && split.length > 0) {
                    for (int i17 = 0; i17 < split.length; i17++) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[i17])) {
                            java.lang.String[] split2 = split[i17].split("=");
                            if (split2.length == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split2[0])) {
                                this.f262654d.put(split2[0], split2[1]);
                            }
                        }
                    }
                }
            }
        }
        return this.f262654d;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent != null) {
            intent.toString();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = null");
        }
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, unknown requestCode = " + i17);
        } else {
            if (i18 != -1 || intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSendC2CMsgUI", "cancel select contact fail");
                setResult(0);
                finish();
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (U6(stringExtra)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSendC2CMsgUI", "doSendC2CMsg fail");
            setResult(-1000);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo67598xf0aced2e(8);
        this.f262655e = getIntent().getIntExtra("key_scene", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSendC2CMsgUI", "scene:" + this.f262655e);
        if (this.f262655e != 0) {
            if (U6(null)) {
                return;
            }
            setResult(-1000);
            finish();
            return;
        }
        m83090x14f40144(580);
        if (getIntent() != null) {
            m83096xe7b1ccf7(new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 6, "getSendC2CMessageRequest", getIntent().getIntExtra("pay_channel", 0)));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSendC2CMsgUI", "func[doCheckPayNetscene] intent null");
        setResult(-1000);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(580);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = false;
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSendC2CMsgUI", "Check jsapi suc & Go Select Contact");
                h45.y.f360501a = ((ss4.d) m1Var).H();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSendC2CMsgUI", "doCallSelectConversationUI");
                java.util.Map V6 = V6();
                if (V6 != null && V6.containsKey("togroup") && "0".equals(V6.get("togroup"))) {
                    z17 = true;
                }
                android.content.Intent intent = new android.content.Intent();
                int i19 = z17 ? 7 : 3;
                intent.putExtra("select_is_ret", true);
                intent.putExtra("Select_Conv_Type", i19);
                j45.l.v(this, ".ui.transmit.SelectConversationUI", intent, 1);
                return true;
            }
            if (m1Var instanceof nt4.o) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSendC2CMsgUI", "Send c2c msg suc");
                if (this.f262655e == 1) {
                    db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzm));
                } else {
                    db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6));
                    setResult(-1);
                }
                finish();
                return true;
            }
        } else {
            if (m1Var instanceof ss4.d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSendC2CMsgUI", "Check jsapi fail");
                setResult(-1000);
                finish();
                return true;
            }
            if (m1Var instanceof nt4.o) {
                if (this.f262655e == 1) {
                    db5.e1.T(this, str);
                } else {
                    setResult(-1000);
                }
                finish();
                return true;
            }
            setResult(-1000);
            finish();
        }
        return false;
    }
}
