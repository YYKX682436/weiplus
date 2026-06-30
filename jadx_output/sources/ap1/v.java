package ap1;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f12747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f12748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j17, java.util.Map map) {
        super(1);
        this.f12747d = j17;
        this.f12748e = map;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String message;
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct it = (com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.f60073k = this.f12747d;
        java.util.Map dict = this.f12748e;
        kotlin.jvm.internal.o.g(dict, "dict");
        try {
            java.lang.String jSONObject = new org.json.JSONObject(dict).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            message = r26.i0.t(jSONObject, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RoamReport28098", e17, "json error", new java.lang.Object[0]);
            message = e17.getMessage();
        }
        it.p(message);
        return jz5.f0.f302826a;
    }
}
