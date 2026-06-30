package bg2;

/* loaded from: classes2.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20483d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f20484e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f20485f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f20486g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f20487h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f20488i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f20489m;

    /* renamed from: n, reason: collision with root package name */
    public int f20490n;

    /* renamed from: o, reason: collision with root package name */
    public int f20491o;

    /* renamed from: p, reason: collision with root package name */
    public int f20492p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ bg2.t1 f20493q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(bg2.t1 t1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20493q = t1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.s1(this.f20493q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.s1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x03cf, code lost:
    
        r8 = 0;
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01df, code lost:
    
        if (((r6 == null || r6.length() == 0) ? 1 : r12) == 0) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x03c2 -> B:9:0x03c6). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
