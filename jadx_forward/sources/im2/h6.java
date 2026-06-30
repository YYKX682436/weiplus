package im2;

/* loaded from: classes3.dex */
public final class h6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0 {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h4 A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ut B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q4 D;
    public r45.l71 E;
    public final android.view.ViewGroup F;
    public final android.widget.ProgressBar G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f373893J;
    public boolean K;
    public boolean L;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d M;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 N;
    public boolean P;
    public final int Q;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f373894e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21530xd36355bc f373895f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f373896g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f373897h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f373898i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f373899m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f373900n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f373901o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f373902p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.Button f373903q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.RelativeLayout f373904r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.LinearLayout f373905s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f373906t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f373907u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f373908v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f373909w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ImageView f373910x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 f373911y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f373912z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, android.view.View root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f373894e = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("FinderLiveVisitorAfterPagePlugin", activity, 0, 4, null);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.j8n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f373895f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21530xd36355bc) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.j8j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f373896g = textView;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f373897h = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.f564519tm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById5;
        this.f373898i = imageView;
        android.view.View findViewById6 = root.findViewById(com.p314xaae8f345.mm.R.id.f564554ui);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById6;
        this.f373899m = textView2;
        android.view.View findViewById7 = root.findViewById(com.p314xaae8f345.mm.R.id.p3r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f373900n = findViewById7;
        android.view.View findViewById8 = root.findViewById(com.p314xaae8f345.mm.R.id.p3t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById8;
        this.f373901o = textView3;
        this.f373902p = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.sd6);
        this.f373903q = (android.widget.Button) root.findViewById(com.p314xaae8f345.mm.R.id.tib);
        android.view.View findViewById9 = root.findViewById(com.p314xaae8f345.mm.R.id.i66);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById9;
        this.f373904r = relativeLayout;
        android.view.View findViewById10 = root.findViewById(com.p314xaae8f345.mm.R.id.f564534ty);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f373905s = (android.widget.LinearLayout) findViewById10;
        android.view.View findViewById11 = root.findViewById(com.p314xaae8f345.mm.R.id.f564532tw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f373906t = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = root.findViewById(com.p314xaae8f345.mm.R.id.f564533tx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f373907u = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = root.findViewById(com.p314xaae8f345.mm.R.id.f564518tl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.f373908v = (android.widget.ImageView) findViewById13;
        android.view.View findViewById14 = root.findViewById(com.p314xaae8f345.mm.R.id.aac);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        android.view.View findViewById15 = root.findViewById(com.p314xaae8f345.mm.R.id.aaa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        this.f373909w = findViewById15;
        android.view.View findViewById16 = root.findViewById(com.p314xaae8f345.mm.R.id.fus);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        android.view.View findViewById17 = root.findViewById(com.p314xaae8f345.mm.R.id.f567103i64);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById17, "findViewById(...)");
        this.f373910x = (android.widget.ImageView) findViewById17;
        android.view.View findViewById18 = root.findViewById(com.p314xaae8f345.mm.R.id.mww);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById18, "findViewById(...)");
        this.f373911y = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590) findViewById18;
        android.view.View findViewById19 = root.findViewById(com.p314xaae8f345.mm.R.id.f568094lo5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById19, "findViewById(...)");
        android.view.View findViewById20 = root.findViewById(com.p314xaae8f345.mm.R.id.loc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById20, "findViewById(...)");
        android.view.View findViewById21 = root.findViewById(com.p314xaae8f345.mm.R.id.exw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById21, "findViewById(...)");
        this.f373912z = findViewById21;
        this.A = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h4((android.view.ViewGroup) findViewById19, this);
        this.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ut((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14299x907da1b7) findViewById20, this);
        this.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4((android.view.ViewGroup) findViewById16, this);
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q4(findViewById21, this);
        android.view.View findViewById22 = root.findViewById(com.p314xaae8f345.mm.R.id.auu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById22, "findViewById(...)");
        this.F = (android.view.ViewGroup) findViewById22;
        android.view.View findViewById23 = root.findViewById(com.p314xaae8f345.mm.R.id.ilt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById23, "findViewById(...)");
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById23;
        this.G = progressBar;
        textView3.setOnClickListener(new im2.x4(this));
        imageView.setOnClickListener(new im2.y4(this));
        imageView.setContentDescription(root.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ka9));
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        relativeLayout.setVisibility(8);
        progressBar.setVisibility(8);
        ((android.widget.ImageView) findViewById14).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(root.getContext(), com.p314xaae8f345.mm.R.raw.f79636xc84bf7ff, -1));
        findViewById15.setOnClickListener(new im2.z4(root));
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.M = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorAfterPagePlugin$4
            {
                this.f39173x3fe91575 = 398763182;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be event = c5560x6f070be;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                im2.h6 h6Var = im2.h6.this;
                java.lang.String str = h6Var.I;
                if (!(str == null || str.length() == 0)) {
                    am.zd zdVar = event.f135879g;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zdVar != null ? zdVar.f90084a : null, h6Var.I)) {
                        pm0.v.X(new im2.a5(event, h6Var));
                    }
                }
                return false;
            }
        };
        root.setTranslationX(com.p314xaae8f345.mm.ui.bl.b(root.getContext()).x);
        this.Q = 30000;
    }

    public static final void f(im2.h6 h6Var, boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, boolean z18) {
        h6Var.getClass();
        int i17 = z17 ? 1 : z18 ? 3 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorAfterPagePlugin", "#followAnchor nickName:" + c19782x23db1cfa.m76184x8010e5e4() + ", isPrivateAccount:" + z18 + ", opType:" + i17);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.content.Context context = h6Var.f195201d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
        java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
        if (m76197x6c03c64c == null) {
            m76197x6c03c64c = "";
        }
        c61.yb.ea(ybVar, V6, m76197x6c03c64c, i17, h6Var.Y().f492181c, z18, null, null, 26, 0, 62, new im2.j5(h6Var, c19782x23db1cfa, i17), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(im2.h6 r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.h6.g(im2.h6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(im2.h6 r17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r18) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.h6.h(im2.h6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0
    public p3325xe03a0797.p3326xc267989b.f1 H(oz5.l context, p3325xe03a0797.p3326xc267989b.a1 start, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        return p3325xe03a0797.p3326xc267989b.l.a(this.f373894e, context, start, block);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0
    public so2.v2 Y() {
        android.content.Context context = this.f195201d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return ((im2.i6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.i6.class)).f373926e;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0
    public void a() {
        android.view.View decorView;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.Z(this, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new im2.n5(this, null), 2, null);
        boolean m60126x74219ae7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7();
        k(0);
        android.view.View view = this.f195201d;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((im2.o6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.o6.class)).f374009o) {
            view.animate().translationX(0.0f).setDuration(200L).withStartAction(new im2.u5(this));
        } else {
            view.setTranslationX(0.0f);
            k(0);
        }
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        android.view.Window window = ((android.app.Activity) context2).getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setBackgroundColor(-16777216);
        }
        java.lang.System.currentTimeMillis();
        ((ml2.r0) i95.n0.c(ml2.r0.class)).pk(Y().f492187i ? Y().f492188j : Y().f492179a);
        if (m60126x74219ae7) {
            this.F.setVisibility(8);
            android.view.View view2 = this.f373900n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f373911y.a();
        this.f373895f.setOnScrollChangeListener(new im2.o5(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0
    public void c() {
        c50.m0 m0Var = this.f373911y.f197328u;
        if (m0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.u0.f198236d;
            gp2.l0 l0Var = (gp2.l0) m0Var;
            l0Var.m();
            l0Var.M(u0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var = this.C;
        c50.m0 m0Var2 = b4Var.f199359g;
        if (m0Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n3 n3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n3(b4Var);
            gp2.l0 l0Var2 = (gp2.l0) m0Var2;
            l0Var2.m();
            l0Var2.M(n3Var);
        }
        this.D.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r9 = this;
            android.view.View r0 = r9.f195201d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L39
            com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView r0 = r9.f373911y
            r0.getClass()
            com.tencent.mm.plugin.finder.live.view.v0 r1 = new com.tencent.mm.plugin.finder.live.view.v0
            r1.<init>(r0)
            r0.post(r1)
            com.tencent.mm.plugin.finder.live.widget.b4 r0 = r9.C
            android.view.View r1 = r0.f199357e
            boolean r2 = r1.isShown()
            if (r2 == 0) goto L34
            r2 = 2131315539(0x7f094b53, float:1.8249534E38)
            android.view.View r1 = r1.findViewById(r2)
            com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532) r1
            if (r1 == 0) goto L34
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r0.f199360h
            com.tencent.mm.plugin.finder.live.widget.q3 r3 = new com.tencent.mm.plugin.finder.live.widget.q3
            r3.<init>(r2, r1, r0)
            r1.post(r3)
        L34:
            com.tencent.mm.plugin.finder.live.widget.q4 r0 = r9.D
            r0.g()
        L39:
            boolean r0 = r9.L
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L54
            r9.L = r3
            r45.l71 r0 = r9.E
            if (r0 == 0) goto L4f
            r4 = 37
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r4)
            r45.fl1 r0 = (r45.fl1) r0
            goto L50
        L4f:
            r0 = r2
        L50:
            if (r0 == 0) goto L54
            r0 = r1
            goto L55
        L54:
            r0 = r3
        L55:
            if (r0 == 0) goto L75
            android.widget.Button r0 = r9.f373903q
            if (r0 == 0) goto L62
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L62
            goto L63
        L62:
            r1 = r3
        L63:
            r9.H = r1
            kotlinx.coroutines.p0 r0 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r4 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r5 = 0
            im2.t5 r6 = new im2.t5
            r6.<init>(r9, r2)
            r7 = 2
            r8 = 0
            r3 = r9
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.Z(r3, r4, r5, r6, r7, r8)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.h6.d():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0
    public p3325xe03a0797.p3326xc267989b.r2 d0(oz5.l context, p3325xe03a0797.p3326xc267989b.a1 start, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        return this.f373894e.a(start, block);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorAfterPagePlugin", "unmount");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590 = this.f373911y;
        c50.m0 m0Var = c14298xca26f590.f197328u;
        if (m0Var != null) {
            ((gp2.l0) m0Var).o();
        }
        c14298xca26f590.f197328u = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q4 q4Var = this.D;
        q4Var.f();
        q4Var.f201026j = null;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.M;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }

    public final void i(java.lang.String str, int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc) {
        boolean z17 = Y().f492187i;
        android.widget.TextView textView = this.f373901o;
        android.view.View view = this.f195201d;
        if (z17) {
            textView.setText(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2a, Y().f492189k));
        } else {
            textView.setText(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehi));
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        android.widget.LinearLayout linearLayout = this.f373905s;
        if ((!K0 || i17 > 0) && !Y().f492187i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorAfterPagePlugin", "authProfession:" + str + ", friendFollowCount:" + i17);
            linearLayout.setVisibility(0);
            boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            android.widget.TextView textView2 = this.f373906t;
            if (K02) {
                textView2.setVisibility(8);
            } else {
                java.lang.String string = view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cq9, str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                textView2.setText(string);
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = this.f373907u;
            if (i17 > 0) {
                java.lang.String string2 = view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572927cy4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(i17, false));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                textView3.setText(string2);
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(8);
            }
        } else {
            linearLayout.setVisibility(8);
        }
        if (c19780xceb4c4dc != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1.f542044a.c(this.f373908v, c19780xceb4c4dc, 0);
        }
    }

    public final void j(r45.fa2 fa2Var, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590 = this.f373911y;
        if (c14298xca26f590.getVisibility() == 0) {
            return;
        }
        c14298xca26f590.m57231x46b194e1(Y().f492197s);
        if (fa2Var == null) {
            c14298xca26f590.setVisibility(8);
        } else {
            c14298xca26f590.setVisibility(0);
            c14298xca26f590.b(fa2Var, Y(), f17);
        }
    }

    public final void k(int i17) {
        android.view.View view = this.f195201d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.Object l(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0.Z(this, null, null, new im2.b6(this, null), 3, null);
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r16, java.lang.String r17, ya2.b2 r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.h6.m(java.lang.String, java.lang.String, ya2.b2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void n(boolean z17) {
        android.widget.Button button = this.f373903q;
        android.view.ViewGroup viewGroup = this.f373902p;
        if (z17) {
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            if (button == null) {
                return;
            }
            button.setVisibility(0);
            return;
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        if (button == null) {
            return;
        }
        button.setVisibility(8);
    }

    public final void o() {
        java.lang.String str;
        boolean z17 = Y().f492187i;
        android.view.View view = this.f195201d;
        if (z17) {
            str = Y().f492188j;
            zl2.q4 q4Var = zl2.q4.f555466a;
            java.lang.String str2 = Y().f492179a;
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            q4Var.G(str, str2, context, Y().f492191m, java.lang.String.valueOf(Y().f492192n.m75942xfb822ef2(0)), 3);
        } else {
            str = Y().f492179a;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", str);
            intent.putExtra("key_enter_profile_type", 11);
            android.content.Context context2 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).c(zy2.v9.class))).R6(intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f542005a;
            android.content.Context context3 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            e1Var.w(context3, intent);
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).ok(str);
        this.L = true;
    }
}
