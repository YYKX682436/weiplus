package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class aa implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ba, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.op {

    /* renamed from: a, reason: collision with root package name */
    public static final int f130285a = 60;

    /* renamed from: m, reason: collision with root package name */
    private static final int f130286m = 200;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.internal.aa.a f130289d;

    /* renamed from: f, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jp f130291f;

    /* renamed from: g, reason: collision with root package name */
    long f130292g;

    /* renamed from: h, reason: collision with root package name */
    boolean f130293h;

    /* renamed from: i, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq f130294i;

    /* renamed from: j, reason: collision with root package name */
    boolean f130295j;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> f130287b = new java.util.ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f130288c = new byte[0];

    /* renamed from: k, reason: collision with root package name */
    private java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> f130296k = new java.util.ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> f130297l = new java.util.ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public int f130290e = 60;

    /* loaded from: classes13.dex */
    public static class a extends java.lang.Thread {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aa> f130298a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f130299b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f130300c;

        public a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aa aaVar) {
            super("tms-act");
            this.f130298a = new java.lang.ref.WeakReference<>(aaVar);
        }

        public final synchronized void a() {
            this.f130300c = true;
        }

        public final synchronized void b() {
            this.f130300c = false;
        }

        @Override // java.lang.Thread
        public final synchronized void destroy() {
            this.f130299b = false;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aa aaVar;
            while (this.f130299b && (aaVar = this.f130298a.get()) != null) {
                if (!this.f130300c) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jp jpVar = aaVar.f130291f;
                    if (jpVar != null) {
                        jpVar.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm.G);
                    }
                    if (aaVar.f130293h && android.os.SystemClock.elapsedRealtime() - aaVar.f130292g > 50 && !aaVar.f130295j) {
                        aaVar.f130293h = false;
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "notify onStable");
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq fqVar = aaVar.f130294i;
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
            this.f130299b = true;
            super.start();
        }
    }

    public aa(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jp jpVar) {
        this.f130291f = jpVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl.d(c());
    }

    private static /* synthetic */ boolean e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aa aaVar) {
        aaVar.f130293h = false;
        return false;
    }

    private void h() {
        com.tencent.mapsdk.internal.aa.a aVar = this.f130289d;
        if (aVar != null) {
            aVar.destroy();
        }
        com.tencent.mapsdk.internal.aa.a aVar2 = new com.tencent.mapsdk.internal.aa.a(this);
        this.f130289d = aVar2;
        aVar2.start();
    }

    private void i() {
        com.tencent.mapsdk.internal.aa.a aVar = this.f130289d;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    private void j() {
        this.f130290e = 60;
    }

    private int k() {
        return this.f130290e;
    }

    private void l() {
    }

    private void m() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jp jpVar = this.f130291f;
        if (jpVar != null) {
            jpVar.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm.G);
        }
    }

    public final void a() {
        com.tencent.mapsdk.internal.aa.a aVar = this.f130289d;
        if (aVar != null) {
            aVar.a();
        }
        e();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.op
    public final void d() {
    }

    public final boolean g() {
        boolean isEmpty;
        synchronized (this.f130288c) {
            if (this.f130287b.isEmpty()) {
                return false;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm jmVar = this.f130287b.get(0);
            if (jmVar != null && jmVar.a(this.f130291f)) {
                synchronized (this.f130288c) {
                    this.f130287b.remove(jmVar);
                }
            }
            synchronized (this.f130288c) {
                isEmpty = this.f130287b.isEmpty();
            }
            return !isEmpty;
        }
    }

    public final void b() {
        com.tencent.mapsdk.internal.aa.a aVar = this.f130289d;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final long c() {
        long j17 = 1000 / this.f130290e;
        if (j17 == 0) {
            return 1L;
        }
        return j17;
    }

    public final void e() {
        synchronized (this.f130288c) {
            this.f130297l.clear();
            this.f130296k.clear();
            java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> it = this.f130287b.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm next = it.next();
                if (next.D) {
                    this.f130296k.add(next);
                    z17 = true;
                } else {
                    this.f130297l.add(next);
                }
            }
            this.f130287b.clear();
            if (z17) {
                java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> arrayList = this.f130287b;
                this.f130287b = this.f130296k;
                this.f130296k = arrayList;
            }
            if (this.f130297l.size() > 0) {
                java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> it6 = this.f130297l.iterator();
                while (it6.hasNext()) {
                    it6.next().b();
                }
            }
        }
    }

    public final boolean f() {
        boolean z17;
        synchronized (this.f130288c) {
            z17 = !this.f130287b.isEmpty();
        }
        return z17;
    }

    private void b(int i17) {
        synchronized (this.f130288c) {
            for (int size = this.f130287b.size() - 1; size >= 0; size--) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm jmVar = this.f130287b.get(size);
                if (jmVar.f131573z == i17) {
                    this.f130287b.remove(size);
                    jmVar.b();
                }
            }
        }
    }

    public final void a(int i17) {
        if (i17 <= 0) {
            return;
        }
        this.f130290e = i17;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq fqVar) {
        this.f130294i = fqVar;
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm jmVar) {
        synchronized (this.f130288c) {
            if (this.f130287b.size() > 200) {
                this.f130287b.clear();
            }
            this.f130287b.add(jmVar);
        }
    }

    private void a(double d17, double d18) {
        synchronized (this.f130288c) {
            while (!this.f130287b.isEmpty()) {
                java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> arrayList = this.f130287b;
                if (arrayList.get(arrayList.size() - 1).f131573z != 3) {
                    break;
                }
                java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> arrayList2 = this.f130287b;
                double[] dArr = arrayList2.remove(arrayList2.size() - 1).A;
                d17 += dArr[0];
                d18 += dArr[1];
            }
            a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm(3, new double[]{d17, d18}));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ba
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar) {
        this.f130293h = true;
        this.f130292g = android.os.SystemClock.elapsedRealtime();
    }

    private void a(boolean z17) {
        this.f130295j = z17;
    }

    private static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aa aaVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jp jpVar = aaVar.f130291f;
        if (jpVar != null) {
            jpVar.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm.G);
        }
    }
}
