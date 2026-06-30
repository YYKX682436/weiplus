package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes11.dex */
public class g0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 f284472d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f284473e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f284474f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f284475g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f284476h;

    /* renamed from: i, reason: collision with root package name */
    public int f284477i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f284478m;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f284479n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewTreeObserver f284480o;

    public g0(android.content.Context context, android.view.View view) {
        this.f284476h = false;
        this.f284475g = view;
        this.f284474f = context;
        if (context instanceof android.app.Activity) {
            this.f284478m = ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView()).findViewById(android.R.id.content);
        }
        this.f284473e = new y9.i(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
        this.f284476h = a();
        android.app.Dialog dialog = this.f284473e;
        if (dialog != null) {
            dialog.setContentView(view);
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) view.getParent());
        this.f284479n = A;
        A.D(3);
        android.app.Dialog dialog2 = this.f284473e;
        if (dialog2 != null) {
            dialog2.setOnDismissListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e0(this));
        }
    }

    public final boolean a() {
        return this.f284474f.getResources().getConfiguration().orientation == 2;
    }

    public void b() {
        android.app.Dialog dialog = this.f284473e;
        if (dialog != null) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f284479n;
            if (c2690x46972046 != null) {
                c2690x46972046.f125976p = true;
            }
            android.content.Context context = this.f284474f;
            if (!(context instanceof android.app.Activity)) {
                dialog.dismiss();
            } else {
                if (context == null || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) context).isDestroyed()) {
                    return;
                }
                this.f284473e.dismiss();
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.app.Dialog dialog = this.f284473e;
        if (dialog != null && dialog.isShowing()) {
            android.view.View view = this.f284478m;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                b();
                return;
            }
            android.app.Dialog dialog2 = this.f284473e;
            if (dialog2 != null && dialog2.isShowing()) {
                if (this.f284476h == a()) {
                    int i17 = this.f284477i;
                    android.content.Context context = this.f284474f;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                b();
            }
        }
    }
}
