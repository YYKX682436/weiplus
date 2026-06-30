package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class LuggageLocalFileObjectManager {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.vfs.t6 f76127e = new com.tencent.mm.plugin.appbrand.appstorage.j2();

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appstorage.i2 f76128f = new com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.a();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f76129a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f76130b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f76131c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Collection f76132d;

    /* loaded from: classes7.dex */
    public class a extends com.tencent.mm.plugin.appbrand.appstorage.i2 {
        public java.lang.String toString() {
            return "AppBrandLocalMediaObject::Nil";
        }
    }

    public LuggageLocalFileObjectManager(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f76129a = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)).o() + "/";
        this.f76130b = str2;
        this.f76131c = str3;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new com.tencent.mm.plugin.appbrand.appstorage.n2(this, null));
        this.f76132d = java.util.Collections.unmodifiableCollection(linkedList);
    }

    public static java.lang.String a(com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager luggageLocalFileObjectManager, java.lang.String str, java.lang.String str2) {
        luggageLocalFileObjectManager.getClass();
        byte[] b17 = new com.tencent.mm.plugin.appbrand.utils.e5().b(com.tencent.mm.sdk.platformtools.t8.h(str), str2.getBytes());
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return new java.lang.String(b17);
    }

    public static long b(com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager luggageLocalFileObjectManager, java.lang.String str) {
        luggageLocalFileObjectManager.getClass();
        java.io.InputStream E = com.tencent.mm.vfs.w6.E(str);
        java.util.zip.CheckedInputStream checkedInputStream = new java.util.zip.CheckedInputStream(E, new java.util.zip.Adler32());
        do {
        } while (checkedInputStream.read(new byte[2048]) >= 0);
        long value = checkedInputStream.getChecksum().getValue();
        com.tencent.mm.sdk.platformtools.t8.v1(checkedInputStream);
        com.tencent.mm.sdk.platformtools.t8.v1(E);
        return value;
    }

    public static boolean g(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17) {
        return (!z17 || r6Var.m()) && !r6Var.y() && !com.tencent.mm.sdk.platformtools.t8.K0(r6Var.getName()) && r6Var.getName().startsWith(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2 A[EDGE_INSN: B:25:0x00e2->B:26:0x00e2 BREAK  A[LOOP:0: B:7:0x001e->B:60:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f A[Catch: Exception -> 0x0169, TryCatch #1 {Exception -> 0x0169, blocks: (B:31:0x00f0, B:33:0x010f, B:36:0x0116, B:38:0x0123, B:43:0x013f, B:45:0x0154, B:48:0x0134), top: B:30:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154 A[Catch: Exception -> 0x0169, TRY_LEAVE, TryCatch #1 {Exception -> 0x0169, blocks: (B:31:0x00f0, B:33:0x010f, B:36:0x0116, B:38:0x0123, B:43:0x013f, B:45:0x0154, B:48:0x0134), top: B:30:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[LOOP:0: B:7:0x001e->B:60:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.appbrand.appstorage.i2 c(java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.c(java.lang.String, java.lang.String, boolean):com.tencent.mm.plugin.appbrand.appstorage.i2");
    }

    public com.tencent.mm.plugin.appbrand.appstorage.i2 d(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.appstorage.i2 i2Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.Iterator it = this.f76132d.iterator();
        com.tencent.mm.plugin.appbrand.appstorage.i2 i2Var2 = null;
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager luggageLocalFileObjectManager = ((com.tencent.mm.plugin.appbrand.appstorage.n2) ((com.tencent.mm.plugin.appbrand.appstorage.m2) it.next())).f76281a;
            java.lang.String str3 = "";
            try {
                str2 = a(luggageLocalFileObjectManager, str.replaceFirst("store_", "").replaceFirst("tmp_", ""), luggageLocalFileObjectManager.f76130b);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e17, "retrieveMediaObjectByRealFileName, dec exp = ", new java.lang.Object[0]);
                str2 = null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                i2Var2 = null;
            } else {
                java.lang.String[] split = str2.split("\\|");
                if (split == null || split.length != 2) {
                    i2Var = null;
                } else {
                    java.lang.String str4 = split[1];
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(luggageLocalFileObjectManager.f76131c);
                    sb6.append(str);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        str3 = "." + str4;
                    }
                    sb6.append(str3);
                    java.lang.String sb7 = sb6.toString();
                    i2Var = new com.tencent.mm.plugin.appbrand.appstorage.i2();
                    i2Var.f76199d = sb7;
                    i2Var.f76200e = luggageLocalFileObjectManager.f() + str;
                    i2Var.f76201f = str.startsWith("store_");
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(i2Var.f76200e);
                    i2Var.f76203h = r6Var.B();
                    i2Var.f76202g = r6Var.C();
                }
                i2Var2 = i2Var;
            }
            if (i2Var2 != null) {
                break;
            }
        }
        return i2Var2;
    }

    public com.tencent.mm.plugin.appbrand.appstorage.i2 e(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.i2 i2Var;
        java.lang.String str2;
        java.lang.String[] split;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String str3 = this.f76131c;
            if (str.startsWith(str3)) {
                java.lang.String substring = str.substring(str3.length());
                java.util.Iterator it = this.f76132d.iterator();
                com.tencent.mm.plugin.appbrand.appstorage.i2 i2Var2 = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    i2Var = f76128f;
                    if (!hasNext) {
                        break;
                    }
                    com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager luggageLocalFileObjectManager = ((com.tencent.mm.plugin.appbrand.appstorage.n2) ((com.tencent.mm.plugin.appbrand.appstorage.m2) it.next())).f76281a;
                    if (substring.startsWith("store_") || substring.startsWith("tmp_")) {
                        java.lang.String c17 = s46.c.c(substring);
                        java.lang.String replaceFirst = substring.replaceFirst("store_", "").replaceFirst("tmp_", "");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                            replaceFirst = replaceFirst.replaceFirst("\\." + c17, "");
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(replaceFirst)) {
                            try {
                                str2 = a(luggageLocalFileObjectManager, replaceFirst, luggageLocalFileObjectManager.f76130b);
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e17, "retrieveMediaObject, decrypt exp ", new java.lang.Object[0]);
                                str2 = null;
                            }
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (split = str2.split("\\|")) != null && split.length == 2) {
                                java.lang.String str4 = substring.startsWith("store_") ? "store_" : "tmp_";
                                java.lang.String str5 = luggageLocalFileObjectManager.f() + str4 + replaceFirst;
                                long V = com.tencent.mm.sdk.platformtools.t8.V(split[0], 0L);
                                java.lang.String str6 = split[1];
                                if (str6.equalsIgnoreCase(c17)) {
                                    try {
                                        long b17 = b(luggageLocalFileObjectManager, str5);
                                        if (V != b17) {
                                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, exactCRC32(%d) != fileCRC32(%d), localId(%s)", java.lang.Long.valueOf(b17), java.lang.Long.valueOf(V), substring);
                                        } else {
                                            com.tencent.mm.plugin.appbrand.appstorage.i2 i2Var3 = new com.tencent.mm.plugin.appbrand.appstorage.i2();
                                            i2Var3.f76199d = luggageLocalFileObjectManager.f76131c + substring;
                                            i2Var3.f76200e = str5;
                                            q75.g.b(str6);
                                            i2Var3.f76201f = str4.equalsIgnoreCase("store_");
                                            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(i2Var3.f76200e);
                                            i2Var3.f76203h = r6Var.B();
                                            i2Var3.f76202g = r6Var.C();
                                            i2Var2 = i2Var3;
                                        }
                                    } catch (java.io.IOException e18) {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, getCRC exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                                    }
                                }
                            }
                        }
                        i2Var2 = i2Var;
                    } else {
                        i2Var2 = null;
                    }
                    if (i2Var2 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "getItemByLocalId, handled by %s, result = %s", "V2MediaObjectInfoHandler", i2Var2);
                        break;
                    }
                }
                if (i2Var == i2Var2) {
                    return null;
                }
                return i2Var2;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "getItemByLocalId, invalid args, localId(%s)", str);
        return null;
    }

    public final java.lang.String f() {
        com.tencent.mm.vfs.z7 a17;
        com.tencent.mm.vfs.z7 z7Var;
        java.lang.String str = this.f76129a;
        com.tencent.mm.vfs.w6.u(str);
        if (str == null) {
            a17 = null;
        } else {
            try {
                a17 = com.tencent.mm.vfs.z7.a(str);
            } catch (java.lang.Exception unused) {
            }
        }
        if (a17 == null) {
            z7Var = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l(".nomedia", false, false), null, null);
        } else {
            z7Var = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, com.tencent.mm.vfs.e8.l(a17.f213279f + "/.nomedia", false, false), a17.f213280g, a17.f213281h);
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
        if (!m17.a()) {
            throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + z7Var);
        }
        com.tencent.mm.vfs.q2 q2Var = m17.f213266a;
        java.lang.String str2 = m17.f213267b;
        if (!q2Var.F(str2)) {
            q2Var.c(str2, false).close();
        }
        return str;
    }

    public java.lang.String genMediaFilePath(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return f() + str;
    }

    public boolean h(com.tencent.mm.vfs.r6 r6Var, boolean z17) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(f());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        return a17.equals(new com.tencent.mm.vfs.r6(r6Var.r()).f213166d) && g(r6Var, "store_", z17);
    }

    public java.util.List i() {
        com.tencent.mm.vfs.r6[] j17 = j();
        if (j17 == null || j17.length <= 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (com.tencent.mm.vfs.r6 r6Var : j17) {
            com.tencent.mm.plugin.appbrand.appstorage.i2 d17 = d(r6Var.getName());
            if (d17 != null) {
                linkedList.add(d17);
            }
        }
        return linkedList;
    }

    public com.tencent.mm.vfs.r6[] j() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(f());
        if (r6Var.m() && r6Var.y()) {
            return r6Var.H(new com.tencent.mm.plugin.appbrand.appstorage.k2(this));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[EDGE_INSN: B:21:0x0096->B:22:0x0096 BREAK  A[LOOP:0: B:2:0x0008->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:2:0x0008->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.appbrand.appstorage.i2 k(com.tencent.mm.plugin.appbrand.appstorage.i2 r13) {
        /*
            r12 = this;
            java.util.Collection r0 = r12.f76132d
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L96
            java.lang.Object r2 = r0.next()
            com.tencent.mm.plugin.appbrand.appstorage.m2 r2 = (com.tencent.mm.plugin.appbrand.appstorage.m2) r2
            com.tencent.mm.plugin.appbrand.appstorage.n2 r2 = (com.tencent.mm.plugin.appbrand.appstorage.n2) r2
            r2.getClass()
            if (r13 != 0) goto L1d
            goto L93
        L1d:
            java.lang.String r2 = r13.f76200e
            java.lang.String r3 = "tmp_"
            java.lang.String r4 = "store_"
            java.lang.String r2 = r2.replaceFirst(r3, r4)
            java.lang.String r5 = r13.f76200e
            android.util.Pair r5 = com.tencent.mm.plugin.appbrand.appstorage.i1.a(r5, r2)
            java.lang.Object r5 = r5.first
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L93
            com.tencent.mm.plugin.appbrand.appstorage.i2 r5 = new com.tencent.mm.plugin.appbrand.appstorage.i2
            r5.<init>()
            r5.f76200e = r2
            java.lang.String r2 = r13.f76199d
            java.lang.String r2 = r2.replaceFirst(r3, r4)
            r5.f76199d = r2
            long r2 = r13.f76202g
            r5.f76202g = r2
            java.lang.String r2 = r5.f76200e
            com.tencent.mm.vfs.z7 r2 = com.tencent.mm.vfs.z7.a(r2)
            java.lang.String r3 = r2.f213279f
            if (r3 == 0) goto L70
            r4 = 0
            java.lang.String r9 = com.tencent.mm.vfs.e8.l(r3, r4, r4)
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L70
            com.tencent.mm.vfs.z7 r3 = new com.tencent.mm.vfs.z7
            java.lang.String r7 = r2.f213277d
            java.lang.String r8 = r2.f213278e
            java.lang.String r10 = r2.f213280g
            java.lang.String r11 = r2.f213281h
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r2 = r3
        L70:
            com.tencent.mm.vfs.b3 r3 = com.tencent.mm.vfs.a3.f212781a
            com.tencent.mm.vfs.z2 r2 = r3.m(r2, r1)
            boolean r3 = r2.a()
            if (r3 != 0) goto L7d
            goto L87
        L7d:
            com.tencent.mm.vfs.q2 r3 = r2.f213266a
            java.lang.String r2 = r2.f213267b
            com.tencent.mm.vfs.x1 r2 = r3.m(r2)
            if (r2 != 0) goto L8a
        L87:
            r2 = 0
            goto L8c
        L8a:
            long r2 = r2.f213235e
        L8c:
            r5.f76203h = r2
            r2 = 1
            r5.f76201f = r2
            r2 = r5
            goto L94
        L93:
            r2 = r1
        L94:
            if (r2 == 0) goto L8
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.k(com.tencent.mm.plugin.appbrand.appstorage.i2):com.tencent.mm.plugin.appbrand.appstorage.i2");
    }
}
