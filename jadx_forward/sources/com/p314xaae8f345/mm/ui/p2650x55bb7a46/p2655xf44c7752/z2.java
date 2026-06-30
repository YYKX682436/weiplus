package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class z2 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f283132h = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f283133a;

    /* renamed from: b, reason: collision with root package name */
    public int f283134b;

    /* renamed from: c, reason: collision with root package name */
    public int f283135c;

    /* renamed from: d, reason: collision with root package name */
    public long f283136d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f283137e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f283138f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f283139g = 0;

    public static void a(java.lang.String str, int i17, int i18, int i19) {
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && i17 != 0 && i18 != 0) {
                java.util.HashMap hashMap = f283132h;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.z2 z2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.z2) hashMap.get(str);
                if (z2Var == null) {
                    z2Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.z2();
                    z2Var.f283136d = java.lang.System.currentTimeMillis();
                    hashMap.put(str, z2Var);
                }
                z2Var.f283135c = i18;
                z2Var.f283134b = i17;
                z2Var.f283138f += "" + i19 + "|";
                if (i19 > 0) {
                    if (z2Var.f283137e == 0) {
                        z2Var.f283137e = i19;
                    }
                } else if (z2Var.f283137e != 0) {
                    z2Var.f283139g++;
                    z2Var.f283137e = 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryHolderImage", "dkprog addBit: [%d,%d,%d] succ:%d change:%d str:%s file:%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(z2Var.f283137e), java.lang.Integer.valueOf(z2Var.f283139g), z2Var.f283138f, str);
            }
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryHolderImage", "get useopt  addBit :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
        }
    }
}
