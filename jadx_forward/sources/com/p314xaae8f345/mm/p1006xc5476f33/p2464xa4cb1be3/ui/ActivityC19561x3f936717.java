package com.p314xaae8f345.mm.p1006xc5476f33.p2464xa4cb1be3.ui;

/* renamed from: com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI */
/* loaded from: classes4.dex */
public class ActivityC19561x3f936717 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f270089i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f270090d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ki6 f270091e = new r45.ki6();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f270092f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f270093g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f270094h;

    public final void V6(r45.oi6 oi6Var, h05.i iVar) {
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new h05.g(this, oi6Var, iVar));
            return;
        }
        db5.t7.m123883x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), 1).show();
        if (iVar != null) {
            iVar.a(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dib;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new h05.a(this));
        com.p314xaae8f345.mm.ui.C21390x7d9495e3 c21390x7d9495e3 = (com.p314xaae8f345.mm.ui.C21390x7d9495e3) findViewById(com.p314xaae8f345.mm.R.id.jlt);
        android.widget.TextView textView = new android.widget.TextView(this);
        this.f270094h = textView;
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.lrr);
        this.f270094h.setGravity(17);
        c21390x7d9495e3.addView(this.f270094h);
        this.f270090d = m79336x8b97809d();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.lsf);
        r45.uq3 uq3Var = new r45.uq3();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = uq3Var;
        lVar.f152200d = 1017;
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamepluginappsvr/getuserswitch";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152198b = new r45.vq3();
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new h05.e(this), false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        java.util.LinkedList linkedList = this.f270092f;
        if (linkedList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxGamePushSettingUI", "onPreferenceTreeClick, SwitchBlockList is null");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxGamePushSettingUI", "onPreferenceTreeClick, key is null");
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.oi6 oi6Var = (r45.oi6) it.next();
            java.lang.String str2 = oi6Var.f463822d;
            if (str2 == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                new r45.ji6();
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N()) {
                    oi6Var.f463823e = true;
                    V6(oi6Var, new h05.b(this, c21560x1fce98fb));
                } else {
                    oi6Var.f463823e = false;
                    V6(oi6Var, new h05.c(this, c21560x1fce98fb));
                }
            }
        }
        return false;
    }
}
