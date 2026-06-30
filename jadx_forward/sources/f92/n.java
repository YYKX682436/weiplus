package f92;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f92.t f341794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m92.b f341795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m92.j f341796f;

    public n(f92.t tVar, m92.b bVar, m92.j jVar) {
        this.f341794d = tVar;
        this.f341795e = bVar;
        this.f341796f = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (l92.b bVar : this.f341794d.h6().f406517g) {
            ((f92.i) bVar).c(this.f341795e, this.f341796f.name());
        }
    }
}
