package z43;

/* loaded from: classes8.dex */
public class y extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("invalid_params");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameCenter", "JsonData = %s", jSONObject.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5821x1482b029 c5821x1482b029 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5821x1482b029();
        am.qn qnVar = c5821x1482b029.f136130g;
        qnVar.f89256a = jSONObject;
        qnVar.f89257b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        c5821x1482b029.e();
        this.f224976f.d(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
