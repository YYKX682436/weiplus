package az0;

/* loaded from: classes16.dex */
public final class h8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15531d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15532e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15534g;

    /* renamed from: h, reason: collision with root package name */
    public int f15535h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(az0.s9 s9Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15534g = s9Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15533f = obj;
        this.f15535h |= Integer.MIN_VALUE;
        return this.f15534g.x(null, this);
    }
}
