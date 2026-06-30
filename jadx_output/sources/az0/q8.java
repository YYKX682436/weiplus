package az0;

/* loaded from: classes5.dex */
public final class q8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamSession f15841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15842e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(com.tencent.maas.camstudio.MJCamSession mJCamSession, az0.s9 s9Var) {
        super(1);
        this.f15841d = mJCamSession;
        this.f15842e = s9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l complete = (yz5.l) obj;
        kotlin.jvm.internal.o.g(complete, "complete");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "teardown start");
        com.tencent.maas.camstudio.MJCamSession mJCamSession = this.f15841d;
        mJCamSession.b0(new az0.p8(mJCamSession, complete));
        az0.s9 s9Var = this.f15842e;
        s9Var.f15891d.a();
        s9Var.f15891d.q();
        return jz5.f0.f302826a;
    }
}
