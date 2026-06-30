package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.MetadataImageReader */
/* loaded from: classes14.dex */
public class C0545xfdfbaf2f implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener {
    private static final java.lang.String TAG = "MetadataImageReader";

    /* renamed from: mAcquiredImageProxies */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> f1141x43663f2c;

    /* renamed from: mCameraCaptureCallback */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 f1142x17671159;

    /* renamed from: mClosed */
    private boolean f1143xfe820839;

    /* renamed from: mExecutor */
    private java.util.concurrent.Executor f1144x9ec3a060;

    /* renamed from: mImageProxiesIndex */
    private int f1145x27a7acb4;

    /* renamed from: mImageReaderProxy */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 f1146xfc48759d;

    /* renamed from: mListener */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener f1147x753a6c41;

    /* renamed from: mLock */
    private final java.lang.Object f1148x6243b38;

    /* renamed from: mMatchedImageProxies */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> f1149xa3accf48;

    /* renamed from: mPendingImageInfos */
    private final android.util.LongSparseArray<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89> f1150xe65a54f4;

    /* renamed from: mPendingImages */
    private final android.util.LongSparseArray<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> f1151x62a03382;

    /* renamed from: mTransformedListener */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener f1152x5ad84932;

    /* renamed from: mUnAcquiredAvailableImageCount */
    private int f1153xdfe2bb29;

    public C0545xfdfbaf2f(int i17, int i18, int i19, int i27) {
        this(m4681x7b51182c(i17, i18, i19, i27));
    }

