package ur2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f511917a;

    /* renamed from: b, reason: collision with root package name */
    public final ry2.e f511918b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f511919c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f511920d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f511921e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f511922f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f511923g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f511924h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f511925i;

    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, ry2.e eVar, java.lang.String title, final yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f511917a = activity;
        this.f511918b = eVar;
        this.f511919c = title;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activity);
        this.f511920d = y1Var;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ede, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f511921e = inflate;
        y1Var.f293577z = true;
        y1Var.o(aVar != null ? new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2(aVar) { // from class: ur2.b

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.a f511916a;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "function");
                this.f511916a = aVar;
            }

            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2
            /* renamed from: onDismiss */
            public final /* synthetic */ void mo51018xb349b3ab() {
                this.f511916a.mo152xb9724478();
            }
        } : null);
        y1Var.l(inflate, new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.widget.ImageView imageView = this.f511923g;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
            throw null;
        }
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
        android.widget.TextView textView = this.f511922f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickTv");
            throw null;
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this.f511917a, str2));
    }

    public final void b() {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        android.view.View view = this.f511921e;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.u1s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f511925i = findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.u1q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f511924h = findViewById2;
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.u1r);
        findViewById3.getLayoutParams().height = findViewById3.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
        android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.tso);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f511923g = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.p314xaae8f345.mm.R.id.tsn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f511922f = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.p314xaae8f345.mm.R.id.tsp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById6;
        ry2.e eVar = this.f511918b;
        imageView.setImageDrawable(eVar != null ? eVar.e() : null);
        android.view.View findViewById7 = view.findViewById(com.p314xaae8f345.mm.R.id.tsm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.b((android.widget.TextView) findViewById7);
        java.lang.String str = this.f511919c;
        boolean z17 = str.length() == 0;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f511917a;
        if (z17) {
            str = activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ok8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.tsq)).setText(str);
        android.view.View view2 = this.f511925i;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headIndicatorLine");
            throw null;
        }
        android.content.res.Resources resources = view2.getContext().getResources();
        float dimension = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        float dimension2 = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        float dimension3 = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f511920d;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = y1Var.f293569r;
        if (c2690x46972046 != null) {
            c2690x46972046.f125986z = new ur2.a(this, dimension, dimension3, dimension2);
        }
        java.lang.String e17 = xy2.c.e(activityC0065xcd7aa112);
        ya2.b2 b17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17) ? ya2.h.f542017a.b(e17) : null;
        if (b17 != null) {
            r45.xk b18 = ya2.d.b(b17, true);
            f0Var = jz5.f0.f384359a;
            if (b18 != null) {
                a(b18.m75945x2fec8307(2), b18.m75945x2fec8307(1));
                f0Var2 = f0Var;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                a(b17.f69301x81118c51, b17.w0());
            }
            android.widget.ImageView imageView2 = this.f511923g;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            imageView2.setVisibility(0);
            android.widget.TextView textView = this.f511922f;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickTv");
                throw null;
            }
            textView.setVisibility(0);
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.widget.ImageView imageView3 = this.f511923g;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            imageView3.setVisibility(8);
            android.widget.TextView textView2 = this.f511922f;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickTv");
                throw null;
            }
            textView2.setVisibility(8);
        }
        y1Var.s();
    }
}
