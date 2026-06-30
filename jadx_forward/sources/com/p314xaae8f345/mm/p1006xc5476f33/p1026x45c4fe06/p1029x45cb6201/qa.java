package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class qa implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b4 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f157453f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9.f157221J, "AppBrandWxaPkgManifestRecord")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f157454d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pa f157455e;

    public qa(l75.k0 k0Var) {
        this.f157454d = k0Var;
        this.f157455e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pa(k0Var);
    }

    public int[] A(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i17)) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return null;
        }
        java.util.List y17 = y(str, i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.oa.DESC, "version");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(y17)) {
            return null;
        }
        int[] iArr = new int[y17.size()];
        java.util.Iterator it = y17.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            iArr[i18] = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9) it.next()).f67185x8987ca93;
            i18++;
        }
        return iArr;
    }

    public boolean B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgStorage", "updateManifest, appId %s, version %d, pkgType %d", n9Var.f67177x28d45f97, java.lang.Integer.valueOf(n9Var.f67185x8987ca93), java.lang.Integer.valueOf(n9Var.f67180x8ecd6328));
        if (android.text.TextUtils.isEmpty(n9Var.f67177x28d45f97)) {
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(n9Var.f67180x8ecd6328)) {
            n9Var.f67185x8987ca93 = 1;
        }
        boolean mo51732xbf274172 = this.f157455e.mo51732xbf274172(n9Var, true, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9.I);
        if (mo51732xbf274172 && com.p314xaae8f345.mm.vfs.w6.j(n9Var.f67183x55b471cc)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class))).wi(n9Var.f67183x55b471cc);
        }
        return mo51732xbf274172;
    }

    public boolean C(java.lang.String str, int i17, int i18, java.util.List list) {
        java.lang.String str2;
        java.lang.String str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return false;
        }
        int i19 = !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i17) ? 1 : i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f c11830xcf46aa1f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) it.next();
            sb6.append(',');
            sb6.append(c11830xcf46aa1f.f158997d);
            sb6.append("::");
            sb6.append(c11830xcf46aa1f.f158998e);
        }
        sb6.append('}');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgStorage", "updateModuleList, appId %s, type %d, version %d, list %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), sb6.toString());
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f c11830xcf46aa1f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) it6.next();
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(c11830xcf46aa1f2.f158997d);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                    str3 = "";
                } else {
                    str3 = "$" + a17;
                }
                sb7.append(str3);
                str2 = sb7.toString();
            } else {
                str2 = null;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i17)) {
                l(str2, i17, i19, c11830xcf46aa1f2.f158998e, null);
            } else {
                k(str2, i17, null, c11830xcf46aa1f2.f158998e, 0L, 0L);
            }
            java.lang.String str4 = c11830xcf46aa1f2.f159003m;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11830xcf46aa1f2.f158997d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                G(str, c11830xcf46aa1f2.f158997d, i19, i17, str4, 13);
            }
            D(str, i19, i17, c11830xcf46aa1f2.f158997d, c11830xcf46aa1f2.f159004n);
        }
        return true;
    }

    public void D(java.lang.String str, int i17, int i18, java.lang.String str2, java.util.List list) {
        java.lang.String str3;
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5 c11831x52cc1bc5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5) it.next();
            int i19 = c11831x52cc1bc5.f159007d;
            java.lang.String str4 = c11831x52cc1bc5.f159008e;
            java.lang.String str5 = "";
            if (i19 == 0) {
                str3 = "";
            } else if (i19 == 6) {
                str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33451xb78d0379;
            } else if (i19 == 12) {
                str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33448xa038ec0f;
            } else if (i19 == 13) {
                str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str2) + "$__WITHOUT_PLUGINCODE__";
            } else if (i19 == 22) {
                str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33447xa94b0169;
            } else if (i19 != 23) {
                str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str2);
            } else {
                str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str2) + "$__WITHOUT_MULTI_PLUGINCODE__";
            }
            java.lang.String str6 = null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    str5 = "$" + str3;
                }
                sb6.append(str5);
                str6 = sb6.toString();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgStorage", "multiPkg updatePkgInfoList pkgInfoKey:%s,pkgType:%d,codeType:%d", str6, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
            if (i18 == 0) {
                l(str6, i18, i17, str4, null);
            } else {
                k(str6, i18, "", str4, 0L, 0L);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b4
    public dm.k0 E(java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr) {
        return f0(str, i17, strArr);
    }

    public boolean F(java.lang.String str, int i17, int i18, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(i17)) {
            i18 = 1;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues(1);
        contentValues.put("pkgPath", str2);
        boolean z17 = this.f157454d.p("AppBrandWxaPkgManifestRecord", contentValues, java.lang.String.format("%s=? and %s=? and %s=?", "appId", "debugType", "version"), new java.lang.String[]{str, java.lang.String.valueOf(i17), java.lang.String.valueOf(i18)}) > 0;
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class))).wi(str2);
        }
        return z17;
    }

    public void G(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19) {
        java.lang.String str4;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWxaPkgStorage", "updateWithoutPluginCodeInfo withoutLibMd5 null appid:%s,modulename:%s!", str, str2);
            return;
        }
        java.lang.String str5 = "";
        if (i19 == 0) {
            str4 = "";
        } else if (i19 == 6) {
            str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33451xb78d0379;
        } else if (i19 == 12) {
            str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33448xa038ec0f;
        } else if (i19 == 13) {
            str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str2) + "$__WITHOUT_PLUGINCODE__";
        } else if (i19 == 22) {
            str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33447xa94b0169;
        } else if (i19 != 23) {
            str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str2);
        } else {
            str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str2) + "$__WITHOUT_MULTI_PLUGINCODE__";
        }
        java.lang.String str6 = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                str5 = "$" + str4;
            }
            sb6.append(str5);
            str6 = sb6.toString();
        }
        java.lang.String str7 = str6;
        if (i18 == 0) {
            l(str7, i18, i17, str3, null);
        } else {
            k(str7, i18, "", str3, 0L, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.f67177x28d45f97
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 != 0) goto L14
            java.lang.String[] r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9.I
            com.tencent.mm.plugin.appbrand.appcache.pa r1 = r3.f157455e
            boolean r0 = r1.mo9951xb06685ab(r4, r0)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L2f
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.w3> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class
            i95.m r1 = i95.n0.c(r1)
            com.tencent.mm.plugin.appbrand.appcache.w3 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) r1
            java.lang.String r2 = r4.f67183x55b471cc
            com.tencent.mm.plugin.appbrand.appcache.p9 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) r1
            r1.Bi(r2)
            java.lang.String r1 = r4.f67177x28d45f97
            int r2 = r4.f67180x8ecd6328
            int r4 = r4.f67185x8987ca93
            r3.g(r1, r2, r4)
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa.a(com.tencent.mm.plugin.appbrand.appcache.n9):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r5 = r0.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.h(r5) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class))).Bi(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r0.moveToNext() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r7 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = "appId"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "%s != ?"
            java.lang.String r1 = java.lang.String.format(r0, r2, r1)
            java.lang.String r2 = "@LibraryAppId"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r3 = "pkgPath"
            java.lang.String r4 = r7.q()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r1}
            java.lang.String r4 = "select %s from %s where %s"
            java.lang.String r0 = java.lang.String.format(r0, r4, r3)
            r3 = 2
            l75.k0 r4 = r7.f157454d
            android.database.Cursor r0 = r4.f(r0, r2, r3)
            r3 = 0
            if (r0 == 0) goto L5e
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L5e
        L34:
            java.lang.String r5 = r0.getString(r3)     // Catch: java.lang.Throwable -> L52
            boolean r6 = com.p314xaae8f345.mm.vfs.w6.h(r5)     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L4b
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.w3> r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class
            i95.m r6 = i95.n0.c(r6)     // Catch: java.lang.Throwable -> L52
            com.tencent.mm.plugin.appbrand.appcache.w3 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) r6     // Catch: java.lang.Throwable -> L52
            com.tencent.mm.plugin.appbrand.appcache.p9 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) r6     // Catch: java.lang.Throwable -> L52
            r6.Bi(r5)     // Catch: java.lang.Throwable -> L52
        L4b:
            boolean r5 = r0.moveToNext()     // Catch: java.lang.Throwable -> L52
            if (r5 != 0) goto L34
            goto L5e
        L52:
            r1 = move-exception
            if (r0 == 0) goto L5d
            r0.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r0 = move-exception
            r1.addSuppressed(r0)
        L5d:
            throw r1
        L5e:
            if (r0 == 0) goto L63
            r0.close()
        L63:
            java.lang.String r0 = r7.q()
            int r0 = r4.mo70514xb06685ab(r0, r1, r2)
            if (r0 <= 0) goto L6e
            r3 = 1
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa.b():boolean");
    }

    public int c(java.lang.String str) {
        int i17 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "%s =?", "appId");
        java.lang.String[] strArr = {str + "$__PLUGINCODE__"};
        android.database.Cursor D = this.f157454d.D("AppBrandWxaPkgManifestRecord", new java.lang.String[]{"pkgPath"}, format, strArr, null, null, null, 2);
        if (D != null) {
            try {
                if (D.moveToFirst()) {
                    int i18 = 0;
                    do {
                        java.lang.String string = D.getString(0);
                        if (com.p314xaae8f345.mm.vfs.w6.h(string)) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class))).Bi(string);
                            i18++;
                        }
                    } while (D.moveToNext());
                    i17 = i18;
                }
            } catch (java.lang.Throwable th6) {
                if (D != null) {
                    try {
                        D.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        if (D != null) {
            D.close();
        }
        this.f157454d.mo70514xb06685ab("AppBrandWxaPkgManifestRecord", format, strArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgStorage", "deleteAllPluginRecordsForAppId, appId %s, deleted %d files", str, java.lang.Integer.valueOf(i17));
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r5 = r0.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.h(r5) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class))).Bi(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r0.moveToNext() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d() {
        /*
            r7 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = "appId"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "%s like ?"
            java.lang.String r1 = java.lang.String.format(r0, r2, r1)
            java.lang.String r2 = "%$__PLUGINCODE__"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r3 = "pkgPath"
            java.lang.String r4 = r7.q()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r1}
            java.lang.String r4 = "select %s from %s where %s"
            java.lang.String r0 = java.lang.String.format(r0, r4, r3)
            r3 = 2
            l75.k0 r4 = r7.f157454d
            android.database.Cursor r0 = r4.f(r0, r2, r3)
            r3 = 0
            if (r0 == 0) goto L5e
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L5e
        L34:
            java.lang.String r5 = r0.getString(r3)     // Catch: java.lang.Throwable -> L52
            boolean r6 = com.p314xaae8f345.mm.vfs.w6.h(r5)     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L4b
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.w3> r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class
            i95.m r6 = i95.n0.c(r6)     // Catch: java.lang.Throwable -> L52
            com.tencent.mm.plugin.appbrand.appcache.w3 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) r6     // Catch: java.lang.Throwable -> L52
            com.tencent.mm.plugin.appbrand.appcache.p9 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) r6     // Catch: java.lang.Throwable -> L52
            r6.Bi(r5)     // Catch: java.lang.Throwable -> L52
        L4b:
            boolean r5 = r0.moveToNext()     // Catch: java.lang.Throwable -> L52
            if (r5 != 0) goto L34
            goto L5e
        L52:
            r1 = move-exception
            if (r0 == 0) goto L5d
            r0.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r0 = move-exception
            r1.addSuppressed(r0)
        L5d:
            throw r1
        L5e:
            if (r0 == 0) goto L63
            r0.close()
        L63:
            java.lang.String r0 = r7.q()
            int r0 = r4.mo70514xb06685ab(r0, r1, r2)
            if (r0 <= 0) goto L6e
            r3 = 1
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa.d():boolean");
    }

    public int e(java.lang.String str, int i17) {
        int i18 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgStorage", "deleteAppPkg, appId %s, debugType %d", str, java.lang.Integer.valueOf(i17));
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ta.a(str, i17);
        android.database.Cursor D = this.f157454d.D("AppBrandWxaPkgManifestRecord", new java.lang.String[]{"pkgPath"}, a17, null, null, null, null, 2);
        if (D != null) {
            try {
                if (D.moveToFirst()) {
                    java.lang.String string = D.getString(0);
                    if (com.p314xaae8f345.mm.vfs.w6.h(string)) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class))).Bi(string);
                        i18 = 1;
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (D != null) {
                    try {
                        D.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        if (D != null) {
            D.close();
        }
        this.f157454d.mo70514xb06685ab("AppBrandWxaPkgManifestRecord", a17, null);
        return i18 + g(str, i17, -1);
    }

    public void f(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 f07 = f0(str, i17, "version");
        if (f07 != null) {
            a(f07);
        }
    }

    public int g(java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        l75.k0 k0Var = this.f157454d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ta.b(str, i17));
        sb6.append(" and ");
        if (i18 > 0) {
            str2 = "version=" + i18;
        } else {
            str2 = "1=1";
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        int i19 = 0;
        try {
            android.database.Cursor f17 = k0Var.f(java.lang.String.format(java.util.Locale.ENGLISH, "select %s from %s where %s", "pkgPath", q(), sb7), null, 2);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        int i27 = 0;
                        do {
                            try {
                                java.lang.String string = f17.getString(0);
                                if (com.p314xaae8f345.mm.vfs.w6.h(string)) {
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class))).Bi(string);
                                    i27++;
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                i19 = i27;
                                if (f17 != null) {
                                    try {
                                        f17.close();
                                    } catch (java.lang.Throwable th7) {
                                        th.addSuppressed(th7);
                                    }
                                }
                                throw th;
                            }
                        } while (f17.moveToNext());
                        i19 = i27;
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                }
            }
            if (f17 != null) {
                f17.close();
            }
            if (i19 > 0) {
                k0Var.mo70514xb06685ab(q(), sb7, null);
            }
            return i19;
        } finally {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgStorage", "deleteModuleList, appId %s, type %d, version %d, return count %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
    }

    public int h(java.lang.String str, int i17, int i18) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i17)) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgStorage", "deleteModuleListBelowVersion appId[%s] versionType[%d] pkgVersion[%d]", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return this.f157454d.mo70514xb06685ab("AppBrandWxaPkgManifestRecord", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ta.b(str, i17) + " and version<" + i18, null);
    }

    public int i(java.lang.String str, int i17, int i18) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i17)) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgStorage", "deletePkgsBelowVersion, appId %s, versionType %d, pkgVersion %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return this.f157454d.mo70514xb06685ab("AppBrandWxaPkgManifestRecord", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ta.a(str, i17) + " and version<" + i18, null);
    }

    public boolean j(java.lang.String str) {
        android.database.Cursor D = this.f157454d.D("AppBrandWxaPkgManifestRecord", new java.lang.String[]{"appId"}, java.lang.String.format("%s=?", "pkgPath"), new java.lang.String[]{str}, null, null, null, 2);
        if (D == null) {
            return false;
        }
        boolean moveToFirst = D.moveToFirst();
        D.close();
        return moveToFirst;
    }

    public boolean k(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, long j17, long j18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWxaPkgStorage", "flushWxaDebugAppVersionInfo, null or nil appId");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaDebugAppVersionInfo, appId %s, type %d, url %s, md5 %s, lifespan[%d, %d]", str, java.lang.Integer.valueOf(i17), str2, str3, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        java.lang.String str4 = i17 == 999 ? "@LibraryAppId" : str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 L = L(str4, 1, i17, new java.lang.String[0]);
        if (L == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
            n9Var.f67177x28d45f97 = str4;
            n9Var.f67185x8987ca93 = 1;
            n9Var.f67180x8ecd6328 = i17;
            n9Var.f67181x238eac02 = str2;
            n9Var.f67186x912ff5eb = str3;
            n9Var.f67184x1bb3b54a = j17;
            n9Var.f67182x14c61803 = j18;
            n9Var.f67179xac3be4e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            s(n9Var);
            return true;
        }
        boolean z17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(L.f67186x912ff5eb) || str3.equals(L.f67186x912ff5eb)) ? false : true;
        java.lang.String str5 = str2 == null ? "" : str2;
        java.lang.String str6 = L.f67181x238eac02;
        boolean z18 = !str5.equals(str6 != null ? str6 : "");
        if (!z17) {
            if (z18) {
                L.f67181x238eac02 = str2;
                L.f67184x1bb3b54a = j17;
                L.f67182x14c61803 = j18;
                B(L);
            }
            return false;
        }
        L.f67181x238eac02 = str2;
        if (com.p314xaae8f345.mm.vfs.w6.h(L.f67183x55b471cc)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class))).Bi(L.f67183x55b471cc);
        }
        L.f67183x55b471cc = null;
        L.f67179xac3be4e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        L.f67186x912ff5eb = str3;
        L.f67184x1bb3b54a = j17;
        L.f67182x14c61803 = j18;
        L.f67179xac3be4e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        B(L);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str4.split("$"))) {
            g(str4, i17, 1);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(java.lang.String r9, int r10, int r11, java.lang.String r12, java.lang.String r13) {
        /*
            r8 = this;
            boolean r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(r10)
            r1 = 0
            if (r0 != 0) goto La
            java.lang.String r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            return r1
        La:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r0, r2, r12, r13}
            java.lang.String r2 = "MicroMsg.AppBrandWxaPkgStorage"
            java.lang.String r3 = "flushWxaPkgVersionInfo for release, appId %s, type %d, version %d, md5 %s, url %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3, r0)
            java.lang.String r0 = "@LibraryAppId"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L37
            int r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a
            if (r11 != r0) goto L37
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "flushWxaPkgVersionInfo, given version == local library version %d, skip"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r10, r9)
            return r1
        L37:
            java.lang.String[] r0 = new java.lang.String[r1]
            com.tencent.mm.plugin.appbrand.appcache.n9 r0 = r8.L(r9, r11, r10, r0)
            r3 = 0
            if (r0 != 0) goto L6d
            com.tencent.mm.plugin.appbrand.appcache.n9 r0 = new com.tencent.mm.plugin.appbrand.appcache.n9
            r0.<init>()
            r0.f67177x28d45f97 = r9
            r0.f67185x8987ca93 = r11
            r0.f67186x912ff5eb = r12
            r0.f67176xd0b3bac3 = r3
            r0.f67181x238eac02 = r13
            r0.f67180x8ecd6328 = r10
            boolean r10 = r8.s(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)
            int r12 = r0.f67185x8987ca93
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = r0.f67181x238eac02
            java.lang.String r0 = r0.f67186x912ff5eb
            java.lang.Object[] r9 = new java.lang.Object[]{r11, r9, r12, r13, r0}
            java.lang.String r11 = "flushWxaPkgVersionInfo, insert record %b, appId %s, version %d, url %s, md5 %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r11, r9)
            return r10
        L6d:
            java.lang.String r10 = r0.f67181x238eac02
            java.lang.String r4 = r0.f67186x912ff5eb
            if (r4 != 0) goto L76
            java.lang.String r5 = ""
            goto L77
        L76:
            r5 = r4
        L77:
            boolean r5 = r5.equals(r12)
            r6 = 1
            if (r5 != 0) goto L88
            r0.f67186x912ff5eb = r12
            r0.f67176xd0b3bac3 = r3
            r0.f67185x8987ca93 = r11
            r0.f67181x238eac02 = r13
        L86:
            r3 = r6
            goto L9a
        L88:
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r13)
            if (r3 != 0) goto L99
            java.lang.String r3 = r0.f67181x238eac02
            boolean r3 = r13.equals(r3)
            if (r3 != 0) goto L99
            r0.f67181x238eac02 = r13
            goto L86
        L99:
            r3 = r1
        L9a:
            if (r3 == 0) goto La1
            boolean r0 = r8.B(r0)
            goto La2
        La1:
            r0 = r1
        La2:
            r5 = 8
            java.lang.Object[] r5 = new java.lang.Object[r5]
            if (r3 == 0) goto Lac
            if (r0 == 0) goto Lac
            r7 = r6
            goto Lad
        Lac:
            r7 = r1
        Lad:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r5[r1] = r7
            r5[r6] = r9
            r9 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r5[r9] = r7
            r9 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r5[r9] = r11
            r9 = 4
            r5[r9] = r10
            r9 = 5
            r5[r9] = r13
            r9 = 6
            r5[r9] = r4
            r9 = 7
            r5[r9] = r12
            java.lang.String r9 = "flushWxaPkgVersionInfo, update record %b, appId %s, oldVersion %d, newVersion %d, oldURL %s, newURL %s, oldMd5 %s, newMd5 %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9, r5)
            if (r3 == 0) goto Ld9
            if (r0 == 0) goto Ld9
            r1 = r6
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa.l(java.lang.String, int, int, java.lang.String, java.lang.String):boolean");
    }

    public java.util.List m() {
        android.database.Cursor B = this.f157454d.B(java.lang.String.format(java.util.Locale.ENGLISH, "select distinct %s from %s", "appId", "AppBrandWxaPkgManifestRecord"), null);
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    do {
                        java.lang.String string = B.getString(0);
                        int indexOf = string.indexOf(36);
                        if (indexOf < 0) {
                            hashSet.add(string);
                        } else {
                            hashSet.add(string.substring(0, indexOf));
                        }
                    } while (B.moveToNext());
                    java.util.LinkedList linkedList = new java.util.LinkedList(hashSet);
                    B.close();
                    return linkedList;
                }
            } catch (java.lang.Throwable th6) {
                if (B != null) {
                    try {
                        B.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        if (B != null) {
            B.close();
        }
        return java.util.Collections.emptyList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        r1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
        r1.mo9015xbf5d97fd(r5);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r5.moveToNext() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r5.moveToFirst() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List n(java.lang.String r5) {
        /*
            r4 = this;
            p75.n0 r0 = dm.k0.f319463r
            p75.i0 r0 = r0.i()
            p75.d r1 = dm.k0.f319464s
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "'"
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = "%'"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            p75.m0 r5 = r1.p(r5)
            r0.f434190d = r5
            p75.l0 r5 = r0.a()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1 = 0
            l75.k0 r2 = r4.f157454d
            java.lang.String r5 = r5.f434169a
            android.database.Cursor r5 = r2.B(r5, r1)
            if (r5 == 0) goto L59
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L59
        L3b:
            com.tencent.mm.plugin.appbrand.appcache.n9 r1 = new com.tencent.mm.plugin.appbrand.appcache.n9     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            r1.mo9015xbf5d97fd(r5)     // Catch: java.lang.Throwable -> L4d
            r0.add(r1)     // Catch: java.lang.Throwable -> L4d
            boolean r1 = r5.moveToNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto L3b
            goto L59
        L4d:
            r0 = move-exception
            if (r5 == 0) goto L58
            r5.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r5 = move-exception
            r0.addSuppressed(r5)
        L58:
            throw r0
        L59:
            if (r5 == 0) goto L5e
            r5.close()
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa.n(java.lang.String):java.util.List");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b4
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 L(java.lang.String str, int i17, int i18, java.lang.String... strArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String[] strArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9.I;
        for (int i19 = 0; i19 < 3; i19++) {
            sb6.append(strArr2[i19]);
            sb6.append("=? and ");
        }
        sb6.append("1=1");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(i18)) {
            i17 = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = null;
        android.database.Cursor D = this.f157454d.D("AppBrandWxaPkgManifestRecord", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr) ? null : strArr, sb6.toString(), new java.lang.String[]{str, java.lang.String.valueOf(i17), java.lang.String.valueOf(i18)}, null, null, null, 2);
        if (D == null) {
            return null;
        }
        if (D.moveToFirst()) {
            n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
            n9Var.mo9015xbf5d97fd(D);
            n9Var.f67177x28d45f97 = str;
            if (i17 > 0) {
                n9Var.f67185x8987ca93 = i17;
            }
        }
        D.close();
        return n9Var;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 p(java.lang.String str) {
        android.database.Cursor D = this.f157454d.D("AppBrandWxaPkgManifestRecord", null, "pkgPath=?", new java.lang.String[]{str}, null, null, null, 2);
        if (D != null) {
            try {
                if (D.moveToFirst()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
                    n9Var.mo9015xbf5d97fd(D);
                    D.close();
                    return n9Var;
                }
            } catch (java.lang.Throwable th6) {
                if (D != null) {
                    try {
                        D.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        if (D == null) {
            return null;
        }
        D.close();
        return null;
    }

    public java.lang.String q() {
        return this.f157455e.mo145255x88e404c3();
    }

    public boolean r(java.lang.String str, int i17) {
        android.database.Cursor D;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || i17 < 0 || (D = this.f157454d.D("AppBrandWxaPkgManifestRecord", new java.lang.String[]{"version"}, java.lang.String.format(java.util.Locale.US, "%s=? and %s=?", "appId", "debugType"), new java.lang.String[]{str, java.lang.String.valueOf(i17)}, null, null, null, 2)) == null) {
            return false;
        }
        boolean moveToFirst = D.moveToFirst();
        D.close();
        return moveToFirst;
    }

    public boolean s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgStorage", "insertManifest, appId %s, type %d, version %d", n9Var.f67177x28d45f97, java.lang.Integer.valueOf(n9Var.f67180x8ecd6328), java.lang.Integer.valueOf(n9Var.f67185x8987ca93));
        boolean mo880xb970c2b9 = this.f157455e.mo880xb970c2b9(n9Var);
        if (mo880xb970c2b9 && com.p314xaae8f345.mm.vfs.w6.j(n9Var.f67183x55b471cc)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class))).wi(n9Var.f67183x55b471cc);
        }
        return mo880xb970c2b9;
    }

    public boolean t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(n9Var.f67180x8ecd6328)) {
            n9Var.f67185x8987ca93 = 1;
        }
        return ((java.lang.Boolean) u(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ma(this, n9Var))).booleanValue();
    }

    public final synchronized java.lang.Object u(yz5.a aVar) {
        long F = this.f157454d.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        try {
        } finally {
            this.f157454d.w(java.lang.Long.valueOf(F));
        }
        return aVar.mo152xb9724478();
    }

    public java.util.List v(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return java.util.Collections.emptyList();
        }
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "%s like ? and %s=?", "appId", "debugType");
        try {
            android.database.Cursor D = this.f157454d.D("AppBrandWxaPkgManifestRecord", null, format, new java.lang.String[]{str + "%%", java.lang.String.valueOf(i17)}, null, null, null, 2);
            if (D != null) {
                try {
                    if (!D.isClosed() && D.moveToFirst()) {
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        do {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
                            n9Var.mo9015xbf5d97fd(D);
                            if (!n9Var.f67177x28d45f97.endsWith(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33451xb78d0379)) {
                                linkedList.add(n9Var);
                            }
                        } while (D.moveToNext());
                        D.close();
                        return linkedList;
                    }
                } finally {
                }
            }
            java.util.List emptyList = java.util.Collections.emptyList();
            if (D != null) {
                D.close();
            }
            return emptyList;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWxaPkgStorage", "selectAllIncludingModules_keyBy_appId_versionType(%s, %d), get exception:%s", str, java.lang.Integer.valueOf(i17), th6);
            return java.util.Collections.emptyList();
        }
    }

    public java.util.List w(java.lang.String str, int i17, int i18) {
        if (android.text.TextUtils.isEmpty(str)) {
            return java.util.Collections.emptyList();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(i17)) {
            i18 = 1;
        }
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "%s like ? AND %s != ? AND %s=? ", "appId", "appId", "debugType");
        java.lang.String[] strArr = {str + "%%", str + "$__PLUGINCODE__", java.lang.String.valueOf(i17)};
        if (i18 > 0) {
            format = format + " AND version = " + i18;
        }
        android.database.Cursor D = this.f157454d.D("AppBrandWxaPkgManifestRecord", null, format, strArr, null, null, null, 2);
        if (D != null) {
            try {
                if (D.moveToFirst()) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    do {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
                        n9Var.mo9015xbf5d97fd(D);
                        if (u46.l.c(n9Var.f67177x28d45f97, str) || u46.l.a(n9Var.f67177x28d45f97, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8)) {
                            linkedList.addLast(n9Var);
                        }
                    } while (D.moveToNext());
                    D.close();
                    return linkedList;
                }
            } catch (java.lang.Throwable th6) {
                if (D != null) {
                    try {
                        D.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        if (D != null) {
            D.close();
        }
        return java.util.Collections.emptyList();
    }

    public java.util.List x(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return java.util.Collections.emptyList();
        }
        android.database.Cursor D = this.f157454d.D("AppBrandWxaPkgManifestRecord", null, java.lang.String.format(java.util.Locale.ENGLISH, "%s like ? AND %s != ? AND %s=? AND %s=?", "appId", "appId", "debugType", "version"), new java.lang.String[]{str + "%%", str + "$__PLUGINCODE__", java.lang.String.valueOf(0), java.lang.String.valueOf(i17)}, null, null, null, 2);
        if (D != null) {
            try {
                if (D.moveToFirst()) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    do {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
                        n9Var.mo9015xbf5d97fd(D);
                        linkedList.addLast(n9Var);
                    } while (D.moveToNext());
                    D.close();
                    return linkedList;
                }
            } catch (java.lang.Throwable th6) {
                if (D != null) {
                    try {
                        D.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
        if (D != null) {
            D.close();
        }
        return java.util.Collections.emptyList();
    }

    public java.util.List y(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.oa oaVar, java.lang.String... strArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return java.util.Collections.emptyList();
        }
        android.database.Cursor D = this.f157454d.D("AppBrandWxaPkgManifestRecord", strArr, java.lang.String.format(java.util.Locale.US, "%s=? and %s=? ", "appId", "debugType"), new java.lang.String[]{str, java.lang.String.valueOf(i17)}, null, null, "version " + oaVar.name(), 2);
        if (D == null) {
            return java.util.Collections.emptyList();
        }
        if (!D.moveToFirst()) {
            D.close();
            return java.util.Collections.emptyList();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        do {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
            n9Var.mo9015xbf5d97fd(D);
            n9Var.f67177x28d45f97 = str;
            n9Var.f67180x8ecd6328 = i17;
            linkedList.add(n9Var);
        } while (D.moveToNext());
        D.close();
        return linkedList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b4
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 f0(java.lang.String str, int i17, java.lang.String... strArr) {
        java.lang.String format;
        java.lang.String[] strArr2;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i17)) {
            format = java.lang.String.format(java.util.Locale.US, "%s=? and %s=?", "appId", "debugType");
            strArr2 = new java.lang.String[]{str, java.lang.String.valueOf(i17)};
            str2 = "version desc";
        } else {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(i17)) {
                throw new java.lang.RuntimeException("Illegal pkgType " + i17);
            }
            format = java.lang.String.format(java.util.Locale.US, "%s=? and %s=? and %s=?", "appId", "debugType", "version");
            strArr2 = new java.lang.String[]{str, java.lang.String.valueOf(i17), "1"};
            str2 = "createTime desc";
        }
        android.database.Cursor E = this.f157454d.E("AppBrandWxaPkgManifestRecord", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr) ? null : strArr, format, strArr2, null, null, str2);
        if (E == null) {
            return null;
        }
        if (E.moveToFirst()) {
            n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
            n9Var.mo9015xbf5d97fd(E);
            n9Var.f67177x28d45f97 = str;
            n9Var.f67180x8ecd6328 = i17;
        }
        E.close();
        return n9Var;
    }
}
