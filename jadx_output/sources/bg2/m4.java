package bg2;

/* loaded from: classes2.dex */
public final class m4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20303d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.o4 f20305f;

    /* renamed from: g, reason: collision with root package name */
    public int f20306g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(bg2.o4 o4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f20305f = o4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f20304e = obj;
        this.f20306g |= Integer.MIN_VALUE;
        return this.f20305f.b7(this);
    }
}
