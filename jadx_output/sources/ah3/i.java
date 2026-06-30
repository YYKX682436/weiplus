package ah3;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f4882d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f4883e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f4884f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f4885g;

    /* renamed from: h, reason: collision with root package name */
    public int f4886h;

    /* renamed from: i, reason: collision with root package name */
    public int f4887i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4888m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ah3.m f4889n;

    /* renamed from: o, reason: collision with root package name */
    public int f4890o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ah3.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f4889n = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4888m = obj;
        this.f4890o |= Integer.MIN_VALUE;
        return ah3.m.a(this.f4889n, null, this);
    }
}
