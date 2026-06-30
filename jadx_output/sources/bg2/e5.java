package bg2;

/* loaded from: classes2.dex */
public final class e5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20057d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.j5 f20059f;

    /* renamed from: g, reason: collision with root package name */
    public int f20060g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(bg2.j5 j5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f20059f = j5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f20058e = obj;
        this.f20060g |= Integer.MIN_VALUE;
        return bg2.j5.Y6(this.f20059f, null, 0L, this);
    }
}
