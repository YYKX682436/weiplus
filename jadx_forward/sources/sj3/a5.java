package sj3;

/* loaded from: classes14.dex */
public class a5 implements android.view.View.OnClickListener, kv.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k, xq4.b {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b A;
    public final int B;
    public final int C;
    public final android.widget.RelativeLayout D;
    public final android.widget.RelativeLayout E;
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 F;
    public final android.widget.RelativeLayout G;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 H;
    public boolean K;
    public final int P;
    public final android.widget.FrameLayout Q;
    public final android.widget.RelativeLayout R;
    public wj3.a S;
    public final java.lang.Runnable T;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 U;
    public long V;
    public xq4.c W;
    public boolean X;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 f489950d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f489951e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f489952f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j f489953g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f489954h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f489955i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f489956m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f489957n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f489958o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f489959p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f489960q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f489961r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f489962s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f489963t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f489964u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f489965v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f489966w;

    /* renamed from: x, reason: collision with root package name */
    public final rj3.a f489967x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b f489968y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b f489969z;
    public java.util.ArrayList I = new java.util.ArrayList();

    /* renamed from: J, reason: collision with root package name */
    public java.util.ArrayList f489949J = new java.util.ArrayList();
    public boolean L = false;
    public boolean M = true;
    public final int N = 15;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2) {
        this.P = 0;
        sj3.u4 u4Var = new sj3.u4(this);
        this.T = new sj3.x4(this);
        this.U = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("MultiTalkTimer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new sj3.m4(this), false);
        this.X = true;
        this.f489950d = serviceConnectionC16581x3d1d6bd2;
        int i17 = com.p314xaae8f345.mm.ui.bk.h(serviceConnectionC16581x3d1d6bd2).x;
        this.B = i17;
        int b17 = i65.a.b(serviceConnectionC16581x3d1d6bd2, 52) + i17 + com.p314xaae8f345.mm.ui.bk.p(serviceConnectionC16581x3d1d6bd2);
        this.C = b17;
        this.f489955i = (android.widget.TextView) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.o7z);
        this.f489956m = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.ofr);
        this.f489957n = (android.widget.TextView) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f489960q = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.nyf);
        int k17 = i65.a.k(serviceConnectionC16581x3d1d6bd2) - i65.a.b(serviceConnectionC16581x3d1d6bd2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.k2.f34622x366c91de);
        this.P = k17;
        this.D = (android.widget.RelativeLayout) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.cib);
        this.E = (android.widget.RelativeLayout) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.gwx);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) serviceConnectionC16581x3d1d6bd2.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570846c35, (android.view.ViewGroup) null, false);
        this.F = c1073x7e08a787;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) serviceConnectionC16581x3d1d6bd2.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570845c34, (android.view.ViewGroup) null, false);
        this.G = relativeLayout;
        android.widget.ImageButton imageButton = (android.widget.ImageButton) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.nye);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.nyg);
        this.f489952f = c1163xf1deaba4;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.nyc);
        this.Q = frameLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j m17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().m();
        this.f489953g = m17;
        this.R = (android.widget.RelativeLayout) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.mb7);
        android.view.View findViewById = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.ofh);
        this.f489951e = findViewById;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.topMargin = com.p314xaae8f345.mm.ui.bk.p(serviceConnectionC16581x3d1d6bd2) + i65.a.b(serviceConnectionC16581x3d1d6bd2, 12);
        findViewById.setLayoutParams(layoutParams);
        ((android.widget.RelativeLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i65.a.b(serviceConnectionC16581x3d1d6bd2, 52) + com.p314xaae8f345.mm.ui.bk.p(serviceConnectionC16581x3d1d6bd2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(serviceConnectionC16581x3d1d6bd2, 3);
        this.f489954h = c1161x57298f5d;
        sj3.d dVar = new sj3.d(serviceConnectionC16581x3d1d6bd2);
        c1163xf1deaba4.mo7967x900dcbe1(c1161x57298f5d);
        c1161x57298f5d.B = new sj3.q4(this, dVar);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) c1163xf1deaba4.getLayoutParams();
        if (k17 > i17) {
            layoutParams2.width = i17;
            layoutParams2.height = b17;
        } else {
            layoutParams2.width = k17;
            layoutParams2.height = i65.a.b(serviceConnectionC16581x3d1d6bd2, 52) + k17 + com.p314xaae8f345.mm.ui.bk.p(serviceConnectionC16581x3d1d6bd2);
            layoutParams2.addRule(14);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "mAvatarLastHeight is %s and talkingAvatarContainerWidth is %s", java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(i17));
        c1163xf1deaba4.setLayoutParams(layoutParams2);
        dVar.f490001p = m17;
        c1163xf1deaba4.mo7960x6cab2c8d(dVar);
        c1163xf1deaba4.m7969x1a2696e2(new sj3.r4(this));
        m17.k(c1163xf1deaba4, frameLayout, serviceConnectionC16581x3d1d6bd2, this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.jwj);
        this.f489961r = c22698xdfbd289f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.b1g);
        this.f489962s = c22699x3dcdb352;
        android.view.View findViewById2 = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.jvx);
        this.f489963t = findViewById2;
        findViewById2.setBackground(com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f79995xde511849, -1));
        android.view.View findViewById3 = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.f567558jx1);
        this.f489964u = findViewById3;
        android.view.View findViewById4 = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.f567545jv0);
        this.f489965v = findViewById4;
        this.f489967x = new rj3.a(serviceConnectionC16581x3d1d6bd2, findViewById3, "screenShare", findViewById4);
        findViewById3.setBackground(com.p314xaae8f345.mm.ui.uk.e(serviceConnectionC16581x3d1d6bd2, com.p314xaae8f345.mm.R.raw.f80026x8e7f448e, serviceConnectionC16581x3d1d6bd2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
        findViewById2.bringToFront();
        findViewById2.setOnClickListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b) c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.jxe);
        this.f489968y = c16586x7058535b;
        c16586x7058535b.m67075xea2556c6(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().z());
        c16586x7058535b.setOnClickListener(u4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b) c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.jwo);
        this.f489969z = c16586x7058535b2;
        c16586x7058535b2.setOnClickListener(new sj3.s4(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b) c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.jwb);
        this.A = c16586x7058535b3;
        c16586x7058535b3.setOnClickListener(new sj3.t4(this));
        this.H = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812) serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.gqk);
        android.view.View findViewById5 = relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.jw9);
        this.f489966w = findViewById5;
        c16586x7058535b2.m67074xdd7d58e5(!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231695e);
        c16586x7058535b3.m67074xdd7d58e5(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231696f);
        c16586x7058535b.m67074xdd7d58e5(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().B());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "talkingAvatarContainerHeight %d", java.lang.Integer.valueOf(b17));
        imageButton.setOnClickListener(this);
        c22698xdfbd289f.bringToFront();
        c22698xdfbd289f.setOnClickListener(this);
        c22698xdfbd289f.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f80186x29194b54, -1));
        c22698xdfbd289f.m82034x7541828(-1);
        findViewById3.setOnClickListener(this);
        findViewById5.setOnClickListener(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().d(this);
        c22699x3dcdb352.setOnClickListener(this);
        if (com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.eg.d(serviceConnectionC16581x3d1d6bd2.getTaskId())) {
            c22699x3dcdb352.setVisibility(0);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(c22699x3dcdb352, "split_view_icon");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(c22699x3dcdb352, 40, 26430);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().B()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById5, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            x();
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById5, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "<init>", "(Lcom/tencent/mm/plugin/multitalk/ui/MultiTalkMainUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J != null) {
            boolean z17 = !com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J.F();
            if (c16586x7058535b3 != null) {
                c16586x7058535b3.setEnabled(z17);
                c16586x7058535b3.m67075xea2556c6(z17);
            }
        }
        y();
    }

    @Override // kv.e0
    public void U(java.lang.String wxUserName) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "notifyChanged %s", wxUserName);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j jVar = this.f489953g;
        jVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUserName, "wxUserName");
        sj3.j g17 = jVar.g(wxUserName);
        if (g17 == null || (c16587x33e31ed = g17.f490110d) == null) {
            return;
        }
        c16587x33e31ed.k();
    }

    public void b(int i17) {
        android.widget.ImageButton imageButton;
        wj3.a aVar = this.S;
        if (aVar != null) {
            aVar.f528278d = i17;
            uj3.b0 b0Var = aVar.f528279e;
            if (b0Var != null && b0Var.f509755m != i17) {
                b0Var.f509755m = i17;
                uj3.z zVar = b0Var.f509752g;
                if (zVar != null) {
                    zVar.a(i17);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812 = this.H;
            if (c16584x79838812 != null && (imageButton = c16584x79838812.f231853s) != null) {
                imageButton.setRotation(360 - i17);
            }
            android.view.View view = this.f489966w;
            if (view != null) {
                view.setRotation(i17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b = this.f489968y;
            if (c16586x7058535b != null) {
                c16586x7058535b.f231861e.setRotation(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 - i17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b2 = this.A;
            if (c16586x7058535b2 != null) {
                c16586x7058535b2.f231861e.setRotation(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 - i17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b3 = this.f489969z;
            if (c16586x7058535b3 != null) {
                c16586x7058535b3.f231861e.setRotation(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 - i17);
            }
        }
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b = this.f489968y;
        if (c16586x7058535b == null || !c16586x7058535b.a()) {
            return;
        }
        v(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().Z(1, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231701m);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.H();
        zj3.g gVar = zj3.g.f554835a;
        zj3.g.f554853s.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f489950d;
        db5.t7.m(serviceConnectionC16581x3d1d6bd2, serviceConnectionC16581x3d1d6bd2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibf));
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().getClass();
    }

    public void d() {
        android.view.View view = this.f489960q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f489963t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f489964u;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f489965v;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "dismissTalkingUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // xq4.b
    public void e(int i17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().getClass();
        }
    }

    public void f(boolean z17) {
        android.view.View view = this.f489963t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f489964u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f489965v;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideActionView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            this.f489961r.setVisibility(8);
        }
        this.f489962s.setVisibility(8);
    }

    public void g() {
        if (this.S != null) {
            b(0);
            uj3.b0 b0Var = this.S.f528279e;
            if (b0Var != null) {
                b0Var.g();
            }
            this.S.g(this.R);
            this.S = null;
            z(true);
        }
    }

    public void h() {
        android.view.View view = this.f489960q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f489956m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void i(com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f489950d;
        if (serviceConnectionC16581x3d1d6bd2.V6()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j jVar = this.f489953g;
        if (jVar.j()) {
            return;
        }
        if (!jVar.j()) {
            android.view.View view = this.f489960q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f489968y.m67075xea2556c6(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().z());
            android.view.View view2 = this.f489963t;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().z()) {
                android.view.View view3 = this.f489964u;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f489965v;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (serviceConnectionC16581x3d1d6bd2.V6()) {
                android.view.View view5 = this.f489964u;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = this.f489965v;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view7 = this.f489963t;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
                android.view.View view8 = this.f489964u;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (zj3.j.a()) {
                    android.view.View view9 = this.f489965v;
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(8);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "inflateTalkingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().k(this.f489967x);
                }
            }
        }
        t(c11142xe8e5c41a, true);
        jVar.k(this.f489952f, this.Q, serviceConnectionC16581x3d1d6bd2, this);
        y();
    }

    public void j() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J != null) {
            boolean z17 = !com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J.F();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b = this.A;
            if (c16586x7058535b != null) {
                c16586x7058535b.setEnabled(z17);
                c16586x7058535b.m67075xea2556c6(z17);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.a5.k(boolean, boolean):void");
    }

    public final void l(java.util.HashSet videoUserSet) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j jVar = this.f489953g;
        jVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoUserSet, "videoUserSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AvatarViewManager", "openMemberToVideo, %s", videoUserSet);
        sj3.d dVar = jVar.f231542i;
        if (dVar != null && (copyOnWriteArrayList = dVar.f489993e) != null) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                aj3.c cVar = (aj3.c) it.next();
                java.lang.String usrName = cVar.f86836a.f153145d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(usrName, "usrName");
                sj3.j g17 = jVar.g(usrName);
                jz5.f0 f0Var = null;
                if (g17 != null && (c16587x33e31ed = g17.f490110d) != null) {
                    if (!((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), c16587x33e31ed.getF231877m()) || c16587x33e31ed.j()) ? false : true)) {
                        c16587x33e31ed = null;
                    }
                    if (c16587x33e31ed != null) {
                        if (videoUserSet.contains(c16587x33e31ed.getF231877m())) {
                            if (c16587x33e31ed.status == sj3.c5.f489987d) {
                                jVar.l(c16587x33e31ed.getF231877m(), 1);
                            }
                        } else {
                            jVar.l(c16587x33e31ed.getF231877m(), 0);
                        }
                        f0Var = jz5.f0.f384359a;
                    }
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AvatarViewManager", "UI not ready, just init state");
                    com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54 = cVar.f86836a;
                    if (videoUserSet.contains(c11143x170c3f54.f153145d) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), c11143x170c3f54.f153145d)) {
                        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().o().f231563c;
                        if (!(arrayList != null && arrayList.contains(c11143x170c3f54.f153145d))) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AvatarViewManager", "init " + c11143x170c3f54.f153145d + " to VIDEO_SMALL");
                            java.lang.String usrName2 = c11143x170c3f54.f153145d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(usrName2, "usrName");
                            jVar.l(usrName2, 1);
                        }
                    }
                }
            }
        }
        z(false);
    }

    public void m() {
        android.view.View view = this.f489963t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f489961r.setVisibility(0);
        if (com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.eg.d(this.f489950d.getTaskId())) {
            this.f489962s.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
            android.view.View view2 = this.f489964u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!zj3.j.a()) {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().k(this.f489967x);
                return;
            }
            android.view.View view3 = this.f489965v;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showActionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void n(int i17, boolean z17) {
        this.f489957n.setVisibility(i17);
        android.widget.TextView textView = this.f489955i;
        if (i17 != 0) {
            textView.setVisibility(0);
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.U;
        b4Var.d();
        b4Var.mo50302x6b17ad39(null);
        if (z17) {
            b4Var.c(5000L, 5000L);
        }
        textView.setVisibility(8);
    }

    public final void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b;
        boolean z17 = this.L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812 = this.H;
        if (!z17) {
            this.L = true;
            c16584x79838812.setVisibility(0);
            c16584x79838812.getClass();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            android.widget.RelativeLayout relativeLayout = this.G;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollapseView", "setCollapseContent, animate:%s, collapseView:%s", bool, relativeLayout);
            if (c16584x79838812.f231850p != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollapseView", "setCollapseContent already has collapseView");
            } else {
                if (((android.view.ViewGroup) relativeLayout.getParent()) != null) {
                    ((android.view.ViewGroup) relativeLayout.getParent()).removeView(relativeLayout);
                }
                c16584x79838812.f231850p = relativeLayout;
                c16584x79838812.f231845h.addView(relativeLayout);
                android.widget.ImageButton imageButton = (android.widget.ImageButton) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.nye);
                c16584x79838812.f231853s = imageButton;
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) imageButton.getLayoutParams();
                int i17 = sj3.i1.f490103o;
                layoutParams.width = i17;
                layoutParams.height = i17;
                layoutParams.bottomMargin = sj3.i1.f490096h;
                c16584x79838812.f231853s.setLayoutParams(layoutParams);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f489950d;
            int height = serviceConnectionC16581x3d1d6bd2.T6().findViewById(com.p314xaae8f345.mm.R.id.nyd).getHeight();
            c16584x79838812.getClass();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(height);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.F;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollapseView", "setContent animate:%s, controlView:%s, height:%s", bool, c1073x7e08a787, valueOf);
            if (c16584x79838812.f231849o != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollapseView", "setContent already have content layout");
            } else {
                if (c1073x7e08a787.getParent() != null) {
                    ((android.view.ViewGroup) c1073x7e08a787.getParent()).removeView(c1073x7e08a787);
                }
                c16584x79838812.f231849o = c1073x7e08a787;
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 17;
                c16584x79838812.f231846i.addView(c16584x79838812.f231849o, layoutParams2);
                c16584x79838812.f231846i.setVisibility(0);
                c16584x79838812.f231846i.setVisibility(0);
                c16584x79838812.setAlpha(0.0f);
                c16584x79838812.f231844g.setAlpha(0.0f);
                c16584x79838812.animate().alpha(1.0f).setDuration(500L).setListener(new sj3.n(c16584x79838812));
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f489952f;
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) c1163xf1deaba4.getLayoutParams();
            int i18 = this.P;
            int i19 = this.B;
            if (i18 > i19) {
                layoutParams3.height = ((i19 / 3) * 5) + i65.a.b(serviceConnectionC16581x3d1d6bd2, 52) + com.p314xaae8f345.mm.ui.bk.p(serviceConnectionC16581x3d1d6bd2);
            } else {
                layoutParams3.height = ((i18 / 3) * 5) + com.p314xaae8f345.mm.ui.bk.p(serviceConnectionC16581x3d1d6bd2);
            }
            c1163xf1deaba4.setLayoutParams(layoutParams3);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) c16584x79838812.findViewById(com.p314xaae8f345.mm.R.id.m7i).getLayoutParams();
            layoutParams4.bottomMargin = com.p314xaae8f345.mm.ui.bl.c(serviceConnectionC16581x3d1d6bd2);
            c16584x79838812.findViewById(com.p314xaae8f345.mm.R.id.m7i).setLayoutParams(layoutParams4);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y() && (c16586x7058535b = this.f489968y) != null && !c16586x7058535b.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().Z(1, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231701m);
            }
        }
        android.widget.TextView textView = this.f489958o;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.ImageView imageView = this.f489959p;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.f489958o = c16584x79838812.f231847m;
        android.widget.ImageView imageView2 = c16584x79838812.f231848n;
        this.f489959p = imageView2;
        imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f79634x412ce3f1, -1));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.X) {
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.nye) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f(true, false);
            android.content.Context context = view.getContext();
            if (context != null && !((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context)) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                sj3.g4 g4Var = new sj3.g4(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(g4Var, 2000L, false);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.jwj) {
            if (this.f489953g.j()) {
                m();
                this.H.e();
                this.f489953g.f();
                z(true);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.f231674a++;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().C(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(8);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.jw9) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(7);
            x();
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.jvx) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.f231678e++;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f489950d;
            if (!serviceConnectionC16581x3d1d6bd2.f231777w) {
                serviceConnectionC16581x3d1d6bd2.f231777w = true;
                android.content.Intent intent = new android.content.Intent(serviceConnectionC16581x3d1d6bd2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16580xee897bd1.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t != null) {
                    for (com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54 : com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t.f153144i) {
                        int i17 = c11143x170c3f54.f153147f;
                        if (i17 == 10 || i17 == 1) {
                            arrayList2.add(c11143x170c3f54.f153145d);
                        }
                    }
                    intent.putExtra("titile", serviceConnectionC16581x3d1d6bd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h0z));
                    intent.putExtra("chatroomName", com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t.f153141f);
                    intent.putExtra("always_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ","));
                    intent.putExtra("key_need_gallery", false);
                    serviceConnectionC16581x3d1d6bd2.startActivityForResult(intent, 1);
                }
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.f567558jx1) {
            zj3.g gVar = zj3.g.f554835a;
            zj3.g.f554837c = java.lang.System.currentTimeMillis();
            gVar.b(1, 1);
            if (zj3.j.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.f231679f++;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t != null) {
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t.f153139d;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickFileScreenProject");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1538L, 0L, 1L);
                this.f489950d.U6();
            } else {
                if (this.f489965v.getVisibility() != 0) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this.f489950d, 2, 3, false);
                    z2Var.y(this.f489950d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                    z2Var.x(1);
                    z2Var.z(android.graphics.Color.parseColor("#07C160"));
                    z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.cia);
                    z2Var.F = new sj3.h4(this, z2Var);
                    z2Var.C();
                } else {
                    android.view.View view2 = this.f489965v;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this.f489950d, 1, 3, false);
                    z2Var2.m(this.f489950d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), this.f489950d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibn));
                    z2Var2.v(android.graphics.Color.parseColor("#07C160"));
                    z2Var2.o(0);
                    z2Var2.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.cia);
                    sj3.i4 i4Var = new sj3.i4(this, z2Var2);
                    sj3.j4 j4Var = new sj3.j4(this, z2Var2);
                    z2Var2.D = i4Var;
                    z2Var2.E = j4Var;
                    z2Var2.C();
                }
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(35);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_screen_project_info");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
                M.putBoolean("screen_project_has_been_educated", true);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.b1g) {
            com.p314xaae8f345.mm.ui.ee.f(this.f489950d.getTaskId(), new sj3.k4(this));
            this.f489950d.f231774t = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void p(int i17) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f489950d;
        ((android.view.WindowManager) serviceConnectionC16581x3d1d6bd2.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (displayMetrics.heightPixels / displayMetrics.density <= 540.0f) {
            db5.t7.n(serviceConnectionC16581x3d1d6bd2, serviceConnectionC16581x3d1d6bd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k_y));
            return;
        }
        if (this.f489958o != null) {
            if (serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.k6o) != null) {
                serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.k6o).setOnClickListener(null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812 = this.H;
            if (c16584x79838812 != null) {
                c16584x79838812.m67072x1188427c(null);
            }
            if (this.L) {
                c16584x79838812.m67072x1188427c(new sj3.y4(this));
            } else if (serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.k6o) != null) {
                serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.k6o).setOnClickListener(new sj3.f4(this));
            }
            this.f489959p.setVisibility(0);
            this.f489958o.setVisibility(0);
            this.f489958o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.k_y);
            java.lang.Runnable runnable = this.T;
            serviceConnectionC16581x3d1d6bd2.f231768n.mo50300x3fa464aa(runnable);
            serviceConnectionC16581x3d1d6bd2.f231768n.mo50297x7c4d7ca2(runnable, i17 * 1000);
        }
    }

    public void q(int i17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.t()) {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f489950d;
            ((android.view.WindowManager) serviceConnectionC16581x3d1d6bd2.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.heightPixels / displayMetrics.density <= 540.0f) {
                db5.t7.n(serviceConnectionC16581x3d1d6bd2, serviceConnectionC16581x3d1d6bd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k_x));
                return;
            }
            if (serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.k6o) != null) {
                serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.k6o).setOnClickListener(null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812 = this.H;
            if (c16584x79838812 != null) {
                c16584x79838812.m67072x1188427c(null);
            }
            if (this.L) {
                c16584x79838812.m67072x1188427c(new sj3.v4(this));
            } else if (serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.k6o) != null) {
                serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.k6o).setOnClickListener(new sj3.w4(this));
            }
            this.f489959p.setVisibility(8);
            this.f489958o.setVisibility(0);
            this.f489958o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.k_x);
            java.lang.Runnable runnable = this.T;
            serviceConnectionC16581x3d1d6bd2.f231768n.mo50300x3fa464aa(runnable);
            serviceConnectionC16581x3d1d6bd2.f231768n.mo50297x7c4d7ca2(runnable, i17 * 1000);
        }
    }

    public void r(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            n(8, z17);
        } else {
            this.f489957n.setText(str);
            n(0, z17);
        }
    }

    public void s() {
        if (this.M) {
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150L);
        alphaAnimation2.setDuration(150L);
        this.M = true;
        this.f489956m.setAnimation(alphaAnimation);
        android.view.View view = this.f489956m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f489951e.setAnimation(alphaAnimation);
        android.view.View view2 = this.f489951e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812 = this.H;
        c16584x79838812.setAnimation(alphaAnimation2);
        c16584x79838812.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0267, code lost:
    
        if (((r11 == null || !r11.contains(r13.f153145d)) ? r10 : true) != false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e4 A[Catch: all -> 0x030f, TryCatch #1 {, blocks: (B:78:0x0222, B:79:0x0236, B:81:0x023c, B:83:0x0244, B:85:0x024b, B:89:0x0258, B:91:0x025c, B:95:0x02a2, B:97:0x02bd, B:99:0x02c5, B:100:0x02d1, B:102:0x02d7, B:106:0x02e4, B:108:0x02e9, B:111:0x02c3, B:113:0x0269, B:115:0x026d, B:117:0x0287, B:119:0x028f, B:120:0x028d, B:123:0x02f2, B:124:0x02f5, B:127:0x02f6, B:128:0x02fb, B:131:0x0309, B:135:0x030d, B:136:0x030e, B:130:0x02fc), top: B:77:0x0222, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.a5.t(com.tencent.mm.modeltalkroom.MultiTalkGroup, boolean):void");
    }

    public void u(boolean z17) {
        if (!z17) {
            this.V = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "start capture render");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi();
        wi6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0.h(wi6, false, 1, null);
        if (this.W == null) {
            this.W = new xq4.c(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().getClass();
    }

    public void v(boolean z17) {
        if (!z17 && this.V != 0 && java.lang.System.currentTimeMillis() - this.V > 0 && com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().z()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.V;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12728, java.lang.Long.valueOf(currentTimeMillis > 1000 ? currentTimeMillis / 1000 : 1L), com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.e(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t));
            this.V = 0L;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi();
        wi6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0.j(wi6, false, 1, null);
    }

    public final void w(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        android.widget.TextView textView = this.f489955i;
        android.view.View view = this.f489956m;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = this.f489961r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f489950d;
        if (booleanValue) {
            c22698xdfbd289f.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f79636xc84bf7ff, -1));
            c22698xdfbd289f.m82034x7541828(-1);
            view.getLayoutParams().height = i65.a.b(serviceConnectionC16581x3d1d6bd2, 52) + com.p314xaae8f345.mm.ui.bk.p(serviceConnectionC16581x3d1d6bd2);
            view.setBackgroundColor(serviceConnectionC16581x3d1d6bd2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560403jg));
            textView.setVisibility(4);
            android.view.View view2 = this.f489963t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f489964u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        c22698xdfbd289f.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f80186x29194b54, -1));
        c22698xdfbd289f.m82034x7541828(-1);
        view.getLayoutParams().height = i65.a.a(serviceConnectionC16581x3d1d6bd2, serviceConnectionC16581x3d1d6bd2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a5n));
        view.setBackground(serviceConnectionC16581x3d1d6bd2.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aqk));
        textView.setVisibility(0);
        android.view.View view4 = this.f489963t;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
            android.view.View view5 = this.f489964u;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f489965v;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = this.f489964u;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!zj3.j.a()) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(this.f489967x);
            return;
        }
        android.view.View view8 = this.f489965v;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "switchTopControlStyle", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void x() {
        boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f489950d;
        android.view.View view = this.f489966w;
        if (d17) {
            view.setContentDescription(serviceConnectionC16581x3d1d6bd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h1s));
        } else {
            view.setContentDescription(serviceConnectionC16581x3d1d6bd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574113h11));
        }
    }

    public final void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b = this.A;
        if (c16586x7058535b.isEnabled()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
            boolean a17 = c16586x7058535b.a();
            Ri.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MT.MultiTalkManager", "setHandsFreeUIStatus: %s", java.lang.Boolean.valueOf(a17));
            Ri.f231697g = a17;
        }
    }

    public void z(boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f489952f;
        if (c1163xf1deaba4.mo7946xf939df19() == null || (c1161x57298f5d = this.f489954h) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList2.clear();
        arrayList3.clear();
        sj3.d dVar = (sj3.d) c1163xf1deaba4.mo7946xf939df19();
        int t17 = c1161x57298f5d.t();
        int i17 = t17 == 0 ? 0 : t17 - dVar.f489999n;
        int x17 = (c1161x57298f5d.x() - dVar.f489999n) - dVar.f490000o;
        if (i17 >= 0 && x17 >= 0) {
            while (i17 <= x17) {
                sj3.j g17 = this.f489953g.g(((aj3.c) dVar.f489993e.get(i17)).f86836a.f153145d);
                if (g17 != null && (c16587x33e31ed = g17.f490110d) != null) {
                    if ((c16587x33e31ed.status == sj3.c5.f489988e) || c16587x33e31ed.j()) {
                        int c17 = zj3.j.c(g17.f490110d.getF231877m());
                        arrayList2.add(java.lang.Integer.valueOf(c17));
                        int A = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.A(c17);
                        arrayList3.add(java.lang.Integer.valueOf((A == 102 || A == 101) ? 1 : 0));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "memberIds is %s", java.lang.Integer.valueOf(c17));
                    }
                }
                i17++;
            }
        } else if (c1163xf1deaba4.mo7946xf939df19() != null) {
            java.util.Iterator it = ((sj3.d) c1163xf1deaba4.mo7946xf939df19()).f489993e.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                aj3.c cVar = (aj3.c) it.next();
                boolean z18 = cVar.f86839d;
                int i19 = this.N;
                if (z18 && i18 < i19) {
                    int c18 = zj3.j.c(cVar.f86836a.f153145d);
                    arrayList2.add(java.lang.Integer.valueOf(c18));
                    int A2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.A(c18);
                    arrayList3.add(java.lang.Integer.valueOf((A2 == 102 || A2 == 101) ? 1 : 0));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "memberIds is %s", java.lang.Integer.valueOf(c18));
                }
                if (i18 >= i19) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (!(!z17 && (arrayList = this.I) != null && arrayList2.containsAll(arrayList) && this.I.containsAll(arrayList2) && arrayList3.containsAll(this.f489949J) && this.f489949J.containsAll(arrayList3)) && !com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().m().j()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            i4Var.getClass();
            i4Var.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g3(i4Var, arrayList2, false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "ilink subscribeByUserMids ok, mids:" + arrayList2);
        }
        this.I = arrayList2;
        this.f489949J = arrayList3;
    }
}
