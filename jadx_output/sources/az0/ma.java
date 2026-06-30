package az0;

/* loaded from: classes16.dex */
public final class ma extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.u f15720f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(az0.xb xbVar, java.lang.String str, com.tencent.maas.camstudio.u uVar) {
        super(2);
        this.f15718d = xbVar;
        this.f15719e = str;
        this.f15720f = uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yz5.l cb6 = (yz5.l) obj2;
        kotlin.jvm.internal.o.g((com.tencent.maas.camstudio.MJCamoSession) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(cb6, "cb");
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f15718d.f16060i;
        if (mJCamoSession != null) {
            mJCamoSession.E(this.f15719e, this.f15720f, new az0.xa(cb6));
        }
        return jz5.f0.f302826a;
    }
}
