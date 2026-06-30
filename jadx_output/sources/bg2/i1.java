package bg2;

/* loaded from: classes2.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f20153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.j1 f20154f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(long j17, bg2.j1 j1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20153e = j17;
        this.f20154f = j1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.i1(this.f20153e, this.f20154f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0112, code lost:
    
        if (((r4 == null || r4.Y6()) ? false : true) != false) goto L58;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.i1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
