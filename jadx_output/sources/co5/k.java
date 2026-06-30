package co5;

/* loaded from: classes11.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f43849d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f43850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ co5.p f43851f;

    /* renamed from: g, reason: collision with root package name */
    public int f43852g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(co5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f43851f = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f43850e = obj;
        this.f43852g |= Integer.MIN_VALUE;
        return this.f43851f.Ai(null, this);
    }
}
