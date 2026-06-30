package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes4.dex */
public final class d2 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f76412e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f76413d;

    static {
        l75.e0 e0Var = com.tencent.mm.plugin.appbrand.appusage.c2.f76404v;
        f76412e = new java.lang.String[]{l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.appusage.c2.f76404v, "AppBrandMessInfoRecord")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(l75.k0 mDB) {
        super(mDB, com.tencent.mm.plugin.appbrand.appusage.c2.f76404v, "AppBrandMessInfoRecord", null);
        kotlin.jvm.internal.o.g(mDB, "mDB");
        l75.e0 e0Var = com.tencent.mm.plugin.appbrand.appusage.c2.f76404v;
        this.f76413d = mDB;
    }

    public final boolean D0(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(appId)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appusage.c2 c2Var = new com.tencent.mm.plugin.appbrand.appusage.c2();
        c2Var.field_appId = appId;
        return super.delete(c2Var, "appId");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (r3.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        r2.add(r3.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (r3.moveToNext() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        r3.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y0() {
        /*
            r9 = this;
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = r9.getTableName()
            java.lang.String r5 = "appId"
            java.lang.String r6 = "WxaAttributesTable"
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r4, r5}
            r5 = 3
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r5 = "select attributes.appId from %s as attributes left join %s as messInfo on attributes.appId = messInfo.appId where messInfo.%s is null"
            java.lang.String r3 = java.lang.String.format(r3, r5, r4)
            java.lang.String r4 = "format(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[r4]
            android.database.Cursor r3 = r9.rawQuery(r3, r5)
            if (r3 == 0) goto L49
            boolean r5 = r3.moveToFirst()
            if (r5 == 0) goto L46
        L39:
            java.lang.String r5 = r3.getString(r4)
            r2.add(r5)
            boolean r5 = r3.moveToNext()
            if (r5 != 0) goto L39
        L46:
            r3.close()
        L49:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "uninit app service type count "
            r3.<init>(r5)
            int r5 = r2.size()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "MicroMsg.AppBrandMessInfoStorage"
            com.tencent.mars.xlog.Log.i(r5, r3)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L6e
            java.lang.String r0 = "nothing to update"
            com.tencent.mars.xlog.Log.i(r5, r0)
            return r4
        L6e:
            java.util.Iterator r2 = r2.iterator()
            r3 = 1
        L73:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lcd
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            k91.m4 r6 = com.tencent.mm.plugin.appbrand.app.r9.ij()
            java.lang.String r7 = "appInfo"
            java.lang.String r8 = "dynamicInfo"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}
            k91.v5 r6 = r6.k1(r4, r7)
            if (r6 != 0) goto La8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "flush mess info for appId: "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = ", but record not found in attributes"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.mars.xlog.Log.i(r5, r4)
            goto L73
        La8:
            com.tencent.mm.plugin.appbrand.appusage.c2 r7 = new com.tencent.mm.plugin.appbrand.appusage.c2
            r7.<init>()
            r7.field_appId = r4
            k91.j5 r4 = r6.u0()
            if (r4 == 0) goto Lbd
            int r8 = r4.f305630e
            r7.field_wechatPluginApp = r8
            int r4 = r4.f305629d
            r7.field_appServiceType = r4
        Lbd:
            k91.o5 r4 = r6.v0()
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting r4 = r4.f305706a
            int r4 = r4.f77421s
            r7.field_maxFileStorageSize = r4
            boolean r4 = r9.insert(r7)
            r3 = r3 & r4
            goto L73
        Lcd:
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "flush app service type cost: %d"
            com.tencent.mars.xlog.Log.i(r5, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appusage.d2.y0():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r1.moveToNext() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        vz5.b.a(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r1.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r3 = r1.getString(0);
        kotlin.jvm.internal.o.f(r3, "getString(...)");
        r0.put(r3, java.lang.Long.valueOf(r1.getLong(1)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map z0() {
        /*
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "lastLaunchTime"
            java.lang.String r3 = "AppBrandMessInfoRecord"
            java.lang.String r4 = "appId"
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2, r3}
            r3 = 3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r3 = "select %s,%s from %s"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            android.database.Cursor r1 = r6.rawQuery(r1, r3)
            if (r1 == 0) goto L59
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L4d
        L32:
            java.lang.String r3 = r1.getString(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "getString(...)"
            kotlin.jvm.internal.o.f(r3, r4)     // Catch: java.lang.Throwable -> L52
            r4 = 1
            long r4 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L52
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L52
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L32
        L4d:
            r2 = 0
            vz5.b.a(r1, r2)
            goto L59
        L52:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L54
        L54:
            r2 = move-exception
            vz5.b.a(r1, r0)
            throw r2
        L59:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "appbrand count "
            r1.<init>(r2)
            int r2 = r0.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.AppBrandMessInfoStorage"
            com.tencent.mars.xlog.Log.i(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appusage.d2.z0():java.util.Map");
    }
}
