package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/plugin/exdevice/ui/r2", "com/tencent/mm/plugin/exdevice/ui/t2", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI */
/* loaded from: classes12.dex */
public final class ActivityC13467x6324ae0d extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f180806p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f180807d;

    /* renamed from: e, reason: collision with root package name */
    public p32.j f180808e;

    /* renamed from: f, reason: collision with root package name */
    public p32.n f180809f;

    /* renamed from: g, reason: collision with root package name */
    public p32.h f180810g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f180812i;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f180811h = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final int f180813m = 4660;

    /* renamed from: n, reason: collision with root package name */
    public final int f180814n = 4661;

    /* renamed from: o, reason: collision with root package name */
    public final int f180815o = 10;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a9s;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.j(kz5.q1.j(mo43419xa59964ef, z32.s.class), y32.a.class);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != this.f180813m) {
            if (i17 == this.f180814n && i18 == -1 && intent != null && intent.getBooleanExtra("KeyNeedUpdateRank", false)) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u2 u2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u2(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(u2Var, 500L, false);
                return;
            }
            return;
        }
        if (i18 != -1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
        if (P1 == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f180812i;
        if (u3Var != null) {
            u3Var.show();
        }
        this.f180810g = new p32.h(P1, null);
        gm0.j1.n().f354821b.g(this.f180810g);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.c58);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v2(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f79995xde511849, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.x2(this));
        gm0.j1.d().a(1043, this);
        gm0.j1.d().a(1777, this);
        gm0.j1.d().a(1758, this);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.lqa);
        this.f180807d = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this, 1, false));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f180807d;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI$buildItemConverts$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t2(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13467x6324ae0d.this);
                }
            }, this.f180811h, false));
        }
        this.f180808e = new p32.j(this, c01.z1.r(), "", null);
        gm0.j1.d().g(this.f180808e);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        p32.j jVar = this.f180808e;
        if (jVar != null) {
            gm0.j1.d().d(jVar);
        }
        p32.n nVar = this.f180809f;
        if (nVar != null) {
            gm0.j1.d().d(nVar);
        }
        p32.h hVar = this.f180810g;
        if (hVar != null) {
            gm0.j1.d().d(hVar);
        }
        gm0.j1.d().q(1043, this);
        gm0.j1.d().q(1777, this);
        gm0.j1.d().q(1758, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.util.ArrayList arrayList;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        java.util.LinkedList linkedList;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.f180808e);
        java.util.ArrayList arrayList2 = this.f180811h;
        int i19 = 0;
        if (b17) {
            if (i17 == 0 && i18 == 0) {
                arrayList2.clear();
                r45.rq3 rq3Var = ((z32.s) pf5.z.f435481a.a(this).a(z32.s.class)).f551470f;
                if (rq3Var != null && (linkedList = rq3Var.f466641q) != null) {
                    int i27 = 0;
                    for (java.lang.Object obj : linkedList) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.e43 e43Var = (r45.e43) obj;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e43Var);
                        arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r2(this, i27, e43Var));
                        i27 = i28;
                    }
                }
                kz5.g0.t(arrayList2, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.y2.f181260d);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f180807d;
                if (c22849x81a93d25 != null && (mo7946xf939df192 = c22849x81a93d25.mo7946xf939df19()) != null) {
                    mo7946xf939df192.m8146xced61ae5();
                }
                if (arrayList2.size() == 0) {
                    android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kci);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.kci);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.kci);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f180812i;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.ilt);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f180808e = null;
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.f180809f)) {
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f180812i;
                if (u3Var2 != null) {
                    u3Var2.dismiss();
                }
                p32.n nVar = this.f180809f;
                if (nVar != null) {
                    java.util.List recentLikeUser = nVar.f433040h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recentLikeUser, "recentLikeUser");
                    java.util.List mWechatSportFollows = nVar.f433038f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mWechatSportFollows, "mWechatSportFollows");
                    java.util.List mMyFollows = nVar.f433039g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mMyFollows, "mMyFollows");
                    android.content.Intent intent = new android.content.Intent();
                    java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(recentLikeUser, ",");
                    intent.putExtra("wechat_sport_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(mWechatSportFollows, ","));
                    intent.putExtra("wechat_sport_recent_like", c17);
                    java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(mMyFollows, ",");
                    intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572665c24));
                    intent.putExtra("list_type", 12);
                    int i29 = this.f180815o;
                    intent.putExtra("max_limit_num", i29);
                    intent.putExtra("too_many_member_tip_string", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572666c25, java.lang.Integer.valueOf(i29)));
                    intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(2, 4, 1, 131072, 128, 64, 16384));
                    intent.putExtra("always_select_contact", c18);
                    j45.l.v(this, ".ui.contact.SelectContactUI", intent, this.f180813m);
                }
            }
            this.f180809f = null;
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.f180810g)) {
            if (i17 == 0 && i18 == 0) {
                int size = arrayList2.size();
                p32.h hVar = this.f180810g;
                if (hVar != null && (arrayList = hVar.f433000g) != null) {
                    if (!(!arrayList.isEmpty())) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        for (java.lang.Object obj2 : arrayList) {
                            int i37 = i19 + 1;
                            if (i19 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            r45.e43 e43Var2 = (r45.e43) obj2;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e43Var2);
                            arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r2(this, size + i19, e43Var2));
                            i19 = i37;
                        }
                    }
                }
                kz5.g0.t(arrayList2, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.z2.f181268d);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f180807d;
                if (c22849x81a93d252 != null && (mo7946xf939df19 = c22849x81a93d252.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f180812i;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
            this.f180810g = null;
        }
    }
}
