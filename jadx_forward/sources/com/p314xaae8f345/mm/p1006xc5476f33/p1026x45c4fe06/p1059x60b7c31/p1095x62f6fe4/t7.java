package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public abstract class t7 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f163616a = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243941c;

    public static int a(java.lang.String str) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.w7.a();
        boolean a17 = d61.c.a(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxHelper", "checkRemux, isMp4 = %b", java.lang.Boolean.valueOf(a17));
        if (a17) {
            i17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10236xe35aebcb(str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q1.f33748x366c91de, 500, 26214400, 1200000.0d, 1000000);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxHelper", "checkRemux, ret = %d", java.lang.Integer.valueOf(i17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxHelper", "fileLength = %d", java.lang.Integer.valueOf((int) com.p314xaae8f345.mm.vfs.w6.k(str)));
            i17 = 1;
        }
        switch (i17) {
            case -6:
            case -5:
            case -4:
            case -3:
            case -2:
            case -1:
                return -50002;
            case 0:
                return -50006;
            case 1:
                return 2;
            case 2:
            case 3:
            case 4:
            case 5:
                return 1;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemuxHelper", "unknown check type");
                return -50001;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r3 = r5.getInteger("frame-rate");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float b(java.lang.String r8) {
        /*
            java.lang.String r0 = "frame-rate"
            java.lang.String r1 = "MicroMsg.RemuxHelper"
            gp.c r2 = new gp.c
            r2.<init>()
            r3 = 0
            r2.k(r8)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            int r8 = r2.d()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r4 = r3
        L12:
            if (r4 >= r8) goto L36
            android.media.MediaFormat r5 = r2.e(r4)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.lang.String r6 = "mime"
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.lang.String r7 = "video/"
            boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            if (r6 == 0) goto L33
            boolean r6 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            if (r6 == 0) goto L33
            int r8 = r5.getInteger(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r3 = r8
            goto L36
        L33:
            int r4 = r4 + 1
            goto L12
        L36:
            r2.g()
            goto L45
        L3a:
            r8 = move-exception
            goto L57
        L3c:
            r8 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r4)     // Catch: java.lang.Throwable -> L3a
            goto L36
        L45:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r0 = "getVideoFrameRate fps: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0, r8)
            float r8 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r0
            return r8
        L57:
            r2.g()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.b(java.lang.String):float");
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00b3: MOVE (r13 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:26:0x00b3 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s7 c(java.lang.String r17) {
        /*
            r0 = r17
            java.lang.String r12 = "MicroMsg.RemuxHelper"
            r13 = 0
            gp.d r14 = new gp.d     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lb7
            r14.<init>()     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lb7
            r14.setDataSource(r0)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r1 = 24
            java.lang.String r1 = r14.extractMetadata(r1)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r2 = 0
            int r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r1, r2)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r1 = 12
            java.lang.String r4 = r14.extractMetadata(r1)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r1 = 9
            java.lang.String r5 = r14.extractMetadata(r1)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            int r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r5, r2)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            long r6 = com.p314xaae8f345.mm.vfs.w6.k(r17)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r8 = 18
            java.lang.String r8 = r14.extractMetadata(r8)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            int r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r8, r2)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r9 = 19
            java.lang.String r9 = r14.extractMetadata(r9)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            int r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r9, r2)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r10 = 20
            java.lang.String r10 = r14.extractMetadata(r10)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            int r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r10, r2)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r11 = 25
            java.lang.String r11 = r14.extractMetadata(r11)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r15 = 0
            float r11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(r11, r15)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            int r15 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r15 != 0) goto L62
            java.lang.String r11 = "fps is 0"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r12, r11)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            float r11 = b(r17)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
        L62:
            java.lang.String r15 = "filepath: %s, rotation: %d, type: %s, duration: %d, size %d, width: %d, height: %d, bitrate: %d, fps: %f"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r1[r2] = r0     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r16 = 1
            r1[r16] = r2     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r2 = 2
            r1[r2] = r4     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r16 = 3
            r1[r16] = r2     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r16 = 4
            r1[r16] = r2     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r16 = 5
            r1[r16] = r2     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r16 = 6
            r1[r16] = r2     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r16 = 7
            r1[r16] = r2     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            java.lang.Float r2 = java.lang.Float.valueOf(r11)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r16 = 8
            r1[r16] = r2     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r12, r15, r1)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            com.tencent.mm.plugin.appbrand.jsapi.media.s7 r15 = new com.tencent.mm.plugin.appbrand.jsapi.media.s7     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r1 = r15
            r2 = r17
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb2 java.lang.Exception -> Lb8
            r14.release()     // Catch: java.io.IOException -> Lb1
        Lb1:
            return r15
        Lb2:
            r0 = move-exception
            r13 = r14
            goto Lc3
        Lb5:
            r0 = move-exception
            goto Lc3
        Lb7:
            r14 = r13
        Lb8:
            java.lang.String r0 = "getVideoInfo error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r12, r0)     // Catch: java.lang.Throwable -> Lb2
            if (r14 == 0) goto Lc2
            r14.release()     // Catch: java.io.IOException -> Lc2
        Lc2:
            return r13
        Lc3:
            if (r13 == 0) goto Lc8
            r13.release()     // Catch: java.io.IOException -> Lc8
        Lc8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.c(java.lang.String):com.tencent.mm.plugin.appbrand.jsapi.media.s7");
    }

    public static java.lang.String d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r7 r7Var) {
        if (r7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemuxHelper", "remuxIfNeed, compress request is null");
            return null;
        }
        java.lang.String str = r7Var.f163561a;
        if (a(str) != -50006) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u0.a(15);
            return str;
        }
        int i17 = r7Var.f163562b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = r7Var.f163563c;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        int i19 = r7Var.f163564d;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        int i27 = r7Var.f163565e;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i27);
        int i28 = r7Var.f163566f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxHelper", "compress info: filePath: %s, suggestWidth: %d, suggestHeight: %d, outputWidth: %d, outputHeight: %d, remuxBitRate %d", str, valueOf, valueOf2, valueOf3, valueOf4, java.lang.Integer.valueOf(i28));
        if (i19 == 0 || i27 == 0) {
            if (i17 <= 0) {
                i17 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;
            }
            if (i18 <= 0) {
                i18 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s7 c17 = c(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxHelper", "sourceWidth: %d, sourceHeight: %d", java.lang.Integer.valueOf(c17 == null ? 0 : c17.f163588e), java.lang.Integer.valueOf(c17 == null ? 0 : c17.f163589f));
            int[] iArr = new int[2];
            ((vf0.l1) ((wf0.g1) i95.n0.c(wf0.g1.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.d(str, iArr, i17, i18);
            i19 = iArr[0];
            i27 = iArr[1];
        } else {
            if (i19 % 2 != 0) {
                i19++;
            }
            if (i27 % 2 != 0) {
                i27++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxHelper", "outputWidth: %d, outputHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (i28 <= 0) {
            i28 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243941c;
        }
        float f17 = r7Var.f163567g;
        if (f17 <= 0.0f) {
            f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243942d;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(lp0.b.K())) {
            com.p314xaae8f345.mm.vfs.w6.u(lp0.b.K());
        }
        java.lang.String str2 = lp0.b.K() + "microMsg." + java.lang.System.currentTimeMillis() + ".mp4";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u0.a(0);
        com.p314xaae8f345.mm.p961x7eb7aaf2.C11146xae24e907 c11146xae24e907 = new com.p314xaae8f345.mm.p961x7eb7aaf2.C11146xae24e907();
        c11146xae24e907.D = 0;
        c11146xae24e907.E = 51;
        c11146xae24e907.f153158d = i19;
        c11146xae24e907.f153159e = i27;
        c11146xae24e907.f153160f = java.lang.Math.round(f17);
        c11146xae24e907.f153161g = i28;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxHelper", "hard remux mode.");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u0.a(1);
        int Ai = ((vf0.n1) ((c35.n) i95.n0.c(c35.n.class))).Ai(str, str2, c11146xae24e907, false);
        if (Ai <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemuxHelper", "remux failed, ret: %d, try soft remux mode", java.lang.Integer.valueOf(Ai));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u0.a(12);
            Ai = ((vf0.n1) ((c35.n) i95.n0.c(c35.n.class))).Ai(str, str2, c11146xae24e907, true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u0.a(10);
        }
        if (Ai < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u0.a(13);
        } else if (Ai > 0 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2582x48fb3bf9.C20822xa7933f3()) == 1) {
            ((pc0.w1) ((qc0.a1) i95.n0.c(qc0.a1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69158x329f4f7b(str, str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxHelper", "remuxIfNeed [%s] to [%s], result %d, resolution:[%d, %d]", str, str2, java.lang.Integer.valueOf(Ai), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        return str2;
    }

    public static java.lang.String e(java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemuxHelper", "remuxIfNeed, filePath is null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.w7.a();
        return d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r7(str, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c, 0, 0, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243941c, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243942d));
    }
}
