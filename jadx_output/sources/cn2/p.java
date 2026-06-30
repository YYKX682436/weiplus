package cn2;

/* loaded from: classes3.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f43582d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f43583e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f43584f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f43585g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43586h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f43587i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ cn2.c0 f43588m;

    /* renamed from: n, reason: collision with root package name */
    public int f43589n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(cn2.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f43588m = c0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f43587i = obj;
        this.f43589n |= Integer.MIN_VALUE;
        return this.f43588m.h(0L, null, null, null, this);
    }
}
