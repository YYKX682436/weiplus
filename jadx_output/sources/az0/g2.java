package az0;

/* loaded from: classes5.dex */
public final class g2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.l2 f15492e;

    /* renamed from: f, reason: collision with root package name */
    public int f15493f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(az0.l2 l2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15492e = l2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15491d = obj;
        this.f15493f |= Integer.MIN_VALUE;
        return this.f15492e.a(this);
    }
}
