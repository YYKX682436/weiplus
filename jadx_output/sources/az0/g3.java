package az0;

/* loaded from: classes5.dex */
public final class g3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15494d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.i5 f15496f;

    /* renamed from: g, reason: collision with root package name */
    public int f15497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(az0.i5 i5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15496f = i5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15495e = obj;
        this.f15497g |= Integer.MIN_VALUE;
        return this.f15496f.i(this);
    }
}
