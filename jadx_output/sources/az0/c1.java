package az0;

/* loaded from: classes5.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(az0.f2 f2Var) {
        super(1);
        this.f15374d = f2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l complete = (yz5.l) obj;
        kotlin.jvm.internal.o.g(complete, "complete");
        az0.f2 f2Var = this.f15374d;
        f2Var.f15465i = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "teardown start");
        f2Var.f15460d.b0(new az0.b1(f2Var, complete));
        com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager = f2Var.f15461e;
        mJCamResourceManager.a();
        mJCamResourceManager.q();
        return jz5.f0.f302826a;
    }
}
