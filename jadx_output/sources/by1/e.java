package by1;

/* loaded from: classes2.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f36357d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f36358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ by1.f f36359f;

    /* renamed from: g, reason: collision with root package name */
    public int f36360g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(by1.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f36359f = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f36358e = obj;
        this.f36360g |= Integer.MIN_VALUE;
        return by1.f.f(this.f36359f, this);
    }
}
