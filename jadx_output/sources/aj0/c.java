package aj0;

/* loaded from: classes11.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f5219d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj0.e f5221f;

    /* renamed from: g, reason: collision with root package name */
    public int f5222g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(aj0.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f5221f = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5220e = obj;
        this.f5222g |= Integer.MIN_VALUE;
        return this.f5221f.a(this);
    }
}
