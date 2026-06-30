package az0;

/* loaded from: classes16.dex */
public final class rb implements com.tencent.maas.camstudio.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamoSession f15872b;

    public rb(yz5.l lVar, com.tencent.maas.camstudio.MJCamoSession mJCamoSession) {
        this.f15871a = lVar;
        this.f15872b = mJCamoSession;
    }

    @Override // com.tencent.maas.camstudio.d0
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        this.f15871a.invoke(mJError);
        if (mJError == null) {
            this.f15872b.t0();
        }
    }
}
