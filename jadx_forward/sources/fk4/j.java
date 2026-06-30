package fk4;

/* loaded from: classes12.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk4.k f345144d;

    public j(fk4.k kVar) {
        this.f345144d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p947xba6de98f.l3 Di = t21.o2.Di();
        fk4.k kVar = this.f345144d;
        Di.p(kVar.f(), 0, -1, 0);
        java.util.Iterator it = kVar.f345164s.iterator();
        while (it.hasNext()) {
            ((ok4.a) it.next()).i();
        }
    }
}
