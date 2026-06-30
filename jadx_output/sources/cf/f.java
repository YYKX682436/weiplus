package cf;

/* loaded from: classes7.dex */
public abstract class f {
    public static final org.json.JSONObject a(org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        java.lang.String[] strArr = new java.lang.String[jSONObject.length()];
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        int i17 = 0;
        while (keys.hasNext()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            kz5.u0 u0Var = new kz5.u0(i17, keys.next());
            strArr[u0Var.f314015a] = (java.lang.String) u0Var.f314016b;
            i17 = i18;
        }
        return new org.json.JSONObject(jSONObject, strArr);
    }

    public static final void b(org.json.JSONArray jSONArray, yz5.l block) {
        kotlin.jvm.internal.o.g(jSONArray, "<this>");
        kotlin.jvm.internal.o.g(block, "block");
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            block.invoke(jSONArray.get(i17));
        }
    }
}
