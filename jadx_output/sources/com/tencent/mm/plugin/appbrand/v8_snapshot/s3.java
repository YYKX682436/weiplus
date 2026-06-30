package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class s3 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f90820d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f90821e;

    static {
        int i17 = wo.w0.q() ? 2 : 1;
        f90820d = i17;
        f90821e = new java.lang.String[]{l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.v8_snapshot.q3.R, "WxaPkgV8SnapshotInfoV3")};
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "<cinit>, ARCH: " + i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.appbrand.v8_snapshot.q3.R, "WxaPkgV8SnapshotInfoV3", dm.zc.f241606w);
        kotlin.jvm.internal.o.g(db6, "db");
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.v8_snapshot.r3(db6, this));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final boolean y0(com.tencent.mm.plugin.appbrand.v8_snapshot.s3 s3Var, l75.k0 k0Var) {
        java.util.Collection<dm.yc> collection;
        boolean z17;
        s3Var.getClass();
        android.database.Cursor B = k0Var.B("SELECT * FROM WxaPkgV8SnapshotInfoV2", null);
        ?? r07 = kz5.p0.f313996d;
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    r07 = new java.util.ArrayList();
                    do {
                        dm.yc ycVar = new dm.yc();
                        ycVar.convertFrom(B);
                        r07.add(ycVar);
                    } while (B.moveToNext());
                }
                vz5.b.a(B, null);
                collection = r07;
            } finally {
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "convertV2List, cursor is null");
            collection = r07;
        }
        if (!collection.isEmpty()) {
            for (dm.yc v27 : collection) {
                java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.v8_snapshot.q3.Q;
                kotlin.jvm.internal.o.g(v27, "v2");
                com.tencent.mm.plugin.appbrand.v8_snapshot.q3 q3Var = new com.tencent.mm.plugin.appbrand.v8_snapshot.q3();
                q3Var.field_arch = v27.field_arch;
                q3Var.field_wxaPkgMd5 = v27.field_wxaPkgMd5;
                q3Var.field_wxaPkgPath = v27.field_wxaPkgPath;
                q3Var.field_wxaPkgVersion = v27.field_wxaPkgVersion;
                q3Var.field_snapshotCategory = v27.field_snapshotCategory;
                q3Var.field_snapshotPath = v27.field_snapshotPath;
                q3Var.field_snapshotLastModified = v27.field_snapshotLastModified;
                q3Var.field_snapshotLength = v27.field_snapshotLength;
                q3Var.field_snapshotBaseConfig = v27.field_produceSnapshotConfig;
                q3Var.field_snapshotMetaInfo = v27.field_snapshotMetaInfo;
                z17 = false;
                q3Var.field_isNodeSnapshot = false;
                q3Var.field_snapshotNodeConfig = null;
                q3Var.field_producingSnapshotCount = v27.field_producingSnapshotCount;
                q3Var.field_consumingSnapshotCount = v27.field_consumingSnapshotCount;
                q3Var.field_recoverCount = v27.field_recoverCount;
                if (!s3Var.J0(q3Var)) {
                    break;
                }
            }
        }
        z17 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "migrateTableV2, success: " + z17);
        return z17;
    }

    public final com.tencent.mm.plugin.appbrand.v8_snapshot.q3 D0(java.lang.String wxaPkgPath, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 category) {
        kotlin.jvm.internal.o.g(wxaPkgPath, "wxaPkgPath");
        kotlin.jvm.internal.o.g(category, "category");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "deleteByWxaPkgPath, wxaPkgPath: " + wxaPkgPath + ", category: " + category);
        com.tencent.mm.plugin.appbrand.v8_snapshot.q3 q3Var = new com.tencent.mm.plugin.appbrand.v8_snapshot.q3();
        q3Var.field_arch = f90820d;
        q3Var.field_wxaPkgPath = wxaPkgPath;
        q3Var.field_snapshotCategory = category.f90775d;
        java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.v8_snapshot.q3.Q;
        if (delete(q3Var, (java.lang.String[]) java.util.Arrays.copyOf(com.tencent.mm.plugin.appbrand.v8_snapshot.q3.Q, 3))) {
            return q3Var;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "deleteByWxaPkgPath, delete failure");
        return null;
    }

    public final boolean J0(com.tencent.mm.plugin.appbrand.v8_snapshot.q3 dao) {
        kotlin.jvm.internal.o.g(dao, "dao");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "insertOrReplace, wxaPkgPath: " + dao.field_wxaPkgPath + ", category: " + dao.field_snapshotCategory);
        boolean replace = replace(dao);
        if (!replace) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "insertOrReplace, replace failure");
        }
        return replace;
    }

    public final java.util.List L0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByBelowVersionAllArch, version: " + i17);
        return z0(rawQuery("SELECT * FROM WxaPkgV8SnapshotInfoV3 WHERE wxaPkgVersion < ?", java.lang.String.valueOf(i17)));
    }

    public final com.tencent.mm.plugin.appbrand.v8_snapshot.q3 P0(java.lang.String wxaPkgPath, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 category) {
        kotlin.jvm.internal.o.g(wxaPkgPath, "wxaPkgPath");
        kotlin.jvm.internal.o.g(category, "category");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPath, wxaPkgPath: " + wxaPkgPath + ", category: " + category);
        com.tencent.mm.plugin.appbrand.v8_snapshot.q3 q3Var = new com.tencent.mm.plugin.appbrand.v8_snapshot.q3();
        q3Var.field_arch = f90820d;
        q3Var.field_wxaPkgPath = wxaPkgPath;
        q3Var.field_snapshotCategory = category.f90775d;
        java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.v8_snapshot.q3.Q;
        if (get(q3Var, (java.lang.String[]) java.util.Arrays.copyOf(com.tencent.mm.plugin.appbrand.v8_snapshot.q3.Q, 3))) {
            return q3Var;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPath, get failure");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final java.util.List z0(android.database.Cursor cursor) {
        java.util.List list;
        ?? r07 = kz5.p0.f313996d;
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    r07 = new java.util.ArrayList();
                    do {
                        com.tencent.mm.plugin.appbrand.v8_snapshot.q3 q3Var = new com.tencent.mm.plugin.appbrand.v8_snapshot.q3();
                        q3Var.convertFrom(cursor);
                        r07.add(q3Var);
                    } while (cursor.moveToNext());
                }
                vz5.b.a(cursor, null);
                list = r07;
            } finally {
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "convertList, cursor is null");
            list = r07;
        }
        return list;
    }
}
