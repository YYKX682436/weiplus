package y91;

/* loaded from: classes16.dex */
public class b implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w91.d f541792d;

    public b(y91.d dVar, w91.d dVar2) {
        this.f541792d = dVar2;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        try {
            if (y91.k0.f541829d == null) {
                synchronized (y91.d.class) {
                    if (y91.k0.f541829d == null) {
                        y91.k0.f541829d = new y91.k0(true);
                    }
                }
            }
            y91.k0.f541829d.b(this.f541792d);
            rVar.mo157868xaa8b332c();
        } catch (java.io.IOException e17) {
            rVar.mo157869xaf8aa769(e17.getCause());
            v91.b.c("DlnaRepositoryImpl", e17, "");
        }
    }
}
