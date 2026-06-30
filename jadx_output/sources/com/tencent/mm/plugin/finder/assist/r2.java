package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f102496a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f102497b;

    /* renamed from: c, reason: collision with root package name */
    public final long f102498c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f102499d;

    /* renamed from: e, reason: collision with root package name */
    public final int f102500e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f102501f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f102502g;

    public r2(java.lang.String path, java.lang.String name, long j17, boolean z17, int i17, boolean z18) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(name, "name");
        this.f102496a = path;
        this.f102497b = name;
        this.f102498c = j17;
        this.f102499d = z17;
        this.f102500e = i17;
        this.f102501f = z18;
        this.f102502g = "Finder.FinderFolder";
    }

    public final jz5.l a(boolean z17) {
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(this.f102496a, true);
        java.util.List<com.tencent.mm.vfs.x1> k17 = s17 != null ? com.tencent.mm.vfs.e8.k(s17) : null;
        if (k17 != null && k17.size() > 1) {
            kz5.g0.t(k17, new com.tencent.mm.plugin.finder.assist.q2());
        }
        long j17 = 0;
        if (k17 != null) {
            for (com.tencent.mm.vfs.x1 x1Var : k17) {
                if (x1Var != null) {
                    java.lang.String name = x1Var.f213232b;
                    kotlin.jvm.internal.o.f(name, "name");
                    if (!kotlin.jvm.internal.o.b(".nomedia", name)) {
                        long j18 = x1Var.f213234d;
                        if (z17 && this.f102501f) {
                            com.tencent.mars.xlog.Log.i(this.f102502g, this.f102497b + "===>" + name + '(' + com.tencent.mm.sdk.platformtools.t8.f0(j18) + ") " + x1Var.f213235e);
                        }
                        j17 += j18;
                    }
                }
            }
        }
        return new jz5.l(java.lang.Integer.valueOf(k17 != null ? k17.size() : 0), java.lang.Long.valueOf(j17));
    }

    public java.lang.String toString() {
        return this.f102497b + '(' + this.f102496a + ')';
    }

    public /* synthetic */ r2(java.lang.String str, java.lang.String str2, long j17, boolean z17, int i17, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        this(str, str2, (i18 & 4) != 0 ? -1L : j17, (i18 & 8) != 0 ? true : z17, (i18 & 16) != 0 ? -1 : i17, (i18 & 32) != 0 ? false : z18);
    }
}
