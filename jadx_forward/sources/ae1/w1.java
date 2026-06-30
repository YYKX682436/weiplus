package ae1;

/* loaded from: classes7.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ae1.w1 f84954a = new ae1.w1();

    public final ae1.d a(ze.n runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        ae1.d dVar = (ae1.d) runtime.k(ae1.d.class);
        if (dVar != null) {
            return dVar;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u07 = runtime.u0();
        java.lang.String a17 = u07 != null ? kk.v.a(u07.f128812x0) : null;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, uin is null");
            return null;
        }
        java.lang.String str = runtime.f156336n;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, appId is null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.c(a17, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49626x6322a2f = c17.mo49626x6322a2f("wxfile://clientdata/TSMStorage", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49626x6322a2f, "mkdir(...)");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK != mo49626x6322a2f && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_ALREADY_EXISTS != mo49626x6322a2f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, mkdir fail, ret: " + mo49626x6322a2f);
            return null;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(new com.p314xaae8f345.mm.vfs.r6(c17.f157758d, "TSMStorage").o(), true);
        if (i17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, smStorageRootPath is null");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SmStorageFactory", "getOrCreate, uin: " + a17 + ", appId: " + str + ", smStorageRootPath: " + i17);
        ae1.z1 z1Var = new ae1.z1(i17, str, a17, null);
        runtime.l(z1Var);
        return z1Var;
    }
}
