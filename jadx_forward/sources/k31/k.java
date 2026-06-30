package k31;

/* loaded from: classes9.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.b f385378d;

    public k(l31.b bVar) {
        this.f385378d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l31.b bVar = this.f385378d;
        bVar.hashCode();
        k31.o oVar = k31.o.f385383a;
        java.util.List list = (java.util.List) k31.o.f385385c.get(bVar.b());
        if (list != null) {
            list.remove(bVar);
        }
    }
}
