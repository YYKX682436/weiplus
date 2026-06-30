package vu5;

/* loaded from: classes12.dex */
public abstract class b implements vu5.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f521878d = new java.util.concurrent.atomic.AtomicBoolean(false);

    public abstract vu5.a b();

    public wu5.c c(wu5.l lVar) {
        if (this.f521878d.get()) {
            ku5.o.f394130a.b(lVar.mo1867xb5884f29(), lVar.f531391s, mo172679xfb82e301(), true);
            return null;
        }
        if (!lVar.isCancelled()) {
            b().a(lVar);
            return lVar;
        }
        ku5.o.f394132c.w(mo172679xfb82e301(), "[BasePool#input] task=%s pool=%s", lVar.mo1867xb5884f29() + "#" + lVar.f531391s, mo172679xfb82e301());
        return null;
    }
}
