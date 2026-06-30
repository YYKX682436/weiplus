package df2;

/* loaded from: classes3.dex */
public final class hj implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.oj f311865a;

    public hj(df2.oj ojVar) {
        this.f311865a = ojVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public final boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        org.json.JSONObject jSONObject;
        boolean z17;
        df2.oj ojVar = this.f311865a;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ojVar.f312504m, "[liteAppStoreCallBack] actionName = " + str + ", " + obj);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ojVar.f312505n)) {
                p3325xe03a0797.p3326xc267989b.r2 r2Var = ojVar.f312512u;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                df2.oj.Z6(ojVar);
                return false;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ojVar.f312507p)) {
                jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
                if (jSONObject == null) {
                    return false;
                }
                df2.oj.a7(ojVar, jSONObject);
                return false;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ojVar.f312508q)) {
                jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
                if (jSONObject == null) {
                    return false;
                }
                java.lang.String optString = ((org.json.JSONObject) obj).optString("giftId");
                boolean c76 = df2.oj.c7(ojVar, jSONObject);
                if (optString != null && optString.length() != 0) {
                    z17 = false;
                    if (z17 && c76) {
                        ojVar.f312515x = new jz5.l(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
                        return true;
                    }
                }
                z17 = true;
                return z17 ? false : false;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ojVar.f312509r)) {
                jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
                if (jSONObject == null) {
                    return false;
                }
                df2.oj.b7(ojVar, jSONObject);
                return false;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ojVar.f312510s)) {
                return false;
            }
            jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            if (jSONObject == null) {
                return false;
            }
            java.lang.String optString2 = jSONObject.optString("liveId");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            byte[] bArr = ((mm2.e1) ojVar.m56788xbba4bfc0(mm2.e1.class)).f410518o;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString2, pm0.v.u(((mm2.e1) ojVar.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0))) && bArr != null) {
                jSONObject2.put("liveCookies", android.util.Base64.encodeToString(bArr, 2));
            }
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ojVar.f312504m, "[getLiveCookies] json = ".concat(jSONObject3));
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = ojVar.f312513v;
            if (sVar == null) {
                return false;
            }
            sVar.c(j17, i17, jSONObject3);
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ojVar.f312504m, "liteApp err: " + e17.getMessage());
            return false;
        }
    }
}
