package ho1;

/* loaded from: classes5.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364235f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ho1.a1 a1Var, long j17, java.lang.String str) {
        super(1);
        this.f364233d = a1Var;
        this.f364234e = j17;
        this.f364235f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        java.lang.String str = this.f364235f;
        long j17 = this.f364234e;
        ho1.a1 a1Var = this.f364233d;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(a1Var.f364155a, "bind result is null, maybe timeout.");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e0 e0Var = a1Var.f364156b;
            if (e0Var != null) {
                e0Var.j0(j17, str, false);
            }
        } else {
            try {
                java.lang.String optString = jSONObject.optString("bindId", "");
                boolean a17 = fo1.d.f346391a.a(jSONObject, "bindResult", false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                if (!(optString.length() == 0) && a17) {
                    v32.f fVar = new v32.f();
                    fVar.f67434x5fdff3b6 = jSONObject.getString("deviceId");
                    fVar.f67437x21eb2633 = jSONObject.getString("deviceName");
                    fVar.f67438x12d71904 = jSONObject.getInt("deviceType");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.aj().mo11260x413cb2b4(fVar);
                    oo1.o oVar = oo1.o.f428684a;
                    java.lang.String field_deviceId = fVar.f67434x5fdff3b6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_deviceId, "field_deviceId");
                    oVar.a(field_deviceId);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e0 e0Var2 = a1Var.f364156b;
                    if (e0Var2 != null) {
                        e0Var2.j0(j17, fVar.f67434x5fdff3b6, true);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(a1Var.f364155a, "Fail to bind. bindId is " + optString + ", isSuccess=" + a17);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e0 e0Var3 = a1Var.f364156b;
                if (e0Var3 != null) {
                    e0Var3.j0(j17, str, false);
                }
            } catch (cl0.f e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(a1Var.f364155a, e17, "Fail to parse value from json. jsonObj=" + jSONObject, new java.lang.Object[0]);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e0 e0Var4 = a1Var.f364156b;
                if (e0Var4 != null) {
                    e0Var4.j0(j17, str, false);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
