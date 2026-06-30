package ia2;

/* loaded from: classes2.dex */
public final class g0 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ia2.n0 f371457a;

    public g0(ia2.n0 n0Var) {
        this.f371457a = n0Var;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        ia2.g0 g0Var;
        org.json.JSONObject jSONObject2;
        java.lang.String str;
        long j17;
        long j18;
        long j19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err_msg, "err_msg");
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPOIPlugin", "openBizPublishWithImage failed, err_msg: %s, extraInfo: %s", err_msg, jSONObject);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject != null ? java.lang.Boolean.valueOf(jSONObject.optBoolean(ya.b.f77504xbb80cbe3, false)) : null, java.lang.Boolean.FALSE)) {
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("coverInfo") : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPOIPlugin", "openBizPublishWithImage success extraInfo: %s", jSONObject);
        if (jSONObject != null) {
            jSONObject2 = jSONObject.optJSONObject("poiInfo");
            g0Var = this;
        } else {
            g0Var = this;
            jSONObject2 = null;
        }
        ia2.n0 n0Var = g0Var.f371457a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n0Var.f371499t, jSONObject2 != null ? jSONObject2.optString("poiid") : null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderPOIPlugin", "openBizPublishWithImage ret: poiId not match");
            return;
        }
        long j27 = 0;
        java.lang.String str2 = "";
        if (optJSONArray != null) {
            if (optJSONArray.length() > 0) {
                str2 = optJSONArray.optJSONObject(0).optString("cdn_url");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "optString(...)");
                j27 = optJSONArray.optJSONObject(0).optLong("width");
                j19 = optJSONArray.optJSONObject(0).optLong("height");
            } else {
                j19 = 0;
            }
            str = str2;
            j18 = j19;
            j17 = j27;
        } else {
            str = "";
            j17 = 0;
            j18 = 0;
        }
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString2 = jSONObject.optString("nickname");
        java.lang.String optString3 = jSONObject.optString("avatar");
        java.lang.String optString4 = jSONObject.optString("url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23968x3799deba c23968x3799deba = new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23968x3799deba(str, j17, j18, optString, optString2, optString3);
        bw5.li0 li0Var = new bw5.li0();
        li0Var.f111328d = optString4;
        boolean[] zArr = li0Var.f111330f;
        zArr[1] = true;
        li0Var.f111329e = bw5.dr.FinderMpFeedTypeNewPublished;
        zArr[2] = true;
        java.util.Map map = n0Var.f371500u;
        if (map.size() >= 2) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(bw5.sf.FinderFeedTabTypeRecommend);
            if (list != null) {
                list.add(li0Var);
            }
            java.util.List list2 = (java.util.List) ((java.util.LinkedHashMap) map).get(bw5.sf.FinderFeedTabTypeLatest);
            if (list2 != null) {
                list2.add(li0Var);
            }
        }
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23922xf4e16628 c23922xf4e16628 = n0Var.f371488f;
        if (c23922xf4e16628 != null) {
            c23922xf4e16628.m88601x7edb6f8e(c23968x3799deba, ia2.q0.a("insertMpPoiStream"));
        }
    }
}
