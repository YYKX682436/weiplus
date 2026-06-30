package com.tencent.mm.plugin.appbrand.game;

/* loaded from: classes7.dex */
public class WAGameMISSignatureManager {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f78196a;

    /* renamed from: b, reason: collision with root package name */
    public long f78197b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f78198c = false;

    public WAGameMISSignatureManager(r45.td7 td7Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f78196a = new java.lang.ref.WeakReference(appBrandRuntime);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ca A[Catch: all -> 0x0108, TryCatch #2 {all -> 0x0108, blocks: (B:65:0x0029, B:67:0x002f, B:69:0x0039, B:72:0x0049, B:74:0x0059, B:75:0x005f, B:77:0x0077, B:79:0x0080, B:81:0x00b6, B:83:0x00bc, B:85:0x00ca, B:86:0x00d1, B:89:0x00f8, B:92:0x00fd, B:93:0x0100, B:94:0x0085, B:96:0x008c, B:98:0x0097, B:100:0x00a4, B:102:0x0101, B:88:0x00e7), top: B:64:0x0029, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d1 A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #2 {all -> 0x0108, blocks: (B:65:0x0029, B:67:0x002f, B:69:0x0039, B:72:0x0049, B:74:0x0059, B:75:0x005f, B:77:0x0077, B:79:0x0080, B:81:0x00b6, B:83:0x00bc, B:85:0x00ca, B:86:0x00d1, B:89:0x00f8, B:92:0x00fd, B:93:0x0100, B:94:0x0085, B:96:0x008c, B:98:0x0097, B:100:0x00a4, B:102:0x0101, B:88:0x00e7), top: B:64:0x0029, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void captureScreen(java.lang.Object r10, java.lang.String r11, int r12, int r13, byte[] r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.game.WAGameMISSignatureManager.captureScreen(java.lang.Object, java.lang.String, int, int, byte[], byte[]):void");
    }

    public static void e(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str, byte[] bArr, int i17, int i18, int i19) {
        if (appBrandRuntime == null) {
            com.tencent.mars.xlog.Log.e("WAGameMISSignatureManager", "uploadSingleSlice: runtime is null");
            return;
        }
        try {
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.sq5();
            lVar.f70665b = new r45.tq5();
            lVar.f70667d = 12630;
            lVar.f70666c = "/cgi-bin/mmgame-bin/reportserverdata";
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            r45.sq5 sq5Var = (r45.sq5) a17.f70710a.f70684a;
            sq5Var.f385926d = new java.util.LinkedList();
            r45.d73 d73Var = new r45.d73();
            d73Var.f372194d = appBrandRuntime.f74803n;
            d73Var.f372196f = appBrandRuntime.E0().f305852r.f75399d;
            d73Var.f372195e = appBrandRuntime.E0().f305852r.pkgVersion;
            d73Var.f372199i = str;
            d73Var.f372197g = com.tencent.mm.protobuf.g.b(bArr);
            sq5Var.f385926d.add(d73Var);
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new fa1.b0(i17, i18));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("WAGameMISSignatureManager", "uploadSingleSlice: exception", th6);
        }
    }

    private native long nativeCreate(java.lang.Object obj, int i17, int i18, int i19, int i27);

    private native void nativeDestroy(long j17);

    private native byte[] nativeInvoke(long j17, java.lang.String str, byte[] bArr);

    private native void nativePause(long j17);

    private native void nativeResume(long j17);

