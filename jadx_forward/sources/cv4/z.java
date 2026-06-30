package cv4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/z;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        jz5.f0 f0Var = null;
        objArr[1] = jSONObject != null ? jSONObject.toString() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiStartCircleToSearch", "appid: %s data: %s", objArr);
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("entrance", 0);
            java.util.Map t17 = kz5.c1.t(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386.f262975u.a(jSONObject).b());
            java.lang.Object obj = jSONObject.get("imageLocalId");
            java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str2 != null) {
                if (str2.length() > 0) {
                    t17.put("imgPath", ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, str2));
                }
            }
            tg0.f1 f1Var = (tg0.f1) i95.n0.c(tg0.f1.class);
            android.content.Context c17 = c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
            ((sg0.e) f1Var).Ai(c17, 7, optInt, t17);
            this.f224976f.d(false);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            this.f224976f.a("data is null");
        }
    }
}
