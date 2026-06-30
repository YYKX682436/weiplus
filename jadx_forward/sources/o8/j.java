package o8;

/* loaded from: classes15.dex */
public abstract class j implements o8.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Thread f425148a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f425149b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f425150c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f425151d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final o8.g[] f425152e;

    /* renamed from: f, reason: collision with root package name */
    public final o8.h[] f425153f;

    /* renamed from: g, reason: collision with root package name */
    public int f425154g;

    /* renamed from: h, reason: collision with root package name */
    public int f425155h;

    /* renamed from: i, reason: collision with root package name */
    public o8.g f425156i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Exception f425157j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f425158k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f425159l;

    public j(o8.g[] gVarArr, o8.h[] hVarArr) {
        this.f425152e = gVarArr;
        this.f425154g = gVarArr.length;
        for (int i17 = 0; i17 < this.f425154g; i17++) {
            this.f425152e[i17] = new i9.i();
        }
        this.f425153f = hVarArr;
        this.f425155h = hVarArr.length;
        for (int i18 = 0; i18 < this.f425155h; i18++) {
            this.f425153f[i18] = new i9.c((i9.b) this);
        }
        o8.i iVar = new o8.i(this);
        this.f425148a = iVar;
        iVar.start();
    }

    @Override // o8.e
    public java.lang.Object a() {
        o8.g gVar;
        synchronized (this.f425149b) {
            try {
                java.lang.Exception exc = this.f425157j;
                if (exc != null) {
                    throw exc;
                }
                t9.a.d(this.f425156i == null);
                int i17 = this.f425154g;
                if (i17 == 0) {
                    gVar = null;
                } else {
                    o8.g[] gVarArr = this.f425152e;
                    int i18 = i17 - 1;
                    this.f425154g = i18;
                    gVar = gVarArr[i18];
                }
                this.f425156i = gVar;
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        return gVar;
    }

    @Override // o8.e
    public void c(java.lang.Object obj) {
        o8.g gVar = (o8.g) obj;
        synchronized (this.f425149b) {
            try {
                java.lang.Exception exc = this.f425157j;
                if (exc != null) {
                    throw exc;
                }
                boolean z17 = true;
                t9.a.a(gVar == this.f425156i);
                this.f425150c.addLast(gVar);
                if (this.f425150c.isEmpty() || this.f425155h <= 0) {
                    z17 = false;
                }
                if (z17) {
                    this.f425149b.notify();
                }
                this.f425156i = null;
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    public final boolean d() {
        synchronized (this.f425149b) {
            while (!this.f425159l) {
                try {
                    if (!this.f425150c.isEmpty() && this.f425155h > 0) {
                        break;
                    }
                    this.f425149b.wait();
                } finally {
                }
            }
            if (this.f425159l) {
                return false;
            }
            o8.g gVar = (o8.g) this.f425150c.removeFirst();
            o8.h[] hVarArr = this.f425153f;
            int i17 = this.f425155h - 1;
            this.f425155h = i17;
            o8.h hVar = hVarArr[i17];
            boolean z17 = this.f425158k;
            this.f425158k = false;
            if (gVar.b(4)) {
                hVar.f425127d = 4 | hVar.f425127d;
            } else {
                if (gVar.k()) {
                    hVar.f425127d |= Integer.MIN_VALUE;
                }
                i9.b bVar = (i9.b) this;
                i9.i iVar = (i9.i) gVar;
                i9.j jVar = (i9.j) hVar;
                try {
                    java.nio.ByteBuffer byteBuffer = iVar.f425143f;
                    i9.d f17 = bVar.f(byteBuffer.array(), byteBuffer.limit(), z17);
                    long j17 = iVar.f425144g;
                    long j18 = iVar.f371203i;
                    jVar.f425146e = j17;
                    jVar.f371204f = f17;
                    if (j18 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                        j17 = j18;
                    }
                    jVar.f371205g = j17;
                    jVar.f425127d &= Integer.MAX_VALUE;
                    e = null;
                } catch (i9.f e17) {
                    e = e17;
                }
                this.f425157j = e;
                if (e != null) {
                    synchronized (this.f425149b) {
                    }
                    return false;
                }
            }
            synchronized (this.f425149b) {
                if (this.f425158k) {
                    e(hVar);
                } else if (hVar.k()) {
                    e(hVar);
                } else {
                    this.f425151d.addLast(hVar);
                }
                gVar.l();
                int i18 = this.f425154g;
                this.f425154g = i18 + 1;
                this.f425152e[i18] = gVar;
            }
            return true;
        }
    }

    @Override // o8.e
    /* renamed from: dequeueOutputBuffer */
    public java.lang.Object mo140477x436dd5f1() {
        synchronized (this.f425149b) {
            try {
                java.lang.Exception exc = this.f425157j;
                if (exc != null) {
                    throw exc;
                }
                if (this.f425151d.isEmpty()) {
                    return null;
                }
                return (o8.h) this.f425151d.removeFirst();
            } finally {
            }
        }
    }

    public final void e(o8.h hVar) {
        i9.j jVar = (i9.j) hVar;
        jVar.f425127d = 0;
        jVar.f371204f = null;
        int i17 = this.f425155h;
        this.f425155h = i17 + 1;
        this.f425153f[i17] = hVar;
    }

    @Override // o8.e
    /* renamed from: flush */
    public final void mo140474x5d03b04() {
        synchronized (this.f425149b) {
            this.f425158k = true;
            o8.g gVar = this.f425156i;
            if (gVar != null) {
                gVar.l();
                int i17 = this.f425154g;
                this.f425154g = i17 + 1;
                this.f425152e[i17] = gVar;
                this.f425156i = null;
            }
            while (!this.f425150c.isEmpty()) {
                o8.g gVar2 = (o8.g) this.f425150c.removeFirst();
                gVar2.l();
                int i18 = this.f425154g;
                this.f425154g = i18 + 1;
                this.f425152e[i18] = gVar2;
            }
            while (!this.f425151d.isEmpty()) {
                e((o8.h) this.f425151d.removeFirst());
            }
        }
    }

    @Override // o8.e
    /* renamed from: release */
    public void mo140475x41012807() {
        synchronized (this.f425149b) {
            this.f425159l = true;
            this.f425149b.notify();
        }
        try {
            this.f425148a.join();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
    }
}
