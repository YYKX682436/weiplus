package rv4;

/* loaded from: classes12.dex */
public final class j {
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(org.json.JSONObject jSONObject, rv4.m mVar) {
        boolean z17 = true;
        if (mVar == null) {
            return true;
        }
        long optLong = jSONObject.optLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6);
        long j17 = optLong ^ Long.MIN_VALUE;
        int compare = java.lang.Long.compare(j17, Long.MIN_VALUE);
        long j18 = mVar.f482054a;
        if (compare > 0) {
            long j19 = j18 ^ Long.MIN_VALUE;
            if (java.lang.Long.compare(j19, Long.MIN_VALUE) > 0 && java.lang.Long.compare(j17, j19) < 0) {
                z17 = false;
            }
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FTSGlobalTeachHistory", "filter history " + jSONObject + " for timestamp " + ((java.lang.Object) jz5.x.a(optLong)) + " and minTimestamp " + ((java.lang.Object) jz5.x.a(j18)));
        }
        return z17;
    }
}
