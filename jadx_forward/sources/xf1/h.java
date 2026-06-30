package xf1;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final xf1.h f535769a = new xf1.h();

    public final boolean a(com.p314xaae8f345.mm.vfs.r6 cacheFile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheFile, "cacheFile");
        if (cacheFile.y()) {
            java.util.Objects.toString(cacheFile);
            xf1.o oVar = null;
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AppBrandResCacheMeta").getString("metaData_dir_" + cacheFile.o(), null);
            if (string == null || string.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateDir, metaDataStr is empty");
            } else {
                try {
                    oVar = xf1.o.f535779c.a(new org.json.JSONObject(string));
                } catch (java.lang.Exception e17) {
                    e17.toString();
                }
                if (oVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateDir, metaData is null");
                } else {
                    com.p314xaae8f345.mm.vfs.r6 s17 = cacheFile.s();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s17);
                    if (c(oVar, s17)) {
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateDir, validateMeta fail");
                }
            }
        } else {
            long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AppBrandResCacheMeta").getLong("metaData_file_" + cacheFile.o(), -1L);
            long B = cacheFile.B();
            cacheFile.m82469x9616526c();
            if (j17 == B) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(com.p314xaae8f345.mm.vfs.r6 cacheFile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheFile, "cacheFile");
        if (!cacheFile.y()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AppBrandResCacheMeta").putLong("metaData_file_" + cacheFile.o(), cacheFile.B());
            return true;
        }
        java.util.Objects.toString(cacheFile);
        xf1.m mVar = cacheFile.y() ? new xf1.m(cacheFile) : null;
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "recordDir, metaData is null");
        } else {
            org.json.JSONObject a17 = mVar.a();
            java.lang.String jSONObject = a17 != null ? a17.toString() : null;
            if (!(jSONObject == null || jSONObject.length() == 0)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AppBrandResCacheMeta").putString("metaData_dir_" + cacheFile.o(), jSONObject);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "recordDir, metaDataStr is empty");
        }
        return false;
    }

    public final boolean c(xf1.o oVar, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, oVar.f535780a);
        r6Var2.m82469x9616526c();
        if (!(oVar instanceof xf1.m)) {
            if (r6Var2.m() && r6Var2.A()) {
                return oVar.f535781b == r6Var2.B();
            }
            return false;
        }
        java.util.List list = ((xf1.m) oVar).f535778d;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!f535769a.c((xf1.o) it.next(), r6Var2)) {
                return false;
            }
        }
        return true;
    }
}
