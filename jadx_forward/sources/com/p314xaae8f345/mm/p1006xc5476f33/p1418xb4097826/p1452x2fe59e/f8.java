package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class f8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x20, in5.x, in5.y, im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f188243d;

    /* renamed from: e, reason: collision with root package name */
    public final int f188244e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2495xc50a8b8b.g f188245f;

    /* renamed from: g, reason: collision with root package name */
    public int f188246g;

    /* renamed from: h, reason: collision with root package name */
    public int f188247h;

    /* renamed from: i, reason: collision with root package name */
    public int f188248i;

    /* renamed from: m, reason: collision with root package name */
    public int f188249m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f188250n;

    /* renamed from: o, reason: collision with root package name */
    public fp0.t f188251o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f188252p;

    /* renamed from: q, reason: collision with root package name */
    public yw2.f f188253q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f188254r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f188255s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ri0 f188256t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f188257u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f188258v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13753xb5d1ba73 f188259w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n7 f188260x;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.feed.FinderFavListDrawerPresenter$thanksUpdateListener$1] */
    public f8(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f188243d = context;
        this.f188244e = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        this.f188252p = new java.util.ArrayList();
        c01.z1.r();
        this.f188254r = new java.util.concurrent.CopyOnWriteArraySet();
        this.f188258v = true;
        this.f188259w = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.finder.feed.FinderFavListDrawerPresenter$thanksUpdateListener$1
            {
                this.f39173x3fe91575 = 1097932050;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 event = c5542xa257d922;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.md mdVar = event.f135866g;
                if (mdVar != null && mdVar.f88873d == 3) {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e8(mdVar != null ? jz5.x.a(mdVar.f88870a) : null, mdVar != null ? mdVar.f88872c : null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8.this, event));
                }
                return false;
            }
        };
        this.f188260x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n7(this);
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        fp0.t tVar = f8Var.f188251o;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y7(z17, f8Var, lVar), null, 2, null));
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f188250n;
        if (c14994x9b99c079 != null) {
            return c14994x9b99c079;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
        throw null;
    }

    public void b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        if (!this.f188255s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavListDrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        android.content.Context context = this.f188243d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo.class)).P6();
        this.f188255s = false;
        fp0.t tVar = this.f188251o;
        if (tVar != null) {
            tVar.f();
        }
        this.f188251o = null;
        mo48814x2efc64();
        java.util.Iterator it = this.f188254r.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).mo10668x2efc64();
        }
        this.f188254r.clear();
        this.f188252p.clear();
        this.f188245f = null;
        this.f188257u = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", "set upContinue false");
        f(true);
        yw2.f fVar = this.f188253q;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 n17 = fVar != null ? fVar.n() : null;
        if (n17 != null) {
            n17.m82693x1501d518(true);
        }
        yw2.f fVar2 = this.f188253q;
        if (fVar2 != null && (m82555x4905e9fa = fVar2.n().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        yw2.f fVar3 = this.f188253q;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa2 = fVar3 != null ? fVar3.n().m82555x4905e9fa() : null;
        if (m82555x4905e9fa2 != null) {
            m82555x4905e9fa2.mo7966xf161ffec(true);
        }
        yw2.f fVar4 = this.f188253q;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 n18 = fVar4 != null ? fVar4.n() : null;
        if (n18 != null) {
            n18.m82683xb165a19d(null);
        }
        this.f188253q = null;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return false;
    }

    public final void e(java.lang.String str, android.widget.TextView textView, int i17, int i18) {
        android.content.Context context = this.f188243d;
        int i19 = this.f188244e;
        java.lang.CharSequence k17 = hc2.x0.k(str, context, '#', i17, i18, i19, i19, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        if (textView == null) {
            return;
        }
        textView.setText(k17);
    }

    public final void f(boolean z17) {
        this.f188258v = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", "set downContinue " + z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8.g():void");
    }

    public final void h(java.lang.String str, int i17, java.lang.String str2, android.widget.TextView textView, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavListDrawerPresenter", "loadHighLightIcon: iconUrl" + str + " highLightColor:" + i17);
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.A));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a8 a8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a8(this, str2, textView, i18, i19, str);
        b17.getClass();
        b17.f529406d = a8Var;
        b17.f529412j = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c8(str, this, str2, textView, i18, i19);
        b17.f529411i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d8(this, str2, textView, i18, i19);
        b17.f();
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a aVar) {
        this.f188254r.add(aVar);
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        so2.c1 c1Var = (so2.c1) holder.f374658i;
        r45.s21 s21Var = c1Var != null ? c1Var.f491821d : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click likeInfo:");
        sb6.append(s21Var != null ? s21Var.f466962g : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavListDrawerPresenter", sb6.toString());
        if (s21Var != null) {
            java.lang.String str = s21Var.f466962g;
            java.lang.String str2 = str == null ? "" : str;
            long m59251x5db1b11 = a().m59251x5db1b11();
            java.lang.String m59229xb5af1dd5 = a().m59229xb5af1dd5();
            java.lang.String nonceId = a().m59276x6c285d75();
            java.lang.String str3 = s21Var.f466961f;
            java.lang.String str4 = str3 != null ? str3 : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
            android.content.Intent intent = new android.content.Intent();
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
            android.content.Context context = holder.f374654e;
            if (!K0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, xy2.c.e(context))) {
                    intent.putExtra("IsPoster", true);
                    intent.putExtra("feedUser", str2);
                    intent.putExtra("Action", 1);
                    intent.putExtra("Avatar", s21Var.f466960e);
                    intent.putExtra("Nickname", s21Var.f466959d);
                    intent.putExtra("FeedId", m59251x5db1b11);
                    intent.putExtra("DupFlag", m59229xb5af1dd5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    intent.putExtra("feedUser", xy2.c.e(context));
                    intent.putExtra("FeedNonceId", nonceId);
                    intent.putExtra("FavId", str4);
                    intent.putExtra("IsPoster", true);
                    intent.putExtra("V5UserName", s21Var.f466962g);
                    intent.putExtra("isFingerLike", true);
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.sl((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17, context, str2, intent, 8, null, 16, null);
                }
            }
            intent.putExtra("IsPoster", false);
            intent.putExtra("Action", 1);
            intent.putExtra("Avatar", s21Var.f466960e);
            intent.putExtra("Nickname", s21Var.f466959d);
            intent.putExtra("FeedId", m59251x5db1b11);
            intent.putExtra("DupFlag", m59229xb5af1dd5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            intent.putExtra("feedUser", xy2.c.e(context));
            intent.putExtra("FeedNonceId", nonceId);
            intent.putExtra("FavId", str4);
            intent.putExtra("IsPoster", true);
            intent.putExtra("V5UserName", s21Var.f466962g);
            intent.putExtra("isFingerLike", true);
            i95.m c172 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c172, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.sl((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c172, context, str2, intent, 8, null, 16, null);
        }
    }
}
