package az0;

/* loaded from: classes16.dex */
public final class s9 implements pp0.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d f97424d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f97425e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f97426f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f97427g;

    /* renamed from: h, reason: collision with root package name */
    public volatile p3325xe03a0797.p3326xc267989b.r2 f97428h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f97429i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 f97430m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock f97431n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock f97432o;

    public s9(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 camSession, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d camSourceManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camSession, "camSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camSourceManager, "camSourceManager");
        this.f97424d = camSourceManager;
        this.f97426f = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f97427g = new java.util.HashSet();
        this.f97430m = camSession;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f97431n = reentrantReadWriteLock.readLock();
        this.f97432o = reentrantReadWriteLock.writeLock();
    }

    public static final boolean a(az0.s9 s9Var) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = s9Var.f97428h;
        return (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) || s9Var.f97429i;
    }

    public static final void b(az0.s9 s9Var, yz5.l lVar) {
        s9Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "installFirstFrameCallback");
        s9Var.f97425e = p3325xe03a0797.p3326xc267989b.l.d(s9Var.f97426f, null, null, new az0.h9(s9Var, lVar, null), 3, null);
    }

    @Override // pp0.p0
    public void A0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "beginUseCameraInput");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.d(d0Var);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "beginUseCameraInput>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object B(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setBeautyAndMakeupDisabled");
        return c("1059", new az0.b9(z17), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void B0(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3977x2c5458b4 audioFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioFrame, "audioFrame");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.D(audioFrame);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "sendAudioFrame>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object C(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "startRecording");
        return c("1033", new az0.o9(str, c4084x74642117, c3978x9b06196b), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void C0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "notifyAIGCTaskCompleted");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.r();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "notifyAIGCTaskCompleted>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object D(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "loadMusic >> " + str);
        return c("1039", new az0.j8(this, str, uVar), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object E(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "pausePreview");
        return c("1025", new az0.o8(z17), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object E0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "resumePreview");
        return c("1026", az0.u8.f97478d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object F(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "clearBeautyDesc");
        return c("1030", az0.y7.f97613d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object G(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4015x3370f4b9 c4015x3370f4b9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "startPreview");
        return c("1024", new az0.m9(this, c4015x3370f4b9), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object G0(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 c4186x9bb007e5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setLocationInfo");
        return c("1048", new az0.j9(c4186x9bb007e5), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object H(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "pauseBackgroundMusic");
        return c("1057", az0.n8.f97281d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void H0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setWeslamLibPath");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.W(path);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setWeslamLibPath>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object I(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "clearMusicLyrics");
        return c("1054", az0.b8.f96898d, interfaceC29045xdcb5ca57);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[ORIG_RETURN, RETURN] */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int I0(java.lang.String r13, long r14, java.lang.String r16, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u r17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.r r18) {
        /*
            r12 = this;
            r1 = r12
            r0 = r13
            r6 = r16
            java.lang.String r2 = ", "
            java.lang.String r3 = "loadMaterial >> "
            java.lang.String r4 = "materialID"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r4)
            java.lang.String r4 = "downloadURL"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r4)
            java.lang.String r4 = "onProgress"
            r7 = r17
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r4)
            java.lang.String r4 = "onComplete"
            r8 = r18
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r4)
            java.lang.String r4 = "MicroMsg.MaasSafeCamSession"
            java.lang.String r5 = "loadMaterialAsync"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
            java.lang.String r5 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r1.f97431n
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r5)
            r9.lock()
            com.tencent.maas.camstudio.MJCamSession r5 = r1.f97430m     // Catch: java.lang.Throwable -> L80
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)     // Catch: java.lang.Throwable -> L80
            com.tencent.maas.camstudio.MJCamResourceManager r2 = r1.f97424d     // Catch: java.lang.Throwable -> L80
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)     // Catch: java.lang.Throwable -> L80
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
    public void J(com.p314xaae8f345.p457x3304c6.p461x3a6d265.EnumC3989x2312e1f cancelReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancelReason, "cancelReason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "cancelAIGCTask");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.h(cancelReason);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "cancelAIGCTask>> when main call is release");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            java.lang.String r1 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r4.f97431n
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r1)
            r2.lock()
            com.tencent.maas.camstudio.MJCamSession r1 = r4.f97430m     // Catch: java.lang.Throwable -> L32
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L32
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
    public java.lang.Object K(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "endAdjustSpatialDesc >> " + c4023x59e5ad63);
        return c("1056", new az0.d8(c4023x59e5ad63), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void K0(android.view.SurfaceView renderView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderView, "renderView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "bindRenderView");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.U(renderView);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "bindRenderView>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void L(com.p314xaae8f345.p457x3304c6.p461x3a6d265.f0 onGestureEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onGestureEvent, "onGestureEvent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setGestureEventCallback");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.Q(onGestureEvent);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setGestureEventCallback>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void L0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.a0 onAIGCRequestConditionNotMet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAIGCRequestConditionNotMet, "onAIGCRequestConditionNotMet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setAIGCRequestConditionNotMetFunc");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.G(onAIGCRequestConditionNotMet);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setAIGCRequestConditionNotMetFunc>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object M(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "clearFilterDesc");
        return c("1032", az0.a8.f96861d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object M0(java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "selectAndLoadMusic >> " + list);
        return p3325xe03a0797.p3326xc267989b.l.g(((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) this.f97426f).f392029d, new az0.l8(this, "1042", new az0.a9(this, list), null), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 N(java.lang.String materialID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialID, "materialID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "getBeautyDesc");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "getBeautyDesc >> ".concat(materialID));
                return this.f97424d.c(materialID);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "getBeautyDesc>> when main call is release");
            readLock.unlock();
            return null;
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object N0(jg.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setFaceGender >> " + dVar);
        return c("1051", new az0.d9(dVar), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object O(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "clearBackgroundMusic");
        return c("1038", az0.x7.f97583d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.String P(java.lang.String musicId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "getMusicFilePath");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                return this.f97424d.d(musicId);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "getMusicFilePath>> when main call is release");
            readLock.unlock();
            return null;
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void Q(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b aigcBridgeService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aigcBridgeService, "aigcBridgeService");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "registerAIGCBridgeService");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.x(aigcBridgeService);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "registerAIGCBridgeService>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object R(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 c4000x86998277, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setBeautyDesc");
        return c("1029", new az0.c9(c4000x86998277), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object S(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        java.lang.Object C;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "awaitFirstFrame");
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f97425e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (r2Var2 != null) {
            boolean z17 = false;
            if (r2Var2 != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var2).a()) {
                z17 = true;
            }
            if (z17 && (r2Var = this.f97425e) != null && (C = ((p3325xe03a0797.p3326xc267989b.c3) r2Var).C(interfaceC29045xdcb5ca57)) == pz5.a.f440719d) {
                return C;
            }
        }
        return f0Var;
    }

    @Override // pp0.p0
    public void T(com.p314xaae8f345.p457x3304c6.p461x3a6d265.c0 onBeginRequestAIGC) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onBeginRequestAIGC, "onBeginRequestAIGC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setBeginRequestAIGCFunc");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.J(onBeginRequestAIGC);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setBeginRequestAIGCFunc>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object U(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "loadBuiltinCommonResources");
        return c("1010", new az0.f8(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public boolean V(com.p314xaae8f345.p457x3304c6.p476x11d36527.g materialScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialScene, "materialScene");
        return this.f97427g.contains(materialScene);
    }

    @Override // pp0.p0
    public java.lang.Object W(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 c4019xd47cd265, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setSegmentationDesc");
        return c("1060", new az0.l9(c4019xd47cd265), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void X(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "cancelExportingVideo");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.i(onComplete);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "cancelExportingVideo>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object Y(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 interfaceC4037x150215d2, java.lang.String str, boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.z zVar, boolean z18, boolean z19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "exportPhoto");
        return c("1035", new az0.e8(interfaceC4037x150215d2, str, z17, zVar, z18, z19), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void Z(yz5.l cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setFirstFrameCallbackAfterSwitchTemplate");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.O(new az0.i9(cb6));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setFirstFrameCallbackAfterSwitchTemplate>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object b0(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.q qVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "loadTemplate >> " + str);
        return c("1011", new az0.k8(this, str, qVar, uVar), interfaceC29045xdcb5ca57);
    }

    public final java.lang.Object c(java.lang.String str, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) this.f97426f).f392029d, new az0.m8(this, str, pVar, null), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void c0(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3975xde78a307 params, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "updateAIGCResult");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.c0(params, onComplete);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "updateAIGCResult>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void d0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 videoFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoFrame, "videoFrame");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.E(videoFrame);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "sendVideoFrame>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object e0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4007x274e54bb c4007x274e54bb, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setFilterDesc");
        return c("1031", new az0.e9(c4007x274e54bb), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void g0(java.lang.String draftBundleDirPath, com.p314xaae8f345.p457x3304c6.p461x3a6d265.i0 onSaveAIGCCraftComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftBundleDirPath, "draftBundleDirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSaveAIGCCraftComplete, "onSaveAIGCCraftComplete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "saveAsyncAIGCDraft");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.C(draftBundleDirPath, onSaveAIGCCraftComplete);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "saveAsyncAIGCDraft>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void h0(java.lang.String draftBundleDirPath, java.lang.String videoOutputFilePath, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 recordingSettings, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftBundleDirPath, "draftBundleDirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoOutputFilePath, "videoOutputFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordingSettings, "recordingSettings");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "openAsyncAIGCDraft");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.u(draftBundleDirPath, videoOutputFilePath, recordingSettings, c3978x9b06196b, d0Var);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "openAsyncAIGCDraft>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void i(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c cdnBridgeService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnBridgeService, "cdnBridgeService");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "registerCDNBridgeService");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.y(cdnBridgeService);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "registerCDNBridgeService>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object j(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4015x3370f4b9 c4015x3370f4b9, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "startPreview");
        return c("1024", new az0.n9(this, lVar, c4015x3370f4b9), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object j0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "resumeBackgroundMusic");
        return c("1058", az0.t8.f97452d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "getCurrentBackgroundMusic");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                return c4020x8c1a4944.n();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "getCurrentBackgroundMusic>> when main call is release");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            java.lang.String r1 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r4.f97431n
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r1)
            r2.lock()
            com.tencent.maas.camstudio.MJCamSession r1 = r4.f97430m     // Catch: java.lang.Throwable -> L3a
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L3a
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
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4024xee1c0e5a l(java.lang.String templateID, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateID, "templateID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "getTemplateInfo");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "getTemplateInfo >> " + templateID + ", " + j17);
                return this.f97424d.e(templateID, j17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "getTemplateInfo>> when main call is release");
            readLock.unlock();
            return null;
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object m(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "loadMaterial >> " + str);
        return c("1045", new az0.g8(this, str, uVar), interfaceC29045xdcb5ca57);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|(1:23))(3:24|12|13))|11|12|13))|27|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof az0.s8
            if (r0 == 0) goto L13
            r0 = r6
            az0.s8 r0 = (az0.s8) r0
            int r1 = r0.f97423f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97423f = r1
            goto L18
        L13:
            az0.s8 r0 = new az0.s8
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f97421d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97423f
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)     // Catch: java.lang.Throwable -> L4c
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            kotlin.Result$Companion r6 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L4c
            kotlinx.coroutines.r2 r6 = r5.mo9340x41012807()     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L47
            r0.f97423f = r4     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r6.C(r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L45
            return r1
        L45:
            r6 = r3
            goto L48
        L47:
            r6 = 0
        L48:
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r6)     // Catch: java.lang.Throwable -> L4c
            goto L56
        L4c:
            r6 = move-exception
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r6 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r6)
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r6)
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.m0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public java.lang.Object n(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "updateMusicLyrics");
        return c("1053", new az0.r9(c4012xe1ac9984), interfaceC29045xdcb5ca57);
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r1)
            java.lang.String r1 = "MicroMsg.MaasSafeCamSession"
            java.lang.String r2 = "isTemplateLoaded"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            java.lang.String r2 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r5.f97431n
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r2)
            r3.lock()
            com.tencent.maas.camstudio.MJCamSession r2 = r5.f97430m     // Catch: java.lang.Throwable -> L5a
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L5a
            com.tencent.maas.camstudio.MJCamResourceManager r0 = r5.f97424d     // Catch: java.lang.Throwable -> L5a
            boolean r6 = r0.g(r6, r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L5a
            r3.unlock()
            goto L51
        L48:
            java.lang.String r6 = "isTemplateLoaded>> when main call is release"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)     // Catch: java.lang.Throwable -> L5a
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
    public java.lang.Object o(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) this.f97426f).f392029d, new az0.r7(this, null), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void o0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.h0 onRecordingTimeChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRecordingTimeChange, "onRecordingTimeChange");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setRecordingTimeDidChangeFunc");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.T(onRecordingTimeChange);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setRecordingTimeDidChangeFunc>> when main call is release");
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
    public int p(java.lang.String r6, com.p314xaae8f345.p457x3304c6.p461x3a6d265.q r7, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u r8, yz5.l r9) {
        /*
            r5 = this;
            java.lang.String r0 = "loadTemplateAsync >> "
            java.lang.String r1 = "templateId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r1)
            java.lang.String r1 = "loadPriority"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r1)
            java.lang.String r1 = "onProgress"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r1)
            java.lang.String r1 = "onCompletion"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r1)
            java.lang.String r1 = "MicroMsg.MaasSafeCamSession"
            java.lang.String r2 = "loadTemplate"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            java.lang.String r2 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r5.f97431n
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r2)
            r3.lock()
            com.tencent.maas.camstudio.MJCamSession r2 = r5.f97430m     // Catch: java.lang.Throwable -> L5e
            boolean r4 = a(r5)     // Catch: java.lang.Throwable -> L5e
            if (r4 != 0) goto L4c
            if (r2 != 0) goto L32
            goto L4c
        L32:
            java.lang.String r0 = r0.concat(r6)     // Catch: java.lang.Throwable -> L5e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L5e
            com.tencent.maas.camstudio.MJCamResourceManager r0 = r5.f97424d     // Catch: java.lang.Throwable -> L5e
            az0.v8 r1 = new az0.v8     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L5e
            int r6 = r0.n(r6, r7, r8, r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L5e
            r3.unlock()
            goto L55
        L4c:
            java.lang.String r6 = "loadTemplate>> when main call is release"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)     // Catch: java.lang.Throwable -> L5e
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
    public java.lang.Object p0(java.lang.String r6, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof az0.u7
            if (r0 == 0) goto L13
            r0 = r8
            az0.u7 r0 = (az0.u7) r0
            int r1 = r0.f97477f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97477f = r1
            goto L18
        L13:
            az0.u7 r0 = new az0.u7
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f97475d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97477f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            kotlinx.coroutines.y0 r8 = r5.f97426f
            kotlinx.coroutines.internal.h r8 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) r8
            oz5.l r8 = r8.f392029d
            az0.w7 r2 = new az0.w7
            r4 = 0
            r2.<init>(r6, r5, r7, r4)
            r0.f97477f = r3
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            kotlin.Result r8 = (p3321xbce91901.C29043x91b2b43d) r8
            java.lang.Object r6 = r8.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.p0(java.lang.String, com.tencent.maas.camstudio.MJCamTemplateOverridingParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public void q() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "loadBuiltinCommonResourcesAsync");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                this.f97424d.h(null);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "loadBuiltinCommonResourcesAsync>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object q0(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "beginUseComponentGroup");
        return c("1049", new az0.t7(str), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object r(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "beginPlayBackgroundMusic >> " + c4012xe1ac9984.m32610x92013dca());
        return c("1037", new az0.s7(c4012xe1ac9984), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void r0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4029xcd150c4a params, com.p314xaae8f345.p457x3304c6.p461x3a6d265.g0 finishCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finishCallback, "finishCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setExposureCheck");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.L(finishCallback);
                c4020x8c1a4944.K(params);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setExposureCheck>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    /* renamed from: release */
    public p3325xe03a0797.p3326xc267989b.r2 mo9340x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "release");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock stateWriteLock = this.f97432o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateWriteLock, "stateWriteLock");
        stateWriteLock.lock();
        try {
            if (!this.f97429i && this.f97428h == null) {
                this.f97429i = true;
                this.f97427g.clear();
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3325xe03a0797.p3326xc267989b.z0.e(this.f97426f, null, 1, null);
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
                if (c4020x8c1a4944 == null) {
                    return null;
                }
                this.f97430m = null;
                this.f97428h = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new az0.r8(c4020x8c1a4944, this, null), 2, null);
                return this.f97428h;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "has releaseJob");
            return this.f97428h;
        } finally {
            stateWriteLock.unlock();
        }
    }

    @Override // pp0.p0
    public void s(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "notifySwitchCamera");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.t(z17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "notifySwitchCamera>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void s0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "cancelLoad");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "cancelLoad >> " + i17);
                this.f97424d.b(i17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "cancelLoad>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object t(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e c4013x695a957e, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object c17 = c("1060", new az0.k9(c4013x695a957e), interfaceC29045xdcb5ca57);
        return c17 == pz5.a.f440719d ? c17 : jz5.f0.f384359a;
    }

    @Override // pp0.p0
    public java.lang.Object t0(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) this.f97426f).f392029d, new az0.q9(this, z17, null), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void u(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "notifyHorizontalFOV");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.s(f17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "notifyHorizontalFOV>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object u0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "clearTemplate");
        return c("1028", az0.c8.f96926d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void v0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setAIGCFinishCallback");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.F(onComplete);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "setAIGCFinishCallback>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void w0(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 musicInfo, java.lang.String musicFilePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfo, "musicInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicFilePath, "musicFilePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "registerLocalMusic");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                this.f97424d.o(musicInfo, musicFilePath);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "registerLocalMusic>> when main call is release");
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
    public java.lang.Object x(com.p314xaae8f345.p457x3304c6.p476x11d36527.g r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof az0.h8
            if (r0 == 0) goto L13
            r0 = r8
            az0.h8 r0 = (az0.h8) r0
            int r1 = r0.f97068h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97068h = r1
            goto L18
        L13:
            az0.h8 r0 = new az0.h8
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f97066f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97068h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.f97065e
            com.tencent.maas.material.g r7 = (com.p314xaae8f345.p457x3304c6.p476x11d36527.g) r7
            java.lang.Object r0 = r0.f97064d
            az0.s9 r0 = (az0.s9) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L6e
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "loadMaterialPack >> "
            r8.<init>(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.MaasSafeCamSession"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            az0.i8 r8 = new az0.i8
            r8.<init>(r6, r7)
            r0.f97064d = r6
            r0.f97065e = r7
            r0.f97068h = r3
            kotlinx.coroutines.y0 r2 = r6.f97426f
            kotlinx.coroutines.internal.h r2 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) r2
            oz5.l r2 = r2.f392029d
            az0.l8 r3 = new az0.l8
            r4 = 0
            java.lang.String r5 = "1044"
            r3.<init>(r6, r5, r8, r4)
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r2, r3, r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            r0 = r6
        L6e:
            com.tencent.maas.material.MJMaterialPack r8 = (com.p314xaae8f345.p457x3304c6.p476x11d36527.C4108x6d452a1d) r8
            if (r8 == 0) goto L77
            java.util.HashSet r0 = r0.f97427g
            r0.add(r7)
        L77:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.s9.x(com.tencent.maas.material.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public java.lang.Object x0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "clearComponentGroup");
        return c("1050", az0.z7.f97641d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void y0(boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.j0 j0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "startExportingVideo");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.X(z17, j0Var);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "startExportingVideo>> when main call is release");
        } finally {
            readLock.unlock();
        }
    }

    @Override // pp0.p0
    public void z(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 assetInfo, java.lang.String outputFilePath, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 recordingSettings, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetInfo, "assetInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputFilePath, "outputFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordingSettings, "recordingSettings");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "beginUseAssetInput");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f97431n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(readLock, "access$getStateReadLock$p(...)");
        readLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 c4020x8c1a4944 = this.f97430m;
            if (!a(this) && c4020x8c1a4944 != null) {
                c4020x8c1a4944.c(assetInfo, outputFilePath, recordingSettings, c3978x9b06196b, d0Var);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamSession", "beginUseAssetInput>> when main call is release");
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
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e z0() {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.MaasSafeCamSession"
            java.lang.String r1 = "getMusicVolumeDesc"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            java.lang.String r1 = "access$getStateReadLock$p(...)"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r4.f97431n
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r1)
            r2.lock()
            com.tencent.maas.camstudio.MJCamSession r1 = r4.f97430m     // Catch: java.lang.Throwable -> L37
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L37
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
