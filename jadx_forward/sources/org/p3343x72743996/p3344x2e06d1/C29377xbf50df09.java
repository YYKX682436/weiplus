package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.UnownedUserDataHost */
/* loaded from: classes16.dex */
public final class C29377xbf50df09 {

    /* renamed from: mDestroyChecker */
    private final org.p3343x72743996.p3344x2e06d1.p3347x394123c9.C29398xc04f867b f73482x2bbc428;

    /* renamed from: mHandler */
    private android.os.Handler f73483xc7640a1d;

    /* renamed from: mThreadChecker */
    private final org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.ThreadChecker f73484x8ec462de;

    /* renamed from: mUnownedUserDataMap */
    private java.util.HashMap<org.p3343x72743996.p3344x2e06d1.C29379x507e84de<?>, java.lang.ref.WeakReference<? extends org.p3343x72743996.p3344x2e06d1.InterfaceC29376x1b753dc1>> f73485xe20a2b08;

    public C29377xbf50df09() {
        this(new android.os.Handler(m152757xae8e73fa()));
    }

    /* renamed from: checkState */
    private void m152755xe071d469() {
        this.f73484x8ec462de.m152672xb702e421();
        this.f73482x2bbc428.m152873xd87b75ae();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$0 */
    public /* synthetic */ void m152756x719d844d(org.p3343x72743996.p3344x2e06d1.InterfaceC29376x1b753dc1 interfaceC29376x1b753dc1) {
        interfaceC29376x1b753dc1.m152754x76a8ae03(this);
    }

    /* renamed from: retrieveNonNullLooperOrThrow */
    private static android.os.Looper m152757xae8e73fa() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        throw new java.lang.IllegalStateException();
    }

    /* renamed from: destroy */
    public void m152758x5cd39ffa() {
        this.f73484x8ec462de.m152672xb702e421();
        if (this.f73482x2bbc428.m152875xbca8d80f()) {
            return;
        }
        java.util.Iterator it = new java.util.HashSet(this.f73485xe20a2b08.keySet()).iterator();
        while (it.hasNext()) {
            ((org.p3343x72743996.p3344x2e06d1.C29379x507e84de) it.next()).m152766xa953d525(this);
        }
        this.f73485xe20a2b08 = null;
        this.f73483xc7640a1d = null;
        this.f73482x2bbc428.mo152874x5cd39ffa();
    }

    public <T extends org.p3343x72743996.p3344x2e06d1.InterfaceC29376x1b753dc1> T get(org.p3343x72743996.p3344x2e06d1.C29379x507e84de<T> c29379x507e84de) {
        m152755xe071d469();
        java.lang.ref.WeakReference<? extends org.p3343x72743996.p3344x2e06d1.InterfaceC29376x1b753dc1> weakReference = this.f73485xe20a2b08.get(c29379x507e84de);
        if (weakReference == null) {
            return null;
        }
        org.p3343x72743996.p3344x2e06d1.InterfaceC29376x1b753dc1 interfaceC29376x1b753dc1 = weakReference.get();
        if (interfaceC29376x1b753dc1 != null) {
            return c29379x507e84de.m152768x667d1e7d().cast(interfaceC29376x1b753dc1);
        }
        c29379x507e84de.m152766xa953d525(this);
        return null;
    }

    /* renamed from: getMapSize */
    public int m152759x6fac2747() {
        m152755xe071d469();
        return this.f73485xe20a2b08.size();
    }

    /* renamed from: isDestroyed */
    public boolean m152760xbca8d80f() {
        return this.f73482x2bbc428.m152875xbca8d80f();
    }

    /* renamed from: remove */
    public <T extends org.p3343x72743996.p3344x2e06d1.InterfaceC29376x1b753dc1> void m152761xc84af884(org.p3343x72743996.p3344x2e06d1.C29379x507e84de<T> c29379x507e84de) {
        final org.p3343x72743996.p3344x2e06d1.InterfaceC29376x1b753dc1 interfaceC29376x1b753dc1;
        m152755xe071d469();
        java.lang.ref.WeakReference<? extends org.p3343x72743996.p3344x2e06d1.InterfaceC29376x1b753dc1> remove = this.f73485xe20a2b08.remove(c29379x507e84de);
        if (remove == null || (interfaceC29376x1b753dc1 = remove.get()) == null || !interfaceC29376x1b753dc1.m152753xb0ed404b()) {
            return;
        }
        this.f73483xc7640a1d.post(new java.lang.Runnable() { // from class: org.chromium.base.UnownedUserDataHost$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3343x72743996.p3344x2e06d1.C29377xbf50df09.this.m152756x719d844d(interfaceC29376x1b753dc1);
            }
        });
    }

    public <T extends org.p3343x72743996.p3344x2e06d1.InterfaceC29376x1b753dc1> void set(org.p3343x72743996.p3344x2e06d1.C29379x507e84de<T> c29379x507e84de, T t17) {
        m152755xe071d469();
        if (this.f73485xe20a2b08.containsKey(c29379x507e84de) && !t17.equals(get(c29379x507e84de))) {
            c29379x507e84de.m152766xa953d525(this);
        }
        this.f73485xe20a2b08.put(c29379x507e84de, new java.lang.ref.WeakReference<>(t17));
    }

    public C29377xbf50df09(android.os.Handler handler) {
        this.f73484x8ec462de = new org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.ThreadChecker();
        this.f73482x2bbc428 = new org.p3343x72743996.p3344x2e06d1.p3347x394123c9.C29398xc04f867b();
        this.f73485xe20a2b08 = new java.util.HashMap<>();
        this.f73483xc7640a1d = handler;
    }
}
