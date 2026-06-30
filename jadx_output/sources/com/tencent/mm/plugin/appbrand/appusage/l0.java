package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class l0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f76502e = {l75.n0.getCreateSQLs(dm.w.f240699x, "AppBrandCommonUseApp")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f76503d;

    public l0(l75.k0 k0Var) {
        super(k0Var, dm.w.f240699x, "AppBrandCommonUseApp", dm.w.f240690o);
        this.f76503d = k0Var;
    }

    public final com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo D0(com.tencent.mm.plugin.appbrand.appusage.g0 g0Var, r45.hd7 hd7Var) {
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        java.lang.String z07 = z0(g0Var.field_username, g0Var.field_versionType);
        java.lang.String str = g0Var.field_username;
        java.lang.String str2 = hd7Var.f376072g;
        java.lang.String str3 = hd7Var.f376073h;
        java.lang.String str4 = hd7Var.f376074i;
        int i17 = hd7Var.f376075m;
        int i18 = g0Var.field_versionType;
        return new com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo(z07, str, str2, str3, str3, str4, i17, i18, 0, 0L, 0L, w2Var != null && w2Var.z0(str, i18), -1L, 0, 0, 0, false, "", false);
    }

    public boolean J0(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "remove username:%s, versionType:%d", str, java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appusage.g0 g0Var = new com.tencent.mm.plugin.appbrand.appusage.g0();
        g0Var.field_recordId = z0(str, i17).hashCode();
        g0Var.field_username = str;
        g0Var.field_versionType = i17;
        if (!delete((l75.f0) g0Var, false, new java.lang.String[0])) {
            return true;
        }
        boolean z17 = super.get(g0Var, new java.lang.String[0]);
        if (!z17) {
            int count = getCount();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "do deleteCommUseRecord cgi, listCount:%d", java.lang.Integer.valueOf(count));
            new com.tencent.mm.plugin.appbrand.appusage.n3(1001, false, i17, 3, 2, str, 1, null, count == 0 ? 1 : 0).l();
            doNotify("single", 5, null);
        }
        return !z17;
    }

    public void y0(java.util.LinkedList linkedList, java.lang.Long l17, boolean z17, int i17, java.lang.Runnable runnable) {
        java.util.Iterator it;
        int i18;
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "flushCommonUseList");
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = this.f76503d;
        long F = k0Var.F(valueOf);
        k0Var.delete("AppBrandCommonUseApp", "", null);
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCommonUsedAppStorage", "flushCommonUseList commonUseList is null or 0 size");
        } else {
            com.tencent.mm.plugin.appbrand.appusage.g0 g0Var = new com.tencent.mm.plugin.appbrand.appusage.g0();
            java.util.Iterator it6 = linkedList.iterator();
            int i27 = 0;
            while (it6.hasNext()) {
                r45.pc7 pc7Var = (r45.pc7) it6.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(pc7Var.f382944d)) {
                    g0Var.field_recordId = z0(pc7Var.f382944d, pc7Var.f382946f).hashCode();
                    g0Var.field_username = pc7Var.f382944d;
                    g0Var.field_versionType = pc7Var.f382946f;
                    java.util.Iterator it7 = it6;
                    g0Var.field_updateTime = java.lang.System.currentTimeMillis();
                    int i28 = i27 + 1;
                    g0Var.field_saveIndex = i27;
                    g0Var.field_appPath = pc7Var.f382951n;
                    try {
                        r45.hd7 hd7Var = pc7Var.f382950m;
                        if (hd7Var != null) {
                            g0Var.field_commonUseInfo = hd7Var.toByteArray();
                            i19 = pc7Var.f382950m.f376069d;
                        } else {
                            i19 = -1;
                        }
                        it = it7;
                        i18 = i19;
                    } catch (java.io.IOException e17) {
                        it = it7;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandCommonUsedAppStorage", e17, "", new java.lang.Object[0]);
                        i18 = -1;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "username:%s, version_type:%d, referId:%d, app_path:%s", pc7Var.f382944d, java.lang.Integer.valueOf(pc7Var.f382946f), java.lang.Integer.valueOf(i18), pc7Var.f382951n);
                    k0Var.l("AppBrandCommonUseApp", null, g0Var.convertTo());
                    i27 = i28;
                    it6 = it;
                }
            }
        }
        k0Var.w(java.lang.Long.valueOf(F));
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mm.plugin.appbrand.appusage.a3.a(i17, null, linkedList, new com.tencent.mm.plugin.appbrand.appusage.k0(this, z17, l17, runnable));
            return;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "ljd doNotify db clear list");
            doNotify("batch", 3, l17);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final java.lang.String z0(java.lang.String str, int i17) {
        return java.lang.String.format(java.util.Locale.US, "%s_%d", str, java.lang.Integer.valueOf(i17));
    }
}
