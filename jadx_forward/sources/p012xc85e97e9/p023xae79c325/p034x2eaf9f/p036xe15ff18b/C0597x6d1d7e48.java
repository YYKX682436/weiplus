package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.imagecapture.CaptureNode */
/* loaded from: classes14.dex */
public class C0597x6d1d7e48 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In> {

    /* renamed from: MAX_IMAGES */
    static final int f1330xf73c15d3 = 4;
    private static final java.lang.String TAG = "CaptureNode";

    /* renamed from: mInputEdge */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In f1332xe06e8eba;

    /* renamed from: mOutputEdge */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In f1334x903d8aab;

    /* renamed from: mSafeCloseImageReaderForPostview */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b f1335x57f73c6e;

    /* renamed from: mSafeCloseImageReaderProxy */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b f1336xb9ff5bae;

    /* renamed from: mCurrentRequest */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc f1331xe93e6ca3 = null;

    /* renamed from: mNoMetadataImageReader */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0615x43c26fae f1333x8ab2e561 = null;

    /* renamed from: androidx.camera.core.imagecapture.CaptureNode$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass1 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCaptureProcessProgressed$1 */
        public /* synthetic */ void m4949xbd33e4fe(int i17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.f1331xe93e6ca3;
            if (c0627xbfd50fdc != null) {
                c0627xbfd50fdc.m5032x1c9165b4(i17);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onCaptureStarted$0 */
        public /* synthetic */ void m4950xfcd63423() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.f1331xe93e6ca3;
            if (c0627xbfd50fdc != null) {
                c0627xbfd50fdc.m5033x56961e1a();
            }
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureProcessProgressed */
        public void mo4951x1c9165b4(int i17, final int i18) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.AnonymousClass1.this.m4949xbd33e4fe(i18);
                }
            });
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
        /* renamed from: onCaptureStarted */
        public void mo4952x56961e1a(int i17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.AnonymousClass1.this.m4950xfcd63423();
                }
            });
        }
    }

    /* renamed from: androidx.camera.core.imagecapture.CaptureNode$In */
    /* loaded from: classes14.dex */
    public static abstract class In {

        /* renamed from: mCameraCaptureCallback */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 f1340x17671159 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6() { // from class: androidx.camera.core.imagecapture.CaptureNode.In.1
        };

        /* renamed from: mPostviewSurface */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 f1341x4129e97b = null;

        /* renamed from: mSurface */
        private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 f1342x2fa29f80;

        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In of(android.util.Size size, int i17, int i18, boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 interfaceC0539xe9692941) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0586xb3b1f99(size, i17, i18, z17, interfaceC0539xe9692941, null, 35, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd(), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd());
        }

        /* renamed from: getCameraCaptureCallback */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 m4953x6f411e10() {
            return this.f1340x17671159;
        }

        /* renamed from: getErrorEdge */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError> mo4874x130ae12f();

        /* renamed from: getImageReaderProxyProvider */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 mo4875x99a79697();

        /* renamed from: getInputFormat */
        public abstract int mo4876xb124032b();

        /* renamed from: getOutputFormat */
        public abstract int mo4877x42b80ace();

        /* renamed from: getPostviewImageFormat */
        public abstract int mo4878x8b609177();

        /* renamed from: getPostviewSize */
        public abstract android.util.Size mo4879x811b3f5c();

        /* renamed from: getPostviewSurface */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m4954x55dd8b72() {
            return this.f1341x4129e97b;
        }

        /* renamed from: getRequestEdge */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc> mo4880x1e5c3bb6();

        /* renamed from: getSize */
        public abstract android.util.Size mo4881xfb854877();

        /* renamed from: getSurface */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m4955xcf572877() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 = this.f1342x2fa29f80;
            java.util.Objects.requireNonNull(abstractC0697x654a0293);
            return abstractC0697x654a0293;
        }

        /* renamed from: isVirtualCamera */
        public abstract boolean mo4883x81387106();

        /* renamed from: setCameraCaptureCallback */
        public void m4956x3f53d084(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6) {
            this.f1340x17671159 = abstractC0659xd0769ba6;
        }

        /* renamed from: setPostviewSurface */
        public void m4957x8cb424e6(android.view.Surface surface, android.util.Size size, int i17) {
            this.f1341x4129e97b = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0720x9cc637dc(surface, size, i17);
        }

        /* renamed from: setSurface */
        public void m4958x42c875eb(android.view.Surface surface) {
            m3.h.e(this.f1342x2fa29f80 == null, "The surface is already set.");
            this.f1342x2fa29f80 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0720x9cc637dc(surface, mo4881xfb854877(), mo4876xb124032b());
        }

        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In of(android.util.Size size, int i17, int i18, boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 interfaceC0539xe9692941, android.util.Size size2, int i19) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0586xb3b1f99(size, i17, i18, z17, interfaceC0539xe9692941, size2, i19, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd(), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0895x20e1dd());
        }
    }

    /* renamed from: createImageReaderProxy */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 m4931x7b51182c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 interfaceC0539xe9692941, int i17, int i18, int i19) {
        return interfaceC0539xe9692941 != null ? interfaceC0539xe9692941.m4656x6bff0255(i17, i18, i19, 4, 0L) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0540xdaa8f743.m4657x9aed0758(i17, i18, i19, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$releaseInputResources$4 */
    public static /* synthetic */ void m4933x732eff95(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b) {
        if (c0561xf076f77b != null) {
            c0561xf076f77b.m4764xbb07de6b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$transform$0 */
    public /* synthetic */ void m4934x2717679b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc) {
        m4944x361ddcf9(c0627xbfd50fdc);
        this.f1333x8ab2e561.m4997x30fd0bd4(c0627xbfd50fdc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$transform$1 */
    public /* synthetic */ void m4935x2717679c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        try {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4183xaf314b5e = interfaceC0719xa3f4ef30.mo4183xaf314b5e();
            if (mo4183xaf314b5e != null) {
                m4943xca7a8dd7(mo4183xaf314b5e);
            } else {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc = this.f1331xe93e6ca3;
                if (c0627xbfd50fdc != null) {
                    m4946x36a7ce0a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError.of(c0627xbfd50fdc.m5024x28ca0554(), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(2, "Failed to acquire latest image", null)));
                }
            }
        } catch (java.lang.IllegalStateException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc2 = this.f1331xe93e6ca3;
            if (c0627xbfd50fdc2 != null) {
                m4946x36a7ce0a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError.of(c0627xbfd50fdc2.m5024x28ca0554(), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(2, "Failed to acquire latest image", e17)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$transform$2 */
    public /* synthetic */ void m4936x2717679d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        try {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4183xaf314b5e = interfaceC0719xa3f4ef30.mo4183xaf314b5e();
            if (mo4183xaf314b5e != null) {
                m4938x30271c6d(mo4183xaf314b5e);
            }
        } catch (java.lang.IllegalStateException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to acquire latest image of postview", e17);
        }
    }

    /* renamed from: matchAndPropagateImage */
    private void m4937x6a35de24(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In in6 = this.f1334x903d8aab;
        java.util.Objects.requireNonNull(in6);
        in6.mo4896xfb7ed633().mo3938xab27b508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket.of(this.f1331xe93e6ca3, interfaceC0536x1ffeadf3));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc = this.f1331xe93e6ca3;
        this.f1331xe93e6ca3 = null;
        c0627xbfd50fdc.m5036x818788ba();
    }

    /* renamed from: propagatePostviewImage */
    private void m4938x30271c6d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        if (this.f1331xe93e6ca3 == null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Postview image is closed due to request completed or aborted");
            interfaceC0536x1ffeadf3.close();
        } else {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In in6 = this.f1334x903d8aab;
            java.util.Objects.requireNonNull(in6);
            in6.mo4899x8114cd18().mo3938xab27b508(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket.of(this.f1331xe93e6ca3, interfaceC0536x1ffeadf3));
        }
    }

    /* renamed from: releaseInputResources */
    private void m4939xaa2a8562(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In in6, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b2) {
        in6.m4955xcf572877().mo5401x5a5ddf8();
        in6.m4955xcf572877().m5408x5f9b7531().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$$f
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b.this.m4764xbb07de6b();
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
        if (in6.m4954x55dd8b72() != null) {
            in6.m4954x55dd8b72().mo5401x5a5ddf8();
            in6.m4954x55dd8b72().m5408x5f9b7531().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.CaptureNode$$g
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.m4933x732eff95(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b.this);
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
        }
    }

    /* renamed from: getCapacity */
    public int m4940x77cf5230() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        m3.h.e(this.f1336xb9ff5bae != null, "The ImageReader is not initialized.");
        return this.f1336xb9ff5bae.m4761x77cf5230();
    }

    /* renamed from: getInputEdge */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In m4941x6524b5f1() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In in6 = this.f1332xe06e8eba;
        java.util.Objects.requireNonNull(in6);
        return in6;
    }

    /* renamed from: getSafeCloseImageReaderProxy */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b m4942x480634e5() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b = this.f1336xb9ff5bae;
        java.util.Objects.requireNonNull(c0561xf076f77b);
        return c0561xf076f77b;
    }

    /* renamed from: onImageProxyAvailable */
    public void m4943xca7a8dd7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (this.f1331xe93e6ca3 == null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Discarding ImageProxy which was inadvertently acquired: " + interfaceC0536x1ffeadf3);
            interfaceC0536x1ffeadf3.close();
            return;
        }
        if (((java.lang.Integer) interfaceC0536x1ffeadf3.mo4173xcb10cdf3().mo4211x4aa7b206().m5703xb5887064(this.f1331xe93e6ca3.m5028xb0e6ee79())) != null) {
            m4937x6a35de24(interfaceC0536x1ffeadf3);
        } else {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Discarding ImageProxy which was acquired for aborted request");
            interfaceC0536x1ffeadf3.close();
        }
    }

    /* renamed from: onRequestAvailable */
    public void m4944x361ddcf9(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        m3.h.e(c0627xbfd50fdc.m5027xc9b4d050().size() == 1, "only one capture stage is supported.");
        m3.h.e(m4940x77cf5230() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f1331xe93e6ca3 = c0627xbfd50fdc;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(c0627xbfd50fdc.m5020x1c2cf0f3(), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.core.imagecapture.CaptureNode.2
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
                if (c0627xbfd50fdc == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.f1331xe93e6ca3) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.TAG, "request aborted, id=" + p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.f1331xe93e6ca3.m5024x28ca0554());
                    if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.f1333x8ab2e561 != null) {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.f1333x8ab2e561.m4998xef731d2f();
                    }
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.f1331xe93e6ca3 = null;
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(java.lang.Void r17) {
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222
    /* renamed from: release */
    public void mo4945x41012807() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In in6 = this.f1332xe06e8eba;
        java.util.Objects.requireNonNull(in6);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b = this.f1336xb9ff5bae;
        java.util.Objects.requireNonNull(c0561xf076f77b);
        m4939xaa2a8562(in6, c0561xf076f77b, this.f1335x57f73c6e);
    }

    /* renamed from: sendCaptureError */
    public void m4946x36a7ce0a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError captureError) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc = this.f1331xe93e6ca3;
        if (c0627xbfd50fdc == null || c0627xbfd50fdc.m5024x28ca0554() != captureError.mo4909x28ca0554()) {
            return;
        }
        this.f1331xe93e6ca3.m5031x86e70f23(captureError.mo4908xaa11a16e());
    }

    /* renamed from: setOnImageCloseListener */
    public void m4947xe2f5fcf2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener onImageCloseListener) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        m3.h.e(this.f1336xb9ff5bae != null, "The ImageReader is not initialized.");
        this.f1336xb9ff5bae.m4765xe2f5fcf2(onImageCloseListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222
    /* renamed from: transform, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In mo4948x3ebe6b6c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.In in6) {
        m3.a aVar;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0615x43c26fae c0615x43c26fae;
        m3.h.e(this.f1332xe06e8eba == null && this.f1336xb9ff5bae == null, "CaptureNode does not support recreation yet.");
        this.f1332xe06e8eba = in6;
        android.util.Size mo4881xfb854877 = in6.mo4881xfb854877();
        int mo4876xb124032b = in6.mo4876xb124032b();
        boolean z17 = !in6.mo4883x81387106();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 anonymousClass1 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.AnonymousClass1();
        if (z17 && in6.mo4875x99a79697() == null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0545xfdfbaf2f c0545xfdfbaf2f = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0545xfdfbaf2f(mo4881xfb854877.getWidth(), mo4881xfb854877.getHeight(), mo4876xb124032b, 4);
            anonymousClass1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0660x3e5cd98d.m5219x20225057(anonymousClass1, c0545xfdfbaf2f.m4688x6f411e10());
            aVar = new m3.a() { // from class: androidx.camera.core.imagecapture.CaptureNode$$a
                @Override // m3.a
                /* renamed from: accept */
                public final void mo3938xab27b508(java.lang.Object obj) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.m4944x361ddcf9((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc) obj);
                }
            };
            c0615x43c26fae = c0545xfdfbaf2f;
        } else {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0615x43c26fae c0615x43c26fae2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0615x43c26fae(m4931x7b51182c(in6.mo4875x99a79697(), mo4881xfb854877.getWidth(), mo4881xfb854877.getHeight(), mo4876xb124032b));
            this.f1333x8ab2e561 = c0615x43c26fae2;
            aVar = new m3.a() { // from class: androidx.camera.core.imagecapture.CaptureNode$$b
                @Override // m3.a
                /* renamed from: accept */
                public final void mo3938xab27b508(java.lang.Object obj) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.m4934x2717679b((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc) obj);
                }
            };
            c0615x43c26fae = c0615x43c26fae2;
        }
        in6.m4956x3f53d084(anonymousClass1);
        android.view.Surface mo4190xcf572877 = c0615x43c26fae.mo4190xcf572877();
        java.util.Objects.requireNonNull(mo4190xcf572877);
        in6.m4958x42c875eb(mo4190xcf572877);
        this.f1336xb9ff5bae = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b(c0615x43c26fae);
        c0615x43c26fae.mo4192x6034c5c3(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.CaptureNode$$c
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener
            /* renamed from: onImageAvailable */
            public final void mo3686xdf8fff6d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.m4935x2717679c(interfaceC0719xa3f4ef30);
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
        if (in6.mo4879x811b3f5c() != null) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 m4931x7b51182c = m4931x7b51182c(in6.mo4875x99a79697(), in6.mo4879x811b3f5c().getWidth(), in6.mo4879x811b3f5c().getHeight(), in6.mo4878x8b609177());
            m4931x7b51182c.mo4192x6034c5c3(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.CaptureNode$$d
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener
                /* renamed from: onImageAvailable */
                public final void mo3686xdf8fff6d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.m4936x2717679d(interfaceC0719xa3f4ef30);
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
            this.f1335x57f73c6e = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b(m4931x7b51182c);
            in6.m4957x8cb424e6(m4931x7b51182c.mo4190xcf572877(), in6.mo4879x811b3f5c(), in6.mo4878x8b609177());
        }
        in6.mo4880x1e5c3bb6().m6294xc6cf6336(aVar);
        in6.mo4874x130ae12f().m6294xc6cf6336(new m3.a() { // from class: androidx.camera.core.imagecapture.CaptureNode$$e
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0597x6d1d7e48.this.m4946x36a7ce0a((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError) obj);
            }
        });
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In of6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.In.of(in6.mo4876xb124032b(), in6.mo4877x42b80ace());
        this.f1334x903d8aab = of6;
        return of6;
    }
}