    /* renamed from: createImageReaderProxy */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 m4681x7b51182c(int i17, int i18, int i19, int i27) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0452xa8e53f7f(android.media.ImageReader.newInstance(i17, i18, i19, i27));
    }

    /* renamed from: dequeImageProxy */
    private void m4682xe075b493(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        synchronized (this.f1148x6243b38) {
            int indexOf = this.f1149xa3accf48.indexOf(interfaceC0536x1ffeadf3);
            if (indexOf >= 0) {
                this.f1149xa3accf48.remove(indexOf);
                int i17 = this.f1145x27a7acb4;
                if (indexOf <= i17) {
                    this.f1145x27a7acb4 = i17 - 1;
                }
            }
            this.f1141x43663f2c.remove(interfaceC0536x1ffeadf3);
            if (this.f1153xdfe2bb29 > 0) {
                m4689x56f77aa1(this.f1146xfc48759d);
            }
        }
    }

    /* renamed from: enqueueImageProxy */
    private void m4683x200451fb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0564x7c326fbf c0564x7c326fbf) {
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener onImageAvailableListener;
        java.util.concurrent.Executor executor;
        synchronized (this.f1148x6243b38) {
            if (this.f1149xa3accf48.size() < mo4189xcb8dea46()) {
                c0564x7c326fbf.m4405x5b6423b1(this);
                this.f1149xa3accf48.add(c0564x7c326fbf);
                onImageAvailableListener = this.f1147x753a6c41;
                executor = this.f1144x9ec3a060;
            } else {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d("TAG", "Maximum image number reached.");
                c0564x7c326fbf.close();
                onImageAvailableListener = null;
                executor = null;
            }
        }
        if (onImageAvailableListener != null) {
            if (executor != null) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.MetadataImageReader$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0545xfdfbaf2f.this.m4684xa6ce936b(onImageAvailableListener);
                    }
                });
            } else {
                onImageAvailableListener.mo3686xdf8fff6d(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$enqueueImageProxy$1 */
    public /* synthetic */ void m4684xa6ce936b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.mo3686xdf8fff6d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ void m4685x51ef5f0f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        synchronized (this.f1148x6243b38) {
            this.f1153xdfe2bb29++;
        }
        m4689x56f77aa1(interfaceC0719xa3f4ef30);
    }

    /* renamed from: matchImages */
    private void m4686x5092209d() {
        synchronized (this.f1148x6243b38) {
            for (int size = this.f1150xe65a54f4.size() - 1; size >= 0; size--) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 valueAt = this.f1150xe65a54f4.valueAt(size);
                long mo4212x2b69a60 = valueAt.mo4212x2b69a60();
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3 = this.f1151x62a03382.get(mo4212x2b69a60);
                if (interfaceC0536x1ffeadf3 != null) {
                    this.f1151x62a03382.remove(mo4212x2b69a60);
                    this.f1150xe65a54f4.removeAt(size);
                    m4683x200451fb(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0564x7c326fbf(interfaceC0536x1ffeadf3, valueAt));
                }
            }
            m4687xf3da2ebf();
        }
    }

    /* renamed from: removeStaleData */
    private void m4687xf3da2ebf() {
        synchronized (this.f1148x6243b38) {
            if (this.f1151x62a03382.size() != 0 && this.f1150xe65a54f4.size() != 0) {
                java.lang.Long valueOf = java.lang.Long.valueOf(this.f1151x62a03382.keyAt(0));
                java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f1150xe65a54f4.keyAt(0));
                m3.h.a(valueOf2.equals(valueOf) ? false : true);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.f1151x62a03382.size() - 1; size >= 0; size--) {
                        if (this.f1151x62a03382.keyAt(size) < valueOf2.longValue()) {
                            this.f1151x62a03382.valueAt(size).close();
                            this.f1151x62a03382.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f1150xe65a54f4.size() - 1; size2 >= 0; size2--) {
                        if (this.f1150xe65a54f4.keyAt(size2) < valueOf.longValue()) {
                            this.f1150xe65a54f4.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: acquireLatestImage */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4183xaf314b5e() {
        synchronized (this.f1148x6243b38) {
            if (this.f1149xa3accf48.isEmpty()) {
                return null;
            }
            if (this.f1145x27a7acb4 >= this.f1149xa3accf48.size()) {
                throw new java.lang.IllegalStateException("Maximum image number reached.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < this.f1149xa3accf48.size() - 1; i17++) {
                if (!this.f1141x43663f2c.contains(this.f1149xa3accf48.get(i17))) {
                    arrayList.add(this.f1149xa3accf48.get(i17));
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3) it.next()).close();
            }
            int size = this.f1149xa3accf48.size() - 1;
            java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> list = this.f1149xa3accf48;
            this.f1145x27a7acb4 = size + 1;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3 = list.get(size);
            this.f1141x43663f2c.add(interfaceC0536x1ffeadf3);
            return interfaceC0536x1ffeadf3;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: acquireNextImage */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4184x825b5df2() {
        synchronized (this.f1148x6243b38) {
            if (this.f1149xa3accf48.isEmpty()) {
                return null;
            }
            if (this.f1145x27a7acb4 >= this.f1149xa3accf48.size()) {
                throw new java.lang.IllegalStateException("Maximum image number reached.");
            }
            java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> list = this.f1149xa3accf48;
            int i17 = this.f1145x27a7acb4;
            this.f1145x27a7acb4 = i17 + 1;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3 = list.get(i17);
            this.f1141x43663f2c.add(interfaceC0536x1ffeadf3);
            return interfaceC0536x1ffeadf3;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: clearOnImageAvailableListener */
    public void mo4185xc0146eae() {
        synchronized (this.f1148x6243b38) {
            this.f1146xfc48759d.mo4185xc0146eae();
            this.f1147x753a6c41 = null;
            this.f1144x9ec3a060 = null;
            this.f1153xdfe2bb29 = 0;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: close */
    public void mo4186x5a5ddf8() {
        synchronized (this.f1148x6243b38) {
            if (this.f1143xfe820839) {
                return;
            }
            java.util.Iterator it = new java.util.ArrayList(this.f1149xa3accf48).iterator();
            while (it.hasNext()) {
                ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3) it.next()).close();
            }
            this.f1149xa3accf48.clear();
            this.f1146xfc48759d.mo4186x5a5ddf8();
            this.f1143xfe820839 = true;
        }
    }

    /* renamed from: getCameraCaptureCallback */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 m4688x6f411e10() {
        return this.f1142x17671159;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getHeight */
    public int mo4187x1c4fb41d() {
        int mo4187x1c4fb41d;
        synchronized (this.f1148x6243b38) {
            mo4187x1c4fb41d = this.f1146xfc48759d.mo4187x1c4fb41d();
        }
        return mo4187x1c4fb41d;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getImageFormat */
    public int mo4188x450a23fc() {
        int mo4188x450a23fc;
        synchronized (this.f1148x6243b38) {
            mo4188x450a23fc = this.f1146xfc48759d.mo4188x450a23fc();
        }
        return mo4188x450a23fc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getMaxImages */
    public int mo4189xcb8dea46() {
        int mo4189xcb8dea46;
        synchronized (this.f1148x6243b38) {
            mo4189xcb8dea46 = this.f1146xfc48759d.mo4189xcb8dea46();
        }
        return mo4189xcb8dea46;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getSurface */
    public android.view.Surface mo4190xcf572877() {
        android.view.Surface mo4190xcf572877;
        synchronized (this.f1148x6243b38) {
            mo4190xcf572877 = this.f1146xfc48759d.mo4190xcf572877();
        }
        return mo4190xcf572877;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: getWidth */
    public int mo4191x755bd410() {
        int mo4191x755bd410;
        synchronized (this.f1148x6243b38) {
            mo4191x755bd410 = this.f1146xfc48759d.mo4191x755bd410();
        }
        return mo4191x755bd410;
    }

    /* renamed from: imageIncoming */
    public void m4689x56f77aa1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3;
        synchronized (this.f1148x6243b38) {
            if (this.f1143xfe820839) {
                return;
            }
            int size = this.f1151x62a03382.size() + this.f1149xa3accf48.size();
            if (size >= interfaceC0719xa3f4ef30.mo4189xcb8dea46()) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Skip to acquire the next image because the acquired image count has reached the max images count.");
                return;
            }
            do {
                try {
                    interfaceC0536x1ffeadf3 = interfaceC0719xa3f4ef30.mo4184x825b5df2();
                    if (interfaceC0536x1ffeadf3 != null) {
                        this.f1153xdfe2bb29--;
                        size++;
                        this.f1151x62a03382.put(interfaceC0536x1ffeadf3.mo4173xcb10cdf3().mo4212x2b69a60(), interfaceC0536x1ffeadf3);
                        m4686x5092209d();
                    }
                } catch (java.lang.IllegalStateException e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Failed to acquire next image.", e17);
                    interfaceC0536x1ffeadf3 = null;
                }
                if (interfaceC0536x1ffeadf3 == null || this.f1153xdfe2bb29 <= 0) {
                    break;
                }
            } while (size < interfaceC0719xa3f4ef30.mo4189xcb8dea46());
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0504x6bc05cd0.OnImageCloseListener
    /* renamed from: onImageClose */
    public void mo4407x6f90449c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        synchronized (this.f1148x6243b38) {
            m4682xe075b493(interfaceC0536x1ffeadf3);
        }
    }

    /* renamed from: resultIncoming */
    public void m4690x7728b763(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        synchronized (this.f1148x6243b38) {
            if (this.f1143xfe820839) {
                return;
            }
            this.f1150xe65a54f4.put(interfaceC0663xe081a7be.mo2936x2b69a60(), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0830x9b01aa8b(interfaceC0663xe081a7be));
            m4686x5092209d();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30
    /* renamed from: setOnImageAvailableListener */
    public void mo4192x6034c5c3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener onImageAvailableListener, java.util.concurrent.Executor executor) {
        synchronized (this.f1148x6243b38) {
            onImageAvailableListener.getClass();
            this.f1147x753a6c41 = onImageAvailableListener;
            executor.getClass();
            this.f1144x9ec3a060 = executor;
            this.f1146xfc48759d.mo4192x6034c5c3(this.f1152x5ad84932, executor);
        }
    }

    public C0545xfdfbaf2f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        this.f1148x6243b38 = new java.lang.Object();
        this.f1142x17671159 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6() { // from class: androidx.camera.core.MetadataImageReader.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
            /* renamed from: onCaptureCompleted */
            public void mo3016x34cad1a4(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
                super.mo3016x34cad1a4(i17, interfaceC0663xe081a7be);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0545xfdfbaf2f.this.m4690x7728b763(interfaceC0663xe081a7be);
            }
        };
        this.f1153xdfe2bb29 = 0;
        this.f1152x5ad84932 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener() { // from class: androidx.camera.core.MetadataImageReader$$b
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener
            /* renamed from: onImageAvailable */
            public final void mo3686xdf8fff6d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef302) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0545xfdfbaf2f.this.m4685x51ef5f0f(interfaceC0719xa3f4ef302);
            }
        };
        this.f1143xfe820839 = false;
        this.f1150xe65a54f4 = new android.util.LongSparseArray<>();
        this.f1151x62a03382 = new android.util.LongSparseArray<>();
        this.f1141x43663f2c = new java.util.ArrayList();
        this.f1146xfc48759d = interfaceC0719xa3f4ef30;
        this.f1145x27a7acb4 = 0;
        this.f1149xa3accf48 = new java.util.ArrayList(mo4189xcb8dea46());
    }
}
