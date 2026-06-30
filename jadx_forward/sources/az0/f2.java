package az0;

/* loaded from: classes16.dex */
public final class f2 implements pp0.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 f96993d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d f96994e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f96995f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f96996g;

    /* renamed from: h, reason: collision with root package name */
    public volatile p3325xe03a0797.p3326xc267989b.r2 f96997h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f96998i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f96999m;

    public f2(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4020x8c1a4944 camSession, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4016x48c9106d camSourceManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camSession, "camSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camSourceManager, "camSourceManager");
        this.f96993d = camSession;
        this.f96994e = camSourceManager;
        this.f96996g = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f96999m = new java.util.HashSet();
    }

    public static final void a(az0.f2 f2Var) {
        f2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "installFirstFrameCallback");
        f2Var.f96995f = p3325xe03a0797.p3326xc267989b.l.d(f2Var.f96996g, null, null, new az0.u1(f2Var, null), 3, null);
    }

    @Override // pp0.p0
    public void A0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "beginUseCameraInput");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "beginUseCameraInput >> when main call is release");
        } else {
            this.f96993d.d(d0Var);
        }
    }

    @Override // pp0.p0
    public java.lang.Object B(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "setBeautyAndMakeupDisabled >> " + z17);
        return c("1059", new az0.o1(this, z17), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void B0(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3977x2c5458b4 audioFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioFrame, "audioFrame");
        b("sendAudioFrame", new az0.m1(this, audioFrame));
    }

    @Override // pp0.p0
    public java.lang.Object C(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "startRecording");
        return c("1033", new az0.c2(this, str, c4084x74642117, c3978x9b06196b), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void C0() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "notifyAIGCTaskCompleted >> when main call is release");
        } else {
            this.f96993d.r();
        }
    }

    @Override // pp0.p0
    public java.lang.Object D(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "loadMusic >> " + str);
        return c("1039", new az0.w0(this, str, uVar), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object E(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "pausePreview");
        return c("1025", new az0.a1(this, z17), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object E0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "resumePreview");
        return c("1026", new az0.f1(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object F(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "clearBeautyDesc");
        return c("1030", new az0.k0(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object G(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4015x3370f4b9 c4015x3370f4b9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "startPreview");
        return c("1024", new az0.a2(this, c4015x3370f4b9), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object G0(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 c4186x9bb007e5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "setLocationInfo");
        return c("1048", new az0.w1(this, c4186x9bb007e5), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object H(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "pauseBackgroundMusic");
        return c("1057", new az0.z0(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void H0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        b("setWeslamLibPath", new az0.z1(this, path));
    }

    @Override // pp0.p0
    public java.lang.Object I(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "clearMusicLyrics");
        return c("1054", new az0.n0(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public int I0(java.lang.String materialID, long j17, java.lang.String downloadURL, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u onProgress, com.p314xaae8f345.p457x3304c6.p461x3a6d265.r onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialID, "materialID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadURL, "downloadURL");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "loadMaterial >> " + materialID + ", " + j17 + ", " + downloadURL);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f96998i) {
            return this.f96994e.j(materialID, j17, downloadURL, onProgress, onComplete);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasImproveCamManager", "loadMaterial >> when call is release");
        return -1;
    }

    @Override // pp0.p0
    public void J(com.p314xaae8f345.p457x3304c6.p461x3a6d265.EnumC3989x2312e1f cancelReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancelReason, "cancelReason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "cancelAIGCTask: cancelReason=" + cancelReason);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "cancelAIGCTask >> when main call is release");
        } else {
            this.f96993d.h(cancelReason);
        }
    }

    @Override // pp0.p0
    public android.opengl.EGLContext J0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "getSharedEGLContext");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f96998i) {
            return this.f96993d.p();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "getSharedEGLContext>> when main call is release");
        return android.opengl.EGL14.EGL_NO_CONTEXT;
    }

    @Override // pp0.p0
    public java.lang.Object K(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "endAdjustSpatialDesc >> " + c4023x59e5ad63);
        return c("1056", new az0.p0(this, c4023x59e5ad63), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void K0(android.view.SurfaceView renderView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderView, "renderView");
        b("bindRenderView", new az0.i0(this, renderView));
    }

    @Override // pp0.p0
    public void L(com.p314xaae8f345.p457x3304c6.p461x3a6d265.f0 onGestureEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onGestureEvent, "onGestureEvent");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "setAIGCFinishCallback >> when main call is release");
        } else {
            this.f96993d.Q(onGestureEvent);
        }
    }

    @Override // pp0.p0
    public void L0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.a0 onAIGCRequestConditionNotMet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAIGCRequestConditionNotMet, "onAIGCRequestConditionNotMet");
        this.f96993d.G(onAIGCRequestConditionNotMet);
    }

    @Override // pp0.p0
    public java.lang.Object M(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "clearFilterDesc");
        return c("1032", new az0.m0(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object M0(java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "selectAndLoadMusic >> " + list);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f96998i) {
            return az0.j.a("1042", new az0.l1(this, list), interfaceC29045xdcb5ca57);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasImproveCamManager", "1042 >> when call is release");
        return null;
    }

    @Override // pp0.p0
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 N(java.lang.String materialID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialID, "materialID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "getBeautyDesc >> ".concat(materialID));
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f96998i) {
            return this.f96994e.c(materialID);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "getBeautyDesc>> when main call is release");
        return null;
    }

    @Override // pp0.p0
    public java.lang.Object N0(jg.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f96998i) {
            return c("1051", new az0.r1(this, dVar), interfaceC29045xdcb5ca57);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "setFaceGender>> when main call is release");
        return java.lang.Boolean.FALSE;
    }

    @Override // pp0.p0
    public java.lang.Object O(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "clearBackgroundMusic");
        return c("1038", new az0.j0(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.String P(java.lang.String musicId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        return null;
    }

    @Override // pp0.p0
    public void Q(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b aigcBridgeService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aigcBridgeService, "aigcBridgeService");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "registerAIGCBridgeService >> when main call is release");
        } else {
            this.f96993d.x(aigcBridgeService);
        }
    }

    @Override // pp0.p0
    public java.lang.Object R(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 c4000x86998277, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "setBeautyDesc");
        return c("1029", new az0.p1(this, c4000x86998277), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object S(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        java.lang.Object C;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "awaitFirstFrame");
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f96995f;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (r2Var2 != null) {
            boolean z17 = false;
            if (r2Var2 != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var2).a()) {
                z17 = true;
            }
            if (z17 && (r2Var = this.f96995f) != null && (C = ((p3325xe03a0797.p3326xc267989b.c3) r2Var).C(interfaceC29045xdcb5ca57)) == pz5.a.f440719d) {
                return C;
            }
        }
        return f0Var;
    }

    @Override // pp0.p0
    public void T(com.p314xaae8f345.p457x3304c6.p461x3a6d265.c0 onBeginRequestAIGC) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onBeginRequestAIGC, "onBeginRequestAIGC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "setBeginRequestAIGCFunc");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "setBeginRequestAIGCFunc >> when main call is release");
        } else {
            this.f96993d.J(onBeginRequestAIGC);
        }
    }

    @Override // pp0.p0
    public java.lang.Object U(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "loadBuiltinCommonResources");
        return c("1010", new az0.r0(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public boolean V(com.p314xaae8f345.p457x3304c6.p476x11d36527.g materialScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialScene, "materialScene");
        return this.f96999m.contains(materialScene);
    }

    @Override // pp0.p0
    public java.lang.Object W(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4019xd47cd265 c4019xd47cd265, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "setSegmentationDesc");
        return c("1060", new az0.y1(this, c4019xd47cd265), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void X(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "cancelExportingVideo");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "cancelExportingVideo >> when main call is release");
        } else {
            this.f96993d.i(onComplete);
        }
    }

    @Override // pp0.p0
    public java.lang.Object Y(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 interfaceC4037x150215d2, java.lang.String str, boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.z zVar, boolean z18, boolean z19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "exportPhoto");
        return c("1035", new az0.q0(this, interfaceC4037x150215d2, str, z17, zVar, z18, z19), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void Z(yz5.l cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        this.f96993d.O(new az0.v1(cb6));
    }

    public final void b(java.lang.String str, yz5.a aVar) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f96998i) {
            aVar.mo152xb9724478();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", str + ">> when main call is release");
    }

    @Override // pp0.p0
    public java.lang.Object b0(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.q qVar, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "loadTemplate >> " + str);
        return c("1011", new az0.x0(this, str, qVar, uVar), interfaceC29045xdcb5ca57);
    }

    public final java.lang.Object c(java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f96998i) {
            return az0.j.b(str, lVar, interfaceC29045xdcb5ca57);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasImproveCamManager", str + " >> when call is release");
        return java.lang.Boolean.FALSE;
    }

    @Override // pp0.p0
    public void c0(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3975xde78a307 params, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "updateAIGCResult");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "updateAIGCResult >> when main call is release");
        } else {
            this.f96993d.c0(params, onComplete);
        }
    }

    @Override // pp0.p0
    public void d0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 videoFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoFrame, "videoFrame");
        b("sendVideoFrame", new az0.n1(this, videoFrame));
    }

    @Override // pp0.p0
    public java.lang.Object e0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4007x274e54bb c4007x274e54bb, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "setFilterDesc");
        return c("1031", new az0.s1(this, c4007x274e54bb), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void g0(java.lang.String draftBundleDirPath, com.p314xaae8f345.p457x3304c6.p461x3a6d265.i0 onSaveAIGCCraftComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftBundleDirPath, "draftBundleDirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSaveAIGCCraftComplete, "onSaveAIGCCraftComplete");
    }

    @Override // pp0.p0
    public void h0(java.lang.String draftBundleDirPath, java.lang.String videoOutputFilePath, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 recordingSettings, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftBundleDirPath, "draftBundleDirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoOutputFilePath, "videoOutputFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordingSettings, "recordingSettings");
    }

    @Override // pp0.p0
    public void i(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c cdnBridgeService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnBridgeService, "cdnBridgeService");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "registerCDNBridgeService >> when main call is release");
        } else {
            this.f96993d.y(cdnBridgeService);
        }
    }

    @Override // pp0.p0
    public java.lang.Object j(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4015x3370f4b9 c4015x3370f4b9, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "startPreview");
        return c("1024", new az0.b2(this, c4015x3370f4b9), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object j0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "resumeBackgroundMusic");
        return c("1058", new az0.e1(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 k() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f96998i) {
            return this.f96993d.n();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "getCurrentBackgroundMusic>> when main call is release");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (((p3325xe03a0797.p3326xc267989b.a) r0).a() == true) goto L8;
     */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k0() {
        /*
            r3 = this;
            kotlinx.coroutines.r2 r0 = r3.f96997h
            r1 = 0
            if (r0 == 0) goto Lf
            kotlinx.coroutines.a r0 = (p3325xe03a0797.p3326xc267989b.a) r0
            boolean r0 = r0.a()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 != 0) goto L1e
            boolean r0 = r3.f96998i
            if (r0 == 0) goto L17
            goto L1e
        L17:
            com.tencent.maas.camstudio.MJCamSession r0 = r3.f96993d
            boolean r0 = r0.q()
            return r0
        L1e:
            java.lang.String r0 = "MicroMsg.MaasImproveCamManager"
            java.lang.String r2 = "isBeautyAndMakeupDisabled>> when main call is release"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.f2.k0():boolean");
    }

    @Override // pp0.p0
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4024xee1c0e5a l(java.lang.String templateID, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateID, "templateID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "getTemplateInfo >> " + templateID + ", " + j17);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (!z17 && !this.f96998i) {
            return this.f96994e.e(templateID, j17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "getTemplateInfo>> when main call is release");
        return null;
    }

    @Override // pp0.p0
    public java.lang.Object m(java.lang.String str, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "loadMaterial >> " + str);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        if ((r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasImproveCamManager", "loadMaterial >> when call is release");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        } else {
            int k17 = this.f96994e.k(str, uVar, new az0.t0(rVar));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "loadMaterial >> taskID: " + k17);
            rVar.m(new az0.s0(this, k17));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    @Override // pp0.p0
    public java.lang.Object m0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }

    @Override // pp0.p0
    public java.lang.Object n(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "updateMusicLyrics");
        return c("1053", new az0.e2(this, c4012xe1ac9984), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public boolean n0(java.lang.String templateId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "isTemplateLoaded: templateId=" + templateId + ", templateVersion=" + j17);
        return this.f96994e.g(templateId, j17);
    }

    @Override // pp0.p0
    public java.lang.Object o(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "beginAdjustSpatialDesc");
        return az0.j.a("1055", new az0.d0(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void o0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.h0 onRecordingTimeChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRecordingTimeChange, "onRecordingTimeChange");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "setRecordingTimeDidChangeFunc >> when main call is release");
        } else {
            this.f96993d.T(onRecordingTimeChange);
        }
    }

    @Override // pp0.p0
    public int p(java.lang.String templateId, com.p314xaae8f345.p457x3304c6.p461x3a6d265.q loadPriority, com.p314xaae8f345.p457x3304c6.p461x3a6d265.u onProgress, yz5.l onCompletion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadPriority, "loadPriority");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCompletion, "onCompletion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "loadTemplateAsync >> ".concat(templateId));
        return this.f96994e.n(templateId, loadPriority, onProgress, new az0.g1(onCompletion));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p0(java.lang.String r7, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof az0.g0
            if (r0 == 0) goto L13
            r0 = r9
            az0.g0 r0 = (az0.g0) r0
            int r1 = r0.f97022i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97022i = r1
            goto L18
        L13:
            az0.g0 r0 = new az0.g0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f97020g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97022i
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L89
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "beginUseTemplateV2 >> "
            r9.<init>(r2)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.MaasImproveCamManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            kotlinx.coroutines.r2 r9 = r6.f96997h
            if (r9 == 0) goto L53
            kotlinx.coroutines.a r9 = (p3325xe03a0797.p3326xc267989b.a) r9
            boolean r9 = r9.a()
            if (r9 != r3) goto L53
            r9 = r3
            goto L54
        L53:
            r9 = 0
        L54:
            if (r9 != 0) goto L90
            boolean r9 = r6.f96998i
            if (r9 == 0) goto L5b
            goto L90
        L5b:
            long r4 = java.lang.System.currentTimeMillis()
            r0.f97017d = r6
            r0.f97018e = r7
            r0.f97019f = r8
            r0.f97022i = r3
            oz5.n r9 = new oz5.n
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r9.<init>(r0)
            az0.h0 r0 = new az0.h0
            r0.<init>(r9, r4)
            if (r8 != 0) goto L7d
            com.tencent.maas.camstudio.MJCamSession r8 = r6.f96993d
            r8.f(r7, r0)
            goto L82
        L7d:
            com.tencent.maas.camstudio.MJCamSession r2 = r6.f96993d
            r2.g(r7, r8, r0)
        L82:
            java.lang.Object r9 = r9.a()
            if (r9 != r1) goto L89
            return r1
        L89:
            kotlin.Result r9 = (p3321xbce91901.C29043x91b2b43d) r9
            java.lang.Object r7 = r9.getValue()
            return r7
        L90:
            java.lang.String r7 = "beginUseTemplateV2 >> when call is release"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r7)
            kotlin.Result$Companion r7 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "when call is release"
            r7.<init>(r8)
            java.lang.Object r7 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r7)
            java.lang.Object r7 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.f2.p0(java.lang.String, com.tencent.maas.camstudio.MJCamTemplateOverridingParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public void q() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "loadBuiltinCommonResourcesAsync");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "loadBuiltinCommonResourcesAsync >> when main call is release");
        } else {
            this.f96994e.h(null);
        }
    }

    @Override // pp0.p0
    public java.lang.Object q0(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "beginUseComponentGroup");
        return c("1049", new az0.f0(this, str), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public java.lang.Object r(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "beginPlayBackgroundMusic >> " + c4012xe1ac9984.m32610x92013dca());
        return c("1037", new az0.e0(this, c4012xe1ac9984), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void r0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4029xcd150c4a params, com.p314xaae8f345.p457x3304c6.p461x3a6d265.g0 finishCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finishCallback, "finishCallback");
        b("setExposureCheck", new az0.q1(this, finishCallback, params));
    }

    @Override // pp0.p0
    /* renamed from: release */
    public p3325xe03a0797.p3326xc267989b.r2 mo9340x41012807() {
        this.f96999m.clear();
        if (this.f96997h != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "has releaseJob");
            return this.f96997h;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "release");
        this.f96997h = p3325xe03a0797.p3326xc267989b.l.d(this.f96996g, null, null, new az0.d1(this, null), 3, null);
        return this.f96997h;
    }

    @Override // pp0.p0
    public void s(boolean z17) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z18 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z18 = true;
        }
        if (z18 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "notifySwitchCamera >> when main call is release");
        } else {
            this.f96993d.t(z17);
        }
    }

    @Override // pp0.p0
    public void s0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "cancelLoad >> " + i17);
        this.f96994e.b(i17);
    }

    @Override // pp0.p0
    public java.lang.Object t(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e c4013x695a957e, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object c17 = c("1061", new az0.x1(this, c4013x695a957e), interfaceC29045xdcb5ca57);
        return c17 == pz5.a.f440719d ? c17 : jz5.f0.f384359a;
    }

    @Override // pp0.p0
    public java.lang.Object t0(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "stopRecording");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z18 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z18 = true;
        }
        if (!z18 && !this.f96998i) {
            return az0.j.a("1034", new az0.d2(this, z17), interfaceC29045xdcb5ca57);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "stopRecording>> when main call is release");
        return null;
    }

    @Override // pp0.p0
    public void u(float f17) {
        b("notifyHorizontalFOV", new az0.y0(this, f17));
    }

    @Override // pp0.p0
    public java.lang.Object u0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "clearTemplate");
        return c("1028", new az0.o0(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void v0(com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "setAIGCFinishCallback >> when main call is release");
        } else {
            this.f96993d.F(onComplete);
        }
    }

    @Override // pp0.p0
    public void w0(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 musicInfo, java.lang.String musicFilePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfo, "musicInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicFilePath, "musicFilePath");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // pp0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(com.p314xaae8f345.p457x3304c6.p476x11d36527.g r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof az0.u0
            if (r0 == 0) goto L13
            r0 = r7
            az0.u0 r0 = (az0.u0) r0
            int r1 = r0.f97465h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97465h = r1
            goto L18
        L13:
            az0.u0 r0 = new az0.u0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f97463f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97465h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f97462e
            com.tencent.maas.material.g r6 = (com.p314xaae8f345.p457x3304c6.p476x11d36527.g) r6
            java.lang.Object r0 = r0.f97461d
            az0.f2 r0 = (az0.f2) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L77
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "loadMaterialPack >> "
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "MicroMsg.MaasImproveCamManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r7)
            kotlinx.coroutines.r2 r7 = r5.f96997h
            r4 = 0
            if (r7 == 0) goto L5b
            kotlinx.coroutines.a r7 = (p3325xe03a0797.p3326xc267989b.a) r7
            boolean r7 = r7.a()
            if (r7 != r3) goto L5b
            r4 = r3
        L5b:
            if (r4 != 0) goto L81
            boolean r7 = r5.f96998i
            if (r7 == 0) goto L62
            goto L81
        L62:
            az0.v0 r7 = new az0.v0
            r7.<init>(r5, r6)
            r0.f97461d = r5
            r0.f97462e = r6
            r0.f97465h = r3
            java.lang.String r2 = "1044"
            java.lang.Object r7 = az0.j.a(r2, r7, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            r0 = r5
        L77:
            com.tencent.maas.material.MJMaterialPack r7 = (com.p314xaae8f345.p457x3304c6.p476x11d36527.C4108x6d452a1d) r7
            if (r7 == 0) goto L80
            java.util.HashSet r0 = r0.f96999m
            r0.add(r6)
        L80:
            return r7
        L81:
            java.lang.String r6 = "loadMaterialPack>> when call is release"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.f2.x(com.tencent.maas.material.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pp0.p0
    public java.lang.Object x0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "clearComponentGroup");
        return c("1050", new az0.l0(this), interfaceC29045xdcb5ca57);
    }

    @Override // pp0.p0
    public void y0(boolean z17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.j0 j0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "startExportingVideo");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z18 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z18 = true;
        }
        if (z18 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "startExportingVideo >> when main call is release");
        } else {
            this.f96993d.X(z17, j0Var);
        }
    }

    @Override // pp0.p0
    public void z(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 assetInfo, java.lang.String outputFilePath, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 recordingSettings, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 d0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetInfo, "assetInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputFilePath, "outputFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordingSettings, "recordingSettings");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "beginUseAssetInput");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "beginUseAssetInput >> when main call is release");
        } else {
            this.f96993d.c(assetInfo, outputFilePath, recordingSettings, c3978x9b06196b, d0Var);
        }
    }

    @Override // pp0.p0
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e z0() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f96997h;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        if (z17 || this.f96998i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasImproveCamManager", "getMusicVolumeDesc>> when main call is release");
            return new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e(1.0f);
        }
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e o17 = this.f96993d.o();
        return o17 == null ? new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e(1.0f) : o17;
    }
}
