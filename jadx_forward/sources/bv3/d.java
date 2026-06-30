package bv3;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final bv3.c f106264a;

    /* renamed from: b, reason: collision with root package name */
    public final bv3.c f106265b;

    public d(long j17, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        z17 = (i17 & 2) != 0 ? true : z17;
        bv3.c cVar = new bv3.c(0L, 1, null);
        this.f106264a = cVar;
        bv3.c cVar2 = new bv3.c(0L, 1, null);
        this.f106265b = cVar2;
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
            bv3.c cVar = dVar2 != null ? dVar2.f106264a : null;
            bv3.c cVar2 = dVar.f106264a;
            cVar2.d(cVar);
            cVar2.c(0L);
        }
        if (z18) {
            bv3.c cVar3 = dVar2 != null ? dVar2.f106265b : null;
            bv3.c cVar4 = dVar.f106265b;
            cVar4.d(cVar3);
            cVar4.c(0L);
        }
    }

    public final long b() {
        return this.f106265b.a();
    }

    public final long c() {
        return this.f106264a.a();
    }

    public final void d(long j17, long j18) {
        bv3.c cVar = this.f106264a;
        cVar.c(cVar.f106261c + (j17 - cVar.a()));
        bv3.c cVar2 = this.f106265b;
        cVar2.c(cVar2.f106261c + (j18 - cVar2.a()));
    }

    /* renamed from: finalize */
    public final void m11389xd764dc1e() {
        this.f106264a.d(null);
        this.f106265b.d(null);
    }

    /* renamed from: toString */
    public java.lang.String m11390x9616526c() {
        return "start:" + c() + "  end:" + b();
    }
}
