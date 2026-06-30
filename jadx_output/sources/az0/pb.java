package az0;

/* loaded from: classes16.dex */
public final class pb implements com.tencent.maas.camstudio.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamoSession f15816b;

    public pb(yz5.l lVar, com.tencent.maas.camstudio.MJCamoSession mJCamoSession) {
        this.f15815a = lVar;
        this.f15816b = mJCamoSession;
    }

    @Override // com.tencent.maas.camstudio.d0
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        this.f15815a.invoke(mJError);
        if (mJError == null) {
            this.f15816b.t0();
        }
    }
}
