package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletUnbindBankCardProxyUI */
/* loaded from: classes9.dex */
public class ActivityC19029x3a87aca7 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f260134d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f260135e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f260136f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.HashMap hashMap;
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        setResult(0);
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.WalletUnbindBankCardProxyUI", "intent is null");
            finish();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("packageExt");
        this.f260134d = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.WalletUnbindBankCardProxyUI", "mPackage：%s", stringExtra);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260134d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param error");
            setResult(1);
            finish();
            return;
        }
        java.lang.String str = this.f260134d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String[] split = str.split("&");
            hashMap = new java.util.HashMap();
            if (split != null && split.length > 0) {
                for (java.lang.String str2 : split) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        int indexOf = str2.indexOf("=");
                        java.lang.String substring = str2.substring(0, indexOf);
                        java.lang.String substring2 = str2.substring(indexOf + 1, str2.length());
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(substring) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(substring2)) {
                            hashMap.put(substring, substring2);
                        }
                    }
                }
                this.f260136f = hashMap;
                if (hashMap != null || !hashMap.containsKey("bank_type") || !this.f260136f.containsKey("bind_serial")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param:package error.package==" + this.f260134d);
                    setResult(1);
                    finish();
                }
                dt4.d Ri = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri();
                java.lang.String str3 = (java.lang.String) this.f260136f.get("bind_serial");
                Ri.getClass();
                android.database.Cursor f17 = Ri.f324767d.f("select * from WalletBankcard where bindSerial = '" + str3 + "'", null, 2);
                if (f17.moveToNext()) {
                    c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
                    c19091x9511676c.mo9015xbf5d97fd(f17);
                }
                f17.close();
                this.f260135e = c19091x9511676c;
                if (c19091x9511676c == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.WalletUnbindBankCardProxyUI", "can not found bankcard, new one ");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
                    this.f260135e = c19091x9511676c2;
                    c19091x9511676c2.f69223x58802fcb = (java.lang.String) this.f260136f.get("bank_type");
                    this.f260135e.f69225xed6d60f6 = (java.lang.String) this.f260136f.get("bind_serial");
                }
                intent.putExtra("key_is_show_detail", false);
                intent.putExtra("key_bankcard", this.f260135e);
                intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
                java.util.Map map = this.f260136f;
                if (map != null && !map.isEmpty() && this.f260136f.containsKey("support_quick_bind")) {
                    intent.putExtra("key_support_quick_bind", (java.lang.String) this.f260136f.get("support_quick_bind"));
                }
                com.p314xaae8f345.mm.p2802xd031a825.a.j(this, sr4.b.class, intent.getExtras(), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.i0(this));
                return;
            }
        }
        hashMap = null;
        this.f260136f = hashMap;
        if (hashMap != null) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.WalletUnbindBankCardProxyUI", "jsapi param:package error.package==" + this.f260134d);
        setResult(1);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        finish();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
