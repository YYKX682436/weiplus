package aq5;

/* loaded from: classes5.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f13279d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f13280e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f13281f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f13282g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f13283h;

    /* renamed from: i, reason: collision with root package name */
    public int f13284i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13285m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ aq5.y f13286n;

    /* renamed from: o, reason: collision with root package name */
    public int f13287o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(aq5.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f13286n = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13285m = obj;
        this.f13287o |= Integer.MIN_VALUE;
        return this.f13286n.c(null, null, null, this);
    }
}
