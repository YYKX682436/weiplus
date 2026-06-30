package aj0;

/* loaded from: classes11.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f5246d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f5247e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f5248f;

    /* renamed from: g, reason: collision with root package name */
    public long f5249g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5250h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ aj0.l f5251i;

    /* renamed from: m, reason: collision with root package name */
    public int f5252m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(aj0.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f5251i = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5250h = obj;
        this.f5252m |= Integer.MIN_VALUE;
        return this.f5251i.a(this);
    }
}
