package com.tencent.mm.normsg;

/* loaded from: classes13.dex */
public abstract class l {
    public static java.lang.String a(java.lang.String str) {
        return com.tencent.mm.normsg.c.p.dk(str);
    }

    public static byte[] b(java.lang.String str) {
        return com.tencent.mm.normsg.c.p.dj(str, new com.tencent.mm.normsg.i(false, false, false, false));
    }

    public static byte[] c(java.lang.String str, com.tencent.mm.normsg.i iVar) {
        return com.tencent.mm.normsg.c.p.dj(str, iVar);
    }

    public static byte[] d(java.lang.String str, boolean z17) {
        return z17 ? com.tencent.mm.normsg.c.p.dj(str, new com.tencent.mm.normsg.i(true, true, true, false)) : com.tencent.mm.normsg.c.p.dj(str, new com.tencent.mm.normsg.i(false, false, false, false));
    }

    public static byte[] e(java.lang.String str) {
        return com.tencent.mm.normsg.c.p.de(str);
    }

    public static boolean f(java.lang.String str) {
        return com.tencent.mm.normsg.c.p.dd(str);
    }

    public static void g(java.lang.String str, android.view.MotionEvent motionEvent) {
        com.tencent.mm.normsg.c.p.dg(str, motionEvent, 1, "", 0);
    }

    public static void h(java.lang.String str, android.view.MotionEvent motionEvent, boolean z17) {
        com.tencent.mm.normsg.c.p.dg(str, motionEvent, z17 ? 2 : 3, "", 0);
    }

    public static void i(java.lang.String str, android.view.MotionEvent motionEvent, boolean z17, java.lang.String str2) {
        com.tencent.mm.normsg.c.p.dg(str, motionEvent, z17 ? 2 : 3, str2, 0);
    }

    public static void j(java.lang.String str, android.view.MotionEvent motionEvent, boolean z17, java.lang.String str2, int i17) {
        com.tencent.mm.normsg.c.p.dg(str, motionEvent, z17 ? 2 : 3, str2, i17);
    }

    public static void k(java.lang.String str) {
        com.tencent.mm.normsg.c.p.db(str);
    }

    public static void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.normsg.c.p.df(str, str2, "");
    }

    public static void m(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.normsg.c.p.df(str, str2, str3);
    }

    public static void n(java.lang.String str) {
        com.tencent.mm.normsg.c.p.da(str);
    }

    public static void o(java.lang.String str) {
        com.tencent.mm.normsg.c.p.dh(str);
    }

    public static void p(java.lang.String str) {
        com.tencent.mm.normsg.c.p.dc(str);
    }
}
