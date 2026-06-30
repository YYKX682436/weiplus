package az0;

/* loaded from: classes5.dex */
public final class sa extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamoSession f15900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(com.tencent.maas.camstudio.MJCamoSession mJCamoSession) {
        super(1);
        this.f15900d = mJCamoSession;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l complete = (yz5.l) obj;
        kotlin.jvm.internal.o.g(complete, "complete");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSafeCamoSession", "teardown start");
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f15900d;
        mJCamoSession.i();
        mJCamoSession.w0(new az0.ra(mJCamoSession, complete));
        return jz5.f0.f302826a;
    }
}
