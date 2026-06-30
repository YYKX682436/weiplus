package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* renamed from: androidx.camera.core.processing.SurfaceEdge */
/* loaded from: classes14.dex */
public class C0905xfc457ea {

    /* renamed from: mCropRect */
    private final android.graphics.Rect f2176xa3536821;

    /* renamed from: mFormat */
    private final int f2177x3cc1ec4;

    /* renamed from: mHasCameraTransform */
    private final boolean f2178x3a93b1a;

    /* renamed from: mMirroring */
    private final boolean f2181x8e9669d6;

    /* renamed from: mProviderSurfaceRequest */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 f2183x20db7640;

    /* renamed from: mRotationDegrees */
    private int f2184x15cc599c;

    /* renamed from: mSensorToBufferTransform */
    private final android.graphics.Matrix f2185x9bcb874a;

    /* renamed from: mSettableSurface */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.SettableSurface f2186x45da6e34;

    /* renamed from: mStreamSpec */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b f2187x94faf3a8;

    /* renamed from: mTargetRotation */
    private int f2188xa566cdfc;

    /* renamed from: mTargets */
    private final int f2189x426873d5;

    /* renamed from: mHasConsumer */
    private boolean f2179x338a5203 = false;

    /* renamed from: mOnInvalidatedListeners */
    private final java.util.Set<java.lang.Runnable> f2182x911bcf02 = new java.util.HashSet();

    /* renamed from: mIsClosed */
    private boolean f2180xfc407ac3 = false;

    /* renamed from: mTransformationUpdatesListeners */
    private final java.util.List<m3.a> f2190x6b9a498b = new java.util.ArrayList();

    /* renamed from: androidx.camera.core.processing.SurfaceEdge$SettableSurface */
    /* loaded from: classes14.dex */
    public static class SettableSurface extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 {

        /* renamed from: mCompleter */
        t2.k f2191x2718406c;

        /* renamed from: mConsumer */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0916x83435b2e f2192x3262b83;

        /* renamed from: mProvider */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 f2193xea21ad7e;

        /* renamed from: mSurfaceFuture */
        final wa.a f2194x5e277963;

