package com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1;

/* renamed from: com.tencent.mm.vending.base.Vending */
/* loaded from: classes16.dex */
public abstract class AbstractC22733x77ee84fd<_Struct, _Index, _Change> implements im5.a {

    /* renamed from: MESSAGE_DO_DESTROY */
    private static final int f39759xae4e437e = 2;

    /* renamed from: MESSAGE_NOTIFY_DATA_LOADED */
    private static final int f39760x103bb59c = 1;

    /* renamed from: MESSAGE_PREPARE_VENDING_DATA */
    private static final int f39761x7ed0d35c = 1;

    /* renamed from: SYNC_MESSAGE_APPLY_CHANGE */
    private static final int f39762x9350ba3d = 1;

    /* renamed from: SYNC_MESSAGE_CLEAR_RESOLVED_ONLY */
    private static final int f39763x2f25e505 = 3;

    /* renamed from: SYNC_MESSAGE_PREPARE_DATA_DEGRADE */
    private static final int f39764x7bcda515 = 2;
    private static final java.lang.String TAG = "Vending";

    /* renamed from: mArray */
    private com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.s f39765xbdc9bdec;

    /* renamed from: mArrayDataLock */
    private byte[] f39766x884cba01;

    /* renamed from: mCallDestroyed */
    private java.util.concurrent.atomic.AtomicBoolean f39767x4f5e0dee;

    /* renamed from: mDataChangedCallback */
    private volatile fm5.d f39768xe37f4062;

    /* renamed from: mDataResolvedCallback */
    private volatile fm5.d f39769x2f872434;

    /* renamed from: mDeadlock */
    private com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.l f39770x4302971c;

    /* renamed from: mFreezeDataChange */
    private boolean f39771x4ff1d87e;

    /* renamed from: mHasPendingDataChange */
    private boolean f39772x79504d84;

    /* renamed from: mLoader */
    private com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.r f39773xe0156e0;

    /* renamed from: mPendingDataChangeLock */
    private byte[] f39774x28dbbb4f;

    /* renamed from: mResolveFromVending */
    private boolean f39775x64b8afd4;

    /* renamed from: mSubscriberHandler */
    private android.os.Handler f39776x5af664d5;

    /* renamed from: mSubscriberLooper */
    private android.os.Looper f39777x75e34f66;

    /* renamed from: mVendingDeferring */
    java.util.HashSet<com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.t> f39778x5ba37292;

    /* renamed from: mVendingHandler */
    private android.os.Handler f39779xf3ee813a;

    /* renamed from: mVendingLooper */
    private android.os.Looper f39780xfef39261;

    /* renamed from: mVendingSync */
    private com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.y f39781x69c4b6ab;

