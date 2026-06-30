package com.tencent.mm.media.camera.view;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r0\fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0005J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010(\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lcom/tencent/mm/media/camera/view/CameraKitView;", "Landroid/widget/RelativeLayout;", "Lcs0/b;", "Lcs0/a;", "Lbs0/h;", "", "orientation", "Ljz5/f0;", "setCurrentOrientation", "", "torchOn", "setLightTorch", "Lkotlinx/coroutines/flow/f3;", "Ljz5/l;", "Lbs0/g;", "Landroid/os/Bundle;", "getCameraState", "Lnr0/c;", "render", "setCustomRender", "Lbs0/e;", "callback", "setDoubleClickCallback", "getCurrentExpo", "Lbs0/f;", "ratio", "setCameraViewRatio", "", "getHorizontalViewAngle", "()Ljava/lang/Float;", "Lyr0/e;", "Lpr0/d;", "e", "Ljz5/g;", "getCameraKitModel", "()Lyr0/e;", "cameraKitModel", "f", "getCameraKit", "()Lpr0/d;", "cameraKit", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class CameraKitView extends android.widget.RelativeLayout implements cs0.b, cs0.a, bs0.h {

    /* renamed from: d, reason: collision with root package name */
    public final rr0.b f68873d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cameraKitModel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cameraKit;

    /* renamed from: g, reason: collision with root package name */
    public final bs0.i f68876g;

    /* renamed from: h, reason: collision with root package name */
    public float f68877h;

    /* renamed from: i, reason: collision with root package name */
    public bs0.e f68878i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraKitView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488257ob, this);
        int i17 = com.tencent.mm.R.id.cih;
        com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView = (com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView) x4.b.a(this, com.tencent.mm.R.id.cih);
        if (cameraFocusAndMeteringView != null) {
            i17 = com.tencent.mm.R.id.cr_;
            android.view.ViewStub viewStub = (android.view.ViewStub) x4.b.a(this, com.tencent.mm.R.id.cr_);
            if (viewStub != null) {
                i17 = com.tencent.mm.R.id.nsl;
                android.view.ViewStub viewStub2 = (android.view.ViewStub) x4.b.a(this, com.tencent.mm.R.id.nsl);
                if (viewStub2 != null) {
                    i17 = com.tencent.mm.R.id.o5m;
                    android.view.ViewStub viewStub3 = (android.view.ViewStub) x4.b.a(this, com.tencent.mm.R.id.o5m);
                    if (viewStub3 != null) {
                        this.f68873d = new rr0.b(this, cameraFocusAndMeteringView, viewStub, viewStub2, viewStub3);
                        this.cameraKitModel = jz5.h.b(bs0.d.f23782d);
                        this.cameraKit = jz5.h.b(new bs0.c(this));
                        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nr0.d0.f339072a);
                        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
                        int i18 = obtainStyledAttributes.getInt(1, 0);
                        java.lang.Object inflate = i18 != 0 ? i18 != 1 ? viewStub2.inflate() : viewStub3.inflate() : viewStub2.inflate();
                        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.ICameraKitView");
                        bs0.i iVar = (bs0.i) inflate;
                        this.f68876g = iVar;
                        boolean z17 = obtainStyledAttributes.getInt(0, 0) == 0;
                        int i19 = obtainStyledAttributes.getInt(4, 0);
                        int i27 = obtainStyledAttributes.getInt(3, 0);
                        if (i27 > 0 && i19 > 0) {
                            this.f68877h = (i27 * 1.0f) / i19;
                        }
                        float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitView", "cameraView instance:" + iVar.getClass().getName() + " backCamera:" + z17 + " ratio:" + this.f68877h + " [w:" + i19 + " h:" + i27 + ']');
                        iVar.setCornerRadius(dimension);
                        iVar.setCameraKitEnv(getCameraKit());
                        cameraFocusAndMeteringView.setTouchCallback(this);
                        cameraFocusAndMeteringView.setExpoDataCallback(this);
                        or0.c cVar = or0.c.f347429a;
                        qr0.a aVar = qr0.a.f366055a;
                        java.lang.Object b17 = bm5.o1.f22719a.b(bm5.h0.RepairerConfig_Camera_Debug_Int, 0);
                        kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
                        boolean z18 = ((java.lang.Integer) b17).intValue() == 1;
                        or0.c.f347433e = z18;
                        if (z18) {
                            or0.c.f347431c = (android.widget.TextView) viewStub.inflate().findViewById(com.tencent.mm.R.id.cr7);
                            or0.c.f347435g = aVar.d(true) ? "纹理预览" : "buffer预览";
                            or0.c.f347437i = aVar.b() == 1 ? "camera1" : "camerax";
                            or0.c.f347436h = (aVar.b() != 1 && aVar.a() == 2) ? "imageCapture" : "readPixel";
                            return;
                        }
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i17)));
    }

    private final pr0.d getCameraKit() {
        return (pr0.d) ((jz5.n) this.cameraKit).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yr0.e getCameraKitModel() {
        return (yr0.e) ((jz5.n) this.cameraKitModel).getValue();
    }

    @Override // bs0.h
    public void A(android.view.Surface surface, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitView", "setCustomRenderTarget width:" + num + " height:" + num2);
        this.f68876g.setCameraKitEnv(null);
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.m("unbindSurface", new pr0.k0(cameraKit, null));
        getCameraKit().o(surface, num, num2);
    }

    @Override // bs0.j
    public java.lang.Object D0(kotlin.coroutines.Continuation continuation) {
        sr0.i iVar = getCameraKit().f357834e;
        if (iVar == null) {
            return null;
        }
        sr0.f fVar = (sr0.f) iVar;
        nr0.x xVar = fVar.f411434h;
        nr0.y yVar = fVar.f411433g;
        if (xVar == null || yVar == null) {
            return null;
        }
        return xVar.m("getCurrentFrame", new nr0.i(xVar, null), continuation);
    }

    @Override // bs0.j
    public void a() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Camera.CameraKitView", "onZoomOut", new java.lang.Object[0]);
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.l("onZoomOut", new pr0.x(cameraKit, null));
    }

    @Override // bs0.j
    public java.lang.Object a0(boolean z17, kotlin.coroutines.Continuation continuation) {
        pr0.d cameraKit = getCameraKit();
        java.lang.Object g17 = kotlinx.coroutines.l.g(t26.e.b(cameraKit.f357899o, null, 1, null), new pr0.d0(z17, cameraKit, null), continuation);
        pz5.a aVar = pz5.a.f359186d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (g17 != aVar) {
            g17 = f0Var;
        }
        return g17 == aVar ? g17 : f0Var;
    }

    @Override // bs0.j
    public void b() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Camera.CameraKitView", "onZoomIn", new java.lang.Object[0]);
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.l("onZoomIn", new pr0.w(cameraKit, null));
    }

    @Override // bs0.j
    public int c(int i17) {
        sr0.i iVar = getCameraKit().f357834e;
        if (iVar != null) {
            return iVar.c(i17);
        }
        return 3;
    }

    @Override // bs0.h
    public void d() {
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.m("unbindSurface", new pr0.k0(cameraKit, null));
        this.f68876g.setCameraKitEnv(getCameraKit());
    }

    @Override // bs0.j
    public void e(boolean z17) {
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.l("switchFlash", new pr0.c0(cameraKit, z17, null));
    }

    @Override // bs0.j
    public java.lang.Object f(int i17, kotlin.coroutines.Continuation continuation) {
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        return pr0.g0.p(cameraKit, i17, continuation);
    }

    @Override // bs0.j
    public void f0(android.content.Context context, xr0.h setting) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(setting, "setting");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitView", "setUpCamera:" + setting);
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.m("setUpCamera", new pr0.c(setting, cameraKit, context, null));
        rr0.b bVar = this.f68873d;
        bVar.f399167b.setCameraAbilitySetting(setting.f456171d);
        bVar.f399167b.setCameraUISetting(setting.f456168a);
    }

    @Override // bs0.j
    public boolean g(float f17) {
        sr0.i iVar = getCameraKit().f357834e;
        if (iVar != null) {
            return iVar.g(f17);
        }
        return false;
    }

    @Override // bs0.j
    public kotlinx.coroutines.flow.f3 getCameraState() {
        return kotlinx.coroutines.flow.l.b(getCameraKit().f357840u);
    }

    public final int getCurrentExpo() {
        return this.f68873d.f399167b.getF68892r();
    }

    @Override // bs0.j
    public java.lang.Float getHorizontalViewAngle() {
        sr0.i iVar = getCameraKit().f357834e;
        if (iVar != null) {
            return iVar.getHorizontalViewAngle();
        }
        return null;
    }

    @Override // bs0.j
    public void h(float f17, float f18) {
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.l("focusOn", new pr0.s(cameraKit, f17, f18, null));
    }

    public java.lang.Object j(kotlin.coroutines.Continuation continuation) {
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        cameraKit.l("getExpoData", new pr0.t(cameraKit, nVar, null));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public void k(int i17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Camera.CameraKitView", "onLargeExpo >> multi: " + i17, new java.lang.Object[0]);
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.l("onLargeExpo", new pr0.u(cameraKit, i17, null));
    }

    public void l(int i17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Camera.CameraKitView", "onReduceExpo >> multi: " + i17, new java.lang.Object[0]);
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.l("onReduceExpo", new pr0.v(cameraKit, i17, null));
    }

    @Override // bs0.j
    public void l0(final androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitView", "bindLifeCycleOwner " + owner);
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        com.tencent.mm.media.camera.lifecycle.CameraLifecycleProxy cameraLifecycleProxy = cameraKit.f357908s;
        cameraLifecycleProxy.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraLifecycleProxy", "attachLifeCycleOwner:" + owner.mo133getLifecycle().b());
        owner.mo133getLifecycle().a(cameraLifecycleProxy);
        cameraLifecycleProxy.f68863e.i(owner.mo133getLifecycle().b());
        owner.mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.media.camera.view.CameraKitView$bindLifeCycleOwner$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroy() {
                yr0.e cameraKitModel;
                cameraKitModel = com.tencent.mm.media.camera.view.CameraKitView.this.getCameraKitModel();
                yr0.f fVar = yr0.f.f464633f;
                cameraKitModel.getClass();
                cameraKitModel.f464630b = fVar;
                owner.mo133getLifecycle().c(this);
            }
        });
    }

    public void m(float f17, float f18) {
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.l("focusOn", new pr0.s(cameraKit, f17, f18, null));
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f68877h > 0.0f) {
            int size = android.view.View.MeasureSpec.getSize(i18);
            int size2 = android.view.View.MeasureSpec.getSize(i17);
            if (size > 0 && size2 > 0) {
                float f17 = size;
                float f18 = size2;
                float f19 = (1.0f * f17) / f18;
                float f27 = this.f68877h;
                if (f19 > f27) {
                    size = (int) (f18 * f27);
                } else {
                    size2 = (int) (f17 / f27);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitView", "onMeasure >> height: " + size + ", width: " + size2);
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // bs0.j
    public void setCameraViewRatio(bs0.f ratio) {
        kotlin.jvm.internal.o.g(ratio, "ratio");
        int ordinal = ratio.ordinal();
        if (ordinal == 0) {
            this.f68877h = 1.7777778f;
        } else if (ordinal == 1) {
            this.f68877h = 1.3333334f;
        } else if (ordinal == 2) {
            this.f68877h = 1.0f;
        }
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.l("setCameraViewRatio", new pr0.y(cameraKit, ratio, null));
    }

    public final void setCurrentOrientation(int i17) {
        this.f68873d.f399167b.setCurrentOrientation(i17);
    }

    @Override // nr0.b0
    public void setCustomRender(nr0.c cVar) {
        getCameraKit().setCustomRender(cVar);
    }

    public final void setDoubleClickCallback(bs0.e callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f68878i = callback;
    }

    @Override // bs0.j
    public void setLightTorch(boolean z17) {
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.l("setLightTorch", new pr0.a0(cameraKit, z17, null));
    }

    @Override // bs0.j
    public void switchCamera() {
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.m("switchCamera", new pr0.b0(cameraKit, null));
    }

    @Override // bs0.j
    public java.lang.Object v(int i17, int i18, int i19, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f68873d.f399167b;
        cameraFocusAndMeteringView.getClass();
        pm0.v.X(new cs0.d(cameraFocusAndMeteringView));
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        return pr0.g0.q(cameraKit, i17, i18, i19, str, z17, continuation);
    }

    @Override // bs0.j
    public java.lang.Object y(int i17, int i18, int i19, boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f68873d.f399167b;
        cameraFocusAndMeteringView.getClass();
        pm0.v.X(new cs0.d(cameraFocusAndMeteringView));
        pr0.d cameraKit = getCameraKit();
        cameraKit.getClass();
        return pr0.g0.r(cameraKit, i17, i18, i19, z17, continuation);
    }
}
