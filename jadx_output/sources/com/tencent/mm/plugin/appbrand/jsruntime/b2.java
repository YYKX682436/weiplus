package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public final class b2 implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83980d;

    public b2(int i17) {
        this.f83980d = i17;
    }

    @Override // yz5.q
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer invoke(java.lang.String appId, java.lang.String rootDir, com.tencent.mm.vfs.x1 dir) {
        int i17;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(rootDir, "rootDir");
        kotlin.jvm.internal.o.g(dir, "dir");
        java.lang.Iterable<com.tencent.mm.vfs.x1> d17 = dir.d();
        int i18 = 0;
        if (d17 != null) {
            int i19 = 0;
            for (com.tencent.mm.vfs.x1 x1Var : d17) {
                java.lang.String name = x1Var.f213232b;
                kotlin.jvm.internal.o.f(name, "name");
                java.lang.String name2 = x1Var.f213232b;
                kotlin.jvm.internal.o.f(name2, "name");
                if (r26.n0.B(name2, ".", false)) {
                    kotlin.jvm.internal.o.f(name2, "name");
                    name = (java.lang.String) r26.n0.f0(name2, new java.lang.String[]{"."}, false, 0, 6, null).get(0);
                }
                try {
                    java.lang.String substring = name.substring(1);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    r26.a.a(10);
                    i17 = java.lang.Integer.parseInt(substring, 10);
                } catch (java.lang.NumberFormatException unused) {
                    i17 = -1;
                }
                if (i17 == this.f83980d) {
                    x1Var.a();
                    i19++;
                }
            }
            i18 = i19;
        }
        return java.lang.Integer.valueOf(i18);
    }
}
