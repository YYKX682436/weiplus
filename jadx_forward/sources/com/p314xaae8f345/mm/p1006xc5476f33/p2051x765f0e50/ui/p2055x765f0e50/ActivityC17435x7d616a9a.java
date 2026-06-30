package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI */
/* loaded from: classes9.dex */
public class ActivityC17435x7d616a9a extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a {

    /* renamed from: w, reason: collision with root package name */
    public static boolean f242042w;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f242043r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f242044s = "settings_finder_live_switch";

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f242045t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f242046u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f242047v;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a
    public void V6() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "doReport.");
        java.util.HashMap hashMap = this.f242043r;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue == 3) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q("settings_search_switch")) {
                    c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_search_switch");
                }
                c21541x1c1b08fe = null;
            } else if (intValue == 10) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q("settings_look_switch")) {
                    c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_look_switch");
                }
                c21541x1c1b08fe = null;
            } else if (intValue == 11) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q("settings_finder_switch")) {
                    c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_finder_switch");
                }
                c21541x1c1b08fe = null;
            } else if (intValue == 8) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q("settings_miniprogram_switch")) {
                    c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_miniprogram_switch");
                }
                c21541x1c1b08fe = null;
            } else if (intValue == 7) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q("settings_game_switch")) {
                    c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_game_switch");
                }
                c21541x1c1b08fe = null;
            } else {
                if (intValue == 13 && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q(this.f242044s)) {
                    c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h(this.f242044s);
                }
                c21541x1c1b08fe = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "doReport. oldDefaultState.get(entrance) = " + hashMap.get(java.lang.Integer.valueOf(intValue)) + ", checkBoxPreference.isChecked() = " + c21541x1c1b08fe.N());
            if (((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue))).intValue() != c21541x1c1b08fe.N()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15185, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(c21541x1c1b08fe.N() ? 1 : 0), 1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a
    public void Y6() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe;
        super.Y6();
        java.util.HashMap hashMap = this.f242027f;
        if (hashMap.containsKey(8)) {
            this.f242043r.put(8, (java.lang.Integer) hashMap.get(8));
        }
        if (this.f242030i && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q("settings_miniprogram_switch") && (c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_miniprogram_switch")) != null) {
            if (this.f242033o) {
                c21541x1c1b08fe.O(true);
                hashMap.put(8, 1);
            } else {
                c21541x1c1b08fe.O(false);
                hashMap.put(8, 0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a
    public void Z6() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe;
        super.Z6();
        java.util.HashMap hashMap = this.f242027f;
        if (hashMap.containsKey(11)) {
            this.f242043r.put(11, (java.lang.Integer) hashMap.get(11));
        }
        if (this.f242030i && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q("settings_finder_switch") && (c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_finder_switch")) != null) {
            if (this.f242033o) {
                c21541x1c1b08fe.O(true);
                hashMap.put(11, 1);
            } else {
                c21541x1c1b08fe.O(false);
                hashMap.put(11, 0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a
    public void c7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe;
        super.c7();
        java.util.HashMap hashMap = this.f242027f;
        if (hashMap.containsKey(10)) {
            this.f242043r.put(10, (java.lang.Integer) hashMap.get(10));
        }
        if (this.f242030i && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q("settings_look_switch") && (c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_look_switch")) != null) {
            if (this.f242033o) {
                c21541x1c1b08fe.O(true);
                hashMap.put(10, 1);
            } else {
                c21541x1c1b08fe.O(false);
                hashMap.put(10, 0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a
    public void d7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe;
        super.d7();
        java.util.HashMap hashMap = this.f242027f;
        if (hashMap.containsKey(3)) {
            this.f242043r.put(3, (java.lang.Integer) hashMap.get(3));
        }
        if (this.f242030i && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q("settings_search_switch") && (c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_search_switch")) != null) {
            if (this.f242033o) {
                c21541x1c1b08fe.O(true);
                hashMap.put(3, 1);
            } else {
                c21541x1c1b08fe.O(false);
                hashMap.put(3, 0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ckm;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576471c6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe;
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.lg(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.jlw);
        this.f242045t = findViewById;
        findViewById.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aay));
        this.f242046u = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.g68);
        this.f242047v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ktd);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ("zh_CN".equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(this))) {
            arrayList.add("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxz) + "/cgi-bin/micromsg-bin/oshelpcenter?opcode=2&lang=zh_CN&plat=android&pid=1002060&id=180514qe7zqb180514ea6rff&Channel=helpcenter");
        } else {
            arrayList.add("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxz) + "/cgi-bin/micromsg-bin/oshelpcenter?opcode=2&lang=en&plat=android&pid=1003432&id=180323j2ynmi180323afvrzj&Channel=helpcenter");
        }
        java.lang.String charSequence = this.f242047v.getText().toString();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.io7));
        ((ke0.e) xVar).sj(this, arrayList, charSequence, arrayList2, this.f242047v);
        this.f242046u.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qg(this));
        Z6();
        b7();
        this.f242044s = ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi();
        java.util.HashMap hashMap = this.f242027f;
        boolean containsKey = hashMap.containsKey(13);
        java.util.HashMap hashMap2 = this.f242043r;
        if (containsKey) {
            hashMap2.put(13, (java.lang.Integer) hashMap.get(13));
        }
        if (this.f242030i) {
            if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q(this.f242044s)) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h(this.f242044s);
                if (c21541x1c1b08fe2 != null) {
                    if (this.f242033o) {
                        c21541x1c1b08fe2.O(true);
                        hashMap.put(13, 1);
                    } else {
                        c21541x1c1b08fe2.O(false);
                        hashMap.put(13, 0);
                    }
                }
            }
        }
        c7();
        d7();
        Y6();
        a7();
        if (hashMap.containsKey(7)) {
            hashMap2.put(7, (java.lang.Integer) hashMap.get(7));
        }
        if (this.f242030i && ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).q("settings_game_switch") && (c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_game_switch")) != null) {
            if (this.f242033o) {
                c21541x1c1b08fe.O(true);
                hashMap.put(7, 1);
            } else {
                c21541x1c1b08fe.O(false);
                hashMap.put(7, 0);
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aay));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        this.f39322x2305be9.G0(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aay));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        f242042w = true;
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17433xf2c8f56a, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        int i17;
        if (!(c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe)) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "click pref key %s", str);
        if (str.equals("settings_search_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoverySearch.k(this, null)) {
                return true;
            }
            i7(c21541x1c1b08fe, c21541x1c1b08fe.N(), true);
            i17 = 3;
        } else if (str.equals("settings_look_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryLooks.k(this, null)) {
                return true;
            }
            i17 = 10;
        } else if (str.equals("settings_finder_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryChannels.k(this, null)) {
                return true;
            }
            i17 = 11;
        } else if (str.equals("settings_miniprogram_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryAppbrand.k(this, null)) {
                return true;
            }
            i17 = 8;
        } else if (str.equals("settings_game_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryGame.k(this, null)) {
                return true;
            }
            i17 = 7;
        } else if (!str.equals("settings_finder_live_switch") && !str.equals("settings_finder_live_above_look_switch")) {
            i17 = -1;
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryFinderLive.k(this, null)) {
                return true;
            }
            i17 = 13;
        }
        boolean N = c21541x1c1b08fe.N();
        if (i17 >= 0) {
            this.f242028g.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(N ? 1 : 0));
        }
        return true;
    }
}
