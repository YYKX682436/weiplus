package a0;

/* loaded from: classes14.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f87d;

    /* renamed from: e, reason: collision with root package name */
    public int f88e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f89f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.f2 f90g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f91h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0.o f92i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f93m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f94n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0.f2 f2Var, long j17, c0.o oVar, n0.v2 v2Var, n0.e5 e5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f90g = f2Var;
        this.f91h = j17;
        this.f92i = oVar;
        this.f93m = v2Var;
        this.f94n = e5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        a0.c0 c0Var = new a0.c0(this.f90g, this.f91h, this.f92i, this.f93m, this.f94n, continuation);
        c0Var.f89f = obj;
        return c0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
