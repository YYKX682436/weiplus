package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class w2 extends l75.s0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f76615f = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.appusage.t2.f76568w, "AppBrandStarApp")};

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appusage.u2 f76616g = new com.tencent.mm.plugin.appbrand.appusage.r2();

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appusage.u2 f76617h = new com.tencent.mm.plugin.appbrand.appusage.s2();

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f76618d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appusage.v2 f76619e;

    public w2(l75.k0 k0Var) {
        this.f76618d = k0Var;
        this.f76619e = new com.tencent.mm.plugin.appbrand.appusage.v2(k0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D0(java.lang.String r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.tencent.mm.plugin.appbrand.appusage.t2 r0 = new com.tencent.mm.plugin.appbrand.appusage.t2
            r0.<init>()
            r0.field_username = r7
            r0.field_versionType = r8
            java.lang.String r2 = "versionType"
            java.lang.String r3 = "username"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            com.tencent.mm.plugin.appbrand.appusage.v2 r3 = r6.f76619e
            boolean r2 = r3.get(r0, r2)
            r4 = 1
            if (r2 == 0) goto L38
            java.lang.String[] r2 = com.tencent.mm.plugin.appbrand.appusage.t2.f76567v
            r3.delete(r0, r1, r2)
            boolean r2 = r6.z0(r7, r8)
            if (r2 != 0) goto L36
            java.lang.String r2 = "single"
            r3 = 5
            r6.doNotify(r2, r3, r0)
            goto L38
        L36:
            r0 = r1
            goto L39
        L38:
            r0 = r4
        L39:
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L62
            if (r9 == 0) goto L62
            r45.id6 r9 = new r45.id6
            r9.<init>()
            r9.f376955d = r7
            r9.f376956e = r8
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.l> r8 = com.tencent.mm.plugin.appbrand.appusage.l.class
            i95.m r8 = i95.n0.c(r8)
            com.tencent.mm.plugin.appbrand.appusage.l r8 = (com.tencent.mm.plugin.appbrand.appusage.l) r8
            r45.jd6 r5 = new r45.jd6
            r5.<init>()
            r5.f377726d = r9
            r5.f377730h = r3
            r5.f377727e = r2
            r5.f377728f = r2
            com.tencent.mm.plugin.appbrand.appusage.l3 r9 = com.tencent.mm.plugin.appbrand.appusage.l3.f76508i
            r8.Bi(r5, r9)
        L62:
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.f6> r8 = com.tencent.mm.plugin.appbrand.service.f6.class
            i95.m r8 = i95.n0.c(r8)
            com.tencent.mm.plugin.appbrand.service.f6 r8 = (com.tencent.mm.plugin.appbrand.service.f6) r8
            k91.g4 r8 = (k91.g4) r8
            k91.v5 r7 = r8.Bi(r7)
            if (r7 == 0) goto La3
            java.lang.String r8 = r7.field_appId
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.K0(r8)
            if (r8 != 0) goto La3
            k91.v r8 = com.tencent.mm.plugin.appbrand.app.r9.Ui()
            java.lang.String r9 = r7.field_appId
            java.lang.String r9 = k91.o1.a(r9)
            java.lang.String r5 = "true"
            java.lang.String r8 = r8.z0(r9, r5)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto La3
            k91.v r8 = com.tencent.mm.plugin.appbrand.app.r9.Ui()
            java.lang.String r7 = r7.field_appId
            java.lang.String r7 = k91.o1.a(r7)
            r8.d(r7)
            goto Lbe
        La3:
            java.lang.Object[] r8 = new java.lang.Object[r3]
            if (r7 != 0) goto La9
            r9 = r4
            goto Laa
        La9:
            r9 = r1
        Laa:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8[r1] = r9
            if (r7 != 0) goto Lb3
            goto Lb5
        Lb3:
            java.lang.String r2 = r7.field_appId
        Lb5:
            r8[r4] = r2
            java.lang.String r7 = "MicroMsg.AppBrandStarAppStorage"
            java.lang.String r9 = "restore receive status fail, attributes is null: %b, appId: %s"
            com.tencent.mars.xlog.Log.e(r7, r9, r8)
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appusage.w2.D0(java.lang.String, int, boolean):boolean");
    }

    @Override // l75.s0, l75.l0
    public void add(l75.q0 q0Var) {
        add("MicroMsg.AppBrandStarAppStorage.WORKER", q0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (r15 != null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01df A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132 A[Catch: SQLiteException -> 0x0138, SQLiteException | SQLiteException -> 0x013a, TRY_LEAVE, TryCatch #7 {SQLiteException | SQLiteException -> 0x013a, blocks: (B:56:0x00f1, B:60:0x0132, B:82:0x012d, B:81:0x012a), top: B:55:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m0(java.lang.String r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appusage.w2.m0(java.lang.String, int, boolean):int");
    }

    public void n0(java.lang.Class cls, java.util.List list, java.lang.Long l17) {
        com.tencent.mm.plugin.appbrand.appusage.u2 u2Var;
        if (cls == r45.pc7.class) {
            u2Var = f76616g;
        } else {
            if (cls != com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo.class) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                return;
            }
            u2Var = f76617h;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = this.f76618d;
        long F = k0Var.F(valueOf);
        k0Var.delete("AppBrandStarApp", "", null);
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            java.util.List x07 = list != null ? kz5.n0.x0(list) : null;
            com.tencent.mm.plugin.appbrand.appusage.t2 t2Var = new com.tencent.mm.plugin.appbrand.appusage.t2();
            int i17 = 0;
            for (java.lang.Object obj : x07) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(u2Var.d(obj))) {
                    t2Var.field_username = u2Var.d(obj);
                    t2Var.field_versionType = u2Var.c(obj);
                    t2Var.field_updateTime = u2Var.a(obj);
                    i17++;
                    t2Var.field_orderSequence = i17 * com.tencent.mm.plugin.appbrand.appusage.x2.h() * 2;
                    java.lang.String b17 = u2Var.b(obj);
                    t2Var.field_appPath = b17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandStarAppStorage", "record.field_username:%s, field_appPath:%s", t2Var.field_username, b17);
                    k0Var.l("AppBrandStarApp", null, t2Var.convertTo());
                }
            }
        }
        k0Var.w(java.lang.Long.valueOf(F));
        doNotify("batch", 3, l17);
    }

    public int s0() {
        android.database.Cursor B = this.f76618d.B("select count(*) from AppBrandStarApp", null);
        if (B != null && !B.isClosed()) {
            r1 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
        }
        return r1;
    }

    public java.util.ArrayList u0(int i17, com.tencent.mm.plugin.appbrand.appusage.y5 y5Var) {
        return y0(i17, y5Var, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f9, code lost:
    
        if (r5.moveToFirst() != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList y0(int r23, com.tencent.mm.plugin.appbrand.appusage.y5 r24, int r25) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appusage.w2.y0(int, com.tencent.mm.plugin.appbrand.appusage.y5, int):java.util.ArrayList");
    }

    public boolean z0(java.lang.String str, int i17) {
        android.database.Cursor E = com.tencent.mm.sdk.platformtools.t8.K0(str) ? null : this.f76618d.E("AppBrandStarApp", null, java.lang.String.format(java.util.Locale.US, "%s=? and %s=?", dm.i4.COL_USERNAME, "versionType"), new java.lang.String[]{str, java.lang.String.valueOf(i17)}, null, null, null);
        if (E == null) {
            return false;
        }
        boolean moveToFirst = E.moveToFirst();
        E.close();
        return moveToFirst;
    }
}
