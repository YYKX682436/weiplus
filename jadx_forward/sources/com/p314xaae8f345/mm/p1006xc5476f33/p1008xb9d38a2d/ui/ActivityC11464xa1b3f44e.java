package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifySelectUI */
/* loaded from: classes11.dex */
public class ActivityC11464xa1b3f44e extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f155150d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3[] f155151e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155152f;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3[] V6() {
        java.lang.String[] split = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahq).trim().split(",");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3[] f3VarArr = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3[split.length];
        for (int i17 = 0; i17 < split.length; i17++) {
            java.lang.String[] split2 = split[i17].trim().split(":");
            f3VarArr[i17] = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3(split2[1], split2[2], split2[0], false);
        }
        return f3VarArr;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569738kf;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo48674x36654fab();
        this.f155152f = getIntent().getExtras().getString("voice_verify_code");
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ahw);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.hg(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3[] V6 = V6();
        this.f155151e = V6;
        if (V6.length <= 0) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f155150d).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f155150d).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19(this), -1);
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f3 f3Var : this.f155151e) {
            if (f3Var.f155373c.equalsIgnoreCase(this.f155152f)) {
                f3Var.f155374d = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73 c11407x90269a73 = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11407x90269a73(this, null);
            c11407x90269a73.M(f3Var);
            c11407x90269a73.C(f3Var.f155373c);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f155150d).d(c11407x90269a73, -1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f155150d = m79336x8b97809d();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
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
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("voice_verify_language", f3Var.f155371a);
        bundle.putString("voice_verify_code", f3Var.f155373c);
        intent.putExtras(bundle);
        setResult(0, intent);
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }
}
