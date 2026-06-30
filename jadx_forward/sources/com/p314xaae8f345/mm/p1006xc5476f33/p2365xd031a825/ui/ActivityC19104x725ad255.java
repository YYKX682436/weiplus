package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI */
/* loaded from: classes9.dex */
public class ActivityC19104x725ad255 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {
    private static final java.lang.String TAG = "WalletBankCardSelectUI";

    /* renamed from: bankcardList */
    protected java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c> f38694x4c50a20a;

    /* renamed from: bankcardQueryList */
    private java.util.List<fb5.n> f38695x4a85ab9a;

    /* renamed from: bankcardTypeList */
    protected java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c> f38696x175be264;

    /* renamed from: mBankCardSelectSortView */
    protected com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19141xe17e052b f38699x789c45d8;

    /* renamed from: mSearchViewHelper */
    private com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f38700x24660108;

    /* renamed from: majorBankCardList */
    protected java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c> f38701x84ec4283;

    /* renamed from: origBankcardList */
    private java.util.List<fb5.n> f38702xc2bfcaeb;

    /* renamed from: mBankCardComparator */
    protected com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v0 f38698xa283a4af = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v0(null);

    /* renamed from: isSearchMode */
    private boolean f38697x570efc35 = false;

    /* renamed from: getAlpha */
    public static char m73899x742757a8(java.lang.String str, char c17, boolean z17) {
        return m73900x19c8e7ce(str, "" + c17, "_", z17).charAt(0);
    }

    /* renamed from: getFullPY */
    public static java.lang.String m73900x19c8e7ce(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String a17 = com.p314xaae8f345.mm.p1004x2137b148.C11326x85391f34.a(str.charAt(i17));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                if (z17) {
                    sb6.append(a17.toUpperCase());
                } else {
                    sb6.append(a17);
                }
                if (i17 != length - 1) {
                    sb6.append(str3);
                }
            }
        }
        java.lang.String sb7 = sb6.toString();
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb7) ? sb7 : str2;
    }

    public final boolean U6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c) {
        java.util.Iterator<fb5.n> it = this.f38702xc2bfcaeb.iterator();
        while (it.hasNext()) {
            gt4.n nVar = (gt4.n) it.next().f342431b;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19097xe6dc5b4c.f261181e) && c19097xe6dc5b4c.f261181e.equals(nVar.f357006c)) {
                return true;
            }
        }
        return false;
    }

    public final void V6(java.util.Map map) {
        at4.k kVar;
        at4.k kVar2;
        this.f38702xc2bfcaeb.clear();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c> list = this.f38701x84ec4283;
        if (list != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c : list) {
                if (!U6(c19097xe6dc5b4c)) {
                    fb5.n nVar = new fb5.n();
                    gt4.n nVar2 = new gt4.n();
                    nVar2.f357006c = c19097xe6dc5b4c.f261181e;
                    java.lang.String str = c19097xe6dc5b4c.f261192s;
                    nVar2.f357008e = str;
                    if (map != null && (kVar2 = (at4.k) map.get(str)) != null) {
                        nVar2.f357004a = kVar2.f95411a;
                        nVar2.f357005b = kVar2.f95414d;
                        nVar2.f357007d = kVar2.f95418h;
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar2.f357007d)) {
                        nVar2.f357007d = m73900x19c8e7ce(nVar2.f357006c, "#", "_", true);
                    }
                    nVar.f342430a = "☆";
                    nVar.f342431b = nVar2;
                    this.f38702xc2bfcaeb.add(nVar);
                }
            }
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c2 : this.f38694x4c50a20a) {
            if (!U6(c19097xe6dc5b4c2)) {
                fb5.n nVar3 = new fb5.n();
                gt4.n nVar4 = new gt4.n();
                nVar4.f357006c = c19097xe6dc5b4c2.f261181e;
                java.lang.String str2 = c19097xe6dc5b4c2.f261192s;
                nVar4.f357008e = str2;
                if (map != null && (kVar = (at4.k) map.get(str2)) != null) {
                    nVar4.f357004a = kVar.f95411a;
                    nVar4.f357005b = kVar.f95414d;
                    nVar4.f357007d = kVar.f95418h;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar4.f357007d)) {
                    nVar4.f357007d = m73900x19c8e7ce(nVar4.f357006c, "#", "_", true);
                }
                nVar3.f342430a = "" + nVar4.f357007d.toUpperCase().charAt(0);
                nVar3.f342431b = nVar4;
                this.f38702xc2bfcaeb.add(nVar3);
            }
        }
        java.util.Collections.sort(this.f38702xc2bfcaeb, this.f38698xa283a4af);
        runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u0(this));
    }

    /* renamed from: fetchData */
    public void mo26753xb6377d84() {
        this.f38702xc2bfcaeb = new java.util.ArrayList();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c> list = this.f38694x4c50a20a;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "bankcardlist is null, start to doScene");
            this.f39904x9eeebfc.e(new ss4.z("", "", null), true, 1, 0);
            return;
        }
        V6(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c> list2 = this.f38694x4c50a20a;
        if (list2 != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c : list2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
                c19091x9511676c.f69217xaef0808c = c19097xe6dc5b4c.f261181e;
                c19091x9511676c.f69223x58802fcb = c19097xe6dc5b4c.f261192s;
                linkedList.add(c19091x9511676c);
            }
        }
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c> list3 = this.f38701x84ec4283;
        if (list3 != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c2 : list3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
                c19091x9511676c2.f69217xaef0808c = c19097xe6dc5b4c2.f261181e;
                c19091x9511676c2.f69223x58802fcb = c19097xe6dc5b4c2.f261192s;
                linkedList.add(c19091x9511676c2);
            }
        }
        mo55332x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t0(this);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BankcardLogoHelper", "req is null");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "get logo callback: %s", java.lang.Integer.valueOf(hashMap.size()));
            V6(hashMap);
        } else {
            ((km5.q) km5.u.e(linkedList)).q(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.h(mVar)).q(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.f(mVar, linkedList, hashMap, t0Var));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5m;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19141xe17e052b c19141xe17e052b = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19141xe17e052b) findViewById(com.p314xaae8f345.mm.R.id.aes);
        this.f38699x789c45d8 = c19141xe17e052b;
        c19141xe17e052b.m79360xa1aeda28(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r0(this));
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);
        this.f38700x24660108 = c9Var;
        c9Var.f291857i = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.s0(this);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.aet);
        this.f38694x4c50a20a = ((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.f95344b;
        mo43517x10010bd5();
        mo26753xb6377d84();
        m78489xd6d59aa8(true, this.f38700x24660108);
    }

    /* renamed from: onItemSelect */
    public void mo26754x3d81212e(java.lang.Object obj, int i17) {
        gt4.n nVar = (gt4.n) obj;
        if (nVar != null) {
            mo48674x36654fab();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("bank_name", nVar.f357006c);
            intent.putExtra("bank_type", nVar.f357008e);
            intent.putExtra("bank_icon", nVar.f357004a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "item bank: %s", nVar.f357006c);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof ss4.z)) {
            return false;
        }
        this.f38694x4c50a20a = ((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.f95344b;
        mo26753xb6377d84();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.a.class);
    }
}
