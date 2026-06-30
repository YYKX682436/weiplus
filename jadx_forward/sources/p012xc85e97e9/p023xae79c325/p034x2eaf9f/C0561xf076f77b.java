package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.SafeCloseImageReaderProxy */
/* loaded from: classes14.dex */
public class C0561xf076f77b implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 {

    /* renamed from: mForwardingImageCloseListener */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener f1202xc0ea1b;

    /* renamed from: mImageReaderProxy */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 f1204xfc48759d;

    /* renamed from: mSurface */
    private final android.view.Surface f1208x2fa29f80;

    /* renamed from: mLock */
    private final java.lang.Object f1206x6243b38 = new java.lang.Object();

    /* renamed from: mOutstandingImages */
    private int f1207x7f1897c5 = 0;

    /* renamed from: mIsClosed */
    private boolean f1205xfc407ac3 = false;

    /* renamed from: mImageCloseListener */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener f1203x7e00bc7e = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener() { // from class: androidx.camera.core.SafeCloseImageReaderProxy$$a
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener
        /* renamed from: onImageClose */
        public final void mo4407x6f90449c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b.this.m4758x51ef5f0f(interfaceC0536x1ffeadf3);
        }
    };

    public C0561xf076f77b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        this.f1204xfc48759d = interfaceC0719xa3f4ef30;
        this.f1208x2fa29f80 = interfaceC0719xa3f4ef30.mo4190xcf572877();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ void m4758x51ef5f0f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener onImageCloseListener;
        synchronized (this.f1206x6243b38) {
            int i17 = this.f1207x7f1897c5 - 1;
            this.f1207x7f1897c5 = i17;
            if (this.f1205xfc407ac3 && i17 == 0) {
                mo4186x5a5ddf8();
            }
            onImageCloseListener = this.f1202xc0ea1b;
        }
        if (onImageCloseListener != null) {
            onImageCloseListener.mo4407x6f90449c(interfaceC0536x1ffeadf3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setOnImageAvailableListener$1 */
    public /* synthetic */ void m4759x93584573(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener onImageAvailableListener, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        onImageAvailableListener.mo3686xdf8fff6d(this);
    }

    /* renamed from: wrapImageProxy */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 m4760x62ce29bd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        if (interfaceC0536x1ffeadf3 == null) {
            return null;
        }
        this.f1207x7f1897c5++;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0565x1eeae063 c0565x1eeae063 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0565x1eeae063(interfaceC0536x1ffeadf3);
        c0565x1eeae063.m4405x5b6423b1(this.f1203x7e00bc7e);
        return c0565x1eeae063;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: acquireLatestImage */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4183xaf314b5e() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 m4760x62ce29bd;
        synchronized (this.f1206x6243b38) {
            m4760x62ce29bd = m4760x62ce29bd(this.f1204xfc48759d.mo4183xaf314b5e());
        }
        return m4760x62ce29bd;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: acquireNextImage */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4184x825b5df2() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 m4760x62ce29bd;
        synchronized (this.f1206x6243b38) {
            m4760x62ce29bd = m4760x62ce29bd(this.f1204xfc48759d.mo4184x825b5df2());
        }
        return m4760x62ce29bd;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: clearOnImageAvailableListener */
    public void mo4185xc0146eae() {
        synchronized (this.f1206x6243b38) {
            this.f1204xfc48759d.mo4185xc0146eae();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: close */
    public void mo4186x5a5ddf8() {
        synchronized (this.f1206x6243b38) {
            android.view.Surface surface = this.f1208x2fa29f80;
            if (surface != null) {
                surface.release();
            }
            this.f1204xfc48759d.mo4186x5a5ddf8();
        }
    }

    /* renamed from: getCapacity */
    public int m4761x77cf5230() {
        int mo4189xcb8dea46;
        synchronized (this.f1206x6243b38) {
            mo4189xcb8dea46 = this.f1204xfc48759d.mo4189xcb8dea46() - this.f1207x7f1897c5;
        }
        return mo4189xcb8dea46;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getHeight */
    public int mo4187x1c4fb41d() {
        int mo4187x1c4fb41d;
        synchronized (this.f1206x6243b38) {
            mo4187x1c4fb41d = this.f1204xfc48759d.mo4187x1c4fb41d();
        }
        return mo4187x1c4fb41d;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getImageFormat */
    public int mo4188x450a23fc() {
        int mo4188x450a23fc;
        synchronized (this.f1206x6243b38) {
            mo4188x450a23fc = this.f1204xfc48759d.mo4188x450a23fc();
        }
        return mo4188x450a23fc;
    }

    /* renamed from: getImageReaderProxy */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 m4762x7e091286() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30;
        synchronized (this.f1206x6243b38) {
            interfaceC0719xa3f4ef30 = this.f1204xfc48759d;
        }
        return interfaceC0719xa3f4ef30;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getMaxImages */
    public int mo4189xcb8dea46() {
        int mo4189xcb8dea46;
        synchronized (this.f1206x6243b38) {
            mo4189xcb8dea46 = this.f1204xfc48759d.mo4189xcb8dea46();
        }
        return mo4189xcb8dea46;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getSurface */
    public android.view.Surface mo4190xcf572877() {
        android.view.Surface mo4190xcf572877;
        synchronized (this.f1206x6243b38) {
            mo4190xcf572877 = this.f1204xfc48759d.mo4190xcf572877();
        }
        return mo4190xcf572877;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getWidth */
    public int mo4191x755bd410() {
        int mo4191x755bd410;
        synchronized (this.f1206x6243b38) {
            mo4191x755bd410 = this.f1204xfc48759d.mo4191x755bd410();
        }
        return mo4191x755bd410;
    }

    /* renamed from: isClosed */
    public boolean m4763xd742d336() {
        boolean z17;
        synchronized (this.f1206x6243b38) {
            z17 = this.f1205xfc407ac3;
        }
        return z17;
    }

    /* renamed from: safeClose */
    public void m4764xbb07de6b() {
        synchronized (this.f1206x6243b38) {
            this.f1205xfc407ac3 = true;
            this.f1204xfc48759d.mo4185xc0146eae();
            if (this.f1207x7f1897c5 == 0) {
                mo4186x5a5ddf8();
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: setOnImageAvailableListener */
    public void mo4192x6034c5c3(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener onImageAvailableListener, java.util.concurrent.Executor executor) {
        synchronized (this.f1206x6243b38) {
            this.f1204xfc48759d.mo4192x6034c5c3(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener() { // from class: androidx.camera.core.SafeCloseImageReaderProxy$$b
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener
                /* renamed from: onImageAvailable */
                public final void mo3686xdf8fff6d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b.this.m4759x93584573(onImageAvailableListener, interfaceC0719xa3f4ef30);
                }
            }, executor);
        }
    }

    /* renamed from: setOnImageCloseListener */
    public void m4765xe2f5fcf2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener onImageCloseListener) {
        synchronized (this.f1206x6243b38) {
            this.f1202xc0ea1b = onImageCloseListener;
        }
    }
}
