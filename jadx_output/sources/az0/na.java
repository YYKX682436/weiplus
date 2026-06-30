package az0;

/* loaded from: classes16.dex */
public final class na extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.q f15753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.u f15754f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(java.lang.String str, com.tencent.maas.camstudio.q qVar, com.tencent.maas.camstudio.u uVar) {
        super(2);
        this.f15752d = str;
        this.f15753e = qVar;
        this.f15754f = uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamoSession camoSession = (com.tencent.maas.camstudio.MJCamoSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camoSession, "camoSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        az0.xa xaVar = new az0.xa(cb6);
        camoSession.F(this.f15752d, this.f15753e, this.f15754f, xaVar);
        return jz5.f0.f302826a;
    }
}
