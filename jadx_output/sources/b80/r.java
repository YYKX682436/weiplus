package b80;

/* loaded from: classes12.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f18266d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f18267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b80.u f18268f;

    /* renamed from: g, reason: collision with root package name */
    public int f18269g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b80.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f18268f = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f18267e = obj;
        this.f18269g |= Integer.MIN_VALUE;
        return this.f18268f.qj(null, false, this);
    }
}
