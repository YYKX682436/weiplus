package aq5;

/* loaded from: classes5.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13257d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aq5.o f13259f;

    /* renamed from: g, reason: collision with root package name */
    public int f13260g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(aq5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13259f = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13258e = obj;
        this.f13260g |= Integer.MIN_VALUE;
        return this.f13259f.f(0, this);
    }
}
