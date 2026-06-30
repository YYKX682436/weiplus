package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f184029a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f184030b;

    /* renamed from: c, reason: collision with root package name */
    public final long f184031c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f184032d;

    /* renamed from: e, reason: collision with root package name */
    public final int f184033e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f184034f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f184035g;

    public r2(java.lang.String path, java.lang.String name, long j17, boolean z17, int i17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f184029a = path;
        this.f184030b = name;
        this.f184031c = j17;
        this.f184032d = z17;
        this.f184033e = i17;
        this.f184034f = z18;
        this.f184035g = "Finder.FinderFolder";
    }

    public final jz5.l a(boolean z17) {
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(this.f184029a, true);
        java.util.List<com.p314xaae8f345.mm.vfs.x1> k17 = s17 != null ? com.p314xaae8f345.mm.vfs.e8.k(s17) : null;
        if (k17 != null && k17.size() > 1) {
            kz5.g0.t(k17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q2());
        }
        long j17 = 0;
        if (k17 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : k17) {
                if (x1Var != null) {
                    java.lang.String name = x1Var.f294765b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(".nomedia", name)) {
                        long j18 = x1Var.f294767d;
                        if (z17 && this.f184034f) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f184035g, this.f184030b + "===>" + name + '(' + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j18) + ") " + x1Var.f294768e);
                        }
                        j17 += j18;
                    }
                }
            }
        }
        return new jz5.l(java.lang.Integer.valueOf(k17 != null ? k17.size() : 0), java.lang.Long.valueOf(j17));
    }

    /* renamed from: toString */
    public java.lang.String m55548x9616526c() {
        return this.f184030b + '(' + this.f184029a + ')';
    }

    public /* synthetic */ r2(java.lang.String str, java.lang.String str2, long j17, boolean z17, int i17, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, (i18 & 4) != 0 ? -1L : j17, (i18 & 8) != 0 ? true : z17, (i18 & 16) != 0 ? -1 : i17, (i18 & 32) != 0 ? false : z18);
    }
}
