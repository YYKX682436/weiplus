package az0;

/* loaded from: classes5.dex */
public final class b3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15350d;

    /* renamed from: e, reason: collision with root package name */
    public long f15351e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.i5 f15353g;

    /* renamed from: h, reason: collision with root package name */
    public int f15354h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(az0.i5 i5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15353g = i5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15352f = obj;
        this.f15354h |= Integer.MIN_VALUE;
        return this.f15353g.h(null, 0L, this);
    }
}
