package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI */
/* loaded from: classes10.dex */
public final class ActivityC16867xd9c62d0d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f235320d = jz5.h.b(new hr3.pc(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f235321e = jz5.h.b(new hr3.nc(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f235322f = jz5.h.b(new hr3.mc(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f235323g = jz5.h.b(new hr3.oc(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f235324h = jz5.h.b(new hr3.id(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f235325i = jz5.h.b(new hr3.jd(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f235326m = jz5.h.b(new hr3.hd(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f235327n = jz5.h.b(new hr3.vc(this));

    /* renamed from: o, reason: collision with root package name */
    public boolean f235328o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.C19640x3c29a739 f235329p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f235330q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f235331r;

    /* renamed from: s, reason: collision with root package name */
    public final xb5.b f235332s;

    /* renamed from: t, reason: collision with root package name */
    public q31.n f235333t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f235334u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f235335v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f235336w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f235337x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f235338y;

    /* renamed from: z, reason: collision with root package name */
    public final fr3.f f235339z;

    public ActivityC16867xd9c62d0d() {
        jz5.h.b(new hr3.sc(this));
        jz5.h.b(new hr3.rc(this));
        this.f235330q = new java.util.HashSet();
        this.f235331r = new java.util.ArrayList();
        xb5.b bVar = new xb5.b();
        bVar.f534545e = new hr3.yc(this);
        bVar.f534546f = new hr3.zc(this);
        this.f235332s = bVar;
        this.f235335v = jz5.h.b(new hr3.xc(this));
        this.f235336w = jz5.h.b(new hr3.gd(this));
        this.f235337x = jz5.h.b(new hr3.dd(this));
        jz5.h.b(new hr3.wc(this));
        this.f235338y = "infrequentcontactsortpage_sessionid_" + c01.id.c();
        this.f235339z = new fr3.f(this);
    }

    public final void T6(java.util.List list) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) ((jz5.n) this.f235335v).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        arrayList.removeAll(kz5.n0.X0(list));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
        e4Var.f293309c = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mf7);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var.c();
        xb5.b bVar = this.f235332s;
        java.util.List list2 = bVar.f534544d;
        if (list2 != null) {
            kz5.h0.B(list2, new hr3.qc(list));
        }
        java.util.List list3 = bVar.f534544d;
        int size = list3 != null ? list3.size() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendDeleteContactUI", "dealDeleteContact() called with: userNameList = " + list + " remainSize:" + size);
        android.view.View view = this.f235334u;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "dealDeleteContact", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "dealDeleteContact", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        q31.n nVar = this.f235333t;
        if (nVar != null) {
            ((io.g0) nVar).b(bVar);
        }
        if (size <= 0 && this.f235328o) {
            U6();
        }
        Z6();
    }

    public final void U6() {
        android.view.View view = this.f235334u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "fresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/RecommendDeleteContactUI", "fresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        m67644x2b33b77f();
        this.f235338y = "infrequentcontactsortpage_sessionid_" + c01.id.c();
        this.f235339z.O6(fr3.h.f347330a);
        Z6();
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 V6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f235321e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) mo141623x754a37bb;
    }

    public final java.lang.String W6() {
        return (java.lang.String) ((jz5.n) this.f235337x).mo141623x754a37bb();
    }

    public final boolean X6() {
        java.util.List list = this.f235332s.f534544d;
        if (list == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.String str = ((xb5.a) obj).f534539d;
            if (true ^ (str == null || str.length() == 0)) {
                arrayList.add(obj);
            }
        }
        return arrayList.isEmpty() ^ true;
    }

    public final void Y6(boolean z17) {
        if (!z17) {
            V6().setVisibility(4);
        } else {
            V6().setVisibility(X6() ? 0 : 8);
        }
    }

    public final void Z6() {
        int i17;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((jz5.n) this.f235335v).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.String str = (java.lang.String) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (true ^ r26.n0.N(str)) {
                arrayList2.add(next);
            }
        }
        Y6(true);
        java.util.List list = this.f235332s.f534544d;
        if (list != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((xb5.a) obj).f534541f) {
                    arrayList3.add(obj);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                if (!r26.n0.N(((xb5.a) next2).f534539d)) {
                    arrayList4.add(next2);
                }
            }
            i17 = arrayList4.size();
        } else {
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendDeleteContactUI", "freshButton() called selectedItemsCount:" + i17 + " userNameList:" + arrayList2);
        V6().setEnabled(i17 > 0);
        V6().setText(i17 > 0 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0) + '(' + i17 + ')' : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
    }

    public final void a7(boolean z17) {
        this.f235328o = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendDeleteContactUI", "updateFreshButton() called with: enabled = " + z17);
        jz5.g gVar = this.f235326m;
        jz5.g gVar2 = this.f235327n;
        if (z17) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb).m82040x7541828(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((android.widget.TextView) mo141623x754a37bb2).setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, android.util.StateSet.WILD_CARD}, new int[]{mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77830x4b0c748a), mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c)}));
            return;
        }
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb3).m82040x7541828(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        int color = mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        ((android.widget.TextView) mo141623x754a37bb4).setTextColor(color);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dvw;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.j(kz5.q1.j(kz5.q1.j(mo43419xa59964ef, hr3.z8.class), fr3.f.class), hr3.ni.class);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendDeleteContactUI", "onActivityResult() called with: requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent);
        if (i18 != -1 || i17 != 1 || intent == null || (stringExtra = intent.getStringExtra("Contact_User")) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendDeleteContactUI", "onActivityResult: username:".concat(stringExtra));
        T6(kz5.b0.c(stringExtra));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo78529xe76c1b79();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f235339z.f347328g = (java.util.ArrayList) ((jz5.n) this.f235335v).mo141623x754a37bb();
        this.f235329p = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19640x3c29a739) findViewById(com.p314xaae8f345.mm.R.id.imn);
        a7(false);
        U6();
        ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).bj();
        io.g0 g0Var = new io.g0();
        g0Var.b(this.f235332s);
        this.f235333t = g0Var;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        this.f235334u = g0Var.a(mo55332x76847179);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f235320d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.view.ViewGroup) mo141623x754a37bb).addView(this.f235334u);
        a42.h hVar = a42.h.f82740a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        float a17 = hVar.a(context, 14.0f);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f235324h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb2).setTextSize(1, a17);
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) this.f235326m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb3).setTextSize(1, a17);
        jz5.g gVar = this.f235325i;
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb4).setText((java.lang.String) ((jz5.n) this.f235336w).mo141623x754a37bb());
        java.lang.Object mo141623x754a37bb5 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        com.p314xaae8f345.mm.ui.bk.s0(((android.widget.TextView) mo141623x754a37bb5).getPaint());
        java.lang.Object mo141623x754a37bb6 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb6, "getValue(...)");
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        ((android.widget.TextView) mo141623x754a37bb6).setTextSize(1, hVar.a(context2, 22.0f));
        java.lang.Object mo141623x754a37bb7 = ((jz5.n) this.f235322f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb7, "getValue(...)");
        ((android.view.View) mo141623x754a37bb7).setOnClickListener(new hr3.ad(this));
        V6().setOnClickListener(new hr3.bd(this));
        java.lang.Object mo141623x754a37bb8 = ((jz5.n) this.f235323g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb8, "getValue(...)");
        ((android.view.View) mo141623x754a37bb8).setOnClickListener(new hr3.cd(this));
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), null, null, new hr3.uc(this, null), 3, null);
    }

    /* renamed from: showLoading */
    public final void m67644x2b33b77f() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19640x3c29a739 c19640x3c29a739 = this.f235329p;
        if (c19640x3c29a739 != null) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            c19640x3c29a739.d(string);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19640x3c29a739 c19640x3c29a7392 = this.f235329p;
        if (c19640x3c29a7392 == null) {
            return;
        }
        c19640x3c29a7392.setVisibility(0);
    }
}
