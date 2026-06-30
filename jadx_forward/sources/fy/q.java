package fy;

/* loaded from: classes8.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.q f348711d = new fy.q();

    public q() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        int i17;
        org.json.JSONObject param = (org.json.JSONObject) obj;
        yz5.l onComplete = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        try {
            str = param.getString("chat_id");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        try {
            i17 = param.getInt("voip_scene");
        } catch (java.lang.Exception unused2) {
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCall", "make_voice_call invoke param: " + str + ' ' + i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (str.length() == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.f77504xbb80cbe3, false);
            jSONObject.put("error_message", "chat_id is required");
            onComplete.mo146xb9724478(jSONObject);
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
            am.y00 y00Var = c6231x4f3054ba.f136478g;
            y00Var.f89948b = 5;
            y00Var.f89951e = str;
            y00Var.f89950d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            y00Var.f89952f = i17 == 0 ? 4 : 2;
            c6231x4f3054ba.e();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(ya.b.f77504xbb80cbe3, true);
            onComplete.mo146xb9724478(jSONObject2);
        }
        return jz5.f0.f384359a;
    }
}
