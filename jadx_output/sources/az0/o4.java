package az0;

/* loaded from: classes5.dex */
public final class o4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f15768d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.i5 f15770f;

    /* renamed from: g, reason: collision with root package name */
    public int f15771g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(az0.i5 i5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15770f = i5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15769e = obj;
        this.f15771g |= Integer.MIN_VALUE;
        return az0.i5.c(this.f15770f, this);
    }
}
