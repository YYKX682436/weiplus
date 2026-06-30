package az0;

/* loaded from: classes5.dex */
public final class m5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15702d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15703e;

    /* renamed from: f, reason: collision with root package name */
    public int f15704f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15705g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15706h;

    /* renamed from: i, reason: collision with root package name */
    public int f15707i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15706h = n7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15705g = obj;
        this.f15707i |= Integer.MIN_VALUE;
        return this.f15706h.c(null, this);
    }
}
