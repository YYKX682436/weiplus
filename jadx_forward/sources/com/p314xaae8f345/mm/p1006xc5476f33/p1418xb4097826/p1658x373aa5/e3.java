package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public class e3 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public android.view.ViewGroup A;
    public android.view.View B;
    public android.view.View C;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f213490d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f213491e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f213492f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f213493g;

    /* renamed from: h, reason: collision with root package name */
    public int f213494h;

    /* renamed from: i, reason: collision with root package name */
    public int f213495i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f213496m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewTreeObserver f213497n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f213499p;

    /* renamed from: q, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f213500q;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f213502s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f213503t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f213504u;

    /* renamed from: v, reason: collision with root package name */
    public final int f213505v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f213506w;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f213508y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f213509z;

    /* renamed from: o, reason: collision with root package name */
    public boolean f213498o = false;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d3 f213501r = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f213507x = false;
    public final java.util.LinkedList D = new java.util.LinkedList();

    public e3(android.content.Context context) {
        this.f213493g = false;
        this.f213499p = false;
        this.f213491e = context;
        this.f213499p = false;
        if (context instanceof android.app.Activity) {
            this.f213496m = ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView()).findViewById(android.R.id.content);
        }
        this.f213505v = 0;
        this.f213490d = new y9.i(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.b3b, null);
        this.f213492f = inflate;
        this.f213508y = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564977av5);
        this.f213509z = (android.view.ViewGroup) this.f213492f.findViewById(com.p314xaae8f345.mm.R.id.avd);
        this.f213502s = (android.widget.LinearLayout) this.f213492f.findViewById(com.p314xaae8f345.mm.R.id.f564974av3);
        this.f213503t = this.f213492f.findViewById(com.p314xaae8f345.mm.R.id.b5t);
        this.f213504u = (android.widget.TextView) this.f213492f.findViewById(com.p314xaae8f345.mm.R.id.b5u);
        this.A = (android.view.ViewGroup) this.f213492f.findViewById(com.p314xaae8f345.mm.R.id.gxy);
        this.B = this.f213492f.findViewById(com.p314xaae8f345.mm.R.id.f566749gy1);
        this.C = this.f213492f.findViewById(com.p314xaae8f345.mm.R.id.gxz);
        this.f213502s.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x2(this));
        this.f213493g = d();
        this.f213490d.requestWindowFeature(1);
        this.f213490d.setContentView(this.f213492f);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) this.f213492f.getParent());
        this.f213500q = A;
        if (A != null) {
            A.D(3);
        }
        this.f213490d.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.y2(this));
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 a() {
        this.A.setVisibility(0);
        this.f213506w = true;
        this.f213507x = true;
        float dimension = this.f213492f.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        float dimension2 = this.f213492f.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        float dimension3 = this.f213492f.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        this.f213500q.f125986z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z2(this, dimension, dimension3, dimension2);
        return this;
    }

    public void b() {
        this.f213508y.setBackgroundColor(this.f213491e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
    }

    public void c(boolean z17) {
        android.widget.LinearLayout linearLayout = this.f213502s;
        if (linearLayout == null) {
            return;
        }
        if (z17) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    public final boolean d() {
        return this.f213491e.getResources().getConfiguration().orientation == 2;
    }

    public boolean e() {
        android.app.Dialog dialog = this.f213490d;
        return dialog != null && dialog.isShowing();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f(int i17) {
        android.view.LayoutInflater.from(this.f213492f.getContext()).inflate(i17, this.f213508y, true);
        return this;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 g(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.f213508y.addView(view, 0, layoutParams);
        return this;
    }

    public void h() {
        android.app.Dialog dialog = this.f213490d;
        if (dialog != null) {
            android.content.Context context = this.f213491e;
            if (!(context instanceof android.app.Activity)) {
                dialog.dismiss();
            } else if (context != null && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) context).isDestroyed()) {
                this.f213490d.dismiss();
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f213500q;
            if (c2690x46972046 != null) {
                c2690x46972046.f125976p = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        this.f213493g = d();
        android.content.Context context = this.f213491e;
        this.f213494h = context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        this.f213492f.setTranslationY(0.0f);
        if (this.f213490d != null) {
            ((android.view.ViewGroup) this.f213492f.getParent()).setVisibility(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f213492f.getLayoutParams();
            boolean z17 = this.f213499p;
            android.view.View view = this.f213496m;
            if (!z17 && this.f213493g && view != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                view.getWindowVisibleDisplayFrame(rect);
                layoutParams.width = java.lang.Math.min(rect.right, rect.bottom);
                layoutParams.gravity = 1;
                android.view.ViewParent parent = this.f213492f.getParent();
                if (parent instanceof android.view.View) {
                    ((android.view.View) parent).setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.a3(this, parent));
                }
                if (parent instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    if (viewGroup.getLayoutParams() instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c) {
                        if (!this.f213507x) {
                            p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) viewGroup.getLayoutParams();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.b3 b3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.b3(this);
                            b3Var.f125986z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c3(this);
                            cVar.b(b3Var);
                            this.f213500q = b3Var;
                        }
                        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f213500q;
                        if (c2690x46972046 != null) {
                            int i17 = this.f213505v;
                            if (i17 > 0) {
                                c2690x46972046.D(4);
                                this.f213500q.C(i17);
                            } else {
                                c2690x46972046.D(3);
                            }
                        }
                    }
                }
            }
            this.f213492f.setLayoutParams(layoutParams);
            this.f213490d.getWindow().addFlags(Integer.MIN_VALUE);
            this.f213490d.getWindow().clearFlags(8);
            this.f213490d.getWindow().clearFlags(131072);
            this.f213490d.getWindow().clearFlags(128);
            this.f213490d.getWindow().getDecorView().setSystemUiVisibility(0);
            if (view != null) {
                boolean z18 = this.f213497n == null;
                android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f213497n = viewTreeObserver;
                if (z18) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                this.f213490d.show();
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x469720462 = this.f213500q;
            if (c2690x469720462 != null) {
                c2690x469720462.f125976p = this.f213506w;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (e()) {
            android.view.View view = this.f213496m;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                h();
                return;
            }
            if (e()) {
                if (this.f213493g == d()) {
                    int i17 = this.f213494h;
                    android.content.Context context = this.f213491e;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        if (this.f213495i != this.f213508y.getHeight()) {
                            this.f213495i = this.f213508y.getHeight();
                            int width = this.f213508y.getWidth();
                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) this.f213509z.getLayoutParams();
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = this.f213495i;
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = width;
                            this.f213509z.setLayoutParams(layoutParams);
                            if (this.f213509z.getParent() instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) {
                                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) this.f213509z.getParent();
                                p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
                                cVar.d(c1073x7e08a787);
                                cVar.e(this.f213509z.getId(), 2, 0, 2);
                                cVar.e(this.f213509z.getId(), 4, 0, 4);
                                cVar.b(c1073x7e08a787);
                                c1073x7e08a787.m7179xd020a803(null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                h();
            }
        }
    }
}
