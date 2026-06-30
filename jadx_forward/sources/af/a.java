package af;

/* loaded from: classes7.dex */
public final class a implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af.b f85969d;

    public a(af.b bVar) {
        this.f85969d = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        af.b bVar = this.f85969d;
        java.lang.Object c17 = bVar.c();
        bVar.f85974e = java.lang.System.currentTimeMillis() - currentTimeMillis;
        return c17;
    }
}