    public AbstractC22733x77ee84fd() {
        this(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: callPrepareVendingData */
    public void m82231xe72d15de() {
        if (this.f39767x4f5e0dee.get()) {
            return;
        }
        jm5.b.b(TAG, "Vending.callPrepareVendingData()", new java.lang.Object[0]);
        this.f39781x69c4b6ab.a(1, mo82262x133e6348());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: deadlock */
    public void m82232x1e04ef8f() {
        if (this.f39770x4302971c.f294183a.f294182a != null) {
            jm5.b.a(TAG, "Catch deadlock! Tell Carl! .. " + this.f39770x4302971c.f294183a.f294182a, new java.lang.Object[0]);
            com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u uVar = this.f39770x4302971c.f294184b;
            if (uVar != null) {
                synchronized (uVar.f294198c) {
                    this.f39770x4302971c.f294184b.f294198c.notify();
                }
                com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.l lVar = this.f39770x4302971c;
                lVar.f294183a.f294182a = null;
                lVar.f294184b = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: deferResolved */
    public void m82233xde59318a(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.t tVar, _Index _index, _Struct _struct) {
        if (this.f39778x5ba37292.contains(tVar)) {
            com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u m82251xfb822da1 = m82251xfb822da1(_index);
            synchronized (m82251xfb822da1.f294198c) {
                m82251xfb822da1.f294202g = false;
                m82238x2e9e8a43(m82251xfb822da1, _index, _struct);
            }
            m82239x3000b5eb(m82251xfb822da1);
        }
    }

    /* renamed from: forSubscriberSync */
    private com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u m82234x1450ac4c(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u uVar, _Index _index) {
        if (!mm5.b.f411231b.f411232a.isAlive()) {
            jm5.b.a(TAG, "Vending thread is not running!", new java.lang.Object[0]);
            return uVar;
        }
        synchronized (uVar.f294198c) {
            boolean m82243x4c758783 = m82243x4c758783(uVar, _index);
            if (!uVar.f294201f || uVar.f294199d) {
                if (!m82243x4c758783) {
                    return uVar;
                }
                this.f39770x4302971c.f294183a.f294182a = _index;
                this.f39770x4302971c.f294184b = uVar;
                jm5.b.b(TAG, "%s waiting %s", this, _index);
                long nanoTime = java.lang.System.nanoTime();
                try {
                    uVar.f294198c.wait();
                } catch (java.lang.InterruptedException unused) {
                }
                jm5.b.b(TAG, "%s waiting duration %s", this, java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
                com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.l lVar = this.f39770x4302971c;
                lVar.f294183a.f294182a = null;
                lVar.f294184b = null;
            }
            return uVar;
        }
    }

    /* renamed from: getAsync */
    private _Struct m82235x742aa8c6(_Index _index) {
        if (m82253x1e33e91b(_index)) {
            return null;
        }
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u m82251xfb822da1 = m82251xfb822da1(_index);
        if (m82243x4c758783(m82251xfb822da1, _index) && !m82251xfb822da1.f294199d) {
            return (_Struct) m82251xfb822da1.f294197b;
        }
        return null;
    }

    /* renamed from: getSync */
    private _Struct m82236xfb858311(_Index _index) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != this.f39777x75e34f66 && myLooper != this.f39780xfef39261) {
            throw new java.lang.IllegalAccessError("Call from wrong looper");
        }
        if (this.f39767x4f5e0dee.get()) {
            return null;
        }
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u m82251xfb822da1 = m82251xfb822da1(_index);
        if (m82253x1e33e91b(_index)) {
            return (_Struct) m82251xfb822da1.f294197b;
        }
        if (myLooper == this.f39777x75e34f66) {
            return (_Struct) m82234x1450ac4c(m82251xfb822da1, _index).f294197b;
        }
        m82237xb47d514d(m82251xfb822da1, _index);
        return (_Struct) m82251xfb822da1.f294197b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadFromVending */
    public boolean m82237xb47d514d(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u uVar, _Index _index) {
        synchronized (uVar.f294198c) {
            if (uVar.f294201f && !uVar.f294199d && !uVar.f294200e) {
                return true;
            }
            this.f39775x64b8afd4 = true;
            _Struct mo82268xc1e33854 = mo82268xc1e33854(_index);
            this.f39775x64b8afd4 = false;
            if (uVar.f294202g) {
                return false;
            }
            m82238x2e9e8a43(uVar, _index, mo82268xc1e33854);
            return false;
        }
    }

    /* renamed from: lockResolved */
    private void m82238x2e9e8a43(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u uVar, _Index _index, _Struct _struct) {
        uVar.f294197b = _struct;
        uVar.f294196a = _index;
        uVar.f294199d = false;
        uVar.f294200e = false;
        uVar.f294201f = true;
        if (this.f39770x4302971c.f294184b == uVar) {
            uVar.f294203h = true;
        }
        uVar.f294198c.notify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyDataLoadedIfNeed */
    public void m82239x3000b5eb(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u uVar) {
        if (uVar.f294203h) {
            uVar.f294203h = false;
        } else {
            android.os.Handler handler = this.f39776x5af664d5;
            handler.sendMessage(handler.obtainMessage(1, uVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onDataResolved */
    public void m82241xb0065141(_Index _index, _Struct _struct) {
        if (this.f39767x4f5e0dee.get() || this.f39769x2f872434 == null) {
            return;
        }
        fm5.d dVar = this.f39769x2f872434;
        nm5.a b17 = nm5.j.b(_index);
        synchronized (dVar) {
            dVar.v(b17);
        }
    }

    /* renamed from: refillImpl */
    private void m82242x1c3a7d76(_Index _index, boolean z17) {
        m82255xb65e4158();
        if (this.f39767x4f5e0dee.get()) {
            return;
        }
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u m82251xfb822da1 = m82251xfb822da1(_index);
        synchronized (m82251xfb822da1.f294198c) {
            if (m82251xfb822da1.f294201f) {
                if (z17) {
                    m82251xfb822da1.f294199d = true;
                } else {
                    m82251xfb822da1.f294200e = true;
                }
            }
        }
        m82235x742aa8c6(_index);
    }

    /* renamed from: requestIndex */
    private boolean m82243x4c758783(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u uVar, _Index _index) {
        if (m82253x1e33e91b(_index)) {
            return false;
        }
        if (this.f39767x4f5e0dee.get()) {
            jm5.b.a(TAG, "Vending.destroyed() has called.", new java.lang.Object[0]);
            return false;
        }
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.r rVar = this.f39773xe0156e0;
        if (!rVar.f294191c.get()) {
            synchronized (rVar.f294192d) {
                rVar.f294189a.put(_index, com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.q.PENDING);
            }
            android.os.Handler handler = rVar.f294193e;
            handler.sendMessageAtFrontOfQueue(handler.obtainMessage(0, _index));
        }
        m82267x7fb2e443(uVar, _index);
        return true;
    }

    /* renamed from: addVendingDataChangedCallback */
    public fm5.b m82244x32f9d333(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.m mVar) {
        fm5.d dVar = this.f39768xe37f4062;
        dVar.getClass();
        fm5.b bVar = new fm5.b(mVar, dVar);
        synchronized (dVar) {
            dVar.f345714d.add(bVar);
        }
        return bVar;
    }

    /* renamed from: addVendingDataResolvedCallback */
    public fm5.b m82245xcf5eeb83(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.n nVar) {
        fm5.d dVar = this.f39769x2f872434;
        dVar.getClass();
        fm5.b bVar = new fm5.b(nVar, dVar);
        synchronized (dVar) {
            dVar.f345714d.add(bVar);
        }
        return bVar;
    }

    /* renamed from: applyChangeSynchronized */
    public abstract void mo82246x601264f2(_Change _change);

    @Override // im5.a
    /* renamed from: dead */
    public final void mo10668x2efc64() {
        m82255xb65e4158();
        jm5.b.b(TAG, "Vending.destroy()", new java.lang.Object[0]);
        this.f39767x4f5e0dee.set(true);
        this.f39779xf3ee813a.removeCallbacksAndMessages(null);
        this.f39776x5af664d5.removeCallbacksAndMessages(null);
        this.f39773xe0156e0.f294191c.set(true);
        this.f39773xe0156e0.a();
        android.os.Handler handler = this.f39779xf3ee813a;
        handler.sendMessage(handler.obtainMessage(2));
    }

    /* renamed from: defer */
    public com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.t m82247x5b0a372(_Index _index) {
        m82257x97d7bcab();
        if (!this.f39775x64b8afd4) {
            jm5.b.c(TAG, "Please call defer in resolveAsynchronous()", new java.lang.Object[0]);
            return null;
        }
        m82251xfb822da1(_index).f294202g = true;
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.t tVar = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.t(this, _index);
        this.f39778x5ba37292.add(tVar);
        return tVar;
    }

    /* renamed from: destroyAsynchronous */
    public abstract void mo82248x7abbb162();

    /* renamed from: freezeDataChange */
    public void m82249x29da0df1() {
        if (this.f39767x4f5e0dee.get()) {
            return;
        }
        synchronized (this.f39774x28dbbb4f) {
            this.f39771x4ff1d87e = true;
        }
    }

    public <T> T get(_Index _index) {
        return m82236xfb858311(_index);
    }

    /* renamed from: getLoader */
    public com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.r m82250x23ac5309() {
        return this.f39773xe0156e0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getLock */
    public com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u m82251xfb822da1(_Index _index) {
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u uVar;
        synchronized (this.f39766x884cba01) {
            uVar = (com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u) this.f39765xbdc9bdec.get(_index);
            if (uVar == null) {
                uVar = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u();
                this.f39765xbdc9bdec.put(_index, uVar);
            }
        }
        return uVar;
    }

    /* renamed from: getLooper */
    public android.os.Looper m82252x23b2dd47() {
        return this.f39780xfef39261;
    }

    /* renamed from: invalidIndex */
    public boolean m82253x1e33e91b(_Index _index) {
        return false;
    }

    /* renamed from: loaderClear */
    public void m82254x2377a9fa() {
    }

    /* renamed from: looperCheckBoth */
    public void m82255xb65e4158() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != this.f39777x75e34f66 && myLooper != this.f39780xfef39261) {
            throw new java.lang.IllegalAccessError("Call from wrong looper");
        }
    }

    /* renamed from: looperCheckForSubscriber */
    public void m82256xb2e42a1a() {
        if (android.os.Looper.myLooper() != this.f39777x75e34f66) {
            throw new java.lang.IllegalAccessError("Call from wrong looper");
        }
    }

    /* renamed from: looperCheckForVending */
    public void m82257x97d7bcab() {
        if (android.os.Looper.myLooper() != this.f39780xfef39261) {
            throw new java.lang.IllegalAccessError("Call from wrong looper");
        }
    }

    /* renamed from: notifyVendingDataChange */
    public void mo82258x6661d4ae() {
        m82240x6661d4ae(false);
    }

    /* renamed from: notifyVendingDataChangeSynchronize */
    public void mo82259xbf68dfc2() {
        m82240x6661d4ae(true);
    }

    /* renamed from: peek */
    public <T> T m82260x34715b(_Index _index) {
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u m82261x3ba8526;
        if (this.f39767x4f5e0dee.get() || m82253x1e33e91b(_index) || (m82261x3ba8526 = m82261x3ba8526(_index)) == null || m82261x3ba8526.f294199d) {
            return null;
        }
        return (T) m82261x3ba8526.f294197b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: peekLock */
    public com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u m82261x3ba8526(_Index _index) {
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u uVar;
        synchronized (this.f39766x884cba01) {
            uVar = (com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u) this.f39765xbdc9bdec.get(_index);
        }
        return uVar;
    }

    /* renamed from: prepareVendingDataAsynchronous */
    public abstract _Change mo82262x133e6348();

    /* renamed from: removeVendingDataChangedCallback */
    public void m82263xcc346d56(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.m mVar) {
        fm5.d dVar = this.f39768xe37f4062;
        dVar.getClass();
        fm5.b bVar = new fm5.b(mVar, dVar);
        synchronized (dVar) {
            dVar.f345714d.remove(bVar);
        }
    }

    /* renamed from: removeVendingDataResolvedCallback */
    public void m82264x5d7795c0(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.n nVar) {
        fm5.d dVar = this.f39769x2f872434;
        dVar.getClass();
        fm5.b bVar = new fm5.b(nVar, dVar);
        synchronized (dVar) {
            dVar.f345714d.remove(bVar);
        }
    }

    /* renamed from: request */
    public void m82265x414ef28f(_Index _index) {
        m82242x1c3a7d76(_index, false);
    }

    /* renamed from: requestConsistent */
    public void m82266x2d529a81(_Index _index) {
        m82242x1c3a7d76(_index, true);
    }

    /* renamed from: requestIndexImpl */
    public void m82267x7fb2e443(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u uVar, _Index _index) {
    }

    /* renamed from: resolveAsynchronous */
    public abstract _Struct mo82268xc1e33854(_Index _index);

    /* renamed from: resolvedClear */
    public void m82269xa09c535() {
        m82255xb65e4158();
        if (this.f39767x4f5e0dee.get()) {
            return;
        }
        this.f39781x69c4b6ab.a(3, null);
    }

    /* renamed from: synchronizing */
    public void m82270x6a1b2e0d(int i17, java.lang.Object obj) {
    }

    /* renamed from: unfreezeDataChange */
    public void m82271xa983ca8a() {
        if (this.f39767x4f5e0dee.get()) {
            return;
        }
        synchronized (this.f39774x28dbbb4f) {
            this.f39771x4ff1d87e = false;
            if (this.f39772x79504d84) {
                mo82258x6661d4ae();
                this.f39772x79504d84 = false;
            }
        }
    }

    public AbstractC22733x77ee84fd(android.os.Looper looper) {
        this.f39767x4f5e0dee = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f39766x884cba01 = new byte[0];
        this.f39774x28dbbb4f = new byte[0];
        this.f39772x79504d84 = false;
        this.f39771x4ff1d87e = false;
        this.f39770x4302971c = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.l(null);
        lm5.j jVar = lm5.d.f401133a;
        this.f39768xe37f4062 = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.b(this, jVar);
        this.f39769x2f872434 = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.c(this, jVar);
        this.f39765xbdc9bdec = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.s();
        this.f39778x5ba37292 = new java.util.HashSet<>();
        this.f39775x64b8afd4 = false;
        this.f39777x75e34f66 = looper;
        android.os.Looper looper2 = mm5.b.f411231b.f411232a.getLooper();
        this.f39780xfef39261 = looper2;
        this.f39765xbdc9bdec.f294194d = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.d(this);
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.y yVar = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.y(this.f39777x75e34f66, looper2);
        this.f39781x69c4b6ab = yVar;
        yVar.f294211f = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.e(this);
        this.f39776x5af664d5 = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.f(this, this.f39777x75e34f66);
        this.f39779xf3ee813a = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.g(this, this.f39780xfef39261);
        this.f39773xe0156e0 = new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.r(this.f39780xfef39261, new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.h(this));
    }

    /* renamed from: notifyVendingDataChange */
    private void m82240x6661d4ae(boolean z17) {
        if (this.f39767x4f5e0dee.get()) {
            return;
        }
        if (android.os.Looper.myLooper() != this.f39777x75e34f66 && android.os.Looper.myLooper() != this.f39780xfef39261) {
            throw new java.lang.IllegalAccessError("Call from wrong thread");
        }
        if (z17) {
            this.f39781x69c4b6ab.a(2, null);
            return;
        }
        synchronized (this.f39774x28dbbb4f) {
            if (this.f39771x4ff1d87e) {
                this.f39772x79504d84 = true;
                return;
            }
            if (android.os.Looper.myLooper() == this.f39780xfef39261) {
                m82231xe72d15de();
                return;
            }
            this.f39779xf3ee813a.removeMessages(1);
            android.os.Handler handler = this.f39779xf3ee813a;
            handler.sendMessage(handler.obtainMessage(1));
            this.f39779xf3ee813a.post(new com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.i(this));
        }
    }
}
