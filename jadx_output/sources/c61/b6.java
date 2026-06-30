package c61;

/* loaded from: classes10.dex */
public final class b6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f38891d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f38892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f38893f;

    /* renamed from: g, reason: collision with root package name */
    public int f38894g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(c61.l7 l7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f38893f = l7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f38892e = obj;
        this.f38894g |= Integer.MIN_VALUE;
        return this.f38893f.kk(null, null, false, this);
    }
}
