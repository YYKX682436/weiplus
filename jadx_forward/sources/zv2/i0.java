package zv2;

/* loaded from: classes8.dex */
public final class i0 implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.l0 f557940a;

    public i0(zv2.l0 l0Var) {
        this.f557940a = l0Var;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "videoDidSelect")) {
            zv2.l0 l0Var = this.f557940a;
            l0Var.getClass();
            if (obj instanceof org.json.JSONObject) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTencentVideoWidget", "[videoDidSelect] data:" + obj);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                    c19786x6a1e2862.m76527x75c48317(((org.json.JSONObject) obj).optInt("businessType"));
                    c19786x6a1e2862.m76570xc2385d6(((org.json.JSONObject) obj).optString("wording"));
                    c19786x6a1e2862.m76544x4a9beb2b(((org.json.JSONObject) obj).optString("iconUrl"));
                    c19786x6a1e2862.m76550x2592a27b(((org.json.JSONObject) obj).optInt("jumpType", 0));
                    org.json.JSONObject optJSONObject = ((org.json.JSONObject) obj).optJSONObject("html5Info");
                    java.lang.String optString = optJSONObject != null ? optJSONObject.optString("url") : null;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 c19799x6a7e198 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198();
                    c19799x6a7e198.m77171xca029dad(optString);
                    c19786x6a1e2862.m76541x751b57e5(c19799x6a7e198);
                    c19786x6a1e2862.m76521x7528c3fb().add(l0Var.m(5, 2, (org.json.JSONObject) obj));
                    c19786x6a1e2862.m76521x7528c3fb().add(l0Var.m(6, 2, (org.json.JSONObject) obj));
                    l0Var.f557930f = c19786x6a1e2862;
                    l0Var.i(c19786x6a1e2862);
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
            }
        }
        return false;
    }
}
