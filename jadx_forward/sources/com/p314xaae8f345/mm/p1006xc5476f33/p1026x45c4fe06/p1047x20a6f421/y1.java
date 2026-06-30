package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public abstract class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f159382a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f159383b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f159384c;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1 a(r45.l47 l47Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var, java.lang.String str, boolean z17) {
        l47Var.f460665g = gVar;
        if (z17) {
            l47Var.f460666h = 1;
        }
        if (a1Var == null) {
            android.os.Debug.waitForDebugger();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugUtil", "env = null ");
        }
        l47Var.f460662d = a1Var.f159139h.incrementAndGet();
        if (a1Var.f159141j == 0) {
            l47Var.f460663e = 0;
        } else {
            l47Var.f460663e = (int) (java.lang.System.currentTimeMillis() - a1Var.f159141j);
        }
        a1Var.f159141j = java.lang.System.currentTimeMillis();
        l47Var.f460664f = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1 i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1();
        i1Var.f159302a = java.lang.System.currentTimeMillis();
        int length = l47Var.f460665g.f273689a.length;
        i1Var.f159304c = length;
        i1Var.f159303b = l47Var;
        if (length > 131072) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugUtil", "parseDebugMessageToSend big message seq %d size %d", java.lang.Integer.valueOf(l47Var.f460662d), java.lang.Integer.valueOf(i1Var.f159304c));
        }
        return i1Var;
    }

    public static r45.k47 b(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17;
        r45.k47 k47Var = new r45.k47();
        k47Var.f459907d = i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f159383b)) {
            f159383b = new java.util.Random(java.lang.System.currentTimeMillis()).nextInt() + "-" + f159382a;
        }
        k47Var.f459908e = f159383b + "-" + java.lang.System.currentTimeMillis();
        try {
            b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(fVar.mo14344x5f01b1f6());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugUtil", e17.getMessage());
            b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
        }
        k47Var.f459909f = b17;
        return k47Var;
    }

    public static boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var, r45.k47 k47Var, r45.b47 b47Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var) {
        if (k47Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugUtil", "handleError dataFormat is null");
            return false;
        }
        int i17 = k47Var.f459907d;
        if (b47Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugUtil", "handleError cmd id: %d resp is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        if (i17 == 1006) {
            if (-50011 == b47Var.f452060d) {
                synchronized (a1Var) {
                    a1Var.f159145n = true;
                }
            } else {
                boolean c17 = a1Var.c();
                synchronized (a1Var) {
                    a1Var.f159145n = false;
                }
                if (c17) {
                    n1Var.j();
                }
            }
        }
        if (b47Var.f452060d == 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugUtil", "handleError cmd id: %d, uuid: %s, errorCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), k47Var.f459908e, java.lang.Integer.valueOf(b47Var.f452060d), b47Var.f452061e);
        l2Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i2(l2Var, i17, b47Var));
        return false;
    }

    public static boolean d() {
        java.lang.Boolean bool = f159384c;
        if (bool != null) {
            return bool.booleanValue();
        }
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("app_brand_global_sp", 0);
        if (sharedPreferences == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugUtil", "isHardCodeOpenGamePreload, sp is null.");
            return true;
        }
        boolean z17 = sharedPreferences.getBoolean("hard_code_open_game_preload", true);
        f159384c = java.lang.Boolean.valueOf(z17);
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if (((r22.f159138g.f159166f & 1) != 0) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedList e(com.p314xaae8f345.mm.p2495xc50a8b8b.f r21, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 r22, java.lang.String r23) {
        /*
            r1 = r22
            r2 = r23
            java.lang.String r3 = "MicroMsg.RemoteDebugUtil"
            r4 = 0
            byte[] r5 = r21.mo14344x5f01b1f6()     // Catch: java.io.IOException -> L22
            int r0 = r5.length     // Catch: java.io.IOException -> L20
            r6 = 256(0x100, float:3.59E-43)
            if (r0 <= r6) goto L2d
            if (r1 == 0) goto L2d
            com.tencent.mm.plugin.appbrand.debugger.b1 r0 = r1.f159138g     // Catch: java.io.IOException -> L20
            int r0 = r0.f159166f     // Catch: java.io.IOException -> L20
            r6 = 1
            r0 = r0 & r6
            if (r0 == 0) goto L1c
            r0 = r6
            goto L1d
        L1c:
            r0 = r4
        L1d:
            if (r0 == 0) goto L2d
            goto L2e
        L20:
            r0 = move-exception
            goto L24
        L22:
            r0 = move-exception
            r5 = 0
        L24:
            java.lang.String r6 = "parseDebugMessageToSend %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r6, r0)
        L2d:
            r6 = r4
        L2e:
            if (r6 == 0) goto L34
            byte[] r5 = kk.y.a(r5)
        L34:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            if (r5 == 0) goto Lc8
            if (r1 != 0) goto L3f
            goto Lc8
        L3f:
            int r7 = r5.length
            r8 = 131072(0x20000, float:1.83671E-40)
            int r7 = r7 + r8
            int r7 = r7 + (-64)
            int r7 = r7 / r8
            boolean r9 = r1.f159156y
            if (r9 == 0) goto Lb8
            r9 = 2
            if (r7 >= r9) goto L4e
            goto Lb8
        L4e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "splitRemoteDebugMessage messageInfoCount %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r10, r9)
            int r9 = r5.length
            r10 = -1
            r12 = r8
            r11 = r10
            r10 = r9
            r9 = r4
        L62:
            if (r4 >= r7) goto Lc8
            r45.l47 r13 = new r45.l47
            r13.<init>()
            com.tencent.mm.protobuf.g r14 = new com.tencent.mm.protobuf.g
            r14.<init>(r5, r9, r12)
            com.tencent.mm.plugin.appbrand.debugger.i1 r13 = a(r13, r14, r1, r2, r6)
            if (r4 != 0) goto L78
            r45.l47 r11 = r13.f159303b
            int r11 = r11.f460662d
        L78:
            r45.l47 r15 = r13.f159303b
            r15.f460668m = r11
            r15.f460669n = r7
            r15.f460670o = r4
            r0.add(r13)
            r45.l47 r13 = r13.f159303b
            int r13 = r13.f460662d
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r4)
            byte[] r13 = r14.f273689a
            int r13 = r13.length
            java.lang.Integer r20 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r15, r16, r17, r18, r19, r20}
            java.lang.String r14 = "splitRemoteDebugMessage seq %d, unHandleSize %d, messageSize %d,dataStartIndex %d, index %d dataSize %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r14, r13)
            int r10 = r10 - r12
            int r9 = r9 + r12
            int r4 = r4 + 1
            int r12 = r4 + 1
            if (r12 != r7) goto Lb6
            r12 = r10
            goto L62
        Lb6:
            r12 = r8
            goto L62
        Lb8:
            r45.l47 r3 = new r45.l47
            r3.<init>()
            com.tencent.mm.protobuf.g r4 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(r5)
            com.tencent.mm.plugin.appbrand.debugger.i1 r1 = a(r3, r4, r1, r2, r6)
            r0.add(r1)
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.e(com.tencent.mm.protobuf.f, com.tencent.mm.plugin.appbrand.debugger.a1, java.lang.String):java.util.LinkedList");
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.b1 f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugUtil", "parseRemoteDebugInfo extInfo=%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.b1 b1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.b1();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                jSONObject.optBoolean("open_remote", false);
                b1Var.f159161a = jSONObject.optString("room_id");
                b1Var.f159162b = jSONObject.optString("wxpkg_info");
                jSONObject.optString("qrcode_id");
                b1Var.f159163c = jSONObject.optInt("remote_network_type", 1);
                b1Var.f159165e = jSONObject.optBoolean("disable_url_check", true);
                b1Var.f159164d = jSONObject.optInt("remote_proxy_port", 9976);
                b1Var.f159166f = jSONObject.optInt("remote_support_compress_algo");
                try {
                    int optInt = new org.json.JSONObject(jSONObject.optString("debug_launch_info")).optInt("debug_type", -1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugUtil", "debug_type:%d", java.lang.Integer.valueOf(optInt));
                    if (optInt != -1) {
                        b1Var.f159167g = optInt;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugUtil", "parse debug_launch_info %s", e17);
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugUtil", "parseRemoteDebugInfo %s", e18);
            }
        }
        return b1Var;
    }

    public static void g(boolean z17) {
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("app_brand_global_sp", 0);
        if (sharedPreferences == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugUtil", "setHardCodeOpenGamePreload, sp is null.");
        } else {
            sharedPreferences.edit().putBoolean("hard_code_open_game_preload", z17).commit();
        }
    }
}
