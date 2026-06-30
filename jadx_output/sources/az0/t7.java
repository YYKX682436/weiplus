package az0;

/* loaded from: classes16.dex */
public final class t7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(java.lang.String str) {
        super(2);
        this.f15918d = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamSession camSession = (com.tencent.maas.camstudio.MJCamSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camSession, "camSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camSession.e(this.f15918d, new az0.x8(cb6));
        return jz5.f0.f302826a;
    }
}
