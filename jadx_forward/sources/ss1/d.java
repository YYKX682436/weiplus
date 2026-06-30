package ss1;

/* loaded from: classes8.dex */
public final class d implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f493418d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f493419e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f493420f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f493421g;

    /* renamed from: h, reason: collision with root package name */
    public int f493422h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f493423i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewTreeObserver f493424m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f493425n;

    /* renamed from: o, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f493426o;

    /* renamed from: p, reason: collision with root package name */
    public rv.m3 f493427p;

    /* renamed from: q, reason: collision with root package name */
    public final int f493428q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f493429r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f493430s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f493431t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f493432u;

    public d(android.content.Context context, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 2) != 0 ? 0 : i17;
        this.f493418d = context;
        if (context instanceof android.app.Activity) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f493423i = ((android.view.ViewGroup) decorView).findViewById(android.R.id.content);
        }
        this.f493428q = i17;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizBottomSheet", "initView context is null");
            return;
        }
        this.f493419e = new y9.i(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dzq, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f493420f = inflate;
        this.f493430s = (android.view.ViewGroup) a().findViewById(com.p314xaae8f345.mm.R.id.f564977av5);
        this.f493431t = (android.view.ViewGroup) a().findViewById(com.p314xaae8f345.mm.R.id.gxy);
        this.f493432u = a().findViewById(com.p314xaae8f345.mm.R.id.f566749gy1);
        this.f493421g = c();
        android.app.Dialog dialog = this.f493419e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
        dialog.requestWindowFeature(1);
        android.app.Dialog dialog2 = this.f493419e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog2);
        dialog2.setContentView(a());
        java.lang.Object parent = a().getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        this.f493426o = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) parent);
        e();
        android.app.Dialog dialog3 = this.f493419e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog3);
        dialog3.setOnDismissListener(new ss1.b(this));
    }

    public final android.view.View a() {
        android.view.View view = this.f493420f;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
        throw null;
    }

    public final int b() {
        android.content.Context context = this.f493418d;
        if (!(context instanceof android.app.Activity)) {
            return 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    public final boolean c() {
        android.content.Context context = this.f493418d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final boolean d() {
        android.app.Dialog dialog = this.f493419e;
        if (dialog == null) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
        return dialog.isShowing();
    }

    public final void e() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f493426o;
        if (c2690x46972046 != null) {
            int i17 = this.f493428q;
            if (i17 > 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2690x46972046);
                c2690x46972046.D(4);
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x469720462 = this.f493426o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2690x469720462);
                c2690x469720462.C(i17);
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2690x46972046);
            c2690x46972046.D(3);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x469720463 = this.f493426o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2690x469720463);
            c2690x469720463.f125977q = true;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x469720464 = this.f493426o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2690x469720464);
            c2690x469720464.f125976p = true;
        }
    }

    public final void f() {
        android.app.Dialog dialog = this.f493419e;
        if (dialog != null) {
            android.content.Context context = this.f493418d;
            if (!(context instanceof android.app.Activity)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
                dialog.dismiss();
            } else if (context != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (!((android.app.Activity) context).isFinishing()) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    if (!((android.app.Activity) context).isDestroyed()) {
                        android.app.Dialog dialog2 = this.f493419e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog2);
                        dialog2.dismiss();
                    }
                }
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f493426o;
            if (c2690x46972046 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2690x46972046);
                c2690x46972046.f125976p = true;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (d()) {
            android.view.View view = this.f493423i;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                f();
            } else if (d()) {
                if (this.f493421g == c() && this.f493422h == b()) {
                    return;
                }
                f();
            }
        }
    }
}
