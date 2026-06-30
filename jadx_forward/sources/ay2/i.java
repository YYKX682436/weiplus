package ay2;

/* loaded from: classes5.dex */
public final class i extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f96772d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f96773e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f96774f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f96775g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.Button f96776h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f96777i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.LinearLayout f96778m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.Button f96779n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.Button f96780o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f96781p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f96782q;

    /* renamed from: r, reason: collision with root package name */
    public long f96783r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f96784s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f96785t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.app.Activity activity) {
        super(activity, com.p314xaae8f345.mm.R.C30868x68b1db1.f576329wi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f96772d = activity;
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.b_1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f96773e = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ii8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f96774f = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f569006oq4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f96775g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.b1k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f96776h = (android.widget.Button) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.pnq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f96777i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById4;
        this.f96778m = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.ucb);
        this.f96779n = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567184uc3);
        this.f96780o = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567183uc2);
        this.f96781p = "";
        this.f96785t = "Finder.FinderTeensGuideBtmDialog";
    }

    public final void b(int i17) {
        c(i17);
        dismiss();
    }

    public final void c(int i17) {
        if (this.f96783r >= 0) {
            android.app.Activity context = this.f96772d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            ((cy1.a) rVar).Bj("teen_mode_guide_describe", "view_unexp", kz5.c1.k(new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("teen_guide_out_type", java.lang.Integer.valueOf(i17)), new jz5.l("stay_time_ms", java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - this.f96783r))), 1, false);
        }
        this.f96783r = 0L;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6.getAction() == 0 && isShowing() && (view = this.f96773e) != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            this.f96784s = ev6.getRawX() < ((float) i17) || ev6.getRawX() > ((float) (view.getWidth() + i17)) || ev6.getRawY() < ((float) i18) || ev6.getRawY() > ((float) (view.getHeight() + i18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96785t, "isOutsideClick: " + this.f96784s);
        }
        return super.dispatchTouchEvent(ev6);
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575731gv);
            window.getDecorView().setPadding(0, 0, 0, 0);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
            }
        }
        android.view.View view = this.f96773e;
        setContentView(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E6).mo141623x754a37bb()).r()).booleanValue();
        android.widget.LinearLayout linearLayout = this.f96778m;
        android.widget.Button button = this.f96776h;
        if (booleanValue) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (button != null) {
                button.setVisibility(8);
            }
        } else {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (button != null) {
                button.setVisibility(0);
            }
        }
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new ay2.b(this));
        view.setOnClickListener(new ay2.c(this));
        this.f96774f.setOnClickListener(new ay2.d(this));
        button.setOnClickListener(new ay2.e(this));
        this.f96777i.setOnClickListener(new ay2.f(this));
        this.f96779n.setOnClickListener(new ay2.g(this));
        this.f96780o.setOnClickListener(new ay2.h(this));
        this.f96775g.setText(this.f96781p);
    }
}
