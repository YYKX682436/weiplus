package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI */
/* loaded from: classes8.dex */
public final class ActivityC15070xc5c8f02e extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f210271o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f210272d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f210273e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f210274f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f210275g;

    /* renamed from: h, reason: collision with root package name */
    public r45.il5 f210276h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f210277i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f210278m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f210279n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rh(this));

    public final void V6() {
        boolean z17 = this.f210277i;
        this.f210278m = null;
        ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) ((jz5.n) this.f210279n).mo141623x754a37bb()).mo48814x2efc64();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        g92.b.f351302e.M0(23).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.kh(z17));
    }

    public final void W6(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", str);
        jSONObject.put("rec_type", str2);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 1, "individual_privacy", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
    }

    public final void X6(boolean z17, boolean z18) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("view_id", z18 ? "live_personalized_setting" : "finder_newlife_personalized_setting");
        lVarArr[1] = new jz5.l("finder_context_id", this.f210275g);
        lVarArr[2] = new jz5.l("finder_tab_context_id", this.f210274f);
        lVarArr[3] = new jz5.l("purview_switch", java.lang.Integer.valueOf(z17 ? 1 : 0));
        ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
    }

    public final void Y6(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82;
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.f293309c = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ikb);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
            e4Var.c();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f210273e;
            if (c21541x1c1b08fe != null && (viewOnClickListenerC22631x1cc07cc82 = c21541x1c1b08fe.M) != null) {
                viewOnClickListenerC22631x1cc07cc82.announceForAccessibility(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ikb));
            }
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x768471792);
            e4Var2.f293309c = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574514ij5);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
            e4Var2.c();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f210273e;
            if (c21541x1c1b08fe2 != null && (viewOnClickListenerC22631x1cc07cc8 = c21541x1c1b08fe2.M) != null) {
                viewOnClickListenerC22631x1cc07cc8.announceForAccessibility(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574514ij5));
            }
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.j9.a(ya2.r.f542058a, z17, 2, null, 4, null);
        g92.b bVar = g92.b.f351302e;
        m92.f fVar = new m92.f();
        if (((r45.e33) fVar.d().m75936x14adae67(17)) == null) {
            fVar.d().set(17, new r45.e33());
        }
        r45.e33 e33Var = (r45.e33) fVar.d().m75936x14adae67(17);
        if (e33Var != null) {
            e33Var.set(1, java.lang.Boolean.valueOf(z17));
        }
        bVar.S1(fVar, m92.j.f406538w);
    }

    public final void Z6(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSettingPersonalizedUI", "setVideoRec " + z17);
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.f293309c = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ikb);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
            e4Var.c();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f210272d;
            if (c21541x1c1b08fe != null && (viewOnClickListenerC22631x1cc07cc82 = c21541x1c1b08fe.M) != null) {
                viewOnClickListenerC22631x1cc07cc82.announceForAccessibility(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ikb));
            }
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x768471792);
            e4Var2.f293309c = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574514ij5);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
            e4Var2.c();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f210272d;
            if (c21541x1c1b08fe2 != null && (viewOnClickListenerC22631x1cc07cc8 = c21541x1c1b08fe2.M) != null) {
                viewOnClickListenerC22631x1cc07cc8.announceForAccessibility(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574514ij5));
            }
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.j9.a(ya2.r.f542058a, z17, 1, null, 4, null);
        g92.b bVar = g92.b.f351302e;
        m92.f fVar = new m92.f();
        if (((r45.e33) fVar.d().m75936x14adae67(17)) == null) {
            fVar.d().set(17, new r45.e33());
        }
        r45.e33 e33Var = (r45.e33) fVar.d().m75936x14adae67(17);
        if (e33Var != null) {
            e33Var.set(0, java.lang.Boolean.valueOf(z17));
        }
        bVar.S1(fVar, m92.j.f406538w);
    }

    public final void a7(android.content.Context context, java.lang.String str, boolean z17, yz5.a onConfirm, yz5.a onCancel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onConfirm, "onConfirm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCancel, "onCancel");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570588du3, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_w);
        i95.m c17 = i95.n0.c(zy2.s6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        textView.setText(zy2.s6.l6((zy2.s6) c17, str == null ? "" : str, (int) textView.getTextSize(), false, null, 0, false, null, 120, null));
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.c9x);
        android.widget.Button button2 = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.b5d);
        com.p314xaae8f345.mm.ui.bk.r0(button.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(button2.getPaint(), 0.8f);
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sh(onConfirm, y1Var));
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.th(onCancel, y1Var));
        y1Var.k(inflate);
        y1Var.f293571t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.uh(onCancel);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("finder_tab_context_id", this.f210274f);
        lVarArr[1] = new jz5.l("finder_context_id", this.f210275g);
        lVarArr[2] = new jz5.l("finder_username", xy2.c.e(this));
        lVarArr[3] = new jz5.l("cp_describe_type", java.lang.Integer.valueOf(z17 ? 2 : 1));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(button, "close_personalized_describe_close");
        ((cy1.a) aVar.ik(button, 8, 25496)).gk(button, k17);
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(button2, "close_personalized_describe_cancel");
        ((cy1.a) aVar2.ik(button2, 8, 25496)).gk(button2, k17);
        cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar3.pk(inflate, "close_personalized_describe");
        ((cy1.a) aVar3.ik(inflate, 32, 25496)).gk(inflate, k17);
        y1Var.s();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getBottomView */
    public android.view.View mo60898x89f7f366() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eea, (android.view.ViewGroup) null);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.uvn).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.lh(this));
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576421ap;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.eth);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qh(this));
        this.f210272d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_allow_recommend_video");
        this.f210273e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_allow_recommend_live");
        r45.il5 il5Var = (r45.il5) g92.b.f351302e.k2().e().m75936x14adae67(19);
        this.f210276h = il5Var;
        if (il5Var == null || il5Var.m75939xb282bd08(0) == 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_allow_recommend_category", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_allow_recommend_category", false);
        }
        if (il5Var == null || il5Var.m75939xb282bd08(2) == 0) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tuj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.tuj);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f210275g = getIntent().getStringExtra("key_context_id");
        this.f210274f = getIntent().getStringExtra("key_click_tab_context_id");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(mo55332x76847179(), iy1.c.FinderSettingPersonalizedUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(mo55332x76847179(), "WCFinderPersonalizedSettingViewController");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(mo55332x76847179(), 12, 27010);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(mo55332x76847179(), kz5.c1.k(new jz5.l("finder_context_id", this.f210275g), new jz5.l("finder_tab_context_id", this.f210274f), new jz5.l("finder_username", xy2.c.e(this))));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f210278m != null) {
            V6();
        }
        super.onDestroy();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        r45.il5 il5Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.lang.String str = c21560x1fce98fb != null ? c21560x1fce98fb.f279313q : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSettingPersonalizedUI", "click " + str);
        if (str != null) {
            switch (str.hashCode()) {
                case 643074675:
                    if (str.equals("settings_allow_recommend_category") && (il5Var = this.f210276h) != null && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) il5Var.m75936x14adae67(1)) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.U3).mo141623x754a37bb()).r()).booleanValue()) {
                            r45.h33 h33Var = (r45.h33) g92.b.f351302e.k2().e().m75936x14adae67(20);
                            this.f210277i = h33Var != null ? h33Var.m75933x41a8a7f2(3) : false;
                            r45.k74 m76504xa819f0c7 = c19786x6a1e2862.m76504xa819f0c7();
                            java.lang.String m75945x2fec8307 = m76504xa819f0c7 != null ? m76504xa819f0c7.m75945x2fec8307(0) : null;
                            boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSettingPersonalizedUI", "[onPreferenceTreeClick] enter recommend category liteapp, appId=" + m75945x2fec8307 + ", elderlyMode=" + this.f210277i + ", isTeenMode: " + mo168058x74219ae7);
                            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && !mo168058x74219ae7) {
                                this.f210278m = m75945x2fec8307;
                                ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) ((jz5.n) this.f210279n).mo141623x754a37bb()).mo48813x58998cd();
                            }
                        }
                        xc2.y2 y2Var = xc2.y2.f534876a;
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                        xc2.y2.i(y2Var, mo55332x76847179, new xc2.p0(c19786x6a1e2862), 0, null, 12, null);
                        break;
                    }
                    break;
                case 645219110:
                    if (str.equals("settings_allow_recommend_video")) {
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f210272d;
                        X6(c21541x1c1b08fe != null ? c21541x1c1b08fe.N() : true, false);
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f210272d;
                        if (c21541x1c1b08fe2 != null) {
                            if (!c21541x1c1b08fe2.N()) {
                                android.content.Context context = c21541x1c1b08fe2.f279303d;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                                a7(context, context.getString(((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() ? com.p314xaae8f345.mm.R.C30867xcad56011.mgc : com.p314xaae8f345.mm.R.C30867xcad56011.cl8, "<_wc_custom_img_ src=\"FinderObjectDynamicImageKey_FinderLikeOffIconPng\" color=\"#e5000000\" darkColor=\"#ccffffff\"/>"), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.oh(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ph(c21541x1c1b08fe2, this));
                                break;
                            } else {
                                Z6(true);
                                W6("1", "channel");
                                break;
                            }
                        }
                    }
                    break;
                case 990347489:
                    if (str.equals("settings_allow_recommend_live")) {
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = this.f210273e;
                        X6(c21541x1c1b08fe3 != null ? c21541x1c1b08fe3.N() : true, true);
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = this.f210273e;
                        if (c21541x1c1b08fe4 != null) {
                            if (!c21541x1c1b08fe4.N()) {
                                android.content.Context context2 = c21541x1c1b08fe4.f279303d;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                                a7(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cl6), true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.mh(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.nh(c21541x1c1b08fe4, this));
                                break;
                            } else {
                                Y6(true);
                                W6("1", "live");
                                break;
                            }
                        }
                    }
                    break;
                case 1217080283:
                    if (str.equals("settings_block_poster")) {
                        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).mj(mo55332x768471792, null, 3);
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean a17 = hc2.e.a();
        r45.e33 e33Var = (r45.e33) g92.b.f351302e.k2().d().m75936x14adae67(17);
        boolean m75933x41a8a7f2 = e33Var != null ? e33Var.m75933x41a8a7f2(1) : true;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f210272d;
        if (c21541x1c1b08fe != null) {
            c21541x1c1b08fe.O(a17);
            c21541x1c1b08fe.f279318v = false;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f210273e;
        if (c21541x1c1b08fe2 != null) {
            c21541x1c1b08fe2.O(m75933x41a8a7f2);
            c21541x1c1b08fe2.f279318v = false;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
    }
}
