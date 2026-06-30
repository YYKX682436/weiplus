package a82;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f2127d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f2128e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f2129f;

    /* renamed from: g, reason: collision with root package name */
    public int f2130g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a82.t f2131h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a82.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2131h = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a82.q(this.f2131h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x01de -> B:6:0x01e4). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
