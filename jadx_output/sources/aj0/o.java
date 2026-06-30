package aj0;

/* loaded from: classes11.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f5272d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj0.s f5274f;

    /* renamed from: g, reason: collision with root package name */
    public int f5275g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(aj0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f5274f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5273e = obj;
        this.f5275g |= Integer.MIN_VALUE;
        return this.f5274f.a(this);
    }
}
