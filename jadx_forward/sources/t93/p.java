package t93;

/* loaded from: classes.dex */
public class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        try {
            java.lang.String jSONObject2 = jSONObject.toString();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.v(c(), jSONObject2, 3, new t93.o(this));
            this.f224976f.d(false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiOpenFinderPostView", e17, "openFinderPostView fail", new java.lang.Object[0]);
            this.f224976f.a("fail");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
