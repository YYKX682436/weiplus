package aq5;

/* loaded from: classes5.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13296d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f13297e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f13298f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13299g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aq5.y f13300h;

    /* renamed from: i, reason: collision with root package name */
    public int f13301i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(aq5.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13300h = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13299g = obj;
        this.f13301i |= Integer.MIN_VALUE;
        return this.f13300h.e(null, this);
    }
}
