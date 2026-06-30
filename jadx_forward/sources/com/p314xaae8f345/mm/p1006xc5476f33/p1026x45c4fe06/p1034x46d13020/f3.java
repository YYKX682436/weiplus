package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class f3 extends l75.s0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f157965g = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c3.B, "AppBrandLauncherLayoutItem")};

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d3 f157966d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f157967e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e3 f157968f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e3(this, null);

    public f3(l75.k0 k0Var) {
        this.f157967e = k0Var;
        this.f157966d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d3(k0Var);
    }

    public static java.util.ArrayList L0(android.database.Cursor cursor) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 b17;
        try {
            if (cursor == null) {
                return new java.util.ArrayList();
            }
            try {
                if (cursor.moveToFirst()) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c3 c3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c3();
                    do {
                        c3Var.mo9015xbf5d97fd(cursor);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c3Var.f65826x7cc83cbd) && (b17 = k91.k4.b(java.lang.String.valueOf(c3Var.f65827xee1faef1), c3Var.f65826x7cc83cbd, c3Var.f65832x94d24c6d, c3Var.f65830xa783a79b, c3Var.f65831x73e938c3, c3Var.f65829x773b0858)) != null) {
                            b17.f157899i = c3Var.f65825x453e07a1;
                            linkedList.add(b17);
                        }
                    } while (cursor.moveToNext());
                    arrayList = new java.util.ArrayList(linkedList.size());
                    arrayList.addAll(linkedList);
                } else {
                    arrayList = new java.util.ArrayList();
                }
                return arrayList;
            } catch (android.database.sqlite.SQLiteDiskIOException | com.p314xaae8f345.p3121x37984a.C26877xc3b63269 | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26957x1fbb1a40 e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandUsageStorage", "obtainHistoryList e=%s", e17);
                return new java.util.ArrayList(0);
            }
        } finally {
            cursor.close();
        }
    }

    public static int u0(java.lang.String str, int i17, int i18) {
        return java.lang.String.format(java.util.Locale.US, "%s|%d|%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)).hashCode();
    }

    public boolean D0(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        android.database.Cursor f17 = this.f157967e.f(java.lang.String.format("select count(*) from %s where %s=?", "AppBrandLauncherLayoutItem", "recordId"), new java.lang.String[]{java.lang.String.valueOf(u0(str, i17, 2))}, 2);
        if (f17 == null || f17.isClosed()) {
            return false;
        }
        try {
            if (f17.moveToFirst()) {
                return f17.getInt(0) > 0;
            }
            return false;
        } finally {
            f17.close();
        }
    }

    public final boolean J0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c3 c3Var) {
        if (c3Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c3Var.f65826x7cc83cbd)) {
            return false;
        }
        long l17 = this.f157967e.l("AppBrandLauncherLayoutItem", "", c3Var.mo9763xeb27878e());
        return l17 > 0 || l17 == ((long) c3Var.f65827xee1faef1);
    }

    public boolean P0(java.lang.String str, int i17) {
        return W0(str, i17, 1);
    }

    public boolean W0(java.lang.String str, int i17, int i18) {
        boolean z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            z17 = false;
        } else {
            boolean z18 = this.f157967e.mo70514xb06685ab("AppBrandLauncherLayoutItem", java.lang.String.format(java.util.Locale.US, "%s=?", "recordId"), new java.lang.String[]{java.lang.String.valueOf(u0(str, i17, 2))}) > 0;
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.h1) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.h1.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.g1 g1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.g1.USAGE_LIST;
                h1Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocalUsageStorage", "removeUsage, username %s, type %d, scene %s", str, java.lang.Integer.valueOf(i17), g1Var);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f1 f1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f1();
                    f1Var.f65955xdec927b = str;
                    f1Var.f65956x94d24c6d = i17;
                    if (h1Var.mo49766xb06685ab(f1Var, false, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f1.f157962r)) {
                        h1Var.mo142179xf35bbb4("single", 5, null);
                    }
                }
            }
            z17 = z18;
        }
        if (z17) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.n3(1001, false, i17, 2, 2, str, i18, null).l();
            mo142179xf35bbb4("single", 5, java.lang.String.valueOf(u0(str, i17, 2)));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z2.class)).D0(str, i17);
        }
        return z17;
    }

    @Override // l75.s0, l75.l0
    public void add(l75.q0 q0Var) {
        add("MicroMsg.AppBrandUsageStorage.WORKER", q0Var);
    }

    public android.database.Cursor b1(java.lang.String[] strArr, int i17, int i18, int i19) {
        java.lang.String format;
        java.lang.String[] strArr2;
        if (i19 == Integer.MAX_VALUE) {
            format = java.lang.String.format(java.util.Locale.US, "%s=? order by %s desc limit %d offset %d", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, dm.i4.f66874x4c6b1f55, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            strArr2 = new java.lang.String[]{java.lang.String.valueOf(2)};
        } else {
            format = java.lang.String.format(java.util.Locale.US, "%s=? and %s=? order by %s desc limit %d offset %d", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "versionType", dm.i4.f66874x4c6b1f55, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            strArr2 = new java.lang.String[]{java.lang.String.valueOf(2), java.lang.String.valueOf(i19)};
        }
        return this.f157967e.E("AppBrandLauncherLayoutItem", strArr, format, strArr2, null, null, null);
    }

    public boolean m0(java.lang.String str, int i17, boolean z17, int i18, int i19, java.lang.String str2, boolean z18) {
        boolean n07 = n0(str, i17, 2, true, z17, i18, i19, str2);
        if (n07) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r0.f(true, !z18, str2);
        }
        return n07;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a8, code lost:
    
        if (r4.moveToFirst() != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01aa, code lost:
    
        r5.add(java.lang.String.valueOf(r4.getInt(0)));
        r7.add(r4.getString(1));
        r3.add(java.lang.Integer.valueOf(r4.getInt(2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01cb, code lost:
    
        if (r4.moveToNext() != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cd, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d4, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r5) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d8, code lost:
    
        r2 = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        r4 = r19.f157967e;
        r8 = r4.F(r2);
        r2 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f2, code lost:
    
        if (r2.hasNext() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f4, code lost:
    
        r4.mo70514xb06685ab("AppBrandLauncherLayoutItem", java.lang.String.format(java.util.Locale.US, "%s=?", "recordId"), new java.lang.String[]{(java.lang.String) r2.next()});
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0212, code lost:
    
        r4.w(java.lang.Long.valueOf(r8));
        r2 = new java.util.ArrayList(r7.size());
        r4 = new java.util.ArrayList(r7.size());
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0230, code lost:
    
        if (r13 >= r7.size()) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0232, code lost:
    
        r6 = k91.k4.e((java.lang.String) r7.get(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0240, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0243, code lost:
    
        r2.add(r6);
        r4.add((java.lang.Integer) r3.get(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x024f, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0256, code lost:
    
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0258, code lost:
    
        r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0263, code lost:
    
        if (r2.size() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0269, code lost:
    
        if (r4.size() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0273, code lost:
    
        if (r2.size() == r4.size()) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0276, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxaPkgStorage", "batchDeleteAppPkg, size %d", java.lang.Integer.valueOf(r2.size()));
        r3.u(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.na(r3, r2, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0291, code lost:
    
        mo142179xf35bbb4("batch", 5, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n0(java.lang.String r20, int r21, int r22, boolean r23, boolean r24, int r25, int r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f3.n0(java.lang.String, int, int, boolean, boolean, int, int, java.lang.String):boolean");
    }

    public boolean s0(java.lang.String str, int i17) {
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.database.Cursor B = this.f157967e.B(java.lang.String.format(java.util.Locale.US, "select count(*) from %s where %s=? and %s=? and %s=?", "AppBrandLauncherLayoutItem", "brandId", "versionType", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), new java.lang.String[]{str, java.lang.String.valueOf(i17), java.lang.String.valueOf(2)});
            if (B != null) {
                if (B.moveToFirst() && B.getInt(0) > 0) {
                    z17 = true;
                }
                B.close();
            }
        }
        return z17;
    }

    public int y0() {
        android.database.Cursor B = this.f157967e.B(java.lang.String.format(java.util.Locale.US, "select count(*) from %s where %s=?", "AppBrandLauncherLayoutItem", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), new java.lang.String[]{java.lang.String.valueOf(2)});
        if (B != null) {
            r1 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
        }
        return r1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r11.moveToNext() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r11.moveToFirst() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        r0.add("" + r11.getInt(r11.getColumnIndex("recordId")));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List z0(java.lang.String r11) {
        /*
            r10 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r11)
            if (r1 != 0) goto L61
            l75.k0 r2 = r10.f157967e
            java.lang.String r3 = "AppBrandLauncherLayoutItem"
            java.lang.String r1 = "recordId"
            java.lang.String[] r4 = new java.lang.String[]{r1}
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r6 = "scene"
            java.lang.String r7 = "brandId"
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r7 = "%s=? and %s=?"
            java.lang.String r5 = java.lang.String.format(r5, r7, r6)
            r6 = 2
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String[] r6 = new java.lang.String[]{r6, r11}
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.E(r3, r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L39
            r11 = 0
            return r11
        L39:
            boolean r2 = r11.moveToFirst()
            if (r2 == 0) goto L5e
        L3f:
            int r2 = r11.getColumnIndex(r1)
            int r2 = r11.getInt(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ""
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.add(r2)
            boolean r2 = r11.moveToNext()
            if (r2 != 0) goto L3f
        L5e:
            r11.close()
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f3.z0(java.lang.String):java.util.List");
    }
}
