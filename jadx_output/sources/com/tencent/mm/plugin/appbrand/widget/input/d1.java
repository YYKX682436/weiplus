package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class d1 implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.widget.input.d1 f91386r = new com.tencent.mm.plugin.appbrand.widget.input.x0();

    /* renamed from: s, reason: collision with root package name */
    public static final x.b f91387s = new x.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f91388d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f91389e;

    /* renamed from: f, reason: collision with root package name */
    public final int f91390f;

    /* renamed from: g, reason: collision with root package name */
    public int f91391g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f91392h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f91393i;

    /* renamed from: m, reason: collision with root package name */
    public int f91394m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Queue f91395n;

    /* renamed from: o, reason: collision with root package name */
    public int f91396o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f91397p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f91398q;

    public d1(com.tencent.mm.plugin.appbrand.widget.input.x0 x0Var) {
        this.f91388d = new x.b();
        this.f91391g = 0;
        this.f91392h = false;
        this.f91393i = true;
        this.f91394m = -1;
        this.f91395n = new java.util.LinkedList();
        this.f91396o = 0;
        this.f91397p = new com.tencent.mm.plugin.appbrand.widget.input.y0(this);
        this.f91398q = new com.tencent.mm.plugin.appbrand.widget.input.a1(this);
        this.f91389e = null;
        this.f91390f = 0;
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.d1 a(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        if (v5Var == null || !v5Var.isRunning()) {
            com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.AppBrandInputPageOffsetHelper", " obtain with invalid page " + v5Var, new java.lang.Object[0]);
            return f91386r;
        }
        x.b bVar = f91387s;
        com.tencent.mm.plugin.appbrand.widget.input.d1 d1Var = (com.tencent.mm.plugin.appbrand.widget.input.d1) bVar.getOrDefault(v5Var, null);
        if (d1Var != null) {
            return d1Var;
        }
        com.tencent.mm.plugin.appbrand.widget.input.d1 d1Var2 = new com.tencent.mm.plugin.appbrand.widget.input.d1(v5Var);
        bVar.put(v5Var, d1Var2);
        return d1Var2;
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.d1 b(java.lang.ref.Reference reference) {
        return a(reference == null ? null : (com.tencent.mm.plugin.appbrand.page.v5) reference.get());
    }

    public void c(int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f91389e;
        if (v5Var.isRunning()) {
            int i18 = this.f91394m;
            if (i17 != i18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandInputPageOffsetHelper", "requestScrollDown, skip last-ticket %d, pass-in-ticket %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
                return;
            }
            this.f91392h = true;
            this.f91393i = true;
            v5Var.getContentView().post(this.f91397p);
        }
    }

    public void d(int i17) {
        e(i17, true, false);
    }

    public final void e(int i17, boolean z17, boolean z18) {
        java.util.Queue queue = this.f91395n;
        if (!z18) {
            queue.offer(new com.tencent.mm.plugin.appbrand.widget.input.c1(i17, z17));
        }
        if (queue.size() <= 1 || z18) {
            this.f91394m = i17;
            this.f91393i = z17;
            f(true);
        }
    }

    public final void f(boolean z17) {
        if (z17) {
            this.f91391g = 0;
            this.f91392h = false;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f91389e;
        if (v5Var == null || !v5Var.isRunning()) {
            g();
            return;
        }
        if (this.f91392h) {
            this.f91391g = 0;
            g();
            return;
        }
        int i17 = this.f91391g;
        java.lang.Runnable runnable = this.f91398q;
        if (i17 == 0) {
            android.view.View contentView = v5Var.getContentView();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.x0.b(contentView);
            v5Var.getContentView().post(runnable);
            return;
        }
        android.view.View contentView2 = v5Var.getContentView();
        java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
        n3.x0.b(contentView2);
        v5Var.getContentView().postOnAnimationDelayed(runnable, 100L);
    }

    public final void g() {
        java.util.Queue queue = this.f91395n;
        if (queue.isEmpty()) {
            return;
        }
        queue.poll();
        if (queue.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.c1 c1Var = (com.tencent.mm.plugin.appbrand.widget.input.c1) queue.peek();
        e(c1Var.f91373a, c1Var.f91374b, true);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f91389e;
        v5Var.K(this);
        f91387s.remove(v5Var);
    }

    public d1(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f91388d = new x.b();
        int i17 = 0;
        this.f91391g = 0;
        this.f91392h = false;
        this.f91393i = true;
        this.f91394m = -1;
        this.f91395n = new java.util.LinkedList();
        this.f91396o = 0;
        this.f91397p = new com.tencent.mm.plugin.appbrand.widget.input.y0(this);
        this.f91398q = new com.tencent.mm.plugin.appbrand.widget.input.a1(this);
        this.f91389e = v5Var;
        v5Var.w(this);
        android.app.Activity v17 = v5Var.v1();
        if (vj5.n.f437718k && v17 != null) {
            i17 = vj5.n.b(v17).f437726e;
        }
        this.f91390f = i17;
    }
}
