package aq5;

/* loaded from: classes5.dex */
public final class v extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq5.y f13306e;

    /* renamed from: f, reason: collision with root package name */
    public int f13307f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(aq5.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13306e = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13305d = obj;
        this.f13307f |= Integer.MIN_VALUE;
        return this.f13306e.f(0, null, this);
    }
}
