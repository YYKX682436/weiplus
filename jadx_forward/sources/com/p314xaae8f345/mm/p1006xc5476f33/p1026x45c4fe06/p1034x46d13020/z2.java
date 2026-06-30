package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes4.dex */
public class z2 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f158200e = {l75.n0.m145250x3fdc6f77(dm.i0.f319031r, "AppBrandTaskRecentApp")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f158201d;

    public z2(l75.k0 k0Var) {
        super(k0Var, dm.i0.f319031r, "AppBrandTaskRecentApp", dm.i0.f319025i);
        this.f158201d = k0Var;
    }

    public boolean D0(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskRecentAppStorage", "remove username:%s, versionType:%d", str, java.lang.Integer.valueOf(i17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y2 y2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y2();
        y2Var.f66816xee1faef1 = java.lang.String.format(java.util.Locale.US, "%s_%d", str, java.lang.Integer.valueOf(i17)).hashCode();
        y2Var.f66818xdec927b = str;
        y2Var.f66819x94d24c6d = i17;
        if (!mo49766xb06685ab((l75.f0) y2Var, false, new java.lang.String[0])) {
            return true;
        }
        boolean z17 = super.get(y2Var, new java.lang.String[0]);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskRecentAppStorage", "do delete recent task Record cgi, listCount:%d", java.lang.Integer.valueOf(mo78086x7444f759()));
            mo142179xf35bbb4("single", 5, null);
        }
        return !z17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y2 y2Var) {
        long j17;
        long j18;
        k91.m4 ij6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij();
        if (ij6 == null || !ij6.D0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandTaskRecentAppStorage", "convertLocalUsageInfo invalid storage with username(%s)", y2Var.f66818xdec927b);
            return null;
        }
        k91.v5 n17 = ij6.n1(y2Var.f66818xdec927b, "appId", "nickname", "shortNickname", "smallHeadURL", "appInfo", "versionInfo", "dynamicInfo");
        if (n17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskRecentAppStorage", "field_nickname:%s, field_shortNickname:%s, updateTime:%d", n17.f68913x21f9b213, n17.f68918x4d428a85, java.lang.Long.valueOf(y2Var.f66817xa783a79b));
        }
        int i17 = 0;
        if (n17 != null) {
            try {
                i17 = n17.w0().f158977d;
            } catch (java.lang.NullPointerException unused) {
            }
        }
        int i18 = i17;
        long j19 = 0;
        if (n17 == null) {
            j18 = 0;
        } else {
            try {
                j18 = n17.u0().f387159a;
            } catch (java.lang.NullPointerException unused2) {
                j17 = 0;
            }
        }
        j17 = j18;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(y2Var.f66819x94d24c6d) && n17 != null) {
            try {
                j19 = n17.u0().f387160b;
            } catch (java.lang.NullPointerException unused3) {
            }
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4(y2Var.f66818xdec927b, n17 == null ? "" : n17.f68904x28d45f97, y2Var.f66819x94d24c6d, i18, n17 == null ? "" : n17.f68913x21f9b213, n17 == null ? "" : n17.f68918x4d428a85, n17 == null ? "" : n17.f68920x68aa7b8d, false, j17, j19, false, "");
    }

    public java.util.ArrayList z0(int i17, int i18, int i19) {
        java.lang.String str;
        java.lang.String[] strArr;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 y07;
        if (i19 != Integer.MAX_VALUE) {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "%s=?", "versionType");
            strArr = new java.lang.String[]{java.lang.String.valueOf(i19)};
            str = format;
        } else {
            str = null;
            strArr = null;
        }
        android.database.Cursor E = this.f158201d.E("AppBrandTaskRecentApp", new java.lang.String[]{dm.i4.f66875xa013b0d5, "versionType", dm.i4.f66874x4c6b1f55}, str, strArr, null, null, java.lang.String.format(java.util.Locale.US, " %s desc limit %d offset %d", dm.i4.f66874x4c6b1f55, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        try {
            if (E == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskRecentAppStorage", "task is empty");
                return new java.util.ArrayList();
            }
            try {
                if (E.moveToFirst()) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y2 y2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y2();
                    do {
                        y2Var.mo9015xbf5d97fd(E);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y2Var.f66818xdec927b) && (y07 = y0(y2Var)) != null) {
                            linkedList.add(y07);
                        }
                    } while (E.moveToNext());
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedList.size());
                    arrayList2.addAll(linkedList);
                    arrayList = arrayList2;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskRecentAppStorage", "empty cursor");
                    arrayList = new java.util.ArrayList();
                }
                E.close();
                return arrayList;
            } catch (android.database.sqlite.SQLiteDiskIOException | com.p314xaae8f345.p3121x37984a.C26877xc3b63269 | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26957x1fbb1a40 e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandTaskRecentAppStorage", "convertToTaskList e=%s", e17);
                return new java.util.ArrayList(0);
            }
        } finally {
            E.close();
        }
    }
}
