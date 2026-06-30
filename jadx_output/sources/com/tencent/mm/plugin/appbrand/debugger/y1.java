package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public abstract class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f77849a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f77850b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f77851c;

    public static com.tencent.mm.plugin.appbrand.debugger.i1 a(r45.l47 l47Var, com.tencent.mm.protobuf.g gVar, com.tencent.mm.plugin.appbrand.debugger.a1 a1Var, java.lang.String str, boolean z17) {
        l47Var.f379132g = gVar;
        if (z17) {
            l47Var.f379133h = 1;
        }
        if (a1Var == null) {
            android.os.Debug.waitForDebugger();
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugUtil", "env = null ");
        }
        l47Var.f379129d = a1Var.f77606h.incrementAndGet();
        if (a1Var.f77608j == 0) {
            l47Var.f379130e = 0;
        } else {
            l47Var.f379130e = (int) (java.lang.System.currentTimeMillis() - a1Var.f77608j);
        }
        a1Var.f77608j = java.lang.System.currentTimeMillis();
        l47Var.f379131f = str;
        com.tencent.mm.plugin.appbrand.debugger.i1 i1Var = new com.tencent.mm.plugin.appbrand.debugger.i1();
        i1Var.f77769a = java.lang.System.currentTimeMillis();
        int length = l47Var.f379132g.f192156a.length;
        i1Var.f77771c = length;
        i1Var.f77770b = l47Var;
        if (length > 131072) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugUtil", "parseDebugMessageToSend big message seq %d size %d", java.lang.Integer.valueOf(l47Var.f379129d), java.lang.Integer.valueOf(i1Var.f77771c));
        }
        return i1Var;
    }

    public static r45.k47 b(int i17, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.protobuf.g b17;
        r45.k47 k47Var = new r45.k47();
        k47Var.f378374d = i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(f77850b)) {
            f77850b = new java.util.Random(java.lang.System.currentTimeMillis()).nextInt() + "-" + f77849a;
        }
        k47Var.f378375e = f77850b + "-" + java.lang.System.currentTimeMillis();
        try {
            b17 = com.tencent.mm.protobuf.g.b(fVar.toByteArray());
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugUtil", e17.getMessage());
            b17 = com.tencent.mm.protobuf.g.b(new byte[0]);
        }
        k47Var.f378376f = b17;
        return k47Var;
    }

    public static boolean c(com.tencent.mm.plugin.appbrand.debugger.a1 a1Var, r45.k47 k47Var, r45.b47 b47Var, com.tencent.mm.plugin.appbrand.debugger.l2 l2Var, com.tencent.mm.plugin.appbrand.debugger.n1 n1Var) {
        if (k47Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugUtil", "handleError dataFormat is null");
            return false;
        }
        int i17 = k47Var.f378374d;
        if (b47Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugUtil", "handleError cmd id: %d resp is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        if (i17 == 1006) {
            if (-50011 == b47Var.f370527d) {
                synchronized (a1Var) {
                    a1Var.f77612n = true;
                }
            } else {
                boolean c17 = a1Var.c();
                synchronized (a1Var) {
                    a1Var.f77612n = false;
                }
                if (c17) {
                    n1Var.j();
                }
            }
        }
        if (b47Var.f370527d == 0) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugUtil", "handleError cmd id: %d, uuid: %s, errorCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), k47Var.f378375e, java.lang.Integer.valueOf(b47Var.f370527d), b47Var.f370528e);
        l2Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.i2(l2Var, i17, b47Var));
        return false;
    }

    public static boolean d() {
        java.lang.Boolean bool = f77851c;
        if (bool != null) {
            return bool.booleanValue();
        }
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("app_brand_global_sp", 0);
        if (sharedPreferences == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugUtil", "isHardCodeOpenGamePreload, sp is null.");
            return true;
        }
        boolean z17 = sharedPreferences.getBoolean("hard_code_open_game_preload", true);
        f77851c = java.lang.Boolean.valueOf(z17);
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if (((r22.f77605g.f77633f & 1) != 0) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedList e(com.tencent.mm.protobuf.f r21, com.tencent.mm.plugin.appbrand.debugger.a1 r22, java.lang.String r23) {
        /*
            r1 = r22
            r2 = r23
            java.lang.String r3 = "MicroMsg.RemoteDebugUtil"
            r4 = 0
            byte[] r5 = r21.toByteArray()     // Catch: java.io.IOException -> L22
            int r0 = r5.length     // Catch: java.io.IOException -> L20
            r6 = 256(0x100, float:3.59E-43)
            if (r0 <= r6) goto L2d
            if (r1 == 0) goto L2d
            com.tencent.mm.plugin.appbrand.debugger.b1 r0 = r1.f77605g     // Catch: java.io.IOException -> L20
            int r0 = r0.f77633f     // Catch: java.io.IOException -> L20
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
            com.tencent.mars.xlog.Log.e(r3, r6, r0)
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
            boolean r9 = r1.f77623y
            if (r9 == 0) goto Lb8
            r9 = 2
            if (r7 >= r9) goto L4e
            goto Lb8
        L4e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "splitRemoteDebugMessage messageInfoCount %d"
            com.tencent.mars.xlog.Log.i(r3, r10, r9)
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
            r45.l47 r11 = r13.f77770b
            int r11 = r11.f379129d
        L78:
            r45.l47 r15 = r13.f77770b
            r15.f379135m = r11
            r15.f379136n = r7
            r15.f379137o = r4
            r0.add(r13)
            r45.l47 r13 = r13.f77770b
            int r13 = r13.f379129d
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r4)
            byte[] r13 = r14.f192156a
            int r13 = r13.length
            java.lang.Integer r20 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r15, r16, r17, r18, r19, r20}
            java.lang.String r14 = "splitRemoteDebugMessage seq %d, unHandleSize %d, messageSize %d,dataStartIndex %d, index %d dataSize %d"
            com.tencent.mars.xlog.Log.i(r3, r14, r13)
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
            com.tencent.mm.protobuf.g r4 = com.tencent.mm.protobuf.g.b(r5)
            com.tencent.mm.plugin.appbrand.debugger.i1 r1 = a(r3, r4, r1, r2, r6)
            r0.add(r1)
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.debugger.y1.e(com.tencent.mm.protobuf.f, com.tencent.mm.plugin.appbrand.debugger.a1, java.lang.String):java.util.LinkedList");
    }

    public static com.tencent.mm.plugin.appbrand.debugger.b1 f(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugUtil", "parseRemoteDebugInfo extInfo=%s", str);
        com.tencent.mm.plugin.appbrand.debugger.b1 b1Var = new com.tencent.mm.plugin.appbrand.debugger.b1();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                jSONObject.optBoolean("open_remote", false);
                b1Var.f77628a = jSONObject.optString("room_id");
                b1Var.f77629b = jSONObject.optString("wxpkg_info");
                jSONObject.optString("qrcode_id");
                b1Var.f77630c = jSONObject.optInt("remote_network_type", 1);
                b1Var.f77632e = jSONObject.optBoolean("disable_url_check", true);
                b1Var.f77631d = jSONObject.optInt("remote_proxy_port", 9976);
                b1Var.f77633f = jSONObject.optInt("remote_support_compress_algo");
                try {
                    int optInt = new org.json.JSONObject(jSONObject.optString("debug_launch_info")).optInt("debug_type", -1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugUtil", "debug_type:%d", java.lang.Integer.valueOf(optInt));
                    if (optInt != -1) {
                        b1Var.f77634g = optInt;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugUtil", "parse debug_launch_info %s", e17);
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugUtil", "parseRemoteDebugInfo %s", e18);
            }
        }
        return b1Var;
    }

    public static void g(boolean z17) {
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("app_brand_global_sp", 0);
        if (sharedPreferences == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugUtil", "setHardCodeOpenGamePreload, sp is null.");
        } else {
            sharedPreferences.edit().putBoolean("hard_code_open_game_preload", z17).commit();
        }
    }
}
