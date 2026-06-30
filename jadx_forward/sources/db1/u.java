package db1;

/* loaded from: classes9.dex */
public final class u implements fl1.b2 {

    /* renamed from: d, reason: collision with root package name */
    public final fl1.g2 f309407d;

    /* renamed from: e, reason: collision with root package name */
    public final int f309408e;

    /* renamed from: f, reason: collision with root package name */
    public final int f309409f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f309410g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f309411h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f309412i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f309413m;

    public u(fl1.g2 g2Var, java.lang.String title, java.lang.String content, android.content.Context context, int i17, int i18, yz5.l handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f309407d = g2Var;
        this.f309408e = i17;
        this.f309409f = i18;
        this.f309410g = handler;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569594fs, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f309413m = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.kuf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f309411h = findViewById;
        findViewById.setMinimumHeight(i17);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.kug);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f309412i = findViewById2;
        findViewById2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        findViewById2.setMinimumHeight(i17);
        findViewById2.setPadding(0, 0, 0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf));
        findViewById2.addOnLayoutChangeListener(new db1.r(this));
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.kuh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        ((android.widget.ImageView) findViewById3).setOnClickListener(new db1.s(this));
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.kuj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        ((android.widget.TextView) findViewById4).setText(title);
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.kui);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        textView.setText(kk1.d.a(content, false, new db1.t(this)));
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight(i65.a.b(context, 28));
        } else {
            textView.setLineSpacing(i65.a.g(context) * 12.5f, 1.0f);
        }
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setLinkTextColor(android.graphics.Color.parseColor("#FF576B95"));
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
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
    }

    @Override // fl1.b2
    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f309413m;
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
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
    }

    @Override // fl1.b2
    public void y(int i17) {
    }
}
