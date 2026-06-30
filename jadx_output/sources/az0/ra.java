package az0;

/* loaded from: classes5.dex */
public final class ra implements com.tencent.maas.camstudio.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamoSession f15869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15870b;

    public ra(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, yz5.l lVar) {
        this.f15869a = mJCamoSession;
        this.f15870b = lVar;
    }

    @Override // com.tencent.maas.camstudio.d0
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "teardown finish");
        this.f15869a.P();
        this.f15870b.invoke(mJError);
    }
}
