package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 1)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI */
/* loaded from: classes5.dex */
public final class ActivityC17426xe0b6118f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f241957r = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f241958d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f241959e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f241960f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f241961g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f241962h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f241963i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f241964m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241965n;

    /* renamed from: o, reason: collision with root package name */
    public f25.m0 f241966o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vc f241967p = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vc(this);

    /* renamed from: q, reason: collision with root package name */
    public final boolean f241968q = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_HEARING_AID_AUTO_PLAY_SWITCH_BOOLEAN, true);

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f activityC17426xe0b6118f) {
        wd0.g1 g1Var;
        activityC17426xe0b6118f.getClass();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ce ceVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ce.f242442a;
        ((cy1.a) rVar).Hj("vocals_start_detection", "view_clk", kz5.b1.e(new jz5.l("care_session_id", ceVar.a())), 35684);
        wd0.g1 Ui = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui();
        wd0.g1 Vi = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Vi();
        wd0.g1 Zi = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Zi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidInitUI", "current select mode is " + Ui + ", " + Vi + ", " + Zi);
        if (activityC17426xe0b6118f.f241965n || (Vi == (g1Var = wd0.g1.f526246e) && Zi == g1Var)) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("enter_detection_process", kz5.c1.k(new jz5.l("enter_method_detection", 1), new jz5.l("care_session_id", ceVar.a())), 35684);
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activityC17426xe0b6118f, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa.class);
            intent.putExtra("audio_test_type", 1);
            intent.putExtra("audio_auto_play", activityC17426xe0b6118f.f241968q);
            activityC17426xe0b6118f.m78751x5dc77fb5(intent);
            return;
        }
        if (k14.t.f384910a.b()) {
            activityC17426xe0b6118f.V6(Vi, Zi);
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("download_materials", kz5.c1.k(new jz5.l("aid_process_result", 2), new jz5.l("care_session_id", ceVar.a())), 35684);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17426xe0b6118f.mo55332x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
        e4Var.f293309c = activityC17426xe0b6118f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5q);
        e4Var.f293313g = 2;
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.uc(e4Var.c(), activityC17426xe0b6118f, Vi, Zi), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }

    public final void U6() {
        wd0.g1 Ui = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui();
        android.widget.Button button = this.f241963i;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startBtn");
            throw null;
        }
        button.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5t));
        if (Ui != wd0.g1.f526246e) {
            X6(false);
            android.widget.Button button2 = this.f241963i;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startBtn");
                throw null;
            }
            button2.setVisibility(8);
            android.widget.Button button3 = this.f241964m;
            if (button3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
                throw null;
            }
            button3.setVisibility(0);
            android.widget.TextView textView = this.f241958d;
            if (textView != null) {
                textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.p0y));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
        }
        X6(true);
        android.widget.TextView textView2 = this.f241958d;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
            throw null;
        }
        textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575311p13));
        android.widget.Button button4 = this.f241963i;
        if (button4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startBtn");
            throw null;
        }
        button4.setVisibility(0);
        android.widget.Button button5 = this.f241964m;
        if (button5 != null) {
            button5.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
    }

    public final void V6(wd0.g1 g1Var, wd0.g1 g1Var2) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("current select mode is ");
        wd0.g1 g1Var3 = wd0.g1.f526246e;
        sb6.append(g1Var != g1Var3 ? g1Var.name() : g1Var2.name());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidInitUI", sb6.toString());
        intent.putExtra("audio_mode", g1Var != g1Var3 ? g1Var.name() : g1Var2.name());
        intent.putExtra("process_is_from_init", true);
        m78751x5dc77fb5(intent);
    }

    public final void W6(boolean z17, int i17) {
        if (z17) {
            android.widget.LinearLayout linearLayout = this.f241962h;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("BtnContainer");
                throw null;
            }
            linearLayout.setVisibility(0);
        }
        if (i17 == -1) {
            setResult(-1);
            finish();
        } else {
            if (i17 != 0) {
                return;
            }
            android.widget.LinearLayout linearLayout2 = this.f241962h;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("BtnContainer");
                throw null;
            }
        }
    }

    public final void X6(boolean z17) {
        if (z17) {
            android.widget.TextView textView = this.f241959e;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV");
                throw null;
            }
            textView.setVisibility(8);
            android.widget.TextView textView2 = this.f241960f;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV_1");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = this.f241961g;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV_2");
                throw null;
            }
            textView3.setVisibility(0);
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.t39);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.t3_);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.TextView textView4 = this.f241959e;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV");
            throw null;
        }
        textView4.setVisibility(0);
        android.widget.TextView textView5 = this.f241960f;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV_1");
            throw null;
        }
        textView5.setVisibility(8);
        android.widget.TextView textView6 = this.f241961g;
        if (textView6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV_2");
            throw null;
        }
        textView6.setVisibility(8);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.t39);
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.t3_);
        if (findViewById4 == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eno;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        this.f241965n = intent != null ? intent.getBooleanExtra("audio_is_reoptimize", false) : false;
        W6(intent != null ? intent.getBooleanExtra("audio_test_abandon", false) : false, i18);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        mo56583xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wc(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.odf);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.h6y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f241958d = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.cut);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f241959e = textView2;
        textView2.setVisibility(8);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.t3d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f241960f = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.t3e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f241961g = (android.widget.TextView) findViewById5;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        if (i65.a.D(mo55332x76847179)) {
            android.widget.TextView textView3 = this.f241960f;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV_1");
                throw null;
            }
            textView3.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
            android.widget.TextView textView4 = this.f241961g;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV_2");
                throw null;
            }
            textView4.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
            android.widget.TextView textView5 = this.f241959e;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV");
                throw null;
            }
            textView5.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
            android.widget.TextView textView6 = this.f241958d;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
            textView6.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561389h5) / i65.a.m(mo55332x76847179()));
            android.widget.TextView textView7 = this.f241958d;
            if (textView7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
            com.p314xaae8f345.mm.ui.kk.f(textView7, (int) (i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) * i65.a.m(mo55332x76847179())));
            android.widget.TextView textView8 = this.f241958d;
            if (textView8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
            com.p314xaae8f345.mm.ui.kk.b(textView8);
            android.widget.TextView textView9 = this.f241959e;
            if (textView9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV");
                throw null;
            }
            com.p314xaae8f345.mm.ui.kk.f(textView9, (int) (i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj) * i65.a.m(mo55332x76847179())));
            android.widget.TextView textView10 = this.f241959e;
            if (textView10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV");
                throw null;
            }
            com.p314xaae8f345.mm.ui.kk.b(textView10);
        }
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.b09);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f241962h = (android.widget.LinearLayout) findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.ngc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f241963i = (android.widget.Button) findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.b5i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f241964m = (android.widget.Button) findViewById8;
        U6();
        android.widget.Button button = this.f241963i;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startBtn");
            throw null;
        }
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yc(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidInitUI", "current select mode is " + ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui() + ", " + ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Vi() + ", " + ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Zi());
        android.widget.Button button2 = this.f241964m;
        if (button2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ad(this));
        k14.t tVar = k14.t.f384910a;
        tVar.e();
        tVar.a(v65.m.b(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ce ceVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ce.f242442a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String value = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ce.f242444c = value;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f25.m0 m0Var = this.f241966o;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.util.Objects.toString(intent);
        this.f241965n = intent != null ? intent.getBooleanExtra("audio_is_reoptimize", false) : false;
        W6(intent != null ? intent.getBooleanExtra("audio_test_abandon", false) : false, intent != null ? intent.getIntExtra("result_code", 0) : 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        U6();
        if (((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui() == wd0.g1.f526246e) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_enhance_off_page_in");
        } else {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_enhance_on_page_in");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p8.class);
    }
}
