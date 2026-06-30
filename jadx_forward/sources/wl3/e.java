package wl3;

/* loaded from: classes10.dex */
public final class e implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f528589d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f528590e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f528591f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f528592g;

    /* renamed from: h, reason: collision with root package name */
    public int f528593h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f528594i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewTreeObserver f528595m;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f528596n;

    public e(android.content.Context context, boolean z17) {
        this.f528589d = context;
        if (context instanceof android.app.Activity) {
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f528594i = ((android.view.ViewGroup) decorView).findViewById(com.p314xaae8f345.mm.R.id.cgi);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f528590e = new y9.i(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
        this.f528591f = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.c4d, null);
        this.f528592g = a();
        android.view.View view = this.f528591f;
        if (view != null) {
            android.app.Dialog dialog = this.f528590e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
            dialog.setContentView(view);
            java.lang.Object parent = view.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) parent);
            this.f528596n = A;
            if (A != null) {
                A.D(3);
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f528596n;
            if (c2690x46972046 != null) {
                c2690x46972046.f125986z = new wl3.c();
            }
            android.app.Dialog dialog2 = this.f528590e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog2);
            dialog2.setOnDismissListener(new wl3.d(this));
        }
    }

    public final boolean a() {
        android.content.Context context = this.f528589d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final boolean b() {
        android.app.Dialog dialog = this.f528590e;
        if (dialog != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
            if (dialog.isShowing()) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        android.app.Dialog dialog = this.f528590e;
        if (dialog != null) {
            android.content.Context context = this.f528589d;
            if (!(context instanceof android.app.Activity)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
                dialog.dismiss();
            } else if (context != null && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) context).isDestroyed()) {
                android.app.Dialog dialog2 = this.f528590e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog2);
                dialog2.dismiss();
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f528596n;
            if (c2690x46972046 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2690x46972046);
                c2690x46972046.f125976p = true;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (b()) {
            android.view.View view = this.f528594i;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                c();
                return;
            }
            if (b()) {
                if (this.f528592g == a()) {
                    int i17 = this.f528593h;
                    android.content.Context context = this.f528589d;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                c();
            }
        }
    }
}
