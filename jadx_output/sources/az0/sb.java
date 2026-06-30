package az0;

/* loaded from: classes16.dex */
public final class sb extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamPreviewSettings f15903f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(az0.xb xbVar, yz5.l lVar, com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings) {
        super(2);
        this.f15901d = xbVar;
        this.f15902e = lVar;
        this.f15903f = mJCamPreviewSettings;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamoSession camoSession = (com.tencent.maas.camstudio.MJCamoSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camoSession, "camoSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        az0.xb.O0(this.f15901d, this.f15902e);
        camoSession.r0(this.f15903f, new az0.rb(cb6, camoSession));
        return jz5.f0.f302826a;
    }
}
