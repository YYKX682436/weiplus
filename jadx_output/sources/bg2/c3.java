package bg2;

/* loaded from: classes2.dex */
public final class c3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f19974d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f19975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f19976f;

    /* renamed from: g, reason: collision with root package name */
    public int f19977g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(bg2.z3 z3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f19976f = z3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f19975e = obj;
        this.f19977g |= Integer.MIN_VALUE;
        return this.f19976f.Z6(this);
    }
}
