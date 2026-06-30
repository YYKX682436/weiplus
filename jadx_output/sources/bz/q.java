package bz;

/* loaded from: classes10.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f36696d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f36697e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f36698f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f36699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bz.w f36700h;

    /* renamed from: i, reason: collision with root package name */
    public int f36701i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(bz.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f36700h = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f36699g = obj;
        this.f36701i |= Integer.MIN_VALUE;
        return bz.w.b(this.f36700h, null, this);
    }
}
