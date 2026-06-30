package az0;

/* loaded from: classes5.dex */
public final class g9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(az0.s9 s9Var, yz5.l lVar) {
        super(2);
        this.f15506d = s9Var;
        this.f15507e = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamSession camSession = (com.tencent.maas.camstudio.MJCamSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camSession, "camSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camSession.P(new az0.f9(this.f15506d, this.f15507e, cb6));
        return jz5.f0.f302826a;
    }
}
