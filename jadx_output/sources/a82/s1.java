package a82;

/* loaded from: classes11.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f2165d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f2166e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f2167f;

    /* renamed from: g, reason: collision with root package name */
    public int f2168g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a82.u1 f2169h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(a82.u1 u1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2169h = u1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a82.s1(this.f2169h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.s1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #5 {all -> 0x00c9, blocks: (B:15:0x0056, B:17:0x005f, B:20:0x006c, B:23:0x0071, B:25:0x0079, B:29:0x0084), top: B:14:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0098 -> B:10:0x009f). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
