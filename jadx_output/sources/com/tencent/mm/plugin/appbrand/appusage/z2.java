package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes4.dex */
public class z2 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f76667e = {l75.n0.getCreateSQLs(dm.i0.f237498r, "AppBrandTaskRecentApp")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f76668d;

    public z2(l75.k0 k0Var) {
        super(k0Var, dm.i0.f237498r, "AppBrandTaskRecentApp", dm.i0.f237492i);
        this.f76668d = k0Var;
    }

    public boolean D0(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskRecentAppStorage", "remove username:%s, versionType:%d", str, java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appusage.y2 y2Var = new com.tencent.mm.plugin.appbrand.appusage.y2();
        y2Var.field_recordId = java.lang.String.format(java.util.Locale.US, "%s_%d", str, java.lang.Integer.valueOf(i17)).hashCode();
        y2Var.field_username = str;
        y2Var.field_versionType = i17;
        if (!delete((l75.f0) y2Var, false, new java.lang.String[0])) {
            return true;
        }
        boolean z17 = super.get(y2Var, new java.lang.String[0]);
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskRecentAppStorage", "do delete recent task Record cgi, listCount:%d", java.lang.Integer.valueOf(getCount()));
            doNotify("single", 5, null);
        }
        return !z17;
    }

    public final com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo y0(com.tencent.mm.plugin.appbrand.appusage.y2 y2Var) {
        long j17;
        long j18;
        k91.m4 ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij();
        if (ij6 == null || !ij6.D0()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandTaskRecentAppStorage", "convertLocalUsageInfo invalid storage with username(%s)", y2Var.field_username);
            return null;
        }
        k91.v5 n17 = ij6.n1(y2Var.field_username, "appId", "nickname", "shortNickname", "smallHeadURL", "appInfo", "versionInfo", "dynamicInfo");
        if (n17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskRecentAppStorage", "field_nickname:%s, field_shortNickname:%s, updateTime:%d", n17.field_nickname, n17.field_shortNickname, java.lang.Long.valueOf(y2Var.field_updateTime));
        }
        int i17 = 0;
        if (n17 != null) {
            try {
                i17 = n17.w0().f77444d;
            } catch (java.lang.NullPointerException unused) {
            }
        }
        int i18 = i17;
        long j19 = 0;
        if (n17 == null) {
            j18 = 0;
        } else {
            try {
                j18 = n17.u0().f305626a;
            } catch (java.lang.NullPointerException unused2) {
                j17 = 0;
            }
        }
        j17 = j18;
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(y2Var.field_versionType) && n17 != null) {
            try {
                j19 = n17.u0().f305627b;
            } catch (java.lang.NullPointerException unused3) {
            }
        }
        return new com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo(y2Var.field_username, n17 == null ? "" : n17.field_appId, y2Var.field_versionType, i18, n17 == null ? "" : n17.field_nickname, n17 == null ? "" : n17.field_shortNickname, n17 == null ? "" : n17.field_smallHeadURL, false, j17, j19, false, "");
    }

    public java.util.ArrayList z0(int i17, int i18, int i19) {
        java.lang.String str;
        java.lang.String[] strArr;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo y07;
        if (i19 != Integer.MAX_VALUE) {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "%s=?", "versionType");
            strArr = new java.lang.String[]{java.lang.String.valueOf(i19)};
            str = format;
        } else {
            str = null;
            strArr = null;
        }
        android.database.Cursor E = this.f76668d.E("AppBrandTaskRecentApp", new java.lang.String[]{dm.i4.COL_USERNAME, "versionType", dm.i4.COL_UPDATETIME}, str, strArr, null, null, java.lang.String.format(java.util.Locale.US, " %s desc limit %d offset %d", dm.i4.COL_UPDATETIME, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        try {
            if (E == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskRecentAppStorage", "task is empty");
                return new java.util.ArrayList();
            }
            try {
                if (E.moveToFirst()) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    com.tencent.mm.plugin.appbrand.appusage.y2 y2Var = new com.tencent.mm.plugin.appbrand.appusage.y2();
                    do {
                        y2Var.convertFrom(E);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(y2Var.field_username) && (y07 = y0(y2Var)) != null) {
                            linkedList.add(y07);
                        }
                    } while (E.moveToNext());
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedList.size());
                    arrayList2.addAll(linkedList);
                    arrayList = arrayList2;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskRecentAppStorage", "empty cursor");
                    arrayList = new java.util.ArrayList();
                }
                E.close();
                return arrayList;
            } catch (android.database.sqlite.SQLiteDiskIOException | com.tencent.wcdb.CursorWindowAllocationException | com.tencent.wcdb.database.SQLiteDiskIOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandTaskRecentAppStorage", "convertToTaskList e=%s", e17);
                return new java.util.ArrayList(0);
            }
        } finally {
            E.close();
        }
    }
}
