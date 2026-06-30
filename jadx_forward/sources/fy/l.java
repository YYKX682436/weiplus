package fy;

/* loaded from: classes9.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.l f348706d = new fy.l();

    public l() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        org.json.JSONObject param = (org.json.JSONObject) obj;
        yz5.l onComplete = (yz5.l) obj2;
        java.lang.String str2 = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCall", "send_text_message invoke");
        try {
            str = param.getString("chat_id");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        try {
            str2 = param.getString("content");
        } catch (java.lang.Exception unused2) {
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (str.length() == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.f77504xbb80cbe3, false);
            jSONObject.put("error_message", "chat_id is required");
            onComplete.mo146xb9724478(jSONObject);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            if (str2.length() == 0) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(ya.b.f77504xbb80cbe3, false);
                jSONObject2.put("error_message", "content is required");
                onComplete.mo146xb9724478(jSONObject2);
            } else {
                w11.r1 b17 = w11.s1.b(str, null, 2, null);
                b17.f523663e = 1;
                b17.f523664f = 0;
                b17.e(str2);
                b17.g(str);
                b17.f523666h = null;
                b17.f523673o = null;
                b17.f523667i = 5;
                if (b17.a().a()) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put(ya.b.f77504xbb80cbe3, true);
                    onComplete.mo146xb9724478(jSONObject3);
                } else {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put(ya.b.f77504xbb80cbe3, false);
                    jSONObject4.put("error_message", "send message failed");
                    onComplete.mo146xb9724478(jSONObject4);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
