package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI */
/* loaded from: classes5.dex */
public class ActivityC17441xe7fa79c extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f242079d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f242080e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f242081f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f242082g = "";

    @Override // ck5.e
    public void R5(java.lang.String str) {
        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.it9, com.p314xaae8f345.mm.R.C30867xcad56011.itb);
    }

    @Override // ck5.e
    public void c1(java.lang.String text) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsModifyNameUI", "Set New NickName : " + text);
        this.f242080e = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcr), false, false, null);
        if (this.f242081f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsModifyNameUI", "updateChatBotRemarkName " + text);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f242082g, true).n1(text);
            r45.r26 r26Var = new r45.r26();
            r26Var.set(0, this.f242082g);
            r26Var.set(1, text);
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).d(new xg3.a(24, 3, r26Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ni(this), null);
            return;
        }
        v14.v vVar = (v14.v) pf5.z.f435481a.a(this).a(v14.v.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 dialog = this.f242080e;
        vVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = vVar.f514120d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        vVar.f514120d = dialog;
        vVar.f514121e = text;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).e(new e21.s(text, 1));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cls;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        boolean z17 = this.f242081f;
        int i17 = !z17 ? 1 : 0;
        if (z17) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.phr);
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568405mq2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.it8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.f568404mq1);
        this.f242079d = c22621x7603e017;
        if (this.f242081f) {
            this.f242079d.setText(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f242082g, true).g2());
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(4, null);
            float textSize = this.f242079d.getTextSize();
            ((ke0.e) xVar).getClass();
            c22621x7603e017.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str, textSize));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f242079d;
        c22621x7603e0172.mo81549xf579a34a(c22621x7603e0172.getText().length());
        this.f242079d.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ki(this));
        ck5.f b17 = ck5.f.b(this.f242079d);
        b17.f124094f = i17;
        b17.f124093e = 32;
        b17.f124089a = false;
        b17.d(null);
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572080y6), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.li(this, i17), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78501x43e00957(false);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mi(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f242081f = getIntent().getBooleanExtra("FROM_CHATBOT", false);
        java.lang.String stringExtra = getIntent().getStringExtra("CHATBOT_USERNAME");
        this.f242082g = stringExtra;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f242082g = stringExtra;
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(v14.v.class);
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.it_, com.p314xaae8f345.mm.R.C30867xcad56011.itb);
    }
}
