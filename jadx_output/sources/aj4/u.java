package aj4;

/* loaded from: classes10.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f5373d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj4.v f5375f;

    /* renamed from: g, reason: collision with root package name */
    public int f5376g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(aj4.v vVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f5375f = vVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5374e = obj;
        this.f5376g |= Integer.MIN_VALUE;
        return aj4.v.a(this.f5375f, null, this);
    }
}
