package cp0;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp0.b f302275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp0.f f302276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f302277f;

    public e(cp0.b bVar, cp0.f fVar, java.lang.Object obj) {
        this.f302275d = bVar;
        this.f302276e = fVar;
        this.f302277f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cp0.f fVar = this.f302276e;
        this.f302275d.a(fVar.b(this.f302277f, fVar.f302278a));
    }
}
