package az0;

/* loaded from: classes5.dex */
public final class p8 implements com.tencent.maas.camstudio.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamSession f15811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15812b;

    public p8(com.tencent.maas.camstudio.MJCamSession mJCamSession, yz5.l lVar) {
        this.f15811a = mJCamSession;
        this.f15812b = lVar;
    }

    @Override // com.tencent.maas.camstudio.d0
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamSession", "teardown finish");
        this.f15811a.z();
        this.f15812b.invoke(mJError);
    }
}
