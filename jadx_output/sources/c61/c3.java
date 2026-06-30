package c61;

/* loaded from: classes10.dex */
public final class c3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f38912d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f38913e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f38914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f38915g;

    /* renamed from: h, reason: collision with root package name */
    public int f38916h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(c61.l7 l7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f38915g = l7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f38914f = obj;
        this.f38916h |= Integer.MIN_VALUE;
        return this.f38915g.Ui(null, 0L, 0, this);
    }
}
