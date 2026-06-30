package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode */
/* loaded from: classes11.dex */
public class ActivityC17390xeb03cc89 extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241728g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241729h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241730i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f241731m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f241732n;

    /* renamed from: o, reason: collision with root package name */
    public int f241733o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f241734p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f241735q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241736r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f241737s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f241738t;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 3;
    }

    public final void X6(boolean z17) {
        if (com.p314xaae8f345.mm.ui.bk.F()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241728g).m("manual_title", z17);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241728g).m("manual_title", true);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241728g).m("dark_mode", z17);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241728g).m("normal_mode", z17);
    }

    public final void Y6() {
        if (this.f241736r) {
            if (com.p314xaae8f345.mm.ui.bk.I()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("dark_mode_follow_system_need_report", true);
                return;
            }
            if (this.f241738t != this.f241730i) {
                this.f241733o = 4;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18893, java.lang.Integer.valueOf(this.f241733o), java.lang.Integer.valueOf(this.f241734p), 2, java.lang.Integer.valueOf(this.f241735q), java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.F() ? 1 : 0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "dark mode kvReport logID:%s, action:%s, dark:%s, mode:%s", 18893, java.lang.Integer.valueOf(this.f241733o), java.lang.Integer.valueOf(this.f241734p), java.lang.Integer.valueOf(this.f241735q));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576458br;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.iqf));
        this.f241728g = m79336x8b97809d();
        if (!com.p314xaae8f345.mm.ui.bk.F()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("dark_mode_follow_system", false);
            com.p314xaae8f345.mm.ui.bk.x0();
        }
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        this.f241729h = C;
        this.f241737s = C;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("dark_mode_follow_system_need_report", false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("dark_mode_follow_system", true);
        this.f241730i = z17;
        this.f241738t = z17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241728g).h("follow_system");
        this.f241731m = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241728g).h("dark_mode");
        this.f241732n = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241728g).h("normal_mode");
        if (!com.p314xaae8f345.mm.ui.bk.F()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241728g).m("follow_system", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241728g).m("manual_title", true);
        } else if (c21541x1c1b08fe != null) {
            c21541x1c1b08fe.O(this.f241730i);
            c21541x1c1b08fe.S(this.f241730i);
            c21541x1c1b08fe.f279318v = false;
        }
        if (this.f241730i) {
            X6(true);
        } else {
            X6(false);
            if (this.f241729h) {
                this.f241731m.P = true;
                this.f241732n.P = false;
            } else {
                this.f241732n.P = true;
                this.f241731m.P = false;
            }
        }
        java.lang.String str = this.f241737s ? "dark_mode" : "normal_mode";
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.B3(new t14.z("select_view_dark_mode", str, 4));
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241728g).notifyDataSetChanged();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y2(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z2(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        ?? r17 = 1;
        this.f241736r = true;
        if (str.equals("follow_system")) {
            if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N()) {
                this.f241733o = 4;
                this.f241734p = com.p314xaae8f345.mm.ui.bk.E(getResources()) ? 1 : 0;
                this.f241735q = 1;
                this.f241738t = true;
                X6(true);
            } else {
                this.f241733o = 4;
                this.f241734p = this.f241729h ? 1 : 0;
                this.f241735q = 2;
                this.f241738t = false;
                X6(false);
                if (this.f241729h) {
                    this.f241731m.P = true;
                    this.f241732n.P = false;
                } else {
                    this.f241732n.P = true;
                    this.f241731m.P = false;
                }
            }
            this.f241737s = this.f241729h;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        } else {
            boolean z17 = this.f241729h;
            if (str.equals("dark_mode")) {
                this.f241731m.P = true;
                this.f241732n.P = false;
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
            } else if (str.equals("normal_mode")) {
                this.f241731m.P = false;
                this.f241732n.P = true;
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
                r17 = 0;
            } else {
                r17 = z17;
            }
            this.f241733o = 2;
            this.f241734p = r17;
            this.f241735q = 2;
            this.f241737s = r17;
        }
        return false;
    }
}
