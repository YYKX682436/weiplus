package ay1;

/* loaded from: classes2.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15214d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15215e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ay1.l f15217g;

    /* renamed from: h, reason: collision with root package name */
    public int f15218h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ay1.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15217g = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15216f = obj;
        this.f15218h |= Integer.MIN_VALUE;
        return ay1.l.k(this.f15217g, false, this);
    }
}
