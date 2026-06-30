package com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r0\fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0005J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010(\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lcom/tencent/mm/media/camera/view/CameraKitView;", "Landroid/widget/RelativeLayout;", "Lcs0/b;", "Lcs0/a;", "Lbs0/h;", "", "orientation", "Ljz5/f0;", "setCurrentOrientation", "", "torchOn", "setLightTorch", "Lkotlinx/coroutines/flow/f3;", "Ljz5/l;", "Lbs0/g;", "Landroid/os/Bundle;", "getCameraState", "Lnr0/c;", "render", "setCustomRender", "Lbs0/e;", "callback", "setDoubleClickCallback", "getCurrentExpo", "Lbs0/f;", "ratio", "setCameraViewRatio", "", "getHorizontalViewAngle", "()Ljava/lang/Float;", "Lyr0/e;", "Lpr0/d;", "e", "Ljz5/g;", "getCameraKitModel", "()Lyr0/e;", "cameraKitModel", "f", "getCameraKit", "()Lpr0/d;", "cameraKit", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.media.camera.view.CameraKitView */
/* loaded from: classes14.dex */
public final class C10897xb8eb1396 extends android.widget.RelativeLayout implements cs0.b, cs0.a, bs0.h {

    /* renamed from: d, reason: collision with root package name */
    public final rr0.b f150406d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cameraKitModel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cameraKit;

    /* renamed from: g, reason: collision with root package name */
    public final bs0.i f150409g;

    /* renamed from: h, reason: collision with root package name */
    public float f150410h;

    /* renamed from: i, reason: collision with root package name */
    public bs0.e f150411i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10897xb8eb1396(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569790ob, this);
        int i17 = com.p314xaae8f345.mm.R.id.cih;
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862 = (com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862) x4.b.a(this, com.p314xaae8f345.mm.R.id.cih);
        if (c10899x89fee862 != null) {
            i17 = com.p314xaae8f345.mm.R.id.cr_;
            android.view.ViewStub viewStub = (android.view.ViewStub) x4.b.a(this, com.p314xaae8f345.mm.R.id.cr_);
            if (viewStub != null) {
                i17 = com.p314xaae8f345.mm.R.id.nsl;
                android.view.ViewStub viewStub2 = (android.view.ViewStub) x4.b.a(this, com.p314xaae8f345.mm.R.id.nsl);
                if (viewStub2 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.o5m;
                    android.view.ViewStub viewStub3 = (android.view.ViewStub) x4.b.a(this, com.p314xaae8f345.mm.R.id.o5m);
                    if (viewStub3 != null) {
                        this.f150406d = new rr0.b(this, c10899x89fee862, viewStub, viewStub2, viewStub3);
                        this.cameraKitModel = jz5.h.b(bs0.d.f105315d);
                        this.cameraKit = jz5.h.b(new bs0.c(this));
                        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nr0.d0.f420605a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
                        int i18 = obtainStyledAttributes.getInt(1, 0);
                        java.lang.Object inflate = i18 != 0 ? i18 != 1 ? viewStub2.inflate() : viewStub3.inflate() : viewStub2.inflate();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.ICameraKitView");
                        bs0.i iVar = (bs0.i) inflate;
                        this.f150409g = iVar;
                        boolean z17 = obtainStyledAttributes.getInt(0, 0) == 0;
                        int i19 = obtainStyledAttributes.getInt(4, 0);
                        int i27 = obtainStyledAttributes.getInt(3, 0);
                        if (i27 > 0 && i19 > 0) {
                            this.f150410h = (i27 * 1.0f) / i19;
                        }
                        float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitView", "cameraView instance:" + iVar.getClass().getName() + " backCamera:" + z17 + " ratio:" + this.f150410h + " [w:" + i19 + " h:" + i27 + ']');
                        iVar.mo11088xba0484c9(dimension);
                        iVar.mo11087x5156873e(m46832xeb0ac6bb());
                        c10899x89fee862.m46843x73ebd762(this);
                        c10899x89fee862.m46842xf3b6d9a3(this);
                        or0.c cVar = or0.c.f428962a;
                        qr0.a aVar = qr0.a.f447588a;
                        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Camera_Debug_Int, 0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
                        boolean z18 = ((java.lang.Integer) b17).intValue() == 1;
                        or0.c.f428966e = z18;
                        if (z18) {
                            or0.c.f428964c = (android.widget.TextView) viewStub.inflate().findViewById(com.p314xaae8f345.mm.R.id.cr7);
                            or0.c.f428968g = aVar.d(true) ? "纹理预览" : "buffer预览";
                            or0.c.f428970i = aVar.b() == 1 ? "camera1" : "camerax";
                            or0.c.f428969h = (aVar.b() != 1 && aVar.a() == 2) ? "imageCapture" : "readPixel";
                            return;
                        }
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i17)));
    }

    /* renamed from: getCameraKit */
    private final pr0.d m46832xeb0ac6bb() {
        return (pr0.d) ((jz5.n) this.cameraKit).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCameraKitModel */
    public final yr0.e m46833x8e4c412e() {
        return (yr0.e) ((jz5.n) this.cameraKitModel).mo141623x754a37bb();
    }

    @Override // bs0.h
    public void A(android.view.Surface surface, java.lang.Integer num, java.lang.Integer num2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitView", "setCustomRenderTarget width:" + num + " height:" + num2);
        this.f150409g.mo11087x5156873e(null);
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.m("unbindSurface", new pr0.k0(m46832xeb0ac6bb, null));
        m46832xeb0ac6bb().o(surface, num, num2);
    }

    @Override // bs0.j
    public java.lang.Object D0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        sr0.i iVar = m46832xeb0ac6bb().f439367e;
        if (iVar == null) {
            return null;
        }
        sr0.f fVar = (sr0.f) iVar;
        nr0.x xVar = fVar.f492967h;
        nr0.y yVar = fVar.f492966g;
        if (xVar == null || yVar == null) {
            return null;
        }
        return xVar.m("getCurrentFrame", new nr0.i(xVar, null), interfaceC29045xdcb5ca57);
    }

    @Override // bs0.j
    public void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Camera.CameraKitView", "onZoomOut", new java.lang.Object[0]);
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.l("onZoomOut", new pr0.x(m46832xeb0ac6bb, null));
    }

    @Override // bs0.j
    public java.lang.Object a0(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(t26.e.b(m46832xeb0ac6bb.f439432o, null, 1, null), new pr0.d0(z17, m46832xeb0ac6bb, null), interfaceC29045xdcb5ca57);
        pz5.a aVar = pz5.a.f440719d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (g17 != aVar) {
            g17 = f0Var;
        }
        return g17 == aVar ? g17 : f0Var;
    }

    @Override // bs0.j
    public void b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Camera.CameraKitView", "onZoomIn", new java.lang.Object[0]);
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.l("onZoomIn", new pr0.w(m46832xeb0ac6bb, null));
    }

    @Override // bs0.j
    public int c(int i17) {
        sr0.i iVar = m46832xeb0ac6bb().f439367e;
        if (iVar != null) {
            return iVar.c(i17);
        }
        return 3;
    }

    @Override // bs0.h
    public void d() {
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.m("unbindSurface", new pr0.k0(m46832xeb0ac6bb, null));
        this.f150409g.mo11087x5156873e(m46832xeb0ac6bb());
    }

    @Override // bs0.j
    public void e(boolean z17) {
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.l("switchFlash", new pr0.c0(m46832xeb0ac6bb, z17, null));
    }

    @Override // bs0.j
    public java.lang.Object f(int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        return pr0.g0.p(m46832xeb0ac6bb, i17, interfaceC29045xdcb5ca57);
    }

    @Override // bs0.j
    public void f0(android.content.Context context, xr0.h setting) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setting, "setting");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitView", "setUpCamera:" + setting);
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.m("setUpCamera", new pr0.c(setting, m46832xeb0ac6bb, context, null));
        rr0.b bVar = this.f150406d;
        bVar.f480700b.m46839xa17643cd(setting.f537704d);
        bVar.f480700b.m46840x982daed5(setting.f537701a);
    }

    @Override // bs0.j
    public boolean g(float f17) {
        sr0.i iVar = m46832xeb0ac6bb().f439367e;
        if (iVar != null) {
            return iVar.g(f17);
        }
        return false;
    }

    @Override // bs0.j
    /* renamed from: getCameraState */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 mo9382x53e98736() {
        return p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(m46832xeb0ac6bb().f439373u);
    }

    /* renamed from: getCurrentExpo */
    public final int m46834xfda5cdd5() {
        return this.f150406d.f480700b.getF150425r();
    }

    @Override // bs0.j
    /* renamed from: getHorizontalViewAngle */
    public java.lang.Float mo9383xdd520634() {
        sr0.i iVar = m46832xeb0ac6bb().f439367e;
        if (iVar != null) {
            return iVar.mo165061xdd520634();
        }
        return null;
    }

    @Override // bs0.j
    public void h(float f17, float f18) {
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.l("focusOn", new pr0.s(m46832xeb0ac6bb, f17, f18, null));
    }

    public java.lang.Object j(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        m46832xeb0ac6bb.l("getExpoData", new pr0.t(m46832xeb0ac6bb, nVar, null));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public void k(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Camera.CameraKitView", "onLargeExpo >> multi: " + i17, new java.lang.Object[0]);
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.l("onLargeExpo", new pr0.u(m46832xeb0ac6bb, i17, null));
    }

    public void l(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Camera.CameraKitView", "onReduceExpo >> multi: " + i17, new java.lang.Object[0]);
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.l("onReduceExpo", new pr0.v(m46832xeb0ac6bb, i17, null));
    }

    @Override // bs0.j
    public void l0(final p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitView", "bindLifeCycleOwner " + owner);
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p863xedfae76a.C10893xfca6e3c9 c10893xfca6e3c9 = m46832xeb0ac6bb.f439441s;
        c10893xfca6e3c9.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraLifecycleProxy", "attachLifeCycleOwner:" + owner.mo273xed6858b4().b());
        owner.mo273xed6858b4().a(c10893xfca6e3c9);
        c10893xfca6e3c9.f150396e.i(owner.mo273xed6858b4().b());
        owner.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.media.camera.view.CameraKitView$bindLifeCycleOwner$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroy */
            public final void m46837xac79a11b() {
                yr0.e m46833x8e4c412e;
                m46833x8e4c412e = com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396.this.m46833x8e4c412e();
                yr0.f fVar = yr0.f.f546166f;
                m46833x8e4c412e.getClass();
                m46833x8e4c412e.f546163b = fVar;
                owner.mo273xed6858b4().c(this);
            }
        });
    }

    public void m(float f17, float f18) {
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.l("focusOn", new pr0.s(m46832xeb0ac6bb, f17, f18, null));
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f150410h > 0.0f) {
            int size = android.view.View.MeasureSpec.getSize(i18);
            int size2 = android.view.View.MeasureSpec.getSize(i17);
            if (size > 0 && size2 > 0) {
                float f17 = size;
                float f18 = size2;
                float f19 = (1.0f * f17) / f18;
                float f27 = this.f150410h;
                if (f19 > f27) {
                    size = (int) (f18 * f27);
                } else {
                    size2 = (int) (f17 / f27);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitView", "onMeasure >> height: " + size + ", width: " + size2);
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // bs0.j
    /* renamed from: setCameraViewRatio */
    public void mo9384xfd9785ff(bs0.f ratio) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ratio, "ratio");
        int ordinal = ratio.ordinal();
        if (ordinal == 0) {
            this.f150410h = 1.7777778f;
        } else if (ordinal == 1) {
            this.f150410h = 1.3333334f;
        } else if (ordinal == 2) {
            this.f150410h = 1.0f;
        }
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.l("setCameraViewRatio", new pr0.y(m46832xeb0ac6bb, ratio, null));
    }

    /* renamed from: setCurrentOrientation */
    public final void m46835x2627ce99(int i17) {
        this.f150406d.f480700b.m46841x2627ce99(i17);
    }

    @Override // nr0.b0
    /* renamed from: setCustomRender */
    public void mo9385xabce2de9(nr0.c cVar) {
        m46832xeb0ac6bb().mo9385xabce2de9(cVar);
    }

    /* renamed from: setDoubleClickCallback */
    public final void m46836x9c700dda(bs0.e callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f150411i = callback;
    }

    @Override // bs0.j
    /* renamed from: setLightTorch */
    public void mo9386xf597288(boolean z17) {
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.l("setLightTorch", new pr0.a0(m46832xeb0ac6bb, z17, null));
    }

    @Override // bs0.j
    /* renamed from: switchCamera */
    public void mo9387x2db92f79() {
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        m46832xeb0ac6bb.m("switchCamera", new pr0.b0(m46832xeb0ac6bb, null));
    }

    @Override // bs0.j
    public java.lang.Object v(int i17, int i18, int i19, java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862 = this.f150406d.f480700b;
        c10899x89fee862.getClass();
        pm0.v.X(new cs0.d(c10899x89fee862));
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        return pr0.g0.q(m46832xeb0ac6bb, i17, i18, i19, str, z17, interfaceC29045xdcb5ca57);
    }

    @Override // bs0.j
    public java.lang.Object y(int i17, int i18, int i19, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862 = this.f150406d.f480700b;
        c10899x89fee862.getClass();
        pm0.v.X(new cs0.d(c10899x89fee862));
        pr0.d m46832xeb0ac6bb = m46832xeb0ac6bb();
        m46832xeb0ac6bb.getClass();
        return pr0.g0.r(m46832xeb0ac6bb, i17, i18, i19, z17, interfaceC29045xdcb5ca57);
    }
}
