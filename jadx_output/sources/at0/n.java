package at0;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a */
    public final gt0.a f13593a;

    /* renamed from: b */
    public final ts0.r f13594b;

    /* renamed from: c */
    public ht0.b f13595c;

    /* renamed from: d */
    public ht0.b f13596d;

    /* renamed from: e */
    public final com.tencent.mm.sdk.platformtools.n3 f13597e;

    /* renamed from: f */
    public boolean f13598f;

    /* renamed from: g */
    public long f13599g;

    /* renamed from: h */
    public boolean f13600h;

    /* renamed from: i */
    public volatile boolean f13601i;

    /* renamed from: j */
    public volatile jz5.o f13602j;

    /* renamed from: k */
    public long f13603k;

    /* renamed from: l */
    public int f13604l;

    /* renamed from: m */
    public boolean f13605m;

    /* renamed from: n */
    public long f13606n;

    /* renamed from: o */
    public final dt0.b f13607o;

    /* renamed from: p */
    public volatile boolean f13608p;

    /* renamed from: q */
    public boolean f13609q;

    /* renamed from: r */
    public boolean f13610r;

    /* renamed from: s */
    public long f13611s;

    /* renamed from: t */
    public final cl0.g f13612t;

    /* renamed from: u */
    public ms0.c f13613u;

    public n(gt0.a process) {
        kotlin.jvm.internal.o.g(process, "process");
        this.f13593a = process;
        this.f13597e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f13598f = true;
        this.f13602j = new jz5.o(0, 0, 0);
        this.f13604l = 1;
        this.f13606n = 2000L;
        this.f13610r = true;
        this.f13612t = new cl0.g();
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", process.toString(), new java.lang.Object[0]);
        et0.q cameraPreviewView = process.getCameraPreviewView();
        if (process.getPreviewRenderer() != null) {
            this.f13613u = process.getPreviewRenderer();
            ms0.c previewRenderer = process.getPreviewRenderer();
            kotlin.jvm.internal.o.d(previewRenderer);
            cameraPreviewView.m(previewRenderer, process.g());
        } else {
            at0.p pVar = new at0.p(process.g());
            this.f13613u = pVar;
            cameraPreviewView.m(pVar, process.g());
        }
        if (!it0.c.d(java.lang.Integer.valueOf(process.getRecordScene())) || process.g()) {
            this.f13594b = new ts0.l(process.getContext());
            g("isUseCamera2", java.lang.Boolean.FALSE);
        } else {
            vs0.j jVar = new vs0.j(process.getContext());
            this.f13594b = jVar;
            if (it0.c.e(process.getRecordScene())) {
                jVar.a0();
            }
            g("isUseCamera2", java.lang.Boolean.TRUE);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f13603k = android.os.SystemClock.elapsedRealtime();
        this.f13607o = new dt0.b(process.getContext(), process);
    }

    public static /* synthetic */ void i(at0.n nVar, boolean z17, java.lang.Float f17, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = nVar.f13598f;
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
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        gt0.a aVar = this.f13593a;
        ht0.b recorder = aVar.getRecorder();
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "createRecorder: " + this.f13595c + ", useCpuCrop:" + aVar.g() + ", process.getRecorder():" + recorder + ", mute:" + aVar.isMute());
        ht0.b bVar = this.f13595c;
        if (bVar != null) {
            bVar.cancel();
            bVar.clear();
        }
        ht0.b bVar2 = this.f13596d;
        if (bVar2 != null) {
            bVar2.cancel();
            bVar2.clear();
        }
        ct0.a encodeConfig = aVar.getEncodeConfig();
        if (recorder != null) {
            this.f13595c = recorder;
            j17 = elapsedRealtime;
        } else {
            boolean g17 = aVar.g();
            at0.t tVar2 = at0.t.f13629a;
            ts0.r camera = this.f13594b;
            if (g17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markCpuCrop");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 8L, 1L);
                int c17 = encodeConfig.c();
                com.tencent.mm.modelcontrol.VideoTransPara videoPara = aVar.getVideoTransPara();
                ms0.c recordRenderer = aVar.getRecordRenderer();
                kotlin.jvm.internal.o.g(videoPara, "videoPara");
                kotlin.jvm.internal.o.g(camera, "camera");
                if (c17 == 2) {
                    if (recordRenderer == null) {
                        at0.t.f13630b = new at0.q();
                    } else {
                        at0.t.f13630b = recordRenderer;
                    }
                    ms0.c cVar = at0.t.f13630b;
                    if (cVar == null || camera.z() == null) {
                        j17 = elapsedRealtime;
                    } else {
                        j17 = elapsedRealtime;
                        android.graphics.Point point = new android.graphics.Point(ts0.c.f421543c, ts0.c.f421542b);
                        cVar.u(point.x, point.y);
                        cVar.r(ts0.c.f421544d);
                        cVar.m(ts0.c.f421548h);
                    }
                    ht0.s sVar = new ht0.s(videoPara, at0.t.f13630b, null, -1, null);
                    camera.k(sVar.Z);
                    o0Var = sVar;
                } else {
                    j17 = elapsedRealtime;
                    ht0.o0 o0Var2 = new ht0.o0(videoPara);
                    if (camera.z() != null) {
                        o0Var2.setMirror(ts0.c.f421548h);
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
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markGpuCrop");
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.C(985L, 7L, 1L);
                if (aVar.getCameraPreviewView().getEGLContext() == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CameraPreviewContainer", "gpu crop, preview view egl context is null!!!");
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markGpuCropFailed");
                    g0Var.C(985L, 10L, 1L);
                    return false;
                }
                int c18 = encodeConfig.c();
                com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = aVar.getVideoTransPara();
                android.opengl.EGLContext eGLContext = aVar.getCameraPreviewView().getEGLContext();
                kotlin.jvm.internal.o.d(eGLContext);
                str = "MicroMsg.MediaEditorIDKeyStat";
                tVar = tVar2;
                str2 = "markGpuCrop";
                i17 = 2;
                str3 = "gpu crop, preview view egl context is null!!!";
                str4 = "markGpuCropFailed";
                z17 = false;
                rVar = camera;
                a17 = tVar2.a(c18, videoTransPara, camera, eGLContext, aVar.getCameraPreviewView(), aVar.getRecordRenderer());
            }
            this.f13595c = a17;
            if (aVar.getEncodeConfig().c() == i17) {
                a18 = com.tencent.mm.plugin.sight.base.c.a(z17, aVar.getVideoTransPara().f71190J == 1 ? true : z17);
            } else {
                a18 = com.tencent.mm.plugin.sight.base.c.a(true, aVar.getVideoTransPara().K == 1 ? true : z17);
            }
            g("RecordMuxerType", java.lang.Boolean.valueOf(a18));
            if (aVar.j() && !aVar.g()) {
                com.tencent.mars.xlog.Log.i(str, str2);
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.C(985L, 7L, 1L);
                if (aVar.getCameraPreviewView().getEGLContext() == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CameraPreviewContainer", str3);
                    com.tencent.mars.xlog.Log.i(str, str4);
                    g0Var2.C(985L, 10L, 1L);
                    return z17;
                }
                int c19 = encodeConfig.c();
                com.tencent.mm.modelcontrol.VideoTransPara daemonVideoTransPara = aVar.getDaemonVideoTransPara();
                android.opengl.EGLContext eGLContext2 = aVar.getCameraPreviewView().getEGLContext();
                kotlin.jvm.internal.o.d(eGLContext2);
                this.f13596d = tVar.a(c19, daemonVideoTransPara, rVar, eGLContext2, aVar.getCameraPreviewView(), aVar.getRecordRenderer());
            }
        }
        ht0.b bVar3 = this.f13595c;
        if (bVar3 != null) {
            bVar3.setMute(aVar.isMute());
        }
        ht0.b bVar4 = this.f13596d;
        if (bVar4 != null) {
            bVar4.setMute(true);
        }
        aVar.getCameraPreviewView().setOnDrawListener(new at0.b(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "create recorder finish");
        g("REPORT_CREATE_RECORDER", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17));
        return true;
    }

    public final void b(ts0.c cVar) {
        int i17;
        ht0.b bVar = this.f13595c;
        if (bVar != null) {
            cVar.getClass();
            bVar.r(ts0.c.f421543c, ts0.c.f421542b, ts0.c.f421546f, ts0.c.f421547g);
        }
        gt0.a aVar = this.f13593a;
        if (bVar != null) {
            bVar.f(aVar.getEncodeConfig().getFilePath());
        }
        if (bVar != null) {
            bVar.w(aVar.getEncodeConfig().b());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filePath : ");
        sb6.append(bVar != null ? bVar.getFilePath() : null);
        sb6.append("   thumbPath : ");
        sb6.append(bVar != null ? bVar.b() : null);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", sb6.toString(), new java.lang.Object[0]);
        ht0.b bVar2 = this.f13596d;
        if (bVar2 != null) {
            cVar.getClass();
            bVar2.r(ts0.c.f421543c, ts0.c.f421542b, ts0.c.f421546f, ts0.c.f421547g);
        }
        if (bVar2 != null) {
            bVar2.f(aVar.getEncodeConfig().getFilePath() + "_daemon");
        }
        if (bVar2 != null) {
            bVar2.w(aVar.getEncodeConfig().b() + "_daemon");
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("filePath : ");
        sb7.append(bVar2 != null ? bVar2.getFilePath() : null);
        sb7.append("   thumbPath : ");
        sb7.append(bVar2 != null ? bVar2.b() : null);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", sb7.toString(), new java.lang.Object[0]);
        if (ts0.d.f421550a.a()) {
            i17 = 0;
        } else {
            cVar.getClass();
            i17 = ts0.c.f421544d;
        }
        ht0.b bVar3 = this.f13595c;
        boolean k17 = bVar3 != null ? bVar3.k(i17) : false;
        ht0.b bVar4 = this.f13596d;
        boolean k18 = bVar4 != null ? bVar4.k(i17) : false;
        ht0.b bVar5 = this.f13596d;
        if ((bVar5 instanceof ht0.s) && (this.f13595c instanceof ht0.s)) {
            kotlin.jvm.internal.o.e(bVar5, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.MediaCodecMP4MuxRecorder");
            ht0.s sVar = (ht0.s) bVar5;
            ht0.b bVar6 = this.f13595c;
            kotlin.jvm.internal.o.e(bVar6, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.MediaCodecMP4MuxRecorder");
            ht0.a aVar2 = ((ht0.s) bVar6).f284760h;
            if (aVar2 != null) {
                sVar.S = true;
                com.tencent.mm.plugin.sight.base.h sightEncode = sVar.f284769q;
                kotlin.jvm.internal.o.g(sightEncode, "sightEncode");
                aVar2.f284660J.add(sightEncode);
            }
        }
        ht0.b bVar7 = this.f13596d;
        if ((bVar7 instanceof ht0.o0) && (this.f13595c instanceof ht0.o0)) {
            kotlin.jvm.internal.o.e(bVar7, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.X264YUVMP4MuxRecorder");
            ht0.o0 o0Var = (ht0.o0) bVar7;
            ht0.b bVar8 = this.f13595c;
            kotlin.jvm.internal.o.e(bVar8, "null cannot be cast to non-null type com.tencent.mm.media.widget.recorder.X264YUVMP4MuxRecorder");
            ht0.a aVar3 = ((ht0.o0) bVar8).f284723a;
            if (aVar3 != null) {
                com.tencent.mm.plugin.sight.base.h sightEncode2 = o0Var.D;
                kotlin.jvm.internal.o.g(sightEncode2, "sightEncode");
                aVar3.f284660J.add(sightEncode2);
            }
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", "init recorder ret:" + k17 + "  daemonRet:" + k18, new java.lang.Object[0]);
        this.f13605m = k17;
    }

    public final void c(float f17, float f18, int i17, int i18, long j17) {
        if (this.f13604l == 0) {
            this.f13594b.f(f17, f18, i17, i18, j17);
        }
    }

    public final void d() {
        ts0.r rVar = this.f13594b;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "release");
            ((ts0.b) rVar).H();
            rVar.release();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CameraPreviewContainer", e17, "camera release error:" + e17.getMessage(), new java.lang.Object[0]);
        }
        dt0.b bVar = this.f13607o;
        bVar.f243123d.disable();
        bVar.f243121b = null;
        at0.t.f13630b = null;
        this.f13593a.getCameraPreviewView().release();
        ht0.b bVar2 = this.f13595c;
        if (bVar2 != null) {
            bVar2.cancel();
        }
        ht0.b bVar3 = this.f13595c;
        if (bVar3 != null) {
            bVar3.clear();
        }
        ht0.b bVar4 = this.f13596d;
        if (bVar4 != null) {
            bVar4.cancel();
        }
        ht0.b bVar5 = this.f13596d;
        if (bVar5 != null) {
            bVar5.clear();
        }
        this.f13613u = null;
    }

    public final void e() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "cancelRecord");
            ht0.b bVar = this.f13595c;
            if (bVar != null) {
                bVar.cancel();
            }
            ht0.b bVar2 = this.f13595c;
            if (bVar2 != null) {
                bVar2.clear();
            }
            ht0.b bVar3 = this.f13596d;
            if (bVar3 != null) {
                bVar3.cancel();
            }
            ht0.b bVar4 = this.f13596d;
            if (bVar4 != null) {
                bVar4.clear();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CameraPreviewContainer", e17, "cancel record error", new java.lang.Object[0]);
        }
        ts0.r rVar = this.f13594b;
        if (((ts0.b) rVar).G()) {
            a();
            ts0.c z17 = rVar.z();
            if (z17 != null) {
                b(z17);
            }
        }
    }

    public final void f(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "setRecordMiniTime:" + j17);
        this.f13606n = j17;
    }

    public final void g(java.lang.String str, java.lang.Object obj) {
        this.f13612t.h(str, obj);
    }

    public final void h(boolean z17, java.lang.Float f17, yz5.l lVar) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        g("OpenCameraTimeStamp", java.lang.Long.valueOf(elapsedRealtime));
        if (this.f13604l == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraPreviewContainer", "startPreview, already in preview state");
            return;
        }
        this.f13604l = 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreview process.useCpuCrop():");
        gt0.a aVar = this.f13593a;
        sb6.append(aVar.g());
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", sb6.toString(), new java.lang.Object[0]);
        this.f13598f = z17;
        if (!z17 && !it0.c.f294488c) {
            this.f13598f = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "force useBackGroundCamera");
        }
        if (this.f13598f && !it0.c.f294489d) {
            this.f13598f = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "force useFrontGroundCamera");
        }
        ts0.r rVar = this.f13594b;
        rVar.c(aVar.getContext(), this.f13598f);
        if (aVar.g()) {
            rVar.k(aVar.getCameraPreviewView().getFrameDataCallback());
        }
        g("CameraOpenCost", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        aVar.getCameraPreviewView().u(new at0.d(this, f17, lVar));
    }

    public final boolean j(boolean z17, int i17) {
        ht0.b bVar;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME, new java.lang.Object[0]);
        if (this.f13594b.z() == null || (bVar = this.f13595c) == null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", "cameraConfig is null", new java.lang.Object[0]);
            return false;
        }
        if (!this.f13605m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "startRecord, initRecorder failed");
            return false;
        }
        if (bVar != null) {
            bVar.setMirror(ts0.c.f421548h && this.f13610r);
        }
        int i18 = ts0.d.f421550a.a() ? 0 : ts0.c.f421544d;
        ht0.b bVar2 = this.f13595c;
        java.lang.Integer valueOf = bVar2 != null ? java.lang.Integer.valueOf(bVar2.y(i18, z17, i17)) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "start record ret:" + valueOf);
        java.lang.Integer num = -1;
        if (this.f13593a.j()) {
            ht0.b bVar3 = this.f13596d;
            if (bVar3 != null) {
                bVar3.setMirror(ts0.c.f421548h && this.f13610r);
            }
            ht0.b bVar4 = this.f13596d;
            num = bVar4 != null ? java.lang.Integer.valueOf(bVar4.y(i18, z17, i17)) : null;
        }
        if ((valueOf == null || valueOf.intValue() != 0) && (num == null || num.intValue() != 0)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "start record base ret:" + valueOf + " daemon ret:" + num + " ,use daemon record:" + this.f13593a.j());
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f13599g = android.os.SystemClock.elapsedRealtime();
        this.f13600h = true;
        this.f13608p = false;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 147L, 1L, false);
        return true;
    }

    public final void k() {
        ts0.r rVar = this.f13594b;
        if (this.f13604l == 1) {
            return;
        }
        this.f13604l = 1;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", "stopPreview", new java.lang.Object[0]);
        try {
            rVar.release();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CameraPreviewContainer", e17, "camera relase error:" + e17.getMessage(), new java.lang.Object[0]);
        }
        gt0.a aVar = this.f13593a;
        rVar.q(aVar.getCameraPreviewView().getFrameDataCallback());
        aVar.getCameraPreviewView().j();
        if (this.f13609q) {
            return;
        }
        this.f13607o.a(false, null);
    }

    public final boolean l(yz5.l lVar) {
        if (!this.f13600h) {
            return true;
        }
        this.f13600h = false;
        long j17 = this.f13599g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < this.f13606n) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", "stopRecord " + (android.os.SystemClock.elapsedRealtime() - this.f13599g), new java.lang.Object[0]);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 148L, 1L, false);
            e();
            return false;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", "stopRecord start", new java.lang.Object[0]);
        rs0.a aVar = new rs0.a(com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME);
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new ct0.b(null, null, false, 0, 0, null, null, 0, 0, null, null, null, false, null, null, 0, 65535, null);
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        h0Var2.f310123d = new at0.g(h0Var, this, lVar);
        if (this.f13593a.j()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 149L, 1L, false);
        }
        kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
        ht0.b bVar = this.f13595c;
        h0Var3.f310123d = bVar;
        if (bVar != null) {
            bVar.g(new at0.e(this, h0Var3, aVar, h0Var, f0Var, h0Var2, lVar));
        }
        ht0.b bVar2 = this.f13596d;
        if (bVar2 == null) {
            return true;
        }
        bVar2.g(new at0.f(this, aVar, h0Var, f0Var, h0Var2, lVar));
        return true;
    }

    public final boolean m(boolean z17) {
        if (!it0.c.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "only one camera,forbid switch");
            return !it0.c.f294488c;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("flipCamera time space:");
        long j17 = this.f13603k;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", sb6.toString());
        if (!z17) {
            if (android.os.SystemClock.elapsedRealtime() - this.f13603k < 1000) {
                return this.f13598f;
            }
        }
        this.f13603k = android.os.SystemClock.elapsedRealtime();
        if (this.f13600h) {
            ht0.b bVar = this.f13595c;
            if (bVar != null) {
                bVar.pause();
            }
            ht0.b bVar2 = this.f13596d;
            if (bVar2 != null) {
                bVar2.pause();
            }
        }
        this.f13593a.getCameraPreviewView().y();
        this.f13598f = ((ts0.b) this.f13594b).M();
        ts0.c z19 = this.f13594b.z();
        boolean z27 = false;
        if (!this.f13609q) {
            this.f13607o.a(!this.f13598f && this.f13593a.m(), z19);
        }
        if (z19 != null) {
            this.f13593a.getCameraPreviewView().w(z19);
            if (!ts0.d.f421550a.a()) {
                ms0.c cVar = at0.t.f13630b;
                if (cVar != null) {
                    cVar.u(ts0.c.f421543c, ts0.c.f421542b);
                }
                ms0.c cVar2 = at0.t.f13630b;
                if (cVar2 != null) {
                    cVar2.r(ts0.c.f421544d);
                }
                ms0.c cVar3 = at0.t.f13630b;
                if (cVar3 != null) {
                    cVar3.m(ts0.c.f421548h);
                }
                ht0.b bVar3 = this.f13595c;
                if (bVar3 != null) {
                    bVar3.setMirror(ts0.c.f421548h && this.f13610r);
                }
                ht0.b bVar4 = this.f13596d;
                if (bVar4 != null) {
                    if (ts0.c.f421548h && this.f13610r) {
                        z27 = true;
                    }
                    bVar4.setMirror(z27);
                }
            }
            ht0.b bVar5 = this.f13595c;
            if (bVar5 != null) {
                bVar5.r(ts0.c.f421543c, ts0.c.f421542b, ts0.c.f421546f, ts0.c.f421547g);
            }
            ht0.b bVar6 = this.f13596d;
            if (bVar6 != null) {
                bVar6.r(ts0.c.f421543c, ts0.c.f421542b, ts0.c.f421546f, ts0.c.f421547g);
            }
            if (this.f13600h) {
                this.f13602j = new jz5.o(java.lang.Integer.valueOf(ts0.c.f421544d), java.lang.Integer.valueOf(ts0.c.f421543c), java.lang.Integer.valueOf(ts0.c.f421542b));
                this.f13601i = true;
            }
        }
        return this.f13598f;
    }

    public final void n(java.lang.String tag, boolean z17) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f13594b.h(tag, z17);
    }

    public final void o(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ts0.r rVar = this.f13594b;
        if (!((ts0.b) rVar).G()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraPreviewContainer", "camera.isCameraPreviewing : false");
            callback.invoke(null);
            return;
        }
        int[] iArr = it0.c.f294486a;
        gt0.a process = this.f13593a;
        kotlin.jvm.internal.o.g(process, "process");
        int recordScene = process.getRecordScene();
        if (((recordScene == 1 || recordScene == 2 || recordScene == 9) && it0.c.c() && it0.c.d(java.lang.Integer.valueOf(process.getRecordScene())) && it0.c.b()) && !it0.c.e(process.getRecordScene())) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            rVar.x(new at0.h(this, android.os.SystemClock.elapsedRealtime(), callback));
            return;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ms0.c cVar = this.f13613u;
        if (cVar != null) {
            cVar.q(new at0.i(this, callback, elapsedRealtime));
            cVar.s();
        }
    }

    public final void p(boolean z17, boolean z18, int i17) {
        if (this.f13604l == 0) {
            this.f13594b.t(z17, z18, i17);
        }
    }
}
