package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI */
/* loaded from: classes9.dex */
public final class ActivityC16762xf11130c5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.ref.WeakReference f234018q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.ref.WeakReference f234019r;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.ref.WeakReference f234020s;

    /* renamed from: d, reason: collision with root package name */
    public int f234021d = 1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f234022e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f234023f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f234024g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f234025h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f234026i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f234027m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f234028n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f234029o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f234030p;

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5 activityC16762xf11130c5) {
        int i17 = activityC16762xf11130c5.f234021d;
        boolean z17 = true;
        if (i17 != 1) {
            if (i17 != 2) {
                yo3.b.b("offlinePayShortcutGuideStep3ConfirmClick", 1);
                activityC16762xf11130c5.finish();
                return;
            }
            yo3.b.b("offlinePayShortcutGuideStep2AddClick", 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "addShortcut: requesting system to pin shortcut");
            f234020s = new java.lang.ref.WeakReference(activityC16762xf11130c5);
            yo3.b.f545676a = new java.lang.ref.WeakReference(activityC16762xf11130c5);
            yo3.b.a(activityC16762xf11130c5);
            return;
        }
        yo3.b.b("offlinePayShortcutGuideStep1SettingClick", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "jumpToAppSettings");
        activityC16762xf11130c5.f234022e = true;
        try {
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            l34.i iVar = l34.i.f396969b;
            if (iVar.b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutService", "jumpToShortcutPermissionSettingPage: vendor page");
                iVar.c(activityC16762xf11130c5);
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "jumpToAppSettings: fallback to ACTION_APPLICATION_DETAILS_SETTINGS");
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(android.net.Uri.parse("package:" + activityC16762xf11130c5.getPackageName()));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC16762xf11130c5, arrayList.toArray(), "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI", "jumpToAppSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16762xf11130c5.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC16762xf11130c5, "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI", "jumpToAppSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflinePayShortcutGuideUI", "jumpToAppSettings failed: %s", e17.getMessage());
            activityC16762xf11130c5.U6();
        }
    }

    public final void U6() {
        this.f234021d = 2;
        android.view.View view = this.f234023f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep1Dot");
            throw null;
        }
        V6(view, 16);
        android.view.View view2 = this.f234023f;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep1Dot");
            throw null;
        }
        view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d7g);
        android.view.View view3 = this.f234024g;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep2Dot");
            throw null;
        }
        view3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d7f);
        android.view.View view4 = this.f234025h;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStepLine");
            throw null;
        }
        view4.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        android.widget.TextView textView = this.f234026i;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep1Text");
            throw null;
        }
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.pg6);
        android.widget.TextView textView2 = this.f234026i;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep1Text");
            throw null;
        }
        textView2.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        android.widget.TextView textView3 = this.f234028n;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGuideTitle");
            throw null;
        }
        textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575404pg1);
        android.widget.Button button = this.f234029o;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGuideBtn");
            throw null;
        }
        button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575403pg0);
        yo3.b.b("offlinePayShortcutGuideStep2Show", 2);
    }

    public final void V6(android.view.View view, int i17) {
        int i18 = (int) ((i17 * getResources().getDisplayMetrics().density) + 0.5f);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i18;
        layoutParams.height = i18;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.elg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        mo64405x4dab7448(color);
        getWindow().setStatusBarColor(color);
        mo54450xbf7c1df6("");
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.aa8)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.g1(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.v_z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f234023f = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f568638va1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f234024g = findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f568641va4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f234025h = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f568637va0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f234026i = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f568639va2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f234027m = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.r__);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f234028n = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.u0n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f234029o = (android.widget.Button) findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.f566732u14);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f234030p = (android.widget.TextView) findViewById8;
        android.widget.Button button = this.f234029o;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGuideBtn");
            throw null;
        }
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.h1(this));
        android.widget.TextView textView = this.f234030p;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGuideFaq");
            throw null;
        }
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.i1(this));
        this.f234021d = 1;
        android.view.View view = this.f234023f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep1Dot");
            throw null;
        }
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d7f);
        android.view.View view2 = this.f234024g;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep2Dot");
            throw null;
        }
        view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d7h);
        android.view.View view3 = this.f234025h;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStepLine");
            throw null;
        }
        view3.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        android.widget.TextView textView2 = this.f234026i;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep1Text");
            throw null;
        }
        textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.pg7);
        android.widget.TextView textView3 = this.f234028n;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGuideTitle");
            throw null;
        }
        textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575408pg5);
        android.widget.Button button2 = this.f234029o;
        if (button2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGuideBtn");
            throw null;
        }
        button2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575407pg4);
        yo3.b.b("offlinePayShortcutGuideStep1Show", 2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.lang.ref.WeakReference weakReference = f234020s;
        if ((weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5) weakReference.get() : null) == this) {
            f234020s = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f234022e && this.f234021d == 1) {
            ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
            ae0.e eVar = ae0.e.OTHER;
            ((zd0.e) hVar).getClass();
            int i17 = xp1.d.i(this, null, true, eVar, new zd0.C30835x2e755c()).f84912a;
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "checkPermissionAndProceed: permission denied, stay at step 1");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "checkPermissionAndProceed: permission status=%d, go to step 2", java.lang.Integer.valueOf(i17));
                U6();
            }
        }
    }
}
