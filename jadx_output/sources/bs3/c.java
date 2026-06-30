package bs3;

/* loaded from: classes4.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f23988d;

    /* renamed from: e, reason: collision with root package name */
    public int f23989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bs3.d f23990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bs3.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f23990f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f23988d = obj;
        this.f23989e |= Integer.MIN_VALUE;
        return this.f23990f.emit(null, this);
    }
}
