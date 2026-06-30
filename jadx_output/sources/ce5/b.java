package ce5;

/* loaded from: classes4.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f40799d;

    /* renamed from: e, reason: collision with root package name */
    public long f40800e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f40801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ce5.d f40802g;

    /* renamed from: h, reason: collision with root package name */
    public int f40803h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ce5.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f40802g = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f40801f = obj;
        this.f40803h |= Integer.MIN_VALUE;
        return ce5.d.a(this.f40802g, null, 0, null, null, 0L, null, this);
    }
}
