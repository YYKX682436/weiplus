package bv3;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final bv3.c f24731a;

    /* renamed from: b, reason: collision with root package name */
    public final bv3.c f24732b;

    public d(long j17, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        z17 = (i17 & 2) != 0 ? true : z17;
        bv3.c cVar = new bv3.c(0L, 1, null);
        this.f24731a = cVar;
        bv3.c cVar2 = new bv3.c(0L, 1, null);
        this.f24732b = cVar2;
        if (z17) {
            cVar2.d(cVar);
            cVar2.c(j17);
        } else {
            cVar.d(cVar2);
            cVar.c(-j17);
        }
    }

    public static void a(bv3.d dVar, bv3.d dVar2, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        dVar.getClass();
        if (z17) {
            bv3.c cVar = dVar2 != null ? dVar2.f24731a : null;
            bv3.c cVar2 = dVar.f24731a;
            cVar2.d(cVar);
            cVar2.c(0L);
        }
        if (z18) {
            bv3.c cVar3 = dVar2 != null ? dVar2.f24732b : null;
            bv3.c cVar4 = dVar.f24732b;
            cVar4.d(cVar3);
            cVar4.c(0L);
        }
    }

    public final long b() {
        return this.f24732b.a();
    }

    public final long c() {
        return this.f24731a.a();
    }

    public final void d(long j17, long j18) {
        bv3.c cVar = this.f24731a;
        cVar.c(cVar.f24728c + (j17 - cVar.a()));
        bv3.c cVar2 = this.f24732b;
        cVar2.c(cVar2.f24728c + (j18 - cVar2.a()));
    }

    public final void finalize() {
        this.f24731a.d(null);
        this.f24732b.d(null);
    }

    public java.lang.String toString() {
        return "start:" + c() + "  end:" + b();
    }
}
