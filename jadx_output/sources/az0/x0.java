package az0;

/* loaded from: classes16.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f16031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f16032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.q f16033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.u f16034g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(az0.f2 f2Var, java.lang.String str, com.tencent.maas.camstudio.q qVar, com.tencent.maas.camstudio.u uVar) {
        super(1);
        this.f16031d = f2Var;
        this.f16032e = str;
        this.f16033f = qVar;
        this.f16034g = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l it = (yz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager = this.f16031d.f15461e;
        az0.g1 g1Var = new az0.g1(it);
        mJCamResourceManager.n(this.f16032e, this.f16033f, this.f16034g, g1Var);
        return jz5.f0.f302826a;
    }
}
