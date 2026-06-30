package lc3;

/* loaded from: classes.dex */
public final class a0 extends org.json.JSONObject {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String data) {
        super(data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    public final java.lang.String a() {
        if (opt("errCode") == null) {
            return "{\"errMsg\":\"No error code found\", \"errCode\": -3}";
        }
        java.lang.String jSONObject = toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.util.Map map) {
        super(map);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
    }
}
