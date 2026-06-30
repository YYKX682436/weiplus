package ro5;

/* loaded from: classes14.dex */
public final class a0 implements ro5.b {

    /* renamed from: a, reason: collision with root package name */
    public ro5.j f479667a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f479668b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f479669c = true;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f479670d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final so5.n0 f479671e;

    public a0() {
        so5.n0 n0Var = new so5.n0();
        n0Var.a(new ro5.w());
        this.f479671e = n0Var;
    }

    @Override // ro5.b
    public void A(int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27, int i28) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPRenderController2", "onVideoFrame: should not reach here");
    }

    @Override // ro5.b
    public void B() {
        this.f479671e.c();
        this.f479668b = false;
        this.f479669c = true;
        java.util.HashMap hashMap = this.f479670d;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            c(((java.lang.Number) ((java.util.Map.Entry) it.next()).getKey()).intValue(), null);
        }
        hashMap.clear();
    }

    @Override // ro5.b
    public void C(int i17) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocateDirect.put((byte) i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController2", "setOri: " + i17 + ", ret: " + com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.D(21, allocateDirect, allocateDirect.capacity()));
    }

    @Override // ro5.b
    public void D(int i17) {
        ro5.j jVar = this.f479667a;
        if (jVar != null) {
            jVar.f479751e = i17;
        }
    }

    public final void E(int i17, java.lang.Object obj) {
        java.util.HashMap hashMap = this.f479670d;
        jz5.l lVar = (jz5.l) hashMap.get(java.lang.Integer.valueOf(i17));
        android.view.Surface surface = obj instanceof android.view.Surface ? (android.view.Surface) obj : obj instanceof android.graphics.SurfaceTexture ? new android.view.Surface((android.graphics.SurfaceTexture) obj) : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar, surface)) {
            return;
        }
        c(i17, null);
        if (surface == null) {
            return;
        }
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79 c22889xa2f9dd79 = com.p314xaae8f345.mm.p2793xcfa97743.v2.p2797xb11c9828.C22889xa2f9dd79.f295314d;
        java.lang.Long valueOf = c22889xa2f9dd79 != null ? java.lang.Long.valueOf(c22889xa2f9dd79.m82960x88d6288a(surface)) : null;
        if (valueOf == null) {
            return;
        }
        hashMap.put(java.lang.Integer.valueOf(i17), new jz5.l(valueOf, surface));
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.c(i17, valueOf.longValue(), ro5.u.f479831a);
    }

    @Override // ro5.b
    public boolean H0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPRenderController2", "isCameraPause: should not reach here");
        return false;
    }

    @Override // ro5.b
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.o(ro5.x.f479836a);
    }

    @Override // ro5.b
    public boolean b() {
        return this.f479669c;
    }

    @Override // ro5.b
    public void c(int i17, bp5.h hVar) {
        jz5.l lVar = (jz5.l) this.f479670d.get(java.lang.Integer.valueOf(i17));
        if (lVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.c(i17, 0L, new ro5.z(lVar));
    }

    @Override // ro5.b
    public void d(er4.r roomType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType, "roomType");
    }

    @Override // ro5.b
    public void e() {
    }

    @Override // ro5.b
    public boolean f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPRenderController2", "checkVirtualBackgroundState: should not reach here");
        return false;
    }

    @Override // ro5.b
    public void g() {
    }

    @Override // ro5.b
    public er4.w h(long j17) {
        int i17 = (int) j17;
        E(i17, null);
        ro5.j jVar = this.f479667a;
        ro5.c a17 = jVar != null ? jVar.a(i17) : null;
        er4.w wVar = new er4.w();
        wVar.d(a17 != null ? a17.f479701b : 1.0d);
        wVar.e(a17 != null ? a17.f479702c : 0L);
        wVar.f(a17 != null ? a17.f479700a : 0L);
        wVar.g(a17 != null ? a17.f479703d : 0.0d);
        wVar.b(a17 != null ? a17.f479704e : 0.0d);
        wVar.c(a17 != null && a17.f479705f);
        wVar.f337726m = a17 != null ? a17.f479706g : 0L;
        wVar.f337727n[7] = true;
        return wVar;
    }

    @Override // ro5.b
    public void i(int i17, bp5.h renderTargetHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderTargetHolder, "renderTargetHolder");
        E(i17, renderTargetHolder.mo11009x8dd3293d());
    }

    @Override // ro5.b
    /* renamed from: isCameraOn */
    public boolean mo162803xc7cd3f2e() {
        return this.f479668b;
    }

    @Override // ro5.b
    public void j(fp5.a remoteCameraStatusListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remoteCameraStatusListener, "remoteCameraStatusListener");
    }

    @Override // ro5.b
    public void k(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPRenderController2", "updateCameraResolution: should not reach here");
    }

    @Override // ro5.b
    public void l() {
    }

    @Override // ro5.b
    public void m(int i17) {
        int i18 = ((i17 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / 90) % 4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRenderController2", "setLocalEncoderRotation: rotation=" + i17 + ", encoderRotation=" + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.E(i18, ro5.y.f479848a);
    }

    @Override // ro5.b
    public fo5.f n() {
        return new fo5.f(0, 0, 0, 0, 0);
    }

    @Override // ro5.b
    public void o(boolean z17, boolean z18) {
        this.f479668b = z17;
        this.f479669c = z18;
        if (z17) {
            this.f479671e.b();
        }
    }

    @Override // ro5.b
    public void p(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPRenderController2", "flipCamera: should not reach here");
    }

    @Override // ro5.b
    public void q(java.util.ArrayList arrayList) {
    }

    @Override // ro5.b
    public void r(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPRenderController2", "pauseCamera: should not reach here");
    }

    @Override // ro5.b
    public void s(er4.l mainUiScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainUiScene, "mainUiScene");
    }

    @Override // ro5.b
    public long t(int i17, int i18, int i19) {
        ro5.j jVar = this.f479667a;
        if (jVar != null) {
            return jVar.c(i17, i18, i19);
        }
        return 0L;
    }

    @Override // ro5.b
    public void u(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 flutterTextureRegisterHelper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterTextureRegisterHelper, "flutterTextureRegisterHelper");
        this.f479667a = new ro5.j(flutterTextureRegisterHelper);
    }

    @Override // ro5.b
    public void v(byte[] imageData, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPRenderController2", "onScreenFrame: should not reach here");
    }

    @Override // ro5.b
    public void w() {
        ro5.j jVar = this.f479667a;
        if (jVar != null) {
            jVar.b();
        }
        this.f479667a = null;
    }

    @Override // ro5.b
    public void x() {
    }

    @Override // ro5.b
    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPRenderController2", "startCamera: should not reach here");
    }

    @Override // ro5.b
    public void z(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPRenderController2", "setVirtualBackground: should not reach here");
    }
}
