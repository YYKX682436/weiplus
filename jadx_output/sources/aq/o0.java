package aq;

/* loaded from: classes14.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f12923d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f12924e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f12925f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aq.r0 f12927h;

    /* renamed from: i, reason: collision with root package name */
    public int f12928i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(aq.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f12927h = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f12926g = obj;
        this.f12928i |= Integer.MIN_VALUE;
        return this.f12927h.l(this);
    }
}
