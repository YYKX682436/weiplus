package t00;

/* loaded from: classes.dex */
public final class d implements t00.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t00.c f495805a = new t00.c(null);

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495856d;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CheckActionEcsActionHandler", "params not set");
            callback.a();
            return;
        }
        org.json.JSONObject a17 = f495805a.a(optJSONObject, i17);
        if (a17 != null) {
            callback.b(a17);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            callback.a();
        }
    }
}
