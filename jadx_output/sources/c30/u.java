package c30;

/* loaded from: classes11.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.f0 f38163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(c30.f0 f0Var) {
        super(0);
        this.f38163d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("EcsWeShopMgr", "on fetchDataTrigger");
        c30.f0 f0Var = this.f38163d;
        c30.f0.wi(f0Var, f0Var.f38119m.incrementAndGet());
        return jz5.f0.f302826a;
    }
}
