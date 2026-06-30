package az0;

/* loaded from: classes16.dex */
public final class s9 implements pp0.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJCamResourceManager f15891d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f15892e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f15893f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f15894g;

    /* renamed from: h, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f15895h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15896i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.maas.camstudio.MJCamSession f15897m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock f15898n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock f15899o;

    public s9(com.tencent.maas.camstudio.MJCamSession camSession, com.tencent.maas.camstudio.MJCamResourceManager camSourceManager) {
        kotlin.jvm.internal.o.g(camSession, "camSession");
        kotlin.jvm.internal.o.g(camSourceManager, "camSourceManager");
        this.f15891d = camSourceManager;
        this.f15893f = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f15894g = new java.util.HashSet();
        this.f15897m = camSession;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f15898n = reentrantReadWriteLock.readLock();
        this.f15899o = reentrantReadWriteLock.writeLock();
    }

    public static final boolean a(az0.s9 s9Var) {
        kotlinx.coroutines.r2 r2Var = s9Var.f15895h;
        return (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) || s9Var.f15896i;
    }

    public static final void b(az0.s9 s9Var, yz5.l lVar) {
        s9Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "installFirstFrameCallback");
        s9Var.f15892e = kotlinx.coroutines.l.d(s9Var.f15893f, null, null, new az0.h9(s9Var, lVar, null), 3, null);
    }

    @Override // pp0.p0
    public void A0(com.tencent.maas.camstudio.d0 d0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "beginUseCameraInput");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.d(d0Var);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "beginUseCameraInput>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object B(boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setBeautyAndMakeupDisabled");
        return c("1059", new az0.b9(z17), continuation);
    }

    @Override // pp0.p0
    public void B0(com.tencent.maas.camerafun.MJAudioFrame audioFrame) {
        kotlin.jvm.internal.o.g(audioFrame, "audioFrame");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.D(audioFrame);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "sendAudioFrame>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object C(java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "startRecording");
        return c("1033", new az0.o9(str, mJRecordingSettings, mJAuditCaptureSettings), continuation);
    }

    @Override // pp0.p0
    public void C0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "notifyAIGCTaskCompleted");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.r();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "notifyAIGCTaskCompleted>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object D(java.lang.String str, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "loadMusic >> " + str);
        return c("1039", new az0.j8(this, str, uVar), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object E(boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "pausePreview");
        return c("1025", new az0.o8(z17), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object E0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "resumePreview");
        return c("1026", az0.u8.f15945d, continuation);
    }

    @Override // pp0.p0
    public java.lang.Object F(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "clearBeautyDesc");
        return c("1030", az0.y7.f16080d, continuation);
    }

    @Override // pp0.p0
    public java.lang.Object G(com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "startPreview");
        return c("1024", new az0.m9(this, mJCamPreviewSettings), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object G0(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setLocationInfo");
        return c("1048", new az0.j9(geographicInfo), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object H(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "pauseBackgroundMusic");
        return c("1057", az0.n8.f15748d, continuation);
    }

    @Override // pp0.p0
    public void H0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setWeslamLibPath");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.W(path);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setWeslamLibPath>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object I(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "clearMusicLyrics");
        return c("1054", az0.b8.f15365d, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[ORIG_RETURN, RETURN] */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int I0(java.lang.String r13, long r14, java.lang.String r16, com.tencent.maas.camstudio.u r17, com.tencent.maas.camstudio.r r18) {
        /*
            r12 = this;
            r1 = r12
            r0 = r13
            r6 = r16
            java.lang.String r2 = ", "
            java.lang.String r3 = "loadMaterial >> "
            java.lang.String r4 = "materialID"
            kotlin.jvm.internal.o.g(r13, r4)
            java.lang.String r4 = "downloadURL"
            kotlin.jvm.internal.o.g(r6, r4)
            java.lang.String r4 = "onProgress"
            r7 = r17
            kotlin.jvm.internal.o.g(r7, r4)
            java.lang.String r4 = "onComplete"
            r8 = r18
            kotlin.jvm.internal.o.g(r8, r4)
            java.lang.String r4 = "MicroMsg.MaasSafeCamSession"
            java.lang.String r5 = "loadMaterialAsync"
            com.tencent.mars.xlog.Log.i(r4, r5)
            java.lang.String r5 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r1.f15898n
            kotlin.jvm.internal.o.f(r9, r5)
            r9.lock()
            com.tencent.maas.camstudio.MJCamSession r5 = r1.f15897m     // Catch: java.lang.Throwable -> L80
            boolean r10 = a(r12)     // Catch: java.lang.Throwable -> L80
            if (r10 != 0) goto L6e
            if (r5 != 0) goto L3c
            goto L6e
        L3c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L80
            r5.append(r13)     // Catch: java.lang.Throwable -> L80
            r5.append(r2)     // Catch: java.lang.Throwable -> L80
            r10 = r14
            r5.append(r14)     // Catch: java.lang.Throwable -> L80
            r5.append(r2)     // Catch: java.lang.Throwable -> L80
            r5.append(r6)     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L80
            com.tencent.mars.xlog.Log.i(r4, r2)     // Catch: java.lang.Throwable -> L80
            com.tencent.maas.camstudio.MJCamResourceManager r2 = r1.f15891d     // Catch: java.lang.Throwable -> L80
            r3 = r13
            r4 = r14
            r6 = r16
            r7 = r17
            r8 = r18
            int r0 = r2.j(r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L80
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L80
            r9.unlock()
            goto L77
        L6e:
            java.lang.String r0 = "loadMaterialAsync>> when main call is release"
            com.tencent.mars.xlog.Log.i(r4, r0)     // Catch: java.lang.Throwable -> L80
            r9.unlock()
            r0 = 0
        L77:
            if (r0 == 0) goto L7e
            int r0 = r0.intValue()
            goto L7f
        L7e:
            r0 = -1
        L7f:
            return r0
        L80:
            r0 = move-exception
            r9.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.I0(java.lang.String, long, java.lang.String, com.tencent.maas.camstudio.u, com.tencent.maas.camstudio.r):int");
    }

    @Override // pp0.p0
    public void J(com.tencent.maas.camstudio.MJAIGCCancelReason cancelReason) {
        kotlin.jvm.internal.o.g(cancelReason, "cancelReason");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "cancelAIGCTask");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.h(cancelReason);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "cancelAIGCTask>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.opengl.EGLContext J0() {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.MaasSafeCamSession"
            java.lang.String r1 = "getSharedEGLContext"
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.String r1 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r4.f15898n
            kotlin.jvm.internal.o.f(r2, r1)
            r2.lock()
            com.tencent.maas.camstudio.MJCamSession r1 = r4.f15897m     // Catch: java.lang.Throwable -> L32
            boolean r3 = a(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L24
            if (r1 != 0) goto L1c
            goto L24
        L1c:
            android.opengl.EGLContext r0 = r1.p()     // Catch: java.lang.Throwable -> L32
            r2.unlock()
            goto L2d
        L24:
            java.lang.String r1 = "getSharedEGLContext>> when main call is release"
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L32
            r2.unlock()
            r0 = 0
        L2d:
            if (r0 != 0) goto L31
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
        L31:
            return r0
        L32:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.J0():android.opengl.EGLContext");
    }

    @Override // pp0.p0
    public java.lang.Object K(com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "endAdjustSpatialDesc >> " + mJCamSpatialDesc);
        return c("1056", new az0.d8(mJCamSpatialDesc), continuation);
    }

    @Override // pp0.p0
    public void K0(android.view.SurfaceView renderView) {
        kotlin.jvm.internal.o.g(renderView, "renderView");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "bindRenderView");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.U(renderView);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "bindRenderView>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void L(com.tencent.maas.camstudio.f0 onGestureEvent) {
        kotlin.jvm.internal.o.g(onGestureEvent, "onGestureEvent");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setGestureEventCallback");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.Q(onGestureEvent);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setGestureEventCallback>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void L0(com.tencent.maas.camstudio.a0 onAIGCRequestConditionNotMet) {
        kotlin.jvm.internal.o.g(onAIGCRequestConditionNotMet, "onAIGCRequestConditionNotMet");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setAIGCRequestConditionNotMetFunc");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.G(onAIGCRequestConditionNotMet);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setAIGCRequestConditionNotMetFunc>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object M(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "clearFilterDesc");
        return c("1032", az0.a8.f15328d, continuation);
    }

    @Override // pp0.p0
    public java.lang.Object M0(java.util.List list, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "selectAndLoadMusic >> " + list);
        return kotlinx.coroutines.l.g(((kotlinx.coroutines.internal.h) this.f15893f).f310496d, new az0.l8(this, "1042", new az0.a9(this, list), null), continuation);
    }

    @Override // pp0.p0
    public com.tencent.maas.camstudio.MJBeautyAdjustmentDesc N(java.lang.String materialID) {
        kotlin.jvm.internal.o.g(materialID, "materialID");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "getBeautyDesc");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "getBeautyDesc >> ".concat(materialID));
                return this.f15891d.c(materialID);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "getBeautyDesc>> when main call is release");
            readLock.unlock();
            return null;
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object N0(jg.d dVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setFaceGender >> " + dVar);
        return c("1051", new az0.d9(dVar), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object O(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "clearBackgroundMusic");
        return c("1038", az0.x7.f16050d, continuation);
    }

    @Override // pp0.p0
    public java.lang.String P(java.lang.String musicId) {
        kotlin.jvm.internal.o.g(musicId, "musicId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "getMusicFilePath");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                return this.f15891d.d(musicId);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "getMusicFilePath>> when main call is release");
            readLock.unlock();
            return null;
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void Q(com.tencent.maas.camstudio.MJAIGCBridgeService aigcBridgeService) {
        kotlin.jvm.internal.o.g(aigcBridgeService, "aigcBridgeService");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "registerAIGCBridgeService");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.x(aigcBridgeService);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "registerAIGCBridgeService>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object R(com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setBeautyDesc");
        return c("1029", new az0.c9(mJBeautyAdjustmentDesc), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object S(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r2 r2Var;
        java.lang.Object C;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "awaitFirstFrame");
        kotlinx.coroutines.r2 r2Var2 = this.f15892e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (r2Var2 != null) {
            boolean z17 = false;
            if (r2Var2 != null && ((kotlinx.coroutines.a) r2Var2).a()) {
                z17 = true;
            }
            if (z17 && (r2Var = this.f15892e) != null && (C = ((kotlinx.coroutines.c3) r2Var).C(continuation)) == pz5.a.f359186d) {
                return C;
            }
        }
        return f0Var;
    }

    @Override // pp0.p0
    public void T(com.tencent.maas.camstudio.c0 onBeginRequestAIGC) {
        kotlin.jvm.internal.o.g(onBeginRequestAIGC, "onBeginRequestAIGC");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setBeginRequestAIGCFunc");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.J(onBeginRequestAIGC);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setBeginRequestAIGCFunc>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object U(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "loadBuiltinCommonResources");
        return c("1010", new az0.f8(this), continuation);
    }

    @Override // pp0.p0
    public boolean V(com.tencent.maas.material.g materialScene) {
        kotlin.jvm.internal.o.g(materialScene, "materialScene");
        return this.f15894g.contains(materialScene);
    }

    @Override // pp0.p0
    public java.lang.Object W(com.tencent.maas.camstudio.MJCamSegmentationDesc mJCamSegmentationDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setSegmentationDesc");
        return c("1060", new az0.l9(mJCamSegmentationDesc), continuation);
    }

    @Override // pp0.p0
    public void X(com.tencent.maas.camstudio.d0 onComplete) {
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "cancelExportingVideo");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.i(onComplete);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "cancelExportingVideo>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object Y(com.tencent.maas.camstudio.frame.VideoFrame videoFrame, java.lang.String str, boolean z17, com.tencent.maas.camstudio.z zVar, boolean z18, boolean z19, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "exportPhoto");
        return c("1035", new az0.e8(videoFrame, str, z17, zVar, z18, z19), continuation);
    }

    @Override // pp0.p0
    public void Z(yz5.l cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setFirstFrameCallbackAfterSwitchTemplate");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.O(new az0.i9(cb6));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setFirstFrameCallbackAfterSwitchTemplate>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object b0(java.lang.String str, com.tencent.maas.camstudio.q qVar, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "loadTemplate >> " + str);
        return c("1011", new az0.k8(this, str, qVar, uVar), continuation);
    }

    public final java.lang.Object c(java.lang.String str, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(((kotlinx.coroutines.internal.h) this.f15893f).f310496d, new az0.m8(this, str, pVar, null), continuation);
    }

    @Override // pp0.p0
    public void c0(com.tencent.maas.camerafun.MJAIGCParams params, com.tencent.maas.camstudio.d0 onComplete) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "updateAIGCResult");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.c0(params, onComplete);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "updateAIGCResult>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void d0(com.tencent.maas.camstudio.frame.VideoFrame videoFrame) {
        kotlin.jvm.internal.o.g(videoFrame, "videoFrame");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.E(videoFrame);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "sendVideoFrame>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object e0(com.tencent.maas.camstudio.MJCamFilterDesc mJCamFilterDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setFilterDesc");
        return c("1031", new az0.e9(mJCamFilterDesc), continuation);
    }

    @Override // pp0.p0
    public void g0(java.lang.String draftBundleDirPath, com.tencent.maas.camstudio.i0 onSaveAIGCCraftComplete) {
        kotlin.jvm.internal.o.g(draftBundleDirPath, "draftBundleDirPath");
        kotlin.jvm.internal.o.g(onSaveAIGCCraftComplete, "onSaveAIGCCraftComplete");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "saveAsyncAIGCDraft");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.C(draftBundleDirPath, onSaveAIGCCraftComplete);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "saveAsyncAIGCDraft>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void h0(java.lang.String draftBundleDirPath, java.lang.String videoOutputFilePath, com.tencent.maas.instamovie.MJRecordingSettings recordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, com.tencent.maas.camstudio.d0 d0Var) {
        kotlin.jvm.internal.o.g(draftBundleDirPath, "draftBundleDirPath");
        kotlin.jvm.internal.o.g(videoOutputFilePath, "videoOutputFilePath");
        kotlin.jvm.internal.o.g(recordingSettings, "recordingSettings");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "openAsyncAIGCDraft");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.u(draftBundleDirPath, videoOutputFilePath, recordingSettings, mJAuditCaptureSettings, d0Var);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "openAsyncAIGCDraft>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void i(com.tencent.maas.camstudio.MJCDNBridgeService cdnBridgeService) {
        kotlin.jvm.internal.o.g(cdnBridgeService, "cdnBridgeService");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "registerCDNBridgeService");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.y(cdnBridgeService);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "registerCDNBridgeService>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object j(com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "startPreview");
        return c("1024", new az0.n9(this, lVar, mJCamPreviewSettings), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object j0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "resumeBackgroundMusic");
        return c("1058", az0.t8.f15919d, continuation);
    }

    @Override // pp0.p0
    public com.tencent.maas.camstudio.MJCamMusicDesc k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "getCurrentBackgroundMusic");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                return mJCamSession.n();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "getCurrentBackgroundMusic>> when main call is release");
            readLock.unlock();
            return null;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[ORIG_RETURN, RETURN] */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k0() {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.MaasSafeCamSession"
            java.lang.String r1 = "isBeautyAndMakeupDisabled"
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.String r1 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r4.f15898n
            kotlin.jvm.internal.o.f(r2, r1)
            r2.lock()
            com.tencent.maas.camstudio.MJCamSession r1 = r4.f15897m     // Catch: java.lang.Throwable -> L3a
            boolean r3 = a(r4)     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L28
            if (r1 != 0) goto L1c
            goto L28
        L1c:
            boolean r0 = r1.q()     // Catch: java.lang.Throwable -> L3a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3a
            r2.unlock()
            goto L31
        L28:
            java.lang.String r1 = "isBeautyAndMakeupDisabled>> when main call is release"
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L3a
            r2.unlock()
            r0 = 0
        L31:
            if (r0 == 0) goto L38
            boolean r0 = r0.booleanValue()
            goto L39
        L38:
            r0 = 0
        L39:
            return r0
        L3a:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.k0():boolean");
    }

    @Override // pp0.p0
    public com.tencent.maas.camstudio.MJCamTemplateInfo l(java.lang.String templateID, long j17) {
        kotlin.jvm.internal.o.g(templateID, "templateID");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "getTemplateInfo");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "getTemplateInfo >> " + templateID + ", " + j17);
                return this.f15891d.e(templateID, j17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "getTemplateInfo>> when main call is release");
            readLock.unlock();
            return null;
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object m(java.lang.String str, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "loadMaterial >> " + str);
        return c("1045", new az0.g8(this, str, uVar), continuation);
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
            boolean r0 = r6 instanceof az0.s8
            if (r0 == 0) goto L13
            r0 = r6
            az0.s8 r0 = (az0.s8) r0
            int r1 = r0.f15890f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15890f = r1
            goto L18
        L13:
            az0.s8 r0 = new az0.s8
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f15888d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15890f
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
            r0.f15890f = r4     // Catch: java.lang.Throwable -> L4c
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
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.m0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public java.lang.Object n(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "updateMusicLyrics");
        return c("1053", new az0.r9(mJCamMusicDesc), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[ORIG_RETURN, RETURN] */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n0(java.lang.String r6, long r7) {
        /*
            r5 = this;
            java.lang.String r0 = "isTemplateLoaded: templateId="
            java.lang.String r1 = "templateId"
            kotlin.jvm.internal.o.g(r6, r1)
            java.lang.String r1 = "MicroMsg.MaasSafeCamSession"
            java.lang.String r2 = "isTemplateLoaded"
            com.tencent.mars.xlog.Log.i(r1, r2)
            java.lang.String r2 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r5.f15898n
            kotlin.jvm.internal.o.f(r3, r2)
            r3.lock()
            com.tencent.maas.camstudio.MJCamSession r2 = r5.f15897m     // Catch: java.lang.Throwable -> L5a
            boolean r4 = a(r5)     // Catch: java.lang.Throwable -> L5a
            if (r4 != 0) goto L48
            if (r2 != 0) goto L23
            goto L48
        L23:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5a
            r2.append(r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = ", templateVersion="
            r2.append(r0)     // Catch: java.lang.Throwable -> L5a
            r2.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L5a
            com.tencent.mars.xlog.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L5a
            com.tencent.maas.camstudio.MJCamResourceManager r0 = r5.f15891d     // Catch: java.lang.Throwable -> L5a
            boolean r6 = r0.g(r6, r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L5a
            r3.unlock()
            goto L51
        L48:
            java.lang.String r6 = "isTemplateLoaded>> when main call is release"
            com.tencent.mars.xlog.Log.i(r1, r6)     // Catch: java.lang.Throwable -> L5a
            r3.unlock()
            r6 = 0
        L51:
            if (r6 == 0) goto L58
            boolean r6 = r6.booleanValue()
            goto L59
        L58:
            r6 = 0
        L59:
            return r6
        L5a:
            r6 = move-exception
            r3.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.n0(java.lang.String, long):boolean");
    }

    @Override // pp0.p0
    public java.lang.Object o(kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(((kotlinx.coroutines.internal.h) this.f15893f).f310496d, new az0.r7(this, null), continuation);
    }

    @Override // pp0.p0
    public void o0(com.tencent.maas.camstudio.h0 onRecordingTimeChange) {
        kotlin.jvm.internal.o.g(onRecordingTimeChange, "onRecordingTimeChange");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setRecordingTimeDidChangeFunc");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.T(onRecordingTimeChange);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setRecordingTimeDidChangeFunc>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[ORIG_RETURN, RETURN] */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int p(java.lang.String r6, com.tencent.maas.camstudio.q r7, com.tencent.maas.camstudio.u r8, yz5.l r9) {
        /*
            r5 = this;
            java.lang.String r0 = "loadTemplateAsync >> "
            java.lang.String r1 = "templateId"
            kotlin.jvm.internal.o.g(r6, r1)
            java.lang.String r1 = "loadPriority"
            kotlin.jvm.internal.o.g(r7, r1)
            java.lang.String r1 = "onProgress"
            kotlin.jvm.internal.o.g(r8, r1)
            java.lang.String r1 = "onCompletion"
            kotlin.jvm.internal.o.g(r9, r1)
            java.lang.String r1 = "MicroMsg.MaasSafeCamSession"
            java.lang.String r2 = "loadTemplate"
            com.tencent.mars.xlog.Log.i(r1, r2)
            java.lang.String r2 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r5.f15898n
            kotlin.jvm.internal.o.f(r3, r2)
            r3.lock()
            com.tencent.maas.camstudio.MJCamSession r2 = r5.f15897m     // Catch: java.lang.Throwable -> L5e
            boolean r4 = a(r5)     // Catch: java.lang.Throwable -> L5e
            if (r4 != 0) goto L4c
            if (r2 != 0) goto L32
            goto L4c
        L32:
            java.lang.String r0 = r0.concat(r6)     // Catch: java.lang.Throwable -> L5e
            com.tencent.mars.xlog.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L5e
            com.tencent.maas.camstudio.MJCamResourceManager r0 = r5.f15891d     // Catch: java.lang.Throwable -> L5e
            az0.v8 r1 = new az0.v8     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L5e
            int r6 = r0.n(r6, r7, r8, r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L5e
            r3.unlock()
            goto L55
        L4c:
            java.lang.String r6 = "loadTemplate>> when main call is release"
            com.tencent.mars.xlog.Log.i(r1, r6)     // Catch: java.lang.Throwable -> L5e
            r3.unlock()
            r6 = 0
        L55:
            if (r6 == 0) goto L5c
            int r6 = r6.intValue()
            goto L5d
        L5c:
            r6 = -1
        L5d:
            return r6
        L5e:
            r6 = move-exception
            r3.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.p(java.lang.String, com.tencent.maas.camstudio.q, com.tencent.maas.camstudio.u, yz5.l):int");
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
            boolean r0 = r8 instanceof az0.u7
            if (r0 == 0) goto L13
            r0 = r8
            az0.u7 r0 = (az0.u7) r0
            int r1 = r0.f15944f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15944f = r1
            goto L18
        L13:
            az0.u7 r0 = new az0.u7
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f15942d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15944f
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
            kotlinx.coroutines.y0 r8 = r5.f15893f
            kotlinx.coroutines.internal.h r8 = (kotlinx.coroutines.internal.h) r8
            oz5.l r8 = r8.f310496d
            az0.w7 r2 = new az0.w7
            r4 = 0
            r2.<init>(r6, r5, r7, r4)
            r0.f15944f = r3
            java.lang.Object r8 = kotlinx.coroutines.l.g(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.p0(java.lang.String, com.tencent.maas.camstudio.MJCamTemplateOverridingParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public void q() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "loadBuiltinCommonResourcesAsync");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                this.f15891d.h(null);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "loadBuiltinCommonResourcesAsync>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object q0(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "beginUseComponentGroup");
        return c("1049", new az0.t7(str), continuation);
    }

    @Override // pp0.p0
    public java.lang.Object r(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "beginPlayBackgroundMusic >> " + mJCamMusicDesc.getMusicID());
        return c("1037", new az0.s7(mJCamMusicDesc), continuation);
    }

    @Override // pp0.p0
    public void r0(com.tencent.maas.camstudio.MJExposureCheckParams params, com.tencent.maas.camstudio.g0 finishCallback) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(finishCallback, "finishCallback");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setExposureCheck");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.L(finishCallback);
                mJCamSession.K(params);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setExposureCheck>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public kotlinx.coroutines.r2 release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "release");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock stateWriteLock = this.f15899o;
        kotlin.jvm.internal.o.f(stateWriteLock, "stateWriteLock");
        stateWriteLock.lock();
        try {
            if (!this.f15896i && this.f15895h == null) {
                this.f15896i = true;
                this.f15894g.clear();
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    kotlinx.coroutines.z0.e(this.f15893f, null, 1, null);
                    kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
                if (mJCamSession == null) {
                    return null;
                }
                this.f15897m = null;
                this.f15895h = kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new az0.r8(mJCamSession, this, null), 2, null);
                return this.f15895h;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "has releaseJob");
            return this.f15895h;
        } finally {
            stateWriteLock.unlock();
        }
    }

    @Override // pp0.p0
    public void s(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "notifySwitchCamera");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.t(z17);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "notifySwitchCamera>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void s0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "cancelLoad");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "cancelLoad >> " + i17);
                this.f15891d.b(i17);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "cancelLoad>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object t(com.tencent.maas.camstudio.MJCamMusicVolumeDesc mJCamMusicVolumeDesc, kotlin.coroutines.Continuation continuation) {
        java.lang.Object c17 = c("1060", new az0.k9(mJCamMusicVolumeDesc), continuation);
        return c17 == pz5.a.f359186d ? c17 : jz5.f0.f302826a;
    }

    @Override // pp0.p0
    public java.lang.Object t0(boolean z17, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(((kotlinx.coroutines.internal.h) this.f15893f).f310496d, new az0.q9(this, z17, null), continuation);
    }

    @Override // pp0.p0
    public void u(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "notifyHorizontalFOV");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.s(f17);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "notifyHorizontalFOV>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object u0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "clearTemplate");
        return c("1028", az0.c8.f15393d, continuation);
    }

    @Override // pp0.p0
    public void v0(com.tencent.maas.camstudio.d0 onComplete) {
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setAIGCFinishCallback");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.F(onComplete);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "setAIGCFinishCallback>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void w0(com.tencent.maas.model.MJMusicInfo musicInfo, java.lang.String musicFilePath) {
        kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
        kotlin.jvm.internal.o.g(musicFilePath, "musicFilePath");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "registerLocalMusic");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                this.f15891d.o(musicInfo, musicFilePath);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "registerLocalMusic>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(com.tencent.maas.material.g r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof az0.h8
            if (r0 == 0) goto L13
            r0 = r8
            az0.h8 r0 = (az0.h8) r0
            int r1 = r0.f15535h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15535h = r1
            goto L18
        L13:
            az0.h8 r0 = new az0.h8
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f15533f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15535h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.f15532e
            com.tencent.maas.material.g r7 = (com.tencent.maas.material.g) r7
            java.lang.Object r0 = r0.f15531d
            az0.s9 r0 = (az0.s9) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6e
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "loadMaterialPack >> "
            r8.<init>(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.MaasSafeCamSession"
            com.tencent.mars.xlog.Log.i(r2, r8)
            az0.i8 r8 = new az0.i8
            r8.<init>(r6, r7)
            r0.f15531d = r6
            r0.f15532e = r7
            r0.f15535h = r3
            kotlinx.coroutines.y0 r2 = r6.f15893f
            kotlinx.coroutines.internal.h r2 = (kotlinx.coroutines.internal.h) r2
            oz5.l r2 = r2.f310496d
            az0.l8 r3 = new az0.l8
            r4 = 0
            java.lang.String r5 = "1044"
            r3.<init>(r6, r5, r8, r4)
            java.lang.Object r8 = kotlinx.coroutines.l.g(r2, r3, r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            r0 = r6
        L6e:
            com.tencent.maas.material.MJMaterialPack r8 = (com.tencent.maas.material.MJMaterialPack) r8
            if (r8 == 0) goto L77
            java.util.HashSet r0 = r0.f15894g
            r0.add(r7)
        L77:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.x(com.tencent.maas.material.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public java.lang.Object x0(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "clearComponentGroup");
        return c("1050", az0.z7.f16108d, continuation);
    }

    @Override // pp0.p0
    public void y0(boolean z17, com.tencent.maas.camstudio.j0 j0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "startExportingVideo");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.X(z17, j0Var);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "startExportingVideo>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void z(com.tencent.maas.instamovie.base.asset.MJAssetInfo assetInfo, java.lang.String outputFilePath, com.tencent.maas.instamovie.MJRecordingSettings recordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, com.tencent.maas.camstudio.d0 d0Var) {
        kotlin.jvm.internal.o.g(assetInfo, "assetInfo");
        kotlin.jvm.internal.o.g(outputFilePath, "outputFilePath");
        kotlin.jvm.internal.o.g(recordingSettings, "recordingSettings");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "beginUseAssetInput");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f15898n;
        kotlin.jvm.internal.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15897m;
            if (!a(this) && mJCamSession != null) {
                mJCamSession.c(assetInfo, outputFilePath, recordingSettings, mJAuditCaptureSettings, d0Var);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "beginUseAssetInput>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.maas.camstudio.MJCamMusicVolumeDesc z0() {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.MaasSafeCamSession"
            java.lang.String r1 = "getMusicVolumeDesc"
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.String r1 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r4.f15898n
            kotlin.jvm.internal.o.f(r2, r1)
            r2.lock()
            com.tencent.maas.camstudio.MJCamSession r1 = r4.f15897m     // Catch: java.lang.Throwable -> L37
            boolean r3 = a(r4)     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L24
            if (r1 != 0) goto L1c
            goto L24
        L1c:
            com.tencent.maas.camstudio.MJCamMusicVolumeDesc r0 = r1.o()     // Catch: java.lang.Throwable -> L37
            r2.unlock()
            goto L2d
        L24:
            java.lang.String r1 = "getMusicVolumeDesc>> when main call is release"
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L37
            r2.unlock()
            r0 = 0
        L2d:
            if (r0 != 0) goto L36
            com.tencent.maas.camstudio.MJCamMusicVolumeDesc r0 = new com.tencent.maas.camstudio.MJCamMusicVolumeDesc
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1)
        L36:
            return r0
        L37:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.z0():com.tencent.maas.camstudio.MJCamMusicVolumeDesc");
    }
}
