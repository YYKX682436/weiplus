package wq5;

/* loaded from: classes8.dex */
public final class l {
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final org.json.JSONObject a(java.lang.String xml) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        try {
            java.lang.Character ch6 = wq5.i.f530244a;
            wq5.j jVar = wq5.j.f530253e;
            java.io.StringReader stringReader = new java.io.StringReader(xml);
            wq5.e eVar = new wq5.e();
            wq5.k kVar = new wq5.k(stringReader);
            while (kVar.b()) {
                kVar.i("<");
                if (kVar.b()) {
                    wq5.i.b(kVar, eVar, null, jVar);
                }
            }
            return new org.json.JSONObject(eVar.m174329x9616526c());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Json.XmlToJsonUtil", e17, "toJsonString", new java.lang.Object[0]);
            return null;
        }
    }
}
