package az0;

/* loaded from: classes16.dex */
public final class b8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final az0.b8 f15365d = new az0.b8();

    public b8() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamSession camSession = (com.tencent.maas.camstudio.MJCamSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camSession, "camSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camSession.d0(new com.tencent.maas.camstudio.MJCamMusicDesc(), new az0.x8(cb6));
        return jz5.f0.f302826a;
    }
}
