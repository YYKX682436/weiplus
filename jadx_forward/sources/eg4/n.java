package eg4;

/* loaded from: classes11.dex */
public final class n implements ns.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y35.r f334296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eg4.t f334297c;

    public n(android.content.Context context, y35.r rVar, eg4.t tVar) {
        this.f334295a = context;
        this.f334296b = rVar;
        this.f334297c = tVar;
    }

    @Override // ns.j
    public void a(boolean z17) {
        y35.r rVar = this.f334296b;
        android.content.Context context = this.f334295a;
        eg4.t tVar = this.f334297c;
        if (!z17) {
            eg4.t.o(tVar, context, rVar);
            return;
        }
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(context, 3, rVar.f540765a, new eg4.m(tVar, context, rVar));
    }
}
