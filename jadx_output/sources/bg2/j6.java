package bg2;

/* loaded from: classes2.dex */
public final class j6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20205d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f20206e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f20207f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20208g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f20209h;

    /* renamed from: i, reason: collision with root package name */
    public int f20210i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(bg2.q6 q6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f20209h = q6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f20208g = obj;
        this.f20210i |= Integer.MIN_VALUE;
        return bg2.q6.b7(this.f20209h, null, this);
    }
}