        public SettableSurface(android.util.Size size, int i17) {
            super(size, i17);
            this.f2194x5e277963 = t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.SurfaceEdge$SettableSurface$$a
                @Override // t2.m
                /* renamed from: attachCompleter */
                public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                    java.lang.Object m6352x51ef5f0f;
                    m6352x51ef5f0f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.SettableSurface.this.m6352x51ef5f0f(kVar);
                    return m6352x51ef5f0f;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$close$1 */
        public void m6351x595530a8() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0916x83435b2e c0916x83435b2e = this.f2192x3262b83;
            if (c0916x83435b2e != null) {
                c0916x83435b2e.m6368x4c203ca9();
            }
            if (this.f2193xea21ad7e == null) {
                t2.k kVar = this.f2191x2718406c;
                kVar.f496188d = true;
                t2.o oVar = kVar.f496186b;
                if (oVar != null && oVar.f496191e.cancel(true)) {
                    kVar.f496185a = null;
                    kVar.f496186b = null;
                    kVar.f496187c = null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$new$0 */
        public /* synthetic */ java.lang.Object m6352x51ef5f0f(t2.k kVar) {
            this.f2191x2718406c = kVar;
            return "SettableFuture hashCode: " + hashCode();
        }

        /* renamed from: canSetProvider */
        public boolean m6353xa5dfca83() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
            return this.f2193xea21ad7e == null && !m5411xd742d336();
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293
        /* renamed from: close */
        public void mo5401x5a5ddf8() {
            super.mo5401x5a5ddf8();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5944xc851d2a3(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$SettableSurface$$c
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.SettableSurface.this.m6351x595530a8();
                }
            });
        }

        /* renamed from: hasProvider */
        public boolean m6354x7078c2ab() {
            return this.f2193xea21ad7e != null;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293
        /* renamed from: provideSurface */
        public wa.a mo4801xc462ecc() {
            return this.f2194x5e277963;
        }

        /* renamed from: setConsumer */
        public void m6355x54bb2278(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0916x83435b2e c0916x83435b2e) {
            m3.h.e(this.f2192x3262b83 == null, "Consumer can only be linked once.");
            this.f2192x3262b83 = c0916x83435b2e;
        }

        /* renamed from: setProvider */
        public boolean m6356x3bb6a473(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293, java.lang.Runnable runnable) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
            abstractC0697x654a0293.getClass();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a02932 = this.f2193xea21ad7e;
            if (abstractC0697x654a02932 == abstractC0697x654a0293) {
                return false;
            }
            m3.h.e(abstractC0697x654a02932 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            m3.h.b(m5405xee2bb02e().equals(abstractC0697x654a0293.m5405xee2bb02e()), java.lang.String.format("The provider's size(%s) must match the parent(%s)", m5405xee2bb02e(), abstractC0697x654a0293.m5405xee2bb02e()));
            m3.h.b(m5406x676de6c4() == abstractC0697x654a0293.m5406x676de6c4(), java.lang.String.format("The provider's format(%s) must match the parent(%s)", java.lang.Integer.valueOf(m5406x676de6c4()), java.lang.Integer.valueOf(abstractC0697x654a0293.m5406x676de6c4())));
            m3.h.e(!m5411xd742d336(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f2193xea21ad7e = abstractC0697x654a0293;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6026xd4b03729(abstractC0697x654a0293.m5407xcf572877(), this.f2191x2718406c);
            abstractC0697x654a0293.m5410x8d860857();
            m5408x5f9b7531().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$SettableSurface$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.this.m5402xc13e57b();
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
            abstractC0697x654a0293.m5403xce0644a5().mo606x162a7075(runnable, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
            return true;
        }
    }

    public C0905xfc457ea(int i17, int i18, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, android.graphics.Matrix matrix, boolean z17, android.graphics.Rect rect, int i19, int i27, boolean z18) {
        this.f2189x426873d5 = i17;
        this.f2177x3cc1ec4 = i18;
        this.f2187x94faf3a8 = abstractC0756x2f9ad77b;
        this.f2185x9bcb874a = matrix;
        this.f2178x3a93b1a = z17;
        this.f2176xa3536821 = rect;
        this.f2184x15cc599c = i19;
        this.f2188xa566cdfc = i27;
        this.f2181x8e9669d6 = z18;
        this.f2186x45da6e34 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.SettableSurface(abstractC0756x2f9ad77b.mo5191x8ee230a2(), i18);
    }

    /* renamed from: checkAndSetHasConsumer */
    private void m6320x7815c87d() {
        m3.h.e(!this.f2179x338a5203, "Consumer can only be linked once.");
        this.f2179x338a5203 = true;
    }

    /* renamed from: checkNotClosed */
    private void m6321x9e8331f7() {
        m3.h.e(!this.f2180xfc407ac3, "Edge is already closed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createSurfaceOutputFuture$2 */
    public wa.a m6322x35a880c6(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.SettableSurface settableSurface, int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo cameraInputInfo, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo cameraInputInfo2, android.view.Surface surface) {
        surface.getClass();
        try {
            settableSurface.m5410x8d860857();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0916x83435b2e c0916x83435b2e = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0916x83435b2e(surface, m6341xe21cfccc(), i17, this.f2187x94faf3a8.mo5191x8ee230a2(), cameraInputInfo, cameraInputInfo2, this.f2185x9bcb874a);
            c0916x83435b2e.m6362xce0644a5().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$f
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.SettableSurface.this.m5402xc13e57b();
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
            settableSurface.m6355x54bb2278(c0916x83435b2e);
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(c0916x83435b2e);
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException e17) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createSurfaceRequest$0 */
    public /* synthetic */ void m6323x807d0bc7() {
        if (this.f2180xfc407ac3) {
            return;
        }
        m6344x92d0313b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createSurfaceRequest$1 */
    public /* synthetic */ void m6324x807d0bc8() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.this.m6323x807d0bc7();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateTransformation$3 */
    public /* synthetic */ void m6325x892d2dbe(int i17, int i18) {
        boolean z17;
        boolean z18 = true;
        if (this.f2184x15cc599c != i17) {
            this.f2184x15cc599c = i17;
            z17 = true;
        } else {
            z17 = false;
        }
        if (this.f2188xa566cdfc != i18) {
            this.f2188xa566cdfc = i18;
        } else {
            z18 = z17;
        }
        if (z18) {
            m6326x2cc3f769();
        }
    }

    /* renamed from: notifyTransformationInfoUpdate */
    private void m6326x2cc3f769() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo of6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo.of(this.f2176xa3536821, this.f2184x15cc599c, this.f2188xa566cdfc, m6342x459dfcd(), this.f2185x9bcb874a, this.f2181x8e9669d6);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42 = this.f2183x20db7640;
        if (c0569x83ae3d42 != null) {
            c0569x83ae3d42.m4799x6a31f400(of6);
        }
        java.util.Iterator<m3.a> it = this.f2190x6b9a498b.iterator();
        while (it.hasNext()) {
            it.next().mo3938xab27b508(of6);
        }
    }

    /* renamed from: addOnInvalidatedListener */
    public void m6327xeb3c13dd(java.lang.Runnable runnable) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        m6321x9e8331f7();
        this.f2182x911bcf02.add(runnable);
    }

    /* renamed from: addTransformationUpdateListener */
    public void m6328x7a5b2547(m3.a aVar) {
        aVar.getClass();
        this.f2190x6b9a498b.add(aVar);
    }

    /* renamed from: close */
    public final void m6329x5a5ddf8() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f2186x45da6e34.mo5401x5a5ddf8();
        this.f2180xfc407ac3 = true;
    }

    /* renamed from: createSurfaceOutputFuture */
    public wa.a m6330x68f2e0d5(final int i17, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo cameraInputInfo, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo cameraInputInfo2) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        m6321x9e8331f7();
        m6320x7815c87d();
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.SettableSurface settableSurface = this.f2186x45da6e34;
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6031x9aa1ea70(settableSurface.m5407xcf572877(), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54() { // from class: androidx.camera.core.processing.SurfaceEdge$$e
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0811x859ce54
            /* renamed from: apply */
            public final wa.a mo3010x58b836e(java.lang.Object obj) {
                wa.a m6322x35a880c6;
                m6322x35a880c6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.this.m6322x35a880c6(settableSurface, i17, cameraInputInfo, cameraInputInfo2, (android.view.Surface) obj);
                return m6322x35a880c6;
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
    }

    /* renamed from: createSurfaceRequest */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 m6331x74b8753e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        return m6332x74b8753e(interfaceC0677x9e0bc522, true);
    }

    /* renamed from: disconnect */
    public final void m6333x1f9d589c() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        m6321x9e8331f7();
        this.f2186x45da6e34.mo5401x5a5ddf8();
    }

    /* renamed from: getCropRect */
    public android.graphics.Rect m6334xfa2ffe0a() {
        return this.f2176xa3536821;
    }

    /* renamed from: getDeferrableSurface */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m6335xcdba49fd() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        m6321x9e8331f7();
        m6320x7815c87d();
        return this.f2186x45da6e34;
    }

    /* renamed from: getDeferrableSurfaceForTesting */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m6336x30ae86e4() {
        return this.f2186x45da6e34;
    }

    /* renamed from: getFormat */
    public int m6337x19771aed() {
        return this.f2177x3cc1ec4;
    }

    /* renamed from: getRotationDegrees */
    public int m6338x2a7ffb93() {
        return this.f2184x15cc599c;
    }

    /* renamed from: getSensorToBufferTransform */
    public android.graphics.Matrix m6339x65554241() {
        return this.f2185x9bcb874a;
    }

    /* renamed from: getStreamSpec */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b m6340xa709b351() {
        return this.f2187x94faf3a8;
    }

    /* renamed from: getTargets */
    public int m6341xe21cfccc() {
        return this.f2189x426873d5;
    }

    /* renamed from: hasCameraTransform */
    public boolean m6342x459dfcd() {
        return this.f2178x3a93b1a;
    }

    /* renamed from: hasProvider */
    public boolean m6343x7078c2ab() {
        return this.f2186x45da6e34.m6354x7078c2ab();
    }

    /* renamed from: invalidate */
    public void m6344x92d0313b() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        m6321x9e8331f7();
        if (this.f2186x45da6e34.m6353xa5dfca83()) {
            return;
        }
        this.f2179x338a5203 = false;
        this.f2186x45da6e34.mo5401x5a5ddf8();
        this.f2186x45da6e34 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.SettableSurface(this.f2187x94faf3a8.mo5191x8ee230a2(), this.f2177x3cc1ec4);
        java.util.Iterator<java.lang.Runnable> it = this.f2182x911bcf02.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    /* renamed from: isClosed */
    public boolean m6345xd742d336() {
        return this.f2180xfc407ac3;
    }

    /* renamed from: isMirroring */
    public boolean m6346x5a1c61b9() {
        return this.f2181x8e9669d6;
    }

    /* renamed from: removeTransformationUpdateListener */
    public void m6347xaf57c2aa(m3.a aVar) {
        aVar.getClass();
        this.f2190x6b9a498b.remove(aVar);
    }

    /* renamed from: setProvider */
    public void m6348x3bb6a473(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        m6321x9e8331f7();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.SettableSurface settableSurface = this.f2186x45da6e34;
        java.util.Objects.requireNonNull(settableSurface);
        settableSurface.m6356x3bb6a473(abstractC0697x654a0293, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.RunnableC0907xd1b333b8(settableSurface));
    }

    /* renamed from: updateTransformation */
    public void m6349x3b308432(int i17) {
        m6350x3b308432(i17, -1);
    }

    /* renamed from: createSurfaceRequest */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 m6332x74b8753e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, boolean z17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        m6321x9e8331f7();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42(this.f2187x94faf3a8.mo5191x8ee230a2(), interfaceC0677x9e0bc522, z17, this.f2187x94faf3a8.mo5188x82dbcab4(), this.f2187x94faf3a8.mo5189xb632311e(), new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$c
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.this.m6324x807d0bc8();
            }
        });
        try {
            final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m4790xcdba49fd = c0569x83ae3d42.m4790xcdba49fd();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.SettableSurface settableSurface = this.f2186x45da6e34;
            java.util.Objects.requireNonNull(settableSurface);
            if (settableSurface.m6356x3bb6a473(m4790xcdba49fd, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.RunnableC0907xd1b333b8(settableSurface))) {
                wa.a m5408x5f9b7531 = settableSurface.m5408x5f9b7531();
                java.util.Objects.requireNonNull(m4790xcdba49fd);
                m5408x5f9b7531.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$d
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.this.mo5401x5a5ddf8();
                    }
                }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
            }
            this.f2183x20db7640 = c0569x83ae3d42;
            m6326x2cc3f769();
            return c0569x83ae3d42;
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException e17) {
            throw new java.lang.AssertionError("Surface is somehow already closed", e17);
        } catch (java.lang.RuntimeException e18) {
            c0569x83ae3d42.m4800x77e1a6cd();
            throw e18;
        }
    }

    /* renamed from: updateTransformation */
    public void m6350x3b308432(final int i17, final int i18) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5944xc851d2a3(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$g
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea.this.m6325x892d2dbe(i17, i18);
            }
        });
    }
}
