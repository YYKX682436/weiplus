package d11;

/* loaded from: classes10.dex */
public final class c implements j3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d11.d f307188a;

    public c(d11.d dVar) {
        this.f307188a = dVar;
    }

    @Override // j3.g
    /* renamed from: onCancel */
    public final void mo7740x3d6f0539() {
        d11.d dVar = this.f307188a;
        synchronized (dVar.f307191c) {
            java.util.Iterator it = dVar.f307191c.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }
}
