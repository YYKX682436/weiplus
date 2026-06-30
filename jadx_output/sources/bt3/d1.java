package bt3;

/* loaded from: classes9.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f24218d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f24219e;

    /* renamed from: f, reason: collision with root package name */
    public int f24220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bt3.h1 f24221g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(bt3.h1 h1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f24221g = h1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bt3.d1(this.f24221g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bt3.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016e  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
