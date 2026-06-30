package com.p314xaae8f345.mm.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.ui.LauncherUI */
/* loaded from: classes11.dex */
public class ActivityC21387x976b8e54 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17354xafef217a {

    /* renamed from: chattingTabUI */
    private com.p314xaae8f345.mm.ui.C21427xe5bb8a3 f39300xb2a14a43;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f278361h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5752x57872345>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.ui.LauncherUI.1
        {
            this.f39173x3fe91575 = -1684644523;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5752x57872345 c5752x57872345) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "enterChattingUIEventIListener execute");
            android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
            intent.putExtra("nofification_type", "new_msg_nofification");
            intent.putExtra("Main_User", c5752x57872345.f136073g.f88783a);
            intent.putExtra("talkerCount", 1);
            intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
            intent.addFlags(67108864);
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54 = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.this;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC21387x976b8e54, arrayList.toArray(), "com/tencent/mm/ui/LauncherUI$1", "callback", "(Lcom/tencent/mm/autogen/events/NotifyEnterChattingEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC21387x976b8e54.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC21387x976b8e54, "com/tencent/mm/ui/LauncherUI$1", "callback", "(Lcom/tencent/mm/autogen/events/NotifyEnterChattingEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.C21374x812c2fd3 f278362i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.z8 f278363m;

    /* renamed from: n, reason: collision with root package name */
    public android.content.Intent f278364n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f278365o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f278366p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f278367q;

    /* renamed from: r, reason: collision with root package name */
    public qg0.y f278368r;

    /* renamed from: s, reason: collision with root package name */
    public final o25.n2 f278369s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f278370t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f278371u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f278372v;

    /* renamed from: w, reason: collision with root package name */
    public int f278373w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f278374x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.ArrayList f278359y = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.ArrayList f278360z = new java.util.ArrayList();
    public static boolean A = true;
    public static boolean B = false;
    public static java.lang.Boolean C = null;

    public ActivityC21387x976b8e54() {
        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = new com.p314xaae8f345.mm.ui.C21374x812c2fd3();
        this.f278362i = c21374x812c2fd3;
        this.f39300xb2a14a43 = new com.p314xaae8f345.mm.ui.C21427xe5bb8a3(c21374x812c2fd3);
        this.f278363m = new com.p314xaae8f345.mm.ui.z8();
        this.f278364n = null;
        this.f278365o = false;
        this.f278366p = false;
        this.f278367q = false;
        this.f278369s = new o25.n2("MicroMsg.LauncherUI");
        this.f278370t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f278371u = new com.p314xaae8f345.mm.ui.l8(this);
        this.f278372v = false;
        this.f278373w = 0;
        this.f278374x = false;
    }

    /* renamed from: getCurrentTabIndex */
    public static int m78442x336b58a0() {
        if (m78443x9cf0d20b() == null || m78443x9cf0d20b().m78446x1cde66a9() == null || m78443x9cf0d20b().m78446x1cde66a9().m78421xefd35ffa() == null) {
            return -1;
        }
        return m78443x9cf0d20b().m78446x1cde66a9().m78421xefd35ffa().f278458e;
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b() {
        java.util.ArrayList arrayList = f278359y;
        if (!arrayList.isEmpty()) {
            return (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) arrayList.get(0);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI", "LauncherUI instances should not be empty. %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return null;
    }

    public static void n7(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
        intent.addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/LauncherUI", "startMainTabUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/LauncherUI", "startMainTabUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8
    public boolean W6() {
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3;
        if (C == null) {
            C = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.d0());
        }
        return (!C.booleanValue() || (c21427xe5bb8a3 = this.f39300xb2a14a43) == null) ? !C.booleanValue() : c21427xe5bb8a3.k();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8
    public void X6() {
        super.X6();
        if (this.f278365o) {
            this.f39300xb2a14a43.o(true, 0);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.huh);
        if (viewGroup != null) {
            viewGroup.setImportantForAccessibility(1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8
    public void Y6() {
        android.widget.ImageView imageView;
        if (!this.f39300xb2a14a43.k() && (imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.l3_)) != null && imageView.getDrawable() != null) {
            imageView.setImageDrawable(null);
        }
        if (this.f278365o) {
            this.f39300xb2a14a43.o(false, 0);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.huh);
        if (viewGroup == null || com.p314xaae8f345.mm.ui.bk.y()) {
            return;
        }
        viewGroup.setImportantForAccessibility(4);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8
    public void Z6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "onVASEnter hasPauseByVASEnter:%s", java.lang.Boolean.valueOf(this.f278374x));
        if (m78442x336b58a0() == 2) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3.f186948f);
        }
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f39300xb2a14a43;
        if (c21427xe5bb8a3 == null || !c21427xe5bb8a3.k()) {
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 mo78445x6b9fafe7 = mo78445x6b9fafe7();
        if (mo78445x6b9fafe7 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "onVASEnter!! chatting onPause");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) mo78445x6b9fafe7;
            abstractC21611x7536149b.l0();
            abstractC21611x7536149b.o0();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5832xc2fc331e c5832xc2fc331e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5832xc2fc331e();
            c5832xc2fc331e.f136139g.f90127a = false;
            c5832xc2fc331e.e();
            abstractC21611x7536149b.f279685f.f542247i = false;
            this.f278374x = true;
            this.f39300xb2a14a43.i(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8
    public void a7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "onVASExit hasPauseByVASEnter:%s", java.lang.Boolean.valueOf(this.f278374x));
        m78446x1cde66a9().t();
        if (this.f278374x) {
            if (this.f39300xb2a14a43 != null) {
                com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 mo78445x6b9fafe7 = mo78445x6b9fafe7();
                if (mo78445x6b9fafe7 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) mo78445x6b9fafe7;
                    boolean z17 = abstractC21611x7536149b.f279685f.f542247i;
                    boolean z18 = !mo78538xecd98af8();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "onVASExit!! try chatting onResume isForeground:%s isActivityForeground:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
                    if (!z17) {
                        abstractC21611x7536149b.f279685f.f542247i = true;
                        if (z18) {
                            abstractC21611x7536149b.n0();
                            abstractC21611x7536149b.m0();
                            this.f39300xb2a14a43.i(true);
                        }
                    }
                }
            }
            this.f278374x = false;
        }
        if (m78442x336b58a0() == 2) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3.f186948f;
            c61.l7 l7Var = (c61.l7) b6Var;
            l7Var.getClass();
            l7Var.nk().r(b3Var, null);
        }
        com.p314xaae8f345.mm.ui.he heVar = m78446x1cde66a9().f278294t.f278455b;
        heVar.getClass();
        nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.ue(heVar, null));
        zy2.ka kaVar = heVar.f290398f;
        if (kaVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g) kaVar).f187066g.mo48813x58998cd();
            zy2.ia.n0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "Discovery", null, 2, null);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1) ((zy2.e9) i95.n0.c(zy2.e9.class))).Ri();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16712xf1541050
    /* renamed from: b7 */
    public boolean getF233589g() {
        xn5.q0.a();
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20019x86db4970()) == 1;
    }

    public final void c7() {
        if (!gm0.j1.b().m()) {
            if (gm0.j1.b().n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "[whatsnew] account not initiate, skip whatsnew.");
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "[whatsnew] not login yet, skip.");
                return;
            }
        }
        android.content.Intent intent = this.f278364n;
        if (!((intent == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(intent, "Intro_Switch", false) || !c01.d9.h() || gm0.m.r()) ? false : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "[whatsnew] notSwitchOrHold is false, skip whatsnew.");
            return;
        }
        boolean c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(getIntent(), "LauncherUI.enter_from_reg", false);
        boolean g17 = la5.b.f399133a.g(true);
        k35.o oVar = k35.p.f385476a;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(c17);
        objArr[1] = java.lang.Boolean.valueOf(gm0.j1.a());
        objArr[2] = java.lang.Boolean.valueOf(oVar == null);
        objArr[3] = java.lang.Boolean.FALSE;
        objArr[4] = java.lang.Boolean.valueOf(g17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "[whatsnew] do not show whatsnew. enter_from_reg=%s accHasReady=%s MMAppMgr is null %s isWhatsNewAvailable=%s, isAccessibilityEnabled=%s", objArr);
    }

    /* renamed from: closeChatting */
    public void m78444xa05a445e(boolean z17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar;
        if (this.f39300xb2a14a43.f(z17)) {
            boolean mo26090x345d1387 = this.f39300xb2a14a43.f278560n.mo26090x345d1387();
            com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = this.f278362i;
            if (!mo26090x345d1387) {
                c21374x812c2fd3.m();
            }
            c21374x812c2fd3.f278291q.mo2548x55429c53();
            java.lang.String str = null;
            if (c01.z1.H().booleanValue()) {
                if (gm0.j1.a()) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340227, null)));
                    if (!valueOf.booleanValue() && !com.p314xaae8f345.mm.ui.p2690x38b72420.a4.f288112n.booleanValue()) {
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0 = java.lang.Boolean.TRUE;
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c01.d9.b().p().l(340240, null), 0L);
                    java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340230, null)));
                    java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340228, null)));
                    java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340229, null)));
                    if (valueOf.booleanValue() && valueOf3.booleanValue() && valueOf4.booleanValue() && !valueOf2.booleanValue() && currentTimeMillis >= 432000000) {
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278272b0 = java.lang.Boolean.TRUE;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.HomeUI", "mmcore has not ready");
                }
            }
            com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = c21374x812c2fd3.f278294t;
            if (c21410x67d80e90.f278458e == 0 && gm0.j1.n().f354821b.f152304n) {
                ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(true);
            } else {
                ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(false);
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) c21410x67d80e90.f278454a.findViewById(com.p314xaae8f345.mm.R.id.huh);
            if (viewGroup != null) {
                viewGroup.setImportantForAccessibility(1);
            }
            java.util.HashMap hashMap = c21410x67d80e90.f278468o;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) hashMap.get(0);
            if (c22376x88ed722d != null) {
                c22376x88ed722d.s0();
            }
            pf0.u uVar = (pf0.u) i95.n0.c(pf0.u.class);
            int i17 = c21410x67d80e90.f278458e;
            kn4.i0 i0Var = (kn4.i0) uVar;
            i0Var.getClass();
            if (i17 == 0) {
                str = "MainUI";
            } else if (i17 == 1) {
                str = "AddressUI";
            } else if (i17 == 2) {
                str = "FindMoreFriendUI";
            } else if (i17 == 3) {
                str = "MoreTabUI";
            }
            if (str != null) {
                i0Var.Ai(str, 3);
            }
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d2 = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) hashMap.get(0);
            if (c22376x88ed722d2 != null) {
                c22376x88ed722d2.m78646xc2a54588();
                com.p314xaae8f345.mm.ui.ga gaVar = c22376x88ed722d2.f39345x2305be9;
                if (gaVar != null) {
                    gaVar.l0();
                }
                c22376x88ed722d2.mo7506x87316e0b(false);
            }
            com.p314xaae8f345.mm.ui.C21410x67d80e90 f76 = f7();
            f76.f278462i = java.lang.Boolean.FALSE;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d3 = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) f76.f278468o.get(0);
            if (c22376x88ed722d3 == null || (viewOnTouchListenerC22366xcd5c2226 = c22376x88ed722d3.f288905o) == null || (rVar = viewOnTouchListenerC22366xcd5c2226.f288851m) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "onChattingClose");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).f254322z1 = false;
        }
    }

    public final void d7() {
        java.util.ArrayList arrayList = f278359y;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "checktask delteInstance index %d, size:%d, hashCode: 0x%x", java.lang.Integer.valueOf(indexOf), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(hashCode()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c3, code lost:
    
        if (r3 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bf, code lost:
    
        if (r3 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r24) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public java.lang.String e7() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b;
        yb5.d dVar;
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f39300xb2a14a43;
        return (c21427xe5bb8a3 == null || (abstractC21611x7536149b = c21427xe5bb8a3.f278560n) == null || (dVar = abstractC21611x7536149b.f279685f) == null) ? "" : dVar.x();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: enableEdge2Edge */
    public boolean mo60885x863d972f() {
        return false;
    }

    public com.p314xaae8f345.mm.ui.C21410x67d80e90 f7() {
        return this.f278362i.m78421xefd35ffa();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        d7();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(f278359y.size());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "checktask Launcherui onfinish 0x%x,instance size %d, stack: %s", valueOf, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.z2
    /* renamed from: forceRemoveNoMatchOnPath */
    public boolean mo2324x9a379939() {
        this.f39300xb2a14a43.getClass();
        return true;
    }

    public final boolean g7() {
        android.content.Intent intent = this.f278364n;
        if (intent != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(intent, "absolutely_exit", false) || com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(this.f278364n, "absolutely_exit_pid", 0) == android.os.Process.myPid()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI", "resumeLogoutJump launcherOnResume exit absolutely!!! hashCode[%d]", java.lang.Integer.valueOf(hashCode()));
                finish();
                com.p314xaae8f345.mm.ui.vb.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(this.f278364n, "kill_service", true));
                return true;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(this.f278364n, "can_finish", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump exit obviously");
                c01.d9.e().v(true);
                if (gm0.k2.c(getApplicationContext())) {
                    android.content.Context applicationContext = getApplicationContext();
                    if (com.p314xaae8f345.mm.p642xad8b531f.o.d()) {
                        com.p314xaae8f345.mm.app.d0.e();
                    } else {
                        try {
                            applicationContext.stopService(new android.content.Intent(applicationContext, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.class));
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CoreServiceHelper", "stopServiceInstance() Exception:%s", e17.getMessage());
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(8);
                sendBroadcast(new android.content.Intent("com.tencent.mm.ui.ACTION_FORCE_DEACTIVE").setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b), com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
                finish();
                db5.f.k(this);
                return true;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(this.f278364n, "exit_and_restart", false)) {
                com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37523x79d8456e(0);
                if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
                    com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84236x79d8456e(0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "exit and restart myself.");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
                finish();
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
                intent2.addFlags(67108864);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "restart, try to kill mm pid %d", java.lang.Integer.valueOf(android.os.Process.myPid()));
                com.p314xaae8f345.mm.ui.vb.i();
                int myPid = android.os.Process.myPid();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(myPid));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: getCurrentFragmet */
    public com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 mo78445x6b9fafe7() {
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f39300xb2a14a43;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = !c21427xe5bb8a3.f278557k ? c21427xe5bb8a3.f278560n : null;
        return abstractC21611x7536149b == null ? super.mo78445x6b9fafe7() : abstractC21611x7536149b;
    }

    /* renamed from: getHomeUI */
    public com.p314xaae8f345.mm.ui.C21374x812c2fd3 m78446x1cde66a9() {
        return this.f278362i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h7(android.content.Intent r25) {
        /*
            Method dump skipped, instructions count: 1782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.h7(android.content.Intent):void");
    }

    public boolean i7() {
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f39300xb2a14a43;
        if (c21427xe5bb8a3 != null) {
            return c21427xe5bb8a3.k();
        }
        return false;
    }

    public final void j7(android.content.Intent intent, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54, java.lang.String str) {
        intent.putExtra("Contact_User", "opencustomerservicemsg");
        intent.putExtra("open_im_kefu_chatting_username", str);
        intent.putExtra("open_im_kefu_jump_chatting", true);
        intent.putExtra("open_im_kefu_conversation_list_ui_from_scene", 2);
        intent.addFlags(67108864);
        j45.l.u(this, ".ui.conversation.OpenImKefuServiceConversationUI", intent, null);
        activityC21387x976b8e54.overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
    }

    public final void k7(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "handleJump, isWxGame and LiteApp");
        intent.putExtra("Chat_User", "gh_25d9ac85a4bc");
        intent.putExtra("game_plugun_click_time", java.lang.System.currentTimeMillis());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).hj(this, intent);
    }

    public final void l7(boolean z17) {
        com.p314xaae8f345.mm.ui.z8 z8Var = this.f278363m;
        if (z17) {
            z8Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "ingore check permission on init");
            return;
        }
        z8Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "checkOnResume");
        if (z8Var.f294139a) {
            z8Var.f294139a = false;
        }
    }

    public final void m7() {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump");
        if (this.f278364n != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(getIntent(), "LauncherUI.jump_from_uimode_check", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "dancy uimode check from background, not jumpToLogin or welcome!");
            return;
        }
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "LauncherUI.Shortcut.LaunchType");
        if (l17 != null) {
            if (l17.equals("launch_type_scan_qrcode")) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7043xd67274fc c7043xd67274fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7043xd67274fc();
                c7043xd67274fc.f143597d = 2L;
                c7043xd67274fc.f143598e = 2L;
                c7043xd67274fc.k();
                c7043xd67274fc.o();
            } else if (l17.equals("launch_type_offline_wallet")) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7043xd67274fc c7043xd67274fc2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7043xd67274fc();
                c7043xd67274fc2.f143597d = 1L;
                c7043xd67274fc2.f143598e = 2L;
                c7043xd67274fc2.k();
                c7043xd67274fc2.o();
            } else if (l17.equals("launch_type_my_qrcode")) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7043xd67274fc c7043xd67274fc3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7043xd67274fc();
                c7043xd67274fc3.f143597d = 3L;
                c7043xd67274fc3.f143598e = 2L;
                c7043xd67274fc3.k();
                c7043xd67274fc3.o();
            }
        }
        com.p314xaae8f345.mm.ui.uc.a();
        com.p314xaae8f345.mm.ui.uc.a();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.ui.fl.b(context);
        com.p314xaae8f345.mm.ui.v7.b(context);
        com.p314xaae8f345.mm.ui.w9.b(context);
        com.p314xaae8f345.mm.ui.rk.b(context);
        com.p314xaae8f345.mm.ui.eg.c(context);
        com.p314xaae8f345.mm.ui.ee.d(2);
        c01.b9 b9Var = c01.b9.f118602c;
        java.lang.String a17 = b9Var.a("login_user_name", "");
        boolean h17 = c01.d9.h();
        java.lang.Runnable runnable = this.f278371u;
        if (!h17 && a17.equals("")) {
            v61.g0 g0Var = v61.h0.f514974a;
            if (com.p314xaae8f345.mm.ui.bk.A()) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11432x3f57faf9.class);
                intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                intent.putExtra("mobile_input_purpose", 1);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeLogoutJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeLogoutJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871.class);
                intent2.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeLogoutJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeLogoutJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            db5.f.h(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump but has not login and ret");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 2000L);
            return;
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putInt("PREF_KEY_LAST_AUTH_FLAG", -1);
        android.content.Intent intent3 = this.f278364n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump hasDoInit:%b needResetLaunchUI:%b formNotification:%b, ishold:%b", java.lang.Boolean.valueOf(this.f278365o), java.lang.Boolean.valueOf(intent3 != null && (intent3.getFlags() & 67108864) == 67108864), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(this.f278364n, "Intro_Notify", false)), java.lang.Boolean.valueOf(gm0.m.r()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "doOnResumeImp resumeLogoutJump hasCfgDefaultUin[%b]", java.lang.Boolean.valueOf(c01.d9.h()));
        gm0.m.o();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(getIntent(), "LauncherUI.From.Scaner.Shortcut", false)) {
            this.f278367q = true;
        }
        boolean c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(this.f278364n, "Intro_Switch", false);
        boolean z27 = gm0.m.f354769y;
        boolean s17 = gm0.m.s();
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            z17 = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(this.f278364n, "LauncherUI.jump_switch_account", false);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(this.f278364n, "Intro_Switch", false);
        } else {
            z17 = false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(this.f278364n, "LauncherUI.jump_switch_account", z17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "launcher to switch account");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "switch to wxid %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0).getString("last_switch_account_to_wx_username", ""));
            android.content.Intent intent4 = new android.content.Intent();
            intent4.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea.class);
            intent4.addFlags(268468224);
            intent4.putExtra("key_scene", 1);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/ui/LauncherUI", "switchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "switchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.h(this);
        } else {
            if (c17) {
                z18 = c17;
            } else {
                z18 = c17;
                if (!this.f278365o && !z27 && !s17) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(this.f278364n, "LauncherUI.jump_switch_account", false)) {
                        java.lang.String a18 = b9Var.a("login_user_name", "");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "%s jumpToLogin", a18);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18)) {
                            v61.g0 g0Var2 = v61.h0.f514974a;
                            if (com.p314xaae8f345.mm.ui.bk.A()) {
                                android.content.Intent intent5 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11432x3f57faf9.class);
                                intent5.putExtra("mobile_input_purpose", 1);
                                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                arrayList4.add(intent5);
                                java.util.Collections.reverse(arrayList4);
                                yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                startActivity((android.content.Intent) arrayList4.get(0));
                                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            } else {
                                android.content.Intent intent6 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871.class);
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                arrayList5.add(intent6);
                                java.util.Collections.reverse(arrayList5);
                                yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                startActivity((android.content.Intent) arrayList5.get(0));
                                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                db5.f.h(this);
                            }
                        } else {
                            boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0).getBoolean("last_logout_switch_account", false);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "switchAccount %s", java.lang.Boolean.valueOf(z28));
                            if (z28) {
                                android.content.Intent intent7 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea.class);
                                intent7.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                                intent7.putExtra("key_scene", 2);
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                arrayList6.add(intent7);
                                java.util.Collections.reverse(arrayList6);
                                yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                startActivity((android.content.Intent) arrayList6.get(0));
                                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                db5.f.i(this);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "pluginSwitch  " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(b9Var.a("last_login_use_voice", ""), 0));
                                android.content.Intent intent8 = new android.content.Intent();
                                intent8.putExtra("key_errType", com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(this.f278364n, "key_errType", 0));
                                intent8.putExtra("key_errCode", com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(this.f278364n, "key_errCode", 0));
                                intent8.putExtra("key_errMsg", com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(this.f278364n, "key_errMsg"));
                                intent8.putExtra("login_type", 0);
                                intent8.setClassName(this, "com.tencent.mm.plugin.account.ui.LoginPasswordUI");
                                intent8.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                arrayList7.add(intent8);
                                java.util.Collections.reverse(arrayList7);
                                yj0.a.d(this, arrayList7.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                startActivity((android.content.Intent) arrayList7.get(0));
                                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                db5.f.i(this);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(8);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 2000L);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "will logout account and kill app, bSwitchAccount = %s, hasDoneCreateImp = %s, isKickOffline = %s, hasLogin = %s, hasInitialAccount = %s, isVirtualLogin=%s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f278365o), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(gm0.j1.b().n()), java.lang.Boolean.valueOf(gm0.j1.b().m()), java.lang.Boolean.valueOf(s17));
            v61.g0 g0Var3 = v61.h0.f514974a;
            if (gm0.j1.b().m()) {
                java.lang.String a19 = b9Var.a("login_user_name", "");
                java.lang.String r17 = c01.z1.r();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a19);
                if ((c01.z1.x() || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a19, gm0.j1.u().c().l(6, null)) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a19, c01.z1.c()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a19, java.lang.String.valueOf(gm0.j1.u().c().q(9, 0))) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a19, gm0.j1.u().c().l(5, null))) ? false : true) {
                    java.lang.Object l18 = gm0.j1.u().c().l(6, null);
                    java.lang.String str = l18 instanceof java.lang.String ? (java.lang.String) l18 : null;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        java.lang.String c18 = c01.z1.c();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c18)) {
                            b9Var.d("login_user_name", r17);
                            c01.uc.f119047c.h(r17, "login_user_name", r17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LoginUtil", "change lastLoginName from %s to userName %s", a19, r17);
                        } else {
                            b9Var.d("login_user_name", c18);
                            c01.uc.f119047c.h(r17, "login_user_name", c18);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LoginUtil", "change lastLoginName from %s to alias %s", a19, c18);
                        }
                    } else {
                        b9Var.d("login_user_name", str);
                        c01.uc.f119047c.h(r17, "login_user_name", str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LoginUtil", "change lastLoginName from %s mobile to %s", a19, str);
                    }
                }
            }
            this.f278362i.m78421xefd35ffa().e();
            gm0.j1.i().l("[normal logout]");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreAccount", "[!] unmarkVirtualLogin");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("system_config_prefs").G("virtual_login_mark", false);
            com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37523x79d8456e(0);
            if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
                com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84236x79d8456e(0);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "checktask ConstantsUI.Intro.KSwitch kill myself.");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
            finish();
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.content.Intent intent9 = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
            intent9.putExtra("key_errType", com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(this.f278364n, "key_errType", 0));
            intent9.putExtra("key_errCode", com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(this.f278364n, "key_errCode", 0));
            intent9.putExtra("key_errMsg", com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(this.f278364n, "key_errMsg"));
            intent9.addFlags(67108864);
            intent9.addFlags(268435456);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(intent9);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(context2, arrayList8.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList8.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "try to kill mm pid %d", java.lang.Integer.valueOf(android.os.Process.myPid()));
            com.p314xaae8f345.mm.ui.vb.i();
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList9.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(obj, arrayList9.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
        gm0.m.E();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public boolean moveTaskToBack(boolean z17) {
        try {
            return super.moveTaskToBack(z17);
        } finally {
            com.p314xaae8f345.mm.ui.p2714xac1f0fa0.C22438xd028953b c22438xd028953b = new com.p314xaae8f345.mm.ui.p2714xac1f0fa0.C22438xd028953b();
            c22438xd028953b.f290607g = this;
            c22438xd028953b.e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b;
        boolean z17;
        android.os.Bundle bundleExtra;
        android.os.Bundle bundleExtra2;
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f39300xb2a14a43;
        c21427xe5bb8a3.getClass();
        if ((i17 == 2001 || i17 == 30763 || i17 == 226 || i17 == 3001 || i17 == 30762 || i17 == 1111 || i17 == 229) && (abstractC21611x7536149b = c21427xe5bb8a3.f278560n) != null) {
            abstractC21611x7536149b.mo7496x9d4787cb(i17, i18, intent);
        }
        int i19 = 65535 & i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "check request code %d", java.lang.Integer.valueOf(i19));
        if ((i19 == 217 || i19 == 218 || i19 == 226) && c21427xe5bb8a3.f278560n == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "on select image ActivityResult. the chattingUI maybe kill in the background.");
            com.p314xaae8f345.mm.ui.dg dgVar = c21427xe5bb8a3.f278563q;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(dgVar);
            dgVar.f289869d = 0;
            dgVar.f289870e = i17;
            dgVar.f289871f = i18;
            dgVar.f289872g = intent;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(dgVar);
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        final com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = this.f278362i;
        if (!c21374x812c2fd3.f278275a || i17 == 1) {
            return;
        }
        if (i17 == 22722) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "showAgreements %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("agree_privacy")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "disagree privacy policy");
                gm0.j1.d().g(new n61.c(2, str, ""));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(712L, 5L, 1L, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "agree privacy policy");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(712L, 4L, 1L, false);
                gm0.j1.d().g(new n61.c(1, str, ""));
                if (u11.c.f(str) && gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEED_BIRTHDAY_BOOLEAN_SYNC, false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "needbirthday true");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.30
                        public AnonymousClass30() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd32 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                            java.lang.String string = c21374x812c2fd32.f278291q.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573771fr0, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
                            if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEED_CONFIRM_BOOLEAN_SYNC, false)) {
                                com.p314xaae8f345.mm.ui.C21374x812c2fd3.e(c21374x812c2fd32, string, 22723, c21374x812c2fd32.f278291q.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573772fr2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "needconfirm false");
                                android.os.Bundle bundle = new android.os.Bundle();
                                bundle.putString("close_dialog_msg", c21374x812c2fd32.f278282h);
                                bundle.putString("close_dialog_cancel", c21374x812c2fd32.f278284j);
                                bundle.putString("close_dialog_ok", c21374x812c2fd32.f278283i);
                                bundle.putBoolean("close_dialog_ok_close", false);
                                com.p314xaae8f345.mm.ui.C21374x812c2fd3.d(c21374x812c2fd32, string, 22723, bundle);
                            }
                            db5.f.h(c21374x812c2fd32.f278291q);
                        }
                    }, 100L);
                }
            }
        } else if (i17 == 22723) {
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(274436, null);
            bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra != null) {
                if (bundleExtra.getString("go_next", "").equals("birthdayComfirmOK")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "verify birthday ok");
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEED_BIRTHDAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
                } else if (bundleExtra.getString("go_next", "").equals("gdpr_confirm_logout")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "quit verify birthday after H5-warnning");
                    gm0.j1.d().g(new n61.c(2, str2, ""));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(712L, 5L, 1L, false);
                }
            }
        }
        if (i17 == 65534 && i18 == -1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("welcome_page_show");
            gm0.k2.a(c21374x812c2fd3.f278291q, true);
            com.p314xaae8f345.mm.ui.vb.e();
            com.p314xaae8f345.mm.ui.vb.c(c21374x812c2fd3.f278291q);
            c21374x812c2fd3.f278291q.finish();
            return;
        }
        if (i17 != 30764 || intent == null || (bundleExtra2 = intent.getBundleExtra("result_data")) == null || !bundleExtra2.getString("go_next", "").equals("gdpr_auth_location")) {
            return;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = c21374x812c2fd3.f278291q;
        ((sb0.f) jVar).getClass();
        j35.u.i(activityC21401x6ce6f73f, "android.permission.ACCESS_FINE_LOCATION", 66);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        e3.d a17;
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.ui.b4.f278743a = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2527xae0a552.C20130xeaa1ea21()) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Edge2EdgeHelper", "initExp SwitchEnable=" + com.p314xaae8f345.mm.ui.b4.f278743a + " from=LauncherUI");
        if (com.p314xaae8f345.mm.ui.b4.c(this)) {
            n3.g3 a18 = com.p314xaae8f345.mm.ui.cl.a(this);
            com.p314xaae8f345.mm.ui.cl.f287828a = (a18 == null || (a17 = a18.a(2)) == null) ? 0 : a17.f328580d;
            com.p314xaae8f345.mm.ui.yk.f("MicroMsg.WeUIToolHelper", "navigationBarHeightCache=" + com.p314xaae8f345.mm.ui.cl.f287828a, new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (U6()) {
            super.onBackPressed();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "onBackPressed");
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f278362i.f278291q;
        if (activityC21401x6ce6f73f != null) {
            try {
                activityC21401x6ce6f73f.moveTaskToBack(true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LauncherUI.HomeUI", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = this.f278362i;
        o25.n1.b(c21374x812c2fd3.f278291q, c21374x812c2fd3.K, 0);
        if (fp.e0.e() || u75.e.a() || fp.e0.f()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5774x7fae8755 c5774x7fae8755 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5774x7fae8755();
            boolean contains = configuration.toString().contains("mWindowingMode=100");
            am.am amVar = c5774x7fae8755.f136088g;
            amVar.f87696a = contains;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "onConfigurationChanged: OPPO isInMultiWindowMode:%s ", java.lang.Boolean.valueOf(amVar.f87696a));
            c5774x7fae8755.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02c9  */
    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.onCreate(android.os.Bundle):void");
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        if (this.f39300xb2a14a43.k()) {
            return false;
        }
        final com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = this.f278362i;
        com.p314xaae8f345.mm.ui.m8 m8Var = c21374x812c2fd3.f278292r;
        if (m8Var == null || ((com.p314xaae8f345.mm.ui.C21427xe5bb8a3) m8Var).k()) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(c21374x812c2fd3.f278292r == null);
            objArr[1] = java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.ui.C21427xe5bb8a3) c21374x812c2fd3.f278292r).k());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "unCreateOptionsMenu, %b, %b", objArr);
            return false;
        }
        int l17 = c21374x812c2fd3.f278291q.mo2533x106ab264().l();
        int f17 = i65.a.f(c21374x812c2fd3.f278291q, com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        if (l17 == 0) {
            android.util.DisplayMetrics displayMetrics = c21374x812c2fd3.f278291q.getResources().getDisplayMetrics();
            l17 = displayMetrics.widthPixels > displayMetrics.heightPixels ? c21374x812c2fd3.f278291q.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561155ax) : c21374x812c2fd3.f278291q.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        }
        android.view.MenuItem add = menu.add(0, com.p314xaae8f345.mm.R.id.jha, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jzr);
        c21374x812c2fd3.F = add;
        android.graphics.drawable.Drawable drawable = c21374x812c2fd3.f278291q.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80564x8f81c2bb);
        com.p314xaae8f345.mm.ui.uk.f(drawable, c21374x812c2fd3.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        add.setIcon(drawable);
        if (c21374x812c2fd3.D == null) {
            android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(f17, l17);
            android.view.View inflate = android.view.LayoutInflater.from(c21374x812c2fd3.f278291q).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569445be, (android.view.ViewGroup) null);
            c21374x812c2fd3.D = inflate;
            c21374x812c2fd3.E = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h5n);
            c21374x812c2fd3.D.setLayoutParams(layoutParams);
            c21374x812c2fd3.D.setMinimumHeight(l17);
            c21374x812c2fd3.D.setMinimumWidth(f17);
            android.widget.ImageView imageView3 = c21374x812c2fd3.E;
            android.graphics.drawable.Drawable drawable2 = c21374x812c2fd3.f278291q.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80564x8f81c2bb);
            com.p314xaae8f345.mm.ui.uk.f(drawable2, c21374x812c2fd3.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            imageView3.setImageDrawable(drawable2);
            c21374x812c2fd3.D.setContentDescription(c21374x812c2fd3.l(com.p314xaae8f345.mm.R.C30867xcad56011.jzr));
            c21374x812c2fd3.D.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.mm.ui.HomeUI.14
                public AnonymousClass14() {
                }

                /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
                
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_local_wechat_repair_entrance_flag_and, 0) == 1) goto L39;
                 */
                @Override // android.view.View.OnLongClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean onLongClick(android.view.View r14) {
                    /*
                        r13 = this;
                        java.lang.String r0 = "com/tencent/mm/ui/HomeUI$14"
                        java.lang.String r1 = "android/view/View$OnLongClickListener"
                        java.lang.String r2 = "onLongClick"
                        java.lang.String r3 = "(Landroid/view/View;)Z"
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        r4.add(r14)
                        java.lang.Object[] r5 = r4.toArray()
                        r4.clear()
                        r4 = r13
                        yj0.a.b(r0, r1, r2, r3, r4, r5)
                        int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h
                        r1 = 788529167(0x2f00000f, float:1.1641553E-10)
                        r2 = 1
                        r3 = 0
                        if (r0 == r1) goto L2c
                        r1 = 788529166(0x2f00000e, float:1.1641552E-10)
                        if (r0 != r1) goto L2a
                        goto L2c
                    L2a:
                        r0 = r3
                        goto L2d
                    L2c:
                        r0 = r2
                    L2d:
                        if (r0 != 0) goto L38
                        boolean r0 = z65.c.a()
                        if (r0 == 0) goto L36
                        goto L38
                    L36:
                        r0 = r3
                        goto L39
                    L38:
                        r0 = r2
                    L39:
                        if (r0 != 0) goto L4d
                        java.lang.Class<e42.e0> r0 = e42.e0.class
                        i95.m r0 = i95.n0.c(r0)
                        e42.e0 r0 = (e42.e0) r0
                        e42.d0 r1 = e42.d0.clicfg_local_wechat_repair_entrance_flag_and
                        h62.d r0 = (h62.d) r0
                        int r0 = r0.Ni(r1, r3)
                        if (r0 != r2) goto L9a
                    L4d:
                        android.content.Intent r0 = new android.content.Intent
                        r0.<init>()
                        com.tencent.mm.ui.HomeUI r2 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this
                        com.tencent.mm.ui.MMFragmentActivity r4 = r2.f278291q
                        java.lang.String r5 = "com.tencent.mm.plugin.repairer.ui.RepairerMainUI"
                        r0.setClassName(r4, r5)
                        r4 = 268435456(0x10000000, float:2.524355E-29)
                        r0.addFlags(r4)
                        com.tencent.mm.ui.MMFragmentActivity r2 = r2.f278291q
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        r4.add(r0)
                        java.util.Collections.reverse(r4)
                        java.lang.Object[] r6 = r4.toArray()
                        java.lang.String r7 = "com/tencent/mm/ui/HomeUI$14"
                        java.lang.String r8 = "onLongClick"
                        java.lang.String r9 = "(Landroid/view/View;)Z"
                        java.lang.String r10 = "Undefined"
                        java.lang.String r11 = "startActivity"
                        java.lang.String r12 = "(Landroid/content/Intent;)V"
                        r5 = r2
                        yj0.a.d(r5, r6, r7, r8, r9, r10, r11, r12)
                        java.lang.Object r0 = r4.get(r3)
                        android.content.Intent r0 = (android.content.Intent) r0
                        r2.startActivity(r0)
                        java.lang.String r6 = "com/tencent/mm/ui/HomeUI$14"
                        java.lang.String r7 = "onLongClick"
                        java.lang.String r8 = "(Landroid/view/View;)Z"
                        java.lang.String r9 = "Undefined"
                        java.lang.String r10 = "startActivity"
                        java.lang.String r11 = "(Landroid/content/Intent;)V"
                        r5 = r2
                        yj0.a.f(r5, r6, r7, r8, r9, r10, r11)
                    L9a:
                        java.lang.String r6 = "com/tencent/mm/ui/HomeUI$14"
                        java.lang.String r7 = "android/view/View$OnLongClickListener"
                        java.lang.String r8 = "onLongClick"
                        java.lang.String r9 = "(Landroid/view/View;)Z"
                        r4 = 0
                        r5 = r13
                        yj0.a.i(r4, r5, r6, r7, r8, r9)
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21374x812c2fd3.AnonymousClass14.onLongClick(android.view.View):boolean");
                }
            });
            c21374x812c2fd3.D.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.15
                public AnonymousClass15() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    tf5.m mVar;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/HomeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                    com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.n();
                    android.content.Context context = view.getContext();
                    if (context == null) {
                        mVar = null;
                    } else {
                        pf5.z zVar = pf5.z.f435481a;
                        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        mVar = (tf5.m) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(tf5.m.class);
                    }
                    if (mVar != null && mVar.f500537e) {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.l(new jz5.l("page_sessionid", java.lang.Long.valueOf(mVar.f500536d)), new jz5.l("view_id", "search_button_contact_tab")), 33926);
                    }
                    yj0.a.h(this, "com/tencent/mm/ui/HomeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            c21374x812c2fd3.D.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.16
                public AnonymousClass16() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278291q.mo2548x55429c53();
                }

                /* renamed from: toString */
                public java.lang.String m78422x9616526c() {
                    return super.toString() + "|supportInvalidateOptionsMenu";
                }
            });
        }
        c21374x812c2fd3.F.setActionView(c21374x812c2fd3.D);
        c21374x812c2fd3.G = menu.add(0, com.p314xaae8f345.mm.R.id.jga, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jzq);
        if (c21374x812c2fd3.f278299y == null) {
            c21374x812c2fd3.f278298x = new com.p314xaae8f345.mm.ui.C21374x812c2fd3.PlusActionView(f17, l17);
        }
        if (com.p314xaae8f345.mm.ui.t7.f291414a.a() && c21374x812c2fd3.B == null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = new android.view.ViewGroup.LayoutParams(f17, l17);
            android.view.View inflate2 = android.view.LayoutInflater.from(c21374x812c2fd3.f278291q).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569446bf, (android.view.ViewGroup) null);
            c21374x812c2fd3.B = inflate2;
            c21374x812c2fd3.C = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.h5n);
            c21374x812c2fd3.B.setLayoutParams(layoutParams2);
            c21374x812c2fd3.B.setMinimumHeight(l17);
            c21374x812c2fd3.B.setMinimumWidth(f17);
            c21374x812c2fd3.C.setImageResource(com.p314xaae8f345.mm.R.raw.f80835x8a27baa1);
            c21374x812c2fd3.B.setContentDescription(c21374x812c2fd3.l(com.p314xaae8f345.mm.R.C30867xcad56011.gum));
            c21374x812c2fd3.B.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                    com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd32 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                    c21374x812c2fd32.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/HomeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c21374x812c2fd32, array);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10919, "0");
                    new android.content.Intent().putExtra("invite_friend_scene", 2);
                    j45.l.j(c21374x812c2fd32.f278291q, "subapp", ".ui.pluginapp.AddMoreFriendsUI", new android.content.Intent(), null);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        if (currentTimeMillis - c21374x812c2fd32.f278274J > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                            c21374x812c2fd32.f278274J = currentTimeMillis;
                            c21374x812c2fd32.I = 1;
                        } else {
                            int i17 = c21374x812c2fd32.I + 1;
                            c21374x812c2fd32.I = i17;
                            if (i17 >= 5) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.HomeUI", "Switch to MonkeyEnv now.");
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b = true;
                            }
                        }
                    }
                    yj0.a.h(c21374x812c2fd32, "com/tencent/mm/ui/HomeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        c21374x812c2fd3.h();
        if (gm0.j1.b().m()) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(c21374x812c2fd3.f278298x);
        }
        if (c21374x812c2fd3.f278281g && (imageView2 = c21374x812c2fd3.f278300z) != null) {
            imageView2.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        if (c21374x812c2fd3.f278281g && (imageView = c21374x812c2fd3.C) != null) {
            imageView.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        nm.j.f419976g.a(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.17
            public AnonymousClass17() {
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.u(false);
            }
        });
        c21374x812c2fd3.G.setActionView(c21374x812c2fd3.f278299y);
        c21374x812c2fd3.g();
        android.view.MenuItem menuItem = c21374x812c2fd3.G;
        if (menuItem != null) {
            if (c21374x812c2fd3.H) {
                menuItem.setShowAsAction(2);
                c21374x812c2fd3.G.setVisible(true);
                c21374x812c2fd3.h();
                android.widget.TextView textView = c21374x812c2fd3.f278279e;
                if (textView != null) {
                    textView.setVisibility(4);
                }
            } else {
                menuItem.setVisible(false);
                c21374x812c2fd3.G.setEnabled(false);
                android.widget.TextView textView2 = c21374x812c2fd3.f278279e;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
        }
        android.view.MenuItem menuItem2 = c21374x812c2fd3.F;
        if (menuItem2 != null) {
            if (c21374x812c2fd3.H) {
                menuItem2.setShowAsAction(2);
                c21374x812c2fd3.F.setVisible(true);
                c21374x812c2fd3.h();
                android.widget.TextView textView3 = c21374x812c2fd3.f278279e;
                if (textView3 != null) {
                    textView3.setVisibility(4);
                }
            } else {
                menuItem2.setVisible(false);
                c21374x812c2fd3.F.setEnabled(false);
                android.widget.TextView textView4 = c21374x812c2fd3.f278279e;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            }
        }
        c21374x812c2fd3.f278299y.getLayoutParams().width = f17;
        c21374x812c2fd3.f278299y.getLayoutParams().height = l17;
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        nm.a.a(512);
        nm.a.f419955w = false;
        super.onDestroy();
        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = this.f278362i;
        if (c21374x812c2fd3 != null) {
            c21374x812c2fd3.f278294t.e();
            com.p314xaae8f345.mm.ui.o7 o7Var = c21374x812c2fd3.f278293s;
            if (o7Var != null) {
                o7Var.f290994l.mo48814x2efc64();
                o7Var.f290996n.mo48814x2efc64();
            }
            if (c21374x812c2fd3.f278275a) {
                android.os.Looper.myQueue().removeIdleHandler(c21374x812c2fd3.O);
            }
            c21374x812c2fd3.M.mo48814x2efc64();
            c21374x812c2fd3.N.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f39300xb2a14a43;
        if (c21427xe5bb8a3 != null) {
            c21427xe5bb8a3.p();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(c21427xe5bb8a3.f39392xeac1d598);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(c21427xe5bb8a3.f278559m);
            android.os.Looper.myQueue().removeIdleHandler(c21427xe5bb8a3.f278551e);
        }
        qg0.y yVar = this.f278368r;
        if (yVar != null) {
            nt4.e eVar = (nt4.e) yVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HKOfflineLogic", "doOnDestroy");
            eVar.f421352d = null;
            eVar.f421354f = null;
            eVar.f421353e = false;
            eVar.f421355g = null;
            gm0.j1.d().q(2540, eVar);
            this.f278368r = null;
        }
        this.f278361h.mo48814x2efc64();
        d7();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(getTaskId());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "checktask onDestroy 0x%x, taskid %d, task:%s, instancesize %d", valueOf, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.q8(this), java.lang.Integer.valueOf(f278359y.size()));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onMultiWindowModeChanged(boolean z17) {
        super.onMultiWindowModeChanged(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "onMultiWindowModeChanged2 isInMultiWindowMode: %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5719x35b0ea12 c5719x35b0ea12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5719x35b0ea12();
        c5719x35b0ea12.f136041g.f88215a = z17;
        c5719x35b0ea12.e();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "onNewIntent 0x%x task:%s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.q8(this));
        this.f278364n = intent;
        super.onNewIntent(intent);
        setIntent(intent);
        zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
        if ("android.intent.action.MAIN".equals(intent.getAction()) && c9Var != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) c9Var).Ai(this)) {
            return;
        }
        android.content.Intent intent2 = this.f278364n;
        if (intent2 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(intent2, "LauncherUI.jump_from_uimode_check", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "dancy onNewIntent uimode check from background, finish LauncherUI");
            finish();
            return;
        }
        if (c9Var != null && "new_msg_nofification".equals(intent.getStringExtra("nofification_type"))) {
            pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.f3((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) c9Var));
        }
        ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).getClass();
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h1(this, ""), "reportLaunchWechat");
        if (g7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "onNewIntent handleExitIntent");
            return;
        }
        android.content.Intent intent3 = this.f278364n;
        if (intent3 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(intent3, "Intro_Need_Clear_Top ", false)) {
            finish();
            n7(this);
            return;
        }
        if ((intent.getFlags() & 67108864) == 67108864) {
            m78444xa05a445e(false);
        }
        com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = this.f278362i.f278294t;
        c21410x67d80e90.getClass();
        if ((intent.getFlags() & 67108864) == 67108864) {
            c21410x67d80e90.f278457d = true;
        }
        if (this.f278365o) {
            h7(intent);
        }
        rp3.c.a().getClass();
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = this.f278362i;
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 mo78445x6b9fafe7 = c21374x812c2fd3.f278291q.mo78445x6b9fafe7();
        boolean z17 = false;
        if ((mo78445x6b9fafe7 == null || !mo78445x6b9fafe7.m78398x58a9c73b()) && !((com.p314xaae8f345.mm.ui.C21427xe5bb8a3) c21374x812c2fd3.f278292r).k()) {
            if (menuItem.getItemId() == com.p314xaae8f345.mm.R.id.jga) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10919, "0");
                c21374x812c2fd3.o();
            } else if (menuItem.getItemId() == com.p314xaae8f345.mm.R.id.jha) {
                c21374x812c2fd3.n();
            }
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        hashCode();
        super.onPause();
        zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
        if (c9Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) c9Var;
            if (gm0.j1.a()) {
                l3Var.f207655e = false;
                l3Var.f207654d = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMultiTaskService", "onLauncherUIPause: acc not ready");
            }
        }
        o25.n2 n2Var = this.f278369s;
        boolean a17 = n2Var.a("onPause");
        if (a17) {
            n2Var.f424099a = false;
        }
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "recreate activity %s, skip this onPause");
            return;
        }
        nm.a.a(512);
        nm.a.f419955w = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "not skip this onPause");
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 mo78445x6b9fafe7 = mo78445x6b9fafe7();
        this.f278370t.mo50302x6b17ad39(null);
        if (!com.p314xaae8f345.mm.ui.bk.y()) {
            this.f278362i.j();
            this.f39300xb2a14a43.h();
        }
        if (mo78445x6b9fafe7 != null) {
            return;
        }
        this.f278366p = false;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (this.f278363m.a(this, i17, strArr, iArr)) {
            return;
        }
        final com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = this.f278362i;
        c21374x812c2fd3.getClass();
        if (i17 == 16 || i17 == 80) {
            int i18 = i17 == 80 ? com.p314xaae8f345.mm.R.C30867xcad56011.hhn : com.p314xaae8f345.mm.R.C30867xcad56011.hh8;
            if (iArr[0] != 0) {
                db5.e1.C(c21374x812c2fd3.f278291q, c21374x812c2fd3.l(i18), c21374x812c2fd3.l(com.p314xaae8f345.mm.R.C30867xcad56011.hht), c21374x812c2fd3.l(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), c21374x812c2fd3.l(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.31
                    public AnonymousClass31() {
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                        dialogInterface.dismiss();
                        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278291q;
                        ((sb0.f) jVar).getClass();
                        j35.u.g(activityC21401x6ce6f73f);
                    }
                }, new android.content.DialogInterface.OnClickListener(c21374x812c2fd3) { // from class: com.tencent.mm.ui.HomeUI.32
                    public AnonymousClass32(final com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd32) {
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                        dialogInterface.dismiss();
                    }
                });
            }
        } else if (i17 != 65) {
            if (i17 == 66) {
                if (iArr[0] == 0) {
                    com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 g17 = c21374x812c2fd32.f278294t.g();
                    if (g17 instanceof com.p314xaae8f345.mm.ui.C21357x5e7365bb) {
                        ((com.p314xaae8f345.mm.ui.C21357x5e7365bb) g17).C0();
                    }
                } else {
                    db5.e1.C(c21374x812c2fd32.f278291q, c21374x812c2fd32.l(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), c21374x812c2fd32.l(com.p314xaae8f345.mm.R.C30867xcad56011.hht), c21374x812c2fd32.l(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), c21374x812c2fd32.l(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.34
                        public AnonymousClass34() {
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278291q;
                            ((sb0.f) jVar).getClass();
                            j35.u.g(activityC21401x6ce6f73f);
                        }
                    }, null);
                }
            }
        } else if (iArr[0] == 0) {
            c21374x812c2fd32.n();
        } else {
            db5.e1.C(c21374x812c2fd32.f278291q, c21374x812c2fd32.l(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), c21374x812c2fd32.l(com.p314xaae8f345.mm.R.C30867xcad56011.hht), c21374x812c2fd32.l(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), c21374x812c2fd32.l(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.33
                public AnonymousClass33() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                    tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                    com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278291q;
                    ((sb0.f) jVar).getClass();
                    j35.u.g(activityC21401x6ce6f73f);
                }
            }, null);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f39300xb2a14a43.f278560n;
        if (abstractC21611x7536149b != null) {
            abstractC21611x7536149b.mo7516x953457f1(i17, strArr, iArr);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f39300xb2a14a43;
        c21427xe5bb8a3.getClass();
        java.lang.String string = bundle.getString("last_restore_talker");
        c21427xe5bb8a3.f278553g = string;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "onRestoreInstanceState:%s", string);
        this.f278372v = bundle.getBoolean("last_stay_chatting");
        this.f278373w = bundle.getInt("last_stay_tab");
        if (this.f278372v) {
            com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a32 = this.f39300xb2a14a43;
            c21427xe5bb8a32.r(c21427xe5bb8a32.f278553g, null, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String action;
        java.lang.String str3;
        com.p314xaae8f345.mm.ui.C21417xe2e4fa74 c21417xe2e4fa74;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a;
        yf5.j0 j0Var;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "onResume %s", java.lang.Integer.valueOf(hashCode()));
        super.onResume();
        if (this.f278369s.a("onResume")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "recreate activity %s, skip this onResume");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "not skip this onResume");
        A = false;
        if (gm0.m.s()) {
            m7();
        } else {
            android.content.Intent intent = this.f278364n;
            if ((intent == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(intent, "Intro_Switch", false) || !c01.d9.h() || gm0.m.r()) ? false : true) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "doOnResumeImp notSwitchorHold, hasDoInit:%b", java.lang.Boolean.valueOf(this.f278365o));
                if (!gm0.j1.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI", "accHasNotReady, kill self");
                    finish();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "try to kill mm pid %d", java.lang.Integer.valueOf(android.os.Process.myPid()));
                    int myPid = android.os.Process.myPid();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(myPid));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/ui/LauncherUI", "onResume", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/ui/LauncherUI", "onResume", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    return;
                }
                if (!this.f278365o) {
                    this.f278365o = true;
                    final com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = this.f278362i;
                    c21374x812c2fd3.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "doOnCreate");
                    ((ze4.f) i95.n0.c(ze4.f.class)).getClass();
                    if (bf4.f.f101248b.f()) {
                        ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STORY_NEW_FEATURE_TIP_BOOLEAN_SYNC, java.lang.Boolean.TRUE)).booleanValue();
                    }
                    com.p314xaae8f345.mm.ui.o7 o7Var = c21374x812c2fd3.f278293s;
                    o7Var.f290994l.mo48813x58998cd();
                    o7Var.f290996n.mo48813x58998cd();
                    getWindow().setCallback(new ma5.f(getWindow().getCallback(), this));
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.l()) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.t();
                        com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.m83866x8d670feb();
                    }
                    c21374x812c2fd3.f278285k = new com.p314xaae8f345.mm.ui.rg(this, c21374x812c2fd3.f278294t);
                    c21374x812c2fd3.f278275a = true;
                    com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.d();
                    ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).getClass();
                    com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.f145037a.getClass();
                    pm.b bVar = pm.f.f438285a.f438288f;
                    synchronized (bVar) {
                        if (bVar.f438283d == null) {
                            bVar.g();
                        }
                        arrayList = new java.util.ArrayList();
                        java.util.Iterator it = bVar.iterator();
                        while (it.hasNext()) {
                            pm.a aVar = (pm.a) it.next();
                            if ((aVar.f438282i & 1) != 0 && !arrayList.contains(java.lang.Integer.valueOf(aVar.f438277d))) {
                                arrayList.add(java.lang.Integer.valueOf(aVar.f438277d));
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        z2.n1 n1Var = new z2.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            pm.f.f438285a.d(n1Var, ((java.lang.Integer) it6.next()).intValue());
                        }
                    }
                    if (gm0.j1.a()) {
                        java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(c21374x812c2fd3.f278291q);
                        try {
                            java.util.HashSet hashSet = new java.util.HashSet();
                            java.lang.String[] split = c21374x812c2fd3.l(com.p314xaae8f345.mm.R.C30867xcad56011.bll).split(";");
                            hashSet.add(split[0]);
                            if (split.length > 1) {
                                hashSet.add(split[1]);
                            }
                            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                            c01.a2.f118580a = hashSet;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LauncherUI.HomeUI", e17, "", new java.lang.Object[0]);
                        }
                        gm0.j1.i();
                        gm0.j1.e().j(new com.p314xaae8f345.mm.ui.RunnableC21382xf511e735());
                        java.lang.System.currentTimeMillis();
                        java.lang.System.currentTimeMillis();
                        c21374x812c2fd3.K = com.p314xaae8f345.mm.ui.td.f291426c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(c21374x812c2fd3.f278291q), com.p314xaae8f345.mm.R.C30864xbddafb2a.bvp, null, false);
                        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07);
                        if (c21374x812c2fd3.K != null) {
                            c21374x812c2fd3.K.setBackgroundColor(color);
                        }
                        nm.j jVar = nm.j.f419976g;
                        synchronized (jVar) {
                            jVar.f419978b = true;
                        }
                        com.p314xaae8f345.mm.p638x597af5c.C7182xc7dc863b c7182xc7dc863b = (com.p314xaae8f345.mm.p638x597af5c.C7182xc7dc863b) c21374x812c2fd3.K.findViewById(com.p314xaae8f345.mm.R.id.g6w);
                        c7182xc7dc863b.f144765d = new nm.l(c21374x812c2fd3) { // from class: com.tencent.mm.ui.HomeUI.2

                            /* renamed from: com.tencent.mm.ui.HomeUI$2$1 */
                            /* loaded from: classes8.dex */
                            class AnonymousClass1 implements gm5.a {
                                public AnonymousClass1(com.p314xaae8f345.mm.ui.C21374x812c2fd3.AnonymousClass2 anonymousClass2) {
                                }

                                @Override // gm5.a
                                /* renamed from: call */
                                public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
                                    java.util.ArrayList arrayList = nm.a.f419953u;
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    java.util.Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        long[] jArr = (long[]) it.next();
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup %s, %s, %s", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]));
                                        arrayList2.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(jArr[0], jArr[1], jArr[2]));
                                    }
                                    if (arrayList2.size() > 0) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList2, false, false);
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup report size %s", java.lang.Integer.valueOf(arrayList.size()));
                                    arrayList.clear();
                                    java.util.Iterator it6 = nm.a.f419954v.iterator();
                                    while (it6.hasNext()) {
                                        java.lang.Object[] objArr = (java.lang.Object[]) it6.next();
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(((java.lang.Integer) objArr[0]).intValue(), (java.lang.Object[]) objArr[1]);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup kv %s, %s", objArr[0], ((java.lang.Object[]) objArr[1])[0]);
                                    }
                                    return null;
                                }
                            }

                            public AnonymousClass2(final com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd32) {
                            }

                            @Override // nm.l
                            public void a() {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "afterDraw");
                                if (com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278273c0) {
                                    com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278273c0 = false;
                                    long nativeHeapAllocatedSize = android.os.Debug.getNativeHeapAllocatedSize();
                                    if (nativeHeapAllocatedSize > 209715200) {
                                        if (nativeHeapAllocatedSize < 419430400) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(959L, 190L, 1L);
                                        } else if (nativeHeapAllocatedSize < 629145600) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(959L, 191L, 1L);
                                        } else if (nativeHeapAllocatedSize < 838860800) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(959L, 192L, 1L);
                                        } else {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(959L, 193L, 1L);
                                        }
                                    }
                                }
                                if (!nm.a.f419955w ? false : nm.a.a(256)) {
                                    nm.a.e(6);
                                    long currentTimeMillis = java.lang.System.currentTimeMillis() - nm.a.f419956x;
                                    nm.a.c(nm.a.f419940h, currentTimeMillis);
                                    if (currentTimeMillis <= 3000) {
                                        nm.a.c(nm.a.f419941i, 1L);
                                    } else if (currentTimeMillis > 3000 && currentTimeMillis <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d) {
                                        nm.a.c(nm.a.f419942j, 1L);
                                    } else if (currentTimeMillis <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d || currentTimeMillis > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                                        nm.a.c(nm.a.f419944l, 1L);
                                    } else {
                                        nm.a.c(nm.a.f419943k, 1L);
                                    }
                                    nm.a.c(nm.a.f419933a, 1L);
                                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - nm.a.f419957y;
                                    nm.a.d(nm.a.f419946n, elapsedRealtime);
                                    if (elapsedRealtime <= 2000) {
                                        nm.a.d(nm.a.f419947o, 1L);
                                    } else if (elapsedRealtime > 2000 && elapsedRealtime <= 4000) {
                                        nm.a.d(nm.a.f419948p, 1L);
                                    } else if (elapsedRealtime > 4000 && elapsedRealtime <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d) {
                                        nm.a.d(nm.a.f419949q, 1L);
                                    } else if (elapsedRealtime > p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d && elapsedRealtime <= 8000) {
                                        nm.a.d(nm.a.f419950r, 1L);
                                    } else if (elapsedRealtime <= 8000 || elapsedRealtime > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                                        nm.a.d(nm.a.f419952t, 1L);
                                    } else {
                                        nm.a.d(nm.a.f419951s, 1L);
                                    }
                                    nm.a.d(nm.a.f419945m, 1L);
                                    nm.a.f419954v.add(new java.lang.Object[]{15854, new java.lang.Object[]{java.lang.Long.valueOf(elapsedRealtime)}});
                                    gm0.c2.b("First Screen");
                                    ((km5.q) km5.u.d()).l(500L).q(new gm5.a(this) { // from class: com.tencent.mm.ui.HomeUI.2.1
                                        public AnonymousClass1(com.p314xaae8f345.mm.ui.C21374x812c2fd3.AnonymousClass2 this) {
                                        }

                                        @Override // gm5.a
                                        /* renamed from: call */
                                        public java.lang.Object mo1059x2e7a5e(java.lang.Object obj2) {
                                            java.util.ArrayList arrayList3 = nm.a.f419953u;
                                            java.util.ArrayList arrayList22 = new java.util.ArrayList();
                                            java.util.Iterator it7 = arrayList3.iterator();
                                            while (it7.hasNext()) {
                                                long[] jArr = (long[]) it7.next();
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup %s, %s, %s", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]));
                                                arrayList22.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(jArr[0], jArr[1], jArr[2]));
                                            }
                                            if (arrayList22.size() > 0) {
                                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList22, false, false);
                                            }
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup report size %s", java.lang.Integer.valueOf(arrayList3.size()));
                                            arrayList3.clear();
                                            java.util.Iterator it62 = nm.a.f419954v.iterator();
                                            while (it62.hasNext()) {
                                                java.lang.Object[] objArr = (java.lang.Object[]) it62.next();
                                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(((java.lang.Integer) objArr[0]).intValue(), (java.lang.Object[]) objArr[1]);
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup kv %s, %s", objArr[0], ((java.lang.Object[]) objArr[1])[0]);
                                            }
                                            return null;
                                        }
                                    });
                                }
                                nm.j jVar2 = nm.j.f419976g;
                                synchronized (jVar2) {
                                    if (jVar2.f419978b) {
                                        jVar2.f419978b = false;
                                        jVar2.b();
                                    }
                                }
                            }
                        };
                        if (u75.e.a()) {
                            c7182xc7dc863b.postInvalidate();
                        }
                        java.lang.System.currentTimeMillis();
                        c21374x812c2fd32.f278291q.setContentView(c21374x812c2fd32.K);
                        android.os.Looper.myQueue().addIdleHandler(c21374x812c2fd32.O);
                        java.lang.System.currentTimeMillis();
                        c21374x812c2fd32.m();
                        c21374x812c2fd32.f278277c.L();
                        c21374x812c2fd32.K.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.3
                            public AnonymousClass3() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd32 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                                c21374x812c2fd32.w(true);
                                c01.d9.b().p().z(327947, c21374x812c2fd32.f278277c.l());
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "contentView.post then setFullScreenAfterSetContentView, padding: %s", java.lang.Integer.valueOf(c21374x812c2fd32.K.getPaddingTop()));
                                o25.n1.b(c21374x812c2fd32.f278291q, c21374x812c2fd32.K, 0);
                            }

                            /* renamed from: toString */
                            public java.lang.String m78425x9616526c() {
                                return super.toString() + "|updateTitle";
                            }
                        });
                        java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new java.lang.Runnable(c21374x812c2fd32) { // from class: com.tencent.mm.ui.HomeUI.4
                            public AnonymousClass4(final com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd32) {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                b4.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).c(new android.content.Intent(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32759x8d5572b3));
                            }

                            /* renamed from: toString */
                            public java.lang.String m78426x9616526c() {
                                return super.toString() + "|sendBroadcast";
                            }
                        }, 2000L);
                        c21374x812c2fd32.K.addOnLayoutChangeListener(c21374x812c2fd32.f278296v);
                        o25.n1.b(c21374x812c2fd32.f278291q, c21374x812c2fd32.K, 0);
                        c21374x812c2fd32.K.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.5
                            public AnonymousClass5() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "contentView.post, padding: %s", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.K.getPaddingTop()));
                            }
                        }, 20L);
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        com.p314xaae8f345.mm.ui.fl.b(context);
                        com.p314xaae8f345.mm.ui.v7.b(context);
                        com.p314xaae8f345.mm.ui.w9.b(context);
                        com.p314xaae8f345.mm.ui.rk.b(context);
                        com.p314xaae8f345.mm.ui.eg.c(context);
                        com.p314xaae8f345.mm.ui.ee.d(1);
                        com.p314xaae8f345.mm.ui.p2740x696c9db.id.b(new com.p314xaae8f345.mm.ui.p2740x696c9db.hd() { // from class: com.tencent.mm.ui.HomeUI$$g
                            @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.hd
                            public final void a() {
                                java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                                com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.w(true);
                            }
                        }, c21374x812c2fd32.f278291q);
                        c21374x812c2fd32.M.mo48813x58998cd();
                        c21374x812c2fd32.N.mo48813x58998cd();
                        c21374x812c2fd32.f278294t.d();
                        if (c21374x812c2fd32.K != null) {
                            c21374x812c2fd32.K.setBackground(null);
                        }
                        c21374x812c2fd32.f278294t.f278460g = new com.p314xaae8f345.mm.ui.C21374x812c2fd3.AnonymousClass1();
                        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd32 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                                java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                                c21374x812c2fd32.getClass();
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6873x79cc99ee c6873x79cc99ee = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6873x79cc99ee();
                                c6873x79cc99ee.f141913d = 1;
                                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN;
                                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                                c6873x79cc99ee.f141914e = ((java.lang.Boolean) c17.m(u3Var, bool2)).booleanValue() ? 1 : 2;
                                c6873x79cc99ee.f141915f = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, bool2)).booleanValue() ? 1 : 2;
                                c6873x79cc99ee.f141916g = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, bool2)).booleanValue() ? 1 : 2;
                                c6873x79cc99ee.f141917h = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, bool2)).booleanValue() ? 1 : 2;
                                c6873x79cc99ee.f141918i = ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ri() ? 1 : 2;
                                c6873x79cc99ee.k();
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                                synchronized (g0Var.f239712i) {
                                    for (android.util.Pair pair : g0Var.f239712i) {
                                        g0Var.B(((java.lang.Long) pair.first).longValue(), ((java.lang.Long) pair.second).longValue());
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportManagerKvCheck", "clear all pendding stat %d", java.lang.Integer.valueOf(((java.util.LinkedList) g0Var.f239712i).size()));
                                    ((java.util.LinkedList) g0Var.f239712i).clear();
                                }
                            }
                        });
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.HomeUI", "mmcore has not ready, finish launcherui");
                        c21374x812c2fd32.f278291q.finish();
                    }
                    h7(getIntent());
                }
                final com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd32 = this.f278362i;
                c21374x812c2fd32.getClass();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                c21374x812c2fd32.f278294t.g();
                c21374x812c2fd32.f278294t.f(((com.p314xaae8f345.mm.ui.C21427xe5bb8a3) c21374x812c2fd32.f278292r).k());
                com.p314xaae8f345.mm.ui.o7 o7Var2 = c21374x812c2fd32.f278293s;
                o7Var2.getClass();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5250x27a85c01 c5250x27a85c01 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5250x27a85c01();
                c5250x27a85c01.e();
                am.o2 o2Var = c5250x27a85c01.f135583g;
                if (o2Var.f89039a && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o2Var.f89040b)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "  now show msg:%s", o2Var.f89040b);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(o7Var2.f290983a);
                    u1Var.u(o7Var2.c(com.p314xaae8f345.mm.R.C30867xcad56011.f572121z9));
                    u1Var.h(o7Var2.c(com.p314xaae8f345.mm.R.C30867xcad56011.f572120z8));
                    u1Var.f293529a.f293354b.f293264u = o2Var.f89040b;
                    u1Var.a(false);
                    u1Var.l(new com.p314xaae8f345.mm.ui.p6(o7Var2));
                    u1Var.q(false);
                }
                am.zg zgVar = o7Var2.f290985c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "doOnResumeCheck");
                if (o7Var2.f(zgVar)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "doOnResumeCheck, showGlobalAlert");
                } else {
                    gm0.j1.e().k(new com.p314xaae8f345.mm.ui.d7(o7Var2), 500L);
                }
                o7Var2.f290985c = null;
                z65.c.f551988a = true;
                boolean k17 = ((com.p314xaae8f345.mm.ui.C21427xe5bb8a3) c21374x812c2fd32.f278292r).k();
                if (!k17 && gm0.j1.a()) {
                    nm.j.f419976g.a(new java.lang.Runnable(c21374x812c2fd32) { // from class: com.tencent.mm.ui.HomeUI.7
                        public AnonymousClass7(final com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd322) {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s.H;
                            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.c();
                            ((vf0.y1) k1Var).getClass();
                            t21.o2.aj(cVar, 0L);
                        }
                    });
                    if (q21.d.b() != null && q21.d.a() != null) {
                        ua3.b bVar2 = ((va3.z0) q21.d.a()).f515930b;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar2 != null ? bVar2.f507509e : "")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "launcher onResume end track %s", ((va3.v0) q21.d.b()).f515897v);
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5385x2a29ba52 c5385x2a29ba52 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5385x2a29ba52();
                            c5385x2a29ba52.f135720g.f89709a = ((va3.v0) q21.d.b()).f515897v;
                            c5385x2a29ba52.e();
                        }
                    }
                }
                if (!k17) {
                    pf0.u uVar = (pf0.u) i95.n0.c(pf0.u.class);
                    int i17 = c21374x812c2fd322.f278294t.f278458e;
                    kn4.i0 i0Var = (kn4.i0) uVar;
                    i0Var.getClass();
                    java.lang.String str4 = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? null : "MoreTabUI" : "FindMoreFriendUI" : "AddressUI" : "MainUI";
                    if (str4 != null) {
                        i0Var.Ai(str4, 3);
                    }
                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) c21374x812c2fd322.f278294t.f278468o.get(0);
                    if (c22376x88ed722d != null && (j0Var = c22376x88ed722d.f288912v) != null) {
                        ((yf5.w0) j0Var).f543521t.b(260);
                    }
                }
                al5.a3.c(c21374x812c2fd322.f278291q);
                c21374x812c2fd322.f278291q.mo2326xb052149b(1.0f);
                c21374x812c2fd322.f278290p = com.p314xaae8f345.mm.ui.C21374x812c2fd3.ActivityStatus.ACTIVITY_RESUME;
                if (c21374x812c2fd322.f278276b) {
                    c21374x812c2fd322.f278276b = false;
                }
                com.p314xaae8f345.mm.p943x351df9c2.b1.f151959b = 0;
                com.p314xaae8f345.mm.p943x351df9c2.b1.f151960c.d();
                java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.HomeUI", "[Launching Application]");
                gm0.k2.a(c21374x812c2fd322.f278291q, false);
                gm0.k2.b(c21374x812c2fd322.f278291q, false);
                java.lang.System.currentTimeMillis();
                c21374x812c2fd322.t();
                java.lang.System.currentTimeMillis();
                if (m78443x9cf0d20b() != null) {
                    nm.j jVar2 = nm.j.f419976g;
                    synchronized (jVar2) {
                        jVar2.f419980d = false;
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
                    c01.ad.f118594a.c("showprivacypolicy", c21374x812c2fd322.U);
                    c21374x812c2fd322.u(false);
                    c21374x812c2fd322.L.mo48813x58998cd();
                    java.lang.System.currentTimeMillis();
                    gm0.j1.a();
                }
                java.lang.System.currentTimeMillis();
                java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "initView " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                if (c21374x812c2fd322.f278276b) {
                    c21374x812c2fd322.f278276b = false;
                }
                if (com.p314xaae8f345.mm.app.i5.f134989c == null) {
                    com.p314xaae8f345.mm.app.i5.f134989c = new com.p314xaae8f345.mm.app.i5();
                }
                com.p314xaae8f345.mm.app.i5 i5Var = com.p314xaae8f345.mm.app.i5.f134989c;
                i5Var.f134990a = true;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = i5Var.f134991b;
                n3Var.mo50303x856b99f0(-1999);
                n3Var.mo50303x856b99f0(-2999);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "start time check LauncherUI Launcher onResume end: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOGIN_SHOW_BIND_THIRD_ADD_TYPE_INT;
                int r17 = c17.r(u3Var, 0);
                if (r17 != 0) {
                    gm0.j1.u().c().x(u3Var, 0);
                    if (!c01.z1.u() && r17 == 1) {
                        db5.e1.u(c21374x812c2fd322.f278291q, c21374x812c2fd322.l(com.p314xaae8f345.mm.R.C30867xcad56011.ghh), "", new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.8
                            public AnonymousClass8() {
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd33 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                                com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = c21374x812c2fd33.f278291q;
                                android.content.Intent intent2 = new android.content.Intent(c21374x812c2fd33.f278291q, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11448x932bffb8.class);
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                arrayList3.add(intent2);
                                java.util.Collections.reverse(arrayList3);
                                yj0.a.d(activityC21401x6ce6f73f, arrayList3.toArray(), "com/tencent/mm/ui/HomeUI$8", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                activityC21401x6ce6f73f.startActivity((android.content.Intent) arrayList3.get(0));
                                yj0.a.f(activityC21401x6ce6f73f, "com/tencent/mm/ui/HomeUI$8", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            }
                        }, null);
                    }
                }
                nm.j jVar3 = nm.j.f419976g;
                jVar3.a(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.9
                    public AnonymousClass9() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        int i18;
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd33 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                        java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                        c21374x812c2fd33.getClass();
                        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable(c21374x812c2fd33) { // from class: com.tencent.mm.ui.HomeUI.10
                            public AnonymousClass10(com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd332) {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                int o17 = i65.a.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                                if (currentTimeMillis2 - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("font_size_report_time", 0L) > 604800000) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14239, java.lang.Integer.valueOf(o17));
                                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("font_size_report_time", currentTimeMillis2);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "using font size kvReport logID:%d , usingFontSize: %d", 14239, java.lang.Integer.valueOf(o17));
                                }
                            }
                        });
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd34 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                        c21374x812c2fd34.getClass();
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        if (currentTimeMillis2 - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getLong("dark_mode_status", 0L) > 86400000) {
                            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            int i19 = com.p314xaae8f345.mm.ui.bk.F() ? com.p314xaae8f345.mm.ui.bk.I() ? 1 : 2 : 0;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                            g0Var.d(18893, 1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0), 2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.F() ? 1 : 0));
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putLong("dark_mode_status", currentTimeMillis2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "dark mode kvReport logID:%s , action: %s, isDark:%s", 18893, 1, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.C()));
                            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = c21374x812c2fd34.f278291q;
                            if (activityC21401x6ce6f73f != null) {
                                int i27 = activityC21401x6ce6f73f.getBaseContext().getResources().getConfiguration().uiMode & 48;
                                if (i27 == 16) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "dancy test isSystemDarkMode not darkmode");
                                } else if (i27 == 32) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIUtils", "dancy test isSystemDarkMode darkmode");
                                    i18 = 1;
                                    g0Var.d(18893, 3, java.lang.Integer.valueOf(i18), 2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.F() ? 1 : 0));
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "dark mode kvReport logID:%s , action: %s, isDark:%s", 18893, 1, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.C()));
                                }
                            }
                            i18 = 0;
                            g0Var.d(18893, 3, java.lang.Integer.valueOf(i18), 2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.F() ? 1 : 0));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "dark mode kvReport logID:%s , action: %s, isDark:%s", 18893, 1, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.C()));
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("dark_mode_follow_system_need_report", false)) {
                            java.lang.Object[] objArr = new java.lang.Object[4];
                            objArr[0] = 18893;
                            objArr[1] = 4;
                            objArr[2] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0);
                            objArr[3] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.I() ? 1 : 2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "dark mode kvReport logID:%s, action:%s, dark:%s, mode:%s", objArr);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                            java.lang.Object[] objArr2 = new java.lang.Object[5];
                            objArr2[0] = 4;
                            objArr2[1] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0);
                            objArr2[2] = 2;
                            objArr2[3] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.I() ? 1 : 2);
                            objArr2[4] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.F() ? 1 : 0);
                            g0Var2.d(18893, objArr2);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("dark_mode_follow_system_need_report", false);
                        }
                        if (com.p314xaae8f345.mm.ui.bk.C() && !com.p314xaae8f345.mm.ui.bk.L()) {
                            if (!j65.m.f379499a) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMUIModeManager", "dark mode used: %s", java.lang.Boolean.TRUE);
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("dark_mode_used", true);
                                j65.m.f379499a = true;
                            }
                            if (com.p314xaae8f345.mm.ui.bk.I()) {
                                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd35 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                                c21374x812c2fd35.getClass();
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("dark_mode_notice_dialog", false)) {
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(c21374x812c2fd35.f278291q);
                                    u1Var2.g(c21374x812c2fd35.f278291q.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572566bn1));
                                    u1Var2.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
                                    u1Var2.l(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1(c21374x812c2fd35) { // from class: com.tencent.mm.ui.HomeUI.11
                                        public AnonymousClass11(com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd352) {
                                        }

                                        @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
                                        public void a(boolean z18, java.lang.String str6) {
                                        }
                                    });
                                    u1Var2.q(false);
                                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("dark_mode_notice_dialog", true);
                                }
                            }
                        }
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd36 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                        c21374x812c2fd36.getClass();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("caremode_setting_succeed", false)) {
                            c21374x812c2fd36.m78421xefd35ffa().a(3);
                            android.content.Intent intent2 = new android.content.Intent();
                            if (((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi()) {
                                intent2.setClassName(c21374x812c2fd36.f278291q, "com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro");
                            } else {
                                intent2.setClassName(c21374x812c2fd36.f278291q, "com.tencent.mm.plugin.setting.ui.setting.SettingsUI");
                            }
                            intent2.putExtra("jumptocare", true);
                            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39695x233c02ec.getClass();
                            intent2.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39705x8cb7317, 0);
                            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f2 = c21374x812c2fd36.f278291q;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(intent2);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(activityC21401x6ce6f73f2, arrayList3.toArray(), "com/tencent/mm/ui/HomeUI", "showCareModeNotice", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            activityC21401x6ce6f73f2.startActivity((android.content.Intent) arrayList3.get(0));
                            yj0.a.f(activityC21401x6ce6f73f2, "com/tencent/mm/ui/HomeUI", "showCareModeNotice", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_NOTICE_BOOLEAN, false)));
                        j65.e.b();
                        int i28 = j65.e.a().getInt("care_mode_font_size", 0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCareModeManager", "getCareModeFontSize:%s", java.lang.Integer.valueOf(i28));
                        int b17 = f14.e.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        boolean z18 = j65.e.a().getBoolean("care_mode_change", false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCareModeManager", "getCareModeChange:%s", java.lang.Boolean.valueOf(z18));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "careModeChange:%s, careModeFontSize:%s, currentIndex:%s", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(b17));
                        if (z18) {
                            j65.e.i(false);
                            if (j65.e.b()) {
                                boolean z19 = j65.e.e() && b17 < 5;
                                wd0.g1 Ui = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui();
                                wd0.g1 g1Var = wd0.g1.f526246e;
                                boolean z27 = Ui == g1Var && ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Zi() != g1Var;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "MMCareMode updateHearingAid = %b, updateLargeFont = %b", java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z19));
                                if (z19 || z27) {
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                    if (!z19) {
                                        u1Var3.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8c));
                                    } else if (z27) {
                                        u1Var3.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8b));
                                    } else {
                                        u1Var3.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8a));
                                    }
                                    u1Var3.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n86));
                                    u1Var3.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6w));
                                    u1Var3.l(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: com.tencent.mm.ui.HomeUI.12

                                        /* renamed from: a */
                                        public final /* synthetic */ boolean f278310a;

                                        /* renamed from: b */
                                        public final /* synthetic */ boolean f278311b;

                                        public AnonymousClass12(boolean z192, boolean z272) {
                                            r2 = z192;
                                            r3 = z272;
                                        }

                                        @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
                                        public void a(boolean z28, java.lang.String str6) {
                                            if (z28) {
                                                if (r2) {
                                                    j65.c.h(5);
                                                    j65.e.j(5);
                                                }
                                                if (r3) {
                                                    com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                                                    if (c20976x6ba6452a != null) {
                                                        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).fj(c20976x6ba6452a, ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Vi() != wd0.g1.f526246e ? ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Vi() : ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Zi());
                                                    } else {
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.HomeUI", "showCareModeNotice(), lifecycleScope is null");
                                                    }
                                                }
                                                android.content.Intent intent3 = new android.content.Intent();
                                                intent3.putExtra("Intro_Need_Clear_Top ", true);
                                                ((com.p314xaae8f345.mm.app.y7) f14.g.b()).d(intent3, com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278291q);
                                            }
                                        }
                                    });
                                    u1Var3.q(false);
                                }
                            } else {
                                if (i28 > 0 && j65.e.e()) {
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var4 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                    u1Var4.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8_));
                                    u1Var4.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n86));
                                    u1Var4.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6w));
                                    u1Var4.i(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: com.tencent.mm.ui.HomeUI.13
                                        public AnonymousClass13() {
                                        }

                                        @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
                                        public void a(boolean z28, java.lang.String str6) {
                                            if (z28) {
                                                return;
                                            }
                                            j65.c.h(j65.c.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                                            j65.e.j(0);
                                            j65.e.k(false);
                                            android.content.Intent intent3 = new android.content.Intent();
                                            intent3.putExtra("Intro_Need_Clear_Top ", true);
                                            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).d(intent3, com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278291q);
                                        }
                                    });
                                    u1Var4.q(false);
                                }
                            }
                        }
                        if (j65.e.d()) {
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
                            j65.e.n(true);
                        }
                    }
                });
                if (c21374x812c2fd322.f278295u) {
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    int hashCode = c21374x812c2fd322.hashCode();
                    iy1.c cVar = iy1.c.MainUI;
                    ((cy1.a) rVar).uj("MainUI_LeftScreen", hashCode, 1006, 0);
                }
                if (c21374x812c2fd322.m78421xefd35ffa().f278458e != 3 && (c22702xa9a9ae2a = (c21417xe2e4fa74 = (com.p314xaae8f345.mm.ui.C21417xe2e4fa74) c21374x812c2fd322.m78421xefd35ffa().h(3)).f278483u) != null && !c22702xa9a9ae2a.f293680J) {
                    c22702xa9a9ae2a.n();
                    c21417xe2e4fa74.V0();
                }
                com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f39300xb2a14a43;
                c21427xe5bb8a3.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                if (c21427xe5bb8a3.f278549c == null && c21427xe5bb8a3.n()) {
                    c21427xe5bb8a3.f278551e = new com.p314xaae8f345.mm.ui.sf(c21427xe5bb8a3);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.tf(c21427xe5bb8a3), 50L);
                }
                com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = c21427xe5bb8a3.f278547a;
                if ((activityC21401x6ce6f73f instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) && ((com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) activityC21401x6ce6f73f).T6() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "tryInitVasContainer() called real create container inflate activity_common_vas_for_launcher");
                    android.view.View inflate = android.view.LayoutInflater.from(c21427xe5bb8a3.f278547a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569462bu, (android.view.ViewGroup) null);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(inflate, arrayList3.toArray(), "com/tencent/mm/ui/NewChattingTabUI", "tryInitVasContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    inflate.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(inflate, "com/tencent/mm/ui/NewChattingTabUI", "tryInitVasContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((android.view.ViewGroup) c21427xe5bb8a3.f278547a.getWindow().getDecorView()).addView(inflate);
                }
                if (c21427xe5bb8a3.k()) {
                    ((kn4.i0) ((pf0.u) i95.n0.c(pf0.u.class))).Ai("ChattingUI", 3);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = c21427xe5bb8a3.f278560n;
                    if (abstractC21611x7536149b != null && abstractC21611x7536149b.m78668x4e2d2008()) {
                        c21427xe5bb8a3.f278560n.m78658x28280f95().m81450x8e764904(true);
                    }
                } else if (c21427xe5bb8a3.f278565s) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "[onResume] need exec this runnable!");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(c21427xe5bb8a3.f39392xeac1d598);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(c21427xe5bb8a3.f39392xeac1d598);
                    c21427xe5bb8a3.f278565s = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "resumeNormalJump");
                com.p314xaae8f345.mm.ui.uc.a();
                if ("pushcontent_notification".equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "nofification_type")) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "Main_FromUserName"))) {
                    java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "Main_FromUserName");
                    int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(getIntent(), "MainUI_User_Last_Msg_Type", 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI", "launch report, fromUserName = %s, msgType = %d" + l17 + "" + g17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10856, java.lang.Integer.valueOf(g17), l17, 0);
                }
                java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "LauncherUI.Shortcut.LaunchType");
                if (l18 != null) {
                    if (l18.equals("launch_type_voip")) {
                        android.content.Intent putExtra = new android.content.Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip");
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(putExtra);
                        java.util.Collections.reverse(arrayList4);
                        str3 = "";
                        yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList4.get(0));
                        yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11034, 2, 0);
                    } else {
                        str3 = "";
                        if (l18.equals("launch_type_voip_audio")) {
                            android.content.Intent putExtra2 = new android.content.Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip_audio");
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            arrayList5.add(putExtra2);
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((android.content.Intent) arrayList5.get(0));
                            yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11034, 2, 1);
                        } else if (!l18.equals("launch_type_scan_qrcode")) {
                            str = str3;
                            if (l18.equals("launch_type_offline_wallet")) {
                                getIntent().putExtra("LauncherUI.Shortcut.LaunchType", str);
                                r45.t54 t54Var = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Di(this, "WalletOfflineEntranceUI", 3, r45.t54.class);
                                if (t54Var != null) {
                                    t54Var.f467690d = "launch_type_offline_wallet";
                                }
                                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
                                if (intValue == 0 || intValue == 1) {
                                    android.content.Intent className = new android.content.Intent().setClassName(this, "com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI");
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                    arrayList6.add(className);
                                    java.util.Collections.reverse(arrayList6);
                                    yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    startActivity((android.content.Intent) arrayList6.get(0));
                                    yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                } else if (intValue == 8) {
                                    if (this.f278368r == null) {
                                        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
                                        this.f278368r = new nt4.e();
                                    }
                                    ((nt4.e) this.f278368r).b(this);
                                }
                            } else if (l18.equals("launch_type_my_qrcode")) {
                                getIntent().putExtra("LauncherUI.Shortcut.LaunchType", str);
                                r45.t54 t54Var2 = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Di(this, "SelfQRCodeUI", 3, r45.t54.class);
                                if (t54Var2 != null) {
                                    t54Var2.f467690d = "launch_type_my_qrcode";
                                }
                                ((hs.d0) ((kd0.i2) i95.n0.c(kd0.i2.class))).getClass();
                                e04.g2.a(this, null);
                            }
                        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalScan.k(this, null)) {
                            str = str3;
                            getIntent().putExtra("LauncherUI.Shortcut.LaunchType", str);
                            r45.t54 t54Var3 = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Di(this, "BaseScanUI", 3, r45.t54.class);
                            if (t54Var3 != null) {
                                t54Var3.f467690d = "launch_type_scan_qrcode";
                            }
                            android.content.Intent className2 = new android.content.Intent().setClassName(this, "com.tencent.mm.plugin.scanner.ui.BaseScanUI");
                            className2.putExtra("key_enable_multi_code", true);
                            className2.putExtra("key_scan_goods_enable_dynamic_wording", true);
                            className2.putExtra("key_enable_scan_code_product_merge", true);
                            className2.putExtra("key_scan_report_enter_scene", 14);
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            arrayList7.add(className2);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(this, arrayList7.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((android.content.Intent) arrayList7.get(0));
                            yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }
                    str = str3;
                } else {
                    str = "";
                }
                java.lang.String l19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "LauncherUI.switch.tab");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l19)) {
                    com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd33 = this.f278362i;
                    c21374x812c2fd33.m78421xefd35ffa().o(l19);
                    if (l19.equals("tab_find_friend")) {
                        c21374x812c2fd33.m78421xefd35ffa().h(2).m78387x1e885992().putExtra("LauncherUI.FindMore.HighLightPreference", getIntent().getStringExtra("LauncherUI.FindMore.HighLightPreference"));
                    }
                    getIntent().putExtra("LauncherUI.switch.tab", str);
                }
                getIntent().putExtra("LauncherUI.FindMore.HighLightPreference", str);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(getIntent(), "LauncherUI.From.Scaner.Shortcut", false) || this.f278367q) {
                    this.f278367q = false;
                    com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = m78443x9cf0d20b();
                    if (m78443x9cf0d20b != null) {
                        android.net.Uri referrer = getReferrer();
                        if (referrer == null || (str2 = referrer.getAuthority()) == null) {
                            str2 = str;
                        }
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd34 = m78443x9cf0d20b.f278362i;
                        c21374x812c2fd34.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "startScanner referrerPackageName: %s", str2);
                        gm0.j1.e().p();
                        com.p314xaae8f345.mm.ui.he heVar = c21374x812c2fd34.f278294t.f278455b;
                        heVar.getClass();
                        jVar3.a(new com.p314xaae8f345.mm.ui.xe(heVar));
                        c21374x812c2fd34.P = str2;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(c21374x812c2fd34.Q);
                    }
                    getIntent().putExtra("LauncherUI.From.Scaner.Shortcut", false);
                    getIntent().putExtra("LauncherUI.switch.tab", "tab_find_friend");
                }
                boolean c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(getIntent(), "LauncherUI.From.Biz.Shortcut", false);
                if (c18) {
                    action = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "LauncherUI.Shortcut.Username");
                } else {
                    c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(getIntent(), "LauncherUI_From_Biz_Shortcut", false);
                    action = getIntent().getAction();
                }
                if (c18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(action)) {
                    java.lang.String g18 = xp1.c.g(action);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g18)) {
                        if (c01.e2.J(g18)) {
                            if (r01.z.k(g18)) {
                                ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                                if (r01.z.g(g18)) {
                                    android.content.Intent intent2 = new android.content.Intent();
                                    intent2.setClassName(this, "com.tencent.mm.ui.bizchat.BizChatConversationUI");
                                    intent2.putExtra("Contact_User", g18);
                                    intent2.putExtra("biz_chat_from_scene", 9);
                                    intent2.addFlags(67108864);
                                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                    arrayList8.add(intent2);
                                    java.util.Collections.reverse(arrayList8);
                                    yj0.a.d(this, arrayList8.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    startActivity((android.content.Intent) arrayList8.get(0));
                                    yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                } else {
                                    ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                                    if (r01.z.j(g18)) {
                                        android.content.Intent intent3 = new android.content.Intent();
                                        intent3.setClassName(this, "com.tencent.mm.ui.conversation.EnterpriseConversationUI");
                                        intent3.putExtra("enterprise_biz_name", g18);
                                        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                                        intent3.putExtra("enterprise_biz_display_name", c01.a2.e(g18));
                                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                                        arrayList9.add(intent3);
                                        java.util.Collections.reverse(arrayList9);
                                        yj0.a.d(this, arrayList9.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        startActivity((android.content.Intent) arrayList9.get(0));
                                        yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    } else if (r01.z.l(g18)) {
                                        qk.o b17 = r01.z.b(g18);
                                        java.lang.String z07 = b17 == null ? null : b17.z0();
                                        if (z07 == null) {
                                            z07 = str;
                                        }
                                        android.content.Intent intent4 = new android.content.Intent();
                                        intent4.putExtra("rawUrl", z07);
                                        intent4.putExtra("useJs", true);
                                        intent4.putExtra("srcUsername", g18);
                                        intent4.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                                        intent4.addFlags(67108864);
                                        j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent4, null);
                                    } else {
                                        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b2 = m78443x9cf0d20b();
                                        android.os.Bundle bundle = new android.os.Bundle();
                                        bundle.putInt("chat_from_scene", 3);
                                        m78443x9cf0d20b2.m78447x5d4f20c8(g18, bundle, false);
                                    }
                                }
                            } else {
                                com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b3 = m78443x9cf0d20b();
                                if (m78443x9cf0d20b3 != null) {
                                    m78443x9cf0d20b3.m78447x5d4f20c8(g18, null, false);
                                }
                            }
                        }
                        getIntent().putExtra("LauncherUI_From_Biz_Shortcut", false);
                        getIntent().putExtra("LauncherUI.From.Biz.Shortcut", false);
                    }
                }
                this.f278366p = true;
            } else if (!B) {
                m7();
            }
        }
        nm.a.e(5);
        if (!B) {
            l7(false);
        }
        c7();
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallVisibilityUtil", "fixFloatBallIfNeed, try to fix");
            Bi.e0();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallVisibilityUtil", "fixFloatBallIfNeed, service is null");
        }
        ((d73.i) i95.n0.c(d73.i.class)).C6();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175264a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "checkWXBizEntry by LauncherUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175270g = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175271h = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.e();
        ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4959x9cc66e26.class)).mo42693xc897a1ab(this);
        if (gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.g8(this));
        }
        gm0.c2.b("LauncherUI");
        com.p314xaae8f345.mm.app.u6.INSTANCE.h(com.p314xaae8f345.mm.app.t6.UNTIL_LAUNCHER_UI_ON_RESUME_END);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f39300xb2a14a43.f278560n;
        if (abstractC21611x7536149b != null) {
            java.lang.String x17 = abstractC21611x7536149b.f279685f.x();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "onSaveInstanceState:%s", x17);
                bundle.putString("last_restore_talker", x17);
            }
        }
        bundle.putBoolean("last_stay_chatting", mo78445x6b9fafe7() != null);
        bundle.putInt("last_stay_tab", m78442x336b58a0());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.z2
    /* renamed from: onSettle */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2325x58f7e80a(boolean r4, int r5, boolean r6) {
        /*
            r3 = this;
            boolean r0 = r3.f278365o
            if (r0 == 0) goto L3e
            com.tencent.mm.ui.NewChattingTabUI r0 = r3.f39300xb2a14a43
            boolean r1 = r0.n()
            if (r1 != 0) goto Ld
            goto L33
        Ld:
            if (r4 == 0) goto L31
            com.tencent.mm.ui.n8 r1 = r0.f278548b
            com.tencent.mm.ui.HomeUI r1 = (com.p314xaae8f345.mm.ui.C21374x812c2fd3) r1
            com.tencent.mm.ui.MainTabUI r1 = r1.f278294t
            java.util.HashMap r1 = r1.f278468o
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            com.tencent.mm.ui.conversation.MainUI r1 = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) r1
            if (r1 == 0) goto L31
            yf5.j0 r1 = r1.f288912v
            if (r1 == 0) goto L31
            yf5.w0 r1 = (yf5.w0) r1
            com.tencent.mm.ui.conversation.b3 r1 = r1.f543521t
            r2 = 170(0xaa, float:2.38E-43)
            r1.b(r2)
        L31:
            if (r6 != 0) goto L35
        L33:
            r0 = 1
            goto L39
        L35:
            boolean r0 = r0.a(r4, r5)
        L39:
            if (r0 != 0) goto L3e
            super.mo2325x58f7e80a(r4, r5, r6)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.mo2325x58f7e80a(boolean, int, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
        if (c9Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) c9Var).aj();
        }
        if (((pm4.u) i95.n0.c(pm4.u.class)) != null) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1385x5c6729a.C13408x4db453f8().e();
        }
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "onStop %s", java.lang.Integer.valueOf(hashCode()));
        nm.a.a(512);
        nm.a.f419955w = false;
        boolean y17 = com.p314xaae8f345.mm.ui.bk.y();
        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = this.f278362i;
        if (y17) {
            if (c21374x812c2fd3 != null) {
                c21374x812c2fd3.j();
            }
            this.f39300xb2a14a43.h();
        }
        c21374x812c2fd3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "doOnStop!!");
        if (!(c01.d9.f118638b == null)) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(false);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f118594a.i("showprivacypolicy", c21374x812c2fd3.U);
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.z2
    /* renamed from: onSwipe */
    public void mo2326xb052149b(float f17) {
        boolean z17;
        if (this.f278365o) {
            com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f39300xb2a14a43;
            com.p314xaae8f345.mm.ui.n8 n8Var = c21427xe5bb8a3.f278548b;
            if (c21427xe5bb8a3.n()) {
                if (f17 == 0.0f && !c21427xe5bb8a3.f278557k) {
                    c21427xe5bb8a3.q(0);
                    android.widget.ImageView imageView = (android.widget.ImageView) c21427xe5bb8a3.f278547a.getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.l3_);
                    if (imageView != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] prepareView GONE no cache!");
                        imageView.setVisibility(8);
                        imageView.setImageDrawable(null);
                    }
                    android.view.animation.Animation animation = c21427xe5bb8a3.f278566t;
                    if (animation != null) {
                        animation.cancel();
                    }
                } else if (f17 == 1.0f && !c21427xe5bb8a3.f278557k && !c21427xe5bb8a3.f278560n.H0()) {
                    android.widget.ImageView imageView2 = (android.widget.ImageView) c21427xe5bb8a3.f278547a.getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.l3_);
                    if (imageView2 != null && imageView2.getVisibility() == 0 && imageView2.getTag() != null) {
                        android.view.View view = (android.view.View) imageView2.getTag();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/NewChattingTabUI", "onSwipe", "(F)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/ui/NewChattingTabUI", "onSwipe", "(F)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] prepareView GONE");
                        imageView2.setVisibility(8);
                    }
                    if (c21427xe5bb8a3.f278560n.m78646xc2a54588() == null || c21427xe5bb8a3.f278560n.m78646xc2a54588().getX() > 0.0f) {
                        c21427xe5bb8a3.q(0);
                    } else {
                        c21427xe5bb8a3.q(8);
                    }
                }
                if (((com.p314xaae8f345.mm.ui.C21374x812c2fd3) n8Var).f278290p == com.p314xaae8f345.mm.ui.C21374x812c2fd3.ActivityStatus.ACTIVITY_RESUME) {
                    z17 = true;
                } else if (java.lang.Float.compare(1.0f, f17) > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] return! consumedSuperCall:%s", java.lang.Boolean.FALSE);
                    z17 = false;
                } else {
                    z17 = false;
                }
                com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = c21427xe5bb8a3.f278547a;
                if (activityC21401x6ce6f73f != null) {
                    android.view.View findViewById = activityC21401x6ce6f73f.findViewById(com.p314xaae8f345.mm.R.id.huh);
                    android.widget.ImageView imageView3 = (android.widget.ImageView) c21427xe5bb8a3.f278547a.findViewById(com.p314xaae8f345.mm.R.id.l3_);
                    if (imageView3 != null && imageView3.getVisibility() == 8 && imageView3.getDrawable() != null && !c21427xe5bb8a3.f278557k && f17 != 1.0f && f17 != 0.0f) {
                        imageView3.setVisibility(0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] !1 && !0 prepareView VISIBLE");
                        c21427xe5bb8a3.q(8);
                    }
                    if (java.lang.Float.compare(1.0f, f17) <= 0) {
                        com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(findViewById, 0.0f, 0.0f);
                        if (imageView3 != null && imageView3.getDrawable() != null) {
                            com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(imageView3, 0.0f, 0.0f);
                        }
                    } else if (imageView3 != null && imageView3.getDrawable() != null) {
                        com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(imageView3, (imageView3.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
                    } else if (findViewById != null) {
                        com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(findViewById, (findViewById.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
                    }
                }
            } else {
                z17 = true;
            }
            if (z17) {
                return;
            }
            super.mo2326xb052149b(f17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        android.view.ActionMode actionMode;
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f39300xb2a14a43;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = c21427xe5bb8a3.f278560n;
        if (abstractC21611x7536149b == null || abstractC21611x7536149b.A0() == null || !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) c21427xe5bb8a3.f278560n).m78668x4e2d2008() || fp.h.b(22) || (actionMode = c21427xe5bb8a3.f278560n.A0().A0.g(callback)) == null) {
            actionMode = null;
        }
        return actionMode == null ? super.onWindowStartingActionMode(callback) : actionMode;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (intent != null && intent.getComponent() != null) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.sd.f292275a.a(intent.getComponent().getClassName());
        }
        super.startActivityForResult(intent, i17, bundle);
    }

    /* renamed from: startChatting */
    public void m78447x5d4f20c8(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        yf5.j0 j0Var;
        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = this.f278362i;
        c21374x812c2fd3.getClass();
        if (c01.z1.H().booleanValue() && !com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0.booleanValue()) {
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278272b0.booleanValue();
        }
        boolean y17 = com.p314xaae8f345.mm.ui.bk.y();
        com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = c21374x812c2fd3.f278294t;
        if (y17) {
            c21410x67d80e90.f278462i = java.lang.Boolean.TRUE;
        } else {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) c21410x67d80e90.f278468o.get(0);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) c21410x67d80e90.f278454a.findViewById(com.p314xaae8f345.mm.R.id.huh);
            boolean z18 = (com.p314xaae8f345.mm.ui.bk.v0() && (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.c0() || com.p314xaae8f345.mm.ui.bk.y())) || com.p314xaae8f345.mm.ui.bk.Z() || com.p314xaae8f345.mm.ui.bk.w0();
            if (viewGroup != null && !z18) {
                viewGroup.setImportantForAccessibility(4);
            }
            if (c22376x88ed722d != null) {
                c22376x88ed722d.mo7506x87316e0b(true);
            }
            pf0.u uVar = (pf0.u) i95.n0.c(pf0.u.class);
            int i17 = c21410x67d80e90.f278458e;
            kn4.i0 i0Var = (kn4.i0) uVar;
            i0Var.getClass();
            java.lang.String str2 = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? null : "MoreTabUI" : "FindMoreFriendUI" : "AddressUI" : "MainUI";
            if (str2 != null) {
                i0Var.Ai(str2, 4);
            }
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d2 = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) c21410x67d80e90.f278468o.get(0);
            if (c22376x88ed722d2 != null && (j0Var = c22376x88ed722d2.f288912v) != null) {
                yf5.w0 w0Var = (yf5.w0) j0Var;
                if (w0Var.f543524w) {
                    w0Var.f543524w = false;
                }
            }
            com.p314xaae8f345.mm.ui.he heVar = c21410x67d80e90.f278455b;
            heVar.getClass();
            nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.xe(heVar));
            c21410x67d80e90.f278467n = true;
        }
        this.f39300xb2a14a43.r(str, bundle, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17354xafef217a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16712xf1541050, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.addAll(super.mo43419xa59964ef());
        ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).wi(this, hashSet);
        hashSet.add(la5.l0.class);
        hashSet.add(la5.c0.class);
        hashSet.add(la5.n.class);
        hashSet.add(la5.m.class);
        ((xe0.l0) i95.n0.c(xe0.l0.class)).getClass();
        hashSet.add(uj4.e.class);
        hashSet.add(cd0.b.class);
        hashSet.add(xn5.w0.class);
        hashSet.add(uj5.e.class);
        hashSet.add(la5.r0.class);
        hashSet.add(tf5.m.class);
    }
}
