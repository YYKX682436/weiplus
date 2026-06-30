package as2;

/* loaded from: classes2.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13433d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ as2.b f13435f;

    /* renamed from: g, reason: collision with root package name */
    public int f13436g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(as2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13435f = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13434e = obj;
        this.f13436g |= Integer.MIN_VALUE;
        return this.f13435f.b(this);
    }
}
