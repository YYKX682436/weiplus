package ah3;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f4911d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ah3.v f4913f;

    /* renamed from: g, reason: collision with root package name */
    public int f4914g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ah3.v vVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f4913f = vVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4912e = obj;
        this.f4914g |= Integer.MIN_VALUE;
        return this.f4913f.c(null, this);
    }
}
