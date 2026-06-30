package za3;

/* loaded from: classes15.dex */
public class i1 {

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.Object f552475x = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f552476a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f552477b;

    /* renamed from: c, reason: collision with root package name */
    public r45.mw6 f552478c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725 f552479d;

    /* renamed from: k, reason: collision with root package name */
    public r45.io6 f552486k;

    /* renamed from: l, reason: collision with root package name */
    public final ab3.h f552487l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f552488m;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnTouchListener f552494s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f552495t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnClickListener f552496u;

    /* renamed from: v, reason: collision with root package name */
    public final i11.c f552497v;

    /* renamed from: w, reason: collision with root package name */
    public final va3.d0 f552498w;

    /* renamed from: e, reason: collision with root package name */
    public boolean f552480e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f552481f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f552482g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f552483h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f552484i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f552485j = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f552489n = true;

    /* renamed from: o, reason: collision with root package name */
    public float f552490o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f552491p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    public boolean f552492q = false;

    /* renamed from: r, reason: collision with root package name */
    public long f552493r = 0;

    public i1(android.content.Context context, ab3.h hVar, boolean z17) {
        this.f552488m = false;
        za3.c1 c1Var = new za3.c1(this);
        this.f552494s = c1Var;
        this.f552495t = new za3.d1(this);
        this.f552496u = new za3.e1(this);
        this.f552497v = new za3.f1(this);
        this.f552498w = new za3.g1(this);
        this.f552476a = context;
        this.f552488m = z17;
        this.f552487l = hVar;
        this.f552477b = new java.util.ArrayList();
        hVar.mo1016xda829c15(c1Var);
    }

    public void a(ab3.h hVar) {
        if (this.f552478c == null) {
            return;
        }
        if (hVar.mo1009x60df64bb() < 15) {
            ab3.f mo1001x8873d7af = hVar.mo1001x8873d7af();
            r45.wa5 wa5Var = this.f552478c.f462406e;
            mo1001x8873d7af.mo990x42ab093c(wa5Var.f470544d, wa5Var.f470545e, 15);
        } else {
            ab3.f mo1001x8873d7af2 = hVar.mo1001x8873d7af();
            r45.wa5 wa5Var2 = this.f552478c.f462406e;
            mo1001x8873d7af2.mo989x42ab093c(wa5Var2.f470544d, wa5Var2.f470545e);
        }
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackPointViewMgrImpl", "onPause() called");
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this.f552497v);
        va3.j0.Bi().c(this.f552498w);
    }

    public void c() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.LOCAION, new za3.h1(this))) {
            return;
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().j(this.f552497v, true);
        va3.j0.Bi().a(this.f552498w);
    }

    public void d(boolean z17) {
        if (!z17) {
            this.f552484i = z17;
            return;
        }
        if (this.f552479d != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10997, "20", 0, 0, 0);
            this.f552484i = z17;
        }
    }

    public void e(boolean z17) {
        ab3.h hVar;
        if (z17 && !this.f552483h && (hVar = this.f552487l) != null) {
            for (java.lang.Object obj : hVar.mo1000x13f1d1cd()) {
                if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725 c16298xbb1f6725 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) obj;
                    c16298xbb1f6725.f226246e.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c128 = c16298xbb1f6725.f226254p;
                    if (c16319x94a0c128 != null) {
                        c16319x94a0c128.m66007x89c24a19(c16298xbb1f6725.f226246e);
                    }
                }
            }
        }
        this.f552483h = z17;
    }

    public final void f() {
        r45.mw6 mw6Var;
        double d17;
        double d18;
        if (this.f552481f || (mw6Var = this.f552478c) == null) {
            return;
        }
        if (mw6Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = va3.j0.Ri().f515892q;
            if (this.f552478c == null || !va3.w.d(c16279x64cea23.f226119e, c16279x64cea23.f226120f)) {
                d17 = 0.0d;
                d18 = 0.0d;
            } else {
                d17 = java.lang.Math.abs(this.f552478c.f462406e.f470544d - c16279x64cea23.f226119e) * 2.0d;
                d18 = java.lang.Math.abs(this.f552478c.f462406e.f470545e - c16279x64cea23.f226120f) * 2.0d;
            }
            int i17 = 0;
            double d19 = d17;
            double d27 = d18;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f552477b;
                if (i17 >= arrayList.size()) {
                    break;
                }
                r45.mw6 mw6Var2 = (r45.mw6) arrayList.get(i17);
                if (mw6Var2 != null) {
                    r45.wa5 wa5Var = mw6Var2.f462406e;
                    if (va3.w.d(wa5Var.f470544d, wa5Var.f470545e)) {
                        double abs = java.lang.Math.abs(mw6Var2.f462406e.f470544d - this.f552478c.f462406e.f470544d) * 2.0d;
                        double abs2 = java.lang.Math.abs(mw6Var2.f462406e.f470545e - this.f552478c.f462406e.f470545e) * 2.0d;
                        if (abs > d19) {
                            d19 = abs;
                        }
                        if (abs2 > d27) {
                            d27 = abs2;
                        }
                        r45.wa5 wa5Var2 = mw6Var2.f462406e;
                        double d28 = wa5Var2.f470544d;
                        double d29 = wa5Var2.f470545e;
                    }
                }
                i17++;
            }
            if (java.lang.Math.abs(d19 - (-1000.0d)) >= 0.5d && java.lang.Math.abs(d27 - (-1000.0d)) >= 0.5d) {
                double d37 = c16279x64cea23.f226119e;
                double d38 = c16279x64cea23.f226120f;
                r45.mw6 mw6Var3 = this.f552478c;
                if (mw6Var3 != null) {
                    r45.wa5 wa5Var3 = mw6Var3.f462406e;
                    this.f552487l.mo1020xdaf06a18(wa5Var3.f470544d, wa5Var3.f470545e, d19, d27);
                } else if (va3.w.d(d37, d38)) {
                    this.f552487l.mo1020xdaf06a18(c16279x64cea23.f226119e, c16279x64cea23.f226120f, d19, d27);
                }
            }
        }
        this.f552481f = true;
    }
}
