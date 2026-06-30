package fy;

/* loaded from: classes.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.p f348710d = new fy.p();

    public p() {
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
            str = param.getString("contact_id");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        try {
            i17 = param.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        } catch (java.lang.Exception unused2) {
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCall", "ask_confirm_call invoke param: " + str + ' ' + i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (str.length() == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.f77504xbb80cbe3, false);
            jSONObject.put("error_message", "contact_id is required");
            onComplete.mo146xb9724478(jSONObject);
        } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().j0(str)) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(ya.b.f77504xbb80cbe3, true);
            onComplete.mo146xb9724478(jSONObject2);
        } else {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(ya.b.f77504xbb80cbe3, false);
            jSONObject3.put("error_message", "contact not found");
            onComplete.mo146xb9724478(jSONObject3);
        }
        return jz5.f0.f384359a;
    }
}
