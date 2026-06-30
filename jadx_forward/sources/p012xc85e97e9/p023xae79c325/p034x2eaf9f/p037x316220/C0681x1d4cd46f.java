package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.CameraRepository */
/* loaded from: classes14.dex */
public final class C0681x1d4cd46f {
    private static final java.lang.String TAG = "CameraRepository";

    /* renamed from: mDeinitCompleter */
    private t2.k f1583xedea01b;

    /* renamed from: mDeinitFuture */
    private wa.a f1584x50840b41;

    /* renamed from: mCamerasLock */
    private final java.lang.Object f1582x25d1458c = new java.lang.Object();

    /* renamed from: mCameras */
    private final java.util.Map<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> f1581xbed754c1 = new java.util.LinkedHashMap();

    /* renamed from: mReleasingCameras */
    private final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> f1585x740378d7 = new java.util.HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$deinit$0 */
    public /* synthetic */ java.lang.Object m5298xbc65e59a(t2.k kVar) {
        synchronized (this.f1582x25d1458c) {
            this.f1583xedea01b = kVar;
        }
        return "CameraRepository-deinit";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$deinit$1 */
    public void m5299xbc65e59b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        synchronized (this.f1582x25d1458c) {
            this.f1585x740378d7.remove(interfaceC0677x9e0bc522);
            if (this.f1585x740378d7.isEmpty()) {
                this.f1583xedea01b.getClass();
                this.f1583xedea01b.a(null);
                this.f1583xedea01b = null;
                this.f1584x50840b41 = null;
            }
        }
    }

    /* renamed from: deinit */
    public wa.a m5300xb0654911() {
        synchronized (this.f1582x25d1458c) {
            if (this.f1581xbed754c1.isEmpty()) {
                wa.a aVar = this.f1584x50840b41;
                if (aVar == null) {
                    aVar = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
                }
                return aVar;
            }
            wa.a aVar2 = this.f1584x50840b41;
            if (aVar2 == null) {
                aVar2 = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.CameraRepository$$a
                    @Override // t2.m
                    /* renamed from: attachCompleter */
                    public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                        java.lang.Object m5298xbc65e59a;
                        m5298xbc65e59a = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0681x1d4cd46f.this.m5298xbc65e59a(kVar);
                        return m5298xbc65e59a;
                    }
                });
                this.f1584x50840b41 = aVar2;
            }
            this.f1585x740378d7.addAll(this.f1581xbed754c1.values());
            for (final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522 : this.f1581xbed754c1.values()) {
                interfaceC0677x9e0bc522.mo3104x41012807().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraRepository$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0681x1d4cd46f.this.m5299xbc65e59b(interfaceC0677x9e0bc522);
                    }
                }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
            }
            this.f1581xbed754c1.clear();
            return aVar2;
        }
    }

    /* renamed from: getCamera */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m5301x1390e61b(java.lang.String str) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522;
        synchronized (this.f1582x25d1458c) {
            interfaceC0677x9e0bc522 = this.f1581xbed754c1.get(str);
            if (interfaceC0677x9e0bc522 == null) {
                throw new java.lang.IllegalArgumentException("Invalid camera: " + str);
            }
        }
        return interfaceC0677x9e0bc522;
    }

    /* renamed from: getCameraIds */
    public java.util.Set<java.lang.String> m5302xeb0abe9d() {
        java.util.LinkedHashSet linkedHashSet;
        synchronized (this.f1582x25d1458c) {
            linkedHashSet = new java.util.LinkedHashSet(this.f1581xbed754c1.keySet());
        }
        return linkedHashSet;
    }

    /* renamed from: getCameras */
    public java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> m5303x5e8bddb8() {
        java.util.LinkedHashSet<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522> linkedHashSet;
        synchronized (this.f1582x25d1458c) {
            linkedHashSet = new java.util.LinkedHashSet<>(this.f1581xbed754c1.values());
        }
        return linkedHashSet;
    }

    /* renamed from: init */
    public void m5304x316510(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205 interfaceC0671xa1e35205) {
        synchronized (this.f1582x25d1458c) {
            try {
                try {
                    for (java.lang.String str : interfaceC0671xa1e35205.mo3023x3fef5680()) {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Added camera: " + str);
                        this.f1581xbed754c1.put(str, interfaceC0671xa1e35205.mo3024x1390e61b(str));
                    }
                } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0477xb32300c4 e17) {
                    throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0542x71a3036f(e17);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }
}
