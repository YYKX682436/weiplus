package db1;

/* loaded from: classes5.dex */
public final class p extends android.app.Dialog implements fl1.b2 {
    public yz5.a A;
    public yz5.a B;
    public yz5.a C;
    public yz5.l D;
    public yz5.a E;
    public yz5.a F;
    public yz5.a G;
    public yz5.a H;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f309383d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f309384e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f309385f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f309386g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f309387h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f309388i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f309389m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f309390n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f309391o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f309392p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf f309393q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f309394r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.ViewGroup f309395s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.CheckBox f309396t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f309397u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f309398v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.Button f309399w;

    /* renamed from: x, reason: collision with root package name */
    public vi1.l0 f309400x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 f309401y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f309402z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569613gf, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f309383d = inflate;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0();
        r0Var.G(context);
        this.f309401y = r0Var;
        this.f309402z = new java.util.ArrayList();
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f309384e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f309385f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f309386g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        this.f309387h = imageView;
        imageView.setOnClickListener(new db1.a(this));
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.h7u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f309388i = (android.view.ViewGroup) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.h7w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f309389m = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.h7v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f309390n = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ku8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f309391o = (android.view.ViewGroup) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ku9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f309392p = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf c12697x85b15aaf = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf) findViewById10;
        this.f309393q = c12697x85b15aaf;
        c12697x85b15aaf.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        c12697x85b15aaf.m7964x8d4ad49c(null);
        android.view.View findViewById11 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById11;
        this.f309394r = textView;
        textView.setOnClickListener(new db1.b(this));
        android.view.View findViewById12 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lch);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f309395s = (android.view.ViewGroup) findViewById12;
        android.view.View findViewById13 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566834h81);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById13;
        this.f309396t = checkBox;
        android.view.View findViewById14 = inflate.findViewById(com.p314xaae8f345.mm.R.id.mvp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.f309397u = (android.widget.TextView) findViewById14;
        android.view.View findViewById15 = inflate.findViewById(com.p314xaae8f345.mm.R.id.b3v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        this.f309398v = findViewById15;
        android.view.View findViewById16 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        android.view.View findViewById17 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lzx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById17, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById17;
        this.f309399w = button;
        button.setOnClickListener(new db1.c(this));
        checkBox.setOnCheckedChangeListener(new db1.d(this));
        ((android.widget.Button) findViewById16).setOnClickListener(new db1.e(this));
        this.A = db1.f.f309373d;
        this.B = db1.m.f309380d;
        this.C = db1.h.f309375d;
        this.D = db1.i.f309376d;
        this.E = db1.l.f309379d;
        this.F = db1.j.f309377d;
        this.G = db1.g.f309374d;
        this.H = db1.k.f309378d;
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    public final void b(int i17) {
        this.f309393q.m52925x25bfb969((int) (getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561654om) * ((i17 == 1 || i17 == 3) ? 1.5d : 2.5d)));
    }

    public final void c(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        android.view.ViewGroup viewGroup = this.f309395s;
        android.view.ViewGroup viewGroup2 = this.f309388i;
        if (K0) {
            viewGroup2.setVisibility(8);
            viewGroup.setVisibility(8);
        } else {
            viewGroup2.setVisibility(0);
            this.f309390n.setText(str);
            viewGroup.setVisibility(0);
        }
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        mo123830x3d6f0539();
    }

    public final void e(java.util.ArrayList value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.util.ArrayList arrayList = this.f309402z;
        arrayList.clear();
        arrayList.addAll(value);
        ik1.h0.b(new db1.n(this));
    }

    @Override // fl1.b2
    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f309383d;
    }

    @Override // fl1.b2
    /* renamed from: getPosition */
    public int mo14604xa86cd69f() {
        return 2;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    @Override // fl1.b2
    public void m() {
    }

    @Override // fl1.b2
    /* renamed from: onCancel */
    public void mo123830x3d6f0539() {
        this.C.mo152xb9724478();
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        java.lang.Object systemService = getContext().getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            fl1.i2 i2Var = fl1.i2.f345325a;
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            i2Var.a(context, this.f309383d, this.f309398v, windowManager.getDefaultDisplay().getRotation(), this.f309401y, false);
            b(windowManager.getDefaultDisplay().getRotation());
        }
    }

    @Override // fl1.b2
    public void y(int i17) {
        fl1.i2 i2Var = fl1.i2.f345325a;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        i2Var.a(context, this.f309383d, this.f309398v, i17, this.f309401y, false);
        b(i17);
    }
}
