package az0;

/* loaded from: classes16.dex */
public final class d8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamSpatialDesc f15410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc) {
        super(2);
        this.f15410d = mJCamSpatialDesc;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamSession camSession = (com.tencent.maas.camstudio.MJCamSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camSession, "camSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camSession.l(this.f15410d, new az0.x8(cb6));
        return jz5.f0.f302826a;
    }
}
