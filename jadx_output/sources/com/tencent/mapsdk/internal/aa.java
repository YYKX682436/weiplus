package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class aa implements com.tencent.mapsdk.internal.ba, com.tencent.mapsdk.internal.op {

    /* renamed from: a, reason: collision with root package name */
    public static final int f48752a = 60;

    /* renamed from: m, reason: collision with root package name */
    private static final int f48753m = 200;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.internal.aa.a f48756d;

    /* renamed from: f, reason: collision with root package name */
    com.tencent.mapsdk.internal.jp f48758f;

    /* renamed from: g, reason: collision with root package name */
    long f48759g;

    /* renamed from: h, reason: collision with root package name */
    boolean f48760h;

    /* renamed from: i, reason: collision with root package name */
    com.tencent.mapsdk.internal.fq f48761i;

    /* renamed from: j, reason: collision with root package name */
    boolean f48762j;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList<com.tencent.mapsdk.internal.jm> f48754b = new java.util.ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f48755c = new byte[0];

    /* renamed from: k, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.jm> f48763k = new java.util.ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mapsdk.internal.jm> f48764l = new java.util.ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public int f48757e = 60;

    /* loaded from: classes13.dex */
    public static class a extends java.lang.Thread {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference<com.tencent.mapsdk.internal.aa> f48765a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f48766b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f48767c;

        public a(com.tencent.mapsdk.internal.aa aaVar) {
            super("tms-act");
            this.f48765a = new java.lang.ref.WeakReference<>(aaVar);
        }

        public final synchronized void a() {
            this.f48767c = true;
        }

        public final synchronized void b() {
            this.f48767c = false;
        }

        @Override // java.lang.Thread
        public final synchronized void destroy() {
            this.f48766b = false;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.aa aaVar;
            while (this.f48766b && (aaVar = this.f48765a.get()) != null) {
                if (!this.f48767c) {
                    com.tencent.mapsdk.internal.jp jpVar = aaVar.f48758f;
                    if (jpVar != null) {
                        jpVar.c(com.tencent.mapsdk.internal.jm.G);
                    }
                    if (aaVar.f48760h && android.os.SystemClock.elapsedRealtime() - aaVar.f48759g > 50 && !aaVar.f48762j) {
                        aaVar.f48760h = false;
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "notify onStable");
                        com.tencent.mapsdk.internal.fq fqVar = aaVar.f48761i;
                        if (fqVar != null) {
                            fqVar.u();
                        }
                    }
                }
                try {
                    synchronized (this) {
                        wait(aaVar.c());
                    }
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        @Override // java.lang.Thread
        public final synchronized void start() {
            this.f48766b = true;
            super.start();
        }
    }

    public aa(com.tencent.mapsdk.internal.jp jpVar) {
        this.f48758f = jpVar;
        com.tencent.mapsdk.internal.jl.d(c());
    }

    private static /* synthetic */ boolean e(com.tencent.mapsdk.internal.aa aaVar) {
        aaVar.f48760h = false;
        return false;
    }

    private void h() {
        com.tencent.mapsdk.internal.aa.a aVar = this.f48756d;
        if (aVar != null) {
            aVar.destroy();
        }
        com.tencent.mapsdk.internal.aa.a aVar2 = new com.tencent.mapsdk.internal.aa.a(this);
        this.f48756d = aVar2;
        aVar2.start();
    }

    private void i() {
        com.tencent.mapsdk.internal.aa.a aVar = this.f48756d;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    private void j() {
        this.f48757e = 60;
    }

    private int k() {
        return this.f48757e;
    }

    private void l() {
    }

    private void m() {
        com.tencent.mapsdk.internal.jp jpVar = this.f48758f;
        if (jpVar != null) {
            jpVar.c(com.tencent.mapsdk.internal.jm.G);
        }
    }

    public final void a() {
        com.tencent.mapsdk.internal.aa.a aVar = this.f48756d;
        if (aVar != null) {
            aVar.a();
        }
        e();
    }

    @Override // com.tencent.mapsdk.internal.op
    public final void d() {
    }

    public final boolean g() {
        boolean isEmpty;
        synchronized (this.f48755c) {
            if (this.f48754b.isEmpty()) {
                return false;
            }
            com.tencent.mapsdk.internal.jm jmVar = this.f48754b.get(0);
            if (jmVar != null && jmVar.a(this.f48758f)) {
                synchronized (this.f48755c) {
                    this.f48754b.remove(jmVar);
                }
            }
            synchronized (this.f48755c) {
                isEmpty = this.f48754b.isEmpty();
            }
            return !isEmpty;
        }
    }

    public final void b() {
        com.tencent.mapsdk.internal.aa.a aVar = this.f48756d;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final long c() {
        long j17 = 1000 / this.f48757e;
        if (j17 == 0) {
            return 1L;
        }
        return j17;
    }

    public final void e() {
        synchronized (this.f48755c) {
            this.f48764l.clear();
            this.f48763k.clear();
            java.util.Iterator<com.tencent.mapsdk.internal.jm> it = this.f48754b.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                com.tencent.mapsdk.internal.jm next = it.next();
                if (next.D) {
                    this.f48763k.add(next);
                    z17 = true;
                } else {
                    this.f48764l.add(next);
                }
            }
            this.f48754b.clear();
            if (z17) {
                java.util.ArrayList<com.tencent.mapsdk.internal.jm> arrayList = this.f48754b;
                this.f48754b = this.f48763k;
                this.f48763k = arrayList;
            }
            if (this.f48764l.size() > 0) {
                java.util.Iterator<com.tencent.mapsdk.internal.jm> it6 = this.f48764l.iterator();
                while (it6.hasNext()) {
                    it6.next().b();
                }
            }
        }
    }

    public final boolean f() {
        boolean z17;
        synchronized (this.f48755c) {
            z17 = !this.f48754b.isEmpty();
        }
        return z17;
    }

    private void b(int i17) {
        synchronized (this.f48755c) {
            for (int size = this.f48754b.size() - 1; size >= 0; size--) {
                com.tencent.mapsdk.internal.jm jmVar = this.f48754b.get(size);
                if (jmVar.f50040z == i17) {
                    this.f48754b.remove(size);
                    jmVar.b();
                }
            }
        }
    }

    public final void a(int i17) {
        if (i17 <= 0) {
            return;
        }
        this.f48757e = i17;
    }

    private void a(com.tencent.mapsdk.internal.fq fqVar) {
        this.f48761i = fqVar;
    }

    public final void a(com.tencent.mapsdk.internal.jm jmVar) {
        synchronized (this.f48755c) {
            if (this.f48754b.size() > 200) {
                this.f48754b.clear();
            }
            this.f48754b.add(jmVar);
        }
    }

    private void a(double d17, double d18) {
        synchronized (this.f48755c) {
            while (!this.f48754b.isEmpty()) {
                java.util.ArrayList<com.tencent.mapsdk.internal.jm> arrayList = this.f48754b;
                if (arrayList.get(arrayList.size() - 1).f50040z != 3) {
                    break;
                }
                java.util.ArrayList<com.tencent.mapsdk.internal.jm> arrayList2 = this.f48754b;
                double[] dArr = arrayList2.remove(arrayList2.size() - 1).A;
                d17 += dArr[0];
                d18 += dArr[1];
            }
            a(new com.tencent.mapsdk.internal.jm(3, new double[]{d17, d18}));
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(com.tencent.mapsdk.internal.v vVar) {
        this.f48760h = true;
        this.f48759g = android.os.SystemClock.elapsedRealtime();
    }

    private void a(boolean z17) {
        this.f48762j = z17;
    }

    private static /* synthetic */ void a(com.tencent.mapsdk.internal.aa aaVar) {
        com.tencent.mapsdk.internal.jp jpVar = aaVar.f48758f;
        if (jpVar != null) {
            jpVar.c(com.tencent.mapsdk.internal.jm.G);
        }
    }
}
