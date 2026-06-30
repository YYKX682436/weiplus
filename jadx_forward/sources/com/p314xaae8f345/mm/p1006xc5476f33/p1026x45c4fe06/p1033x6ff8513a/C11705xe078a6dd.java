package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager */
/* loaded from: classes7.dex */
public final class C11705xe078a6dd {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.t6 f157660e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j2();

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 f157661f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11705xe078a6dd.a();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f157662a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f157663b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f157664c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Collection f157665d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$a */
    /* loaded from: classes7.dex */
    public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 {
        /* renamed from: toString */
        public java.lang.String m49642x9616526c() {
            return "AppBrandLocalMediaObject::Nil";
        }
    }

    public C11705xe078a6dd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f157662a = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)).o() + "/";
        this.f157663b = str2;
        this.f157664c = str3;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n2(this, null));
        this.f157665d = java.util.Collections.unmodifiableCollection(linkedList);
    }

    public static java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11705xe078a6dd c11705xe078a6dd, java.lang.String str, java.lang.String str2) {
        c11705xe078a6dd.getClass();
        byte[] b17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e5().b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str), str2.getBytes());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return new java.lang.String(b17);
    }

    public static long b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11705xe078a6dd c11705xe078a6dd, java.lang.String str) {
        c11705xe078a6dd.getClass();
        java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(str);
        java.util.zip.CheckedInputStream checkedInputStream = new java.util.zip.CheckedInputStream(E, new java.util.zip.Adler32());
        do {
        } while (checkedInputStream.read(new byte[2048]) >= 0);
        long value = checkedInputStream.getChecksum().getValue();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(checkedInputStream);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(E);
        return value;
    }

    public static boolean g(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, boolean z17) {
        return (!z17 || r6Var.m()) && !r6Var.y() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6Var.m82467xfb82e301()) && r6Var.m82467xfb82e301().startsWith(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2 A[EDGE_INSN: B:25:0x00e2->B:26:0x00e2 BREAK  A[LOOP:0: B:7:0x001e->B:60:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f A[Catch: Exception -> 0x0169, TryCatch #1 {Exception -> 0x0169, blocks: (B:31:0x00f0, B:33:0x010f, B:36:0x0116, B:38:0x0123, B:43:0x013f, B:45:0x0154, B:48:0x0134), top: B:30:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154 A[Catch: Exception -> 0x0169, TRY_LEAVE, TryCatch #1 {Exception -> 0x0169, blocks: (B:31:0x00f0, B:33:0x010f, B:36:0x0116, B:38:0x0123, B:43:0x013f, B:45:0x0154, B:48:0x0134), top: B:30:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[LOOP:0: B:7:0x001e->B:60:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 c(java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11705xe078a6dd.c(java.lang.String, java.lang.String, boolean):com.tencent.mm.plugin.appbrand.appstorage.i2");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 d(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 i2Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.util.Iterator it = this.f157665d.iterator();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 i2Var2 = null;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11705xe078a6dd c11705xe078a6dd = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n2) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m2) it.next())).f157814a;
            java.lang.String str3 = "";
            try {
                str2 = a(c11705xe078a6dd, str.replaceFirst("store_", "").replaceFirst("tmp_", ""), c11705xe078a6dd.f157663b);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e17, "retrieveMediaObjectByRealFileName, dec exp = ", new java.lang.Object[0]);
                str2 = null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                i2Var2 = null;
            } else {
                java.lang.String[] split = str2.split("\\|");
                if (split == null || split.length != 2) {
                    i2Var = null;
                } else {
                    java.lang.String str4 = split[1];
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(c11705xe078a6dd.f157664c);
                    sb6.append(str);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                        str3 = "." + str4;
                    }
                    sb6.append(str3);
                    java.lang.String sb7 = sb6.toString();
                    i2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2();
                    i2Var.f157732d = sb7;
                    i2Var.f157733e = c11705xe078a6dd.f() + str;
                    i2Var.f157734f = str.startsWith("store_");
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(i2Var.f157733e);
                    i2Var.f157736h = r6Var.B();
                    i2Var.f157735g = r6Var.C();
                }
                i2Var2 = i2Var;
            }
            if (i2Var2 != null) {
                break;
            }
        }
        return i2Var2;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 i2Var;
        java.lang.String str2;
        java.lang.String[] split;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String str3 = this.f157664c;
            if (str.startsWith(str3)) {
                java.lang.String substring = str.substring(str3.length());
                java.util.Iterator it = this.f157665d.iterator();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 i2Var2 = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    i2Var = f157661f;
                    if (!hasNext) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11705xe078a6dd c11705xe078a6dd = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n2) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m2) it.next())).f157814a;
                    if (substring.startsWith("store_") || substring.startsWith("tmp_")) {
                        java.lang.String c17 = s46.c.c(substring);
                        java.lang.String replaceFirst = substring.replaceFirst("store_", "").replaceFirst("tmp_", "");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                            replaceFirst = replaceFirst.replaceFirst("\\." + c17, "");
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(replaceFirst)) {
                            try {
                                str2 = a(c11705xe078a6dd, replaceFirst, c11705xe078a6dd.f157663b);
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e17, "retrieveMediaObject, decrypt exp ", new java.lang.Object[0]);
                                str2 = null;
                            }
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (split = str2.split("\\|")) != null && split.length == 2) {
                                java.lang.String str4 = substring.startsWith("store_") ? "store_" : "tmp_";
                                java.lang.String str5 = c11705xe078a6dd.f() + str4 + replaceFirst;
                                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[0], 0L);
                                java.lang.String str6 = split[1];
                                if (str6.equalsIgnoreCase(c17)) {
                                    try {
                                        long b17 = b(c11705xe078a6dd, str5);
                                        if (V != b17) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, exactCRC32(%d) != fileCRC32(%d), localId(%s)", java.lang.Long.valueOf(b17), java.lang.Long.valueOf(V), substring);
                                        } else {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 i2Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2();
                                            i2Var3.f157732d = c11705xe078a6dd.f157664c + substring;
                                            i2Var3.f157733e = str5;
                                            q75.g.b(str6);
                                            i2Var3.f157734f = str4.equalsIgnoreCase("store_");
                                            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(i2Var3.f157733e);
                                            i2Var3.f157736h = r6Var.B();
                                            i2Var3.f157735g = r6Var.C();
                                            i2Var2 = i2Var3;
                                        }
                                    } catch (java.io.IOException e18) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, getCRC exp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                                    }
                                }
                            }
                        }
                        i2Var2 = i2Var;
                    } else {
                        i2Var2 = null;
                    }
                    if (i2Var2 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "getItemByLocalId, handled by %s, result = %s", "V2MediaObjectInfoHandler", i2Var2);
                        break;
                    }
                }
                if (i2Var == i2Var2) {
                    return null;
                }
                return i2Var2;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "getItemByLocalId, invalid args, localId(%s)", str);
        return null;
    }

    public final java.lang.String f() {
        com.p314xaae8f345.mm.vfs.z7 a17;
        com.p314xaae8f345.mm.vfs.z7 z7Var;
        java.lang.String str = this.f157662a;
        com.p314xaae8f345.mm.vfs.w6.u(str);
        if (str == null) {
            a17 = null;
        } else {
            try {
                a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            } catch (java.lang.Exception unused) {
            }
        }
        if (a17 == null) {
            z7Var = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l(".nomedia", false, false), null, null);
        } else {
            z7Var = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, com.p314xaae8f345.mm.vfs.e8.l(a17.f294812f + "/.nomedia", false, false), a17.f294813g, a17.f294814h);
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
        if (!m17.a()) {
            throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + z7Var);
        }
        com.p314xaae8f345.mm.vfs.q2 q2Var = m17.f294799a;
        java.lang.String str2 = m17.f294800b;
        if (!q2Var.F(str2)) {
            q2Var.c(str2, false).close();
        }
        return str;
    }

    /* renamed from: genMediaFilePath */
    public java.lang.String m49641x6a716255(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return f() + str;
    }

    public boolean h(com.p314xaae8f345.mm.vfs.r6 r6Var, boolean z17) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(f());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        return a17.m82497xb2c87fbf(new com.p314xaae8f345.mm.vfs.r6(r6Var.r()).f294699d) && g(r6Var, "store_", z17);
    }

    public java.util.List i() {
        com.p314xaae8f345.mm.vfs.r6[] j17 = j();
        if (j17 == null || j17.length <= 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (com.p314xaae8f345.mm.vfs.r6 r6Var : j17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 d17 = d(r6Var.m82467xfb82e301());
            if (d17 != null) {
                linkedList.add(d17);
            }
        }
        return linkedList;
    }

    public com.p314xaae8f345.mm.vfs.r6[] j() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(f());
        if (r6Var.m() && r6Var.y()) {
            return r6Var.H(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k2(this));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[EDGE_INSN: B:21:0x0096->B:22:0x0096 BREAK  A[LOOP:0: B:2:0x0008->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:2:0x0008->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i2 r13) {
        /*
            r12 = this;
            java.util.Collection r0 = r12.f157665d
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L96
            java.lang.Object r2 = r0.next()
            com.tencent.mm.plugin.appbrand.appstorage.m2 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m2) r2
            com.tencent.mm.plugin.appbrand.appstorage.n2 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n2) r2
            r2.getClass()
            if (r13 != 0) goto L1d
            goto L93
        L1d:
            java.lang.String r2 = r13.f157733e
            java.lang.String r3 = "tmp_"
            java.lang.String r4 = "store_"
            java.lang.String r2 = r2.replaceFirst(r3, r4)
            java.lang.String r5 = r13.f157733e
            android.util.Pair r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i1.a(r5, r2)
            java.lang.Object r5 = r5.first
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L93
            com.tencent.mm.plugin.appbrand.appstorage.i2 r5 = new com.tencent.mm.plugin.appbrand.appstorage.i2
            r5.<init>()
            r5.f157733e = r2
            java.lang.String r2 = r13.f157732d
            java.lang.String r2 = r2.replaceFirst(r3, r4)
            r5.f157732d = r2
            long r2 = r13.f157735g
            r5.f157735g = r2
            java.lang.String r2 = r5.f157733e
            com.tencent.mm.vfs.z7 r2 = com.p314xaae8f345.mm.vfs.z7.a(r2)
            java.lang.String r3 = r2.f294812f
            if (r3 == 0) goto L70
            r4 = 0
            java.lang.String r9 = com.p314xaae8f345.mm.vfs.e8.l(r3, r4, r4)
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L70
            com.tencent.mm.vfs.z7 r3 = new com.tencent.mm.vfs.z7
            java.lang.String r7 = r2.f294810d
            java.lang.String r8 = r2.f294811e
            java.lang.String r10 = r2.f294813g
            java.lang.String r11 = r2.f294814h
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r2 = r3
        L70:
            com.tencent.mm.vfs.b3 r3 = com.p314xaae8f345.mm.vfs.a3.f294314a
            com.tencent.mm.vfs.z2 r2 = r3.m(r2, r1)
            boolean r3 = r2.a()
            if (r3 != 0) goto L7d
            goto L87
        L7d:
            com.tencent.mm.vfs.q2 r3 = r2.f294799a
            java.lang.String r2 = r2.f294800b
            com.tencent.mm.vfs.x1 r2 = r3.m(r2)
            if (r2 != 0) goto L8a
        L87:
            r2 = 0
            goto L8c
        L8a:
            long r2 = r2.f294768e
        L8c:
            r5.f157736h = r2
            r2 = 1
            r5.f157734f = r2
            r2 = r5
            goto L94
        L93:
            r2 = r1
        L94:
            if (r2 == 0) goto L8
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11705xe078a6dd.k(com.tencent.mm.plugin.appbrand.appstorage.i2):com.tencent.mm.plugin.appbrand.appstorage.i2");
    }
}
