package qe1;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: r, reason: collision with root package name */
    public static volatile qe1.a f443548r;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f443549a;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f443556h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f443557i;

    /* renamed from: m, reason: collision with root package name */
    public ve1.i f443561m;

    /* renamed from: n, reason: collision with root package name */
    public ue1.a f443562n;

    /* renamed from: o, reason: collision with root package name */
    public te1.i f443563o;

    /* renamed from: p, reason: collision with root package name */
    public re1.h f443564p;

    /* renamed from: q, reason: collision with root package name */
    public te1.d f443565q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f443550b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f443551c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f443552d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f443553e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f443554f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f443555g = false;

    /* renamed from: j, reason: collision with root package name */
    public long f443558j = 536870912;

    /* renamed from: k, reason: collision with root package name */
    public long f443559k = 1048576;

    /* renamed from: l, reason: collision with root package name */
    public int f443560l = 5;

    public a(android.content.Context context) {
        this.f443549a = context;
    }

    public static qe1.a a() {
        if (f443548r != null) {
            return f443548r;
        }
        throw new java.lang.RuntimeException("PlayerConfig not initialized!");
    }

    public java.lang.String b() {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        if (!android.text.TextUtils.isEmpty(this.f443557i)) {
            return this.f443557i;
        }
        try {
            r6Var = com.p314xaae8f345.mm.vfs.r6.j(this.f443549a.getExternalCacheDir());
        } catch (java.lang.Exception e17) {
            ve1.g.p(5, "PlayerConfig", "getCacheDir fail", e17);
            r6Var = null;
        }
        if (r6Var == null) {
            ve1.g.p(5, "PlayerConfig", "getCacheDir fail, extCacheDir not exist", null);
            return null;
        }
        java.lang.String str = r6Var + "/wxvideocache";
        c(str);
        return str;
    }

    public final java.lang.String c(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (r6Var.A()) {
                ve1.g.p(4, "PlayerConfig", "fileDir:" + str + " is file, delete result:" + r6Var.l(), null);
            }
            if (!r6Var.m()) {
                ve1.g.p(4, "PlayerConfig", "fileDir:" + str + " not exist, make dir result:" + r6Var.J(), null);
            }
        }
        return str;
    }

    public java.lang.String d() {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        if (!android.text.TextUtils.isEmpty(this.f443556h)) {
            return this.f443556h;
        }
        try {
            r6Var = com.p314xaae8f345.mm.vfs.r6.j(this.f443549a.getFilesDir());
        } catch (java.lang.Exception e17) {
            ve1.g.p(5, "PlayerConfig", "getTempDir fail", e17);
            r6Var = null;
        }
        if (r6Var == null) {
            return null;
        }
        java.lang.String str = r6Var + "/wxvideotmp";
        c(str);
        return str;
    }

    public ue1.a e() {
        return this.f443562n;
    }

    public boolean f() {
        return this.f443553e;
    }

    public boolean g() {
        return this.f443551c;
    }
}
