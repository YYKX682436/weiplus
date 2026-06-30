package aq5;

/* loaded from: classes5.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13221d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f13222e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f13223f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f13224g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13225h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ aq5.p0 f13226i;

    /* renamed from: m, reason: collision with root package name */
    public int f13227m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(aq5.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13226i = p0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13225h = obj;
        this.f13227m |= Integer.MIN_VALUE;
        return this.f13226i.c(this);
    }
}
