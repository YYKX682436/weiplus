package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameRegionSelectUI */
/* loaded from: classes8.dex */
public class ActivityC15987x1ca24c56 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f222491d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 f222492e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f222493f;

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15987x1ca24c56 activityC15987x1ca24c56) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 p5Var = activityC15987x1ca24c56.f222492e;
        if (p5Var != null) {
            activityC15987x1ca24c56.getSharedPreferences("game_center_pref", 0).edit().putString("game_region_code", p5Var.f223248d).commit();
            r53.b.f474173a.f474181b = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.j.a().b(true, 7);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f573761fp3);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.q5(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573760fp2), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t5(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f222491d).t();
        this.f222493f = r53.b.f474173a.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.g(this);
        if (g17 != null) {
            g17.f223249e = true;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 p5Var : ((java.util.LinkedHashMap) this.f222493f).values()) {
            if (p5Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15986x88f13f21 c15986x88f13f21 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15986x88f13f21(this, null);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p5Var.f223248d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRegionPreference", "setData region error");
                } else {
                    c15986x88f13f21.L = p5Var;
                    c15986x88f13f21.C(p5Var.f223248d);
                }
                if (p5Var.f223250f) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f222491d).d(c15986x88f13f21, 0);
                } else {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f222491d).d(c15986x88f13f21, -1);
                }
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f222491d).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19(this), -1);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f222491d).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f222491d = m79336x8b97809d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        r53.d dVar = r53.b.f474173a;
        synchronized (dVar) {
            java.util.Map map = dVar.f474180a;
            if (map != null) {
                java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5) it.next()).f223249e = false;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5 p5Var;
        if (!(c21560x1fce98fb instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15986x88f13f21) || (p5Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15986x88f13f21) c21560x1fce98fb).L) == null) {
            return false;
        }
        this.f222492e = p5Var;
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f222493f).values().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p5) it.next()).f223249e = false;
        }
        p5Var.f223249e = true;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        return true;
    }
}
