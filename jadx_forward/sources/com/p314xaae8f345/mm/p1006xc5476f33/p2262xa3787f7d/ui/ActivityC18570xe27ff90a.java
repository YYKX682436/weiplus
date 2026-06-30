package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI */
/* loaded from: classes.dex */
public final class ActivityC18570xe27ff90a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f254343d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.f0(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f254344e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f254345f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.y(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f254346g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.x(this));

    /* renamed from: h, reason: collision with root package name */
    public boolean f254347h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f254348i;

    public final void T6() {
        if (this.f254347h) {
            return;
        }
        this.f254347h = true;
        int intExtra = getIntent().getIntExtra("intent_extra_type", Integer.MAX_VALUE);
        java.lang.String stringExtra = getIntent().getStringExtra("intent_extra_key");
        boolean z17 = ((uh4.c0) i95.n0.c(uh4.c0.class)).kf(intExtra, stringExtra) && this.f254348i;
        jz5.g gVar = vh4.c.f518591a;
        if (stringExtra == null) {
            return;
        }
        java.lang.String str = intExtra + '#' + stringExtra;
        jz5.g gVar2 = vh4.c.f518591a;
        uh4.a0 a0Var = (uh4.a0) ((java.util.Map) ((jz5.n) gVar2).mo141623x754a37bb()).get(str);
        if (a0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthorizationReqCallbackMgr", "callback bizType:" + intExtra + " bizKey:" + stringExtra + " canGoOn:" + z17);
            pm0.v.L("AuthorizationReqCallbackMgr", true, new vh4.a(a0Var, intExtra, stringExtra, z17));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cy7;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 101 && i18 == -1) {
            uh4.g0 g0Var = new uh4.g0();
            g0Var.f77356xe412923f = getIntent().getIntExtra("intent_extra_type", Integer.MAX_VALUE);
            g0Var.f77355xb4c6a6ba = getIntent().getStringExtra("intent_extra_key");
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 df6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
            g0Var.f77357x8d828e4c = df6 != null ? df6.d1() : null;
            g0Var.f77360xb1cc66b7 = c01.z1.r();
            g0Var.f77359x2261f6f2 = c01.id.c();
            wh4.j.f527545a.a().mo11260x413cb2b4(g0Var);
            ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
            this.f254348i = true;
            setResult(-1);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.z(this));
        boolean booleanExtra = getIntent().getBooleanExtra("intent_extra_can_auth", true);
        jz5.g gVar = this.f254346g;
        jz5.g gVar2 = this.f254345f;
        if (booleanExtra) {
            ((android.widget.LinearLayout) ((jz5.n) gVar2).mo141623x754a37bb()).setVisibility(0);
            ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
        } else {
            ((android.widget.LinearLayout) ((jz5.n) gVar2).mo141623x754a37bb()).setVisibility(8);
            ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
        }
        ((android.widget.RelativeLayout) ((jz5.n) this.f254343d).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a0(this));
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).df() != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) this.f254344e).mo141623x754a37bb();
            relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.d0(relativeLayout, this));
            relativeLayout.setVisibility(0);
        }
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f565291bz2)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.e0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthorizationRequestUI", "onDestroy hadCallback:" + this.f254347h);
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AuthorizationRequestUI", "onStop isFinishing:" + isFinishing());
        if (isFinishing()) {
            T6();
        }
    }
}
