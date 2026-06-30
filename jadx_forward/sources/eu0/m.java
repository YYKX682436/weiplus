package eu0;

/* loaded from: classes5.dex */
public final class m {
    public m(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final eu0.n a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String optString = jSONObject.optString("musicID", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        java.lang.String optString2 = jSONObject.optString("musicName", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        java.lang.String optString3 = jSONObject.optString("authorName", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
        java.lang.String optString4 = jSONObject.optString("coverUrl", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
        java.lang.String optString5 = jSONObject.optString("musicFilePath", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString5, "optString(...)");
        return new eu0.n(optString, optString2, optString3, optString4, optString5, jSONObject.optLong("durationInMs", 0L), jSONObject.optBoolean("isMusicOn", true));
    }
}
