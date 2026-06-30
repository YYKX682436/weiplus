package az0;

/* loaded from: classes5.dex */
public final class f4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f15469e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15469e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.f4(this.f15469e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.f4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ec  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.f4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
