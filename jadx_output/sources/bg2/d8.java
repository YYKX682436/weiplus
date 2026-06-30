package bg2;

/* loaded from: classes2.dex */
public final class d8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20037d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f20038e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f20039f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20040g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20041h;

    /* renamed from: i, reason: collision with root package name */
    public int f20042i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(bg2.l8 l8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f20041h = l8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f20040g = obj;
        this.f20042i |= Integer.MIN_VALUE;
        return bg2.l8.b7(this.f20041h, 0, null, this);
    }
}
