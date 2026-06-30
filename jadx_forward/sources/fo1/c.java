package fo1;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f346390e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.l lVar, po1.d dVar) {
        super(1);
        this.f346389d = lVar;
        this.f346390e = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        po1.d dVar = this.f346390e;
        yz5.l lVar = this.f346389d;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AutoBindHelper", "bind result is null, maybe timeout.");
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        } else {
            try {
                java.lang.String optString = jSONObject.optString("bindId", "");
                boolean a17 = fo1.d.f346391a.a(jSONObject, "bindResult", false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                if (!(optString.length() == 0) && a17) {
                    v32.f fVar = new v32.f();
                    fVar.f67434x5fdff3b6 = jSONObject.getString("deviceId");
                    fVar.f67437x21eb2633 = jSONObject.getString("deviceName");
                    fVar.f67438x12d71904 = jSONObject.getInt("deviceType");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.aj().mo11260x413cb2b4(fVar);
                    java.lang.String field_deviceId = fVar.f67434x5fdff3b6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_deviceId, "field_deviceId");
                    dVar.getClass();
                    dVar.f438828a = field_deviceId;
                    java.lang.String str = fVar.f67437x21eb2633;
                    if (str != null) {
                        dVar.f438830c = str;
                    }
                    if (str != null) {
                        dVar.f438831d = str;
                    }
                    dVar.f438829b = po1.g.f438839d.a(fVar.f67438x12d71904);
                    oo1.o.f428684a.a(dVar.f438828a);
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AutoBindHelper", "Fail to bind. bindId is " + optString + ", isSuccess=" + a17);
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            } catch (cl0.f e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AutoBindHelper", e17, "Fail to parse value from json. jsonObj=" + jSONObject, new java.lang.Object[0]);
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f384359a;
    }
}
