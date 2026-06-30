package az0;

/* loaded from: classes16.dex */
public final class fb extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJBeautyAdjustmentDesc f15478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc) {
        super(2);
        this.f15478d = mJBeautyAdjustmentDesc;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamoSession camoSession = (com.tencent.maas.camstudio.MJCamoSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camoSession, "camoSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camoSession.Y(this.f15478d, new az0.za(cb6));
        return jz5.f0.f302826a;
    }
}
