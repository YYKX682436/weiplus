package ch2;

/* loaded from: classes10.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ om2.r f41413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(om2.r rVar) {
        super(1);
        this.f41413d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        dn.h hVar;
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct it = (com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct) obj;
        kotlin.jvm.internal.o.g(it, "it");
        om2.r rVar = this.f41413d;
        zy.a aVar = rVar.f346376b;
        if (aVar != null && (hVar = aVar.f477288e) != null) {
            it.f57161k = hVar.field_retCode;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("httpCode", hVar.field_httpStatusCode);
            jSONObject.put("responseHeader", hVar.field_httpResponseHeader);
            jSONObject.put("serverIp", hVar.field_serverIP);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            it.p(r26.i0.t(jSONObject2, ",", ";", false));
        }
        zy.a aVar2 = rVar.f346376b;
        java.lang.String str3 = "";
        if (aVar2 == null || (str = aVar2.f477289f) == null) {
            str = "";
        }
        it.q(str);
        if (rVar.f346375a == om2.c.f346278f) {
            if (aVar2 != null && (str2 = aVar2.f477287d) != null) {
                str3 = str2;
            }
            it.p(str3);
        }
        return jz5.f0.f302826a;
    }
}
