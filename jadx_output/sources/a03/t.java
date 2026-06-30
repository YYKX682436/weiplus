package a03;

/* loaded from: classes11.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f453e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f455g;

    /* renamed from: h, reason: collision with root package name */
    public int f456h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a03.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f455g = h0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f454f = obj;
        this.f456h |= Integer.MIN_VALUE;
        return a03.h0.Zi(this.f455g, this);
    }
}
