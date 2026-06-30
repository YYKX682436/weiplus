package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

@db5.a(m123858x6ac9171 = 131)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.ui.chatting.TextPreviewUI */
/* loaded from: classes9.dex */
public class ActivityC21642xe60a98f extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {
    public static final /* synthetic */ int H = 0;
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.hc A;
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21646xc9478c58 E;
    public android.view.View F;
    public android.view.View G;

    /* renamed from: g, reason: collision with root package name */
    public r15.g f279861g;

    /* renamed from: h, reason: collision with root package name */
    public int f279862h;

    /* renamed from: i, reason: collision with root package name */
    public wl5.x f279863i;

    /* renamed from: m, reason: collision with root package name */
    public rl5.r f279864m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f279865n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f279866o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f279867p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f279868q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21469xdaa23983 f279869r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.animation.Animation f279870s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.animation.Animation f279871t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f279872u;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f279876y;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f279858d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f279859e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f279860f = null;

    /* renamed from: v, reason: collision with root package name */
    public int f279873v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f279874w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f279875x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f279877z = false;
    public boolean B = false;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z C = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.be(this);
    public boolean D = false;

    public static void U6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f, android.content.Context context, java.lang.CharSequence charSequence) {
        activityC21642xe60a98f.getClass();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_content", charSequence);
        intent.putExtra("Retr_Msg_Id", activityC21642xe60a98f.f279872u.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", activityC21642xe60a98f.f279872u.Q0());
        intent.putExtra("Retr_Msg_Type", 4);
        intent.putExtra("scene_from", 17);
        intent.putExtra("ForwardParams_ForwardMsgType", 5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/TextPreviewUI", "sendMsg", "(Landroid/content/Context;Ljava/lang/CharSequence;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/TextPreviewUI", "sendMsg", "(Landroid/content/Context;Ljava/lang/CharSequence;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
    }

    public static void V6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f) {
        if (activityC21642xe60a98f.F == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.ia.u(activityC21642xe60a98f.f279872u)) || activityC21642xe60a98f.f279877z) {
            return;
        }
        activityC21642xe60a98f.F.setAnimation(activityC21642xe60a98f.f279870s);
        android.view.View view = activityC21642xe60a98f.F;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/TextPreviewUI", "showToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/TextPreviewUI", "showToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static void W6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18) {
        int j17;
        if (f9Var != null && (j17 = c01.ia.j(f9Var)) > 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6740x861a3f0 c6740x861a3f0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6740x861a3f0();
            int i19 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(f9Var.Q0()) ? 2 : 1;
            int i27 = f9Var.A0() == 1 ? 1 : 0;
            c6740x861a3f0.f140735f = f9Var.I0();
            c6740x861a3f0.f140733d = i19;
            c6740x861a3f0.f140734e = i27;
            c6740x861a3f0.f140738i = j17;
            c6740x861a3f0.f140736g = i17;
            c6740x861a3f0.f140737h = i18;
            c6740x861a3f0.k();
        }
    }

    public static void X6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f) {
        wl5.x xVar = activityC21642xe60a98f.f279863i;
        if (xVar != null) {
            xVar.k();
            wl5.x xVar2 = activityC21642xe60a98f.f279863i;
            xVar2.M = true;
            xVar2.N = true;
            xVar2.i();
        }
    }

    public final void Y6() {
        android.view.View view = this.G;
        if (view == null || this.f279858d == null) {
            return;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        this.f279858d.getLocationOnScreen(iArr2);
        boolean z17 = false;
        int i17 = iArr[0];
        int i18 = iArr[1];
        int width = this.G.getWidth() + i17;
        int height = this.G.getHeight() + i18;
        int i19 = iArr2[0];
        int i27 = iArr2[1];
        int width2 = this.f279858d.getWidth() + i19;
        int height2 = this.f279858d.getHeight() + i27;
        if (width >= i19 && i17 <= width2 && height >= i27 && i18 <= height2) {
            z17 = true;
        }
        if (z17) {
            this.G.setElevation(10.0f);
        } else {
            this.G.setElevation(0.0f);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570058vz;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r15.f b17;
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        if (fp.h.c(19)) {
            getWindow().setFlags(67109888, 67109888);
        }
        this.f279866o = findViewById(com.p314xaae8f345.mm.R.id.o4t);
        this.f279860f = getIntent().getCharSequenceExtra("key_chat_text");
        this.f279862h = getIntent().getIntExtra("key_msg_type", 0);
        getIntent().getIntExtra("key_quote_msg_wait_send", 0);
        long longExtra = getIntent().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        java.lang.Object a17 = ok5.d.a(getIntent(), "kPartialQuoteContent");
        if (a17 instanceof r15.g) {
            this.f279861g = (r15.g) a17;
        }
        this.f279872u = pt0.f0.wg(stringExtra, longExtra, true);
        this.f279858d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ghb);
        this.f279859e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ghc);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.hrp);
        this.f279867p = findViewById;
        this.f279868q = findViewById.findViewById(com.p314xaae8f345.mm.R.id.hpz);
        this.f279869r = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21469xdaa23983) findViewById(com.p314xaae8f345.mm.R.id.gh8);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ec ecVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ec(this.f279858d);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21469xdaa23983 c21469xdaa23983 = this.f279869r;
        ecVar.f282007b = c21469xdaa23983;
        ecVar.f282008c = c21469xdaa23983 != null;
        ecVar.f282011f = new yz5.a() { // from class: com.tencent.mm.ui.chatting.TextPreviewUI$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                wl5.x xVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.this.f279863i;
                if (xVar == null || !(wl5.y.o(xVar.f528698j) instanceof android.text.Spannable)) {
                    return null;
                }
                xVar.f528707s = (android.text.Spannable) wl5.y.o(xVar.f528698j);
                return null;
            }
        };
        this.A = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.hc(ecVar, null);
        android.widget.TextView textView = this.f279859e;
        java.lang.CharSequence charSequence = this.f279860f;
        java.lang.String Q0 = this.f279872u.Q0();
        if (charSequence instanceof java.lang.String) {
            charSequence = ((java.lang.String) charSequence).replaceAll(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, "\n").replaceAll("\r", "\n");
        }
        java.lang.String spannableString = new android.text.SpannableString(charSequence).toString();
        android.os.Bundle a18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.m1.a(getIntent().getBooleanExtra("is_group_chat", false), k01.d.a(Q0));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.t.f262519a.a(a18, this.f279872u);
        a18.putString("geta8key_username", Q0);
        a18.putInt("KMsgType", this.f279872u.mo78013xfb85f7b0());
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        int textSize = (int) textView.getTextSize();
        le0.r rVar = le0.x.P0;
        boolean z17 = !c01.ia.D(this.f279872u);
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.s(context, spannableString, textSize, 1, a18, null, 1, rVar, z17));
        this.f279860f = textView.getText();
        android.widget.TextView textView2 = this.f279858d;
        com.p314xaae8f345.mm.p2614xca6eae71.x1 Di = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
        mo55332x76847179();
        textView2.setText(Di.Ri(this.f279860f, true));
        if (this.f279861g != null && (b17 = r15.h.b(this.f279860f.toString(), this.f279861g)) != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.hc hcVar = this.A;
            hcVar.f283206e = b17.f450177a;
            hcVar.f283207f = b17.f450178b;
            this.f279858d.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ce(this));
        }
        this.f279876y = c01.z1.r();
        yd5.g gVar = yd5.h.f542632a;
        android.widget.TextView textView3 = this.f279858d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f279872u;
        gVar.a(textView3, f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(f9Var.Q0()), this.f279876y);
        this.f279858d.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.view.ViewTreeObserver viewTreeObserver = this.f279858d.getViewTreeObserver();
        this.f279877z = getIntent().getBooleanExtra("key_chat_preview_hide_toolbar", false);
        viewTreeObserver.addOnPreDrawListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.de(this));
        this.f279870s = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559390df);
        this.f279871t = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        boolean z18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20050xba919ccc()) == 1 && ti3.i.k(this.f279872u) && !this.f279877z;
        rl5.r rVar2 = new rl5.r(mo55332x76847179(), this.f279858d);
        this.f279864m = rVar2;
        rVar2.C = true;
        rVar2.Q = false;
        rVar2.f478888y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ee(this, z18);
        rVar2.f478884u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.fe(this);
        rVar2.f478887x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.he(this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.je jeVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.je(this);
        if (this.f279863i == null && !c01.ia.A(this.f279872u) && !c01.ia.y(this.f279872u) && !c01.ia.x(this.f279872u)) {
            wl5.o oVar = new wl5.o(this.f279858d, this.f279864m, null, null, jeVar);
            oVar.f528656g = com.p314xaae8f345.mm.R.C30859x5a72f63.a3y;
            oVar.f528655f = com.p314xaae8f345.mm.R.C30859x5a72f63.f560393j6;
            oVar.a(com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 20));
            wl5.x xVar2 = new wl5.x(oVar);
            this.f279863i = xVar2;
            xVar2.f528692d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ke(this);
        }
        this.f279866o.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.le(this));
        this.f279858d.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.rd(this));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.ia.u(this.f279872u))) {
            android.view.View view = this.f279867p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/TextPreviewUI", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/TextPreviewUI", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f279868q.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.sd(this));
        } else if (!c01.ia.A(this.f279872u) && !c01.ia.y(this.f279872u)) {
            if (!(this.f279862h == 1) && !c01.ia.x(this.f279872u)) {
                if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.K3(this.f279872u.Q0())) {
                    android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.f569121p34);
                    if (viewStub != null) {
                        this.F = viewStub.inflate();
                    }
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21646xc9478c58 c21646xc9478c58 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21646xc9478c58) findViewById(com.p314xaae8f345.mm.R.id.f568895of0);
                    this.E = c21646xc9478c58;
                    c21646xc9478c58.setVisibility(!this.f279877z ? 0 : 8);
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21646xc9478c58 c21646xc9478c582 = this.E;
                if (c21646xc9478c582 != null) {
                    c21646xc9478c582.a(0, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.xd(this));
                    this.E.a(1, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.yd(this));
                    this.E.a(2, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.zd(this));
                }
            }
        }
        if (this.f279862h == 1) {
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.uck);
            this.G = findViewById2;
            if (findViewById2 != null) {
                findViewById2.setElevation(0.0f);
                android.widget.Button button = (android.widget.Button) this.G.findViewById(com.p314xaae8f345.mm.R.id.ucl);
                this.G.setOutlineProvider(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ae(this));
                android.text.TextPaint paint = button.getPaint();
                paint.setFakeBoldText(true);
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                paint.setStrokeWidth(0.8f);
                button.setGravity(16);
                this.G.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.TextPreviewUI$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.H;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.this.Y6();
                    }
                });
            }
            android.view.View view2 = this.G;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/TextPreviewUI", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/TextPreviewUI", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.G.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.chatting.TextPreviewUI$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.H;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.this;
                    activityC21642xe60a98f.getClass();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(view3);
                    java.lang.Object[] array = arrayList3.toArray();
                    arrayList3.clear();
                    yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC21642xe60a98f, array);
                    activityC21642xe60a98f.setResult(100);
                    activityC21642xe60a98f.finish();
                    yj0.a.h(activityC21642xe60a98f, "com/tencent/mm/ui/chatting/TextPreviewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            android.widget.TextView textView4 = this.f279858d;
            textView4.setPadding(textView4.getPaddingLeft(), this.f279858d.getPaddingTop(), this.f279858d.getPaddingRight(), i65.a.a(this, 80.0f));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.td(this));
        this.f279869r.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ud(this));
        this.f279869r.m78870x945a8432(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.vd(this));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21646xc9478c58 c21646xc9478c583 = this.E;
        if (c21646xc9478c583 == null || c21646xc9478c583.getVisibility() != 0) {
            mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        } else {
            mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.hc hcVar = this.A;
        if (hcVar != null) {
            hcVar.f283204c.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.hc hcVar = this.A;
        if (hcVar != null) {
            hcVar.f283204c.removeCallbacksAndMessages(null);
        }
        qp1.h0.b();
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(this.C);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        qp1.h0.a(true, true, true);
        wl5.x xVar = this.f279863i;
        if (xVar != null) {
            if (!xVar.M) {
                xVar.q();
            }
            wl5.x xVar2 = this.f279863i;
            if (!xVar2.N) {
                xVar2.o();
            }
        }
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).wi(this.C);
    }
}
