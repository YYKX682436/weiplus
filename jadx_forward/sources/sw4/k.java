package sw4;

/* loaded from: classes8.dex */
public class k implements sw4.h {
    @Override // sw4.h
    public void a(android.content.Context context, android.os.Bundle bundle, sw4.e eVar) {
        java.lang.String string = bundle.getString("jsapi_name");
        java.lang.String string2 = bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (string == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMMActivityTask", "jsapi is null");
            eVar.f(new android.os.Bundle());
            return;
        }
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5) java.lang.Class.forName(string).newInstance()).d(context, string2, new sw4.j(this, eVar));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiMMActivityTask", e17, "", new java.lang.Object[0]);
            eVar.f(new android.os.Bundle());
        }
    }
}
