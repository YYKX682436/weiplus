package az0;

/* loaded from: classes5.dex */
public final class m3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15689d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15690e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.i5 f15692g;

    /* renamed from: h, reason: collision with root package name */
    public int f15693h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(az0.i5 i5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15692g = i5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15691f = obj;
        this.f15693h |= Integer.MIN_VALUE;
        return this.f15692g.k(null, null, this);
    }
}
