package aq;

/* loaded from: classes14.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f12862d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f12863e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aq.r0 f12865g;

    /* renamed from: h, reason: collision with root package name */
    public int f12866h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(aq.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f12865g = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f12864f = obj;
        this.f12866h |= Integer.MIN_VALUE;
        return aq.r0.c(this.f12865g, null, null, this);
    }
}
