package t56;

/* loaded from: classes16.dex */
public class o implements r56.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a66.e f497447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r56.a f497448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p56.s f497449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t56.p f497450g;

    public o(t56.p pVar, a66.e eVar, r56.a aVar, p56.s sVar) {
        this.f497450g = pVar;
        this.f497447d = eVar;
        this.f497448e = aVar;
        this.f497449f = sVar;
    }

    @Override // r56.a
    /* renamed from: call */
    public void mo740x2e7a5e() {
        a66.e eVar = this.f497447d;
        if (eVar.b()) {
            return;
        }
        p56.s d17 = this.f497450g.d(this.f497448e);
        eVar.a(d17);
        if (d17.getClass() == t56.c0.class) {
            ((t56.c0) d17).f497395d.a(this.f497449f);
        }
    }
}
