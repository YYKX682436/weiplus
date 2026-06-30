package com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76;

/* renamed from: com.tencent.mm.view.popview.EmojiPopView */
/* loaded from: classes12.dex */
public class C22838xaf7a8190 extends com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public final java.lang.Runnable A;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d f295206f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f295207g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f295208h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f295209i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f295210m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f295211n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f295212o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f295213p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f295214q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f295215r;

    /* renamed from: s, reason: collision with root package name */
    public int f295216s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f295217t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f295218u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f295219v;

    /* renamed from: w, reason: collision with root package name */
    public z12.g f295220w;

    /* renamed from: x, reason: collision with root package name */
    public int f295221x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f295222y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f295223z;

    public C22838xaf7a8190(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void e(com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPopView", "top: %s, %s, %s", c22838xaf7a8190.f295217t, java.lang.Integer.valueOf(c22838xaf7a8190.f295216s), java.lang.Boolean.valueOf(c22838xaf7a8190.f295222y));
        if (c22838xaf7a8190.f295222y) {
            return;
        }
        int i17 = c22838xaf7a8190.f295216s;
        if (i17 == 0 || i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPopView", "showLoading");
            c22838xaf7a8190.f295222y = true;
            c22838xaf7a8190.postDelayed(c22838xaf7a8190.A, 100L);
            c22838xaf7a8190.f295220w = new z12.g(c22838xaf7a8190.f295216s, 3, java.util.Collections.singletonList(c22838xaf7a8190.f295217t), null);
            gm0.j1.n().f354821b.g(c22838xaf7a8190.f295220w);
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4
    public void a() {
        f();
        super.a();
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4
    public void d(android.view.View view) {
        c(view.getContext());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f295215r.x = iArr[0] - ((getMeasuredWidth() - view.getMeasuredWidth()) / 2);
        this.f295215r.y = (iArr[1] - getMeasuredHeight()) - this.f295205e;
        int i17 = getResources().getDisplayMetrics().widthPixels;
        int measuredWidth = iArr[0] + (view.getMeasuredWidth() / 2);
        if (measuredWidth < getWidth() / 2) {
            this.f295215r.x = measuredWidth - i65.a.b(getContext(), 32);
            this.f295208h.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78006xbcf339b7);
            this.f295211n.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78007xf2d7694b);
            this.f295212o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78009xac0af93a);
            this.f295213p.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78008x102ad5fb);
            return;
        }
        if ((getWidth() / 2) + measuredWidth <= i17) {
            this.f295208h.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78038x6a2d091);
            this.f295211n.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78039xc9760ab1);
            this.f295212o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78041xa9408494);
            this.f295213p.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78040xd74852e1);
            return;
        }
        this.f295215r.x = (measuredWidth + i65.a.b(getContext(), 32)) - getMeasuredWidth();
        this.f295208h.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78047x4fe7d894);
        this.f295211n.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78048x2f348c8e);
        this.f295212o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78050xfb523e57);
        this.f295213p.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78049x25233afe);
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPopView", "hideLoading");
        this.f295222y = false;
        removeCallbacks(this.A);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f295223z;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    public final void g() {
        db5.e1.A(getContext(), getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0c), "", "", getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), null, null);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4
    /* renamed from: getWindowLayoutParams */
    public android.view.WindowManager.LayoutParams getF295229n() {
        return this.f295215r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            gm0.j1.n().f354821b.q(698, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.List singletonList = java.util.Collections.singletonList(this.f295217t);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPopView", "onSceneEnd: %s, %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this.f295217t, java.lang.Integer.valueOf(this.f295216s));
        z12.g gVar = this.f295220w;
        if (gVar == null || m1Var != gVar) {
            return;
        }
        int i19 = gVar.f550828g;
        if (i19 == 3) {
            if (i17 != 0 || i18 != 0) {
                g();
                f();
                return;
            }
            if (this.f295216s == 0) {
                gr.t.g().n(true);
                gr.t.g().l(true);
            } else {
                gr.t.g().m(true);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().y2(this.f295216s, singletonList);
            com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j.g();
            a();
            return;
        }
        if (i19 == 2) {
            if (i17 != 0 || i18 != 0) {
                g();
                f();
                return;
            }
            if (this.f295216s == 0) {
                gr.t.g().n(true);
                gr.t.g().l(true);
            } else {
                gr.t.g().m(true);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().n1(singletonList, this.f295216s);
            com.p314xaae8f345.mm.p2621x8fb0427b.z4 z4Var = com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j;
            if (z4Var.e() || com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.Ai()) {
                z4Var.g();
            }
            gr.v.f356229a.a(true);
            a();
        }
    }

    /* renamed from: setEmojiInfo */
    public void m82878xc040f7d2(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        if (c21053xdbf1e5f4 == null) {
            this.f295206f.setVisibility(4);
            this.f295207g.setVisibility(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPopView", "emoji is null. set null");
        } else {
            if (c21053xdbf1e5f4.mo42933xb5885648().equals(this.f295217t)) {
                return;
            }
            this.f295217t = c21053xdbf1e5f4.mo42933xb5885648();
            this.f295218u = c21053xdbf1e5f4;
            this.f295206f.m43715x36e51bc8(new gn5.k(this));
            this.f295206f.m43712xc040f7d2(c21053xdbf1e5f4);
            if (n22.m.f415829b) {
                this.f295214q.setText(c21053xdbf1e5f4.f68672xe33e17bb);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0193  */
    /* renamed from: setPopupType */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m82879x37076fc4(int r26) {
        /*
            Method dump skipped, instructions count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190.m82879x37076fc4(int):void");
    }

    public C22838xaf7a8190(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f295216s = -1;
        this.f295221x = 0;
        this.f295222y = false;
        this.A = new gn5.g(this);
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a78, this);
        this.f295208h = findViewById(com.p314xaae8f345.mm.R.id.dd6);
        this.f295206f = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d) findViewById(com.p314xaae8f345.mm.R.id.h88);
        this.f295207g = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.lbi);
        this.f295209i = findViewById(com.p314xaae8f345.mm.R.id.dda);
        this.f295210m = findViewById(com.p314xaae8f345.mm.R.id.dd8);
        this.f295211n = findViewById(com.p314xaae8f345.mm.R.id.dd_);
        this.f295212o = findViewById(com.p314xaae8f345.mm.R.id.dd7);
        this.f295213p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dd9);
        this.f295214q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ddb);
        setBackground(null);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(2, 262400, 1);
        this.f295215r = layoutParams;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388659;
        this.f295211n.setOnClickListener(new gn5.h(this));
        this.f295212o.setOnClickListener(new gn5.i(this));
        this.f295213p.setOnClickListener(new gn5.j(this));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            gm0.j1.n().f354821b.a(698, this);
        }
    }
}
