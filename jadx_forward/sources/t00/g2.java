package t00;

/* loaded from: classes.dex */
public final class g2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495863k;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendThanksActionHandler", "handleAction context null");
            callback.a();
            return;
        }
        java.lang.String optString = data.optString("orderId");
        if (optString == null || optString.length() == 0) {
            callback.a();
            return;
        }
        c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        ((j00.d2) m3Var).Ui(context, optString, new t00.f2(callback));
    }
}
