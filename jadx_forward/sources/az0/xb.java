package az0;

/* loaded from: classes16.dex */
public final class xb implements pp0.p0, bs0.h {

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f97588d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f97589e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f97590f;

    /* renamed from: g, reason: collision with root package name */
    public volatile p3325xe03a0797.p3326xc267989b.r2 f97591g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f97592h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 f97593i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock f97594m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock f97595n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f97596o;

    public xb(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 camoSession) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camoSession, "camoSession");
        this.f97589e = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f97590f = new java.util.HashSet();
        this.f97593i = camoSession;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f97594m = reentrantReadWriteLock.readLock();
        this.f97595n = reentrantReadWriteLock.writeLock();
        this.f97596o = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(new jz5.l(bs0.g.f105320d, new android.os.Bundle()));
    }

    public static final void O0(az0.xb xbVar, yz5.l lVar) {
        xbVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "installFirstFrameCallback");
        xbVar.f97588d = p3325xe03a0797.p3326xc267989b.l.d(xbVar.f97589e, null, null, new az0.kb(xbVar, lVar, null), 3, null);
    }

    @Override // bs0.h
    public void A(android.view.Surface surface, java.lang.Integer num, java.lang.Integer num2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    @Override // pp0.p0
    public void A0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.d(d0Var);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "beginUseCameraInput>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object B(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setBeautyAndMakeupDisabled");
        return Q0("1059", new az0.eb(z17), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void B0(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3977x2c5458b4 audioFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioFrame, "audioFrame");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.U(audioFrame);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "sendAudioFrame>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object C(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "startRecording");
        return Q0("1033", new az0.tb(str, c4084x74642117, c3978x9b06196b), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void C0() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a192 = this.f97593i;
                if (c4027x83c03a192 != null) {
                    c4027x83c03a192.G();
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "notifyAIGCTaskCompleted>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object D(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "loadMusic >> " + str);
        return Q0("1039", new az0.ma(this, str, uVar), interfaceC29045xdcb5ca57);
    }

    @Override // bs0.j
    public java.lang.Object D0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return null;
    }

    @Override // pp0.p0
    public java.lang.Object E(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "pausePreview");
        return Q0("1025", new az0.qa(z17), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object E0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "resumePreview");
        return Q0("1026", az0.wa.f97561d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object F(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "clearBeautyDesc");
        return Q0("1030", az0.aa.f96864d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object G(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4015x3370f4b9 c4015x3370f4b9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "startPreview");
        return Q0("1024", new az0.qb(this, c4015x3370f4b9), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object G0(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 c4186x9bb007e5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setLocationInfo");
        return Q0("1048", new az0.mb(c4186x9bb007e5), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object H(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "pauseBackgroundMusic");
        return Q0("1057", az0.pa.f97347d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void H0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.p0(path);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setWeslamLibPath>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object I(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "clearMusicLyrics");
        return Q0("1054", az0.da.f96945d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public int I0(java.lang.String materialID, long j17, java.lang.String downloadURL, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u onProgress, com.p314xaae8f345.p457x3304c6.p461x3a6d265.r onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialID, "materialID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadURL, "downloadURL");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "loadMaterial >> " + materialID + ", " + j17 + ", " + downloadURL);
        if (P0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSafeCamoSession", "loadMaterial >> when call is release");
            return -1;
        }
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
        if (c4027x83c03a19 == null) {
            return -1;
        }
        return c4027x83c03a19.B(materialID, j17, downloadURL, onProgress, onComplete);
    }

    @Override // pp0.p0
    public void J(com.p314xaae8f345.p457x3304c6.p461x3a6d265.EnumC3989x2312e1f cancelReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancelReason, "cancelReason");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.h(cancelReason);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "cancelAIGCTask>> when main call is release");
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
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.f97594m
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r0)
            r1.lock()
            com.tencent.maas.camstudio.MJCamoSession r0 = r3.f97593i     // Catch: java.lang.Throwable -> L2b
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Throwable -> L2b
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
    public java.lang.Object K(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "endAdjustSpatialDesc >> " + c4023x59e5ad63);
        return Q0("1056", new az0.fa(c4023x59e5ad63), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void K0(android.view.SurfaceView renderView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderView, "renderView");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.n0(renderView);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "bindRenderView>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void L(com.p314xaae8f345.p457x3304c6.p461x3a6d265.f0 onGestureEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onGestureEvent, "onGestureEvent");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.i0(onGestureEvent);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setGestureEventCallback>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void L0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.a0 onAIGCRequestConditionNotMet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAIGCRequestConditionNotMet, "onAIGCRequestConditionNotMet");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.X(onAIGCRequestConditionNotMet);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setAIGCRequestConditionNotMetFunc>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object M(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "clearFilterDesc");
        return Q0("1032", az0.ca.f96928d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object M0(java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "selectAndLoadMusic >> " + list);
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            if (P0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSafeCamoSession", "1042 >> when call is release");
                return null;
            }
            stateReadLock.unlock();
            return p3325xe03a0797.p3326xc267989b.l.g(((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) this.f97589e).f392029d, new az0.db(this, list, null), interfaceC29045xdcb5ca57);
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 N(java.lang.String materialID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialID, "materialID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "getBeautyDesc >> ".concat(materialID));
        if (P0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "getBeautyDesc>> when main call is release");
            return null;
        }
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
        if (c4027x83c03a19 != null) {
            return c4027x83c03a19.q(materialID);
        }
        return null;
    }

    @Override // pp0.p0
    public java.lang.Object N0(jg.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return Q0("1051", new az0.gb(dVar), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object O(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "clearBackgroundMusic");
        return Q0("1038", az0.z9.f97643d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.String P(java.lang.String musicId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                return c4027x83c03a19.t(musicId);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "getMusicFilePath>> when main call is release");
            stateReadLock.unlock();
            return null;
        } finally {
            stateReadLock.unlock();
        }
    }

    public final boolean P0() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f97591g;
        return (r2Var != null && r2Var.a()) || this.f97592h;
    }

    @Override // pp0.p0
    public void Q(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b aigcBridgeService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aigcBridgeService, "aigcBridgeService");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.M(aigcBridgeService);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "registerAIGCBridgeService>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    public final java.lang.Object Q0(java.lang.String str, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) this.f97589e).f392029d, new az0.oa(this, str, pVar, null), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object R(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 c4000x86998277, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setBeautyDesc");
        return Q0("1029", new az0.fb(c4000x86998277), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object S(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        java.lang.Object C;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "awaitFirstFrame");
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f97588d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (r2Var2 != null) {
            boolean z17 = false;
            if (r2Var2 != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var2).a()) {
                z17 = true;
            }
            if (z17 && (r2Var = this.f97588d) != null && (C = ((p3325xe03a0797.p3326xc267989b.c3) r2Var).C(interfaceC29045xdcb5ca57)) == pz5.a.f440719d) {
                return C;
            }
        }
        return f0Var;
    }

    @Override // pp0.p0
    public void T(com.p314xaae8f345.p457x3304c6.p461x3a6d265.c0 onBeginRequestAIGC) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onBeginRequestAIGC, "onBeginRequestAIGC");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.a0(onBeginRequestAIGC);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setBeginRequestAIGCFunc>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object U(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "loadBuiltinCommonResources");
        return Q0("1010", az0.ha.f97072d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public boolean V(com.p314xaae8f345.p457x3304c6.p476x11d36527.g materialScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialScene, "materialScene");
        return this.f97590f.contains(materialScene);
    }

    @Override // pp0.p0
    public java.lang.Object W(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 c4019xd47cd265, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return Q0("1060", new az0.ob(c4019xd47cd265), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void X(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.j(onComplete);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "cancelExportingVideo>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object Y(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 interfaceC4037x150215d2, java.lang.String str, boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.z zVar, boolean z18, boolean z19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "exportPhoto");
        return Q0("1035", new az0.ga(interfaceC4037x150215d2, str, z17, zVar, z18, z19), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void Z(yz5.l cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
        if (c4027x83c03a19 != null) {
            c4027x83c03a19.f0(new az0.lb(cb6));
        }
    }

    @Override // bs0.j
    public void a() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.z0(false);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "onZoomOut>> when main call is release");
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
    public java.lang.Object a0(boolean r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof az0.vb
            if (r0 == 0) goto L13
            r0 = r9
            az0.vb r0 = (az0.vb) r0
            int r1 = r0.f97517g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97517g = r1
            goto L18
        L13:
            az0.vb r0 = new az0.vb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f97515e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97517g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r8 = r0.f97514d
            java.util.concurrent.locks.Lock r8 = (java.util.concurrent.locks.Lock) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Throwable -> L2d
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
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.String r9 = "stateReadLock"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r7.f97594m
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r9)
            r2.lock()
            com.tencent.maas.camstudio.MJCamoSession r9 = r7.f97593i     // Catch: java.lang.Throwable -> L8d
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
            kotlinx.coroutines.flow.j2 r8 = r7.f97596o     // Catch: java.lang.Throwable -> L8d
            jz5.l r5 = new jz5.l     // Catch: java.lang.Throwable -> L8d
            bs0.g r6 = bs0.g.f105322f     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r6, r9)     // Catch: java.lang.Throwable -> L8d
            r0.f97514d = r2     // Catch: java.lang.Throwable -> L8d
            r0.f97517g = r4     // Catch: java.lang.Throwable -> L8d
            kotlinx.coroutines.flow.h3 r8 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r8     // Catch: java.lang.Throwable -> L7f
            r8.mo771x2f8fd3(r5, r0)     // Catch: java.lang.Throwable -> L7f
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r9)     // Catch: java.lang.Throwable -> L8d
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
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.z0(true);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "onZoomIn>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object b0(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.q qVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "loadTemplate >> " + str);
        return Q0("1011", new az0.na(str, qVar, uVar), interfaceC29045xdcb5ca57);
    }

    @Override // bs0.j
    public int c(int i17) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return 0;
    }

    @Override // pp0.p0
    public void c0(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3975xde78a307 params, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.x0(params, onComplete);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "updateAIGCResult>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // bs0.h
    public void d() {
    }

    @Override // pp0.p0
    public void d0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 videoFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoFrame, "videoFrame");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.V(videoFrame);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "sendVideoFrame>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // bs0.j
    public void e(boolean z17) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.h0(z17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "switchFlash>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object e0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4007x274e54bb c4007x274e54bb, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setFilterDesc");
        return Q0("1031", new az0.hb(c4007x274e54bb), interfaceC29045xdcb5ca57);
    }

    @Override // bs0.j
    public java.lang.Object f(int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return java.lang.Boolean.TRUE;
    }

    @Override // bs0.j
    public void f0(android.content.Context context, xr0.h setting) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setting, "setting");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (P0() || c4027x83c03a19 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setUpCamera>> when main call is release");
            }
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // bs0.j
    public boolean g(float f17) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return true;
    }

    @Override // pp0.p0
    public void g0(java.lang.String draftBundleDirPath, com.p314xaae8f345.p457x3304c6.p461x3a6d265.i0 onSaveAIGCCraftComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftBundleDirPath, "draftBundleDirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSaveAIGCCraftComplete, "onSaveAIGCCraftComplete");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.S(draftBundleDirPath, onSaveAIGCCraftComplete);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "saveAsyncAIGCDraft>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // bs0.j
    /* renamed from: getCameraState */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 mo9382x53e98736() {
        return p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(this.f97596o);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // bs0.j
    /* renamed from: getHorizontalViewAngle */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Float mo9383xdd520634() {
        /*
            r3 = this;
            java.lang.String r0 = "stateReadLock"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.f97594m
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r0)
            r1.lock()
            com.tencent.maas.camstudio.MJCamoSession r0 = r3.f97593i     // Catch: java.lang.Throwable -> L34
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Throwable -> L34
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
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.mo9383xdd520634():java.lang.Float");
    }

    @Override // bs0.j
    public void h(float f17, float f18) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.p(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(f17, f18));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setUpCamera>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void h0(java.lang.String draftBundleDirPath, java.lang.String videoOutputFilePath, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 recordingSettings, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftBundleDirPath, "draftBundleDirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoOutputFilePath, "videoOutputFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordingSettings, "recordingSettings");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.J(draftBundleDirPath, videoOutputFilePath, recordingSettings, c3978x9b06196b, d0Var);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "openAsyncAIGCDraft>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void i(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c cdnBridgeService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnBridgeService, "cdnBridgeService");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.N(cdnBridgeService);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "registerCDNBridgeService>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object j(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4015x3370f4b9 c4015x3370f4b9, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "startPreview");
        return Q0("1024", new az0.sb(this, lVar, c4015x3370f4b9), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object j0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "resumeBackgroundMusic");
        return Q0("1058", az0.va.f97513d, interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 k() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                return c4027x83c03a19.r();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "getCurrentBackgroundMusic>> when main call is release");
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
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.f97594m
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r0)
            r1.lock()
            com.tencent.maas.camstudio.MJCamoSession r0 = r3.f97593i     // Catch: java.lang.Throwable -> L35
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Throwable -> L35
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
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4024xee1c0e5a l(java.lang.String templateID, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateID, "templateID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "getTemplateInfo >> " + templateID + ", " + j17);
        if (P0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "getTemplateInfo>> when main call is release");
            return null;
        }
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
        if (c4027x83c03a19 != null) {
            return c4027x83c03a19.x(templateID, j17);
        }
        return null;
    }

    @Override // bs0.j
    public void l0(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
    }

    @Override // pp0.p0
    public java.lang.Object m(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "loadMaterial >> " + str);
        if (P0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSafeCamoSession", "loadMaterial >> when call is release");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        } else {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            java.lang.Integer num = c4027x83c03a19 != null ? new java.lang.Integer(c4027x83c03a19.C(str, uVar, new az0.ja(rVar))) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "loadMaterial >> taskID: " + num);
            rVar.m(new az0.ia(num, this));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
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
            boolean r0 = r6 instanceof az0.ua
            if (r0 == 0) goto L13
            r0 = r6
            az0.ua r0 = (az0.ua) r0
            int r1 = r0.f97482f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97482f = r1
            goto L18
        L13:
            az0.ua r0 = new az0.ua
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f97480d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97482f
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
            r0.f97482f = r4     // Catch: java.lang.Throwable -> L4c
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
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.m0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public java.lang.Object n(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "updateMusicLyrics");
        return Q0("1053", new az0.wb(c4012xe1ac9984), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public boolean n0(java.lang.String templateId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "isTemplateLoaded: templateId=" + templateId + ", templateVersion=" + j17);
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
        if (c4027x83c03a19 == null) {
            return false;
        }
        return c4027x83c03a19.z(templateId, j17);
    }

    @Override // pp0.p0
    public java.lang.Object o(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "beginAdjustSpatialDesc");
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
        if (c4027x83c03a19 == null) {
            return null;
        }
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        c4027x83c03a19.a(new az0.t9(new az0.g(nVar, "1055", java.lang.System.currentTimeMillis())));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    @Override // pp0.p0
    public void o0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.h0 onRecordingTimeChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRecordingTimeChange, "onRecordingTimeChange");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.m0(onRecordingTimeChange);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setRecordingTimeDidChangeFunc>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public int p(java.lang.String templateId, com.p314xaae8f345.p457x3304c6.p461x3a6d265.q loadPriority, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u onProgress, yz5.l onCompletion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadPriority, "loadPriority");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCompletion, "onCompletion");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (P0() || c4027x83c03a19 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "loadTemplate>> when main call is release");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "loadTemplateAsync >> ".concat(templateId));
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a192 = this.f97593i;
                r4 = c4027x83c03a192 != null ? java.lang.Integer.valueOf(c4027x83c03a192.F(templateId, loadPriority, onProgress, new az0.xa(onCompletion))) : null;
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
    public java.lang.Object p0(java.lang.String r6, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof az0.w9
            if (r0 == 0) goto L13
            r0 = r8
            az0.w9 r0 = (az0.w9) r0
            int r1 = r0.f97560f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97560f = r1
            goto L18
        L13:
            az0.w9 r0 = new az0.w9
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f97558d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97560f
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
            kotlinx.coroutines.y0 r8 = r5.f97589e
            kotlinx.coroutines.internal.h r8 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) r8
            oz5.l r8 = r8.f392029d
            az0.y9 r2 = new az0.y9
            r4 = 0
            r2.<init>(r6, r5, r7, r4)
            r0.f97560f = r3
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            kotlin.Result r8 = (p3321xbce91901.C29043x91b2b43d) r8
            java.lang.Object r6 = r8.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.p0(java.lang.String, com.tencent.maas.camstudio.MJCamTemplateOverridingParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public void q() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "loadBuiltinCommonResourcesAsync");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            if (P0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "loadBuiltinCommonResourcesAsync >> when main call is release");
                return;
            }
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (c4027x83c03a19 != null) {
                c4027x83c03a19.A(null);
            }
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object q0(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "beginUseComponentGroup");
        return Q0("1049", new az0.v9(str), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object r(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "beginPlayBackgroundMusic >> " + c4012xe1ac9984.m32610x92013dca());
        return Q0("1037", new az0.u9(c4012xe1ac9984), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void r0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4029xcd150c4a params, com.p314xaae8f345.p457x3304c6.p461x3a6d265.g0 finishCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finishCallback, "finishCallback");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.c0(finishCallback);
                c4027x83c03a19.b0(params);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setExposureCheck>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    /* renamed from: release */
    public p3325xe03a0797.p3326xc267989b.r2 mo9340x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "release");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock stateWriteLock = this.f97595n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateWriteLock, "stateWriteLock");
        stateWriteLock.lock();
        try {
            if (!this.f97592h && this.f97591g == null) {
                this.f97592h = true;
                this.f97590f.clear();
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3325xe03a0797.p3326xc267989b.z0.e(this.f97589e, null, 1, null);
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
                if (c4027x83c03a19 == null) {
                    return null;
                }
                this.f97593i = null;
                this.f97591g = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new az0.ta(c4027x83c03a19, null), 2, null);
                return this.f97591g;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "has releaseJob");
            return this.f97591g;
        } finally {
            stateWriteLock.unlock();
        }
    }

    @Override // pp0.p0
    public void s(boolean z17) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.I(z17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "notifySwitchCamera>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void s0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "cancelLoad >> " + i17);
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
        if (c4027x83c03a19 != null) {
            c4027x83c03a19.k(i17);
        }
    }

    @Override // bs0.j
    /* renamed from: setCameraViewRatio */
    public void mo9384xfd9785ff(bs0.f ratio) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ratio, "ratio");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    @Override // nr0.b0
    /* renamed from: setCustomRender */
    public void mo9385xabce2de9(nr0.c cVar) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    @Override // bs0.j
    /* renamed from: setLightTorch */
    public void mo9386xf597288(boolean z17) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.j0(z17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setUpCamera>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // bs0.j
    /* renamed from: switchCamera */
    public void mo9387x2db92f79() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (P0() || c4027x83c03a19 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "switchCamera>> when main call is release");
            }
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object t(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e c4013x695a957e, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object Q0 = Q0("1060", new az0.nb(c4013x695a957e), interfaceC29045xdcb5ca57);
        return Q0 == pz5.a.f440719d ? Q0 : jz5.f0.f384359a;
    }

    @Override // pp0.p0
    public java.lang.Object t0(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "stopRecording");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            if (P0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "stopRecording>> when main call is release");
                return null;
            }
            stateReadLock.unlock();
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (c4027x83c03a19 == null) {
                return null;
            }
            az0.ub ubVar = new az0.ub(z17);
            oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
            ubVar.mo149xb9724478(c4027x83c03a19, new az0.g(nVar, "1034", java.lang.System.currentTimeMillis()));
            java.lang.Object a17 = nVar.a();
            pz5.a aVar = pz5.a.f440719d;
            return a17;
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void u(float f17) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.H(f17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "notifyHorizontalFOV>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public java.lang.Object u0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "clearTemplate");
        return Q0("1028", az0.ea.f96981d, interfaceC29045xdcb5ca57);
    }

    @Override // bs0.j
    public java.lang.Object v(int i17, int i18, int i19, java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new java.lang.Integer(-1);
    }

    @Override // pp0.p0
    public void v0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.W(onComplete);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "setAIGCFinishCallback>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void w0(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 musicInfo, java.lang.String musicFilePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfo, "musicInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicFilePath, "musicFilePath");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.O(musicInfo, musicFilePath);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "registerLocalMusic>> when main call is release");
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
    public java.lang.Object x(com.p314xaae8f345.p457x3304c6.p476x11d36527.g r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof az0.ka
            if (r0 == 0) goto L13
            r0 = r6
            az0.ka r0 = (az0.ka) r0
            int r1 = r0.f97176h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97176h = r1
            goto L18
        L13:
            az0.ka r0 = new az0.ka
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f97174f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97176h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f97173e
            com.tencent.maas.material.g r5 = (com.p314xaae8f345.p457x3304c6.p476x11d36527.g) r5
            java.lang.Object r0 = r0.f97172d
            az0.xb r0 = (az0.xb) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L6f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "loadMaterialPack >> "
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MicroMsg.MaasSafeCamoSession"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            boolean r6 = r4.P0()
            if (r6 == 0) goto L5a
            java.lang.String r5 = "loadMaterialPack>> when call is release"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r5)
            r5 = 0
            return r5
        L5a:
            az0.la r6 = new az0.la
            r6.<init>(r4, r5)
            r0.f97172d = r4
            r0.f97173e = r5
            r0.f97176h = r3
            java.lang.String r2 = "1044"
            java.lang.Object r6 = az0.j.a(r2, r6, r0)
            if (r6 != r1) goto L6e
            return r1
        L6e:
            r0 = r4
        L6f:
            com.tencent.maas.material.MJMaterialPack r6 = (com.p314xaae8f345.p457x3304c6.p476x11d36527.C4108x6d452a1d) r6
            if (r6 == 0) goto L78
            java.util.HashSet r0 = r0.f97590f
            r0.add(r5)
        L78:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.xb.x(com.tencent.maas.material.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public java.lang.Object x0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "clearComponentGroup");
        return Q0("1050", az0.ba.f96900d, interfaceC29045xdcb5ca57);
    }

    @Override // bs0.j
    public java.lang.Object y(int i17, int i18, int i19, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jz5.l(new java.lang.Integer(-1), null);
    }

    @Override // pp0.p0
    public void y0(boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.j0 j0Var) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.q0(z17, j0Var);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "startExportingVideo>> when main call is release");
        } finally {
            stateReadLock.unlock();
        }
    }

    @Override // pp0.p0
    public void z(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 assetInfo, java.lang.String outputFilePath, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 recordingSettings, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetInfo, "assetInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputFilePath, "outputFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordingSettings, "recordingSettings");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock stateReadLock = this.f97594m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stateReadLock, "stateReadLock");
        stateReadLock.lock();
        try {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19 = this.f97593i;
            if (!P0() && c4027x83c03a19 != null) {
                c4027x83c03a19.c(assetInfo, outputFilePath, recordingSettings, c3978x9b06196b, d0Var);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSafeCamoSession", "beginUseAssetInput>> when main call is release");
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
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e z0() {
        /*
            r3 = this;
            java.lang.String r0 = "stateReadLock"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r3.f97594m
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r0)
            r1.lock()
            com.tencent.maas.camstudio.MJCamoSession r0 = r3.f97593i     // Catch: java.lang.Throwable -> L32
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)     // Catch: java.lang.Throwable -> L32
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
