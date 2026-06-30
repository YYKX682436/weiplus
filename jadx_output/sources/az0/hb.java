package az0;

/* loaded from: classes16.dex */
public final class hb extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamFilterDesc f15540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(com.tencent.maas.camstudio.MJCamFilterDesc mJCamFilterDesc) {
        super(2);
        this.f15540d = mJCamFilterDesc;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamoSession camoSession = (com.tencent.maas.camstudio.MJCamoSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camoSession, "camoSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camoSession.e0(this.f15540d, new az0.za(cb6));
        return jz5.f0.f302826a;
    }
}
