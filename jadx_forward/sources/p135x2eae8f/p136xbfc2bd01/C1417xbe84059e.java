package p135x2eae8f.p136xbfc2bd01;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcoil/memory/ViewTargetRequestDelegate;", "Lcoil/memory/RequestDelegate;", "Lr5/j;", "imageLoader", "Lc6/j;", "request", "La6/b0;", "targetDelegate", "Lkotlinx/coroutines/r2;", "job", "<init>", "(Lr5/j;Lc6/j;La6/b0;Lkotlinx/coroutines/r2;)V", "coil-base_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: coil.memory.ViewTargetRequestDelegate */
/* loaded from: classes14.dex */
public final class C1417xbe84059e extends p135x2eae8f.p136xbfc2bd01.AbstractC1416x8fb9ed14 {

    /* renamed from: d, reason: collision with root package name */
    public final r5.j f125440d;

    /* renamed from: e, reason: collision with root package name */
    public final c6.j f125441e;

    /* renamed from: f, reason: collision with root package name */
    public final a6.b0 f125442f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r2 f125443g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417xbe84059e(r5.j imageLoader, c6.j request, a6.b0 targetDelegate, p3325xe03a0797.p3326xc267989b.r2 job) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageLoader, "imageLoader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetDelegate, "targetDelegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(job, "job");
        this.f125440d = imageLoader;
        this.f125441e = request;
        this.f125442f = targetDelegate;
        this.f125443g = job;
    }

    @Override // p135x2eae8f.p136xbfc2bd01.AbstractC1416x8fb9ed14
    public void b() {
        p3325xe03a0797.p3326xc267989b.p2.a(this.f125443g, null, 1, null);
        a6.b0 b0Var = this.f125442f;
        b0Var.a();
        h6.d.d(b0Var, null);
        c6.j jVar = this.f125441e;
        e6.b bVar = jVar.f120364c;
        if (bVar instanceof p012xc85e97e9.p093xedfae76a.x) {
            jVar.f120374m.c((p012xc85e97e9.p093xedfae76a.x) bVar);
        }
        jVar.f120374m.c(this);
    }
}
