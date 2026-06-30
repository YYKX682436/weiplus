package ch2;

/* loaded from: classes10.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f41315d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f41316e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f41317f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f41318g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f41319h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41320i;

    /* renamed from: m, reason: collision with root package name */
    public int f41321m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f41320i = o2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f41319h = obj;
        this.f41321m |= Integer.MIN_VALUE;
        return this.f41320i.r7(null, null, this);
    }
}
