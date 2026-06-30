package ux0;

/* loaded from: classes5.dex */
public final class b implements ux0.d, android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public pp0.p0 f513311d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3982x6f8c7f2f f513312e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f513313f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public volatile android.media.ImageReader f513314g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.HandlerThread f513315h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f513316i;

    /* renamed from: m, reason: collision with root package name */
    public final yx0.c8 f513317m;

    public b() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("ShootComposing-Use", -2);
        this.f513315h = a17;
        this.f513317m = new yx0.c8();
        a17.start();
        this.f513316i = new android.os.Handler(a17.getLooper());
    }

    @Override // ux0.d
    public void a(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2 frame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frame, "frame");
    }

    @Override // ux0.d
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        this.f513316i.post(new ux0.a(this, nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    @Override // ux0.d
    public void c() {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(this.f513315h.quitSafely()));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ByteBufferVideoFrameSender", "Failed to teardown: " + m143898xd4a2fc34);
        }
    }

    @Override // ux0.d
    public void d(pp0.p0 camManager, xr0.j frameSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camManager, "camManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSize, "frameSize");
        synchronized (this.f513313f) {
            this.f513311d = camManager;
            if (this.f513315h.getLooper() != null) {
                android.media.ImageReader newInstance = android.media.ImageReader.newInstance(frameSize.f537706a, frameSize.f537707b, 1, 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "newInstance(...)");
                newInstance.setOnImageAvailableListener(this, this.f513316i);
                this.f513314g = newInstance;
            }
        }
    }

    @Override // ux0.d
    /* renamed from: getSurface */
    public android.view.Surface mo170672xcf572877() {
        android.media.ImageReader imageReader = this.f513314g;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(android.media.ImageReader imageReader) {
        synchronized (this.f513313f) {
            if (this.f513314g == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ByteBufferVideoFrameSender", "onImageAvailable: imageReader is null");
                return;
            }
            java.lang.System.currentTimeMillis();
            android.media.Image acquireNextImage = imageReader != null ? imageReader.acquireNextImage() : null;
            if (acquireNextImage == null) {
                return;
            }
            try {
                try {
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ByteBufferVideoFrameSender", e17, "onImageAvailable error", new java.lang.Object[0]);
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        acquireNextImage.close();
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th));
                        return;
                    }
                }
                if (acquireNextImage.getPlanes() == null) {
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        acquireNextImage.close();
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                    } catch (java.lang.Throwable th7) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
                    }
                    return;
                }
                android.media.Image.Plane plane = acquireNextImage.getPlanes()[0];
                java.nio.ByteBuffer buffer = plane.getBuffer();
                buffer.position(0);
                this.f513317m.a(acquireNextImage.getWidth() * acquireNextImage.getHeight() * plane.getPixelStride());
                int rowStride = plane.getRowStride();
                int pixelStride = plane.getPixelStride();
                yx0.c8 c8Var = this.f513317m;
                java.util.ArrayList arrayList = c8Var.f548765a;
                int i17 = c8Var.f548766b;
                c8Var.f548766b = i17 + 1;
                java.lang.Object obj = arrayList.get(i17 % arrayList.size());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
                byteBuffer.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69213x5793d34c(buffer, byteBuffer, acquireNextImage.getWidth() * pixelStride, acquireNextImage.getHeight(), rowStride - (acquireNextImage.getWidth() * pixelStride));
                com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3982x6f8c7f2f c3982x6f8c7f2f = new com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3982x6f8c7f2f(acquireNextImage.getWidth(), acquireNextImage.getHeight(), acquireNextImage.getWidth() * plane.getPixelStride(), acquireNextImage.getPlanes()[0].getPixelStride(), byteBuffer, 0, acquireNextImage.getTimestamp());
                this.f513312e = c3982x6f8c7f2f;
                pp0.p0 p0Var = this.f513311d;
                if (p0Var != null) {
                    p0Var.d0(c3982x6f8c7f2f);
                }
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion5 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    acquireNextImage.close();
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    p3321xbce91901.C29043x91b2b43d.Companion companion6 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th));
                    return;
                }
                return;
            } finally {
            }
        }
    }

    @Override // ux0.d
    /* renamed from: onPause */
    public void mo170673xb01dfb57() {
    }

    @Override // ux0.d
    /* renamed from: onResume */
    public void mo170674x57429eec() {
    }

    @Override // ux0.d
    /* renamed from: release */
    public void mo170675x41012807() {
        synchronized (this.f513313f) {
            this.f513311d = null;
            android.media.ImageReader imageReader = this.f513314g;
            if (imageReader != null) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    imageReader.close();
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                this.f513314g = null;
            }
        }
    }
}
