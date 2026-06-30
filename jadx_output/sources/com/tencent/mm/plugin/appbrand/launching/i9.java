package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class i9 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f84669e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.launching.k9.K, "LaunchWxaAppRespTable")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f84670d;

    public i9(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.launching.k9.K, "LaunchWxaAppRespTable", dm.j7.f237823t);
        this.f84670d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean get(com.tencent.mm.plugin.appbrand.launching.k9 k9Var, java.lang.String... strArr) {
        if (!com.tencent.mm.sdk.platformtools.t8.N0(strArr)) {
            int i17 = 0;
            while (true) {
                if (i17 >= strArr.length) {
                    break;
                }
                if (strArr[i17].equals("appId")) {
                    strArr[i17] = "appIdHash";
                    k9Var.field_appIdHash = k9Var.field_appId.hashCode();
                    break;
                }
                i17++;
            }
        }
        return super.get(k9Var, strArr);
    }

    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean insertNotify(com.tencent.mm.plugin.appbrand.launching.k9 k9Var, boolean z17) {
        k9Var.field_appIdHash = k9Var.field_appId.hashCode();
        super.insertNotify(k9Var, z17);
        boolean z18 = get(k9Var, "appId");
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaAppCacheStorage", "insertNotify appId %s ret %B", k9Var.field_appId, java.lang.Boolean.valueOf(z18));
        return z18;
    }

    @Override // l75.n0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public boolean updateNotify(com.tencent.mm.plugin.appbrand.launching.k9 k9Var, boolean z17, java.lang.String... strArr) {
        if (!com.tencent.mm.sdk.platformtools.t8.N0(strArr)) {
            int i17 = 0;
            while (true) {
                if (i17 >= strArr.length) {
                    break;
                }
                if (strArr[i17].equals("appId")) {
                    strArr[i17] = "appIdHash";
                    k9Var.field_appIdHash = k9Var.field_appId.hashCode();
                    break;
                }
                i17++;
            }
        }
        boolean updateNotify = super.updateNotify(k9Var, z17, strArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaAppCacheStorage", "updateNotify appId %s, ret %B", k9Var.field_appId, java.lang.Boolean.valueOf(updateNotify));
        return updateNotify;
    }

    public boolean d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.k9 k9Var = new com.tencent.mm.plugin.appbrand.launching.k9();
        k9Var.field_appId = str;
        return delete(k9Var, false, "appId");
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean delete(com.tencent.mm.plugin.appbrand.launching.k9 k9Var, boolean z17, java.lang.String... strArr) {
        if (!com.tencent.mm.sdk.platformtools.t8.N0(strArr)) {
            int i17 = 0;
            while (true) {
                if (i17 >= strArr.length) {
                    break;
                }
                if (strArr[i17].equals("appId")) {
                    strArr[i17] = "appIdHash";
                    k9Var.field_appIdHash = k9Var.field_appId.hashCode();
                    break;
                }
                i17++;
            }
        }
        return super.delete(k9Var, z17, strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.appbrand.launching.k9 z0(java.lang.String r12, r45.v54 r13) {
        /*
            r11 = this;
            java.lang.String r0 = "appId"
            java.lang.String r1 = "flush resp, appId %s, apply %B, insert %B, cost:%d"
            java.lang.String r2 = "MicroMsg.LaunchWxaAppCacheStorage"
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r12)
            if (r3 != 0) goto Lbd
            if (r13 != 0) goto L10
            goto Lbd
        L10:
            long r3 = android.os.SystemClock.elapsedRealtime()
            r5 = 0
            com.tencent.mm.plugin.appbrand.appcache.o8 r6 = com.tencent.mm.plugin.appbrand.appcache.o8.f75709a     // Catch: java.lang.Throwable -> La2
            java.lang.String r7 = "resp"
            kotlin.jvm.internal.o.g(r13, r7)     // Catch: java.lang.Throwable -> La2
            r45.tt3 r7 = r13.f387916u     // Catch: java.lang.Throwable -> La2
            java.lang.String r8 = "launch"
            r6.d(r7, r8)     // Catch: java.lang.Throwable -> La2
            com.tencent.mm.plugin.appbrand.launching.k9 r6 = new com.tencent.mm.plugin.appbrand.launching.k9     // Catch: java.lang.Throwable -> La2
            r6.<init>()     // Catch: java.lang.Throwable -> La2
            r6.t0(r13)     // Catch: java.lang.Throwable -> La2
            r6.field_appId = r12     // Catch: java.lang.Throwable -> La2
            com.tencent.mm.plugin.appbrand.launching.k9 r13 = new com.tencent.mm.plugin.appbrand.launching.k9     // Catch: java.lang.Throwable -> La2
            r13.<init>()     // Catch: java.lang.Throwable -> La2
            r13.field_appId = r12     // Catch: java.lang.Throwable -> La2
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> La2
            r8[r5] = r0     // Catch: java.lang.Throwable -> La2
            boolean r8 = r11.get(r13, r8)     // Catch: java.lang.Throwable -> La2
            r8 = r8 ^ r7
            if (r8 != 0) goto L4b
            boolean r9 = r13.equals(r6)     // Catch: java.lang.Throwable -> L49
            if (r9 != 0) goto L47
            goto L4b
        L47:
            r9 = r5
            goto L4c
        L49:
            r13 = move-exception
            goto La4
        L4b:
            r9 = r7
        L4c:
            if (r9 == 0) goto L5b
            if (r8 == 0) goto L54
            r11.insertNotify(r6, r5)     // Catch: java.lang.Throwable -> L9f
            goto L5b
        L54:
            java.lang.String[] r10 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L9f
            r10[r5] = r0     // Catch: java.lang.Throwable -> L9f
            r11.updateNotify(r6, r5, r10)     // Catch: java.lang.Throwable -> L9f
        L5b:
            if (r9 == 0) goto L83
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L9f
            r7[r5] = r0     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r11.get(r13, r7)     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L83
            com.tencent.mm.plugin.appbrand.launching.j9.a(r13)     // Catch: java.lang.Throwable -> L9f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r0, r5, r3}
            com.tencent.mars.xlog.Log.i(r2, r1, r12)
            return r13
        L83:
            com.tencent.mm.plugin.appbrand.launching.j9.a(r6)     // Catch: java.lang.Throwable -> L9f
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r0, r3}
            com.tencent.mars.xlog.Log.i(r2, r1, r12)
            return r6
        L9f:
            r13 = move-exception
            r5 = r9
            goto La4
        La2:
            r13 = move-exception
            r8 = r5
        La4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r0, r5, r3}
            com.tencent.mars.xlog.Log.i(r2, r1, r12)
            throw r13
        Lbd:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.i9.z0(java.lang.String, r45.v54):com.tencent.mm.plugin.appbrand.launching.k9");
    }
}
