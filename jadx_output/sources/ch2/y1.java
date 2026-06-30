package ch2;

/* loaded from: classes10.dex */
public final class y1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f41494d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f41495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41496f;

    /* renamed from: g, reason: collision with root package name */
    public int f41497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f41496f = o2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f41495e = obj;
        this.f41497g |= Integer.MIN_VALUE;
        return this.f41496f.D7(null, null, this);
    }
}
