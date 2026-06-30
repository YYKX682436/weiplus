package aq;

/* loaded from: classes14.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f12916d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aq.r0 f12918f;

    /* renamed from: g, reason: collision with root package name */
    public int f12919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(aq.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f12918f = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f12917e = obj;
        this.f12919g |= Integer.MIN_VALUE;
        return this.f12918f.k(this);
    }
}
