package c80;

/* loaded from: classes12.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f39646d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f39647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c80.e f39648f;

    /* renamed from: g, reason: collision with root package name */
    public int f39649g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c80.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f39648f = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f39647e = obj;
        this.f39649g |= Integer.MIN_VALUE;
        return this.f39648f.U6(null, this);
    }
}
