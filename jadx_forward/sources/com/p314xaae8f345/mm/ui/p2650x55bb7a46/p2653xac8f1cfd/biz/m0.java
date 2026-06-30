package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes8.dex */
public class m0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f280332d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f280333e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f280334f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f280335g;

    /* renamed from: h, reason: collision with root package name */
    public int f280336h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f280337i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewTreeObserver f280338m;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f280339n;

    public m0(android.content.Context context) {
        this.f280335g = false;
        this.f280333e = context;
        if (context instanceof android.app.Activity) {
            this.f280337i = ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView()).findViewById(android.R.id.content);
        }
        y9.i iVar = new y9.i(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
        this.f280332d = iVar;
        iVar.setCanceledOnTouchOutside(false);
        this.f280334f = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569746kn, null);
        this.f280335g = a();
        this.f280332d.setContentView(this.f280334f);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) this.f280334f.getParent());
        this.f280339n = A;
        A.D(3);
        this.f280339n.f125986z = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.k0(this);
        this.f280332d.setOnDismissListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.l0(this));
    }

    public final boolean a() {
        return this.f280333e.getResources().getConfiguration().orientation == 2;
    }

    public void b() {
        android.app.Dialog dialog = this.f280332d;
        if (dialog != null) {
            android.content.Context context = this.f280333e;
            if (!(context instanceof android.app.Activity)) {
                dialog.dismiss();
            } else if (context != null && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) context).isDestroyed()) {
                this.f280332d.dismiss();
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f280339n;
            if (c2690x46972046 != null) {
                c2690x46972046.f125976p = true;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.app.Dialog dialog = this.f280332d;
        if (dialog != null && dialog.isShowing()) {
            android.view.View view = this.f280337i;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                b();
                return;
            }
            android.app.Dialog dialog2 = this.f280332d;
            if (dialog2 != null && dialog2.isShowing()) {
                if (this.f280335g == a()) {
                    int i17 = this.f280336h;
                    android.content.Context context = this.f280333e;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                b();
            }
        }
    }
}
