package c61;

/* loaded from: classes10.dex */
public final class d2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f38929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c61.p2 f38930e;

    /* renamed from: f, reason: collision with root package name */
    public int f38931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(c61.p2 p2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f38930e = p2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f38929d = obj;
        this.f38931f |= Integer.MIN_VALUE;
        return this.f38930e.Di(0L, this);
    }
}
