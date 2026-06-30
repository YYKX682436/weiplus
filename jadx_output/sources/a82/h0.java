package a82;

/* loaded from: classes9.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f2002d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f2003e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f2004f;

    /* renamed from: g, reason: collision with root package name */
    public int f2005g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a82.n0 f2006h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(a82.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2006h = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a82.h0(this.f2006h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0115 -> B:8:0x0118). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x013e -> B:9:0x009e). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
