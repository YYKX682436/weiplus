package aq5;

/* loaded from: classes5.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13245d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aq5.o f13247f;

    /* renamed from: g, reason: collision with root package name */
    public int f13248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(aq5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13247f = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13246e = obj;
        this.f13248g |= Integer.MIN_VALUE;
        return aq5.o.c(this.f13247f, this);
    }
}
