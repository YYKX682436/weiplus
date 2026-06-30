package um4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/o;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteJsApiShowNavBarShadow", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65361xd4eb96cf(this.f224975e.f380557a);
                if (m65361xd4eb96cf != null && (m65361xd4eb96cf instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329)) {
                    java.lang.String string = jSONObject.getString("color");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    java.lang.String substring = string.substring(1, string.length());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    int i17 = (int) (jSONObject.getDouble("alpha") * 255);
                    r26.a.a(16);
                    ((ku5.t0) ku5.t0.f394148d).B(new um4.n(m65361xd4eb96cf, java.lang.Integer.parseInt(substring, 16) + (i17 * com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb)));
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt("retCode", "0");
                    this.f224976f.c(jSONObject2, false);
                    return;
                }
                this.f224976f.a("cannot find view");
            } catch (java.lang.Exception unused) {
                this.f224976f.a("Error");
            }
        }
    }
}
