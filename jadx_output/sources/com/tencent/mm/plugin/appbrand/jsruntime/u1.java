package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public abstract class u1 {
    public static java.lang.String a() {
        java.lang.String b17 = b();
        com.tencent.mm.vfs.w6.u(b17);
        return b17;
    }

    public static java.lang.String b() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = lp0.b.e() + "appbrand/jscache/";
        }
        return str;
    }

    public static java.lang.String c() {
        java.lang.String d17 = d();
        com.tencent.mm.vfs.w6.u(d17);
        return d17;
    }

    public static java.lang.String d() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = lp0.b.e() + "appbrand/snapshotjscache/";
        }
        return str;
    }
}
