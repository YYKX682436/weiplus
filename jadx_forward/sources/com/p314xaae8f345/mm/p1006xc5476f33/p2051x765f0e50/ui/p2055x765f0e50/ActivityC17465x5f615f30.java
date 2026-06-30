package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI */
/* loaded from: classes5.dex */
public class ActivityC17465x5f615f30 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f242238i = 0;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f242239d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22656xc0bc43c2 f242240e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f242241f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f242242g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f242243h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI.1
        {
            this.f39173x3fe91575 = -348375692;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 c5234x14788364) {
            am.z1 z1Var = c5234x14788364.f135568g;
            if (z1Var == null) {
                return false;
            }
            java.lang.String str = z1Var.f90037c;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30.f242238i;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30.this.T6(str);
            return false;
        }
    };

    public final void T6(java.lang.String str) {
        if (this.f242242g == null) {
            return;
        }
        if (str == null) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        }
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572112bs1);
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.b(this, str, com.p314xaae8f345.mm.R.C30856x58c7259.f559540v, string);
        if (b17 != null) {
            string = b17;
        }
        this.f242242g.setText(string);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.djl;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo78578x8b18f126(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo54448x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30.f242238i;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30 activityC17465x5f615f30 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30.this;
                activityC17465x5f615f30.mo48674x36654fab();
                activityC17465x5f615f30.finish();
                return true;
            }
        });
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById(com.p314xaae8f345.mm.R.id.qho);
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30.f242238i;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30 activityC17465x5f615f30 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30.this;
                    activityC17465x5f615f30.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC17465x5f615f30, array);
                    com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
                    c10687xa533b04c.f149354d = wd0.k2.SETTINGS_TRANSLATE_LANGUAGE;
                    c10687xa533b04c.f149357g = 1;
                    ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(activityC17465x5f615f30, c10687xa533b04c);
                    yj0.a.h(activityC17465x5f615f30, "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        this.f242239d = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById(com.p314xaae8f345.mm.R.id.ssb);
        this.f242241f = findViewById(com.p314xaae8f345.mm.R.id.u2m);
        this.f242240e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22656xc0bc43c2) findViewById(com.p314xaae8f345.mm.R.id.vbc);
        boolean booleanExtra = getIntent().getBooleanExtra("highlight_auto_translation", false);
        ((go.s) ((n13.w) i95.n0.c(n13.w.class))).getClass();
        boolean i17 = go.d.f355229a.e().i("enable_globally", false);
        if (booleanExtra) {
            android.view.View view = this.f242241f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "initAutoTranslationSwitch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "initAutoTranslationSwitch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f242241f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
            sa5.d.c(view2, 0.0f, 750L, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.in(view2), 1, null);
        } else {
            android.view.View view3 = this.f242241f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "initAutoTranslationSwitch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "initAutoTranslationSwitch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f242240e.m81497x52cfa5c6(i17);
        this.f242240e.m81499xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17468x84449eb3());
        this.f242239d.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI$$d
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view4) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30.f242238i;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30 activityC17465x5f615f30 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17465x5f615f30.this;
                activityC17465x5f615f30.getClass();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(view4);
                java.lang.Object[] array = arrayList3.toArray();
                arrayList3.clear();
                yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC17465x5f615f30, array);
                activityC17465x5f615f30.f242240e.performClick();
                yj0.a.h(activityC17465x5f615f30, "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ql9);
        if (imageView != null) {
            imageView.setColorFilter(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84), android.graphics.PorterDuff.Mode.SRC_IN);
        }
        this.f242242g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qqu);
        T6(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(this));
        this.f242243h.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f242243h.mo48814x2efc64();
        boolean booleanExtra = getIntent().getBooleanExtra("highlight_auto_translation", false);
        java.lang.String talker = getIntent().getStringExtra("from_talker");
        if (booleanExtra && this.f242240e.f293048x && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(talker)) {
            ((go.s) ((n13.w) i95.n0.c(n13.w.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
            go.d dVar = go.d.f355229a;
            if (dVar.e().i("enable_globally_sys_tip", false)) {
                return;
            }
            dVar.e().G("enable_globally_sys_tip", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoTranslationSysTipHelper", "insertSysTip talkerMap:".concat(talker));
            pm0.v.K(null, new go.e(new com.p314xaae8f345.mm.p2621x8fb0427b.f9(), talker));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(n14.p.class);
    }
}
