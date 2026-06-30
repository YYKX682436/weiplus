package vi1;

/* loaded from: classes7.dex */
public abstract class f extends android.app.Dialog implements fl1.b2, fl1.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final xi1.g f518833d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f518834e;

    /* renamed from: f, reason: collision with root package name */
    public final fl1.s f518835f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f518836g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f518837h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f518838i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f518839m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f518840n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f518841o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f518842p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f518843q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f518844r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f518845s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f518846t;

    /* renamed from: u, reason: collision with root package name */
    public fl1.g2 f518847u;

    /* renamed from: v, reason: collision with root package name */
    public vi1.c f518848v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.drawable.Drawable f518849w;

    /* renamed from: x, reason: collision with root package name */
    public int f518850x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, xi1.g windowAndroid) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowAndroid, "windowAndroid");
        this.f518833d = windowAndroid;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569619gu, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f518834e = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.oud);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f518835f = new fl1.s(context, findViewById);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f518836g = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f518837h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        ((android.widget.Button) findViewById4).setOnClickListener(new vi1.a(this));
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById5;
        android.text.TextPaint paint = button.getPaint();
        nf.y yVar = nf.x.f418149b;
        if (yVar != null) {
            yVar.g(paint);
        } else {
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            if (paint != null) {
                paint.setStrokeWidth(0.8f);
            }
        }
        button.setOnClickListener(new vi1.b(this));
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f518838i = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.mwy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f518839m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f518842p = (android.widget.LinearLayout) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById9;
        this.f518840n = imageView;
        zk1.j jVar = zk1.m.f554947l;
        zk1.j.b(jVar, imageView, null, null, false, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 4094, null);
        android.view.View findViewById10 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById10;
        this.f518841o = textView;
        android.text.TextPaint paint2 = textView.getPaint();
        nf.y yVar2 = nf.x.f418149b;
        if (yVar2 != null) {
            yVar2.g(paint2);
        } else {
            if (paint2 != null) {
                paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
        }
        android.view.View findViewById11 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById11;
        this.f518843q = c1163xf1deaba4;
        zk1.j.b(jVar, c1163xf1deaba4, null, null, true, null, null, null, null, null, null, null, null, null, 8182, null);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        c1163xf1deaba4.m7964x8d4ad49c(null);
        android.view.View findViewById12 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f518846t = findViewById12;
        android.view.View findViewById13 = inflate.findViewById(com.p314xaae8f345.mm.R.id.b3v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.f518845s = findViewById13;
        android.view.View findViewById14 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById14;
        this.f518844r = textView2;
        zk1.j.b(jVar, textView2, android.widget.Button.class, null, false, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 4092, null);
        this.f518850x = 2;
    }

    public final void c(int i17) {
        this.f518850x = i17;
        android.view.View view = this.f518834e;
        if (i17 == 1) {
            view.setBackground(b3.l.m9707x4a96be14(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562390ea));
        } else {
            if (i17 != 2) {
                return;
            }
            view.setBackground(b3.l.m9707x4a96be14(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.e_));
        }
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new vi1.d(this));
            return;
        }
        try {
            super.dismiss();
        } finally {
            ((vi1.y1) this).mo123830x3d6f0539();
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new vi1.e(this));
        }
    }

    @Override // fl1.b2
    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f518834e;
    }

    @Override // fl1.b2
    /* renamed from: getPosition */
    public int mo14604xa86cd69f() {
        return this.f518850x;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    @Override // fl1.b2
    public void m() {
        zk1.a.a(this.f518834e);
    }

    @Override // fl1.b2
    /* renamed from: onCancel */
    public void mo123830x3d6f0539() {
        vi1.c cVar = this.f518848v;
        if (cVar != null) {
            vi1.c.a(cVar, 3, false, 2, null);
        }
    }

    /* renamed from: setAppBrandName */
    public final void m172203xce3d2713(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f518837h.setText(str);
    }

    @Override // fl1.e2
    /* renamed from: setIExternalToolsHelper */
    public void mo2005x1f85dcf7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 r1Var) {
        this.f518835f.f345393m = r1Var;
    }

    /* renamed from: setIconUrl */
    public final void m172204x12ec1b74(java.lang.String str) {
        l01.d0.f396294a.a(this.f518836g, str, com.p314xaae8f345.mm.R.C30861xcebc809e.cbh, l01.q0.f396320d);
    }

    @Override // fl1.e2
    /* renamed from: setUserAgreementCheckBoxWording */
    public void mo2015xf085c78(java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        this.f518835f.mo2015xf085c78(wording);
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        this.f518847u = g2Var;
        java.lang.Object systemService = getContext().getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            fl1.i2 i2Var = fl1.i2.f345325a;
            android.content.Context context = this.f518834e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            i2Var.a(context, this.f518834e, this.f518845s, windowManager.getDefaultDisplay().getRotation(), this.f518833d, this.f518835f.c());
        }
    }

    @Override // fl1.b2
    public void y(int i17) {
        fl1.i2 i2Var = fl1.i2.f345325a;
        android.content.Context context = this.f518834e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        i2Var.a(context, this.f518834e, this.f518845s, i17, this.f518833d, this.f518835f.c());
    }
}
