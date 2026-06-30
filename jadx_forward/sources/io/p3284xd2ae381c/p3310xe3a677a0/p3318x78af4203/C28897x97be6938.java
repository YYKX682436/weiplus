package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.InstanceManager */
/* loaded from: classes13.dex */
public class C28897x97be6938 {

    /* renamed from: CLEAR_FINALIZED_WEAK_REFERENCES_INTERVAL */
    private static final long f72067x4f13fee0 = 3000;

    /* renamed from: MIN_HOST_CREATED_IDENTIFIER */
    private static final long f72068xadfff76a = 65536;
    private static final java.lang.String TAG = "InstanceManager";

    /* renamed from: finalizationListener */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938.FinalizationListener f72069x37ecad02;

    /* renamed from: handler */
    private final android.os.Handler f72070x294b574a;

    /* renamed from: hasFinalizationListenerStopped */
    private boolean f72071x25c0bb71;

    /* renamed from: nextIdentifier */
    private long f72073x503f3ffc;

    /* renamed from: identifiers */
    private final java.util.WeakHashMap<java.lang.Object, java.lang.Long> f72072x518ce8ea = new java.util.WeakHashMap<>();

    /* renamed from: weakInstances */
    private final java.util.HashMap<java.lang.Long, java.lang.ref.WeakReference<java.lang.Object>> f72076xe68665e6 = new java.util.HashMap<>();

    /* renamed from: strongInstances */
    private final java.util.HashMap<java.lang.Long, java.lang.Object> f72075xff6f21a7 = new java.util.HashMap<>();

    /* renamed from: referenceQueue */
    private final java.lang.ref.ReferenceQueue<java.lang.Object> f72074x8dfbc086 = new java.lang.ref.ReferenceQueue<>();

    /* renamed from: weakReferencesToIdentifiers */
    private final java.util.HashMap<java.lang.ref.WeakReference<java.lang.Object>, java.lang.Long> f72077x48d36b2f = new java.util.HashMap<>();

    /* renamed from: io.flutter.plugins.webviewflutter.InstanceManager$FinalizationListener */
    /* loaded from: classes13.dex */
    public interface FinalizationListener {
        /* renamed from: onFinalize */
        void mo139294x7c7eff1d(long j17);
    }

    private C28897x97be6938(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938.FinalizationListener finalizationListener) {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f72070x294b574a = handler;
        this.f72073x503f3ffc = 65536L;
        this.f72071x25c0bb71 = false;
        this.f72069x37ecad02 = finalizationListener;
        handler.postDelayed(new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.RunnableC28898x9756f7a9(this), f72067x4f13fee0);
    }

    /* renamed from: addInstance */
    private void m139281xe7044056(java.lang.Object obj, long j17) {
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Identifier must be >= 0: %d", java.lang.Long.valueOf(j17)));
        }
        if (this.f72076xe68665e6.containsKey(java.lang.Long.valueOf(j17))) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Identifier has already been added: %d", java.lang.Long.valueOf(j17)));
        }
        java.lang.ref.WeakReference<java.lang.Object> weakReference = new java.lang.ref.WeakReference<>(obj, this.f72074x8dfbc086);
        this.f72072x518ce8ea.put(obj, java.lang.Long.valueOf(j17));
        this.f72076xe68665e6.put(java.lang.Long.valueOf(j17), weakReference);
        this.f72077x48d36b2f.put(weakReference, java.lang.Long.valueOf(j17));
        this.f72075xff6f21a7.put(java.lang.Long.valueOf(j17), obj);
    }

    /* renamed from: create */
    public static io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 m139282xaf65a0fc(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938.FinalizationListener finalizationListener) {
        return new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938(finalizationListener);
    }

    /* renamed from: logWarningIfFinalizationListenerHasStopped */
    private void m139283xa925e0ca() {
        m139291x25c0bb71();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: releaseAllFinalizedInstances */
    public void m139284x95deced2() {
        if (m139291x25c0bb71()) {
            return;
        }
        while (true) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f72074x8dfbc086.poll();
            if (weakReference == null) {
                this.f72070x294b574a.postDelayed(new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.RunnableC28898x9756f7a9(this), f72067x4f13fee0);
                return;
            }
            java.lang.Long remove = this.f72077x48d36b2f.remove(weakReference);
            if (remove != null) {
                this.f72076xe68665e6.remove(remove);
                this.f72075xff6f21a7.remove(remove);
                this.f72069x37ecad02.mo139294x7c7eff1d(remove.longValue());
            }
        }
    }

    /* renamed from: addDartCreatedInstance */
    public void m139285xa3622bbd(java.lang.Object obj, long j17) {
        m139283xa925e0ca();
        m139281xe7044056(obj, j17);
    }

    /* renamed from: addHostCreatedInstance */
    public long m139286xeaafee74(java.lang.Object obj) {
        m139283xa925e0ca();
        if (m139288x591dfd4(obj)) {
            throw new java.lang.IllegalArgumentException("Instance of " + obj.getClass() + " has already been added.");
        }
        long j17 = this.f72073x503f3ffc;
        this.f72073x503f3ffc = 1 + j17;
        m139281xe7044056(obj, j17);
        return j17;
    }

    /* renamed from: clear */
    public void m139287x5a5b64d() {
        this.f72072x518ce8ea.clear();
        this.f72076xe68665e6.clear();
        this.f72075xff6f21a7.clear();
        this.f72077x48d36b2f.clear();
    }

    /* renamed from: containsInstance */
    public boolean m139288x591dfd4(java.lang.Object obj) {
        m139283xa925e0ca();
        return this.f72072x518ce8ea.containsKey(obj);
    }

    /* renamed from: getIdentifierForStrongReference */
    public java.lang.Long m139289x102c196a(java.lang.Object obj) {
        m139283xa925e0ca();
        java.lang.Long l17 = this.f72072x518ce8ea.get(obj);
        if (l17 != null) {
            this.f72075xff6f21a7.put(l17, obj);
        }
        return l17;
    }

    /* renamed from: getInstance */
    public <T> T m139290x9cf0d20b(long j17) {
        m139283xa925e0ca();
        java.lang.ref.WeakReference<java.lang.Object> weakReference = this.f72076xe68665e6.get(java.lang.Long.valueOf(j17));
        if (weakReference != null) {
            return (T) weakReference.get();
        }
        return null;
    }

    /* renamed from: hasFinalizationListenerStopped */
    public boolean m139291x25c0bb71() {
        return this.f72071x25c0bb71;
    }

    /* renamed from: remove */
    public <T> T m139292xc84af884(long j17) {
        m139283xa925e0ca();
        return (T) this.f72075xff6f21a7.remove(java.lang.Long.valueOf(j17));
    }

    /* renamed from: stopFinalizationListener */
    public void m139293xedc5d424() {
        this.f72070x294b574a.removeCallbacks(new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.RunnableC28898x9756f7a9(this));
        this.f72071x25c0bb71 = true;
    }
}
