package az0;

/* loaded from: classes5.dex */
public final class cb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f15397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(az0.xb xbVar, java.util.List list) {
        super(1);
        this.f15396d = xbVar;
        this.f15397e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.p it = (yz5.p) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = this.f15396d.f16060i;
        if (mJCamoSession != null) {
            mJCamoSession.T(this.f15397e, null, new az0.bb(it));
        }
        return jz5.f0.f302826a;
    }
}
