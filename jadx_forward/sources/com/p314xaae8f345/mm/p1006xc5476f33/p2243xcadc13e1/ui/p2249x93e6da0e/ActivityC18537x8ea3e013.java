package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI */
/* loaded from: classes11.dex */
public class ActivityC18537x8ea3e013 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f253951e = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f253952d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576361a;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet(super.mo43419xa59964ef());
        hashSet.add(ir3.a.class);
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571367d2);
        this.f253952d = m79336x8b97809d();
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InviteFriendsControlFlags"), 0) & 4) > 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253952d).m("find_friends_by_invite", false);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253952d).m("find_friends_by_invite", true);
        }
        mo78530x8b45058f();
        mo54448x9c8c0d33(new gg4.l(this));
        m79340x7431e930(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        m79343x4369c36a(bool);
        m79342xb144c49e(bool);
        mo43517x10010bd5();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AddMoreFriendsUI)).Rj(this, iy1.a.AddFriend);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        gg4.i iVar = (gg4.i) m80391xac8f1cfd(gg4.i.class);
        java.lang.String prefKey = c21560x1fce98fb.f279313q;
        iVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        gg4.e eVar = new gg4.e(prefKey, iVar);
        android.os.Bundle bundle = null;
        pm0.v.K(null, eVar);
        if ("find_friends_by_qrcode".equals(c21560x1fce98fb.f279313q)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 1);
            intent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
            intent.setFlags(65536);
            intent.putExtra("key_enable_multi_code", true);
            intent.putExtra("key_scan_report_enter_scene", 12);
            intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
            intent.putExtra("key_enable_scan_code_product_merge", true);
            intent.putExtra("key_check_camera_using", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11265, 1);
            if (!iq.b.g(this) && !iq.b.x(this) && !iq.b.c(mo55332x76847179(), true)) {
                j45.l.j(this, "scanner", ".ui.BaseScanUI", intent, null);
            }
            ((ty3.e) i95.n0.c(ty3.e.class)).getClass();
            int j17 = iq.b.j();
            if (j17 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27693, java.lang.Integer.valueOf(j17), 12);
            }
            return true;
        }
        if ("find_friends_by_other_way".equals(c21560x1fce98fb.f279313q)) {
            if (r61.q0.b() != js.x0.SUCC) {
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class);
                intent2.putExtra("key_upload_scene", 6);
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, intent2);
                return true;
            }
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent3);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if ("find_friends_by_web".equals(c21560x1fce98fb.f279313q) || "find_friends_by_brand_service".equals(c21560x1fce98fb.f279313q)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContactNewFriendOa.k(mo55332x76847179(), null)) {
                return true;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.h(0)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new gg4.k(this, c21560x1fce98fb));
                c21560x1fce98fb.w(false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddMoreFriendsUI", "fts h5 template not avail");
            }
            return true;
        }
        if ("find_friends_by_radar".equals(c21560x1fce98fb.f279313q)) {
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            if (su4.r2.l()) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(this);
                return true;
            }
            j45.l.h(this, "radar", ".ui.RadarSearchUI");
            return true;
        }
        if ("find_friends_create_pwdgroup".equals(c21560x1fce98fb.f279313q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11140, 1);
            j45.l.h(this, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
            return true;
        }
        if ("find_friends_by_invite".equals(c21560x1fce98fb.f279313q)) {
            int intExtra = getIntent().getIntExtra("invite_friend_scene", 4);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14034, java.lang.Integer.valueOf(intExtra));
            android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18541xa7500d36.class);
            intent4.putExtra("Invite_friends", intExtra);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (!"find_friends_by_ww".equals(c21560x1fce98fb.f279313q)) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContactNewFriendWeWeCom.k(mo55332x76847179(), null)) {
            return true;
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
        if (!com.p314xaae8f345.mm.ui.bk.C() && !m81217xb3833cfe()) {
            bundle = android.app.ActivityOptions.makeSceneTransitionAnimation(this, new android.util.Pair[0]).toBundle();
        }
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Ai(mo55332x76847179(), ".ui.FTSAddWw", putExtra, bundle);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        boolean l17 = su4.r2.l();
        j45.l.g("brandservice");
        if (l17) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253952d).m("find_friends_by_web", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253952d).m("find_friends_by_brand_service", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253952d).m("find_friends_by_web", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253952d).m("find_friends_by_brand_service", false);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253952d).notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.C18535x77394542 c18535x77394542 = (com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.C18535x77394542) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253952d).h("find_friends_by_input");
        c18535x77394542.L = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bka);
        c18535x77394542.M = new gg4.m(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.C18534xbdd46cad) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253952d).h("find_friends_create_pwdgroup")).N = 8;
        long j17 = c01.z1.j();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddMoreFriendsUI", "${extStatus & ConstantsProtocal.MM_EXT_STATUS_QRCODE_VERIFY_CLOSE.toLong()},extstatus:$extStatus");
        if ((j17 & 2) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddMoreFriendsUI", "hide find_friends_bottom_qr_code_info");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253952d).m("find_friends_bottom_qr_code_info", true);
        } else {
            final com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.C18542x1ed6a4a4 c18542x1ed6a4a4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.C18542x1ed6a4a4) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253952d).h("find_friends_bottom_qr_code_info");
            final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.class);
            c18542x1ed6a4a4.R = new yz5.a() { // from class: gg4.j$$a
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013.f253951e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.C18542x1ed6a4a4 c18542x1ed6a4a42 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.C18542x1ed6a4a4.this;
                    c18542x1ed6a4a42.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 uic = i0Var;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uic, "uic");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeFooterPreference", "attachController to ".concat(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.class.getName()));
                    android.widget.ImageView imageView = c18542x1ed6a4a42.L;
                    if (imageView != null) {
                        uic.f242657g = imageView;
                        imageView.setOnClickListener(c18542x1ed6a4a42.Q);
                    }
                    android.view.View view = c18542x1ed6a4a42.N;
                    if (view != null) {
                        uic.f242661n = view;
                    }
                    android.widget.FrameLayout frameLayout = c18542x1ed6a4a42.P;
                    if (frameLayout != null) {
                        uic.f242663p = frameLayout;
                    }
                    uic.f242666s = false;
                    uic.Z6(false, 0);
                    return null;
                }
            };
            v24.e eVar = new v24.e(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l.f242791e, java.lang.System.currentTimeMillis());
            i0Var.getClass();
            i0Var.f242839d = eVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddMoreFriendsUI", "show ColorfulSelfQRCode GradientFgWhiteBgUIC in AddMoreFriendsUI");
            c18542x1ed6a4a4.Q = new android.view.View.OnClickListener() { // from class: gg4.j$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013.f253951e;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013 activityC18537x8ea3e013 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18537x8ea3e013.this;
                    activityC18537x8ea3e013.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC18537x8ea3e013, array);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddMoreFriendsUI", "QRCodeFooterPreference on click QRCode");
                    gg4.i iVar = (gg4.i) activityC18537x8ea3e013.m80391xac8f1cfd(gg4.i.class);
                    iVar.getClass();
                    pm0.v.K(null, new gg4.f(iVar));
                    kd0.i2 i2Var = (kd0.i2) i95.n0.c(kd0.i2.class);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = activityC18537x8ea3e013.mo55332x76847179();
                    c01.ka kaVar = new c01.ka(3);
                    ((hs.d0) i2Var).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    e04.g2.a(context, kaVar);
                    yj0.a.h(activityC18537x8ea3e013, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            };
        }
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        if (m79336x8b97809d() != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("find_friends_by_web");
            if (h17 != null) {
                h17.w(true);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("find_friends_by_brand_service");
            if (h18 != null) {
                h18.w(true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.class);
        hashSet.add(gg4.i.class);
    }
}
