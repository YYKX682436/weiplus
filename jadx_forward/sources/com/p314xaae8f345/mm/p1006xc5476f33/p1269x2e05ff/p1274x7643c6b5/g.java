package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.g f174694a = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.g();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f174695b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f174696c;

    static {
        jz5.g b17 = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.e.f174681d);
        f174695b = b17;
        f174696c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.f.f174689d);
        if (com.p314xaae8f345.mm.vfs.w6.j((java.lang.String) ((jz5.n) b17).mo141623x754a37bb())) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.u((java.lang.String) ((jz5.n) b17).mo141623x754a37bb());
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.String) ((jz5.n) f174695b).mo141623x754a37bb());
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        return sb6.toString();
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        return ((java.lang.String) ((jz5.n) f174696c).mo141623x754a37bb()) + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c12886x91aa2b6d.e());
    }

    public final void c(android.graphics.Bitmap bitmap, java.lang.String str) {
        if (bitmap != null) {
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.mm.vfs.w6.h(str);
            }
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 70, android.graphics.Bitmap.CompressFormat.JPEG, str, false);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallImageStorage", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
