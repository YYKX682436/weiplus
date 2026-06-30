package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveAuthUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveBaseUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI */
/* loaded from: classes3.dex */
public final class ActivityC13961x4185f9c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13962x42207ca9 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public boolean A;
    public yl2.g1 B;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f190810w = "Finder.FinderGameLiveAuthUI";

    /* renamed from: x, reason: collision with root package name */
    public int f190811x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f190812y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f190813z;

    public ActivityC13961x4185f9c0() {
        int i17 = qs5.i.f447967a;
        this.f190811x = 1;
        this.A = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d7() {
        java.lang.Class cls;
        android.view.View view;
        java.lang.String str;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        java.lang.String m76029xad9975ba;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190810w, "checkShow, mode:" + this.f190811x + ", account:" + ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk() + ", checkingPost:" + this.f190813z);
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GAME_PROTOCOL_SHOW_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) m17).booleanValue();
        if (this.f190811x == 1 && !booleanValue) {
            pf5.z zVar = pf5.z.f435481a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2.class)).P6();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2.class)).f198717o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.n4(this);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g.class)).P6();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l.class)).O6();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b.class)).O6();
            return;
        }
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk()) {
            pf5.z zVar2 = pf5.z.f435481a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g) zVar2.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g.class)).P6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l) zVar2.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l.class);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b == 19) {
                android.view.View view2 = lVar.f198738d;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                    throw null;
                }
                if (view2.getVisibility() == 8) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.b(3);
                }
            }
            android.view.View view3 = lVar.f198738d;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b) zVar2.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b.class)).O6();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2) zVar2.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2.class)).O6();
            this.f190812y = true;
            return;
        }
        if (this.f190811x != 1) {
            if (this.f190813z) {
                return;
            }
            pf5.z zVar3 = pf5.z.f435481a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2) zVar3.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2.class)).P6();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2) zVar3.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2.class)).f198717o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p4(this);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g) zVar3.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g.class)).P6();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l) zVar3.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l.class)).O6();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b) zVar3.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b.class)).O6();
            return;
        }
        pf5.z zVar4 = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g) zVar4.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g.class);
        android.view.View view4 = gVar.f198632e;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = (android.widget.ImageView) gVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f563922d8);
        android.widget.TextView textView2 = (android.widget.TextView) gVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f81550do);
        android.widget.ImageView imageView2 = (android.widget.ImageView) gVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.a86);
        android.widget.TextView textView3 = (android.widget.TextView) gVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f563926dc);
        android.view.View mo144222x4ff8c0f0 = gVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f563938dp);
        android.view.View mo144222x4ff8c0f02 = gVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f563941dr);
        ya2.b2 b17 = ya2.h.f542017a.b(xy2.c.e(gVar.m80379x76847179()));
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        java.lang.String str2 = "";
        if (b17 != null) {
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b.class;
            view = mo144222x4ff8c0f0;
            str = b17.m176700xe5e0d2a0();
        } else {
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b.class;
            view = mo144222x4ff8c0f0;
            str = "";
        }
        mn2.n nVar = new mn2.n(str, null, 2, null == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity m80379x76847179 = gVar.m80379x76847179();
        java.lang.String w07 = b17 != null ? b17.w0() : "";
        ((ke0.e) xVar).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x76847179, w07));
        int m76027x1cbb0791 = (b17 == null || (c19780xceb4c4dc2 = b17.f69300x731cac1b) == null) ? 0 : c19780xceb4c4dc2.m76027x1cbb0791();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f542044a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
        android.view.View view5 = view;
        zy2.tb.a(m1Var, imageView2, b17 != null ? b17.f69300x731cac1b : null, 0, 4, null);
        if (m76027x1cbb0791 == 1) {
            textView = textView3;
            imageView2.setVisibility(0);
            if (b17 != null && (c19780xceb4c4dc = b17.f69300x731cac1b) != null && (m76029xad9975ba = c19780xceb4c4dc.m76029xad9975ba()) != null) {
                str2 = m76029xad9975ba;
            }
            textView.setText(str2);
        } else if (m76027x1cbb0791 != 2) {
            imageView2.setVisibility(8);
            textView = textView3;
            textView.setText("");
        } else {
            textView = textView3;
            imageView2.setVisibility(0);
            textView.setText("");
        }
        java.lang.CharSequence text = textView.getText();
        if (text == null || text.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        view5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e(gVar));
        mo144222x4ff8c0f02.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.f(gVar));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l) zVar4.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l.class)).O6();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b) zVar4.a(this).a(cls)).O6();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2) zVar4.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2.class)).O6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ajq;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h.class});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13962x42207ca9, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        m78583x85ccfe01(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a.a(findViewById(com.p314xaae8f345.mm.R.id.gir));
        android.content.Intent intent = getIntent();
        int i17 = qs5.i.f447967a;
        this.f190811x = intent.getIntExtra("KEY_AUTH_MODE", 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13962x42207ca9, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(7289, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.A) {
            if (this.f190812y) {
                d7();
            }
        } else {
            if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk()) {
                d7();
            } else {
                gm0.j1.d().a(7289, this);
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                g92.b.f351302e.M0(8).l();
            }
            this.A = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            d7();
        } else {
            db5.t7.m123882x26a183b(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.dgq, 0).show();
        }
    }
}
