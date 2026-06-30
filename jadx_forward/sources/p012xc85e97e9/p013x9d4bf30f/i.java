package p012xc85e97e9.p013x9d4bf30f;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f90572a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayDeque f90573b = new java.util.ArrayDeque();

    public i(java.lang.Runnable runnable) {
        this.f90572a = runnable;
    }

    public void a(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p013x9d4bf30f.g gVar) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = yVar.mo273xed6858b4();
        if (mo273xed6858b4.b() == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            return;
        }
        gVar.m2522xc8077e2b(new p012xc85e97e9.p013x9d4bf30f.C0058x919a0099(this, mo273xed6858b4, gVar));
    }

    public p012xc85e97e9.p013x9d4bf30f.a b(p012xc85e97e9.p013x9d4bf30f.g gVar) {
        this.f90573b.add(gVar);
        p012xc85e97e9.p013x9d4bf30f.h hVar = new p012xc85e97e9.p013x9d4bf30f.h(this, gVar);
        gVar.m2522xc8077e2b(hVar);
        return hVar;
    }

    public void c() {
        java.util.Iterator descendingIterator = this.f90573b.descendingIterator();
        while (descendingIterator.hasNext()) {
            p012xc85e97e9.p013x9d4bf30f.g gVar = (p012xc85e97e9.p013x9d4bf30f.g) descendingIterator.next();
            if (gVar.m2524x7d80d2b7()) {
                gVar.mo2523xc0eac894();
                return;
            }
        }
        java.lang.Runnable runnable = this.f90572a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
