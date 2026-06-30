package az0;

/* loaded from: classes16.dex */
public final class f2 implements pp0.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJCamSession f15460d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJCamResourceManager f15461e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f15462f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f15463g;

    /* renamed from: h, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f15464h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15465i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f15466m;

    public f2(com.tencent.maas.camstudio.MJCamSession camSession, com.tencent.maas.camstudio.MJCamResourceManager camSourceManager) {
        kotlin.jvm.internal.o.g(camSession, "camSession");
        kotlin.jvm.internal.o.g(camSourceManager, "camSourceManager");
        this.f15460d = camSession;
        this.f15461e = camSourceManager;
        this.f15463g = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f15466m = new java.util.HashSet();
    }

    public static final void a(az0.f2 f2Var) {
        f2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "installFirstFrameCallback");
        f2Var.f15462f = kotlinx.coroutines.l.d(f2Var.f15463g, null, null, new az0.u1(f2Var, null), 3, null);
    }

    @Override // pp0.p0
    public void A0(com.tencent.maas.camstudio.d0 d0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "beginUseCameraInput");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "beginUseCameraInput >> when main call is release");
        } else {
            this.f15460d.d(d0Var);
        }
    }

    @Override // pp0.p0
    public java.lang.Object B(boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "setBeautyAndMakeupDisabled >> " + z17);
        return c("1059", new az0.o1(this, z17), continuation);
    }

    @Override // pp0.p0
    public void B0(com.tencent.maas.camerafun.MJAudioFrame audioFrame) {
        kotlin.jvm.internal.o.g(audioFrame, "audioFrame");
        b("sendAudioFrame", new az0.m1(this, audioFrame));
    }

    @Override // pp0.p0
    public java.lang.Object C(java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "startRecording");
        return c("1033", new az0.c2(this, str, mJRecordingSettings, mJAuditCaptureSettings), continuation);
    }

    @Override // pp0.p0
    public void C0() {
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "notifyAIGCTaskCompleted >> when main call is release");
        } else {
            this.f15460d.r();
        }
    }

    @Override // pp0.p0
    public java.lang.Object D(java.lang.String str, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "loadMusic >> " + str);
        return c("1039", new az0.w0(this, str, uVar), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object E(boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "pausePreview");
        return c("1025", new az0.a1(this, z17), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object E0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "resumePreview");
        return c("1026", new az0.f1(this), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object F(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "clearBeautyDesc");
        return c("1030", new az0.k0(this), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object G(com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "startPreview");
        return c("1024", new az0.a2(this, mJCamPreviewSettings), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object G0(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "setLocationInfo");
        return c("1048", new az0.w1(this, geographicInfo), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object H(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "pauseBackgroundMusic");
        return c("1057", new az0.z0(this), continuation);
    }

    @Override // pp0.p0
    public void H0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        b("setWeslamLibPath", new az0.z1(this, path));
    }

    @Override // pp0.p0
    public java.lang.Object I(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "clearMusicLyrics");
        return c("1054", new az0.n0(this), continuation);
    }

    @Override // pp0.p0
    public int I0(java.lang.String materialID, long j17, java.lang.String downloadURL, com.tencent.maas.camstudio.u onProgress, com.tencent.maas.camstudio.r onComplete) {
        kotlin.jvm.internal.o.g(materialID, "materialID");
        kotlin.jvm.internal.o.g(downloadURL, "downloadURL");
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "loadMaterial >> " + materialID + ", " + j17 + ", " + downloadURL);
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f15465i) {
            return this.f15461e.j(materialID, j17, downloadURL, onProgress, onComplete);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MaasImproveCamManager", "loadMaterial >> when call is release");
        return -1;
    }

    @Override // pp0.p0
    public void J(com.tencent.maas.camstudio.MJAIGCCancelReason cancelReason) {
        kotlin.jvm.internal.o.g(cancelReason, "cancelReason");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "cancelAIGCTask: cancelReason=" + cancelReason);
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "cancelAIGCTask >> when main call is release");
        } else {
            this.f15460d.h(cancelReason);
        }
    }

    @Override // pp0.p0
    public android.opengl.EGLContext J0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "getSharedEGLContext");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f15465i) {
            return this.f15460d.p();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "getSharedEGLContext>> when main call is release");
        return android.opengl.EGL14.EGL_NO_CONTEXT;
    }

    @Override // pp0.p0
    public java.lang.Object K(com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "endAdjustSpatialDesc >> " + mJCamSpatialDesc);
        return c("1056", new az0.p0(this, mJCamSpatialDesc), continuation);
    }

    @Override // pp0.p0
    public void K0(android.view.SurfaceView renderView) {
        kotlin.jvm.internal.o.g(renderView, "renderView");
        b("bindRenderView", new az0.i0(this, renderView));
    }

    @Override // pp0.p0
    public void L(com.tencent.maas.camstudio.f0 onGestureEvent) {
        kotlin.jvm.internal.o.g(onGestureEvent, "onGestureEvent");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "setAIGCFinishCallback >> when main call is release");
        } else {
            this.f15460d.Q(onGestureEvent);
        }
    }

    @Override // pp0.p0
    public void L0(com.tencent.maas.camstudio.a0 onAIGCRequestConditionNotMet) {
        kotlin.jvm.internal.o.g(onAIGCRequestConditionNotMet, "onAIGCRequestConditionNotMet");
        this.f15460d.G(onAIGCRequestConditionNotMet);
    }

    @Override // pp0.p0
    public java.lang.Object M(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "clearFilterDesc");
        return c("1032", new az0.m0(this), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object M0(java.util.List list, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "selectAndLoadMusic >> " + list);
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f15465i) {
            return az0.j.a("1042", new az0.l1(this, list), continuation);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MaasImproveCamManager", "1042 >> when call is release");
        return null;
    }

    @Override // pp0.p0
    public com.tencent.maas.camstudio.MJBeautyAdjustmentDesc N(java.lang.String materialID) {
        kotlin.jvm.internal.o.g(materialID, "materialID");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "getBeautyDesc >> ".concat(materialID));
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f15465i) {
            return this.f15461e.c(materialID);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "getBeautyDesc>> when main call is release");
        return null;
    }

    @Override // pp0.p0
    public java.lang.Object N0(jg.d dVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f15465i) {
            return c("1051", new az0.r1(this, dVar), continuation);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "setFaceGender>> when main call is release");
        return java.lang.Boolean.FALSE;
    }

    @Override // pp0.p0
    public java.lang.Object O(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "clearBackgroundMusic");
        return c("1038", new az0.j0(this), continuation);
    }

    @Override // pp0.p0
    public java.lang.String P(java.lang.String musicId) {
        kotlin.jvm.internal.o.g(musicId, "musicId");
        return null;
    }

    @Override // pp0.p0
    public void Q(com.tencent.maas.camstudio.MJAIGCBridgeService aigcBridgeService) {
        kotlin.jvm.internal.o.g(aigcBridgeService, "aigcBridgeService");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "registerAIGCBridgeService >> when main call is release");
        } else {
            this.f15460d.x(aigcBridgeService);
        }
    }

    @Override // pp0.p0
    public java.lang.Object R(com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "setBeautyDesc");
        return c("1029", new az0.p1(this, mJBeautyAdjustmentDesc), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object S(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r2 r2Var;
        java.lang.Object C;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "awaitFirstFrame");
        kotlinx.coroutines.r2 r2Var2 = this.f15462f;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (r2Var2 != null) {
            boolean z17 = false;
            if (r2Var2 != null && ((kotlinx.coroutines.a) r2Var2).a()) {
                z17 = true;
            }
            if (z17 && (r2Var = this.f15462f) != null && (C = ((kotlinx.coroutines.c3) r2Var).C(continuation)) == pz5.a.f359186d) {
                return C;
            }
        }
        return f0Var;
    }

    @Override // pp0.p0
    public void T(com.tencent.maas.camstudio.c0 onBeginRequestAIGC) {
        kotlin.jvm.internal.o.g(onBeginRequestAIGC, "onBeginRequestAIGC");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "setBeginRequestAIGCFunc");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "setBeginRequestAIGCFunc >> when main call is release");
        } else {
            this.f15460d.J(onBeginRequestAIGC);
        }
    }

    @Override // pp0.p0
    public java.lang.Object U(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "loadBuiltinCommonResources");
        return c("1010", new az0.r0(this), continuation);
    }

    @Override // pp0.p0
    public boolean V(com.tencent.maas.material.g materialScene) {
        kotlin.jvm.internal.o.g(materialScene, "materialScene");
        return this.f15466m.contains(materialScene);
    }

    @Override // pp0.p0
    public java.lang.Object W(com.tencent.maas.camstudio.MJCamSegmentationDesc mJCamSegmentationDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "setSegmentationDesc");
        return c("1060", new az0.y1(this, mJCamSegmentationDesc), continuation);
    }

    @Override // pp0.p0
    public void X(com.tencent.maas.camstudio.d0 onComplete) {
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "cancelExportingVideo");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "cancelExportingVideo >> when main call is release");
        } else {
            this.f15460d.i(onComplete);
        }
    }

    @Override // pp0.p0
    public java.lang.Object Y(com.tencent.maas.camstudio.frame.VideoFrame videoFrame, java.lang.String str, boolean z17, com.tencent.maas.camstudio.z zVar, boolean z18, boolean z19, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "exportPhoto");
        return c("1035", new az0.q0(this, videoFrame, str, z17, zVar, z18, z19), continuation);
    }

    @Override // pp0.p0
    public void Z(yz5.l cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        this.f15460d.O(new az0.v1(cb6));
    }

    public final void b(java.lang.String str, yz5.a aVar) {
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f15465i) {
            aVar.invoke();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", str + ">> when main call is release");
    }

    @Override // pp0.p0
    public java.lang.Object b0(java.lang.String str, com.tencent.maas.camstudio.q qVar, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "loadTemplate >> " + str);
        return c("1011", new az0.x0(this, str, qVar, uVar), continuation);
    }

    public final java.lang.Object c(java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f15465i) {
            return az0.j.b(str, lVar, continuation);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MaasImproveCamManager", str + " >> when call is release");
        return java.lang.Boolean.FALSE;
    }

    @Override // pp0.p0
    public void c0(com.tencent.maas.camerafun.MJAIGCParams params, com.tencent.maas.camstudio.d0 onComplete) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "updateAIGCResult");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "updateAIGCResult >> when main call is release");
        } else {
            this.f15460d.c0(params, onComplete);
        }
    }

    @Override // pp0.p0
    public void d0(com.tencent.maas.camstudio.frame.VideoFrame videoFrame) {
        kotlin.jvm.internal.o.g(videoFrame, "videoFrame");
        b("sendVideoFrame", new az0.n1(this, videoFrame));
    }

    @Override // pp0.p0
    public java.lang.Object e0(com.tencent.maas.camstudio.MJCamFilterDesc mJCamFilterDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "setFilterDesc");
        return c("1031", new az0.s1(this, mJCamFilterDesc), continuation);
    }

    @Override // pp0.p0
    public void g0(java.lang.String draftBundleDirPath, com.tencent.maas.camstudio.i0 onSaveAIGCCraftComplete) {
        kotlin.jvm.internal.o.g(draftBundleDirPath, "draftBundleDirPath");
        kotlin.jvm.internal.o.g(onSaveAIGCCraftComplete, "onSaveAIGCCraftComplete");
    }

    @Override // pp0.p0
    public void h0(java.lang.String draftBundleDirPath, java.lang.String videoOutputFilePath, com.tencent.maas.instamovie.MJRecordingSettings recordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, com.tencent.maas.camstudio.d0 d0Var) {
        kotlin.jvm.internal.o.g(draftBundleDirPath, "draftBundleDirPath");
        kotlin.jvm.internal.o.g(videoOutputFilePath, "videoOutputFilePath");
        kotlin.jvm.internal.o.g(recordingSettings, "recordingSettings");
    }

    @Override // pp0.p0
    public void i(com.tencent.maas.camstudio.MJCDNBridgeService cdnBridgeService) {
        kotlin.jvm.internal.o.g(cdnBridgeService, "cdnBridgeService");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "registerCDNBridgeService >> when main call is release");
        } else {
            this.f15460d.y(cdnBridgeService);
        }
    }

    @Override // pp0.p0
    public java.lang.Object j(com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "startPreview");
        return c("1024", new az0.b2(this, mJCamPreviewSettings), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object j0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "resumeBackgroundMusic");
        return c("1058", new az0.e1(this), continuation);
    }

    @Override // pp0.p0
    public com.tencent.maas.camstudio.MJCamMusicDesc k() {
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f15465i) {
            return this.f15460d.n();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "getCurrentBackgroundMusic>> when main call is release");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (((kotlinx.coroutines.a) r0).a() == true) goto L8;
     */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k0() {
        /*
            r3 = this;
            kotlinx.coroutines.r2 r0 = r3.f15464h
            r1 = 0
            if (r0 == 0) goto Lf
            kotlinx.coroutines.a r0 = (kotlinx.coroutines.a) r0
            boolean r0 = r0.a()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 != 0) goto L1e
            boolean r0 = r3.f15465i
            if (r0 == 0) goto L17
            goto L1e
        L17:
            com.tencent.maas.camstudio.MJCamSession r0 = r3.f15460d
            boolean r0 = r0.q()
            return r0
        L1e:
            java.lang.String r0 = "MicroMsg.MaasImproveCamManager"
            java.lang.String r2 = "isBeautyAndMakeupDisabled>> when main call is release"
            com.tencent.mars.xlog.Log.i(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.f2.k0():boolean");
    }

    @Override // pp0.p0
    public com.tencent.maas.camstudio.MJCamTemplateInfo l(java.lang.String templateID, long j17) {
        kotlin.jvm.internal.o.g(templateID, "templateID");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "getTemplateInfo >> " + templateID + ", " + j17);
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f15465i) {
            return this.f15461e.e(templateID, j17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "getTemplateInfo>> when main call is release");
        return null;
    }

    @Override // pp0.p0
    public java.lang.Object m(java.lang.String str, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "loadMaterial >> " + str);
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        if ((r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) || this.f15465i) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MaasImproveCamManager", "loadMaterial >> when call is release");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        } else {
            int k17 = this.f15461e.k(str, uVar, new az0.t0(rVar));
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "loadMaterial >> taskID: " + k17);
            rVar.m(new az0.s0(this, k17));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    @Override // pp0.p0
    public java.lang.Object m0(kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    @Override // pp0.p0
    public java.lang.Object n(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "updateMusicLyrics");
        return c("1053", new az0.e2(this, mJCamMusicDesc), continuation);
    }

    @Override // pp0.p0
    public boolean n0(java.lang.String templateId, long j17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "isTemplateLoaded: templateId=" + templateId + ", templateVersion=" + j17);
        return this.f15461e.g(templateId, j17);
    }

    @Override // pp0.p0
    public java.lang.Object o(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "beginAdjustSpatialDesc");
        return az0.j.a("1055", new az0.d0(this), continuation);
    }

    @Override // pp0.p0
    public void o0(com.tencent.maas.camstudio.h0 onRecordingTimeChange) {
        kotlin.jvm.internal.o.g(onRecordingTimeChange, "onRecordingTimeChange");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "setRecordingTimeDidChangeFunc >> when main call is release");
        } else {
            this.f15460d.T(onRecordingTimeChange);
        }
    }

    @Override // pp0.p0
    public int p(java.lang.String templateId, com.tencent.maas.camstudio.q loadPriority, com.tencent.maas.camstudio.u onProgress, yz5.l onCompletion) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(loadPriority, "loadPriority");
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        kotlin.jvm.internal.o.g(onCompletion, "onCompletion");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "loadTemplateAsync >> ".concat(templateId));
        return this.f15461e.n(templateId, loadPriority, onProgress, new az0.g1(onCompletion));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p0(java.lang.String r7, com.tencent.maas.camstudio.MJCamTemplateOverridingParams r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof az0.g0
            if (r0 == 0) goto L13
            r0 = r9
            az0.g0 r0 = (az0.g0) r0
            int r1 = r0.f15489i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15489i = r1
            goto L18
        L13:
            az0.g0 r0 = new az0.g0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f15487g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15489i
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r9)
            goto L89
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "beginUseTemplateV2 >> "
            r9.<init>(r2)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.MaasImproveCamManager"
            com.tencent.mars.xlog.Log.i(r2, r9)
            kotlinx.coroutines.r2 r9 = r6.f15464h
            if (r9 == 0) goto L53
            kotlinx.coroutines.a r9 = (kotlinx.coroutines.a) r9
            boolean r9 = r9.a()
            if (r9 != r3) goto L53
            r9 = r3
            goto L54
        L53:
            r9 = 0
        L54:
            if (r9 != 0) goto L90
            boolean r9 = r6.f15465i
            if (r9 == 0) goto L5b
            goto L90
        L5b:
            long r4 = java.lang.System.currentTimeMillis()
            r0.f15484d = r6
            r0.f15485e = r7
            r0.f15486f = r8
            r0.f15489i = r3
            oz5.n r9 = new oz5.n
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r9.<init>(r0)
            az0.h0 r0 = new az0.h0
            r0.<init>(r9, r4)
            if (r8 != 0) goto L7d
            com.tencent.maas.camstudio.MJCamSession r8 = r6.f15460d
            r8.f(r7, r0)
            goto L82
        L7d:
            com.tencent.maas.camstudio.MJCamSession r2 = r6.f15460d
            r2.g(r7, r8, r0)
        L82:
            java.lang.Object r9 = r9.a()
            if (r9 != r1) goto L89
            return r1
        L89:
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r7 = r9.getValue()
            return r7
        L90:
            java.lang.String r7 = "beginUseTemplateV2 >> when call is release"
            com.tencent.mars.xlog.Log.w(r2, r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "when call is release"
            r7.<init>(r8)
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m521constructorimpl(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.f2.p0(java.lang.String, com.tencent.maas.camstudio.MJCamTemplateOverridingParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public void q() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "loadBuiltinCommonResourcesAsync");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "loadBuiltinCommonResourcesAsync >> when main call is release");
        } else {
            this.f15461e.h(null);
        }
    }

    @Override // pp0.p0
    public java.lang.Object q0(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "beginUseComponentGroup");
        return c("1049", new az0.f0(this, str), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object r(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "beginPlayBackgroundMusic >> " + mJCamMusicDesc.getMusicID());
        return c("1037", new az0.e0(this, mJCamMusicDesc), continuation);
    }

    @Override // pp0.p0
    public void r0(com.tencent.maas.camstudio.MJExposureCheckParams params, com.tencent.maas.camstudio.g0 finishCallback) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(finishCallback, "finishCallback");
        b("setExposureCheck", new az0.q1(this, finishCallback, params));
    }

    @Override // pp0.p0
    public kotlinx.coroutines.r2 release() {
        this.f15466m.clear();
        if (this.f15464h != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "has releaseJob");
            return this.f15464h;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "release");
        this.f15464h = kotlinx.coroutines.l.d(this.f15463g, null, null, new az0.d1(this, null), 3, null);
        return this.f15464h;
    }

    @Override // pp0.p0
    public void s(boolean z17) {
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z18 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z18 = true;
        }
        if (z18 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "notifySwitchCamera >> when main call is release");
        } else {
            this.f15460d.t(z17);
        }
    }

    @Override // pp0.p0
    public void s0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "cancelLoad >> " + i17);
        this.f15461e.b(i17);
    }

    @Override // pp0.p0
    public java.lang.Object t(com.tencent.maas.camstudio.MJCamMusicVolumeDesc mJCamMusicVolumeDesc, kotlin.coroutines.Continuation continuation) {
        java.lang.Object c17 = c("1061", new az0.x1(this, mJCamMusicVolumeDesc), continuation);
        return c17 == pz5.a.f359186d ? c17 : jz5.f0.f302826a;
    }

    @Override // pp0.p0
    public java.lang.Object t0(boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "stopRecording");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z18 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z18 = true;
        }
        if (!z18 && !this.f15465i) {
            return az0.j.a("1034", new az0.d2(this, z17), continuation);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "stopRecording>> when main call is release");
        return null;
    }

    @Override // pp0.p0
    public void u(float f17) {
        b("notifyHorizontalFOV", new az0.y0(this, f17));
    }

    @Override // pp0.p0
    public java.lang.Object u0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "clearTemplate");
        return c("1028", new az0.o0(this), continuation);
    }

    @Override // pp0.p0
    public void v0(com.tencent.maas.camstudio.d0 onComplete) {
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "setAIGCFinishCallback >> when main call is release");
        } else {
            this.f15460d.F(onComplete);
        }
    }

    @Override // pp0.p0
    public void w0(com.tencent.maas.model.MJMusicInfo musicInfo, java.lang.String musicFilePath) {
        kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
        kotlin.jvm.internal.o.g(musicFilePath, "musicFilePath");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(com.tencent.maas.material.g r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof az0.u0
            if (r0 == 0) goto L13
            r0 = r7
            az0.u0 r0 = (az0.u0) r0
            int r1 = r0.f15932h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15932h = r1
            goto L18
        L13:
            az0.u0 r0 = new az0.u0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f15930f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15932h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f15929e
            com.tencent.maas.material.g r6 = (com.tencent.maas.material.g) r6
            java.lang.Object r0 = r0.f15928d
            az0.f2 r0 = (az0.f2) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L77
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "loadMaterialPack >> "
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "MicroMsg.MaasImproveCamManager"
            com.tencent.mars.xlog.Log.i(r2, r7)
            kotlinx.coroutines.r2 r7 = r5.f15464h
            r4 = 0
            if (r7 == 0) goto L5b
            kotlinx.coroutines.a r7 = (kotlinx.coroutines.a) r7
            boolean r7 = r7.a()
            if (r7 != r3) goto L5b
            r4 = r3
        L5b:
            if (r4 != 0) goto L81
            boolean r7 = r5.f15465i
            if (r7 == 0) goto L62
            goto L81
        L62:
            az0.v0 r7 = new az0.v0
            r7.<init>(r5, r6)
            r0.f15928d = r5
            r0.f15929e = r6
            r0.f15932h = r3
            java.lang.String r2 = "1044"
            java.lang.Object r7 = az0.j.a(r2, r7, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            r0 = r5
        L77:
            com.tencent.maas.material.MJMaterialPack r7 = (com.tencent.maas.material.MJMaterialPack) r7
            if (r7 == 0) goto L80
            java.util.HashSet r0 = r0.f15466m
            r0.add(r6)
        L80:
            return r7
        L81:
            java.lang.String r6 = "loadMaterialPack>> when call is release"
            com.tencent.mars.xlog.Log.w(r2, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.f2.x(com.tencent.maas.material.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public java.lang.Object x0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "clearComponentGroup");
        return c("1050", new az0.l0(this), continuation);
    }

    @Override // pp0.p0
    public void y0(boolean z17, com.tencent.maas.camstudio.j0 j0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "startExportingVideo");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z18 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z18 = true;
        }
        if (z18 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "startExportingVideo >> when main call is release");
        } else {
            this.f15460d.X(z17, j0Var);
        }
    }

    @Override // pp0.p0
    public void z(com.tencent.maas.instamovie.base.asset.MJAssetInfo assetInfo, java.lang.String outputFilePath, com.tencent.maas.instamovie.MJRecordingSettings recordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, com.tencent.maas.camstudio.d0 d0Var) {
        kotlin.jvm.internal.o.g(assetInfo, "assetInfo");
        kotlin.jvm.internal.o.g(outputFilePath, "outputFilePath");
        kotlin.jvm.internal.o.g(recordingSettings, "recordingSettings");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "beginUseAssetInput");
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "beginUseAssetInput >> when main call is release");
        } else {
            this.f15460d.c(assetInfo, outputFilePath, recordingSettings, mJAuditCaptureSettings, d0Var);
        }
    }

    @Override // pp0.p0
    public com.tencent.maas.camstudio.MJCamMusicVolumeDesc z0() {
        kotlinx.coroutines.r2 r2Var = this.f15464h;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f15465i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "getMusicVolumeDesc>> when main call is release");
            return new com.tencent.maas.camstudio.MJCamMusicVolumeDesc(1.0f);
        }
        com.tencent.maas.camstudio.MJCamMusicVolumeDesc o17 = this.f15460d.o();
        return o17 == null ? new com.tencent.maas.camstudio.MJCamMusicVolumeDesc(1.0f) : o17;
    }
}
