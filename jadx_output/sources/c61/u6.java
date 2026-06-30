package c61;

/* loaded from: classes10.dex */
public final class u6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f39322d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f39323e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f39324f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f39325g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f39326h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f39327i;

    /* renamed from: m, reason: collision with root package name */
    public int f39328m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(c61.l7 l7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f39327i = l7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f39326h = obj;
        this.f39328m |= Integer.MIN_VALUE;
        return this.f39327i.Sk(null, null, 0L, 0L, null, null, this);
    }
}
