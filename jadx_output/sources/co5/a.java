package co5;

/* loaded from: classes2.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f43806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ co5.b f43807e;

    /* renamed from: f, reason: collision with root package name */
    public int f43808f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(co5.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f43807e = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f43806d = obj;
        this.f43808f |= Integer.MIN_VALUE;
        return this.f43807e.a(null, this);
    }
}
