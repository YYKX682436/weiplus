package az0;

/* loaded from: classes16.dex */
public final class xb implements pp0.p0, bs0.h {

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f16055d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f16056e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f16057f;

    /* renamed from: g, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f16058g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16059h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.maas.camstudio.MJCamoSession f16060i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock f16061m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock f16062n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f16063o;

    public xb(com.tencent.maas.camstudio.MJCamoSession camoSession) {
        kotlin.jvm.internal.o.g(camoSession, "camoSession");
        this.f16056e = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f16057f = new java.util.HashSet();
        this.f16060i = camoSession;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f16061m = reentrantReadWriteLock.readLock();
        this.f16062n = reentrantReadWriteLock.writeLock();
        this.f16063o = kotlinx.coroutines.flow.i3.a(new jz5.l(bs0.g.f23787d, new android.os.Bundle()));
    }

    public static final void O0(az0.xb xbVar, yz5.l lVar) {
        xbVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "installFirstFrameCallback");
        xbVar.f16055d = kotlinx.coroutines.l.d(xbVar.f16056e, null, null, new az0.kb(xbVar, lVar, null), 3, null);
    }

    @Override // bs0.h
    public void A(android.view.Surface surface, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    @Override // pp0.p0
    public void A0(com.tencent.maas.camstudio.d0 d0Var) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.d(d0Var);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "beginUseCameraInput>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object B(boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setBeautyAndMakeupDisabled");
        return Q0("1059", new az0.eb(z17), continuation);
    }

    @Override // pp0.p0
    public void B0(com.tencent.maas.camerafun.MJAudioFrame audioFrame) {
        kotlin.jvm.internal.o.g(audioFrame, "audioFrame");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.U(audioFrame);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "sendAudioFrame>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object C(java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "startRecording");
        return Q0("1033", new az0.tb(str, mJRecordingSettings, mJAuditCaptureSettings), continuation);
    }

    @Override // pp0.p0
    public void C0() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                com.tencent.maas.camstudio.MJCamoSession mJCamoSession2 = this.f16060i;
                if (mJCamoSession2 != null) {
                    mJCamoSession2.G();
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "notifyAIGCTaskCompleted>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object D(java.lang.String str, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "loadMusic >> " + str);
        return Q0("1039", new az0.ma(this, str, uVar), continuation);
    }

    @Override // bs0.j
    public java.lang.Object D0(kotlin.coroutines.Continuation continuation) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return null;
    }

    @Override // pp0.p0
    public java.lang.Object E(boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "pausePreview");
        return Q0("1025", new az0.qa(z17), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object E0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "resumePreview");
        return Q0("1026", az0.wa.f16028d, continuation);
    }

    @Override // pp0.p0
    public java.lang.Object F(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "clearBeautyDesc");
        return Q0("1030", az0.aa.f15331d, continuation);
    }

    @Override // pp0.p0
    public java.lang.Object G(com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "startPreview");
        return Q0("1024", new az0.qb(this, mJCamPreviewSettings), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object G0(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setLocationInfo");
        return Q0("1048", new az0.mb(geographicInfo), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object H(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "pauseBackgroundMusic");
        return Q0("1057", az0.pa.f15814d, continuation);
    }

    @Override // pp0.p0
    public void H0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.p0(path);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setWeslamLibPath>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object I(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "clearMusicLyrics");
        return Q0("1054", az0.da.f15412d, continuation);
    }

    @Override // pp0.p0
    public int I0(java.lang.String materialID, long j17, java.lang.String downloadURL, com.tencent.maas.camstudio.u onProgress, com.tencent.maas.camstudio.r onComplete) {
        kotlin.jvm.internal.o.g(materialID, "materialID");
        kotlin.jvm.internal.o.g(downloadURL, "downloadURL");
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "loadMaterial >> " + materialID + ", " + j17 + ", " + downloadURL);
        if (P0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MaasSafeCamoSession", "loadMaterial >> when call is release");
            return -1;
        }
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
        if (mJCamoSession == null) {
            return -1;
        }
        return mJCamoSession.B(materialID, j17, downloadURL, onProgress, onComplete);
    }

    @Override // pp0.p0
    public void J(com.tencent.maas.camstudio.MJAIGCCancelReason cancelReason) {
        kotlin.jvm.internal.o.g(cancelReason, "cancelReason");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.h(cancelReason);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "cancelAIGCTask>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.opengl.EGLContext J0() {
        /*
            r3 = this;
            java.lang.String r0 = "stateReadLock"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.f16061m
            kotlin.jvm.internal.o.f(r1, r0)
            r1.lock()
            com.tencent.maas.camstudio.MJCamoSession r0 = r3.f16060i     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r3.P0()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L1b
            if (r0 != 0) goto L15
            goto L1b
        L15:
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch: java.lang.Throwable -> L2b
            r1.unlock()
            goto L26
        L1b:
            java.lang.String r0 = "MicroMsg.MaasSafeCamoSession"
            java.lang.String r2 = "getSharedEGLContext>> when main call is release"
            com.tencent.mars.xlog.Log.i(r0, r2)     // Catch: java.lang.Throwable -> L2b
            r1.unlock()
            r0 = 0
        L26:
            if (r0 != 0) goto L2a
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
        L2a:
            return r0
        L2b:
            r0 = move-exception
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.J0():android.opengl.EGLContext");
    }

    @Override // pp0.p0
    public java.lang.Object K(com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "endAdjustSpatialDesc >> " + mJCamSpatialDesc);
        return Q0("1056", new az0.fa(mJCamSpatialDesc), continuation);
    }

    @Override // pp0.p0
    public void K0(android.view.SurfaceView renderView) {
        kotlin.jvm.internal.o.g(renderView, "renderView");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.n0(renderView);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "bindRenderView>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void L(com.tencent.maas.camstudio.f0 onGestureEvent) {
        kotlin.jvm.internal.o.g(onGestureEvent, "onGestureEvent");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.i0(onGestureEvent);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setGestureEventCallback>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void L0(com.tencent.maas.camstudio.a0 onAIGCRequestConditionNotMet) {
        kotlin.jvm.internal.o.g(onAIGCRequestConditionNotMet, "onAIGCRequestConditionNotMet");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.X(onAIGCRequestConditionNotMet);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setAIGCRequestConditionNotMetFunc>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object M(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "clearFilterDesc");
        return Q0("1032", az0.ca.f15395d, continuation);
    }

    @Override // pp0.p0
    public java.lang.Object M0(java.util.List list, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "selectAndLoadMusic >> " + list);
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            if (P0()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MaasSafeCamoSession", "1042 >> when call is release");
                return null;
            }
            stateReadLock.unlock();
            return kotlinx.coroutines.l.g(((kotlinx.coroutines.internal.h) this.f16056e).f310496d, new az0.db(this, list, null), continuation);
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public com.tencent.maas.camstudio.MJBeautyAdjustmentDesc N(java.lang.String materialID) {
        kotlin.jvm.internal.o.g(materialID, "materialID");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "getBeautyDesc >> ".concat(materialID));
        if (P0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "getBeautyDesc>> when main call is release");
            return null;
        }
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
        if (mJCamoSession != null) {
            return mJCamoSession.q(materialID);
        }
        return null;
    }

    @Override // pp0.p0
    public java.lang.Object N0(jg.d dVar, kotlin.coroutines.Continuation continuation) {
        return Q0("1051", new az0.gb(dVar), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object O(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "clearBackgroundMusic");
        return Q0("1038", az0.z9.f16110d, continuation);
    }

    @Override // pp0.p0
    public java.lang.String P(java.lang.String musicId) {
        kotlin.jvm.internal.o.g(musicId, "musicId");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                return mJCamoSession.t(musicId);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "getMusicFilePath>> when main call is release");
            stateReadLock.unlock();
            return null;
        } finally {
            stateReadLock.unlock();
        }
    }

    public final boolean P0() {
        kotlinx.coroutines.r2 r2Var = this.f16058g;
        return (r2Var != null && r2Var.a()) || this.f16059h;
    }

    @Override // pp0.p0
    public void Q(com.tencent.maas.camstudio.MJAIGCBridgeService aigcBridgeService) {
        kotlin.jvm.internal.o.g(aigcBridgeService, "aigcBridgeService");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.M(aigcBridgeService);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "registerAIGCBridgeService>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    public final java.lang.Object Q0(java.lang.String str, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(((kotlinx.coroutines.internal.h) this.f16056e).f310496d, new az0.oa(this, str, pVar, null), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object R(com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setBeautyDesc");
        return Q0("1029", new az0.fb(mJBeautyAdjustmentDesc), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object S(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r2 r2Var;
        java.lang.Object C;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "awaitFirstFrame");
        kotlinx.coroutines.r2 r2Var2 = this.f16055d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (r2Var2 != null) {
            boolean z17 = false;
            if (r2Var2 != null && ((kotlinx.coroutines.a) r2Var2).a()) {
                z17 = true;
            }
            if (z17 && (r2Var = this.f16055d) != null && (C = ((kotlinx.coroutines.c3) r2Var).C(continuation)) == pz5.a.f359186d) {
                return C;
            }
        }
        return f0Var;
    }

    @Override // pp0.p0
    public void T(com.tencent.maas.camstudio.c0 onBeginRequestAIGC) {
        kotlin.jvm.internal.o.g(onBeginRequestAIGC, "onBeginRequestAIGC");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.a0(onBeginRequestAIGC);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setBeginRequestAIGCFunc>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object U(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "loadBuiltinCommonResources");
        return Q0("1010", az0.ha.f15539d, continuation);
    }

    @Override // pp0.p0
    public boolean V(com.tencent.maas.material.g materialScene) {
        kotlin.jvm.internal.o.g(materialScene, "materialScene");
        return this.f16057f.contains(materialScene);
    }

    @Override // pp0.p0
    public java.lang.Object W(com.tencent.maas.camstudio.MJCamSegmentationDesc mJCamSegmentationDesc, kotlin.coroutines.Continuation continuation) {
        return Q0("1060", new az0.ob(mJCamSegmentationDesc), continuation);
    }

    @Override // pp0.p0
    public void X(com.tencent.maas.camstudio.d0 onComplete) {
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.j(onComplete);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "cancelExportingVideo>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object Y(com.tencent.maas.camstudio.frame.VideoFrame videoFrame, java.lang.String str, boolean z17, com.tencent.maas.camstudio.z zVar, boolean z18, boolean z19, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "exportPhoto");
        return Q0("1035", new az0.ga(videoFrame, str, z17, zVar, z18, z19), continuation);
    }

    @Override // pp0.p0
    public void Z(yz5.l cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
        if (mJCamoSession != null) {
            mJCamoSession.f0(new az0.lb(cb6));
        }
    }

    @Override // bs0.j
    public void a() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.z0(false);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "onZoomOut>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // bs0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a0(boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof az0.vb
            if (r0 == 0) goto L13
            r0 = r9
            az0.vb r0 = (az0.vb) r0
            int r1 = r0.f15984g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15984g = r1
            goto L18
        L13:
            az0.vb r0 = new az0.vb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f15982e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15984g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r8 = r0.f15981d
            java.util.concurrent.locks.Lock r8 = (java.util.concurrent.locks.Lock) r8
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L2d
            goto L7b
        L2d:
            r9 = move-exception
            goto L8f
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = "stateReadLock"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r7.f16061m
            kotlin.jvm.internal.o.f(r2, r9)
            r2.lock()
            com.tencent.maas.camstudio.MJCamoSession r9 = r7.f16060i     // Catch: java.lang.Throwable -> L8d
            boolean r5 = r7.P0()     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L82
            if (r9 != 0) goto L4f
            goto L82
        L4f:
            r5 = 0
            if (r8 != 0) goto L54
            r6 = r4
            goto L55
        L54:
            r6 = r5
        L55:
            r9.v0(r6)     // Catch: java.lang.Throwable -> L8d
            android.os.Bundle r9 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8d
            r9.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "camera_boolean"
            if (r8 != 0) goto L62
            r5 = r4
        L62:
            r9.putBoolean(r6, r5)     // Catch: java.lang.Throwable -> L8d
            kotlinx.coroutines.flow.j2 r8 = r7.f16063o     // Catch: java.lang.Throwable -> L8d
            jz5.l r5 = new jz5.l     // Catch: java.lang.Throwable -> L8d
            bs0.g r6 = bs0.g.f23789f     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r6, r9)     // Catch: java.lang.Throwable -> L8d
            r0.f15981d = r2     // Catch: java.lang.Throwable -> L8d
            r0.f15984g = r4     // Catch: java.lang.Throwable -> L8d
            kotlinx.coroutines.flow.h3 r8 = (kotlinx.coroutines.flow.h3) r8     // Catch: java.lang.Throwable -> L7f
            r8.emit(r5, r0)     // Catch: java.lang.Throwable -> L7f
            if (r3 != r1) goto L7a
            return r1
        L7a:
            r8 = r2
        L7b:
            r8.unlock()
            goto L8c
        L7f:
            r8 = move-exception
            r9 = r8
            goto L8e
        L82:
            java.lang.String r8 = "MicroMsg.MaasSafeCamoSession"
            java.lang.String r9 = "setUpCamera>> when main call is release"
            com.tencent.mars.xlog.Log.i(r8, r9)     // Catch: java.lang.Throwable -> L8d
            r2.unlock()
        L8c:
            return r3
        L8d:
            r9 = move-exception
        L8e:
            r8 = r2
        L8f:
            r8.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.a0(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // bs0.j
    public void b() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.z0(true);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "onZoomIn>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object b0(java.lang.String str, com.tencent.maas.camstudio.q qVar, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "loadTemplate >> " + str);
        return Q0("1011", new az0.na(str, qVar, uVar), continuation);
    }

    @Override // bs0.j
    public int c(int i17) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return 0;
    }

    @Override // pp0.p0
    public void c0(com.tencent.maas.camerafun.MJAIGCParams params, com.tencent.maas.camstudio.d0 onComplete) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.x0(params, onComplete);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "updateAIGCResult>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // bs0.h
    public void d() {
    }

    @Override // pp0.p0
    public void d0(com.tencent.maas.camstudio.frame.VideoFrame videoFrame) {
        kotlin.jvm.internal.o.g(videoFrame, "videoFrame");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.V(videoFrame);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "sendVideoFrame>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // bs0.j
    public void e(boolean z17) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.h0(z17);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "switchFlash>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object e0(com.tencent.maas.camstudio.MJCamFilterDesc mJCamFilterDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setFilterDesc");
        return Q0("1031", new az0.hb(mJCamFilterDesc), continuation);
    }

    @Override // bs0.j
    public java.lang.Object f(int i17, kotlin.coroutines.Continuation continuation) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return java.lang.Boolean.TRUE;
    }

    @Override // bs0.j
    public void f0(android.content.Context context, xr0.h setting) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(setting, "setting");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (P0() || mJCamoSession == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setUpCamera>> when main call is release");
            }
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // bs0.j
    public boolean g(float f17) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return true;
    }

    @Override // pp0.p0
    public void g0(java.lang.String draftBundleDirPath, com.tencent.maas.camstudio.i0 onSaveAIGCCraftComplete) {
        kotlin.jvm.internal.o.g(draftBundleDirPath, "draftBundleDirPath");
        kotlin.jvm.internal.o.g(onSaveAIGCCraftComplete, "onSaveAIGCCraftComplete");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.S(draftBundleDirPath, onSaveAIGCCraftComplete);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "saveAsyncAIGCDraft>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // bs0.j
    public kotlinx.coroutines.flow.f3 getCameraState() {
        return kotlinx.coroutines.flow.l.b(this.f16063o);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // bs0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Float getHorizontalViewAngle() {
        /*
            r3 = this;
            java.lang.String r0 = "stateReadLock"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.f16061m
            kotlin.jvm.internal.o.f(r1, r0)
            r1.lock()
            com.tencent.maas.camstudio.MJCamoSession r0 = r3.f16060i     // Catch: java.lang.Throwable -> L34
            boolean r2 = r3.P0()     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L21
            if (r0 != 0) goto L15
            goto L21
        L15:
            float r0 = r0.s()     // Catch: java.lang.Throwable -> L34
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L34
            r1.unlock()
            goto L2c
        L21:
            java.lang.String r0 = "MicroMsg.MaasSafeCamoSession"
            java.lang.String r2 = "getHorizontalViewAngle>> when main call is release"
            com.tencent.mars.xlog.Log.i(r0, r2)     // Catch: java.lang.Throwable -> L34
            r1.unlock()
            r0 = 0
        L2c:
            if (r0 != 0) goto L33
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L33:
            return r0
        L34:
            r0 = move-exception
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.getHorizontalViewAngle():java.lang.Float");
    }

    @Override // bs0.j
    public void h(float f17, float f18) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.p(new com.tencent.maas.base.Vec2(f17, f18));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setUpCamera>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void h0(java.lang.String draftBundleDirPath, java.lang.String videoOutputFilePath, com.tencent.maas.instamovie.MJRecordingSettings recordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, com.tencent.maas.camstudio.d0 d0Var) {
        kotlin.jvm.internal.o.g(draftBundleDirPath, "draftBundleDirPath");
        kotlin.jvm.internal.o.g(videoOutputFilePath, "videoOutputFilePath");
        kotlin.jvm.internal.o.g(recordingSettings, "recordingSettings");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.J(draftBundleDirPath, videoOutputFilePath, recordingSettings, mJAuditCaptureSettings, d0Var);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "openAsyncAIGCDraft>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void i(com.tencent.maas.camstudio.MJCDNBridgeService cdnBridgeService) {
        kotlin.jvm.internal.o.g(cdnBridgeService, "cdnBridgeService");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.N(cdnBridgeService);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "registerCDNBridgeService>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object j(com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "startPreview");
        return Q0("1024", new az0.sb(this, lVar, mJCamPreviewSettings), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object j0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "resumeBackgroundMusic");
        return Q0("1058", az0.va.f15980d, continuation);
    }

    @Override // pp0.p0
    public com.tencent.maas.camstudio.MJCamMusicDesc k() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                return mJCamoSession.r();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "getCurrentBackgroundMusic>> when main call is release");
            stateReadLock.unlock();
            return null;
        } finally {
            stateReadLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[ORIG_RETURN, RETURN] */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k0() {
        /*
            r3 = this;
            java.lang.String r0 = "stateReadLock"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.f16061m
            kotlin.jvm.internal.o.f(r1, r0)
            r1.lock()
            com.tencent.maas.camstudio.MJCamoSession r0 = r3.f16060i     // Catch: java.lang.Throwable -> L35
            boolean r2 = r3.P0()     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L21
            if (r0 != 0) goto L15
            goto L21
        L15:
            boolean r0 = r0.y()     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L35
            r1.unlock()
            goto L2c
        L21:
            java.lang.String r0 = "MicroMsg.MaasSafeCamoSession"
            java.lang.String r2 = "isBeautyAndMakeupDisabled>> when main call is release"
            com.tencent.mars.xlog.Log.i(r0, r2)     // Catch: java.lang.Throwable -> L35
            r1.unlock()
            r0 = 0
        L2c:
            if (r0 == 0) goto L33
            boolean r0 = r0.booleanValue()
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
        L35:
            r0 = move-exception
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.k0():boolean");
    }

    @Override // pp0.p0
    public com.tencent.maas.camstudio.MJCamTemplateInfo l(java.lang.String templateID, long j17) {
        kotlin.jvm.internal.o.g(templateID, "templateID");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "getTemplateInfo >> " + templateID + ", " + j17);
        if (P0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "getTemplateInfo>> when main call is release");
            return null;
        }
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
        if (mJCamoSession != null) {
            return mJCamoSession.x(templateID, j17);
        }
        return null;
    }

    @Override // bs0.j
    public void l0(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
    }

    @Override // pp0.p0
    public java.lang.Object m(java.lang.String str, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "loadMaterial >> " + str);
        if (P0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MaasSafeCamoSession", "loadMaterial >> when call is release");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        } else {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            java.lang.Integer num = mJCamoSession != null ? new java.lang.Integer(mJCamoSession.C(str, uVar, new az0.ja(rVar))) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "loadMaterial >> taskID: " + num);
            rVar.m(new az0.ia(num, this));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|(1:23))(3:24|12|13))|11|12|13))|27|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m0(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof az0.ua
            if (r0 == 0) goto L13
            r0 = r6
            az0.ua r0 = (az0.ua) r0
            int r1 = r0.f15949f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15949f = r1
            goto L18
        L13:
            az0.ua r0 = new az0.ua
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f15947d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15949f
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L4c
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4c
            kotlinx.coroutines.r2 r6 = r5.release()     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L47
            r0.f15949f = r4     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r6.C(r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L45
            return r1
        L45:
            r6 = r3
            goto L48
        L47:
            r6 = 0
        L48:
            kotlin.Result.m521constructorimpl(r6)     // Catch: java.lang.Throwable -> L4c
            goto L56
        L4c:
            r6 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
            kotlin.Result.m521constructorimpl(r6)
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.m0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public java.lang.Object n(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "updateMusicLyrics");
        return Q0("1053", new az0.wb(mJCamMusicDesc), continuation);
    }

    @Override // pp0.p0
    public boolean n0(java.lang.String templateId, long j17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "isTemplateLoaded: templateId=" + templateId + ", templateVersion=" + j17);
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
        if (mJCamoSession == null) {
            return false;
        }
        return mJCamoSession.z(templateId, j17);
    }

    @Override // pp0.p0
    public java.lang.Object o(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "beginAdjustSpatialDesc");
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
        if (mJCamoSession == null) {
            return null;
        }
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        mJCamoSession.a(new az0.t9(new az0.g(nVar, "1055", java.lang.System.currentTimeMillis())));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    @Override // pp0.p0
    public void o0(com.tencent.maas.camstudio.h0 onRecordingTimeChange) {
        kotlin.jvm.internal.o.g(onRecordingTimeChange, "onRecordingTimeChange");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.m0(onRecordingTimeChange);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setRecordingTimeDidChangeFunc>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public int p(java.lang.String templateId, com.tencent.maas.camstudio.q loadPriority, com.tencent.maas.camstudio.u onProgress, yz5.l onCompletion) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(loadPriority, "loadPriority");
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        kotlin.jvm.internal.o.g(onCompletion, "onCompletion");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (P0() || mJCamoSession == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "loadTemplate>> when main call is release");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "loadTemplateAsync >> ".concat(templateId));
                com.tencent.maas.camstudio.MJCamoSession mJCamoSession2 = this.f16060i;
                r4 = mJCamoSession2 != null ? java.lang.Integer.valueOf(mJCamoSession2.F(templateId, loadPriority, onProgress, new az0.xa(onCompletion))) : null;
            }
            if (r4 != null) {
                return r4.intValue();
            }
            return -1;
        } finally {
            stateReadLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p0(java.lang.String r6, com.tencent.maas.camstudio.MJCamTemplateOverridingParams r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof az0.w9
            if (r0 == 0) goto L13
            r0 = r8
            az0.w9 r0 = (az0.w9) r0
            int r1 = r0.f16027f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16027f = r1
            goto L18
        L13:
            az0.w9 r0 = new az0.w9
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f16025d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f16027f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.y0 r8 = r5.f16056e
            kotlinx.coroutines.internal.h r8 = (kotlinx.coroutines.internal.h) r8
            oz5.l r8 = r8.f310496d
            az0.y9 r2 = new az0.y9
            r4 = 0
            r2.<init>(r6, r5, r7, r4)
            r0.f16027f = r3
            java.lang.Object r8 = kotlinx.coroutines.l.g(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.p0(java.lang.String, com.tencent.maas.camstudio.MJCamTemplateOverridingParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public void q() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "loadBuiltinCommonResourcesAsync");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            if (P0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "loadBuiltinCommonResourcesAsync >> when main call is release");
                return;
            }
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (mJCamoSession != null) {
                mJCamoSession.A(null);
            }
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object q0(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "beginUseComponentGroup");
        return Q0("1049", new az0.v9(str), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object r(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "beginPlayBackgroundMusic >> " + mJCamMusicDesc.getMusicID());
        return Q0("1037", new az0.u9(mJCamMusicDesc), continuation);
    }

    @Override // pp0.p0
    public void r0(com.tencent.maas.camstudio.MJExposureCheckParams params, com.tencent.maas.camstudio.g0 finishCallback) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(finishCallback, "finishCallback");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.c0(finishCallback);
                mJCamoSession.b0(params);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setExposureCheck>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public kotlinx.coroutines.r2 release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "release");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock stateWriteLock = this.f16062n;
        kotlin.jvm.internal.o.f(stateWriteLock, "stateWriteLock");
        stateWriteLock.lock();
        try {
            if (!this.f16059h && this.f16058g == null) {
                this.f16059h = true;
                this.f16057f.clear();
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    kotlinx.coroutines.z0.e(this.f16056e, null, 1, null);
                    kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
                if (mJCamoSession == null) {
                    return null;
                }
                this.f16060i = null;
                this.f16058g = kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new az0.ta(mJCamoSession, null), 2, null);
                return this.f16058g;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "has releaseJob");
            return this.f16058g;
        } finally {
            stateWriteLock.unlock();
        }
    }

    @Override // pp0.p0
    public void s(boolean z17) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.I(z17);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "notifySwitchCamera>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void s0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "cancelLoad >> " + i17);
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
        if (mJCamoSession != null) {
            mJCamoSession.k(i17);
        }
    }

    @Override // bs0.j
    public void setCameraViewRatio(bs0.f ratio) {
        kotlin.jvm.internal.o.g(ratio, "ratio");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    @Override // nr0.b0
    public void setCustomRender(nr0.c cVar) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    @Override // bs0.j
    public void setLightTorch(boolean z17) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.j0(z17);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setUpCamera>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // bs0.j
    public void switchCamera() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (P0() || mJCamoSession == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "switchCamera>> when main call is release");
            }
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object t(com.tencent.maas.camstudio.MJCamMusicVolumeDesc mJCamMusicVolumeDesc, kotlin.coroutines.Continuation continuation) {
        java.lang.Object Q0 = Q0("1060", new az0.nb(mJCamMusicVolumeDesc), continuation);
        return Q0 == pz5.a.f359186d ? Q0 : jz5.f0.f302826a;
    }

    @Override // pp0.p0
    public java.lang.Object t0(boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "stopRecording");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            if (P0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "stopRecording>> when main call is release");
                return null;
            }
            stateReadLock.unlock();
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (mJCamoSession == null) {
                return null;
            }
            az0.ub ubVar = new az0.ub(z17);
            oz5.n nVar = new oz5.n(pz5.f.b(continuation));
            ubVar.invoke(mJCamoSession, new az0.g(nVar, "1034", java.lang.System.currentTimeMillis()));
            java.lang.Object a17 = nVar.a();
            pz5.a aVar = pz5.a.f359186d;
            return a17;
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void u(float f17) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.H(f17);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "notifyHorizontalFOV>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object u0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "clearTemplate");
        return Q0("1028", az0.ea.f15448d, continuation);
    }

    @Override // bs0.j
    public java.lang.Object v(int i17, int i18, int i19, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        return new java.lang.Integer(-1);
    }

    @Override // pp0.p0
    public void v0(com.tencent.maas.camstudio.d0 onComplete) {
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.W(onComplete);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "setAIGCFinishCallback>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void w0(com.tencent.maas.model.MJMusicInfo musicInfo, java.lang.String musicFilePath) {
        kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
        kotlin.jvm.internal.o.g(musicFilePath, "musicFilePath");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.O(musicInfo, musicFilePath);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "registerLocalMusic>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(com.tencent.maas.material.g r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof az0.ka
            if (r0 == 0) goto L13
            r0 = r6
            az0.ka r0 = (az0.ka) r0
            int r1 = r0.f15643h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15643h = r1
            goto L18
        L13:
            az0.ka r0 = new az0.ka
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f15641f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15643h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f15640e
            com.tencent.maas.material.g r5 = (com.tencent.maas.material.g) r5
            java.lang.Object r0 = r0.f15639d
            az0.xb r0 = (az0.xb) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L6f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "loadMaterialPack >> "
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MicroMsg.MaasSafeCamoSession"
            com.tencent.mars.xlog.Log.i(r2, r6)
            boolean r6 = r4.P0()
            if (r6 == 0) goto L5a
            java.lang.String r5 = "loadMaterialPack>> when call is release"
            com.tencent.mars.xlog.Log.w(r2, r5)
            r5 = 0
            return r5
        L5a:
            az0.la r6 = new az0.la
            r6.<init>(r4, r5)
            r0.f15639d = r4
            r0.f15640e = r5
            r0.f15643h = r3
            java.lang.String r2 = "1044"
            java.lang.Object r6 = az0.j.a(r2, r6, r0)
            if (r6 != r1) goto L6e
            return r1
        L6e:
            r0 = r4
        L6f:
            com.tencent.maas.material.MJMaterialPack r6 = (com.tencent.maas.material.MJMaterialPack) r6
            if (r6 == 0) goto L78
            java.util.HashSet r0 = r0.f16057f
            r0.add(r5)
        L78:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.x(com.tencent.maas.material.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public java.lang.Object x0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "clearComponentGroup");
        return Q0("1050", az0.ba.f15367d, continuation);
    }

    @Override // bs0.j
    public java.lang.Object y(int i17, int i18, int i19, boolean z17, kotlin.coroutines.Continuation continuation) {
        return new jz5.l(new java.lang.Integer(-1), null);
    }

    @Override // pp0.p0
    public void y0(boolean z17, com.tencent.maas.camstudio.j0 j0Var) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.q0(z17, j0Var);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "startExportingVideo>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void z(com.tencent.maas.instamovie.base.asset.MJAssetInfo assetInfo, java.lang.String outputFilePath, com.tencent.maas.instamovie.MJRecordingSettings recordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, com.tencent.maas.camstudio.d0 d0Var) {
        kotlin.jvm.internal.o.g(assetInfo, "assetInfo");
        kotlin.jvm.internal.o.g(outputFilePath, "outputFilePath");
        kotlin.jvm.internal.o.g(recordingSettings, "recordingSettings");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f16061m;
        kotlin.jvm.internal.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f16060i;
            if (!P0() && mJCamoSession != null) {
                mJCamoSession.c(assetInfo, outputFilePath, recordingSettings, mJAuditCaptureSettings, d0Var);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "beginUseAssetInput>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.maas.camstudio.MJCamMusicVolumeDesc z0() {
        /*
            r3 = this;
            java.lang.String r0 = "stateReadLock"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.f16061m
            kotlin.jvm.internal.o.f(r1, r0)
            r1.lock()
            com.tencent.maas.camstudio.MJCamoSession r0 = r3.f16060i     // Catch: java.lang.Throwable -> L32
            boolean r2 = r3.P0()     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L1d
            if (r0 != 0) goto L15
            goto L1d
        L15:
            com.tencent.maas.camstudio.MJCamMusicVolumeDesc r0 = r0.u()     // Catch: java.lang.Throwable -> L32
            r1.unlock()
            goto L28
        L1d:
            java.lang.String r0 = "MicroMsg.MaasSafeCamoSession"
            java.lang.String r2 = "getMusicVolumeDesc>> when main call is release"
            com.tencent.mars.xlog.Log.i(r0, r2)     // Catch: java.lang.Throwable -> L32
            r1.unlock()
            r0 = 0
        L28:
            if (r0 != 0) goto L31
            com.tencent.maas.camstudio.MJCamMusicVolumeDesc r0 = new com.tencent.maas.camstudio.MJCamMusicVolumeDesc
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1)
        L31:
            return r0
        L32:
            r0 = move-exception
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.z0():com.tencent.maas.camstudio.MJCamMusicVolumeDesc");
    }
}
