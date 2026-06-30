package ah3;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f4921d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f4922e;

    /* renamed from: f, reason: collision with root package name */
    public int f4923f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4924g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u26.w f4925h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ah3.v f4926i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f4927m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f4928n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ah3.n f4929o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.List f4930p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.List f4931q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u26.w wVar, ah3.v vVar, kotlinx.coroutines.y0 y0Var, yz5.l lVar, ah3.n nVar, java.util.List list, java.util.List list2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4925h = wVar;
        this.f4926i = vVar;
        this.f4927m = y0Var;
        this.f4928n = lVar;
        this.f4929o = nVar;
        this.f4930p = list;
        this.f4931q = list2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ah3.q qVar = new ah3.q(this.f4925h, this.f4926i, this.f4927m, this.f4928n, this.f4929o, this.f4930p, this.f4931q, continuation);
        qVar.f4924g = obj;
        return qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ah3.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd A[LOOP:0: B:13:0x00d5->B:15:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7 A[EDGE_INSN: B:16:0x00e7->B:17:0x00e7 BREAK  A[LOOP:0: B:13:0x00d5->B:15:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0061 -> B:24:0x0064). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah3.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
