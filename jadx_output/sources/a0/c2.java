package a0;

/* loaded from: classes11.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f97d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(kotlinx.coroutines.flow.i2 i2Var) {
        super(1);
        this.f97d = i2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.i drawBehind = (g1.i) obj;
        kotlin.jvm.internal.o.g(drawBehind, "$this$drawBehind");
        jz5.f0 f0Var = jz5.f0.f302826a;
        this.f97d.e(f0Var);
        return f0Var;
    }
}
