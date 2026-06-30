package b0;

/* loaded from: classes14.dex */
public final class g0 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16280e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f16281f;

    /* renamed from: g, reason: collision with root package name */
    public int f16282g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16283h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16284i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.p f16285m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f16286n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.a f16287o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(yz5.l lVar, yz5.p pVar, yz5.a aVar, yz5.a aVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16284i = lVar;
        this.f16285m = pVar;
        this.f16286n = aVar;
        this.f16287o = aVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.g0 g0Var = new b0.g0(this.f16284i, this.f16285m, this.f16286n, this.f16287o, continuation);
        g0Var.f16283h = obj;
        return g0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.g0) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0076 -> B:17:0x0079). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
