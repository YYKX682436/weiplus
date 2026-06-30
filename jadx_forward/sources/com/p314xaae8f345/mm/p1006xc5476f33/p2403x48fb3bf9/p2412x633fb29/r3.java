package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public abstract class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f264623a;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f264623a = hashSet;
        hashSet.add("file:///android_asset/");
        java.lang.String h17 = lp0.b.h();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
            h17 = lp0.b.h();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(0).l());
        hashSet.add("file://" + r6Var.o());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("file://");
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(3).l());
        hashSet.add(sb6.toString());
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(lp0.b.D(), com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(0).h());
        hashSet.add("file://" + r6Var2.o());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", r6Var.o(), r6Var2.o());
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(h17, "emoji/res");
        hashSet.add("file://" + r6Var3.o());
        com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(lp0.b.D(), "emoji/res");
        hashSet.add("file://" + r6Var4.o());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", r6Var3.o(), r6Var4.o());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URLFilter", "WebViewUI white list path : %s", (java.lang.String) it.next());
        }
    }

    public static boolean a(java.lang.String str) {
        if (x51.o1.f533595o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.URLFilter", "skipLoadUrlCheck");
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("about:blank")) {
            return false;
        }
        if (!lowerCase.startsWith("file://")) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(android.net.Uri.parse(lowerCase).getHost())) {
                return true;
            }
            return !r4.getHost().contains(nf.s.a());
        }
        java.util.Iterator it = ((java.util.HashSet) f264623a).iterator();
        while (it.hasNext()) {
            if (lowerCase.startsWith((java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
