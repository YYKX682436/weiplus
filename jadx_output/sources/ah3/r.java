package ah3;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f4932d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f4933e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f4934f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f4935g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f4936h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f4937i;

    /* renamed from: m, reason: collision with root package name */
    public int f4938m;

    /* renamed from: n, reason: collision with root package name */
    public int f4939n;

    /* renamed from: o, reason: collision with root package name */
    public long f4940o;

    /* renamed from: p, reason: collision with root package name */
    public int f4941p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ah3.v f4942q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f4943r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u26.w f4944s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ah3.v vVar, kotlinx.coroutines.y0 y0Var, u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4942q = vVar;
        this.f4943r = y0Var;
        this.f4944s = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ah3.r(this.f4942q, this.f4943r, this.f4944s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ah3.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0165  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x014c -> B:6:0x015f). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah3.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
