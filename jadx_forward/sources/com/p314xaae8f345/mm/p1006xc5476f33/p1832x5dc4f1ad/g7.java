package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@j95.b
/* loaded from: classes.dex */
public final class g7 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public ye3.o f229541d;

    /* renamed from: f, reason: collision with root package name */
    public volatile d95.b0 f229543f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f229544g;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f229542e = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f229545h = new java.lang.Object();

    public final void Ai() {
        try {
            wi();
            d95.b0 b0Var = new d95.b0();
            java.lang.String str = gm0.j1.u().h() + "MBExternalVideoInfo.db";
            java.util.HashMap i17 = kz5.c1.i(new jz5.l(-2064292300, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f7.f229471a));
            if (b0Var.S(str, i17, true, true)) {
                this.f229543f = b0Var;
                this.f229544g = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[doResetDatabase] database initialized successfully");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MB_External_surface_DB", "[doResetDatabase] first initialization failed, retry with initializer");
            d95.b0 a17 = ye3.j.f542754a.a(str, i17, true, true);
            if (a17 == null) {
                wi();
                this.f229544g = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MB_External_surface_DB", "[doResetDatabase] retry initialization failed");
            } else {
                this.f229543f = a17;
                this.f229544g = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[doResetDatabase] database initialized via retry");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "[doResetDatabase] initialization failed", e17);
            wi();
            this.f229544g = false;
        }
    }

    public final ye3.o Bi() {
        gm0.j1.b().c();
        ye3.o oVar = this.f229541d;
        if (oVar != null) {
            return oVar;
        }
        synchronized (this.f229542e) {
            ye3.o oVar2 = this.f229541d;
            if (oVar2 != null) {
                return oVar2;
            }
            m134976x2690a4ac();
            if (!this.f229544g) {
                Di();
            }
            d95.b0 b0Var = this.f229543f;
            if (b0Var == null) {
                return null;
            }
            ye3.o oVar3 = new ye3.o(b0Var);
            this.f229541d = oVar3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[getMediaCacheStorage] create new storage instance");
            return oVar3;
        }
    }

    public final void Di() {
        if (this.f229543f == null || !this.f229544g) {
            synchronized (this.f229545h) {
                if (this.f229543f != null && this.f229544g) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[initializeDatabase] database already initialized");
                    return;
                }
                if (!gm0.j1.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MB_External_surface_DB", "[initializeDatabase] account not ready, skip initialization");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[initializeDatabase] start initialization");
                Ai();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[initializeDatabase] initialization completed, ready=" + this.f229544g);
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[onAccountInitialized] start");
        Di();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[onAccountInitialized] completed");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[onAccountReleased] start");
        synchronized (this.f229542e) {
            this.f229541d = null;
        }
        synchronized (this.f229545h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[closeDb] start closing database");
            wi();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[closeDb] database closed, ready=" + this.f229544g);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[onAccountReleased] completed");
    }

    public final void wi() {
        try {
            try {
                d95.b0 b0Var = this.f229543f;
                if (b0Var != null) {
                    b0Var.L();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[closeDatabaseQuietly] database closed");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "[closeDatabaseQuietly] close failed", e17);
            }
        } finally {
            this.f229543f = null;
            this.f229544g = false;
        }
    }
}
