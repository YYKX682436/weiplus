package qx4;

/* loaded from: classes.dex */
public final class n0 {
    public n0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String eventId, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("__msg_type", "event");
            jSONObject.put("__event_id", eventId);
            if (map != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                for (java.util.Map.Entry entry : map.entrySet()) {
                    try {
                        jSONObject2.put((java.lang.String) entry.getKey(), entry.getValue());
                    } catch (java.lang.Exception unused) {
                    }
                }
                jSONObject.put("__params", jSONObject2);
            }
        } catch (java.lang.Exception unused2) {
        }
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        return jSONObject3;
    }
}
