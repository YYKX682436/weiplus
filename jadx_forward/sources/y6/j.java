package y6;

/* loaded from: classes13.dex */
public class j implements y6.c {

    /* renamed from: b, reason: collision with root package name */
    public final java.io.File f541128b;

    /* renamed from: c, reason: collision with root package name */
    public final long f541129c;

    /* renamed from: e, reason: collision with root package name */
    public r6.f f541131e;

    /* renamed from: d, reason: collision with root package name */
    public final y6.g f541130d = new y6.g();

    /* renamed from: a, reason: collision with root package name */
    public final y6.v f541127a = new y6.v();

    public j(java.io.File file, long j17) {
        this.f541128b = file;
        this.f541129c = j17;
    }

    @Override // y6.c
    public java.io.File a(t6.h hVar) {
        r6.f fVar;
        java.lang.String a17 = this.f541127a.a(hVar);
        if (android.util.Log.isLoggable("DiskLruCacheWrapper", 2)) {
            java.util.Objects.toString(hVar);
        }
        try {
            synchronized (this) {
                if (this.f541131e == null) {
                    this.f541131e = r6.f.l(this.f541128b, 1, 1, this.f541129c);
                }
                fVar = this.f541131e;
            }
            r6.e j17 = fVar.j(a17);
            if (j17 != null) {
                return j17.f474289a[0];
            }
        } catch (java.io.IOException unused) {
            android.util.Log.isLoggable("DiskLruCacheWrapper", 5);
        }
        return null;
    }

    @Override // y6.c
    public void b(t6.h hVar, y6.b bVar) {
        y6.e eVar;
        r6.f fVar;
        boolean z17;
        java.lang.String a17 = this.f541127a.a(hVar);
        y6.g gVar = this.f541130d;
        synchronized (gVar) {
            eVar = (y6.e) ((java.util.HashMap) gVar.f541123a).get(a17);
            if (eVar == null) {
                y6.f fVar2 = gVar.f541124b;
                synchronized (fVar2.f541122a) {
                    eVar = (y6.e) ((java.util.ArrayDeque) fVar2.f541122a).poll();
                }
                if (eVar == null) {
                    eVar = new y6.e();
                }
                ((java.util.HashMap) gVar.f541123a).put(a17, eVar);
            }
            eVar.f541121b++;
        }
        ((java.util.concurrent.locks.ReentrantLock) eVar.f541120a).lock();
        try {
            if (android.util.Log.isLoggable("DiskLruCacheWrapper", 2)) {
                java.util.Objects.toString(hVar);
            }
            try {
                synchronized (this) {
                    if (this.f541131e == null) {
                        this.f541131e = r6.f.l(this.f541128b, 1, 1, this.f541129c);
                    }
                    fVar = this.f541131e;
                }
                if (fVar.j(a17) == null) {
                    r6.c f17 = fVar.f(a17);
                    if (f17 == null) {
                        throw new java.lang.IllegalStateException("Had two simultaneous puts for: ".concat(a17));
                    }
                    try {
                        w6.i iVar = (w6.i) bVar;
                        if (iVar.f524659a.b(iVar.f524660b, f17.b(0), iVar.f524661c)) {
                            r6.f.a(f17.f474280d, f17, true);
                            f17.f474279c = true;
                        }
                        if (!z17) {
                            try {
                                f17.a();
                            } catch (java.io.IOException unused) {
                            }
                        }
                    } finally {
                        if (!f17.f474279c) {
                            try {
                                f17.a();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                    }
                }
            } catch (java.io.IOException unused3) {
                android.util.Log.isLoggable("DiskLruCacheWrapper", 5);
            }
        } finally {
            this.f541130d.a(a17);
        }
    }
}
