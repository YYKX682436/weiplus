package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public final class q1 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f165567d;

    public q1(int i17) {
        this.f165567d = i17;
    }

    @Override // yz5.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer mo149xb9724478(java.lang.String rootDir, com.p314xaae8f345.mm.vfs.x1 dir) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootDir, "rootDir");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dir, "dir");
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> d17 = dir.d();
        int i18 = 0;
        if (d17 != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : d17) {
                try {
                    java.lang.String name = x1Var.f294765b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                    java.lang.String substring = name.substring(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    r26.a.a(10);
                    i17 = java.lang.Integer.parseInt(substring, 10);
                } catch (java.lang.NumberFormatException unused) {
                    i17 = -1;
                }
                if (i17 == this.f165567d) {
                    x1Var.a();
                    i18++;
                }
            }
        }
        return java.lang.Integer.valueOf(i18);
    }
}
