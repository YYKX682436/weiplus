package ch2;

/* loaded from: classes10.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ om2.r f122946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(om2.r rVar) {
        super(1);
        this.f122946d = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        dn.h hVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6517xa6e83e44 it = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6517xa6e83e44) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        om2.r rVar = this.f122946d;
        zy.a aVar = rVar.f427909b;
        if (aVar != null && (hVar = aVar.f558821e) != null) {
            it.f138694k = hVar.f69553xb5f54fe9;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("httpCode", hVar.f69533xab94fd8c);
            jSONObject.put("responseHeader", hVar.f69532xac74343b);
            jSONObject.put("serverIp", hVar.f69556x6ff67d4f);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            it.p(r26.i0.t(jSONObject2, ",", ";", false));
        }
        zy.a aVar2 = rVar.f427909b;
        java.lang.String str3 = "";
        if (aVar2 == null || (str = aVar2.f558822f) == null) {
            str = "";
        }
        it.q(str);
        if (rVar.f427908a == om2.c.f427811f) {
            if (aVar2 != null && (str2 = aVar2.f558820d) != null) {
                str3 = str2;
            }
            it.p(str3);
        }
        return jz5.f0.f384359a;
    }
}
