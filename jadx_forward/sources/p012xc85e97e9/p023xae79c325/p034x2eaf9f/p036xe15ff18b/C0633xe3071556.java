package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.TakePictureManager */
/* loaded from: classes14.dex */
public class C0633xe3071556 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838.RetryControl {
    private static final java.lang.String TAG = "TakePictureManager";

    /* renamed from: mCapturingRequest */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a f1410x7bbae119;

    /* renamed from: mImageCaptureControl */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0609xb32cdd52 f1411x531523c5;

    /* renamed from: mImagePipeline */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0610x6ae15cfd f1412x965035b0;

    /* renamed from: mIncompleteRequests */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a> f1413x184d2a8f;

    /* renamed from: mNewRequests */
    final java.util.Deque<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838> f1414xdd84ded7 = new java.util.ArrayDeque();

    /* renamed from: mPaused */
    boolean f1415x1418bffb = false;

    /* renamed from: androidx.camera.core.imagecapture.TakePictureManager$CaptureError */
    /* loaded from: classes14.dex */
    public static abstract class CaptureError {
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError of(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0591x4104ff6e(i17, c0524xb471f04);
        }

        /* renamed from: getImageCaptureException */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 mo4908xaa11a16e();

        /* renamed from: getRequestId */
        public abstract int mo4909x28ca0554();
    }

    public C0633xe3071556(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0609xb32cdd52 interfaceC0609xb32cdd52) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1411x531523c5 = interfaceC0609xb32cdd52;
        this.f1413x184d2a8f = new java.util.ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$trackCurrentRequests$0 */
    public /* synthetic */ void m5064x843af11b() {
        this.f1410x7bbae119 = null;
        m5073x594a8583();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$trackCurrentRequests$1 */
    public /* synthetic */ void m5065x843af11c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a c0628xb42fbf3a) {
        this.f1413x184d2a8f.remove(c0628xb42fbf3a);
    }

    /* renamed from: submitCameraRequest */
    private wa.a m5066x7e1dba72(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0596x2447138a c0596x2447138a) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1411x531523c5.mo4554xd77e20c8();
        wa.a mo4555x7c34ae9a = this.f1411x531523c5.mo4555x7c34ae9a(c0596x2447138a.m4928xc025e841());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(mo4555x7c34ae9a, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.core.imagecapture.TakePictureManager.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
                if (c0596x2447138a.m4929x963a6b45()) {
                    return;
                }
                int m5332x5db1b11 = c0596x2447138a.m4928xc025e841().get(0).m5332x5db1b11();
                if (th6 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.this.f1412x965035b0.m4977x71cefc4b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError.of(m5332x5db1b11, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04) th6));
                } else {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.this.f1412x965035b0.m4977x71cefc4b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.CaptureError.of(m5332x5db1b11, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(2, "Failed to submit capture request", th6)));
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.this.f1411x531523c5.mo4556xf61252cf();
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(java.lang.Void r17) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.this.f1411x531523c5.mo4556xf61252cf();
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
        return mo4555x7c34ae9a;
    }

    /* renamed from: trackCurrentRequests */
    private void m5067xb3979f92(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a c0628xb42fbf3a) {
        m3.h.e(!m5072x68347946(), null);
        this.f1410x7bbae119 = c0628xb42fbf3a;
        c0628xb42fbf3a.m5047x1c2cf0f3().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureManager$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.this.m5064x843af11b();
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        this.f1413x184d2a8f.add(c0628xb42fbf3a);
        c0628xb42fbf3a.m5048x19d1e952().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureManager$$b
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.this.m5065x843af11c(c0628xb42fbf3a);
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
    }

    /* renamed from: abortRequests */
    public void m5068xc4f0b714() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(3, "Camera is closed.", null);
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838> it = this.f1414xdd84ded7.iterator();
        while (it.hasNext()) {
            it.next().m5088xaf8aa769(c0524xb471f04);
        }
        this.f1414xdd84ded7.clear();
        java.util.Iterator it6 = new java.util.ArrayList(this.f1413x184d2a8f).iterator();
        while (it6.hasNext()) {
            ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a) it6.next()).m5045x7e2e68d(c0524xb471f04);
        }
    }

    /* renamed from: getCapturingRequest */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a m5069xfd7b7e02() {
        return this.f1410x7bbae119;
    }

    /* renamed from: getImagePipeline */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0610x6ae15cfd m5070xf8a1e967() {
        return this.f1412x965035b0;
    }

    /* renamed from: getIncompleteRequests */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a> m5071x2c5a3138() {
        return this.f1413x184d2a8f;
    }

    /* renamed from: hasCapturingRequest */
    public boolean m5072x68347946() {
        return this.f1410x7bbae119 != null;
    }

    /* renamed from: issueNextRequest */
    public void m5073x594a8583() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 poll;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (m5072x68347946() || this.f1415x1418bffb || this.f1412x965035b0.m4973x77cf5230() == 0 || (poll = this.f1414xdd84ded7.poll()) == null) {
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a c0628xb42fbf3a = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a(poll, this);
        m5067xb3979f92(c0628xb42fbf3a);
        m3.d m4969x1f8ca8e0 = this.f1412x965035b0.m4969x1f8ca8e0(poll, c0628xb42fbf3a, c0628xb42fbf3a.m5047x1c2cf0f3());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0596x2447138a c0596x2447138a = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0596x2447138a) m4969x1f8ca8e0.f404625a;
        java.util.Objects.requireNonNull(c0596x2447138a);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc) m4969x1f8ca8e0.f404626b;
        java.util.Objects.requireNonNull(c0627xbfd50fdc);
        this.f1412x965035b0.m4979x6eae02c4(c0627xbfd50fdc);
        c0628xb42fbf3a.m5059xdb15db0e(m5066x7e1dba72(c0596x2447138a));
    }

    /* renamed from: offerRequest */
    public void m5074x64365093(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 abstractC0637xf28cf838) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1414xdd84ded7.offer(abstractC0637xf28cf838);
        m5073x594a8583();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener
    /* renamed from: onImageClose */
    public void mo4407x6f90449c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureManager$$c
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556.this.m5073x594a8583();
            }
        });
    }

    /* renamed from: pause */
    public void m5075x65825f6() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1415x1418bffb = true;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0628xb42fbf3a c0628xb42fbf3a = this.f1410x7bbae119;
        if (c0628xb42fbf3a != null) {
            c0628xb42fbf3a.m5046xc900d123();
        }
    }

    /* renamed from: resume */
    public void m5076xc84dc82d() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1415x1418bffb = false;
        m5073x594a8583();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838.RetryControl
    /* renamed from: retryRequest */
    public void mo5077xa10c9ac7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838 abstractC0637xf28cf838) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Add a new request for retrying.");
        this.f1414xdd84ded7.addFirst(abstractC0637xf28cf838);
        m5073x594a8583();
    }

    /* renamed from: setImagePipeline */
    public void m5078x8b784fdb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0610x6ae15cfd c0610x6ae15cfd) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f1412x965035b0 = c0610x6ae15cfd;
        c0610x6ae15cfd.m4978xe2f5fcf2(this);
    }
}
