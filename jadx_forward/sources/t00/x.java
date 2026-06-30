package t00;

/* loaded from: classes7.dex */
public final class x implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495857e;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String Bi = ((j00.u1) ((c00.i3) i95.n0.c(c00.i3.class))).Bi();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("ticket", Bi);
        callback.b(jSONObject2);
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
