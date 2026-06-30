package ox;

/* loaded from: classes7.dex */
public final class m implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tk.p f431028a;

    public m(tk.p pVar) {
        this.f431028a = pVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.BizPublishImageExternalService", "value = " + str);
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            jSONObject = str.length() > 0 ? new org.json.JSONObject(str) : new org.json.JSONObject();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MircoMsg.BizPublishImageExternalService", e17, "parse json error", new java.lang.Object[0]);
            jSONObject = new org.json.JSONObject();
        }
        this.f431028a.a(true, "", jSONObject);
    }
}