    public static void postData(int i17, byte[] bArr, java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.appbrand.game.WAGameMISSignatureManager) {
            com.tencent.mm.plugin.appbrand.game.WAGameMISSignatureManager wAGameMISSignatureManager = (com.tencent.mm.plugin.appbrand.game.WAGameMISSignatureManager) obj;
            synchronized (wAGameMISSignatureManager) {
                long j17 = wAGameMISSignatureManager.f78197b;
                if (j17 == 0) {
                    return;
                }
                com.tencent.mm.ipcinvoker.wx_extension.x xVar = (com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class);
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = new r45.dq5();
                lVar.f70665b = new r45.eq5();
                lVar.f70667d = 26874;
                lVar.f70666c = "/cgi-bin/mmgame-bin/reportmisfeaturedata";
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                com.tencent.mm.modelbase.o a17 = lVar.a();
                r45.dq5 dq5Var = (r45.dq5) a17.f70710a.f70684a;
                dq5Var.f372667d = new java.util.LinkedList();
                r45.xm4 xm4Var = new r45.xm4();
                xm4Var.f390236d = ((com.tencent.mm.plugin.appbrand.AppBrandRuntime) wAGameMISSignatureManager.f78196a.get()).f74803n;
                xm4Var.f390238f = ((com.tencent.mm.plugin.appbrand.AppBrandRuntime) wAGameMISSignatureManager.f78196a.get()).E0().f305852r.f75399d;
                xm4Var.f390237e = ((com.tencent.mm.plugin.appbrand.AppBrandRuntime) wAGameMISSignatureManager.f78196a.get()).E0().f305852r.pkgVersion;
                xm4Var.f390241i = "MD";
                xm4Var.f390239g = i17;
                xm4Var.f390240h = com.tencent.mm.protobuf.g.b(bArr);
                dq5Var.f372667d.add(xm4Var);
                ((h80.i) xVar).wi(a17, new fa1.z(wAGameMISSignatureManager, j17, i17));
            }
        }
    }

    public boolean a(r45.td7 td7Var) {
        boolean z17 = this.f78198c;
        if (!z17 || this.f78197b != 0) {
            return z17 && this.f78197b != 0;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) this.f78196a.get();
        if (appBrandRuntime == null) {
            com.tencent.mars.xlog.Log.e("WAGameMISSignatureManager", "initNativeHandle: runtime is null (GC'd)");
            return false;
        }
        this.f78197b = nativeCreate(appBrandRuntime, td7Var.f386334f, td7Var.f386333e, td7Var.f386335g, td7Var.f386336h);
        int i17 = appBrandRuntime.E0().f305852r.pkgVersion;
        java.lang.String str = td7Var.f386337i;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(5).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        order.put((byte) 1);
        order.putInt(i17);
        linkedHashMap.put("gameVersion", order.array());
        byte[] bytes = str != null ? str.getBytes(java.nio.charset.StandardCharsets.UTF_8) : new byte[0];
        byte[] bArr = new byte[bytes.length + 1];
        bArr[0] = 6;
        java.lang.System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        linkedHashMap.put("functionsName", bArr);
        int i18 = 4;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            i18 += ((java.lang.String) entry.getKey()).getBytes(java.nio.charset.StandardCharsets.UTF_8).length + 2 + 1 + 4 + (((byte[]) entry.getValue()).length - 1);
        }
        java.nio.ByteBuffer order2 = java.nio.ByteBuffer.allocate(i18).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        order2.putInt(linkedHashMap.size());
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            byte[] bytes2 = ((java.lang.String) entry2.getKey()).getBytes(java.nio.charset.StandardCharsets.UTF_8);
            byte[] bArr2 = (byte[]) entry2.getValue();
            order2.putShort((short) bytes2.length);
            order2.put(bytes2);
            order2.put(bArr2[0]);
            order2.putInt(bArr2.length - 1);
            if (bArr2.length > 1) {
                order2.put(bArr2, 1, bArr2.length - 1);
            }
        }
        byte[] nativeInvoke = nativeInvoke(this.f78197b, "setPkgInfo", order2.array());
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        if (nativeInvoke != null && nativeInvoke.length >= 4) {
            try {
                java.nio.ByteBuffer order3 = java.nio.ByteBuffer.wrap(nativeInvoke).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                int i19 = order3.getInt();
                if (i19 >= 0 && i19 <= 10000) {
                    for (int i27 = 0; i27 < i19 && order3.remaining() >= 7; i27++) {
                        int i28 = order3.getShort() & 65535;
                        if (order3.remaining() < i28) {
                            break;
                        }
                        byte[] bArr3 = new byte[i28];
                        order3.get(bArr3);
                        byte b17 = order3.get();
                        int i29 = order3.getInt();
                        if (i29 < 0 || i29 > 10485760 || order3.remaining() < i29) {
                            break;
                        }
                        byte[] bArr4 = new byte[i29 + 1];
                        bArr4[0] = b17;
                        order3.get(bArr4, 1, i29);
                        linkedHashMap2.put(new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8), bArr4);
                    }
                }
                com.tencent.mars.xlog.Log.e("WAGameMISSignatureManager", "MISBundle.deserialize: invalid count=%d", java.lang.Integer.valueOf(i19));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("WAGameMISSignatureManager", "MISBundle.deserialize: exception, data may be corrupted or protocol mismatch", th6);
            }
        }
        return this.f78197b != 0;
    }

    public void b() {
        long j17;
        if (this.f78198c) {
            synchronized (this) {
                j17 = this.f78197b;
                this.f78197b = 0L;
            }
            if (j17 != 0) {
                nativeDestroy(j17);
            }
        }
    }

    public void c() {
        if (this.f78198c) {
            synchronized (this) {
                long j17 = this.f78197b;
                if (j17 != 0) {
                    nativePause(j17);
                }
            }
        }
    }

    public void d() {
        if (this.f78198c) {
            synchronized (this) {
                long j17 = this.f78197b;
                if (j17 != 0) {
                    nativeResume(j17);
                }
            }
        }
    }

    public void finalize() {
        try {
            b();
        } finally {
            super.finalize();
        }
    }

    public native void nativeBindTo(long j17, long j18, long j19, long j27, int i17);

    public native boolean nativeSignature(long j17, byte[] bArr, int i17);
}
