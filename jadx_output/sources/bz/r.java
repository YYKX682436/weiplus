package bz;

/* loaded from: classes10.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f36702d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f36703e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f36704f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f36705g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bz.w f36706h;

    /* renamed from: i, reason: collision with root package name */
    public int f36707i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(bz.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f36706h = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f36705g = obj;
        this.f36707i |= Integer.MIN_VALUE;
        return bz.w.c(this.f36706h, null, this);
    }
}
