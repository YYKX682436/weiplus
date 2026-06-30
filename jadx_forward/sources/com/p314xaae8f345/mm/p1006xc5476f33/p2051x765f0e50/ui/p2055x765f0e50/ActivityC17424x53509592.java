package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@db5.a(m123858x6ac9171 = 1)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI */
/* loaded from: classes5.dex */
public final class ActivityC17424x53509592 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public wd0.g1 f241947d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 f241948e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.BroadcastReceiver f241949f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f241950g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f241951h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f241952i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f241953m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241954n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f241955o = true;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.enn;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        setResult(i18, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f241953m = getIntent().getBooleanExtra("process_is_from_init", false);
        this.f241954n = getIntent().getBooleanExtra("audio_auto_play", true);
        mo56583xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77751x38f99aee));
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77751x38f99aee));
        mo78530x8b45058f();
        if (this.f241953m) {
            m78560xe21cbbf(true);
            mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nc(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        } else {
            m78560xe21cbbf(false);
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.sfr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f241952i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.uqy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f241950g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.uki);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f241951h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.sfn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f241948e = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780) findViewById4;
        if (this.f241953m) {
            java.lang.String stringExtra = getIntent().getStringExtra("audio_mode");
            if (stringExtra == null) {
                stringExtra = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.f243278r.f243288e.name();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            this.f241947d = wd0.g1.m173489xdce0328(stringExtra);
            getIntent().getStringExtra("audio_mode");
            android.widget.TextView textView = this.f241952i;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                throw null;
            }
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5i));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f241950g;
            if (c22661xa3a2b3c0 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBtn");
                throw null;
            }
            c22661xa3a2b3c0.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5h));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = this.f241951h;
            if (c22661xa3a2b3c02 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retestBtn");
                throw null;
            }
            c22661xa3a2b3c02.setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573809o60));
        } else {
            java.lang.String stringExtra2 = getIntent().getStringExtra("audio_mode_name");
            if (stringExtra2 == null) {
                stringExtra2 = "TEST2_NONE";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd m69103xdce0328 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xd.m69103xdce0328(stringExtra2);
            java.util.Objects.toString(m69103xdce0328.f243288e);
            this.f241947d = m69103xdce0328.f243288e;
            ((u14.w) ((wd0.a2) i95.n0.c(wd0.a2.class))).getClass();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd780 = this.f241948e;
        if (c17422xce8bd780 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView");
            throw null;
        }
        if (this.f241953m) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.p0q);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            c17422xce8bd780.m68976x764daa0d(string);
            wd0.g1 g1Var = this.f241947d;
            if (g1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finalMode");
                throw null;
            }
            c17422xce8bd780.m68980x22dcbf1d(wd0.h1.m173495xdce0328(g1Var.name()).f526258d);
        } else {
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            c17422xce8bd780.m68976x764daa0d(string2);
            wd0.g1 g1Var2 = this.f241947d;
            if (g1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finalMode");
                throw null;
            }
            c17422xce8bd780.m68980x22dcbf1d(g1Var2.f526253d);
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7802 = this.f241948e;
            if (c17422xce8bd7802 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView");
                throw null;
            }
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) c17422xce8bd7802.findViewById(com.p314xaae8f345.mm.R.id.sfl);
            c1073x7e08a787.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cs6);
            ((android.widget.TextView) c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.a76)).setTextColor(android.graphics.Color.parseColor("#8C000000"));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7803 = this.f241948e;
        if (c17422xce8bd7803 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView");
            throw null;
        }
        c17422xce8bd7803.setClickable(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7804 = this.f241948e;
        if (c17422xce8bd7804 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView");
            throw null;
        }
        c17422xce8bd7804.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.oc(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c03 = this.f241950g;
        if (c22661xa3a2b3c03 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBtn");
            throw null;
        }
        c22661xa3a2b3c03.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.pc(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c04 = this.f241951h;
        if (c22661xa3a2b3c04 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retestBtn");
            throw null;
        }
        c22661xa3a2b3c04.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qc(this));
        android.widget.TextView textView2 = this.f241952i;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.s0(textView2.getPaint());
        android.widget.TextView textView3 = this.f241952i;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        textView3.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.anm) * i65.a.m(mo55332x76847179()));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c05 = this.f241950g;
        if (c22661xa3a2b3c05 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBtn");
            throw null;
        }
        c22661xa3a2b3c05.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c06 = this.f241951h;
        if (c22661xa3a2b3c06 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retestBtn");
            throw null;
        }
        c22661xa3a2b3c06.setTextSize(0, i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(mo55332x76847179()));
        if (((android.media.AudioManager) ((jz5.n) ((u14.w) ((wd0.a2) i95.n0.c(wd0.a2.class))).f505330d).mo141623x754a37bb()).getStreamVolume(3) == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rc(this));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd7805 = this.f241948e;
            if (c17422xce8bd7805 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView");
                throw null;
            }
            c17422xce8bd7805.a(false);
        }
        if (this.f241953m) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_reuse_page_in");
            return;
        }
        wd0.g1 g1Var3 = this.f241947d;
        if (g1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finalMode");
            throw null;
        }
        if (g1Var3 == wd0.g1.f526247f) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_normal_page_in");
        } else {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_mode_page_in");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b4.d a17 = b4.d.a(this);
        android.content.BroadcastReceiver broadcastReceiver = this.f241949f;
        if (broadcastReceiver != null) {
            a17.d(broadcastReceiver);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("receiver");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (i17 == 4) {
            return false;
        }
        return super.onKeyDown(i17, event);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd780 = this.f241948e;
        if (c17422xce8bd780 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView");
            throw null;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780.f241925v;
        c17422xce8bd780.b(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f241949f = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI$onResume$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                boolean booleanExtra = intent != null ? intent.getBooleanExtra("isGetFocus", false) : false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x53509592 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592.this;
                activityC17424x53509592.f241955o = booleanExtra;
                if (activityC17424x53509592.f241955o) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780 c17422xce8bd780 = activityC17424x53509592.f241948e;
                if (c17422xce8bd780 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView");
                    throw null;
                }
                if (c17422xce8bd780.isPlaying) {
                    if (c17422xce8bd780 != null) {
                        c17422xce8bd780.b(true);
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("audioCardView");
                        throw null;
                    }
                }
            }
        };
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("hearing_aid_message");
        b4.d a17 = b4.d.a(this);
        android.content.BroadcastReceiver broadcastReceiver = this.f241949f;
        if (broadcastReceiver != null) {
            a17.b(broadcastReceiver, intentFilter);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("receiver");
            throw null;
        }
    }
}
