package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes3.dex */
public class c0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public final boolean A;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.y B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.b0 C;

    /* renamed from: d, reason: collision with root package name */
    public y9.i f293779d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f293780e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f293781f;

    /* renamed from: g, reason: collision with root package name */
    public int f293782g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f293783h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f293784i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f293785m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String[] f293786n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f293787o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f293788p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 f293789q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 f293790r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 f293791s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 f293792t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.z f293793u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f293794v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f293795w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f293796x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f293797y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f293798z;

    public c0(android.content.Context context, java.lang.String[] strArr) {
        this.f293787o = null;
        this.f293788p = null;
        this.A = false;
        this.f293781f = context;
        this.f293786n = strArr;
        e();
    }

    public final java.lang.String[] a(int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = this.f293787o;
        if (arrayList2 == null || (arrayList = (java.util.ArrayList) arrayList2.get(i17)) == null) {
            return null;
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public int b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = this.f293789q;
        if (c22706xd568f79 != null) {
            return c22706xd568f79.m82064x754a37bb();
        }
        return 0;
    }

    public final java.lang.String[] c(int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = this.f293788p;
        if (arrayList2 == null || (arrayList = (java.util.ArrayList) arrayList2.get(i17)) == null) {
            return null;
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public void d() {
        y9.i iVar = this.f293779d;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    public final void e() {
        android.content.Context context = this.f293781f;
        this.f293779d = new y9.i(context, 0);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.byt, null);
        this.f293780e = inflate;
        this.f293797y = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.kk6);
        this.f293794v = (android.widget.LinearLayout) this.f293780e.findViewById(com.p314xaae8f345.mm.R.id.f567734kk4);
        this.f293798z = (android.widget.LinearLayout) this.f293780e.findViewById(com.p314xaae8f345.mm.R.id.qmx);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79(context);
        this.f293789q = c22706xd568f79;
        c22706xd568f79.m82070x203ffbdd(this.f293786n);
        this.f293794v.removeAllViews();
        this.f293794v.setGravity(17);
        this.f293794v.addView(this.f293789q.m82065xfb86a31b(), new android.widget.LinearLayout.LayoutParams(-2, -1));
        this.f293795w = (android.widget.LinearLayout) this.f293780e.findViewById(com.p314xaae8f345.mm.R.id.kk7);
        this.f293796x = (android.widget.LinearLayout) this.f293780e.findViewById(com.p314xaae8f345.mm.R.id.kk_);
        if (this.f293787o != null) {
            this.f293795w.setVisibility(0);
            this.f293790r = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79(context);
            this.f293795w.removeAllViews();
            this.f293795w.setGravity(17);
            this.f293795w.addView(this.f293790r.m82065xfb86a31b(), new android.widget.LinearLayout.LayoutParams(-2, -1));
            this.f293790r.m82070x203ffbdd(a(this.f293789q.m82064x754a37bb()));
            this.f293789q.m82069x5dc03d58(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.p(this));
        } else {
            this.f293795w.setVisibility(8);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f792 = this.f293789q;
            if (c22706xd568f792 != null) {
                c22706xd568f792.m82069x5dc03d58(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q(this));
            }
        }
        if (this.f293788p != null) {
            this.f293796x.setVisibility(0);
            this.f293791s = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79(context);
            this.f293796x.removeAllViews();
            this.f293796x.setGravity(17);
            this.f293796x.addView(this.f293791s.m82065xfb86a31b(), new android.widget.LinearLayout.LayoutParams(-2, -1));
            this.f293791s.m82070x203ffbdd(c(this.f293790r.m82064x754a37bb()));
            this.f293790r.m82069x5dc03d58(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.r(this));
        } else {
            this.f293796x.setVisibility(8);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f793 = this.f293790r;
            if (c22706xd568f793 != null) {
                c22706xd568f793.m82069x5dc03d58(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.s(this));
            }
        }
        android.widget.Button button = (android.widget.Button) this.f293780e.findViewById(com.p314xaae8f345.mm.R.id.khs);
        this.f293784i = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.t(this));
        android.widget.Button button2 = (android.widget.Button) this.f293780e.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        this.f293785m = button2;
        button2.setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.u(this));
        ((android.widget.Button) this.f293780e.findViewById(com.p314xaae8f345.mm.R.id.b1e)).setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.v(this));
        this.f293779d.setContentView(this.f293780e);
        this.f293782g = com.p314xaae8f345.mm.ui.zk.a(context, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60881xdbee435);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) this.f293780e.getParent());
        this.f293783h = A;
        if (A != null) {
            A.C(this.f293782g);
            this.f293783h.f125976p = false;
        }
        this.f293779d.setOnDismissListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.w(this));
    }

    public boolean f() {
        return this.f293791s != null;
    }

    public void g(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.f293797y;
        if (linearLayout != null) {
            if (view == null) {
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(0);
            this.f293797y.removeAllViews();
            this.f293797y.setGravity(17);
            this.f293797y.addView(view, new android.widget.LinearLayout.LayoutParams(-1, -2));
        }
    }

    public void h(int i17) {
        android.widget.Button button = this.f293784i;
        if (button != null) {
            android.content.Context context = this.f293781f;
            button.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
            if (i17 == 0) {
                this.f293784i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk);
                return;
            }
            if (i17 == 1) {
                this.f293784i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562596jr);
                this.f293784i.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aax));
            } else {
                if (i17 != 2) {
                    return;
                }
                this.f293784i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562600jw);
            }
        }
    }

    public void i(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = this.f293789q;
        if (c22706xd568f79 != null) {
            c22706xd568f79.m82071x53d8522f(i17);
            this.f293789q.c(i17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f792 = this.f293790r;
            if (c22706xd568f792 == null || this.f293787o == null) {
                return;
            }
            c22706xd568f792.m82070x203ffbdd(a(i17));
        }
    }

    public void j(int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = this.f293789q;
        if (c22706xd568f79 == null || this.f293790r == null) {
            return;
        }
        c22706xd568f79.m82071x53d8522f(i17);
        this.f293789q.c(i17);
        this.f293790r.m82070x203ffbdd(a(i17));
        this.f293790r.m82071x53d8522f(i18);
        this.f293790r.c(i18);
        this.f293790r.invalidate();
    }

    public void k(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = this.f293789q;
        if (c22706xd568f79 == null || this.f293790r == null || this.f293791s == null) {
            return;
        }
        c22706xd568f79.m82071x53d8522f(i17);
        this.f293789q.c(i17);
        this.f293790r.m82070x203ffbdd(a(i17));
        this.f293790r.m82071x53d8522f(i18);
        this.f293790r.c(i18);
        this.f293790r.invalidate();
        this.f293791s.m82070x203ffbdd(c(i18));
        this.f293791s.m82071x53d8522f(i19);
        this.f293791s.c(i19);
        this.f293791s.invalidate();
    }

    public void l() {
        y9.i iVar = this.f293779d;
        if (iVar != null) {
            iVar.show();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    public c0(android.content.Context context, java.util.ArrayList arrayList) {
        this.f293787o = null;
        this.f293788p = null;
        this.A = false;
        this.f293781f = context;
        if (arrayList != null) {
            this.f293786n = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        e();
    }

    public c0(android.content.Context context, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f293787o = null;
        this.f293788p = null;
        this.A = false;
        this.f293781f = context;
        if (arrayList != null) {
            this.f293786n = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        this.f293787o = arrayList2;
        e();
    }

    public c0(android.content.Context context, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        this.f293787o = null;
        this.f293788p = null;
        this.A = false;
        this.f293781f = context;
        if (arrayList != null) {
            this.f293786n = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        this.f293787o = arrayList2;
        this.f293788p = arrayList3;
        e();
    }

    public c0(android.content.Context context, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, boolean z17) {
        this.f293787o = null;
        this.f293788p = null;
        this.A = false;
        this.f293781f = context;
        if (arrayList != null) {
            this.f293786n = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        this.f293787o = arrayList2;
        this.f293788p = arrayList3;
        this.A = z17;
        e();
    }
}
