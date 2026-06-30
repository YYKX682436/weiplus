package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainEmoticon;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainEmoticon */
/* loaded from: classes10.dex */
public final class ActivityC18585xdf1eb87f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f254413d = "MicroMsg.SettingsTeenModeMainEmoticon";

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254414e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254415f;

    /* renamed from: g, reason: collision with root package name */
    public int f254416g;

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18585xdf1eb87f activityC18585xdf1eb87f, int i17) {
        int i18 = activityC18585xdf1eb87f.f254416g;
        java.lang.String str = activityC18585xdf1eb87f.f254413d;
        if (i18 == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "no update, no need data report");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int i19 = activityC18585xdf1eb87f.f254416g;
        java.lang.String str2 = "Block";
        java.lang.String str3 = i19 != 0 ? i19 != 1 ? i19 != 2 ? "" : "Block" : "Allow" : "Limited";
        if (i17 == 0) {
            str2 = "Limited";
        } else if (i17 == 1) {
            str2 = "Allow";
        } else if (i17 != 2) {
            str2 = "";
        }
        g0Var.d(20917, 3, 1, 1, "Emoticon", str3, str2, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "data report ");
    }

    public final void U6() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o0g);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qgr);
        textView.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsy));
        textView2.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ls9));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f254414e;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f254415f;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(8);
        }
        int i17 = this.f254416g;
        if (i17 == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f254415f;
            if (c22699x3dcdb3523 != null) {
                c22699x3dcdb3523.setVisibility(0);
            }
            textView2.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574867js0) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.ls9));
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f254414e;
            if (c22699x3dcdb3524 != null) {
                c22699x3dcdb3524.setVisibility(0);
            }
            textView.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574867js0) + getString(com.p314xaae8f345.mm.R.C30867xcad56011.jsy));
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_EMOTICON_RANGE_INT_SYNC, java.lang.Integer.valueOf(this.f254416g));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.did;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qgq);
        this.f254415f = findViewById instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById : null;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.o0f);
        this.f254414e = findViewById2 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2 : null;
        this.f254416g = ((uh4.c0) i95.n0.c(uh4.c0.class)).ag();
        U6();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f254415f;
        java.lang.Object parent = c22699x3dcdb352 != null ? c22699x3dcdb352.getParent() : null;
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.b5(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f254414e;
        java.lang.Object parent2 = c22699x3dcdb3522 != null ? c22699x3dcdb3522.getParent() : null;
        android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
        if (view2 != null) {
            view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.c5(this));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.d5(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r45.yk6 yk6Var = new r45.yk6();
        yk6Var.f472719d = this.f254416g;
        yk6Var.f472721f = ((vh4.t1) i95.n0.c(vh4.t1.class)).f518672i;
        ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(232, yk6Var));
        ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
    }
}
