package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public abstract class g0 {

    /* renamed from: NOT_SET */
    static final java.lang.Object f3538xa9c10cb6 = new java.lang.Object();

    /* renamed from: START_VERSION */
    static final int f3539x5b21b9bb = -1;

    /* renamed from: mActiveCount */
    int f3540x69d666fc;

    /* renamed from: mChangingActiveState */
    private boolean f3541x4fea64d1;

    /* renamed from: mData */
    private volatile java.lang.Object f3542x62065b7;

    /* renamed from: mDataLock */
    final java.lang.Object f3543x8f9ceb82;

    /* renamed from: mDispatchInvalidated */
    private boolean f3544xb938b802;

    /* renamed from: mDispatchingValue */
    private boolean f3545xf1f9bb6;

    /* renamed from: mObservers */
    private q.h f3546xfeda5270;

    /* renamed from: mPendingData */
    volatile java.lang.Object f3547xec615b34;

    /* renamed from: mPostValueRunnable */
    private final java.lang.Runnable f3548xa02bea01;

    /* renamed from: mVersion */
    private int f3549xb30dcfab;

    public g0(java.lang.Object obj) {
        this.f3543x8f9ceb82 = new java.lang.Object();
        this.f3546xfeda5270 = new q.h();
        this.f3540x69d666fc = 0;
        this.f3547xec615b34 = f3538xa9c10cb6;
        this.f3548xa02bea01 = new p012xc85e97e9.p093xedfae76a.d0(this);
        this.f3542x62065b7 = obj;
        this.f3549xb30dcfab = 0;
    }

    /* renamed from: assertMainThread */
    public static void m7800xde798109(java.lang.String str) {
        ((p.d) p.b.a().f431868a).getClass();
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            return;
        }
        throw new java.lang.IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void a(p012xc85e97e9.p093xedfae76a.f0 f0Var) {
        if (f0Var.f93157e) {
            if (!f0Var.d()) {
                f0Var.a(false);
                return;
            }
            int i17 = f0Var.f93158f;
            int i18 = this.f3549xb30dcfab;
            if (i17 >= i18) {
                return;
            }
            f0Var.f93158f = i18;
            f0Var.f93156d.mo525x7bb163d5(this.f3542x62065b7);
        }
    }

    /* renamed from: changeActiveCounter */
    public void m7801x47643646(int i17) {
        int i18 = this.f3540x69d666fc;
        this.f3540x69d666fc = i17 + i18;
        if (this.f3541x4fea64d1) {
            return;
        }
        this.f3541x4fea64d1 = true;
        while (true) {
            try {
                int i19 = this.f3540x69d666fc;
                if (i18 == i19) {
                    return;
                }
                boolean z17 = i18 == 0 && i19 > 0;
                boolean z18 = i18 > 0 && i19 == 0;
                if (z17) {
                    mo520x3a2455c5();
                } else if (z18) {
                    mo521xa6927f6a();
                }
                i18 = i19;
            } finally {
                this.f3541x4fea64d1 = false;
            }
        }
    }

    /* renamed from: dispatchingValue */
    public void m7802xe907d129(p012xc85e97e9.p093xedfae76a.f0 f0Var) {
        if (this.f3545xf1f9bb6) {
            this.f3544xb938b802 = true;
            return;
        }
        this.f3545xf1f9bb6 = true;
        do {
            this.f3544xb938b802 = false;
            if (f0Var != null) {
                a(f0Var);
                f0Var = null;
            } else {
                q.h hVar = this.f3546xfeda5270;
                hVar.getClass();
                q.e eVar = new q.e(hVar);
                hVar.f440746f.put(eVar, java.lang.Boolean.FALSE);
                while (eVar.hasNext()) {
                    a((p012xc85e97e9.p093xedfae76a.f0) ((java.util.Map.Entry) eVar.next()).getValue());
                    if (this.f3544xb938b802) {
                        break;
                    }
                }
            }
        } while (this.f3544xb938b802);
        this.f3545xf1f9bb6 = false;
    }

    /* renamed from: getValue */
    public java.lang.Object mo3195x754a37bb() {
        java.lang.Object obj = this.f3542x62065b7;
        if (obj != f3538xa9c10cb6) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: getVersion */
    public int m7803x52c258a2() {
        return this.f3549xb30dcfab;
    }

    /* renamed from: hasActiveObservers */
    public boolean m7804x22d78dfd() {
        return this.f3540x69d666fc > 0;
    }

    /* renamed from: hasObservers */
    public boolean m7805x4365e2e3() {
        return this.f3546xfeda5270.f440747g > 0;
    }

    /* renamed from: observe */
    public void mo7806x9d92d11c(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.k0 k0Var) {
        m7800xde798109("observe");
        if (yVar.mo273xed6858b4().b() == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            return;
        }
        p012xc85e97e9.p093xedfae76a.C1119x111ffcd8 c1119x111ffcd8 = new p012xc85e97e9.p093xedfae76a.C1119x111ffcd8(this, yVar, k0Var);
        p012xc85e97e9.p093xedfae76a.f0 f0Var = (p012xc85e97e9.p093xedfae76a.f0) this.f3546xfeda5270.e(k0Var, c1119x111ffcd8);
        if (f0Var != null && !f0Var.c(yVar)) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f0Var != null) {
            return;
        }
        yVar.mo273xed6858b4().a(c1119x111ffcd8);
    }

    /* renamed from: observeForever */
    public void mo7807xc74540ab(p012xc85e97e9.p093xedfae76a.k0 k0Var) {
        m7800xde798109("observeForever");
        p012xc85e97e9.p093xedfae76a.e0 e0Var = new p012xc85e97e9.p093xedfae76a.e0(this, k0Var);
        p012xc85e97e9.p093xedfae76a.f0 f0Var = (p012xc85e97e9.p093xedfae76a.f0) this.f3546xfeda5270.e(k0Var, e0Var);
        if (f0Var instanceof p012xc85e97e9.p093xedfae76a.C1119x111ffcd8) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f0Var != null) {
            return;
        }
        e0Var.a(true);
    }

    /* renamed from: onActive */
    public void mo520x3a2455c5() {
    }

    /* renamed from: onInactive */
    public void mo521xa6927f6a() {
    }

    /* renamed from: postValue */
    public void mo7808x76db6cb1(java.lang.Object obj) {
        boolean z17;
        synchronized (this.f3543x8f9ceb82) {
            z17 = this.f3547xec615b34 == f3538xa9c10cb6;
            this.f3547xec615b34 = obj;
        }
        if (z17) {
            p.b.a().b(this.f3548xa02bea01);
        }
    }

    /* renamed from: removeObserver */
    public void mo522xb5bdeb7a(p012xc85e97e9.p093xedfae76a.k0 k0Var) {
        m7800xde798109("removeObserver");
        p012xc85e97e9.p093xedfae76a.f0 f0Var = (p012xc85e97e9.p093xedfae76a.f0) this.f3546xfeda5270.g(k0Var);
        if (f0Var == null) {
            return;
        }
        f0Var.b();
        f0Var.a(false);
    }

    /* renamed from: removeObservers */
    public void m7809x1ff8439(p012xc85e97e9.p093xedfae76a.y yVar) {
        m7800xde798109("removeObservers");
        java.util.Iterator it = this.f3546xfeda5270.iterator();
        while (true) {
            q.f fVar = (q.f) it;
            if (!fVar.hasNext()) {
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) fVar.next();
            if (((p012xc85e97e9.p093xedfae76a.f0) entry.getValue()).c(yVar)) {
                mo522xb5bdeb7a((p012xc85e97e9.p093xedfae76a.k0) entry.getKey());
            }
        }
    }

    /* renamed from: setValue */
    public void mo523x53d8522f(java.lang.Object obj) {
        m7800xde798109("setValue");
        this.f3549xb30dcfab++;
        this.f3542x62065b7 = obj;
        m7802xe907d129(null);
    }

    public g0() {
        this.f3543x8f9ceb82 = new java.lang.Object();
        this.f3546xfeda5270 = new q.h();
        this.f3540x69d666fc = 0;
        java.lang.Object obj = f3538xa9c10cb6;
        this.f3547xec615b34 = obj;
        this.f3548xa02bea01 = new p012xc85e97e9.p093xedfae76a.d0(this);
        this.f3542x62065b7 = obj;
        this.f3549xb30dcfab = -1;
    }
}
