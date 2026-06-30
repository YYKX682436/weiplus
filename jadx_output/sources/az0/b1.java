package az0;

/* loaded from: classes5.dex */
public final class b1 implements com.tencent.maas.camstudio.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15347b;

    public b1(az0.f2 f2Var, yz5.l lVar) {
        this.f15346a = f2Var;
        this.f15347b = lVar;
    }

    @Override // com.tencent.maas.camstudio.d0
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasImproveCamManager", "teardown finish");
        this.f15346a.f15460d.z();
        this.f15347b.invoke(mJError);
    }
}
