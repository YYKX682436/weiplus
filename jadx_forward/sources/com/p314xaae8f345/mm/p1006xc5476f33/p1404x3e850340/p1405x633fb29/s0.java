package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes5.dex */
public abstract class s0 {
    public static boolean a(android.app.Activity activity) {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(activity, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUtils", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), activity);
        return a17;
    }

    public static boolean b(android.app.Activity activity) {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean d17 = j35.u.d(activity, "android.permission.CAMERA", true);
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean d18 = j35.u.d(activity, "android.permission.RECORD_AUDIO", true);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!d17) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!d18) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (d17 && d18) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUtils", "hy: above 23 and no permission. requesting...");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(activity, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), 23, null, null);
        return false;
    }

    public static boolean c(boolean z17) {
        boolean z18;
        java.lang.String concat = h().concat("/");
        java.lang.String[] strArr = {"net1_18.rpnmodel", "net1_18_bin.rpnproto", "net2_36.rpnmodel", "net2_36_bin.rpnproto"};
        java.lang.String[] strArr2 = {"align.rpdm", "align.stb", "align_bin.rpdc", "eye.rpdm", "eye_bin.rpdc"};
        java.lang.String[] strArr3 = {"rotBasis.bin"};
        int i17 = 0;
        while (true) {
            if (i17 >= 4) {
                z18 = true;
                break;
            }
            java.lang.String str = strArr[i17];
            java.lang.String str2 = concat + str;
            java.lang.String str3 = "detector/" + str;
            if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                if (!e(str2, "face_detect/" + str3).booleanValue()) {
                    z18 = false;
                    break;
                }
            }
            i17++;
        }
        int i18 = 0;
        while (true) {
            if (i18 >= 5) {
                break;
            }
            java.lang.String str4 = strArr2[i18];
            java.lang.String str5 = concat + str4;
            java.lang.String str6 = "ufa/" + str4;
            if (!com.p314xaae8f345.mm.vfs.w6.j(str5)) {
                if (!e(str5, "face_detect/" + str6).booleanValue()) {
                    z18 = false;
                    break;
                }
            }
            i18++;
        }
        java.lang.String str7 = strArr3[0];
        java.lang.String str8 = "poseest/" + str7;
        java.lang.String str9 = concat + str7;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str9)) {
            if (!e(str9, "face_detect/" + str8).booleanValue()) {
                z18 = false;
            }
        }
        java.lang.String g17 = g();
        java.lang.String concat2 = h().concat("/ufat.bin");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceUtils", "hy: not valid model path. start ");
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(g17);
        java.lang.String str10 = a17.f294812f;
        if (str10 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str10, false, false);
            if (!str10.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(concat2);
        java.lang.String str11 = a18.f294812f;
        if (str11 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str11, false, false);
            if (!str11.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b)) && !k(0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceUtils", "hy: no detect model in storage and sdcard");
            z18 = false;
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a18, null);
        if ((!m18.a() ? false : m18.f294799a.F(m18.f294800b)) || k(1)) {
            return z18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceUtils", "hy: no alignment model in storage and sdcard");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7 A[Catch: Exception -> 0x00bf, TRY_ENTER, TryCatch #1 {Exception -> 0x00bf, blocks: (B:28:0x0090, B:41:0x00b7, B:43:0x00bc), top: B:5:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc A[Catch: Exception -> 0x00bf, TRY_LEAVE, TryCatch #1 {Exception -> 0x00bf, blocks: (B:28:0x0090, B:41:0x00b7, B:43:0x00bc), top: B:5:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8 A[Catch: Exception -> 0x00cb, TRY_LEAVE, TryCatch #4 {Exception -> 0x00cb, blocks: (B:55:0x00c3, B:50:0x00c8), top: B:54:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "copyFileFromAssets src: %s, dst: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r12, r13}
            java.lang.String r2 = "MicroMsg.FaceUtils"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto Lcc
            if (r11 != 0) goto L15
            goto Lcc
        L15:
            r0 = 0
            r1 = 0
            java.lang.String r3 = com.p314xaae8f345.mm.vfs.w6.r(r13)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lac
            com.p314xaae8f345.mm.vfs.w6.u(r3)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lac
            com.tencent.mm.vfs.z7 r13 = com.p314xaae8f345.mm.vfs.z7.a(r13)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r3 = r13.f294812f
            if (r3 == 0) goto L3f
            java.lang.String r7 = com.p314xaae8f345.mm.vfs.e8.l(r3, r0, r0)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            boolean r3 = r3.equals(r7)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            if (r3 != 0) goto L3f
            com.tencent.mm.vfs.z7 r3 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r5 = r13.f294810d     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r6 = r13.f294811e     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r8 = r13.f294813g     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            java.lang.String r9 = r13.f294814h     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
            r13 = r3
        L3f:
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lac
            java.io.InputStream r11 = r11.open(r12)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lac
            com.tencent.mm.vfs.b3 r3 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            com.tencent.mm.vfs.z2 r3 = r3.m(r13, r1)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.io.OutputStream r1 = com.p314xaae8f345.mm.vfs.w6.I(r13, r3, r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
        L55:
            int r5 = r11.read(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r6 = -1
            if (r5 == r6) goto L60
            r1.write(r4, r0, r5)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto L55
        L60:
            r1.flush()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r4 = "copyFileFromAssets %s successfully, file len: %d"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r5[r0] = r12     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            com.tencent.mm.vfs.b3 r12 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            com.tencent.mm.vfs.z2 r12 = r12.m(r13, r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            boolean r13 = r12.a()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r6 = 0
            if (r13 != 0) goto L79
            goto L86
        L79:
            com.tencent.mm.vfs.q2 r13 = r12.f294799a     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r12 = r12.f294800b     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            com.tencent.mm.vfs.x1 r12 = r13.m(r12)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r12 != 0) goto L84
            goto L86
        L84:
            long r6 = r12.f294766c     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
        L86:
            java.lang.Long r12 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r13 = 1
            r5[r13] = r12     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4, r5)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r11.close()     // Catch: java.lang.Exception -> Lbf
            r1.close()     // Catch: java.lang.Exception -> Lbf
            goto Lbf
        L97:
            r12 = move-exception
            goto L9b
        L99:
            r12 = move-exception
            goto L9f
        L9b:
            r10 = r1
            r1 = r11
            r11 = r10
            goto Lc1
        L9f:
            r10 = r1
            r1 = r11
            r11 = r10
            goto Lae
        La3:
            r11 = move-exception
            r12 = r11
            goto Laa
        La6:
            r11 = move-exception
            r12 = r11
            goto Lad
        La9:
            r12 = move-exception
        Laa:
            r11 = r1
            goto Lc1
        Lac:
            r12 = move-exception
        Lad:
            r11 = r1
        Lae:
            java.lang.String r13 = "copyFileFromAssets exception"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lc0
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r12, r13, r0)     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto Lba
            r1.close()     // Catch: java.lang.Exception -> Lbf
        Lba:
            if (r11 == 0) goto Lbf
            r11.close()     // Catch: java.lang.Exception -> Lbf
        Lbf:
            return
        Lc0:
            r12 = move-exception
        Lc1:
            if (r1 == 0) goto Lc6
            r1.close()     // Catch: java.lang.Exception -> Lcb
        Lc6:
            if (r11 == 0) goto Lcb
            r11.close()     // Catch: java.lang.Exception -> Lcb
        Lcb:
            throw r12
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.d(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static java.lang.Boolean e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUtils", "SDPath: " + str + " assetPath: " + str2);
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        byte[] bArr = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181284a;
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str2, str);
        return java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(str));
    }

    public static java.lang.String f(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(", ");
        sb6.append(str);
        return kk.k.g(sb6.toString().getBytes());
    }

    public static java.lang.String g() {
        return h().concat("/ufdmtcc.bin");
    }

    public static java.lang.String h() {
        java.lang.String str = lp0.b.X() + "face_detect";
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUtils", "hy: face dir not exist. mk dir");
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        return str;
    }

    public static android.graphics.Bitmap i(java.lang.String str) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUtils", "hy: username is null or nil. return");
                return null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.a.f181518a);
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(sb7);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceUtils", "hy: no last file. return");
                return null;
            }
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(sb7, 0, -1);
            if (N == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceUtils", "hy: nothing in file");
                return null;
            }
            byte[] a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.r0.a(N, j(str));
            if (a18.length > 0) {
                return android.graphics.BitmapFactory.decodeByteArray(a18, 0, a18.length);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceUtils", "hy: decrypt err. return null");
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceUtils", e17, "hy: err in encrypt", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String j(java.lang.String str) {
        return android.util.Base64.encodeToString((str + str.hashCode()).getBytes(), 0);
    }

    public static boolean k(int i17) {
        java.lang.String str = "";
        java.lang.String a17 = i17 != 0 ? i17 != 1 ? "" : c01.b9.f118602c.a("LAST_LOGIN_FACE_MODEL_SDCARD_PATH_ALIGNMENT", "") : c01.b9.f118602c.a("LAST_LOGIN_FACE_MODEL_SDCARD_PATH_DETECT", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceUtils", "hy: no such path for type: %d", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(a17);
        java.lang.String str2 = a18.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceUtils", "originFile file not exist");
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(i17 != 0 ? i17 != 1 ? "" : h().concat("/ufat.bin") : g());
        if (r6Var.m()) {
            r6Var.l();
        }
        if (i17 == 0) {
            str = g();
        } else if (i17 == 1) {
            str = h().concat("/ufat.bin");
        }
        com.p314xaae8f345.mm.vfs.w6.c(a17, str);
        return true;
    }

    public static void l(byte[] bArr, java.lang.String str) {
        try {
            com.p314xaae8f345.mm.vfs.w6.S(str, bArr, 0, bArr.length);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceUtils", e17, "hy: err in save debug jpeg", new java.lang.Object[0]);
        }
    }

    public static android.graphics.Bitmap m(android.content.Context context, java.lang.String str, android.graphics.Bitmap bitmap) {
        long j17;
        boolean z17;
        boolean z18;
        android.graphics.Bitmap bitmap2;
        long j18;
        int[] iArr;
        boolean z19;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (bitmap == null) {
            j17 = currentTimeMillis;
            z18 = true;
            z17 = false;
            bitmap2 = null;
        } else {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, java.lang.Math.round(bitmap.getWidth() * 0.1f), java.lang.Math.round(bitmap.getHeight() * 0.1f), false);
            android.graphics.Bitmap.Config config = createScaledBitmap.getConfig();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Boolean.TRUE);
            arrayList.add(config);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(createScaledBitmap, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/model/FaceBlurUtil", "fastblur", "(Landroid/graphics/Bitmap;FI)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap copy = createScaledBitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
            yj0.a.e(createScaledBitmap, copy, "com/tencent/mm/plugin/facedetect/model/FaceBlurUtil", "fastblur", "(Landroid/graphics/Bitmap;FI)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            int width = copy.getWidth();
            int height = copy.getHeight();
            int i17 = width * height;
            int[] iArr2 = new int[i17];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("pix", width + " " + height + " " + i17);
            java.lang.String str2 = "pix";
            int i18 = i17;
            copy.getPixels(iArr2, 0, width, 0, 0, width, height);
            int i19 = width + (-1);
            int i27 = height + (-1);
            int[] iArr3 = new int[i18];
            int[] iArr4 = new int[i18];
            int[] iArr5 = new int[i18];
            int[] iArr6 = new int[java.lang.Math.max(width, height)];
            j17 = currentTimeMillis;
            int[] iArr7 = new int[246016];
            int i28 = 0;
            for (int i29 = 246016; i28 < i29; i29 = 246016) {
                iArr7[i28] = i28 / 961;
                i28++;
            }
            int[][] iArr8 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 61, 3);
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            while (true) {
                android.graphics.Bitmap bitmap3 = copy;
                if (i37 >= height) {
                    int[] iArr9 = iArr7;
                    java.lang.String str3 = str2;
                    int i47 = i18;
                    int i48 = 0;
                    while (i48 < width) {
                        int i49 = (-30) * width;
                        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.r.a(currentTimeMillis2)) {
                            int i57 = height;
                            int[] iArr10 = iArr6;
                            int i58 = -30;
                            int i59 = 0;
                            int i66 = 0;
                            int i67 = 0;
                            int i68 = 0;
                            int i69 = 0;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            int i79 = 0;
                            for (int i86 = 30; i58 <= i86; i86 = 30) {
                                int max = java.lang.Math.max(0, i49) + i48;
                                int[] iArr11 = iArr8[i58 + 30];
                                iArr11[0] = iArr3[max];
                                iArr11[1] = iArr4[max];
                                iArr11[2] = iArr5[max];
                                int abs = 31 - java.lang.Math.abs(i58);
                                i59 += iArr3[max] * abs;
                                i66 += iArr4[max] * abs;
                                i67 += iArr5[max] * abs;
                                if (i58 > 0) {
                                    i77 += iArr11[0];
                                    i78 += iArr11[1];
                                    i79 += iArr11[2];
                                } else {
                                    i68 += iArr11[0];
                                    i69 += iArr11[1];
                                    i76 += iArr11[2];
                                }
                                if (i58 < i27) {
                                    i49 += width;
                                }
                                i58++;
                            }
                            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.r.a(currentTimeMillis2)) {
                                int i87 = i48;
                                height = i57;
                                int i88 = 0;
                                int i89 = 30;
                                while (i88 < height) {
                                    iArr2[i87] = (iArr2[i87] & (-16777216)) | (iArr9[i59] << 16) | (iArr9[i66] << 8) | iArr9[i67];
                                    int i96 = i59 - i68;
                                    int i97 = i66 - i69;
                                    int i98 = i67 - i76;
                                    int[] iArr12 = iArr8[((i89 - 30) + 61) % 61];
                                    int i99 = i68 - iArr12[0];
                                    int i100 = i69 - iArr12[1];
                                    int i101 = i76 - iArr12[2];
                                    if (i48 == 0) {
                                        j18 = currentTimeMillis2;
                                        iArr10[i88] = java.lang.Math.min(i88 + 31, i27) * width;
                                    } else {
                                        j18 = currentTimeMillis2;
                                    }
                                    int i102 = iArr10[i88] + i48;
                                    int i103 = iArr3[i102];
                                    iArr12[0] = i103;
                                    int i104 = iArr4[i102];
                                    iArr12[1] = i104;
                                    int i105 = iArr5[i102];
                                    iArr12[2] = i105;
                                    int i106 = i77 + i103;
                                    int i107 = i78 + i104;
                                    int i108 = i79 + i105;
                                    i59 = i96 + i106;
                                    i66 = i97 + i107;
                                    i67 = i98 + i108;
                                    i89 = (i89 + 1) % 61;
                                    int[] iArr13 = iArr8[i89];
                                    int i109 = iArr13[0];
                                    i68 = i99 + i109;
                                    int i110 = iArr13[1];
                                    i69 = i100 + i110;
                                    int i111 = iArr13[2];
                                    i76 = i101 + i111;
                                    i77 = i106 - i109;
                                    i78 = i107 - i110;
                                    i79 = i108 - i111;
                                    i87 += width;
                                    i88++;
                                    currentTimeMillis2 = j18;
                                }
                                i48++;
                                iArr6 = iArr10;
                                currentTimeMillis2 = currentTimeMillis2;
                            }
                        }
                    }
                    z17 = false;
                    z18 = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, width + " " + height + " " + i47);
                    bitmap3.setPixels(iArr2, 0, width, 0, 0, width, height);
                    bitmap2 = bitmap3;
                } else {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.r.a(currentTimeMillis2)) {
                        break;
                    }
                    java.lang.String str4 = str2;
                    int i112 = -30;
                    int i113 = 0;
                    int i114 = 0;
                    int i115 = 0;
                    int i116 = 0;
                    int i117 = 0;
                    int i118 = 0;
                    int i119 = 0;
                    int i120 = 0;
                    int i121 = 0;
                    for (int i122 = 30; i112 <= i122; i122 = 30) {
                        int i123 = i18;
                        int i124 = iArr2[i38 + java.lang.Math.min(i19, java.lang.Math.max(i112, 0))];
                        int[] iArr14 = iArr8[i112 + 30];
                        iArr14[0] = (i124 & 16711680) >> 16;
                        iArr14[1] = (i124 & 65280) >> 8;
                        iArr14[2] = i124 & 255;
                        int abs2 = 31 - java.lang.Math.abs(i112);
                        int i125 = iArr14[0];
                        i113 += i125 * abs2;
                        int i126 = iArr14[1];
                        i114 += i126 * abs2;
                        int i127 = iArr14[2];
                        i115 += abs2 * i127;
                        if (i112 > 0) {
                            i119 += i125;
                            i120 += i126;
                            i121 += i127;
                        } else {
                            i116 += i125;
                            i117 += i126;
                            i118 += i127;
                        }
                        i112++;
                        i18 = i123;
                    }
                    int i128 = i18;
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.r.a(currentTimeMillis2)) {
                        break;
                    }
                    int i129 = 0;
                    int i130 = 30;
                    while (i129 < width) {
                        iArr3[i38] = iArr7[i113];
                        iArr4[i38] = iArr7[i114];
                        iArr5[i38] = iArr7[i115];
                        int i131 = i113 - i116;
                        int i132 = i114 - i117;
                        int i133 = i115 - i118;
                        int[] iArr15 = iArr8[((i130 - 30) + 61) % 61];
                        int i134 = i116 - iArr15[0];
                        int i135 = i117 - iArr15[1];
                        int i136 = i118 - iArr15[2];
                        if (i37 == 0) {
                            iArr = iArr7;
                            iArr6[i129] = java.lang.Math.min(i129 + 30 + 1, i19);
                        } else {
                            iArr = iArr7;
                        }
                        int i137 = iArr2[i39 + iArr6[i129]];
                        int i138 = (i137 & 16711680) >> 16;
                        iArr15[0] = i138;
                        int i139 = (i137 & 65280) >> 8;
                        iArr15[1] = i139;
                        int i140 = i137 & 255;
                        iArr15[2] = i140;
                        int i141 = i119 + i138;
                        int i142 = i120 + i139;
                        int i143 = i121 + i140;
                        i113 = i131 + i141;
                        i114 = i132 + i142;
                        i115 = i133 + i143;
                        i130 = (i130 + 1) % 61;
                        int[] iArr16 = iArr8[i130 % 61];
                        int i144 = iArr16[0];
                        i116 = i134 + i144;
                        int i145 = iArr16[1];
                        i117 = i135 + i145;
                        int i146 = iArr16[2];
                        i118 = i136 + i146;
                        i119 = i141 - i144;
                        i120 = i142 - i145;
                        i121 = i143 - i146;
                        i38++;
                        i129++;
                        iArr7 = iArr;
                    }
                    i39 += width;
                    i37++;
                    copy = bitmap3;
                    str2 = str4;
                    i18 = i128;
                }
            }
            bitmap2 = null;
            z17 = false;
            z18 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUtils", "hy: blur using %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
        if (bitmap2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceUtils", "hy: null on blur. use default");
            bitmap2 = i(str);
            if (bitmap2 == null) {
                bitmap2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.c0(com.p314xaae8f345.mm.R.C30861xcebc809e.c1r);
            }
            z19 = z17;
        } else {
            z19 = z18;
        }
        if (z19) {
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.q0(bitmap2, str));
        }
        return bitmap2;
    }
}
