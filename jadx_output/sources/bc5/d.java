package bc5;

/* loaded from: classes9.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f19179d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f19180e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19181f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f19182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bc5.e f19183h;

    /* renamed from: i, reason: collision with root package name */
    public int f19184i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bc5.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f19183h = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f19182g = obj;
        this.f19184i |= Integer.MIN_VALUE;
        return this.f19183h.f(false, false, false, false, this);
    }
}
