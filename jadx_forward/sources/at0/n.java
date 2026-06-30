package at0;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a */
    public final gt0.a f95126a;

    /* renamed from: b */
    public final ts0.r f95127b;

    /* renamed from: c */
    public ht0.b f95128c;

    /* renamed from: d */
    public ht0.b f95129d;

    /* renamed from: e */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f95130e;

    /* renamed from: f */
    public boolean f95131f;

    /* renamed from: g */
    public long f95132g;

    /* renamed from: h */
    public boolean f95133h;

    /* renamed from: i */
    public volatile boolean f95134i;

    /* renamed from: j */
    public volatile jz5.o f95135j;

    /* renamed from: k */
    public long f95136k;

    /* renamed from: l */
    public int f95137l;

    /* renamed from: m */
    public boolean f95138m;

    /* renamed from: n */
    public long f95139n;

    /* renamed from: o */
    public final dt0.b f95140o;

    /* renamed from: p */
    public volatile boolean f95141p;

    /* renamed from: q */
    public boolean f95142q;

    /* renamed from: r */
    public boolean f95143r;

    /* renamed from: s */
    public long f95144s;

    /* renamed from: t */
    public final cl0.g f95145t;

    /* renamed from: u */
    public ms0.c f95146u;

    public n(gt0.a process) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(process, "process");
        this.f95126a = process;
        this.f95130e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f95131f = true;
        this.f95135j = new jz5.o(0, 0, 0);
        this.f95137l = 1;
        this.f95139n = 2000L;
        this.f95143r = true;
        this.f95145t = new cl0.g();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewContainer", process.toString(), new java.lang.Object[0]);
        et0.q mo54891x9333e172 = process.mo54891x9333e172();
        if (process.mo54896xb3aa1275() != null) {
            this.f95146u = process.mo54896xb3aa1275();
            ms0.c mo54896xb3aa1275 = process.mo54896xb3aa1275();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo54896xb3aa1275);
            mo54891x9333e172.m(mo54896xb3aa1275, process.g());
        } else {
            at0.p pVar = new at0.p(process.g());
            this.f95146u = pVar;
            mo54891x9333e172.m(pVar, process.g());
        }
        if (!it0.c.d(java.lang.Integer.valueOf(process.mo54898x27ac0d85())) || process.g()) {
            this.f95127b = new ts0.l(process.mo132348x76847179());
            g("isUseCamera2", java.lang.Boolean.FALSE);
        } else {
            vs0.j jVar = new vs0.j(process.mo132348x76847179());
            this.f95127b = jVar;
            if (it0.c.e(process.mo54898x27ac0d85())) {
                jVar.a0();
            }
            g("isUseCamera2", java.lang.Boolean.TRUE);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f95136k = android.os.SystemClock.elapsedRealtime();
        this.f95140o = new dt0.b(process.mo132348x76847179(), process);
    }

    public static /* synthetic */ void i(at0.n nVar, boolean z17, java.lang.Float f17, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = nVar.f95131f;
        }
        if ((i17 & 2) != 0) {
            f17 = null;
        }
        if ((i17 & 4) != 0) {
            lVar = null;
        }
        nVar.h(z17, f17, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        long j17;
        java.lang.String str;
        at0.t tVar;
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        java.lang.String str4;
        boolean z17;
        ts0.r rVar;
        ht0.b a17;
        boolean a18;
        ht0.o0 o0Var;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        gt0.a aVar = this.f95126a;
        ht0.b mo54899x4c36e634 = aVar.mo54899x4c36e634();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "createRecorder: " + this.f95128c + ", useCpuCrop:" + aVar.g() + ", process.getRecorder():" + mo54899x4c36e634 + ", mute:" + aVar.mo54903xb9a62e63());
        ht0.b bVar = this.f95128c;
        if (bVar != null) {
            bVar.mo127742xae7a2e7a();
            bVar.mo127743x5a5b64d();
        }
        ht0.b bVar2 = this.f95129d;
        if (bVar2 != null) {
            bVar2.mo127742xae7a2e7a();
            bVar2.mo127743x5a5b64d();
        }
        ct0.a mo54894x11cfd76e = aVar.mo54894x11cfd76e();
        if (mo54899x4c36e634 != null) {
            this.f95128c = mo54899x4c36e634;
            j17 = elapsedRealtime;
        } else {
            boolean g17 = aVar.g();
            at0.t tVar2 = at0.t.f95162a;
            ts0.r camera = this.f95127b;
            if (g17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCpuCrop");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 8L, 1L);
                int c17 = mo54894x11cfd76e.c();
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoPara = aVar.mo54902x402de963();
                ms0.c mo54897xbfb4fd2a = aVar.mo54897xbfb4fd2a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPara, "videoPara");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
                if (c17 == 2) {
                    if (mo54897xbfb4fd2a == null) {
                        at0.t.f95163b = new at0.q();
                    } else {
                        at0.t.f95163b = mo54897xbfb4fd2a;
                    }
                    ms0.c cVar = at0.t.f95163b;
                    if (cVar == null || camera.z() == null) {
                        j17 = elapsedRealtime;
                    } else {
                        j17 = elapsedRealtime;
                        android.graphics.Point point = new android.graphics.Point(ts0.c.f503076c, ts0.c.f503075b);
                        cVar.u(point.x, point.y);
                        cVar.r(ts0.c.f503077d);
                        cVar.m(ts0.c.f503081h);
                    }
                    ht0.s sVar = new ht0.s(videoPara, at0.t.f95163b, null, -1, null);
                    camera.k(sVar.Z);
                    o0Var = sVar;
                } else {
                    j17 = elapsedRealtime;
                    ht0.o0 o0Var2 = new ht0.o0(videoPara);
                    if (camera.z() != null) {
                        o0Var2.mo127753x1849c2c1(ts0.c.f503081h);
                    }
                    camera.k(o0Var2.O);
                    o0Var = o0Var2;
                }
                a17 = o0Var;
                str = "MicroMsg.MediaEditorIDKeyStat";
                str3 = "gpu crop, preview view egl context is null!!!";
                str4 = "markGpuCropFailed";
                rVar = camera;
                tVar = tVar2;
                i17 = 2;
                z17 = false;
                str2 = "markGpuCrop";
            } else {
                j17 = elapsedRealtime;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markGpuCrop");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.C(985L, 7L, 1L);
                if (aVar.mo54891x9333e172().mo8977xe0fe423b() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraPreviewContainer", "gpu crop, preview view egl context is null!!!");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markGpuCropFailed");
                    g0Var.C(985L, 10L, 1L);
                    return false;
                }
                int c18 = mo54894x11cfd76e.c();
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54902x402de963 = aVar.mo54902x402de963();
                android.opengl.EGLContext mo8977xe0fe423b = aVar.mo54891x9333e172().mo8977xe0fe423b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo8977xe0fe423b);
                str = "MicroMsg.MediaEditorIDKeyStat";
                tVar = tVar2;
                str2 = "markGpuCrop";
                i17 = 2;
                str3 = "gpu crop, preview view egl context is null!!!";
                str4 = "markGpuCropFailed";
                z17 = false;
                rVar = camera;
                a17 = tVar2.a(c18, mo54902x402de963, camera, mo8977xe0fe423b, aVar.mo54891x9333e172(), aVar.mo54897xbfb4fd2a());
            }
            this.f95128c = a17;
            if (aVar.mo54894x11cfd76e().c() == i17) {
                a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.a(z17, aVar.mo54902x402de963().f152723J == 1 ? true : z17);
            } else {
                a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.a(true, aVar.mo54902x402de963().K == 1 ? true : z17);
            }
            g("RecordMuxerType", java.lang.Boolean.valueOf(a18));
            if (aVar.j() && !aVar.g()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.C(985L, 7L, 1L);
                if (aVar.mo54891x9333e172().mo8977xe0fe423b() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraPreviewContainer", str3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str4);
                    g0Var2.C(985L, 10L, 1L);
                    return z17;
                }
                int c19 = mo54894x11cfd76e.c();
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54892x7cd80487 = aVar.mo54892x7cd80487();
                android.opengl.EGLContext mo8977xe0fe423b2 = aVar.mo54891x9333e172().mo8977xe0fe423b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo8977xe0fe423b2);
                this.f95129d = tVar.a(c19, mo54892x7cd80487, rVar, mo8977xe0fe423b2, aVar.mo54891x9333e172(), aVar.mo54897xbfb4fd2a());
            }
        }
        ht0.b bVar3 = this.f95128c;
        if (bVar3 != null) {
            bVar3.mo127749x764d819b(aVar.mo54903xb9a62e63());
        }
        ht0.b bVar4 = this.f95129d;
        if (bVar4 != null) {
            bVar4.mo127749x764d819b(true);
        }
        aVar.mo54891x9333e172().mo8988x4ac79299(new at0.b(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "create recorder finish");
        g("REPORT_CREATE_RECORDER", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17));
        return true;
    }

    public final void b(ts0.c cVar) {
        int i17;
        ht0.b bVar = this.f95128c;
        if (bVar != null) {
            cVar.getClass();
            bVar.r(ts0.c.f503076c, ts0.c.f503075b, ts0.c.f503079f, ts0.c.f503080g);
        }
        gt0.a aVar = this.f95126a;
        if (bVar != null) {
            bVar.f(aVar.mo54894x11cfd76e().mo483x5000ed37());
        }
        if (bVar != null) {
            bVar.w(aVar.mo54894x11cfd76e().b());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filePath : ");
        sb6.append(bVar != null ? bVar.mo127744x5000ed37() : null);
        sb6.append("   thumbPath : ");
        sb6.append(bVar != null ? bVar.b() : null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewContainer", sb6.toString(), new java.lang.Object[0]);
        ht0.b bVar2 = this.f95129d;
        if (bVar2 != null) {
            cVar.getClass();
            bVar2.r(ts0.c.f503076c, ts0.c.f503075b, ts0.c.f503079f, ts0.c.f503080g);
        }
        if (bVar2 != null) {
            bVar2.f(aVar.mo54894x11cfd76e().mo483x5000ed37() + "_daemon");
        }
        if (bVar2 != null) {
            bVar2.w(aVar.mo54894x11cfd76e().b() + "_daemon");
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("filePath : ");
        sb7.append(bVar2 != null ? bVar2.mo127744x5000ed37() : null);
        sb7.append("   thumbPath : ");
        sb7.append(bVar2 != null ? bVar2.b() : null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewContainer", sb7.toString(), new java.lang.Object[0]);
        if (ts0.d.f503083a.a()) {
            i17 = 0;
        } else {
            cVar.getClass();
            i17 = ts0.c.f503077d;
        }
        ht0.b bVar3 = this.f95128c;
        boolean k17 = bVar3 != null ? bVar3.k(i17) : false;
        ht0.b bVar4 = this.f95129d;
        boolean k18 = bVar4 != null ? bVar4.k(i17) : false;
        ht0.b bVar5 = this.f95129d;
        if ((bVar5 instanceof ht0.s) && (this.f95128c instanceof ht0.s)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bVar5, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.MediaCodecMP4MuxRecorder");
            ht0.s sVar = (ht0.s) bVar5;
            ht0.b bVar6 = this.f95128c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bVar6, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.MediaCodecMP4MuxRecorder");
            ht0.a aVar2 = ((ht0.s) bVar6).f366293h;
            if (aVar2 != null) {
                sVar.S = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h sightEncode = sVar.f366302q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sightEncode, "sightEncode");
                aVar2.f366193J.add(sightEncode);
            }
        }
        ht0.b bVar7 = this.f95129d;
        if ((bVar7 instanceof ht0.o0) && (this.f95128c instanceof ht0.o0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bVar7, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.X264YUVMP4MuxRecorder");
            ht0.o0 o0Var = (ht0.o0) bVar7;
            ht0.b bVar8 = this.f95128c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bVar8, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.X264YUVMP4MuxRecorder");
            ht0.a aVar3 = ((ht0.o0) bVar8).f366256a;
            if (aVar3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h sightEncode2 = o0Var.D;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sightEncode2, "sightEncode");
                aVar3.f366193J.add(sightEncode2);
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewContainer", "init recorder ret:" + k17 + "  daemonRet:" + k18, new java.lang.Object[0]);
        this.f95138m = k17;
    }

    public final void c(float f17, float f18, int i17, int i18, long j17) {
        if (this.f95137l == 0) {
            this.f95127b.f(f17, f18, i17, i18, j17);
        }
    }

    public final void d() {
        ts0.r rVar = this.f95127b;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "release");
            ((ts0.b) rVar).H();
            rVar.mo167002x41012807();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CameraPreviewContainer", e17, "camera release error:" + e17.getMessage(), new java.lang.Object[0]);
        }
        dt0.b bVar = this.f95140o;
        bVar.f324656d.disable();
        bVar.f324654b = null;
        at0.t.f95163b = null;
        this.f95126a.mo54891x9333e172().mo8984x41012807();
        ht0.b bVar2 = this.f95128c;
        if (bVar2 != null) {
            bVar2.mo127742xae7a2e7a();
        }
        ht0.b bVar3 = this.f95128c;
        if (bVar3 != null) {
            bVar3.mo127743x5a5b64d();
        }
        ht0.b bVar4 = this.f95129d;
        if (bVar4 != null) {
            bVar4.mo127742xae7a2e7a();
        }
        ht0.b bVar5 = this.f95129d;
        if (bVar5 != null) {
            bVar5.mo127743x5a5b64d();
        }
        this.f95146u = null;
    }

    public final void e() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "cancelRecord");
            ht0.b bVar = this.f95128c;
            if (bVar != null) {
                bVar.mo127742xae7a2e7a();
            }
            ht0.b bVar2 = this.f95128c;
            if (bVar2 != null) {
                bVar2.mo127743x5a5b64d();
            }
            ht0.b bVar3 = this.f95129d;
            if (bVar3 != null) {
                bVar3.mo127742xae7a2e7a();
            }
            ht0.b bVar4 = this.f95129d;
            if (bVar4 != null) {
                bVar4.mo127743x5a5b64d();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CameraPreviewContainer", e17, "cancel record error", new java.lang.Object[0]);
        }
        ts0.r rVar = this.f95127b;
        if (((ts0.b) rVar).G()) {
            a();
            ts0.c z17 = rVar.z();
            if (z17 != null) {
                b(z17);
            }
        }
    }

    public final void f(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "setRecordMiniTime:" + j17);
        this.f95139n = j17;
    }

    public final void g(java.lang.String str, java.lang.Object obj) {
        this.f95145t.h(str, obj);
    }

    public final void h(boolean z17, java.lang.Float f17, yz5.l lVar) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        g("OpenCameraTimeStamp", java.lang.Long.valueOf(elapsedRealtime));
        if (this.f95137l == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraPreviewContainer", "startPreview, already in preview state");
            return;
        }
        this.f95137l = 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreview process.useCpuCrop():");
        gt0.a aVar = this.f95126a;
        sb6.append(aVar.g());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewContainer", sb6.toString(), new java.lang.Object[0]);
        this.f95131f = z17;
        if (!z17 && !it0.c.f376021c) {
            this.f95131f = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "force useBackGroundCamera");
        }
        if (this.f95131f && !it0.c.f376022d) {
            this.f95131f = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "force useFrontGroundCamera");
        }
        ts0.r rVar = this.f95127b;
        rVar.c(aVar.mo132348x76847179(), this.f95131f);
        if (aVar.g()) {
            rVar.k(aVar.mo54891x9333e172().mo8978x89bef366());
        }
        g("CameraOpenCost", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        aVar.mo54891x9333e172().u(new at0.d(this, f17, lVar));
    }

    public final boolean j(boolean z17, int i17) {
        ht0.b bVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewContainer", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b, new java.lang.Object[0]);
        if (this.f95127b.z() == null || (bVar = this.f95128c) == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewContainer", "cameraConfig is null", new java.lang.Object[0]);
            return false;
        }
        if (!this.f95138m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "startRecord, initRecorder failed");
            return false;
        }
        if (bVar != null) {
            bVar.mo127753x1849c2c1(ts0.c.f503081h && this.f95143r);
        }
        int i18 = ts0.d.f503083a.a() ? 0 : ts0.c.f503077d;
        ht0.b bVar2 = this.f95128c;
        java.lang.Integer valueOf = bVar2 != null ? java.lang.Integer.valueOf(bVar2.y(i18, z17, i17)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "start record ret:" + valueOf);
        java.lang.Integer num = -1;
        if (this.f95126a.j()) {
            ht0.b bVar3 = this.f95129d;
            if (bVar3 != null) {
                bVar3.mo127753x1849c2c1(ts0.c.f503081h && this.f95143r);
            }
            ht0.b bVar4 = this.f95129d;
            num = bVar4 != null ? java.lang.Integer.valueOf(bVar4.y(i18, z17, i17)) : null;
        }
        if ((valueOf == null || valueOf.intValue() != 0) && (num == null || num.intValue() != 0)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "start record base ret:" + valueOf + " daemon ret:" + num + " ,use daemon record:" + this.f95126a.j());
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f95132g = android.os.SystemClock.elapsedRealtime();
        this.f95133h = true;
        this.f95141p = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 147L, 1L, false);
        return true;
    }

    public final void k() {
        ts0.r rVar = this.f95127b;
        if (this.f95137l == 1) {
            return;
        }
        this.f95137l = 1;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewContainer", "stopPreview", new java.lang.Object[0]);
        try {
            rVar.mo167002x41012807();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CameraPreviewContainer", e17, "camera relase error:" + e17.getMessage(), new java.lang.Object[0]);
        }
        gt0.a aVar = this.f95126a;
        rVar.q(aVar.mo54891x9333e172().mo8978x89bef366());
        aVar.mo54891x9333e172().j();
        if (this.f95142q) {
            return;
        }
        this.f95140o.a(false, null);
    }

    public final boolean l(yz5.l lVar) {
        if (!this.f95133h) {
            return true;
        }
        this.f95133h = false;
        long j17 = this.f95132g;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < this.f95139n) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewContainer", "stopRecord " + (android.os.SystemClock.elapsedRealtime() - this.f95132g), new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 148L, 1L, false);
            e();
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewContainer", "stopRecord start", new java.lang.Object[0]);
        rs0.a aVar = new rs0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new ct0.b(null, null, false, 0, 0, null, null, 0, 0, null, null, null, false, null, null, 0, 65535, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var2.f391656d = new at0.g(h0Var, this, lVar);
        if (this.f95126a.j()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 149L, 1L, false);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ht0.b bVar = this.f95128c;
        h0Var3.f391656d = bVar;
        if (bVar != null) {
            bVar.g(new at0.e(this, h0Var3, aVar, h0Var, f0Var, h0Var2, lVar));
        }
        ht0.b bVar2 = this.f95129d;
        if (bVar2 == null) {
            return true;
        }
        bVar2.g(new at0.f(this, aVar, h0Var, f0Var, h0Var2, lVar));
        return true;
    }

    public final boolean m(boolean z17) {
        if (!it0.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "only one camera,forbid switch");
            return !it0.c.f376021c;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("flipCamera time space:");
        long j17 = this.f95136k;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", sb6.toString());
        if (!z17) {
            if (android.os.SystemClock.elapsedRealtime() - this.f95136k < 1000) {
                return this.f95131f;
            }
        }
        this.f95136k = android.os.SystemClock.elapsedRealtime();
        if (this.f95133h) {
            ht0.b bVar = this.f95128c;
            if (bVar != null) {
                bVar.mo127747x65825f6();
            }
            ht0.b bVar2 = this.f95129d;
            if (bVar2 != null) {
                bVar2.mo127747x65825f6();
            }
        }
        this.f95126a.mo54891x9333e172().y();
        this.f95131f = ((ts0.b) this.f95127b).M();
        ts0.c z19 = this.f95127b.z();
        boolean z27 = false;
        if (!this.f95142q) {
            this.f95140o.a(!this.f95131f && this.f95126a.m(), z19);
        }
        if (z19 != null) {
            this.f95126a.mo54891x9333e172().w(z19);
            if (!ts0.d.f503083a.a()) {
                ms0.c cVar = at0.t.f95163b;
                if (cVar != null) {
                    cVar.u(ts0.c.f503076c, ts0.c.f503075b);
                }
                ms0.c cVar2 = at0.t.f95163b;
                if (cVar2 != null) {
                    cVar2.r(ts0.c.f503077d);
                }
                ms0.c cVar3 = at0.t.f95163b;
                if (cVar3 != null) {
                    cVar3.m(ts0.c.f503081h);
                }
                ht0.b bVar3 = this.f95128c;
                if (bVar3 != null) {
                    bVar3.mo127753x1849c2c1(ts0.c.f503081h && this.f95143r);
                }
                ht0.b bVar4 = this.f95129d;
                if (bVar4 != null) {
                    if (ts0.c.f503081h && this.f95143r) {
                        z27 = true;
                    }
                    bVar4.mo127753x1849c2c1(z27);
                }
            }
            ht0.b bVar5 = this.f95128c;
            if (bVar5 != null) {
                bVar5.r(ts0.c.f503076c, ts0.c.f503075b, ts0.c.f503079f, ts0.c.f503080g);
            }
            ht0.b bVar6 = this.f95129d;
            if (bVar6 != null) {
                bVar6.r(ts0.c.f503076c, ts0.c.f503075b, ts0.c.f503079f, ts0.c.f503080g);
            }
            if (this.f95133h) {
                this.f95135j = new jz5.o(java.lang.Integer.valueOf(ts0.c.f503077d), java.lang.Integer.valueOf(ts0.c.f503076c), java.lang.Integer.valueOf(ts0.c.f503075b));
                this.f95134i = true;
            }
        }
        return this.f95131f;
    }

    public final void n(java.lang.String tag, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f95127b.h(tag, z17);
    }

    public final void o(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ts0.r rVar = this.f95127b;
        if (!((ts0.b) rVar).G()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraPreviewContainer", "camera.isCameraPreviewing : false");
            callback.mo146xb9724478(null);
            return;
        }
        int[] iArr = it0.c.f376019a;
        gt0.a process = this.f95126a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(process, "process");
        int mo54898x27ac0d85 = process.mo54898x27ac0d85();
        if (((mo54898x27ac0d85 == 1 || mo54898x27ac0d85 == 2 || mo54898x27ac0d85 == 9) && it0.c.c() && it0.c.d(java.lang.Integer.valueOf(process.mo54898x27ac0d85())) && it0.c.b()) && !it0.c.e(process.mo54898x27ac0d85())) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            rVar.x(new at0.h(this, android.os.SystemClock.elapsedRealtime(), callback));
            return;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ms0.c cVar = this.f95146u;
        if (cVar != null) {
            cVar.q(new at0.i(this, callback, elapsedRealtime));
            cVar.s();
        }
    }

    public final void p(boolean z17, boolean z18, int i17) {
        if (this.f95137l == 0) {
            this.f95127b.t(z17, z18, i17);
        }
    }
}
