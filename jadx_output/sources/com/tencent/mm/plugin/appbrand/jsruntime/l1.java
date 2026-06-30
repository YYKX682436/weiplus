package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public abstract class l1 {
    public static java.lang.String a() {
        java.lang.String str;
        synchronized (lp0.b.class) {
            str = lp0.b.e() + "appbrand/shadercache/";
        }
        com.tencent.mm.vfs.w6.u(str);
        return str;
    }
}
