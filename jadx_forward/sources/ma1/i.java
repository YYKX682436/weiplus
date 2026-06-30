package ma1;

/* loaded from: classes7.dex */
public class i extends ma1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f72803x366c91de = 666;

    /* renamed from: NAME */
    public static final java.lang.String f72804x24728b = "operateGameRecorder";

    /* renamed from: g, reason: collision with root package name */
    public final ma1.a f406698g = new ma1.a();

    /* renamed from: h, reason: collision with root package name */
    public u81.f f406699h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f406700i = null;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        java.lang.String optString = jSONObject.optString("operationType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: operating game screen recorder: %s json: %s", optString, jSONObject.toString());
        if (((p60.u) ((p60.x) i95.n0.c(p60.x.class))).Bi(c0Var.mo48798x74292566(), c0Var.t3().u0().f158814g).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameJsApiScreenRecorderOperate", "is game living");
            F(c0Var, i17, 1, 112, "game is living, not support record now");
            return;
        }
        if (!"start".equalsIgnoreCase(optString)) {
            if ("pause".equalsIgnoreCase(optString)) {
                if (!c0Var.V0().l2()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: current game is not in foreground. ignore pause!");
                    F(c0Var, i17, 2, -2, "can not pause in background");
                    return;
                }
                ta1.q0 b17 = ta1.q0.b(c0Var.mo48798x74292566(), c0Var);
                ta1.t0 t0Var = new ta1.t0() { // from class: ma1.i$$c
                    @Override // ta1.t0
                    public final void a(int i18, int i19, java.lang.String str, java.lang.Object obj) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = c0Var;
                        int i27 = i17;
                        ma1.i iVar = ma1.i.this;
                        iVar.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: pause result %d, %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                        if (i18 != 0 || i19 != 0) {
                            iVar.F(e9Var, i27, i18, i19, str);
                        } else {
                            iVar.G(e9Var, i27, null);
                            iVar.f406698g.y(e9Var);
                        }
                    }
                };
                b17.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger pause");
                b17.f498198a.m77784x795fa299(new ta1.d0(b17, t0Var));
                return;
            }
            if ("resume".equalsIgnoreCase(optString)) {
                if (!c0Var.V0().l2()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: current game is not in foreground. ignore resume!");
                    F(c0Var, i17, 2, -2, "can not resume in background");
                    return;
                }
                ta1.q0 b18 = ta1.q0.b(c0Var.mo48798x74292566(), c0Var);
                ta1.t0 t0Var2 = new ta1.t0() { // from class: ma1.i$$a
                    @Override // ta1.t0
                    public final void a(int i18, int i19, java.lang.String str, java.lang.Object obj) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = c0Var;
                        int i27 = i17;
                        ma1.i iVar = ma1.i.this;
                        iVar.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: resume result %d, %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                        if (i18 != 0 || i19 != 0) {
                            iVar.F(e9Var, i27, i18, i19, str);
                        } else {
                            iVar.G(e9Var, i27, null);
                            iVar.f406698g.z(e9Var);
                        }
                    }
                };
                b18.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger resume");
                b18.f498198a.m77784x795fa299(new ta1.e0(b18, t0Var2));
                return;
            }
            if ("abort".equalsIgnoreCase(optString)) {
                ta1.q0 b19 = ta1.q0.b(c0Var.mo48798x74292566(), c0Var);
                ta1.t0 t0Var3 = new ta1.t0() { // from class: ma1.i$$g
                    @Override // ta1.t0
                    public final void a(int i18, int i19, java.lang.String str, java.lang.Object obj) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = c0Var;
                        int i27 = i17;
                        ma1.i iVar = ma1.i.this;
                        iVar.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: abort result %d, %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                        if (i18 != 0 || i19 != 0) {
                            iVar.F(e9Var, i27, i18, i19, str);
                            return;
                        }
                        iVar.G(e9Var, i27, null);
                        ma1.a aVar = iVar.f406698g;
                        aVar.u(e9Var);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch abort");
                        java.util.HashMap hashMap = new java.util.HashMap(1);
                        hashMap.put("state", "abort");
                        aVar.t(hashMap);
                        aVar.m();
                    }
                };
                b19.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger abort");
                b19.f498198a.m77784x795fa299(new ta1.h0(b19, t0Var3));
                return;
            }
            if (!"stop".equalsIgnoreCase(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: invalid operate type: %s", optString);
                c0Var.a(i17, o(java.lang.String.format("fail: not valid operate type: %s", optString)));
                return;
            }
            ta1.q0 b27 = ta1.q0.b(c0Var.mo48798x74292566(), c0Var);
            ta1.t0 t0Var4 = new ta1.t0() { // from class: ma1.i$$f
                @Override // ta1.t0
                public final void a(int i18, int i19, java.lang.String str, java.lang.Object obj) {
                    ta1.r0 r0Var;
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = c0Var;
                    final int i27 = i17;
                    ta1.p0 p0Var = (ta1.p0) obj;
                    final ma1.i iVar = ma1.i.this;
                    iVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: stop result %d, %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                    if (i18 != 0 || i19 != 0) {
                        iVar.F(e9Var, i27, i18, i19, str);
                        return;
                    }
                    iVar.f406700i = null;
                    if (p0Var == null || (r0Var = p0Var.f498193a) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((ma1.c) r0Var).f406685a)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: callback ok without path!");
                        iVar.F(e9Var, i27, 1, -1, "stop success without filePath!");
                    } else {
                        final ma1.c cVar = (ma1.c) p0Var.f498193a;
                        final ma1.c cVar2 = (ma1.c) p0Var.f498194b;
                        ta1.q0 b28 = ta1.q0.b(e9Var.mo48798x74292566(), e9Var);
                        b28.f498198a.m77784x795fa299(new ta1.j0(b28, cVar.f406685a, new ta1.t0() { // from class: ma1.i$$h
                            @Override // ta1.t0
                            public final void a(int i28, int i29, java.lang.String str2, java.lang.Object obj2) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = e9Var;
                                int i37 = i27;
                                ta1.k0 k0Var = (ta1.k0) obj2;
                                ma1.i iVar2 = ma1.i.this;
                                iVar2.getClass();
                                if (i28 != 0 || i29 != 0) {
                                    iVar2.F(e9Var2, i37, i28, i29, str2);
                                    return;
                                }
                                java.util.HashMap hashMap = new java.util.HashMap();
                                ma1.c cVar3 = cVar;
                                hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, cVar3.f406686b);
                                ma1.c cVar4 = cVar2;
                                hashMap.put("thumbPath", cVar4.f406686b);
                                iVar2.G(e9Var2, i37, hashMap);
                                long j17 = k0Var.f498169a * 1000;
                                long j18 = k0Var.f498170b;
                                ma1.a aVar = iVar2.f406698g;
                                aVar.u(e9Var2);
                                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                                java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
                                java.lang.String str3 = cVar3.f406686b;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch stop: %s, %d, %d", str3, valueOf, valueOf2);
                                java.util.HashMap hashMap2 = new java.util.HashMap(4);
                                hashMap2.put("state", "stop");
                                hashMap2.put("tempFilePath", str3);
                                hashMap2.put("tempThumbPath", cVar4.f406686b);
                                hashMap2.put("duration", java.lang.Long.valueOf(j17));
                                hashMap2.put("fileSize", java.lang.Long.valueOf(j18));
                                aVar.t(hashMap2);
                                aVar.m();
                            }
                        }));
                    }
                }
            };
            b27.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger stop");
            b27.f498198a.m77784x795fa299(new ta1.g0(b27, t0Var4));
            return;
        }
        ce.g gVar = (pa1.a) c0Var.V0().B1(pa1.a.class);
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = gVar == null ? null : ((ce.o) gVar).f122219g;
        if (c4216x654bedf2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: cannot retrieve magicbrush view!");
            F(c0Var, i17, 1, 111, "game view not prepared");
            return;
        }
        if (!c0Var.V0().l2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: current game is not in foreground. ignore start!");
            F(c0Var, i17, 2, -2, "can not start in background");
            return;
        }
        qa1.u uVar = (qa1.u) c4216x654bedf2.getF130185e();
        int mo159663x40edc78f = uVar.mo159663x40edc78f();
        int mo159661xc2fc307e = uVar.mo159661xc2fc307e();
        int optInt = jSONObject.optInt("duration");
        int optInt2 = jSONObject.optInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1);
        int optInt3 = jSONObject.optInt(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63) * 1000;
        int optInt4 = jSONObject.optInt("gop");
        boolean optBoolean = jSONObject.optBoolean("hookBgm", true);
        if (c0Var.mo50354x59eafec1() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: not file system");
            F(c0Var, i17, 1, -1, "no file system!");
            return;
        }
        ma1.c C = C(c0Var, "src_game_screenrecord.mp4", true);
        ma1.c C2 = C(c0Var, "src_game_screenrecord_thumb.jpg", true);
        if (C == null || C2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: WAGameJsApiScreenRecorderOperate, alloc file failed");
            F(c0Var, i17, 1, -1, "internal create file failed!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: given duration: %d, fps: %d, bitrate: %d, gop: %d, width: %d, height: %d, srcFileName: %s, srcThumbPath: %s, hookBgm: %b", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt2), java.lang.Integer.valueOf(optInt3), java.lang.Integer.valueOf(optInt4), java.lang.Integer.valueOf(mo159663x40edc78f), java.lang.Integer.valueOf(mo159661xc2fc307e), C.f406685a, C2.f406685a, java.lang.Boolean.valueOf(optBoolean));
        ta1.s0 s0Var = new ta1.s0();
        s0Var.f498208a = mo159663x40edc78f;
        s0Var.f498209b = mo159661xc2fc307e;
        s0Var.f498215h = optInt;
        s0Var.f498212e = optInt2;
        s0Var.f498213f = optInt3;
        s0Var.f498214g = optInt4;
        s0Var.f498210c = C;
        s0Var.f498211d = C2;
        s0Var.f498216i = optBoolean;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ta1.q0 b28 = ta1.q0.b(c0Var.mo48798x74292566(), c0Var);
        ta1.t0 t0Var5 = new ta1.t0() { // from class: ma1.i$$d
            @Override // ta1.t0
            public final void a(int i18, int i19, java.lang.String str, java.lang.Object obj) {
                final ma1.i iVar = ma1.i.this;
                long j17 = elapsedRealtime;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2 = c0Var;
                int i27 = i17;
                iVar.getClass();
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: request start done! using: %d ms, %d, %d, %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                if (i18 != 0 || i19 != 0) {
                    iVar.F(c0Var2, i27, i18, i19, str);
                    return;
                }
                iVar.f406700i = c0Var2.mo48798x74292566();
                iVar.f406699h = new u81.f() { // from class: ma1.i$$i
                    @Override // u81.f
                    public final void D(java.lang.String str2, u81.b bVar) {
                        final ma1.i iVar2 = ma1.i.this;
                        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var3 = c0Var2;
                        iVar2.getClass();
                        if (bVar == u81.b.BACKGROUND && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && str2.equals(iVar2.f406700i)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: %s trigger background, pause recording", str2);
                            ta1.q0 b29 = ta1.q0.b(c0Var3.mo48798x74292566(), c0Var3);
                            ta1.t0 t0Var6 = new ta1.t0() { // from class: ma1.i$$j
                                @Override // ta1.t0
                                public final void a(int i28, int i29, java.lang.String str3, java.lang.Object obj2) {
                                    ma1.i iVar3 = ma1.i.this;
                                    iVar3.getClass();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: active pause result %d, %d, %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), str3);
                                    if (i28 == 0 && i29 == 0) {
                                        iVar3.f406698g.y(c0Var3);
                                    }
                                }
                            };
                            b29.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger pause");
                            b29.f498198a.m77784x795fa299(new ta1.d0(b29, t0Var6));
                            return;
                        }
                        if (bVar == u81.b.FOREGROUND && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && str2.equals(iVar2.f406700i)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: %s trigger foreground, resume recording", str2);
                            ta1.q0 b37 = ta1.q0.b(c0Var3.mo48798x74292566(), c0Var3);
                            ta1.t0 t0Var7 = new ta1.t0() { // from class: ma1.i$$k
                                @Override // ta1.t0
                                public final void a(int i28, int i29, java.lang.String str3, java.lang.Object obj2) {
                                    ma1.i iVar3 = ma1.i.this;
                                    iVar3.getClass();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: active resume result %d, %d, %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), str3);
                                    if (i28 == 0 && i29 == 0) {
                                        iVar3.f406698g.z(c0Var3);
                                    }
                                }
                            };
                            b37.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger resume");
                            b37.f498198a.m77784x795fa299(new ta1.e0(b37, t0Var7));
                            return;
                        }
                        if (bVar == u81.b.DESTROYED) {
                            java.util.Map map = ta1.q0.f498196g;
                            synchronized (ta1.q0.class) {
                                ((java.util.HashMap) ta1.q0.f498196g).remove(str2);
                            }
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && str2.equals(iVar2.f406700i)) {
                                ta1.q0 b38 = ta1.q0.b(c0Var3.mo48798x74292566(), c0Var3);
                                ma1.C29122x3046d9 c29122x3046d9 = new ma1.C29122x3046d9();
                                b38.getClass();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger abort");
                                b38.f498198a.m77784x795fa299(new ta1.h0(b38, c29122x3046d9));
                            }
                            iVar2.f406700i = null;
                            if (c0Var3.t3() == null || c0Var3.t3().N == null) {
                                return;
                            }
                            c0Var3.t3().N.c(iVar2.f406699h);
                        }
                    }
                };
                if (c0Var2.t3() != null && c0Var2.t3().N != null) {
                    c0Var2.t3().N.a(iVar.f406699h);
                }
                iVar.G(c0Var2, i27, null);
                ma1.a aVar = iVar.f406698g;
                aVar.u(c0Var2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch start");
                java.util.HashMap hashMap = new java.util.HashMap(1);
                hashMap.put("state", "start");
                aVar.t(hashMap);
                aVar.m();
            }
        };
        ma1.C29125x3046dc c29125x3046dc = new ma1.C29125x3046dc(this, c0Var);
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf22 = (com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2) b28.f498199b.f498138b.get();
        if (c4216x654bedf22 != null) {
            c4216x654bedf22.e(false, 1, new ta1.a0(b28, t0Var5, s0Var, c29125x3046dc, c4216x654bedf22));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecorderMgr", "hy: view lost");
            t0Var5.a(1, -2, "view lost", null);
        }
    }

    public final void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, int i18, int i19, java.lang.String str) {
        java.lang.String format = java.lang.String.format("fail: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("errCode", java.lang.Integer.valueOf(i19));
        e9Var.a(i17, p(format, hashMap));
        this.f406698g.x(e9Var, i19, str);
    }

    public final void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("errCode", 0);
        if (map != null) {
            hashMap.putAll(map);
        }
        e9Var.a(i17, p("ok", hashMap));
    }
}
