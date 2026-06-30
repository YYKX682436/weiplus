package az0;

/* loaded from: classes16.dex */
public final class vb extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15981d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15983f;

    /* renamed from: g, reason: collision with root package name */
    public int f15984g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(az0.xb xbVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15983f = xbVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15982e = obj;
        this.f15984g |= Integer.MIN_VALUE;
        return this.f15983f.a0(false, this);
    }
}
