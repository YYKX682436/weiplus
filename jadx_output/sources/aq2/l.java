package aq2;

/* loaded from: classes2.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13148d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13149e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13150f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aq2.m f13151g;

    /* renamed from: h, reason: collision with root package name */
    public int f13152h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(aq2.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13151g = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13150f = obj;
        this.f13152h |= Integer.MIN_VALUE;
        return this.f13151g.i(false, this);
    }
}
