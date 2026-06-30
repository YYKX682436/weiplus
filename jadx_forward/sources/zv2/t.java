package zv2;

/* loaded from: classes2.dex */
public final class t implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.w f557957a;

    public t(zv2.w wVar) {
        this.f557957a = wVar;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "postChooseMusicAction")) {
            zv2.w wVar = this.f557957a;
            wVar.getClass();
            if (obj instanceof org.json.JSONObject) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicOrAudioWidget", "[postChooseMusicAction] data:" + obj);
                    org.json.JSONObject optJSONObject = ((org.json.JSONObject) obj).optJSONObject("jump_info_config");
                    org.json.JSONObject optJSONObject2 = ((org.json.JSONObject) obj).optJSONObject("lite_app_config");
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                    c19786x6a1e2862.m76561xb5ff6fa9(optJSONObject != null ? optJSONObject.optString("recommend_reason") : null);
                    c19786x6a1e2862.m76570xc2385d6(optJSONObject != null ? optJSONObject.optString("wording") : null);
                    c19786x6a1e2862.m76564x6184a317(optJSONObject != null ? optJSONObject.optString("report_info") : null);
                    c19786x6a1e2862.m76527x75c48317(optJSONObject != null ? optJSONObject.optInt("business_type") : 0);
                    c19786x6a1e2862.m76544x4a9beb2b(optJSONObject != null ? optJSONObject.optString("icon_url") : null);
                    c19786x6a1e2862.m76536x9b35e8e(optJSONObject != null ? optJSONObject.optString("ext_buff_string") : null);
                    c19786x6a1e2862.m76550x2592a27b(6);
                    r45.k74 k74Var = new r45.k74();
                    k74Var.set(0, optJSONObject2 != null ? optJSONObject2.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd) : null);
                    k74Var.set(1, optJSONObject2 != null ? optJSONObject2.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714) : null);
                    k74Var.set(2, optJSONObject2 != null ? optJSONObject2.optString("query") : null);
                    k74Var.set(3, optJSONObject2 != null ? optJSONObject2.optString("default_url") : null);
                    k74Var.set(4, java.lang.Integer.valueOf((int) ((optJSONObject2 != null ? (float) optJSONObject2.optDouble(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13302x1788313c) : 0.0f) * 100)));
                    k74Var.set(5, java.lang.Float.valueOf(optJSONObject2 != null ? optJSONObject2.optInt("half_height") : 0.0f));
                    k74Var.set(6, java.lang.Integer.valueOf(optJSONObject2 != null ? optJSONObject2.optInt("open_type") : 0));
                    k74Var.set(7, java.lang.Boolean.valueOf(optJSONObject2 != null && optJSONObject2.optInt("is_transparent") == 1));
                    k74Var.set(8, java.lang.Boolean.valueOf(optJSONObject2 != null && optJSONObject2.optInt("is_forbid_rightgesture") == 1));
                    java.lang.String optString = optJSONObject2 != null ? optJSONObject2.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13301xac1d9648) : null;
                    if (optString == null) {
                        optString = "";
                    }
                    k74Var.set(9, com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(optString));
                    k74Var.set(10, optJSONObject2 != null ? optJSONObject2.optString("mini_version") : null);
                    k74Var.set(11, java.lang.Integer.valueOf(optJSONObject2 != null ? optJSONObject2.optInt("position") : 0));
                    c19786x6a1e2862.m76551x3af0573b(k74Var);
                    wVar.f557930f = c19786x6a1e2862;
                    wVar.i(c19786x6a1e2862);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMusicOrAudioWidget", java.lang.String.valueOf(e17.getMessage()));
                }
            }
        }
        return true;
    }
}
