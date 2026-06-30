package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI */
/* loaded from: classes11.dex */
public class ActivityC17666xa5c27ea8 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f243645e = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f243646d;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi() ? com.p314xaae8f345.mm.R.xml.f576489db : com.p314xaae8f345.mm.R.xml.f576488cm;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.j2r);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f243646d = m79336x8b97809d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).h("shake_item_sound");
        if (c01.d9.b().p().l(4112, null) == null) {
            c01.d9.b().p().w(4112, java.lang.Boolean.TRUE);
        }
        c21541x1c1b08fe.O(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t1((java.lang.Boolean) c01.d9.b().p().l(4112, null)));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.j0(this));
        if (b21.q.c()) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f243646d).w("shake_item_shake_music_list");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 2 && intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                c01.d9.b().p().w(4110, java.lang.Boolean.FALSE);
                c01.d9.b().p().w(4111, stringExtra);
                db5.t7.i(this, i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.j3e), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
                return;
            }
            return;
        }
        if (intent == null) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("CropImageMode", 4);
        intent2.putExtra("CropImage_Filter", true);
        intent2.putExtra("CropImage_DirectlyIntoFilter", true);
        intent2.putExtra("CropImage_OutputPath", g83.a.a() + "custom_shake_img_filename.jpg");
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.r(intent2, 2, this, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if ("shake_item_change_bgimg".equals(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_FIRST_CHANGE_BG_IMG_BOOLEAN_SYNC;
            if (!c17.o(u3Var, false)) {
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cmh, (android.view.ViewGroup) null);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(mo55332x76847179(), 2, 0);
                z2Var.y(i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.jzb));
                z2Var.x(1);
                z2Var.F = new v61.C30646x56d4592(z2Var);
                z2Var.j(inflate);
                z2Var.C();
                c01.d9.b().p().x(u3Var, java.lang.Boolean.TRUE);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t1((java.lang.Boolean) c01.d9.b().p().l(4110, null))) {
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.h(this, 1, null);
                overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                ku5.u0 u0Var = ku5.t0.f394148d;
                y24.a aVar = new y24.a(null, 53);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.w(aVar, 100L, null);
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179(), 1, true);
                k0Var.s(com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cmi, (android.view.ViewGroup) null), false);
                k0Var.Z1 = true;
                k0Var.f293405n = new db5.o4() { // from class: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI$$a
                    @Override // db5.o4
                    /* renamed from: onCreateMMMenu */
                    public final void mo887xc459429a(db5.g4 g4Var) {
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8.f243645e;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8 activityC17666xa5c27ea8 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8.this;
                        g4Var.d(1, i65.a.d(activityC17666xa5c27ea8.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), i65.a.r(activityC17666xa5c27ea8.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574641j21));
                    }
                };
                k0Var.f293414s = new db5.t4() { // from class: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI$$b
                    @Override // db5.t4
                    /* renamed from: onMMMenuItemSelected */
                    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8.f243645e;
                        final com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8 activityC17666xa5c27ea8 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8.this;
                        activityC17666xa5c27ea8.getClass();
                        if (menuItem.getItemId() == 1) {
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC17666xa5c27ea8.mo55332x76847179(), 1, true);
                            android.widget.TextView textView = new android.widget.TextView(activityC17666xa5c27ea8.mo55332x76847179());
                            textView.setGravity(17);
                            textView.setHeight(i65.a.f(activityC17666xa5c27ea8.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj));
                            textView.setTextSize(0, i65.a.f(activityC17666xa5c27ea8.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4));
                            textView.setTextColor(i65.a.d(activityC17666xa5c27ea8.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
                            textView.setText(i65.a.r(activityC17666xa5c27ea8.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574640j20));
                            k0Var2.s(textView, false);
                            k0Var2.Z1 = true;
                            k0Var2.f293405n = new db5.o4() { // from class: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI$$c
                                @Override // db5.o4
                                /* renamed from: onCreateMMMenu */
                                public final void mo887xc459429a(db5.g4 g4Var) {
                                    int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8.f243645e;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8 activityC17666xa5c27ea82 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8.this;
                                    g4Var.d(2, i65.a.d(activityC17666xa5c27ea82.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), i65.a.r(activityC17666xa5c27ea82.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.j1z));
                                }
                            };
                            k0Var2.f293414s = new db5.t4() { // from class: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI$$d
                                @Override // db5.t4
                                /* renamed from: onMMMenuItemSelected */
                                public final void mo888x34063ac(android.view.MenuItem menuItem2, int i19) {
                                    int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8.f243645e;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8 activityC17666xa5c27ea82 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17666xa5c27ea8.this;
                                    activityC17666xa5c27ea82.getClass();
                                    if (menuItem2.getItemId() == 2) {
                                        c01.d9.b().p().w(4110, java.lang.Boolean.TRUE);
                                        db5.t7.i(activityC17666xa5c27ea82, i65.a.r(activityC17666xa5c27ea82.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.j3d), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
                                    }
                                }
                            };
                            k0Var2.v();
                        }
                    }
                };
                k0Var.v();
            }
        }
        if ("shake_item_sound".equals(str)) {
            boolean t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t1((java.lang.Boolean) c01.d9.b().p().l(4112, null));
            c01.d9.b().p().w(4112, java.lang.Boolean.valueOf(!t17));
            int i17 = t17 ? 55 : 54;
            ku5.u0 u0Var2 = ku5.t0.f394148d;
            y24.a aVar2 = new y24.a(null, i17);
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.w(aVar2, 100L, null);
        }
        if ("say_hi_list_shake_title".equals(str)) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17679x4e14a258.class);
            intent.putExtra("IntentSayHiType", 1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ku5.u0 u0Var3 = ku5.t0.f394148d;
            y24.a aVar3 = new y24.a(null, 56);
            ku5.t0 t0Var3 = (ku5.t0) u0Var3;
            t0Var3.getClass();
            t0Var3.w(aVar3, 100L, null);
        }
        if ("shake_item_histoty_list".equals(str)) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17664x1adcec2b.class);
            intent2.putExtra("_key_show_type_", 100);
            intent2.putExtra("_key_title_", getString(com.p314xaae8f345.mm.R.C30867xcad56011.j2q));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ku5.u0 u0Var4 = ku5.t0.f394148d;
            y24.a aVar4 = new y24.a(null, 57);
            ku5.t0 t0Var4 = (ku5.t0) u0Var4;
            t0Var4.getClass();
            t0Var4.w(aVar4, 100L, null);
        }
        if ("shake_msg_list".equals(str)) {
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17665xba0f5e4d.class);
            intent3.putExtra("shake_msg_from", 2);
            intent3.putExtra("shake_msg_list_title", getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3o));
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/shake/ui/ShakePersonalInfoUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ku5.u0 u0Var5 = ku5.t0.f394148d;
            y24.a aVar5 = new y24.a(null, 58);
            ku5.t0 t0Var5 = (ku5.t0) u0Var5;
            t0Var5.getClass();
            t0Var5.w(aVar5, 100L, null);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (gm0.j1.a()) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        }
        if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f243646d).h("shake_item_shake_tv_list") == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "shake_tv_list preference is null");
            return;
        }
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "ShowConfig", "showShakeTV"), 0) == 1) || x51.o1.f533591k) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f243646d).m("shake_item_shake_tv_list", true);
    }
}
