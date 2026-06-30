package aq5;

/* loaded from: classes5.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13250d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aq5.o f13252f;

    /* renamed from: g, reason: collision with root package name */
    public int f13253g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(aq5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13252f = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13251e = obj;
        this.f13253g |= Integer.MIN_VALUE;
        return this.f13252f.e(this);
    }
}
