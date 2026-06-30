package a03;

/* loaded from: classes11.dex */
public final class a0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f386d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f387e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f388f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f389g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f390h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f391i;

    /* renamed from: m, reason: collision with root package name */
    public int f392m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(a03.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f391i = h0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f390h = obj;
        this.f392m |= Integer.MIN_VALUE;
        return this.f391i.hj(null, null, this);
    }
}
