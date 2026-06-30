package aq2;

/* loaded from: classes2.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13153d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aq2.o f13155f;

    /* renamed from: g, reason: collision with root package name */
    public int f13156g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(aq2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13155f = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13154e = obj;
        this.f13156g |= Integer.MIN_VALUE;
        return this.f13155f.b(this);
    }
}
