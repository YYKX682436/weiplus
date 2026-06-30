package c01;

/* loaded from: classes4.dex */
public final class h1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f37221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.k1 f37222e;

    /* renamed from: f, reason: collision with root package name */
    public int f37223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(c01.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f37222e = k1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f37221d = obj;
        this.f37223f |= Integer.MIN_VALUE;
        return this.f37222e.a(null, null, this);
    }
}
