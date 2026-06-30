package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

@db5.a(m123858x6ac9171 = 1)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro */
/* loaded from: classes.dex */
public final class ActivityC18578x68ca6165 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f254365s = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254366d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f254367e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f254368f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f254369g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f254370h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f254371i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f254372m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f254373n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f254374o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f254375p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f254376q = true;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f254377r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.j3(this));

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.enu;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return super.mo43419xa59964ef();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str = "";
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f78238xaeb5384d);
        this.f254369g = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c01.e2.a0();
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.vct);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f254374o = textView;
        com.p314xaae8f345.mm.ui.fk.b(textView);
        if (this.f254371i) {
            android.widget.TextView textView2 = this.f254374o;
            if (textView2 != null) {
                textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.olb));
            }
        } else if (this.f254372m) {
            android.widget.TextView textView3 = this.f254374o;
            if (textView3 != null) {
                textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574866ol5));
            }
        } else if (this.f254376q) {
            android.widget.TextView textView4 = this.f254374o;
            if (textView4 != null) {
                textView4.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.okz));
            }
        } else {
            android.widget.TextView textView5 = this.f254374o;
            if (textView5 != null) {
                textView5.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.oll));
            }
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.nzu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f254366d = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.vcr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        this.f254367e = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.vcn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        this.f254368f = (android.widget.TextView) findViewById5;
        android.widget.TextView textView6 = this.f254367e;
        if (textView6 != null) {
            int P3 = ((uh4.c0) i95.n0.c(uh4.c0.class)).P3(mo55332x76847179());
            if (P3 == 1) {
                str = "0~2 岁";
            } else if (P3 == 2) {
                str = "3~7 岁";
            } else if (P3 == 3) {
                str = "8~11 岁";
            } else if (P3 == 4) {
                str = "12~15 岁";
            } else if (P3 == 5) {
                str = "16~17 岁";
            }
            textView6.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.old, str));
        }
        if (this.f254371i) {
            android.widget.TextView textView7 = this.f254368f;
            if (textView7 != null) {
                textView7.setVisibility(0);
            }
            if (this.f254373n) {
                android.widget.TextView textView8 = this.f254367e;
                if (textView8 != null) {
                    textView8.setVisibility(0);
                }
                android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.vco);
                if (findViewById6 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById6, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById6, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.vcp);
                if (findViewById7 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById7, arrayList3.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById7.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById7, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.widget.TextView textView9 = this.f254366d;
                if (textView9 != null) {
                    textView9.setGravity(17);
                }
                android.widget.TextView textView10 = this.f254367e;
                if (textView10 != null) {
                    textView10.setVisibility(8);
                }
                android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.vco);
                if (findViewById8 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById8, arrayList4.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById8.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById8, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.vcp);
                if (findViewById9 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById9, arrayList5.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById9.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById9, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            android.widget.TextView textView11 = this.f254368f;
            if (textView11 != null) {
                textView11.setVisibility(4);
            }
        }
        if (this.f254371i) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.oli);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.oli);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            int P = r26.n0.P(string, string2, 0, false, 6, null);
            if (P < 0) {
                return;
            }
            int length = string2.length() + P;
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.g3(this), P, length, 18);
            android.widget.TextView textView12 = this.f254368f;
            if (textView12 != null) {
                textView12.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
            }
            android.widget.TextView textView13 = this.f254368f;
            if (textView13 != null) {
                textView13.setClickable(true);
            }
            android.widget.TextView textView14 = this.f254368f;
            if (textView14 != null) {
                textView14.setText(spannableStringBuilder);
            }
        } else {
            if (this.f254372m) {
                android.widget.TextView textView15 = this.f254366d;
                if (textView15 != null) {
                    textView15.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.olh));
                }
                android.widget.TextView textView16 = this.f254366d;
                if (textView16 != null) {
                    textView16.setGravity(17);
                }
            } else {
                android.widget.TextView textView17 = this.f254366d;
                if (textView17 != null) {
                    textView17.setVisibility(8);
                }
            }
            android.widget.TextView textView18 = this.f254367e;
            if (textView18 != null) {
                textView18.setVisibility(8);
            }
            android.widget.TextView textView19 = this.f254368f;
            if (textView19 != null) {
                textView19.setVisibility(4);
            }
        }
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.vcy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById10, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button = (android.widget.Button) findViewById10;
        this.f254375p = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.h3(this));
        if (this.f254371i || !this.f254372m) {
            android.widget.Button button2 = this.f254375p;
            if (button2 != null) {
                button2.setVisibility(8);
            }
        } else {
            android.widget.Button button3 = this.f254375p;
            if (button3 != null) {
                button3.setVisibility(0);
            }
        }
        android.view.View findViewById11 = findViewById(com.p314xaae8f345.mm.R.id.nzr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById11, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button4 = (android.widget.Button) findViewById11;
        this.f254370h = button4;
        if (this.f254372m) {
            button4.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ol6));
        } else if (this.f254371i) {
            button4.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.olf));
        } else {
            button4.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.olf));
            ((uh4.c0) i95.n0.c(uh4.c0.class)).C5();
            uh4.c0.m168057xb411027f().T(36);
        }
        android.widget.Button button5 = this.f254370h;
        if (button5 != null) {
            com.p314xaae8f345.mm.ui.fk.a(button5);
        }
        android.widget.Button button6 = this.f254370h;
        if (button6 != null) {
            button6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.i3(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if ((i17 == 100 && i18 == -1) || (i17 == 101 && i18 == -1)) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).C5();
            uh4.c0.m168057xb411027f().T(36);
            android.content.Intent intent2 = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18578x68ca6165.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a6 a6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a6();
            a6Var.o(false);
            intent2.putExtra("IntentKey_TeenModeIntroData", a6Var.m126747x696739c());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1, com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
        super.onCreate(bundle);
        java.lang.String str = "";
        mo54450xbf7c1df6("");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_NEED_NOTICE_STATE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        jz5.g gVar = this.f254377r;
        this.f254371i = ((com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a6) ((jz5.n) gVar).mo141623x754a37bb()).n();
        this.f254372m = uh4.c0.m168057xb411027f().mo168058x74219ae7() && !uh4.c0.m168057xb411027f().Yd();
        this.f254376q = ((com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a6) ((jz5.n) gVar).mo141623x754a37bb()).j();
        this.f254373n = ((com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a6) ((jz5.n) gVar).mo141623x754a37bb()).l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenMode.SettingsSysTeenModeIntro", "[" + hashCode() + "]isSysTeenModeOpen: " + this.f254371i + ", isTeenModeManualOpen: " + this.f254372m + ", isCloseWithSys: " + this.f254376q + ", isSysAgeChanged: " + this.f254373n);
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a6) ((jz5.n) gVar).mo141623x754a37bb()).k()) {
            mo43517x10010bd5();
            if (this.f254371i) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).K4();
                return;
            }
            return;
        }
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f78238xaeb5384d);
        this.f254369g = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initAgeChangeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initAgeChangeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c01.e2.a0();
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.vct);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f254374o = textView;
        com.p314xaae8f345.mm.ui.fk.b(textView);
        android.widget.TextView textView2 = this.f254374o;
        if (textView2 != null) {
            int P3 = ((uh4.c0) i95.n0.c(uh4.c0.class)).P3(mo55332x76847179());
            if (P3 == 1) {
                str = "0~2 岁";
            } else if (P3 == 2) {
                str = "3~7 岁";
            } else if (P3 == 3) {
                str = "8~11 岁";
            } else if (P3 == 4) {
                str = "12~15 岁";
            } else if (P3 == 5) {
                str = "16~17 岁";
            }
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ole, str));
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.nzr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById3, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button = (android.widget.Button) findViewById3;
        this.f254370h = button;
        button.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.olf));
        android.widget.Button button2 = this.f254370h;
        if (button2 != null) {
            button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.f3(this));
        }
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.nzu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f254366d = textView3;
        textView3.setVisibility(8);
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.vcr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f254367e = textView4;
        textView4.setVisibility(8);
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.vcp);
        if (findViewById6 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById6, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initAgeChangeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro", "initAgeChangeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.vcy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById7, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button3 = (android.widget.Button) findViewById7;
        this.f254375p = button3;
        button3.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenMode.SettingsSysTeenModeIntro", "onDestroy: triggerSync");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().h(7);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
    }
}
