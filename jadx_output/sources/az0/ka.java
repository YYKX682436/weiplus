package az0;

/* loaded from: classes16.dex */
public final class ka extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15639d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15640e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15642g;

    /* renamed from: h, reason: collision with root package name */
    public int f15643h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(az0.xb xbVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15642g = xbVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15641f = obj;
        this.f15643h |= Integer.MIN_VALUE;
        return this.f15642g.x(null, this);
    }
}
