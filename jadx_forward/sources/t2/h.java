package t2;

/* loaded from: classes14.dex */
public final class h extends t2.b {
    public h() {
        super(null);
    }

    @Override // t2.b
    public boolean a(t2.j jVar, t2.f fVar, t2.f fVar2) {
        synchronized (jVar) {
            if (jVar.f496183e != fVar) {
                return false;
            }
            jVar.f496183e = fVar2;
            return true;
        }
    }

    @Override // t2.b
    public boolean b(t2.j jVar, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (jVar) {
            if (jVar.f496182d != obj) {
                return false;
            }
            jVar.f496182d = obj2;
            return true;
        }
    }

    @Override // t2.b
    public boolean c(t2.j jVar, t2.i iVar, t2.i iVar2) {
        synchronized (jVar) {
            if (jVar.f496184f != iVar) {
                return false;
            }
            jVar.f496184f = iVar2;
            return true;
        }
    }

    @Override // t2.b
    public void d(t2.i iVar, t2.i iVar2) {
        iVar.f496177b = iVar2;
    }

    @Override // t2.b
    public void e(t2.i iVar, java.lang.Thread thread) {
        iVar.f496176a = thread;
    }
}
