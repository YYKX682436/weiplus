package bs;

/* loaded from: classes4.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f23773d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f23774e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f23775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bs.b f23776g;

    /* renamed from: h, reason: collision with root package name */
    public int f23777h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bs.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f23776g = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f23775f = obj;
        this.f23777h |= Integer.MIN_VALUE;
        return bs.b.c(this.f23776g, null, this);
    }
}
