package com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 f234352a;

    /* renamed from: b, reason: collision with root package name */
    public dp3.c f234353b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f234354c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f234355d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f234356e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f234357f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f234358g;

    /* renamed from: h, reason: collision with root package name */
    public int f234359h;

    public a() {
        new java.util.LinkedList();
    }

    public final void a(java.util.List list, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("evaluate_section");
        if (optJSONObject == null) {
            return;
        }
        if (list == null) {
            list = new java.util.ArrayList();
        }
        dp3.b bVar = new dp3.b();
        if (optJSONObject.has("value")) {
            bVar.f323731b = optJSONObject.optString("value");
            bVar.f323734e = 2;
        } else {
            bVar.f323734e = 1;
        }
        int optInt = optJSONObject.optInt("order", 0);
        if (optInt < 0 || optInt > optJSONObject.length() + 1) {
            return;
        }
        list.add(optInt, bVar);
    }

    public final java.util.List b(org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("normal_sections");
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = false;
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
            dp3.b bVar = new dp3.b();
            bVar.f323733d = jSONObject2.optInt("is_bar") != 0;
            java.lang.String optString = jSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            bVar.f323730a = optString;
            if (android.text.TextUtils.isEmpty(optString)) {
                z17 = bVar.f323733d;
            } else {
                if (z17) {
                    bVar.f323733d = z17;
                }
                z17 = bVar.f323733d;
                bVar.f323731b = jSONObject2.optString("value");
                bVar.f323732c = jSONObject2.optString("jump_url");
                jSONObject2.optInt("jump_type");
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList c(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("product_section");
        java.util.ArrayList arrayList = null;
        if (jSONObject2 == null) {
            return null;
        }
        org.json.JSONArray jSONArray = jSONObject2.getJSONArray("items");
        if (jSONArray != null && jSONArray.length() != 0) {
            arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject3 = jSONArray.getJSONObject(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49 c16775xba5fef49 = new com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49();
                c16775xba5fef49.f234342d = jSONObject3.optString("icon_url");
                c16775xba5fef49.f234343e = jSONObject3.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                try {
                    c16775xba5fef49.f234344f = d(jSONObject3);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallOrderDetailObject", e17, "", new java.lang.Object[0]);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallOrderDetailObject", e18, "", new java.lang.Object[0]);
                }
                c16775xba5fef49.f234345g = jSONObject3.optInt("count");
                c16775xba5fef49.f234346h = jSONObject3.optString(ya.b.f77496x48db929);
                c16775xba5fef49.f234347i = jSONObject3.optString("jump_url");
                c16775xba5fef49.f234348m = jSONObject3.optString("pid");
                c16775xba5fef49.f234349n = jSONObject3.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                arrayList.add(c16775xba5fef49);
            }
        }
        return arrayList;
    }

    public final java.util.List d(org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("skus");
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49.Skus skus = new com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49.Skus();
            skus.f234350d = jSONObject2.optString("key");
            skus.f234351e = jSONObject2.optString("value");
            arrayList.add(skus);
        }
        return arrayList;
    }

    public final dp3.c e(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("status_section");
        if (jSONObject2 == null) {
            return null;
        }
        dp3.c cVar = new dp3.c();
        cVar.f323735a = jSONObject2.optString("last_status_name");
        cVar.f323736b = jSONObject2.optInt("time");
        cVar.f323737c = jSONObject2.optString("thumb_url");
        cVar.f323738d = jSONObject2.optString("jump_url");
        cVar.f323739e = jSONObject2.optString("last_status_desc");
        return cVar;
    }
}
