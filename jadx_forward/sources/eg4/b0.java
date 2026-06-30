package eg4;

/* loaded from: classes11.dex */
public final class b0 implements ns.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eg4.i0 f334208c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.ib f334209d;

    public b0(android.content.Context context, java.lang.String str, eg4.i0 i0Var, com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar) {
        this.f334206a = context;
        this.f334207b = str;
        this.f334208c = i0Var;
        this.f334209d = ibVar;
    }

    @Override // ns.j
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar = this.f334209d;
        android.content.Context context = this.f334206a;
        eg4.i0 i0Var = this.f334208c;
        if (!z17) {
            eg4.i0.o(i0Var, context, ibVar);
            return;
        }
        ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
        ((ms.a) kVar).Bi(context, 3, this.f334207b, new eg4.a0(i0Var, context, ibVar));
    }
}
