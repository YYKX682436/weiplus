package b0;

/* loaded from: classes14.dex */
public final class h1 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16316e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f16317f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f16318g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16319h;

    /* renamed from: i, reason: collision with root package name */
    public int f16320i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16321m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16322n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16323o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f16324p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u26.w f16325q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f16326r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f16327s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(n0.e5 e5Var, n0.e5 e5Var2, b0.y1 y1Var, u26.w wVar, boolean z17, kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16322n = e5Var;
        this.f16323o = e5Var2;
        this.f16324p = y1Var;
        this.f16325q = wVar;
        this.f16326r = z17;
        this.f16327s = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.h1 h1Var = new b0.h1(this.f16322n, this.f16323o, this.f16324p, this.f16325q, this.f16326r, this.f16327s, continuation);
        h1Var.f16321m = obj;
        return h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.h1) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1 A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x002a, blocks: (B:7:0x0022, B:10:0x0098, B:27:0x00c7, B:29:0x00d1), top: B:6:0x0022 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.h1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
