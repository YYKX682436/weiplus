package fl1;

/* loaded from: classes7.dex */
public final class z1 implements fl1.b2, si1.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 f345432d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f345433e;

    /* renamed from: f, reason: collision with root package name */
    public final xi1.g f345434f;

    /* renamed from: g, reason: collision with root package name */
    public fl1.g2 f345435g;

    /* renamed from: h, reason: collision with root package name */
    public final int f345436h;

    /* renamed from: i, reason: collision with root package name */
    public int f345437i;

    /* renamed from: m, reason: collision with root package name */
    public int f345438m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f345439n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f345440o;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 r1Var, java.lang.String str, android.content.Context context, int i17, xi1.g windowAndroid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowAndroid, "windowAndroid");
        this.f345432d = r1Var;
        this.f345433e = context;
        this.f345434f = windowAndroid;
        int a17 = com.p314xaae8f345.mm.ui.zk.a(context, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
        a17 = a17 < i17 ? i17 : a17;
        this.f345436h = a17;
        this.f345437i = e();
        if (r1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.FULL.DialogExplainDialog", "<init> get NULL webviewOpener");
        }
        this.f345438m = 2;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569594fs, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f345440o = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.kug);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f345439n = findViewById;
        findViewById.setMinimumHeight(a17);
        findViewById.addOnLayoutChangeListener(new fl1.w1(this));
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.kuh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        zk1.m.f554947l.a(imageView, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : 17, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) : null);
        imageView.setOnClickListener(new fl1.x1(this));
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.kuj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        ((android.widget.TextView) findViewById3).setText(inflate.getContext().getText(com.p314xaae8f345.mm.R.C30867xcad56011.a3c));
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.kui);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        textView.setText(kk1.d.a(str, false, new fl1.y1(this)));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setLinkTextColor(android.graphics.Color.parseColor("#FF576B95"));
        n3.l1.d(textView);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    public final void c() {
        java.lang.Object systemService = this.f345433e.getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            fl1.i2 i2Var = fl1.i2.f345325a;
            android.content.Context context = this.f345440o.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            i2Var.a(context, this.f345440o, null, windowManager.getDefaultDisplay().getRotation(), this.f345434f, false);
        }
    }

    @Override // android.content.DialogInterface
    public void cancel() {
    }

    @Override // fl1.b2
    public boolean d() {
        return true;
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        fl1.g2 g2Var = this.f345435g;
        if (g2Var != null) {
            g2Var.a(this);
        }
    }

    public final int e() {
        int i17 = (int) (r0.getResources().getDisplayMetrics().heightPixels * (2 == this.f345433e.getResources().getConfiguration().orientation ? 1.0f : 0.75f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.DialogExplainDialog", "calculateMaxHeight, maxHeight: " + i17);
        return i17;
    }

    @Override // fl1.b2
    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f345440o;
    }

    @Override // fl1.b2
    /* renamed from: getPosition */
    public int mo14604xa86cd69f() {
        return this.f345438m;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    public final void k(int i17) {
        this.f345438m = i17;
        android.content.Context context = this.f345433e;
        android.view.View view = this.f345440o;
        if (i17 == 1) {
            view.setBackground(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f562390ea));
        } else {
            if (i17 != 2) {
                return;
            }
            view.setBackground(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.C30861xcebc809e.e_));
        }
    }

    @Override // fl1.b2
    public void m() {
        zk1.a.a(this.f345440o);
    }

    @Override // fl1.b2
    /* renamed from: onCancel */
    public void mo123830x3d6f0539() {
    }

    @Override // si1.i0
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        k(this.f345438m);
        i(component).c(this);
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        this.f345435g = g2Var;
        c();
    }

    @Override // fl1.b2
    public void y(int i17) {
        c();
        this.f345437i = e();
    }
}
