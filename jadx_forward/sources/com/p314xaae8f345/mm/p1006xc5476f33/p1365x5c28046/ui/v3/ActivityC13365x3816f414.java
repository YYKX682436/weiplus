package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "g22/g0", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI */
/* loaded from: classes15.dex */
public final class ActivityC13365x3816f414 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f179982z = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 f179984e;

    /* renamed from: f, reason: collision with root package name */
    public i22.g0 f179985f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f179986g;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f179994r;

    /* renamed from: w, reason: collision with root package name */
    public boolean f179999w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f180000x;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f179983d = "MicroMsg.EmojiStoreV3SingleProductAlbumUI";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179987h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f179988i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f179989m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f179990n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f179991o = 6;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f179992p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f179993q = -1;

    /* renamed from: s, reason: collision with root package name */
    public g22.g0 f179995s = g22.g0.f349348d;

    /* renamed from: t, reason: collision with root package name */
    public boolean f179996t = true;

    /* renamed from: u, reason: collision with root package name */
    public int f179997u = -1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f179998v = true;

    /* renamed from: y, reason: collision with root package name */
    public final int f180001y = 2002;

    public final void T6() {
        if (g22.g0.f349348d == this.f179995s) {
            gm0.j1.n().f354821b.g(new z12.n(5, 0, 0, null, this.f179993q, this.f179994r));
            this.f179995s = g22.g0.f349350f;
        }
    }

    public final void U6(java.util.List list, boolean z17) {
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f179983d, "updateAdapterData failed, data error");
            return;
        }
        i22.g0 g0Var = this.f179985f;
        if (g0Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.ri0 ri0Var = (r45.ri0) it.next();
                i22.c1 c1Var = new i22.c1();
                c1Var.f369485a = ri0Var;
                arrayList2.add(c1Var);
            }
            arrayList.addAll(arrayList2);
            java.util.List list2 = g0Var.f369500e;
            if (z17) {
                int mo1894x7e414b06 = g0Var.mo1894x7e414b06();
                list2.addAll(arrayList);
                g0Var.m8151xc67946d3(mo1894x7e414b06, arrayList.size());
            } else {
                list2.clear();
                list2.addAll(arrayList);
                g0Var.m8146xced61ae5();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a8o;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f179983d, "handleIntent");
        this.f179993q = getIntent().getIntExtra("set_id", -1);
        java.lang.String stringExtra = getIntent().getStringExtra("set_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f179987h = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("set_desc");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f179988i = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("set_iconURL");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f179989m = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("headurl");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f179990n = stringExtra4;
        java.lang.String stringExtra5 = getIntent().getStringExtra("sns_object_data");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f179992p = stringExtra5;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra5)) {
            this.f179993q = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.i(this.f179992p);
            java.lang.String j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.j(this.f179992p);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getEmojiPageTitle(...)");
            this.f179987h = j17;
            java.lang.String g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.g(this.f179992p);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getEmojiPageIconUrl(...)");
            this.f179989m = g17;
            java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.f(this.f179992p);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getEmojiPageDesc(...)");
            this.f179988i = f17;
            this.f179990n = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.h(this.f179992p);
            this.f179991o = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.k(this.f179992p);
        }
        this.f179997u = getIntent().getIntExtra("entrance_scene", 10007);
        mo54450xbf7c1df6("");
        mo54448x9c8c0d33(new g22.n0(this));
        mo64405x4dab7448(i65.a.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f179989m, "")) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80306x8f6ba587, new g22.o0(this));
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ilp);
        this.f179986g = findViewById;
        if (findViewById != null) {
            findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307);
        }
        this.f179984e = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753) findViewById(com.p314xaae8f345.mm.R.id.mzg);
        i22.b1 b1Var = new i22.b1();
        int i17 = b1Var.f369593b;
        g22.f fVar = new g22.f((int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f179987h, "") ? 1 : 0, b1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 c13366x84432753 = this.f179984e;
        if (c13366x84432753 != null) {
            c13366x84432753.m54848xf757fca9(b1Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 c13366x844327532 = this.f179984e;
        if (c13366x844327532 != null) {
            c13366x844327532.N(fVar);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(this, i17);
        c1161x57298f5d.B = new g22.i0(this, c1161x57298f5d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 c13366x844327533 = this.f179984e;
        if (c13366x844327533 != null) {
            c13366x844327533.mo7967x900dcbe1(c1161x57298f5d);
        }
        i22.g0 g0Var = new i22.g0(this, new java.util.ArrayList());
        this.f179985f = g0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 c13366x844327534 = this.f179984e;
        if (c13366x844327534 != null) {
            c13366x844327534.mo7960x6cab2c8d(g0Var);
        }
        i22.g0 g0Var2 = this.f179985f;
        if (g0Var2 != null) {
            g0Var2.f369505m = i17;
        }
        if (g0Var2 != null) {
            g0Var2.f369503h = new g22.j0(this);
        }
        if (g0Var2 != null) {
            g0Var2.f369504i = new g22.k0(this);
        }
        if (g0Var2 != null) {
            g0Var2.f369502g = new g22.l0(this);
        }
        if (g0Var2 != null) {
            g0Var2.f369509q = new g22.m0(this);
        }
        android.view.View view = this.f179986g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 c13366x844327535 = this.f179984e;
        if (c13366x844327535 != null) {
            c13366x844327535.setVisibility(8);
        }
        T6();
        gm0.j1.n().f354821b.a(gd1.h.f69799x366c91de, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12740, 4, "", "", 0, java.lang.Integer.valueOf(this.f179997u), 29);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f354821b.q(gd1.h.f69799x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f179999w = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f179999w && !this.f180000x) {
            this.f179999w = false;
            i22.g0 g0Var = this.f179985f;
            if (g0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 c13366x84432753 = this.f179984e;
                g0Var.x(c13366x84432753 != null ? c13366x84432753.getLayoutManager() : null);
            }
        }
        this.f180000x = false;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.List list;
        android.view.View view = this.f179986g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 c13366x84432753 = this.f179984e;
        if (c13366x84432753 != null) {
            c13366x84432753.setVisibility(0);
        }
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f179983d, "type:" + valueOf + ", errType:" + i17 + ", errCode:" + i18);
        if (valueOf != null && valueOf.intValue() == 821) {
            i22.g0 g0Var = this.f179985f;
            if ((g0Var != null && g0Var.mo1894x7e414b06() == 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f179987h, "")) {
                i22.y0 y0Var = new i22.y0();
                java.lang.String str2 = this.f179988i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                y0Var.f369602b = str2;
                java.lang.String str3 = this.f179987h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                y0Var.f369601a = str3;
                i22.g0 g0Var2 = this.f179985f;
                if (g0Var2 != null && (list = g0Var2.f369500e) != null) {
                    list.add(0, y0Var);
                }
                i22.g0 g0Var3 = this.f179985f;
                if (g0Var3 != null) {
                    g0Var3.m8147xed6e4d18(0);
                }
            }
            z12.n nVar = m1Var instanceof z12.n ? (z12.n) m1Var : null;
            r45.ce3 H = nVar != null ? nVar.H() : null;
            java.util.LinkedList linkedList = H != null ? H.f453029d : null;
            i22.g0 g0Var4 = this.f179985f;
            if (g0Var4 != null) {
                java.util.List list2 = g0Var4.f369500e;
                if ((!list2.isEmpty()) && ((i22.n0) kz5.n0.i0(list2)).mo134661xfb85f7b0() == 8) {
                    g0Var4.m8148xed6e4d18(g0Var4.mo1894x7e414b06() - 1, java.lang.Boolean.TRUE);
                    g0Var4.m8155x27702c4(g0Var4.mo1894x7e414b06() - 1);
                    list2.remove(g0Var4.mo1894x7e414b06() - 1);
                }
            }
            m78563x4e0f6657(true);
            if (i17 == 0 || i17 == 4) {
                if (linkedList != null) {
                    linkedList.size();
                }
                if (i18 == 0) {
                    this.f179995s = g22.g0.f349349e;
                    U6(linkedList, true);
                } else if (i18 == 2) {
                    this.f179995s = g22.g0.f349348d;
                    U6(linkedList, true);
                } else if (i18 != 3) {
                    dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0f), 0).show();
                } else {
                    this.f179995s = g22.g0.f349348d;
                    U6(linkedList, false);
                }
            } else {
                dp.a.m125854x26a183b(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0f), 0).show();
            }
            this.f179994r = nVar != null ? nVar.f550870h : null;
            if (this.f179998v) {
                this.f179998v = false;
                this.f179999w = false;
                ku5.u0 u0Var = ku5.t0.f394148d;
                g22.h0 h0Var = new g22.h0(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(h0Var, 500L, false);
            }
            if (this.f179996t) {
                if (this.f179995s != g22.g0.f349349e) {
                    m78563x4e0f6657(false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13366x84432753 c13366x844327532 = this.f179984e;
                    if (c13366x844327532 != null) {
                        c13366x844327532.post(new g22.p0(this));
                    }
                    T6();
                }
                this.f179996t = false;
            }
        }
    }
}
