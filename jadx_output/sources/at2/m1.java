package at2;

/* loaded from: classes3.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f13707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at2.n1 f13708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(at2.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f13708e = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new at2.m1(this.f13708e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((at2.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01f5 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: at2.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
