package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5 f166152a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5();

    /* renamed from: b, reason: collision with root package name */
    public static final bm5.z0 f166153b = new bm5.z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b5.f166050a);

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseArray f166154c = new android.util.SparseArray();

    public final void a(l81.b1 b1Var) {
        if (b1Var == null) {
            throw new java.lang.IllegalArgumentException(new java.lang.NullPointerException());
        }
        if (b1Var.Y != null) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getString("CustomLoadingAppid", "");
            if (!r26.i0.q(string, "", false, 2, null)) {
                b1Var.f398547b = string;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ExportWxaInstrumentation", "set appid:" + b1Var.f398547b);
            }
        }
        java.lang.String str = b1Var.f398545a;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            java.lang.String str2 = b1Var.f398547b;
            if (str2 == null || str2.length() == 0) {
                throw new java.lang.IllegalArgumentException("Both username & appId is EMPTY");
            }
        }
        java.lang.String str3 = b1Var.f398545a;
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            java.lang.String username = b1Var.f398545a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
            if (!r26.i0.n(username, "@app", false)) {
                throw new java.lang.IllegalArgumentException("Invalid weapp username " + b1Var.f398545a);
            }
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(b1Var.f398549c) && !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(b1Var.f398549c)) {
            throw new java.lang.IllegalArgumentException("Invalid weapp versionType " + b1Var.f398549c);
        }
        if (b1Var.f398565k > 1000) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Invalid weapp enter scene " + b1Var.f398565k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t2) r0).Bi() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r3 = this;
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.k6> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.appbrand.service.k6 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6) r0
            r1 = 0
            if (r0 == 0) goto L15
            com.tencent.mm.plugin.appbrand.app.t2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t2) r0
            boolean r0 = r0.Bi()
            r2 = 1
            if (r0 != r2) goto L15
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L35
            android.content.SharedPreferences r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52()
            java.lang.String r2 = "com.tencent.mm.plugin.appbrand.launching.isForcedCloseDemoCheckForColdLaunchWxaApp"
            boolean r1 = r0.getBoolean(r2, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "isForcedCloseDemoCheckForColdLaunchWxaApp="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.ExportWxaInstrumentation"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.b():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t2) r0).Bi() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r3 = this;
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.k6> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.appbrand.service.k6 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6) r0
            r1 = 0
            if (r0 == 0) goto L15
            com.tencent.mm.plugin.appbrand.app.t2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t2) r0
            boolean r0 = r0.Bi()
            r2 = 1
            if (r0 != r2) goto L15
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L35
            android.content.SharedPreferences r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52()
            java.lang.String r2 = "com.tencent.mm.plugin.appbrand.launching.isForcedCloseDemoCheckForWarmLaunchWxaApp"
            boolean r1 = r0.getBoolean(r2, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "isForcedCloseDemoCheckForWarmLaunchWxaApp="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.ExportWxaInstrumentation"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.c():boolean");
    }

    public final boolean d(java.lang.String str) {
        boolean z17 = true;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a.f159126a.b()) {
            return true;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.f0 f0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g0.f159280d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g0.f159281e == null) {
            f0Var.a();
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g0.f159282f.contains(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t2) r0).Bi() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r3 = this;
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.k6> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.appbrand.service.k6 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6) r0
            r1 = 0
            if (r0 == 0) goto L15
            com.tencent.mm.plugin.appbrand.app.t2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t2) r0
            boolean r0 = r0.Bi()
            r2 = 1
            if (r0 != r2) goto L15
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L35
            android.content.SharedPreferences r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52()
            java.lang.String r2 = "com.tencent.mm.plugin.appbrand.launching.isForcedOpenWxaAppForTypedDemo"
            boolean r1 = r0.getBoolean(r2, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "isForcedOpenWxaAppForTypedDemo="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.ExportWxaInstrumentation"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.e():boolean");
    }

    public final l81.b1 f(int i17) {
        android.util.SparseArray sparseArray = f166154c;
        synchronized (sparseArray) {
            int indexOfKey = sparseArray.indexOfKey(i17);
            l81.b1 b1Var = null;
            if (indexOfKey < 0) {
                return null;
            }
            l81.b1 b1Var2 = (l81.b1) sparseArray.valueAt(indexOfKey);
            if (b1Var2 != null) {
                sparseArray.removeAt(indexOfKey);
                b1Var = b1Var2;
            }
            return b1Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c8, code lost:
    
        if ((r2 == null || r2.length() == 0) == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc g(l81.b1 r18) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.g(l81.b1):com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel");
    }
}
