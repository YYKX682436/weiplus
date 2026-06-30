package aq;

/* loaded from: classes14.dex */
public final class b0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq.r0 f12840e;

    /* renamed from: f, reason: collision with root package name */
    public int f12841f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(aq.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f12840e = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f12839d = obj;
        this.f12841f |= Integer.MIN_VALUE;
        return this.f12840e.f(null, null, false, this);
    }
}
