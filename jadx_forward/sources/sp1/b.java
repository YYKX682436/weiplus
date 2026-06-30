package sp1;

/* loaded from: classes8.dex */
public final class b extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public pp1.a f492480d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f492481e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f492482f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f492483g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f492484h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f492485i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12928x49e6eb4 f492486m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, pp1.a item) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f492480d = item;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.eey, this);
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(qp1.c0.f447227c, qp1.c0.f447228d));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tx_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f492486m = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12928x49e6eb4) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.t0p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f492481e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.t0o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f492483g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.sgt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f492482f = (android.widget.FrameLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.t0n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.um8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById6;
        this.f492484h = c22699x3dcdb352;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.um9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f492485i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById7;
        c22699x3dcdb352.setOnClickListener(new sp1.a(this));
        b(this.f492480d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBallInfo */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d m165018x9aa04c3() {
        return this.f492480d.f438926d;
    }

    /* renamed from: getRealBallType */
    private final int m165019x3aaac40d() {
        return m165018x9aa04c3().f174579d == 20 ? m165018x9aa04c3().f174580e : m165018x9aa04c3().f174579d;
    }

    public final void b(pp1.a item) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f492480d = item;
        this.f492482f.setVisibility(0);
        android.widget.ImageView imageView = this.f492481e;
        imageView.setVisibility(0);
        int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
        int d17 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aby);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f492484h;
        c22699x3dcdb352.setContentDescription(c22699x3dcdb352.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574845lg0));
        c22699x3dcdb352.setPadding(a17, a17, a17, a17);
        c22699x3dcdb352.m82040x7541828(d17);
        qp1.g0 g0Var = qp1.g0.f447255a;
        int d18 = g0Var.d(m165019x3aaac40d());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f492485i;
        c22699x3dcdb3522.setImageResource(d18);
        c22699x3dcdb3522.setAlpha(0.5f);
        c22699x3dcdb3522.m82040x7541828(d17);
        c22699x3dcdb3522.setPadding(a17, a17, a17, a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.g.f174694a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d info = m165018x9aa04c3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String e17 = info.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "generateHashKey(...)");
        android.graphics.Bitmap L = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(gVar.a(e17), 500, 500);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f492483g;
        if (L != null) {
            imageView.setImageBitmap(L);
            c22699x3dcdb3523.setVisibility(8);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            c22699x3dcdb3523.setImageResource(g0Var.d(m165019x3aaac40d()));
            c22699x3dcdb3523.setVisibility(0);
            imageView.setVisibility(8);
        }
        this.f492486m.m54166x84d007a0(true);
    }
}
