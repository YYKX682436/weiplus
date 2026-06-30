package ah3;

/* loaded from: classes12.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f4861d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f4862e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f4863f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f4864g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f4865h;

    /* renamed from: i, reason: collision with root package name */
    public long f4866i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4867m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ah3.m f4868n;

    /* renamed from: o, reason: collision with root package name */
    public int f4869o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ah3.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f4868n = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4867m = obj;
        this.f4869o |= Integer.MIN_VALUE;
        return this.f4868n.b(this);
    }
}
