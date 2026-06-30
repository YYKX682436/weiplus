package az0;

/* loaded from: classes16.dex */
public final class qb extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamPreviewSettings f15848e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(az0.xb xbVar, com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings) {
        super(2);
        this.f15847d = xbVar;
        this.f15848e = mJCamPreviewSettings;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamoSession camoSession = (com.tencent.maas.camstudio.MJCamoSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camoSession, "camoSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        az0.xb.O0(this.f15847d, null);
        camoSession.r0(this.f15848e, new az0.pb(cb6, camoSession));
        return jz5.f0.f302826a;
    }
}
