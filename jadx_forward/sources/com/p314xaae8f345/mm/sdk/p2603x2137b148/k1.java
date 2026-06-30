package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes5.dex */
public abstract class k1 {
    public static boolean a(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2));
        if (r6Var.A()) {
            if (!r6Var2.A() && r6Var2.m()) {
                return false;
            }
            d(str, str2);
            if (!z17) {
                return true;
            }
            r6Var.l();
            return true;
        }
        if (!r6Var.y()) {
            return true;
        }
        if (!r6Var2.m()) {
            r6Var2.J();
        }
        if (!r6Var2.y()) {
            return false;
        }
        java.lang.String[] D = r6Var.D();
        for (int i17 = 0; i17 < D.length; i17++) {
            a(str + "/" + D[i17], str2 + "/" + D[i17], z17);
        }
        return true;
    }

    public static boolean b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        int i17 = 0;
        try {
            return c(context.getAssets().open(str), str2, false);
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.FilesCopy", "copy assets file srcpath=%s to=%s failed, try pattern now", str, str2);
            while (true) {
                try {
                    if (!c(context.getAssets().open(str + "." + i17), str2, true)) {
                        break;
                    }
                    i17++;
                } catch (java.io.IOException unused2) {
                }
            }
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
    
        if (r4 == r10.C()) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.io.InputStream r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.SDK.FilesCopy"
            r2 = 0
            r3 = 0
            int r4 = r8.available()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            java.io.OutputStream r3 = com.p314xaae8f345.mm.vfs.w6.K(r9, r10)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            r5 = 16384(0x4000, float:2.2959E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
        L12:
            int r6 = r8.read(r5)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            r7 = -1
            if (r6 == r7) goto L1d
            r3.write(r5, r2, r6)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            goto L12
        L1d:
            r5 = 1
            if (r10 == 0) goto L21
            goto L3b
        L21:
            com.tencent.mm.vfs.r6 r10 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            com.tencent.mm.vfs.z7 r9 = com.p314xaae8f345.mm.vfs.z7.a(r9)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            r10.<init>(r9)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            boolean r9 = r10.m()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            if (r9 == 0) goto L3a
            long r6 = (long) r4     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            long r9 = r10.C()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L57
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 != 0) goto L3a
            goto L3b
        L3a:
            r5 = r2
        L3b:
            r8.close()     // Catch: java.io.IOException -> L3f
            goto L46
        L3f:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r9)
            r5 = r2
        L46:
            if (r3 == 0) goto L53
            r3.close()     // Catch: java.io.IOException -> L4c
            goto L53
        L4c:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r9)
            goto L76
        L53:
            r2 = r5
            goto L76
        L55:
            r9 = move-exception
            goto L59
        L57:
            r9 = move-exception
            goto L77
        L59:
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L57
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r9, r0, r10)     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L6a
            r8.close()     // Catch: java.io.IOException -> L64
            goto L6a
        L64:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r9)
        L6a:
            if (r3 == 0) goto L76
            r3.close()     // Catch: java.io.IOException -> L70
            goto L76
        L70:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r9)
        L76:
            return r2
        L77:
            if (r8 == 0) goto L83
            r8.close()     // Catch: java.io.IOException -> L7d
            goto L83
        L7d:
            r8 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r10)
        L83:
            if (r3 == 0) goto L8f
            r3.close()     // Catch: java.io.IOException -> L89
            goto L8f
        L89:
            r8 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r10)
        L8f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.k1.c(java.io.InputStream, java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = ""
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            java.lang.String r2 = "MicroMsg.SDK.FilesCopy"
            r3 = 0
            if (r1 != 0) goto L96
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9)
            if (r1 == 0) goto L13
            goto L96
        L13:
            boolean r1 = r8.equals(r9)
            r4 = 1
            if (r1 == 0) goto L1b
            return r4
        L1b:
            r1 = 0
            java.io.InputStream r8 = com.p314xaae8f345.mm.vfs.w6.E(r8)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            java.io.OutputStream r1 = com.p314xaae8f345.mm.vfs.w6.K(r9, r3)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r9 = 16384(0x4000, float:2.2959E-41)
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
        L28:
            int r5 = r8.read(r9)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r6 = -1
            if (r5 == r6) goto L33
            r1.write(r9, r3, r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            goto L28
        L33:
            r8.close()     // Catch: java.io.IOException -> L37
            goto L3e
        L37:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r8, r0, r9)
            r4 = r3
        L3e:
            if (r1 == 0) goto L4b
            r1.close()     // Catch: java.io.IOException -> L44
            goto L4b
        L44:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r8, r0, r9)
            goto L7b
        L4b:
            r3 = r4
            goto L7b
        L4d:
            r9 = move-exception
            goto L51
        L4f:
            r9 = move-exception
            goto L55
        L51:
            r7 = r1
            r1 = r8
            r8 = r7
            goto L7d
        L55:
            r7 = r1
            r1 = r8
            r8 = r7
            goto L5e
        L59:
            r9 = move-exception
            r8 = r1
            goto L7d
        L5c:
            r9 = move-exception
            r8 = r1
        L5e:
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L7c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r9, r0, r4)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L6f
            r1.close()     // Catch: java.io.IOException -> L69
            goto L6f
        L69:
            r9 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r9, r0, r1)
        L6f:
            if (r8 == 0) goto L7b
            r8.close()     // Catch: java.io.IOException -> L75
            goto L7b
        L75:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r8, r0, r9)
        L7b:
            return r3
        L7c:
            r9 = move-exception
        L7d:
            if (r1 == 0) goto L89
            r1.close()     // Catch: java.io.IOException -> L83
            goto L89
        L83:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r0, r4)
        L89:
            if (r8 == 0) goto L95
            r8.close()     // Catch: java.io.IOException -> L8f
            goto L95
        L8f:
            r8 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r8, r0, r1)
        L95:
            throw r9
        L96:
            java.lang.String r8 = "copy file but src path or dest path is null, return false."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.k1.d(java.lang.String, java.lang.String):boolean");
    }
}
