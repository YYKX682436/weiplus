package z81;

/* loaded from: classes13.dex */
public class f implements z81.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f552229a;

    public f(h91.b bVar) {
        this.f552229a = new java.lang.ref.WeakReference(bVar);
    }

    @Override // z81.a
    /* renamed from: invalidate */
    public void mo178562x92d0313b() {
        h91.b bVar = (h91.b) this.f552229a.get();
        if (bVar == null) {
            return;
        }
        bVar.a();
    }
}
