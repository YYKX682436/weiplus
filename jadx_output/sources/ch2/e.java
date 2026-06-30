package ch2;

/* loaded from: classes10.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f41311d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f41312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ch2.q f41313f;

    /* renamed from: g, reason: collision with root package name */
    public int f41314g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ch2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f41313f = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f41312e = obj;
        this.f41314g |= Integer.MIN_VALUE;
        return ch2.q.Z6(this.f41313f, this);
    }
}
