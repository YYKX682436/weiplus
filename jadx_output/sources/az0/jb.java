package az0;

/* loaded from: classes5.dex */
public final class jb extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(az0.xb xbVar, yz5.l lVar) {
        super(2);
        this.f15612d = xbVar;
        this.f15613e = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.camstudio.MJCamoSession camoSession = (com.tencent.maas.camstudio.MJCamoSession) obj;
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(camoSession, "camoSession");
        kotlin.jvm.internal.o.g(cb6, "cb");
        camoSession.g0(new az0.ib(this.f15612d, this.f15613e, cb6));
        return jz5.f0.f302826a;
    }
}
