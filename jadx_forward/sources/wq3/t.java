package wq3;

/* loaded from: classes15.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f530128a;

    /* renamed from: b, reason: collision with root package name */
    public int f530129b;

    /* renamed from: e, reason: collision with root package name */
    public xq3.c f530132e;

    /* renamed from: f, reason: collision with root package name */
    public xq3.n f530133f;

    /* renamed from: h, reason: collision with root package name */
    public xq3.f f530135h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f530136i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f530137j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f530138k;

    /* renamed from: c, reason: collision with root package name */
    public int f530130c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f530131d = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f530134g = new java.util.LinkedList();

    public static wq3.t b(wq3.t tVar, java.lang.String str) {
        java.lang.String str2 = ya.b.f77497xe20e548b;
        wq3.t tVar2 = tVar == null ? new wq3.t() : tVar;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            tVar2.f530128a = jSONObject.getString("product_id");
            tVar2.f530129b = jSONObject.getInt("product_type");
            tVar2.f530130c = jSONObject.optInt(ya.b.f77497xe20e548b, Integer.MAX_VALUE);
            tVar2.f530131d = jSONObject.optInt("left_buy_quantity", Integer.MAX_VALUE);
            jSONObject.optInt("status", 6);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("ext_attr");
            if (optJSONObject != null) {
                tVar2.f530135h = new xq3.f();
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("product_ext");
                if (optJSONObject2 != null) {
                    xq3.f fVar = tVar2.f530135h;
                    xq3.j jVar = new xq3.j();
                    jVar.f537625d = optJSONObject2.getInt("flag");
                    fVar.f537614d = jVar;
                } else {
                    tVar2.f530135h.f537615e = jSONObject.optString("ext_attr");
                }
            }
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("base_attr");
            if (optJSONObject3 != null) {
                xq3.c cVar = new xq3.c();
                tVar2.f530132e = cVar;
                cVar.f537592d = optJSONObject3.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                tVar2.f530132e.f537594f = optJSONObject3.getInt("ori_price");
                tVar2.f530132e.f537595g = optJSONObject3.getInt("up_price");
                tVar2.f530132e.f537596h = optJSONObject3.getInt("low_price");
                tVar2.f530132e.f537597i = new java.util.LinkedList();
                org.json.JSONArray jSONArray = optJSONObject3.getJSONArray("img_info");
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String string = jSONArray.getString(i17);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        tVar2.f530132e.f537597i.add(string);
                    }
                }
                tVar2.f530132e.f537598m = optJSONObject3.getString("digest");
                tVar2.f530132e.f537608w = optJSONObject3.getString("fee_type");
                tVar2.f530132e.f537599n = optJSONObject3.getString("detail");
                org.json.JSONObject optJSONObject4 = optJSONObject3.optJSONObject("share_info");
                if (optJSONObject4 != null) {
                    tVar2.f530132e.f537609x = new xq3.k();
                    tVar2.f530132e.f537609x.f537628d = optJSONObject4.optString("icon_url");
                    tVar2.f530132e.f537609x.f537629e = optJSONObject4.optString("url");
                }
                org.json.JSONArray optJSONArray = optJSONObject3.optJSONArray("sku_table");
                if (optJSONArray != null) {
                    tVar2.f530132e.f537605t = new java.util.LinkedList();
                    int length2 = optJSONArray.length();
                    int i18 = 0;
                    while (i18 < length2) {
                        org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
                        xq3.m mVar = new xq3.m();
                        mVar.f537635d = jSONObject2.getString(dm.i4.f66865x76d1ec5a);
                        mVar.f537636e = jSONObject2.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                        mVar.f537637f = new java.util.LinkedList();
                        org.json.JSONArray jSONArray2 = jSONObject2.getJSONArray("value_list");
                        int length3 = jSONArray2.length();
                        int i19 = 0;
                        while (i19 < length3) {
                            org.json.JSONArray jSONArray3 = optJSONArray;
                            org.json.JSONObject jSONObject3 = jSONArray2.getJSONObject(i19);
                            int i27 = length2;
                            xq3.h hVar = new xq3.h();
                            hVar.f537620d = jSONObject3.getString(dm.i4.f66865x76d1ec5a);
                            hVar.f537621e = jSONObject3.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                            hVar.f537622f = true;
                            mVar.f537637f.add(hVar);
                            i19++;
                            optJSONArray = jSONArray3;
                            length2 = i27;
                            jSONArray2 = jSONArray2;
                        }
                        tVar2.f530132e.f537605t.add(mVar);
                        i18++;
                        optJSONArray = optJSONArray;
                        length2 = length2;
                    }
                }
                org.json.JSONArray optJSONArray2 = optJSONObject3.optJSONArray("actiongroup_attr");
                if (optJSONArray2 != null) {
                    tVar2.f530132e.f537607v = new java.util.LinkedList();
                    int length4 = optJSONArray2.length();
                    for (int i28 = 0; i28 < length4; i28++) {
                        org.json.JSONObject jSONObject4 = optJSONArray2.getJSONObject(i28);
                        xq3.a aVar = new xq3.a();
                        java.lang.String string2 = jSONObject4.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                        aVar.f537585d = string2;
                        aVar.f537587f = 0;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                            tVar2.f530132e.f537607v.add(aVar);
                        }
                        org.json.JSONArray jSONArray4 = jSONObject4.getJSONArray("action_list");
                        int length5 = jSONArray4.length();
                        int i29 = 0;
                        while (i29 < length5) {
                            org.json.JSONObject jSONObject5 = jSONArray4.getJSONObject(i29);
                            xq3.a aVar2 = new xq3.a();
                            aVar2.f537585d = jSONObject5.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                            aVar2.f537586e = jSONObject5.getString("tips");
                            aVar2.f537587f = jSONObject5.getInt("type");
                            aVar2.f537588g = jSONObject5.getString("content");
                            aVar2.f537589h = jSONObject5.getString("icon_url");
                            tVar2.f530132e.f537607v.add(aVar2);
                            i29++;
                            optJSONArray2 = optJSONArray2;
                        }
                    }
                }
            }
            org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("available_sku_list");
            if (optJSONArray3 != null) {
                int length6 = optJSONArray3.length();
                tVar2.f530134g = new java.util.LinkedList();
                int i37 = 0;
                while (i37 < length6) {
                    org.json.JSONObject jSONObject6 = optJSONArray3.getJSONObject(i37);
                    xq3.l lVar = new xq3.l();
                    lVar.f537630d = jSONObject6.getString("id_info");
                    lVar.f537631e = jSONObject6.getInt(ya.b.f77496x48db929);
                    lVar.f537634h = jSONObject6.getInt(str2);
                    lVar.f537632f = jSONObject6.getString("icon_url");
                    org.json.JSONArray jSONArray5 = jSONObject6.getJSONArray("express_fee");
                    int length7 = jSONArray5.length();
                    lVar.f537633g = new java.util.LinkedList();
                    int i38 = 0;
                    while (i38 < length7) {
                        org.json.JSONObject jSONObject7 = jSONArray5.getJSONObject(i38);
                        org.json.JSONArray jSONArray6 = optJSONArray3;
                        xq3.e eVar = new xq3.e();
                        eVar.f537611d = jSONObject7.getInt(dm.i4.f66865x76d1ec5a);
                        eVar.f537612e = jSONObject7.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                        eVar.f537613f = jSONObject7.getInt(ya.b.f77496x48db929);
                        lVar.f537633g.add(eVar);
                        i38++;
                        optJSONArray3 = jSONArray6;
                        str2 = str2;
                    }
                    tVar2.f530134g.add(lVar);
                    i37++;
                    optJSONArray3 = optJSONArray3;
                    str2 = str2;
                }
            }
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("seller_attr");
            if (optJSONObject5 != null) {
                xq3.n nVar = new xq3.n();
                tVar2.f530133f = nVar;
                nVar.f537638d = optJSONObject5.getString("appid");
                tVar2.f530133f.f537639e = optJSONObject5.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                tVar2.f530133f.f537641g = optJSONObject5.getString(dm.i4.f66875xa013b0d5);
                tVar2.f530133f.f537640f = optJSONObject5.optString("logo");
                tVar2.f530133f.f537642h = optJSONObject5.optInt("flag", 0);
            }
            org.json.JSONObject optJSONObject6 = jSONObject.optJSONObject("oss_info");
            if (optJSONObject6 != null) {
                tVar2.f530137j = optJSONObject6.optString("self_buy_button_word");
                tVar2.f530138k = optJSONObject6.optString("product_mixed_h5_html");
            }
            return tVar2;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ProductInfo", e17, "", new java.lang.Object[0]);
            return tVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r3 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        r5.f530132e.f537597i.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static wq3.t c(wq3.t r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wq3.t.c(wq3.t, java.lang.String):wq3.t");
    }

    public java.lang.String a() {
        java.util.LinkedList linkedList;
        xq3.k kVar;
        xq3.c cVar = this.f530132e;
        if (cVar != null && (kVar = cVar.f537609x) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f537628d)) {
            return this.f530132e.f537609x.f537628d;
        }
        xq3.c cVar2 = this.f530132e;
        if (cVar2 == null || (linkedList = cVar2.f537597i) == null || linkedList.size() <= 0) {
            return null;
        }
        return (java.lang.String) this.f530132e.f537597i.get(0);
    }
}
