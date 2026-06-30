package bt3;

/* loaded from: classes9.dex */
public class l0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {
    public static bt3.p0 C;
    public com.tencent.mm.modelcdntran.q0 A;
    public final com.tencent.mm.modelcdntran.q0 B;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f24312d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f24313e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.v0 f24314f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.d f24315g;

    /* renamed from: h, reason: collision with root package name */
    public long f24316h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f24317i;

    /* renamed from: m, reason: collision with root package name */
    public final long f24318m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f24319n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f24320o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f24321p;

    /* renamed from: q, reason: collision with root package name */
    public long f24322q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f24323r;

    /* renamed from: s, reason: collision with root package name */
    public final int f24324s;

    /* renamed from: t, reason: collision with root package name */
    public int f24325t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f24326u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f24327v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24328w;

    /* renamed from: x, reason: collision with root package name */
    public final long f24329x;

    /* renamed from: y, reason: collision with root package name */
    public int f24330y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f24331z;

    public l0(java.lang.String str, com.tencent.mm.modelbase.v0 v0Var) {
        this(str, 0L, "", v0Var, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H(bt3.l0 r31, com.tencent.mm.modelcdntran.n1 r32) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.l0.H(bt3.l0, com.tencent.mm.modelcdntran.n1):void");
    }

    public static boolean J(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "fileLanDownloadFinish msgInfo is null");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "fileLanDownloadFinish msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()));
        com.tencent.mm.pluginsdk.model.app.d J0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(f9Var.getMsgId(), f9Var.Q0());
        if (J0 == null) {
            return false;
        }
        java.lang.String K = K(J0.field_createTime, f9Var.Q0(), f9Var.getMsgId());
        boolean x17 = com.tencent.mm.vfs.w6.x(str, J0.field_fileFullPath, true);
        if (x17) {
            J0.field_status = 199L;
            J0.field_offset = J0.field_totalLen;
            boolean update = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).update(J0, new java.lang.String[0]);
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (K == null) {
                K = "";
            }
            objArr[0] = K;
            objArr[1] = java.lang.Boolean.valueOf(update);
            objArr[2] = java.lang.Boolean.valueOf(x17);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "fileLanDownloadFinish mediaId:%s, updateRsult:%s, move result:%s", objArr);
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(J0.field_fileFullPath, ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Ai(J0.field_totalLen), null, null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadAppAttach", "file move fail!!! %s => %s", str, J0.field_fileFullPath);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(198L, 45L, J0.field_totalLen, false);
        g0Var.idkeyStat(198L, 46L, 1L, false);
        g0Var.idkeyStat(198L, com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 48L : 47L, 1L, false);
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(J0.field_msgInfoTalker, J0.field_msgInfoId);
        int ij6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(Li, J0);
        if (Li.P0() == 5 || ij6 != 0) {
            Li.r1(3);
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Li, J0, 0, true);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.getMsgId(), Li, true);
        } else {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(Li.Q0(), "update", Li, 0));
        }
        return true;
    }

    public static java.lang.String K(long j17, java.lang.String str, long j18) {
        return com.tencent.mm.modelcdntran.i2.b("downattach", j17, str, j18 + "");
    }

    public final void I(final int i17, final int i18, final java.lang.String str, final com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mm.storage.f9 f9Var;
        long j17;
        if (this.f24313e != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: bt3.l0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    bt3.l0.this.f24313e.onSceneEnd(i17, i18, str, m1Var);
                }
            });
            com.tencent.mm.pluginsdk.model.app.d dVar = this.f24315g;
            if (dVar != null) {
                if (i17 != 0 || i18 != 0) {
                    if (!(this.f24330y != 0)) {
                        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(this.f24330y != 0, java.lang.String.valueOf(this.f24318m), this.f24320o.I0(), false, false, this.f24320o.Q0());
                        return;
                    } else {
                        dVar.field_status = 102L;
                        ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).update(this.f24315g, new java.lang.String[0]);
                        ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(this.f24320o, this.f24315g, 0, true);
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.f24320o.getMsgId(), this.f24320o);
                        return;
                    }
                }
                ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(this.f24330y != 0, java.lang.String.valueOf(this.f24318m), this.f24320o.I0(), true, false, this.f24320o.Q0());
                if (this.f24320o.n2() && this.f24314f == null && (f9Var = this.f24320o) != null) {
                    try {
                        ot0.q v17 = ot0.q.v(f9Var.j());
                        if (v17 != null) {
                            long I0 = f9Var.I0();
                            rt0.b bVar = (rt0.b) v17.y(rt0.b.class);
                            if (bVar != null) {
                                long j18 = bVar.f399372b;
                                if (j18 != 0) {
                                    j17 = j18;
                                    ct3.d.f222303a.a(f9Var, v17, 0, j17);
                                }
                            }
                            j17 = I0;
                            ct3.d.f222303a.a(f9Var, v17, 0, j17);
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadAppAttach", "reportKVStat exception:%s", e17.getMessage());
                    }
                }
                bt3.p0 p0Var = C;
                if (p0Var != null) {
                    ((d35.h) p0Var).a(this.f24320o);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f24315g.field_fileFullPath)) {
                    ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(this.f24315g.field_fileFullPath, ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Ai(this.f24315g.field_totalLen), null, null);
                    java.lang.String str3 = this.f24315g.field_fileFullPath;
                }
                ct.w2 w2Var = (ct.w2) i95.n0.c(ct.w2.class);
                com.tencent.mm.storage.f9 msgInfo = this.f24320o;
                com.tencent.mm.pluginsdk.model.app.d3 d3Var = (com.tencent.mm.pluginsdk.model.app.d3) w2Var;
                d3Var.getClass();
                kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
                v05.b bVar2 = new v05.b();
                java.lang.String U1 = msgInfo.U1();
                if (U1 == null) {
                    U1 = "";
                }
                bVar2.fromXml(U1);
                v05.a aVar = (v05.a) bVar2.getCustom(bVar2.f432315e + 8);
                if (aVar == null || (str2 = aVar.r()) == null) {
                    str2 = "";
                }
                d3Var.Ai(msgInfo, str2, 0, "");
            }
        }
    }

    public java.lang.String L() {
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f24315g;
        return dVar == null ? "" : dVar.field_mediaSvrId;
    }

    public void M(final bt3.q0 q0Var) {
        boolean z17 = this.f24326u;
        if (!z17) {
            this.A = new com.tencent.mm.modelcdntran.q0() { // from class: bt3.l0$$c
                @Override // com.tencent.mm.modelcdntran.q0
                public final void a(com.tencent.mm.modelcdntran.n1 n1Var) {
                    bt3.l0 l0Var = bt3.l0.this;
                    l0Var.getClass();
                    if (n1Var.f71103a == com.tencent.mm.modelcdntran.m1.f71085q) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "onTask cancel mediaId:%s", l0Var.f24321p);
                        lt.g0 wi6 = ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi();
                        java.lang.String str = l0Var.f24315g.field_msgInfoTalker;
                        long j17 = l0Var.f24318m;
                        com.tencent.mm.pluginsdk.model.app.d J0 = ((com.tencent.mm.pluginsdk.model.app.e) wi6).J0(j17, str);
                        l0Var.f24315g = J0;
                        if (J0 == null) {
                            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                            java.lang.String str2 = l0Var.f24317i;
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "pause get by msgid  %s null then get by mediaId %s", valueOf, str2);
                            l0Var.f24315g = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(str2);
                        }
                        com.tencent.mm.pluginsdk.model.app.d dVar = l0Var.f24315g;
                        if (dVar == null) {
                            return;
                        }
                        dVar.field_status = 102L;
                        if (!l0Var.f24326u) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "pause done %s", java.lang.Boolean.valueOf(((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).update(l0Var.f24315g, new java.lang.String[0])));
                        }
                        bt3.q0 q0Var2 = q0Var;
                        if (q0Var2 != null) {
                            q0Var2.D6(l0Var);
                        }
                        l0Var.A = null;
                    }
                }
            };
            ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).wi(this.f24321p, new java.lang.ref.WeakReference(this.A));
        }
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f24315g;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig pause listener[%s], info[%s], justSaveFile[%b], stack[%s]", q0Var, dVar, valueOf, new com.tencent.mm.sdk.platformtools.z3());
    }

    public final boolean N() {
        lt.g0 wi6 = ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi();
        try {
            com.tencent.mm.pluginsdk.model.app.d dVar = this.f24315g;
            ot0.q v17 = ot0.q.v(pt0.f0.Li(dVar.field_msgInfoTalker, dVar.field_msgInfoId).j());
            java.lang.String n17 = v17.n();
            java.lang.String str = v17.f348690o;
            java.lang.String str2 = v17.f348710t;
            long j17 = v17.f348682m;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "tryRescueFileFromPreviousDownload title: " + n17 + ", ext: " + str + ", size: " + j17);
            java.lang.String r17 = com.tencent.mm.vfs.w6.r(this.f24315g.field_fileFullPath);
            if (!n17.endsWith(str)) {
                n17 = n17 + "." + str;
            }
            for (int i17 = 0; i17 < 20; i17++) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(r17);
                sb6.append('/');
                sb6.append(i17 == 0 ? "" : i17 + "_");
                sb6.append(n17);
                java.lang.String sb7 = sb6.toString();
                com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(sb7);
                if (m17 != null && m17.f213233c == j17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "Found same size file: " + sb7);
                    if (str2.equalsIgnoreCase(com.tencent.mm.vfs.w6.p(sb7))) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "Found same MD5 file: " + sb7);
                        com.tencent.mm.pluginsdk.model.app.e eVar = (com.tencent.mm.pluginsdk.model.app.e) wi6;
                        eVar.getClass();
                        com.tencent.mm.pluginsdk.model.app.d dVar2 = new com.tencent.mm.pluginsdk.model.app.d();
                        dVar2.field_fileFullPath = sb7;
                        if (!eVar.get(dVar2, "fileFullPath")) {
                            dVar2 = null;
                        }
                        if (dVar2 == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "No occupied, possibly table miss.");
                            this.f24315g.field_fileFullPath = sb7;
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "Occupied, copy " + sb7 + " -> " + this.f24315g.field_fileFullPath);
                            com.tencent.mm.vfs.w6.c(sb7, this.f24315g.field_fileFullPath);
                        }
                        com.tencent.mm.pluginsdk.model.app.d dVar3 = this.f24315g;
                        dVar3.field_totalLen = j17;
                        dVar3.field_offset = j17;
                        dVar3.field_status = 199L;
                        ((com.tencent.mm.pluginsdk.model.app.e) wi6).update(dVar3, new java.lang.String[0]);
                        return true;
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneDownloadAppAttach", e17, "tryRescueFileFromPreviousDownload failed.", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "No same file found.");
        return false;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        super.cancel();
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f24315g;
        if (dVar != null) {
            long j17 = dVar.field_status;
            ((com.tencent.mm.pluginsdk.model.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
            if (j17 == 101) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneDownloadAppAttach", "cancel netscene, but status is downloading!");
                M(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03a1  */
    @Override // com.tencent.mm.modelbase.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doScene(com.tencent.mm.network.s r27, com.tencent.mm.modelbase.u0 r28) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.l0.doScene(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ed, code lost:
    
        if ((r3.field_offset + r2.length) == r3.field_totalLen) goto L62;
     */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r18, int r19, int r20, java.lang.String r21, com.tencent.mm.network.v0 r22, byte[] r23) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.l0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 400;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    public l0(long j17, java.lang.String str, java.lang.String str2, com.tencent.mm.modelbase.v0 v0Var) {
        this(str2, j17, str, v0Var, 0);
        this.f24318m = j17;
    }

    public l0(long j17, java.lang.String str, long j18, int i17, com.tencent.mm.modelbase.v0 v0Var, boolean z17) {
        this.f24315g = null;
        this.f24316h = -1L;
        this.f24317i = "";
        this.f24318m = 0L;
        this.f24319n = "";
        this.f24320o = null;
        this.f24321p = "";
        this.f24322q = 0L;
        this.f24323r = "";
        this.f24324s = 0;
        this.f24325t = 0;
        this.f24326u = false;
        this.f24327v = false;
        this.f24329x = 0L;
        this.f24330y = 0;
        this.f24331z = false;
        this.A = null;
        this.B = new com.tencent.mm.modelcdntran.q0() { // from class: bt3.l0$$b
            @Override // com.tencent.mm.modelcdntran.q0
            public final void a(com.tencent.mm.modelcdntran.n1 n1Var) {
                bt3.l0.H(bt3.l0.this, n1Var);
            }
        };
        this.f24329x = j18;
        this.f24318m = j17;
        this.f24319n = str;
        com.tencent.mm.pluginsdk.model.app.d J0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(j17, str);
        this.f24315g = J0;
        this.f24314f = v0Var;
        this.f24327v = z17;
        this.f24328w = i17;
        if (J0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadAppAttach", "big appMsg, info is null, msgid = , svrId" + j17, java.lang.Long.valueOf(j18));
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(J0.field_msgInfoId);
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f24315g;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach1, msgId:%s, mediaId:%s, path:%s", valueOf, dVar.field_mediaId, dVar.field_fileFullPath);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nf0();
        lVar.f70665b = new r45.of0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/downloadappattach";
        lVar.f70667d = com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP;
        lVar.f70668e = 106;
        lVar.f70669f = 1000000106;
        this.f24312d = lVar.a();
    }

    public l0(com.tencent.mm.pluginsdk.model.app.d dVar, boolean z17) {
        this.f24316h = -1L;
        this.f24317i = "";
        this.f24318m = 0L;
        this.f24319n = "";
        this.f24320o = null;
        this.f24321p = "";
        this.f24322q = 0L;
        this.f24323r = "";
        this.f24324s = 0;
        this.f24325t = 0;
        this.f24326u = false;
        this.f24327v = false;
        this.f24329x = 0L;
        this.f24330y = 0;
        this.f24331z = false;
        this.A = null;
        this.B = new com.tencent.mm.modelcdntran.q0() { // from class: bt3.l0$$b
            @Override // com.tencent.mm.modelcdntran.q0
            public final void a(com.tencent.mm.modelcdntran.n1 n1Var) {
                bt3.l0.H(bt3.l0.this, n1Var);
            }
        };
        this.f24315g = dVar;
        this.f24326u = z17;
        java.lang.String str = dVar.field_mediaId;
        this.f24317i = str;
        this.f24314f = null;
        this.f24324s = 0;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig <init>, info is null, mediaId = " + str);
            return;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nf0();
        lVar.f70665b = new r45.of0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/downloadappattach";
        lVar.f70667d = com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP;
        lVar.f70668e = 106;
        lVar.f70669f = 1000000106;
        this.f24312d = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach2 info msgId:%s, fullpath[%s], justSaveFile[%b], stack[%s]", java.lang.Long.valueOf(dVar.field_msgInfoId), dVar.field_fileFullPath, java.lang.Boolean.valueOf(z17), new com.tencent.mm.sdk.platformtools.z3());
    }

    public l0(java.lang.String str, long j17, java.lang.String str2, com.tencent.mm.modelbase.v0 v0Var, int i17) {
        this.f24315g = null;
        this.f24316h = -1L;
        this.f24317i = "";
        this.f24318m = 0L;
        this.f24319n = "";
        this.f24320o = null;
        this.f24321p = "";
        this.f24322q = 0L;
        this.f24323r = "";
        this.f24324s = 0;
        this.f24325t = 0;
        this.f24326u = false;
        this.f24327v = false;
        this.f24329x = 0L;
        this.f24330y = 0;
        this.f24331z = false;
        this.A = null;
        this.B = new com.tencent.mm.modelcdntran.q0() { // from class: bt3.l0$$b
            @Override // com.tencent.mm.modelcdntran.q0
            public final void a(com.tencent.mm.modelcdntran.n1 n1Var) {
                bt3.l0.H(bt3.l0.this, n1Var);
            }
        };
        this.f24317i = str;
        this.f24318m = j17;
        this.f24319n = str2;
        this.f24314f = v0Var;
        this.f24324s = i17;
        com.tencent.mm.pluginsdk.model.app.d J0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(j17, str2);
        this.f24315g = J0;
        if (J0 == null) {
            this.f24315g = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(str);
        }
        if (this.f24315g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadAppAttach", "summerbig <init>, info is null, mediaId = " + str);
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f24315g.field_msgInfoId);
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f24315g;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach3, oriMsgId:%s, msgId:%s, mediaId:%s, path:%s", valueOf, valueOf2, dVar.field_mediaId, dVar.field_fileFullPath);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nf0();
        lVar.f70665b = new r45.of0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/downloadappattach";
        lVar.f70667d = com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP;
        lVar.f70668e = 106;
        lVar.f70669f = 1000000106;
        this.f24312d = lVar.a();
        com.tencent.mm.pluginsdk.model.app.d dVar2 = this.f24315g;
        java.lang.String str3 = dVar2.field_fileFullPath;
        long j18 = dVar2.field_type;
        java.lang.String str4 = this.f24315g.field_signature;
    }
}
