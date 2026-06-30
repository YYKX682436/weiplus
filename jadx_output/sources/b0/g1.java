package b0;

/* loaded from: classes14.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16288d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16289e;

    /* renamed from: f, reason: collision with root package name */
    public int f16290f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u26.w f16292h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.e2 f16293i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16294m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u26.w wVar, b0.e2 e2Var, n0.e5 e5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16292h = wVar;
        this.f16293i = e2Var;
        this.f16294m = e5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.g1 g1Var = new b0.g1(this.f16292h, this.f16293i, this.f16294m, continuation);
        g1Var.f16291g = obj;
        return g1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:24|25|26|27|(2:32|(2:34|(1:36)))(2:29|(1:31))|8|(2:45|46)(0)) */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7 A[Catch: CancellationException -> 0x00fc, TryCatch #2 {CancellationException -> 0x00fc, blocks: (B:27:0x00c9, B:29:0x00d7, B:32:0x00e7, B:34:0x00eb), top: B:26:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7 A[Catch: CancellationException -> 0x00fc, TryCatch #2 {CancellationException -> 0x00fc, blocks: (B:27:0x00c9, B:29:0x00d7, B:32:0x00e7, B:34:0x00eb), top: B:26:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e4 -> B:8:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e9 -> B:8:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f6 -> B:8:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x010f -> B:8:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0112 -> B:8:0x0063). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
