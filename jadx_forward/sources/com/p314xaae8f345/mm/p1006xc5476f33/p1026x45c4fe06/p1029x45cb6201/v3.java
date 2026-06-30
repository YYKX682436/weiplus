package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public abstract class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f157538a = new java.util.HashMap();

    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u3Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.io.InputStream c17 = u3Var.c(path);
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
            java.lang.String str = new java.lang.String(vz5.a.c(c17), r26.c.f450398a);
            vz5.b.a(c17, null);
            return str;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 r15, java.lang.String r16, long r17, long r19, ik1.b0 r21) {
        /*
            r0 = r17
            r2 = r21
            java.lang.String r3 = "<this>"
            r4 = r15
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r3)
            java.lang.String r3 = "path"
            r5 = r16
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r3)
            java.lang.String r3 = "pByteBuffer"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            java.io.InputStream r3 = r15.c(r16)
            if (r3 != 0) goto L1f
            com.tencent.mm.plugin.appbrand.appstorage.j1 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS
            return r0
        L1f:
            r6 = 0
            int r7 = r3.available()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            long r7 = (long) r7     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            com.tencent.mm.plugin.appbrand.appstorage.j1 r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            r10 = 0
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 < 0) goto L47
            r11 = 1
            long r13 = r7 - r11
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 <= 0) goto L36
            goto L47
        L36:
            int r11 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r11 < 0) goto L42
            long r7 = r7 - r0
            int r7 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r7 <= 0) goto L40
            goto L42
        L40:
            r7 = r9
            goto L49
        L42:
            com.tencent.mm.plugin.appbrand.appstorage.j1 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_ILLEGAL_READ_LENGTH     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            goto L49
        L45:
            r0 = move-exception
            goto L9f
        L47:
            com.tencent.mm.plugin.appbrand.appstorage.j1 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_ILLEGAL_READ_POSITION     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
        L49:
            if (r7 == r9) goto L4f
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r3)
            return r7
        L4f:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r7 != 0) goto L5f
            int r7 = r3.available()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            long r7 = (long) r7     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            long r7 = r7 - r0
            goto L61
        L5f:
            r7 = r19
        L61:
            int r11 = r3.available()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocateDirect(r11)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            if (r10 != 0) goto L76
            int r10 = r3.available()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            long r12 = (long) r10     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            int r10 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r10 != 0) goto L76
            r10 = 1
            goto L77
        L76:
            r10 = r6
        L77:
            if (r10 == 0) goto L86
            boolean r10 = r3 instanceof nf.a     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            if (r10 == 0) goto L86
            r0 = r3
            nf.a r0 = (nf.a) r0     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            java.nio.ByteBuffer r0 = r0.f418105d     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            r11.put(r0)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            goto L91
        L86:
            byte[] r0 = ik1.f.c(r3, r0, r7)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            r11.put(r0)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
        L91:
            r11.rewind()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            r2.f373357a = r11     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            e(r15, r16)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L9d
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r3)
            return r9
        L9d:
            r0 = move-exception
            goto Lae
        L9f:
            java.lang.String r1 = "MicroMsg.IWxaPkg.Extend"
            java.lang.String r2 = "readFile"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L9d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r0, r2, r4)     // Catch: java.lang.Throwable -> L9d
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r3)
            com.tencent.mm.plugin.appbrand.appstorage.j1 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL
            return r0
        Lae:
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v3.b(com.tencent.mm.plugin.appbrand.appcache.u3, java.lang.String, long, long, ik1.b0):com.tencent.mm.plugin.appbrand.appstorage.j1");
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var, java.lang.String path, ik1.b0 pByteBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u3Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pByteBuffer, "pByteBuffer");
        java.io.InputStream c17 = u3Var.c(path);
        try {
            if (c17 == null) {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
            }
            try {
                int available = c17.available();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
                return b(u3Var, path, 0L, available, pByteBuffer);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IWxaPkg.Extend", e17, "readFile", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
                return j1Var;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
            throw th6;
        }
    }

    public static final java.lang.String d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var, java.lang.String path) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u3Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.io.InputStream c17 = u3Var.c(path);
        if (c17 != null) {
            try {
                str = new java.lang.String(vz5.a.c(c17), r26.c.f450398a);
            } finally {
            }
        } else {
            str = "";
        }
        vz5.b.a(c17, null);
        return str;
    }

    public static final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var, java.lang.String str) {
        if (!r26.i0.y(str, "/", false)) {
            str = "/".concat(str);
        }
        if (!r26.n0.D(str, "\\", false, 2, null)) {
            int length = str.length() - 1;
            int i17 = 0;
            boolean z17 = false;
            while (i17 <= length) {
                boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str.charAt(!z17 ? i17 : length), 32) <= 0;
                if (z17) {
                    if (!z18) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z18) {
                    i17++;
                } else {
                    z17 = true;
                }
            }
            if (!(str.subSequence(i17, length + 1).toString().length() == 0)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (true) {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
                        if (r26.i0.o(str, "/", false, 2, null)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IWxaPkg.Extend", "updateDirAccessTimeRecord: file = [%s] is illegal", str);
                            break;
                        }
                        str = str.substring(0, r26.n0.P(str, "/", 0, false, 6, null));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
                            arrayList.add("/");
                        } else {
                            arrayList.add(str.concat("/"));
                        }
                    } else {
                        break;
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((java.util.HashMap) f157538a).put((java.lang.String) it.next(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IWxaPkg.Extend", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
    }
}
