package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class d0 implements zg0.k3 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f268676a;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f268680e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f268681f;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f268683h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 f268684i;

    /* renamed from: j, reason: collision with root package name */
    public db5.t4 f268685j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f268686k;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f268677b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(12);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f268678c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final hy4.m0 f268679d = new hy4.m0();

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashMap f268682g = new java.util.HashMap();

    public d0() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f268683h = hashMap;
        this.f268686k = new java.util.ArrayList();
        hashMap.clear();
        hashMap.put("menuItem:share:appMessage", 1);
        hashMap.put("menuItem:share:timeline", 2);
        hashMap.put("menuItem:copyUrl", 6);
    }

    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3, int i17) {
        d0Var.getClass();
        if (c19775x58fd37b3 == null) {
            return false;
        }
        int d17 = c19775x58fd37b3.d(i17);
        return d17 == 1 || d17 == 10;
    }

    public static final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3, int i17) {
        d0Var.getClass();
        return c19775x58fd37b3 != null && c19775x58fd37b3.d(i17) == 10;
    }

    public final boolean c(int i17) {
        android.util.SparseBooleanArray sparseBooleanArray = (android.util.SparseBooleanArray) this.f268682g.get(e().f263449a.mo120156xb5887639());
        return sparseBooleanArray == null || !sparseBooleanArray.get(i17, false);
    }

    public final android.content.Context d() {
        java.lang.ref.WeakReference weakReference = this.f268680e;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return context;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 e() {
        java.lang.ref.WeakReference weakReference = this.f268681f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) weakReference.get() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0Var);
        return r0Var;
    }

    public boolean f(com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3, int i17, int i18) {
        return c19775x58fd37b3 != null && c19775x58fd37b3.d(i17) == 1 && c(i18);
    }

    public final void g() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f268676a;
        if (k0Var != null) {
            if (k0Var.i()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f268676a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var2);
                k0Var2.u();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.f268676a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var3);
            k0Var3.k();
            this.f268676a = null;
        }
        this.f268684i = null;
    }

    public final void h() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        android.view.Window d17;
        android.view.View decorView;
        if (this.f268680e == null || this.f268681f == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f268676a;
        if (!(k0Var2 != null && k0Var2.i())) {
            this.f268676a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(d(), 0, true);
        }
        this.f268679d.f367709d = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.f268676a;
        if (k0Var3 != null) {
            k0Var3.C = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.v(this);
        }
        if (k0Var3 != null && (d17 = k0Var3.d()) != null && (decorView = d17.getDecorView()) != null) {
            decorView.addOnAttachStateChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.w(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = this.f268676a;
        if (k0Var4 != null) {
            k0Var4.D = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x(this);
        }
        if (k0Var4 != null) {
            k0Var4.G = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c0(this);
        if (k0Var4 != null) {
            k0Var4.f293414s = c0Var;
        }
        if (k0Var4 != null) {
            k0Var4.f293417v = c0Var;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c17 = e().R.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getJsPerm(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var5 = this.f268676a;
        if (k0Var5 != null) {
            k0Var5.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z(this, c17);
        }
        if (k0Var5 != null) {
            k0Var5.f293407o = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a0(this, c17);
        }
        if (k0Var5 != null) {
            k0Var5.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.b0(this);
        }
        java.lang.String Z = e().Z();
        if (Z == null) {
            Z = e().i();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Z)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var6 = this.f268676a;
            if (k0Var6 != null) {
                k0Var6.q(" ", 1);
            }
        } else {
            java.lang.String host = android.net.Uri.parse(Z).getHost();
            java.lang.String string = d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6m, host);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(host) && (k0Var = this.f268676a) != null) {
                k0Var.q(string, 1);
            }
        }
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var7 = this.f268676a;
            if (k0Var7 != null) {
                k0Var7.v();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HalfScreenWebViewMenuHelper", "tryShow ex %s", e17.getMessage());
        }
        if (e().g0() != null) {
            e().g0().U("");
        }
    }
}
