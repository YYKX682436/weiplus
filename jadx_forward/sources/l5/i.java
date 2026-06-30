package l5;

/* loaded from: classes14.dex */
public final class i extends l5.b {
    public i() {
        super(null);
    }

    @Override // l5.b
    public boolean a(l5.k kVar, l5.f fVar, l5.f fVar2) {
        synchronized (kVar) {
            if (kVar.f398068e != fVar) {
                return false;
            }
            kVar.f398068e = fVar2;
            return true;
        }
    }

    @Override // l5.b
    public boolean b(l5.k kVar, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (kVar) {
            if (kVar.f398067d != obj) {
                return false;
            }
            kVar.f398067d = obj2;
            return true;
        }
    }

    @Override // l5.b
    public boolean c(l5.k kVar, l5.j jVar, l5.j jVar2) {
        synchronized (kVar) {
            if (kVar.f398069f != jVar) {
                return false;
            }
            kVar.f398069f = jVar2;
            return true;
        }
    }

    @Override // l5.b
    public void d(l5.j jVar, l5.j jVar2) {
        jVar.f398062b = jVar2;
    }

    @Override // l5.b
    public void e(l5.j jVar, java.lang.Thread thread) {
        jVar.f398061a = thread;
    }
}
