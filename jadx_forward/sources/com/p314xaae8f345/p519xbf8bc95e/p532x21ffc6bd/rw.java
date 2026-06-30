package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class rw implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCameraChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f132819a;

    /* renamed from: c, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu f132821c;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv f132822d = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f132820b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: com.tencent.mapsdk.internal.rw$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.lang.Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d == null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132819a, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132821c);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d.start();
                } else {
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d.isAlive()) {
                        return;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d.a();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132819a, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132821c);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d.start();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132819a.K).e(com.tencent.mapsdk.internal.la.a.f131799g, "start service error", e17);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.rw$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass5 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt f132827a;

        public AnonymousClass5(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt rtVar) {
            this.f132827a = rtVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f132827a == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d == null) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv rvVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt rtVar = this.f132827a;
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt> list = rvVar.f132810b;
            if (list == null || rtVar == null) {
                return;
            }
            list.add(rtVar);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.rw$6, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass6 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt f132829a;

        public AnonymousClass6(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt rtVar) {
            this.f132829a = rtVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f132829a == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d == null) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv rvVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt rtVar = this.f132829a;
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt> list = rvVar.f132810b;
            if (list == null || rtVar == null) {
                return;
            }
            list.remove(rtVar);
        }
    }

    public rw(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu luVar) {
        this.f132819a = null;
        this.f132819a = neVar;
        this.f132821c = luVar;
    }

    private void d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132819a;
        if (neVar == null) {
            return;
        }
        neVar.f132041h.a(this);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(this.f132819a.K).c(com.tencent.mapsdk.internal.la.a.f131799g, "open traffic");
        this.f132820b.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.AnonymousClass1());
    }

    private void e() {
        this.f132820b.removeCallbacksAndMessages(null);
        c();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCameraChangeListener
    /* renamed from: onCameraChange */
    public final void mo36952x21a09eb4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv rvVar = this.f132822d;
        if (rvVar != null) {
            synchronized (rvVar) {
                this.f132822d.notify();
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCameraChangeListener
    /* renamed from: onCameraChangeFinished */
    public final void mo36953xd9f3cf46(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq
    public final void u() {
        this.f132820b.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.rw.7
            @Override // java.lang.Runnable
            public final void run() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d != null) {
                    synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d.notify();
                    }
                }
            }
        });
    }

    public final void b() {
        this.f132820b.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.rw.3
            @Override // java.lang.Runnable
            public final void run() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv rvVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d;
                    rvVar.f132809a = false;
                    synchronized (rvVar) {
                        rvVar.notifyAll();
                    }
                }
            }
        });
        u();
    }

    public final void c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132819a;
        if (neVar == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(neVar.K).c(com.tencent.mapsdk.internal.la.a.f131799g, "close traffic");
        this.f132819a.f132041h.b(this);
        this.f132820b.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.rw.4
            @Override // java.lang.Runnable
            public final void run() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d.a();
                }
            }
        });
    }

    public final void a() {
        this.f132820b.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.rw.2
            @Override // java.lang.Runnable
            public final void run() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv rvVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.this.f132822d;
                    rvVar.f132809a = true;
                    synchronized (rvVar) {
                        rvVar.notifyAll();
                    }
                }
            }
        });
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt rtVar) {
        this.f132820b.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.AnonymousClass5(rtVar));
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt rtVar) {
        this.f132820b.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.AnonymousClass6(rtVar));
    }
}
