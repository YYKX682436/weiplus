package fy;

/* loaded from: classes.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.k f348705d = new fy.k();

    public k() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        org.json.JSONObject param = (org.json.JSONObject) obj;
        yz5.l onComplete = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCall", "ask_confirm_send_msg invoke");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.f77504xbb80cbe3, true);
        onComplete.mo146xb9724478(jSONObject);
        return jz5.f0.f384359a;
    }
}
