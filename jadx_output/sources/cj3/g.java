package cj3;

/* loaded from: classes14.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f41889d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f41890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cj3.i f41891f;

    /* renamed from: g, reason: collision with root package name */
    public int f41892g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(cj3.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f41891f = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f41890e = obj;
        this.f41892g |= Integer.MIN_VALUE;
        return this.f41891f.a(this);
    }
}
