package ch2;

/* loaded from: classes10.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f41344d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f41345e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f41346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41347g;

    /* renamed from: h, reason: collision with root package name */
    public int f41348h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f41347g = o2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f41346f = obj;
        this.f41348h |= Integer.MIN_VALUE;
        return this.f41347g.s7(null, null, this);
    }
}
