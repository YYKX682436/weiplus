package az0;

/* loaded from: classes16.dex */
public final class m9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamPreviewSettings f15717e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(az0.s9 s9Var, com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings) {
        super(2);
        this.f15716d = s9Var;
        this.f15717e = mJCamPreviewSettings;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamSession camSession = (com.tencent.maas.camstudio.MJCamSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camSession, "camSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        az0.s9.b(this.f15716d, null);
        camSession.Y(this.f15717e, new az0.x8(cb6));
        return jz5.f0.f302826a;
    }
}
