package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class rw implements com.tencent.mapsdk.internal.fq, com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ne f51286a;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.lu f51288c;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mapsdk.internal.rv f51289d = null;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f51287b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: com.tencent.mapsdk.internal.rw$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.lang.Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (com.tencent.mapsdk.internal.rw.this.f51289d == null) {
                    com.tencent.mapsdk.internal.rw.this.f51289d = new com.tencent.mapsdk.internal.rv(com.tencent.mapsdk.internal.rw.this.f51286a, com.tencent.mapsdk.internal.rw.this.f51288c);
                    com.tencent.mapsdk.internal.rw.this.f51289d.start();
                } else {
                    if (com.tencent.mapsdk.internal.rw.this.f51289d.isAlive()) {
                        return;
                    }
                    com.tencent.mapsdk.internal.rw.this.f51289d.a();
                    com.tencent.mapsdk.internal.rw.this.f51289d = new com.tencent.mapsdk.internal.rv(com.tencent.mapsdk.internal.rw.this.f51286a, com.tencent.mapsdk.internal.rw.this.f51288c);
                    com.tencent.mapsdk.internal.rw.this.f51289d.start();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mapsdk.core.utils.log.LogUtil.a(com.tencent.mapsdk.internal.rw.this.f51286a.K).e(com.tencent.mapsdk.internal.la.a.f50266g, "start service error", e17);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.rw$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass5 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.rt f51294a;

        public AnonymousClass5(com.tencent.mapsdk.internal.rt rtVar) {
            this.f51294a = rtVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f51294a == null || com.tencent.mapsdk.internal.rw.this.f51289d == null) {
                return;
            }
            com.tencent.mapsdk.internal.rv rvVar = com.tencent.mapsdk.internal.rw.this.f51289d;
            com.tencent.mapsdk.internal.rt rtVar = this.f51294a;
            java.util.List<com.tencent.mapsdk.internal.rt> list = rvVar.f51277b;
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
        final /* synthetic */ com.tencent.mapsdk.internal.rt f51296a;

        public AnonymousClass6(com.tencent.mapsdk.internal.rt rtVar) {
            this.f51296a = rtVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f51296a == null || com.tencent.mapsdk.internal.rw.this.f51289d == null) {
                return;
            }
            com.tencent.mapsdk.internal.rv rvVar = com.tencent.mapsdk.internal.rw.this.f51289d;
            com.tencent.mapsdk.internal.rt rtVar = this.f51296a;
            java.util.List<com.tencent.mapsdk.internal.rt> list = rvVar.f51277b;
            if (list == null || rtVar == null) {
                return;
            }
            list.remove(rtVar);
        }
    }

    public rw(com.tencent.mapsdk.internal.ne neVar, com.tencent.mapsdk.internal.lu luVar) {
        this.f51286a = null;
        this.f51286a = neVar;
        this.f51288c = luVar;
    }

    private void d() {
        com.tencent.mapsdk.internal.ne neVar = this.f51286a;
        if (neVar == null) {
            return;
        }
        neVar.f50508h.a(this);
        com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f51286a.K).c(com.tencent.mapsdk.internal.la.a.f50266g, "open traffic");
        this.f51287b.post(new com.tencent.mapsdk.internal.rw.AnonymousClass1());
    }

    private void e() {
        this.f51287b.removeCallbacksAndMessages(null);
        c();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener
    public final void onCameraChange(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        com.tencent.mapsdk.internal.rv rvVar = this.f51289d;
        if (rvVar != null) {
            synchronized (rvVar) {
                this.f51289d.notify();
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener
    public final void onCameraChangeFinished(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
    }

    @Override // com.tencent.mapsdk.internal.fq
    public final void u() {
        this.f51287b.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.rw.7
            @Override // java.lang.Runnable
            public final void run() {
                if (com.tencent.mapsdk.internal.rw.this.f51289d != null) {
                    synchronized (com.tencent.mapsdk.internal.rw.this.f51289d) {
                        com.tencent.mapsdk.internal.rw.this.f51289d.notify();
                    }
                }
            }
        });
    }

    public final void b() {
        this.f51287b.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.rw.3
            @Override // java.lang.Runnable
            public final void run() {
                if (com.tencent.mapsdk.internal.rw.this.f51289d != null) {
                    com.tencent.mapsdk.internal.rv rvVar = com.tencent.mapsdk.internal.rw.this.f51289d;
                    rvVar.f51276a = false;
                    synchronized (rvVar) {
                        rvVar.notifyAll();
                    }
                }
            }
        });
        u();
    }

    public final void c() {
        com.tencent.mapsdk.internal.ne neVar = this.f51286a;
        if (neVar == null) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.a(neVar.K).c(com.tencent.mapsdk.internal.la.a.f50266g, "close traffic");
        this.f51286a.f50508h.b(this);
        this.f51287b.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.rw.4
            @Override // java.lang.Runnable
            public final void run() {
                if (com.tencent.mapsdk.internal.rw.this.f51289d != null) {
                    com.tencent.mapsdk.internal.rw.this.f51289d.a();
                }
            }
        });
    }

    public final void a() {
        this.f51287b.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.rw.2
            @Override // java.lang.Runnable
            public final void run() {
                if (com.tencent.mapsdk.internal.rw.this.f51289d != null) {
                    com.tencent.mapsdk.internal.rv rvVar = com.tencent.mapsdk.internal.rw.this.f51289d;
                    rvVar.f51276a = true;
                    synchronized (rvVar) {
                        rvVar.notifyAll();
                    }
                }
            }
        });
    }

    private void a(com.tencent.mapsdk.internal.rt rtVar) {
        this.f51287b.post(new com.tencent.mapsdk.internal.rw.AnonymousClass5(rtVar));
    }

    private void b(com.tencent.mapsdk.internal.rt rtVar) {
        this.f51287b.post(new com.tencent.mapsdk.internal.rw.AnonymousClass6(rtVar));
    }
}
