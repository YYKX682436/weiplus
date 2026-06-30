package az0;

/* loaded from: classes16.dex */
public final class wb extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamMusicDesc f16029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc) {
        super(2);
        this.f16029d = mJCamMusicDesc;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamoSession camoSession = (com.tencent.maas.camstudio.MJCamoSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camoSession, "camoSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camoSession.y0(this.f16029d, new az0.za(cb6));
        return jz5.f0.f302826a;
    }
}
