package gh1;

/* loaded from: classes7.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "postMessageToMiniprogram";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        fh1.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        fh1.x0 x0Var = (fh1.x0) this.f399423a;
        if (x0Var == null || (iVar = x0Var.f344155x) == null) {
            s().mo146xb9724478(i(lc3.x.f399469c));
            return;
        }
        java.lang.String optString = data.optString("appId");
        if (optString == null || optString.length() == 0) {
            s().mo146xb9724478(i(lc3.x.f399470d));
            return;
        }
        java.lang.String optString2 = data.optString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        fh1.z zVar = (fh1.z) iVar;
        if (u46.l.c(zVar.f344160a.f156336n, optString) && (C0 = zVar.f344160a.C0()) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (optString2 == null) {
                optString2 = "";
            }
            C0.g("onMessageFromMagicBrushFrame", jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, optString2).put("biz", zVar.f344161b).toString());
        }
        s().mo146xb9724478(k());
    }
}
