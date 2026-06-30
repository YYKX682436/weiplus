package ah3;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f4874d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f4875e;

    /* renamed from: f, reason: collision with root package name */
    public int f4876f;

    /* renamed from: g, reason: collision with root package name */
    public int f4877g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4878h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ah3.m f4879i;

    /* renamed from: m, reason: collision with root package name */
    public int f4880m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ah3.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f4879i = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4878h = obj;
        this.f4880m |= Integer.MIN_VALUE;
        return this.f4879i.d(0, 0, this);
    }
}
