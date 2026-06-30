package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class d1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w {

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 f172919r = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x0();

    /* renamed from: s, reason: collision with root package name */
    public static final x.b f172920s = new x.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f172921d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f172922e;

    /* renamed from: f, reason: collision with root package name */
    public final int f172923f;

    /* renamed from: g, reason: collision with root package name */
    public int f172924g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f172925h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f172926i;

    /* renamed from: m, reason: collision with root package name */
    public int f172927m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Queue f172928n;

    /* renamed from: o, reason: collision with root package name */
    public int f172929o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f172930p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f172931q;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x0 x0Var) {
        this.f172921d = new x.b();
        this.f172924g = 0;
        this.f172925h = false;
        this.f172926i = true;
        this.f172927m = -1;
        this.f172928n = new java.util.LinkedList();
        this.f172929o = 0;
        this.f172930p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y0(this);
        this.f172931q = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a1(this);
        this.f172922e = null;
        this.f172923f = 0;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        if (v5Var == null || !v5Var.mo50262x39e05d35()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.AppBrandInputPageOffsetHelper", " obtain with invalid page " + v5Var, new java.lang.Object[0]);
            return f172919r;
        }
        x.b bVar = f172920s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1) bVar.m174751x4aabfc28(v5Var, null);
        if (d1Var != null) {
            return d1Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 d1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1(v5Var);
        bVar.put(v5Var, d1Var2);
        return d1Var2;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 b(java.lang.ref.Reference reference) {
        return a(reference == null ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) reference.get());
    }

    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f172922e;
        if (v5Var.mo50262x39e05d35()) {
            int i18 = this.f172927m;
            if (i17 != i18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandInputPageOffsetHelper", "requestScrollDown, skip last-ticket %d, pass-in-ticket %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                return;
            }
            this.f172925h = true;
            this.f172926i = true;
            v5Var.mo51310xc2a54588().post(this.f172930p);
        }
    }

    public void d(int i17) {
        e(i17, true, false);
    }

    public final void e(int i17, boolean z17, boolean z18) {
        java.util.Queue queue = this.f172928n;
        if (!z18) {
            queue.offer(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.c1(i17, z17));
        }
        if (queue.size() <= 1 || z18) {
            this.f172927m = i17;
            this.f172926i = z17;
            f(true);
        }
    }

    public final void f(boolean z17) {
        if (z17) {
            this.f172924g = 0;
            this.f172925h = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f172922e;
        if (v5Var == null || !v5Var.mo50262x39e05d35()) {
            g();
            return;
        }
        if (this.f172925h) {
            this.f172924g = 0;
            g();
            return;
        }
        int i17 = this.f172924g;
        java.lang.Runnable runnable = this.f172931q;
        if (i17 == 0) {
            android.view.View mo51310xc2a54588 = v5Var.mo51310xc2a54588();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.x0.b(mo51310xc2a54588);
            v5Var.mo51310xc2a54588().post(runnable);
            return;
        }
        android.view.View mo51310xc2a545882 = v5Var.mo51310xc2a54588();
        java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
        n3.x0.b(mo51310xc2a545882);
        v5Var.mo51310xc2a54588().postOnAnimationDelayed(runnable, 100L);
    }

    public final void g() {
        java.util.Queue queue = this.f172928n;
        if (queue.isEmpty()) {
            return;
        }
        queue.poll();
        if (queue.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.c1) queue.peek();
        e(c1Var.f172906a, c1Var.f172907b, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
    /* renamed from: onDestroy */
    public void mo32094xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f172922e;
        v5Var.K(this);
        f172920s.m174754xc84af884(v5Var);
    }

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f172921d = new x.b();
        int i17 = 0;
        this.f172924g = 0;
        this.f172925h = false;
        this.f172926i = true;
        this.f172927m = -1;
        this.f172928n = new java.util.LinkedList();
        this.f172929o = 0;
        this.f172930p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y0(this);
        this.f172931q = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a1(this);
        this.f172922e = v5Var;
        v5Var.w(this);
        android.app.Activity v17 = v5Var.v1();
        if (vj5.n.f519251k && v17 != null) {
            i17 = vj5.n.b(v17).f519259e;
        }
        this.f172923f = i17;
    }
}
