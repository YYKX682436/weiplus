package bg2;

/* loaded from: classes.dex */
public final class z4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f20706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(kotlin.coroutines.Continuation continuation) {
        super(0);
        this.f20706d = continuation;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f20706d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        return jz5.f0.f302826a;
    }
}
