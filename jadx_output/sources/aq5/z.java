package aq5;

/* loaded from: classes5.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq5.p0 f13353e;

    /* renamed from: f, reason: collision with root package name */
    public int f13354f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(aq5.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13353e = p0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13352d = obj;
        this.f13354f |= Integer.MIN_VALUE;
        return this.f13353e.b(null, this);
    }
}
