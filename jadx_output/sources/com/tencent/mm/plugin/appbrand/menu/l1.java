package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f85982a;

    public l1(com.tencent.mm.plugin.appbrand.menu.i1 i1Var) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f85982a = sparseArray;
        sparseArray.put(2, new com.tencent.mm.plugin.appbrand.menu.t0());
        sparseArray.put(12, new com.tencent.mm.plugin.appbrand.menu.a0());
        sparseArray.put(11, new com.tencent.mm.plugin.appbrand.menu.j0());
        sparseArray.put(3, new com.tencent.mm.plugin.appbrand.menu.l0());
        sparseArray.put(4, new com.tencent.mm.plugin.appbrand.menu.n0());
        sparseArray.put(22, new com.tencent.mm.plugin.appbrand.menu.z());
        sparseArray.put(39, new com.tencent.mm.plugin.appbrand.menu.p0());
        sparseArray.put(23, new com.tencent.mm.plugin.appbrand.menu.k0());
        sparseArray.put(24, new com.tencent.mm.plugin.appbrand.menu.d());
        sparseArray.put(34, new com.tencent.mm.plugin.appbrand.menu.s0());
        sparseArray.put(27, new com.tencent.mm.plugin.appbrand.menu.c0());
        sparseArray.put(30, new com.tencent.mm.plugin.appbrand.menu.i());
        sparseArray.put(0, new com.tencent.mm.plugin.appbrand.menu.f());
        sparseArray.put(37, new tj1.z(new com.tencent.mm.plugin.appbrand.menu.a(68, 69)));
        sparseArray.put(38, new tj1.y());
        sparseArray.put(25, new com.tencent.mm.plugin.appbrand.menu.y());
        sparseArray.put(26, new com.tencent.mm.plugin.appbrand.menu.j());
        sparseArray.put(40, new com.tencent.mm.plugin.appbrand.menu.n());
        sparseArray.put(28, new com.tencent.mm.plugin.appbrand.menu.p());
        sparseArray.put(13, new com.tencent.mm.plugin.appbrand.menu.b());
        sparseArray.put(29, new com.tencent.mm.plugin.appbrand.menu.f0());
        sparseArray.put(31, new com.tencent.mm.plugin.appbrand.menu.d0());
        sparseArray.put(32, new com.tencent.mm.plugin.appbrand.menu.v());
        sparseArray.put(33, new com.tencent.mm.plugin.appbrand.menu.x());
        sparseArray.put(35, new com.tencent.mm.plugin.appbrand.menu.c());
        sparseArray.put(36, new com.tencent.mm.plugin.appbrand.menu.q());
    }

    public static void a(java.util.List list, int i17, boolean z17, boolean z18) {
        com.tencent.mm.plugin.appbrand.menu.u0 u0Var = new com.tencent.mm.plugin.appbrand.menu.u0(i17, z17, (nh1.a) com.tencent.mm.plugin.appbrand.menu.k1.f85975a.f85982a.get(i17));
        u0Var.f85995c = z18;
        list.add(u0Var);
    }

    public static long b(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper$GetCopyPathMenuExpireTimeTask wxaMenuHelper$GetCopyPathMenuExpireTimeTask = new com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper$GetCopyPathMenuExpireTimeTask(str);
        wxaMenuHelper$GetCopyPathMenuExpireTimeTask.s();
        return wxaMenuHelper$GetCopyPathMenuExpireTimeTask.f85863g;
    }

    public static boolean c(com.tencent.mm.plugin.appbrand.menu.u0 u0Var, java.lang.String str, boolean z17) {
        if (u0Var != null) {
            return u0Var.f85996d.g(str);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WxaMenuHelper", "safeGetBoolean, menuInfo is null, key: " + str);
        return z17;
    }

    public static void d(com.tencent.mm.plugin.appbrand.menu.u0 u0Var, java.lang.String str, boolean z17) {
        if (u0Var != null) {
            u0Var.f85996d.j(str, z17);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WxaMenuHelper", "safeSetBoolean, menuInfo is null, key: " + str);
    }
}
