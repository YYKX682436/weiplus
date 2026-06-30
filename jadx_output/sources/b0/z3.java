package b0;

/* loaded from: classes14.dex */
public final class z3 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16624e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f16625f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f16626g;

    /* renamed from: h, reason: collision with root package name */
    public long f16627h;

    /* renamed from: i, reason: collision with root package name */
    public int f16628i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16629m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f16630n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.q f16631o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f16632p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16633q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16634r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16635s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(b0.h2 h2Var, yz5.q qVar, kotlinx.coroutines.y0 y0Var, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16630n = h2Var;
        this.f16631o = qVar;
        this.f16632p = y0Var;
        this.f16633q = lVar;
        this.f16634r = lVar2;
        this.f16635s = lVar3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.z3 z3Var = new b0.z3(this.f16630n, this.f16631o, this.f16632p, this.f16633q, this.f16634r, this.f16635s, continuation);
        z3Var.f16629m = obj;
        return z3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.z3) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x020d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4 A[Catch: o -> 0x0109, TryCatch #3 {o -> 0x0109, blocks: (B:53:0x00ee, B:55:0x00f4, B:58:0x00fc), top: B:52:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc A[Catch: o -> 0x0109, TRY_LEAVE, TryCatch #3 {o -> 0x0109, blocks: (B:53:0x00ee, B:55:0x00f4, B:58:0x00fc), top: B:52:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c6  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.z3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
