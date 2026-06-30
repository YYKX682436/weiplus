package cf;

/* loaded from: classes7.dex */
public abstract class f {
    public static final org.json.JSONObject a(org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        java.lang.String[] strArr = new java.lang.String[jSONObject.length()];
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        int i17 = 0;
        while (keys.hasNext()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            kz5.u0 u0Var = new kz5.u0(i17, keys.next());
            strArr[u0Var.f395548a] = (java.lang.String) u0Var.f395549b;
            i17 = i18;
        }
        return new org.json.JSONObject(jSONObject, strArr);
    }

    public static final void b(org.json.JSONArray jSONArray, yz5.l block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONArray, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            block.mo146xb9724478(jSONArray.get(i17));
        }
    }
}
