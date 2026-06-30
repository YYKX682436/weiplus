package a82;

/* loaded from: classes12.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f2188d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f2189e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f2190f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f2191g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f2192h;

    /* renamed from: i, reason: collision with root package name */
    public int f2193i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2194m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2195n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a82.d0 f2196o;

    /* renamed from: p, reason: collision with root package name */
    public int f2197p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a82.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f2196o = d0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f2195n = obj;
        this.f2197p |= Integer.MIN_VALUE;
        return a82.d0.a7(this.f2196o, null, null, this);
    }
}
