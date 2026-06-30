package i04;

/* loaded from: classes8.dex */
public abstract class j {
    public static final java.lang.Object a(org.json.JSONArray jSONArray, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONArray, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONArray.get(i17), key)) {
                return jSONArray.remove(i17);
            }
        }
        return null;
    }
}
