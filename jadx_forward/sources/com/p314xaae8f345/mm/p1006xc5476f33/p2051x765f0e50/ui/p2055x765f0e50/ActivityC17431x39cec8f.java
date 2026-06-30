package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI */
/* loaded from: classes11.dex */
public class ActivityC17431x39cec8f extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f242012g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f242013h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f242014i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f242015m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f242016n = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.irr);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.Cif(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.irq), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kf(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78500x43e00957(0, false);
        this.f242016n = getIntent().getBooleanExtra("not_auth_setting", false);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242012g).t();
        if (this.f242014i == null) {
            this.f242014i = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.p(getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 4), this);
        }
        java.lang.String str = this.f242014i;
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.B3(new t14.z("select_view_language", str, 4));
        }
        java.lang.String[] stringArray = com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.c() ? getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559541w) : getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559540v);
        this.f242015m = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.p(getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 4), this);
        this.f242013h = new java.util.ArrayList();
        java.lang.String[] strArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.l2.f274351a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.c()) {
            strArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.l2.f274352b;
        }
        for (int i17 = 0; i17 < strArr.length; i17++) {
            java.lang.String str2 = strArr[i17];
            ((java.util.ArrayList) this.f242013h).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3(stringArray[i17], "", str2, this.f242015m.equalsIgnoreCase(str2)));
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f242013h).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3 f3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73 c11407x90269a73 = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73(this, null);
            c11407x90269a73.M(f3Var);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242012g).d(c11407x90269a73, -1);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242012g).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19(this), -1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242012g).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f242012g = m79336x8b97809d();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3 f3Var;
        if (!(c21560x1fce98fb instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73) || (f3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73) c21560x1fce98fb).L) == null) {
            return false;
        }
        java.lang.String str = f3Var.f155371a;
        java.lang.String str2 = f3Var.f155373c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "LanguageName:%s IsoCode:%s", str, str2);
        this.f242015m = str2;
        java.util.Iterator it = ((java.util.ArrayList) this.f242013h).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3) it.next()).f155374d = false;
        }
        f3Var.f155374d = true;
        m78500x43e00957(0, !android.text.TextUtils.equals(this.f242014i, this.f242015m));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(n14.m.class);
    }
}
