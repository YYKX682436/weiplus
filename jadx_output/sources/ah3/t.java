package ah3;

/* loaded from: classes12.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f4952d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f4953e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f4954f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f4955g;

    /* renamed from: h, reason: collision with root package name */
    public long f4956h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4957i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ah3.v f4958m;

    /* renamed from: n, reason: collision with root package name */
    public int f4959n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ah3.v vVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f4958m = vVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4957i = obj;
        this.f4959n |= Integer.MIN_VALUE;
        return ah3.v.b(this.f4958m, null, null, null, null, this);
    }
}
