package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes9.dex */
public class o implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public y9.i f293833d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f293834e;

    /* renamed from: f, reason: collision with root package name */
    public int f293835f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f293836g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f293837h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f293838i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 f293839m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n f293840n;

    public o(android.content.Context context) {
        this.f293833d = new y9.i(context, 0);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a3k, null);
        this.f293834e = inflate;
        this.f293837h = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.cqo);
        this.f293838i = (android.widget.LinearLayout) this.f293834e.findViewById(com.p314xaae8f345.mm.R.id.cqq);
        this.f293839m = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613(context);
        this.f293837h.removeAllViews();
        this.f293837h.setGravity(17);
        this.f293837h.addView(this.f293839m.m82057xfb86a31b(), new android.widget.LinearLayout.LayoutParams(-1, -1));
        ((android.widget.Button) this.f293834e.findViewById(com.p314xaae8f345.mm.R.id.khs)).setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.i(this));
        ((android.widget.Button) this.f293834e.findViewById(com.p314xaae8f345.mm.R.id.b5i)).setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.j(this));
        ((android.widget.Button) this.f293834e.findViewById(com.p314xaae8f345.mm.R.id.b1e)).setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.k(this));
        this.f293833d.setContentView(this.f293834e);
        this.f293833d.setOnCancelListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.l(this));
        this.f293835f = com.p314xaae8f345.mm.ui.zk.a(context, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60881xdbee435);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) this.f293834e.getParent());
        this.f293836g = A;
        if (A != null) {
            A.C(this.f293835f);
            this.f293836g.f125976p = false;
        }
        this.f293833d.setOnDismissListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.m(this));
    }

    public java.lang.String a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f293839m;
        if (c22705x7e16f613 == null) {
            return null;
        }
        c22705x7e16f613.f293726e.f();
        return c22705x7e16f613.f293733o ? java.lang.String.format(java.util.Locale.US, "%04d-%02d-%02d", java.lang.Integer.valueOf(c22705x7e16f613.f293730i), java.lang.Integer.valueOf(c22705x7e16f613.f293731m), java.lang.Integer.valueOf(c22705x7e16f613.f293732n)) : c22705x7e16f613.f293734p ? java.lang.String.format(java.util.Locale.US, "%04d-%02d", java.lang.Integer.valueOf(c22705x7e16f613.f293730i), java.lang.Integer.valueOf(c22705x7e16f613.f293731m)) : java.lang.String.format(java.util.Locale.US, "%04d", java.lang.Integer.valueOf(c22705x7e16f613.f293730i));
    }

    public void b() {
        y9.i iVar = this.f293833d;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    public void c(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.f293838i;
        if (linearLayout != null) {
            if (view == null) {
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(0);
            this.f293838i.removeAllViews();
            this.f293838i.setGravity(17);
            this.f293838i.addView(view, new android.widget.LinearLayout.LayoutParams(-1, -2));
        }
    }

    public void d(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613;
        if (i17 < 0 || i18 < 0 || i19 < 0 || (c22705x7e16f613 = this.f293839m) == null) {
            return;
        }
        c22705x7e16f613.f293736r = i17;
        c22705x7e16f613.f293737s = i18;
        c22705x7e16f613.f293738t = i19;
        if (c22705x7e16f613.f293725d == null) {
            c22705x7e16f613.f293725d = c22705x7e16f613.f293726e.d();
        }
    }

    public void e(int i17, int i18, int i19) {
        if (i17 < 0 || i18 < 0 || i19 < 0) {
            return;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.Locale.US);
        calendar.set(i17, i18 - 1, i19);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f293839m;
        if (c22705x7e16f613 != null) {
            c22705x7e16f613.m82060xe3874070(java.lang.Long.valueOf(calendar.getTimeInMillis()));
        }
    }

    public void f(int i17, int i18, int i19) {
        if (i17 < 0 || i18 < 0 || i19 < 0) {
            return;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.Locale.US);
        calendar.set(i17, i18 - 1, i19);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f293839m;
        if (c22705x7e16f613 != null) {
            c22705x7e16f613.m82061xf0a11a5e(java.lang.Long.valueOf(calendar.getTimeInMillis()));
        }
    }

    public void g(boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f293839m;
        if (c22705x7e16f613 != null) {
            c22705x7e16f613.f293733o = z19;
            c22705x7e16f613.f293734p = z18;
            c22705x7e16f613.f293735q = z17;
        }
    }

    public void h() {
        if (this.f293833d != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f293839m;
            if (c22705x7e16f613 != null) {
                c22705x7e16f613.a();
            }
            this.f293833d.show();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }
}
