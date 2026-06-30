package az0;

/* loaded from: classes16.dex */
public final class s8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15889e;

    /* renamed from: f, reason: collision with root package name */
    public int f15890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(az0.s9 s9Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15889e = s9Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15888d = obj;
        this.f15890f |= Integer.MIN_VALUE;
        return this.f15889e.m0(this);
    }
}
