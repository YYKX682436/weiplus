package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class p1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f263962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f263963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r1 f263964f;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r1 r1Var, sd.b bVar, org.json.JSONObject jSONObject) {
        this.f263964f = r1Var;
        this.f263962d = bVar;
        this.f263963e = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        org.json.JSONObject optJSONObject;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("nowUrl");
        java.lang.String[] stringArray = bundle.getStringArray("urlList");
        sd.b bVar = this.f263962d;
        if (stringArray == null || stringArray.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiImagePreview", "fail, urls is null");
            bVar.c("invalid_url", null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String a17 = com.p314xaae8f345.p3210x3857dc.d.g().a(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).u());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            intent.putExtra("cookie", a17);
        }
        org.json.JSONObject jSONObject = this.f263963e;
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("currentInfo");
        this.f263964f.getClass();
        float f17 = j65.f.f();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f263713p.m120171x1f05d274()) {
            zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
            if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de() == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS && org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.o() && org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c) ? org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429508h : false) {
                f17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f263713p.getResources().getDisplayMetrics().density;
            }
        }
        if (f17 <= 0.0f) {
            f17 = i65.a.g(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d);
        }
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.x0.d(jSONObject.optString("thumbUrl"));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.x0.a(d17)) {
            intent.putExtra("nowUrlPath", d17);
        }
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488190n.getBoolean("show_full_screen", false);
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("pos")) != null) {
            int height = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f263719t.getHeight();
            double d18 = f17;
            int optDouble = (int) (optJSONObject.optDouble("width") * d18);
            int optDouble2 = (int) (optJSONObject.optDouble("height") * d18);
            int i17 = height;
            int optDouble3 = (int) (optJSONObject.optDouble("x") * d18);
            double optDouble4 = optJSONObject.optDouble("y") * d18;
            if (z17) {
                i17 = 0;
            }
            intent.putExtra("img_gallery_width", optDouble).putExtra("img_gallery_height", optDouble2).putExtra("img_gallery_left", optDouble3).putExtra("img_gallery_top", (int) (i17 + optDouble4));
            bVar = bVar;
            int k17 = i65.a.k(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d);
            if (optDouble > 0 && optDouble2 > 0 && optDouble2 < k17) {
                intent.putExtra("shouldRunDragAnimation", true);
            }
        }
        intent.putExtra("forBidForward", bVar.f488130b.f426039c.optInt("forbidForward", 0) == 1);
        if (jSONObject.has("searchInfos")) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("searchInfos"));
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject3 = jSONArray.optJSONObject(i18);
                    arrayList.add(optJSONObject3 != null ? com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386.f262975u.a(optJSONObject3) : null);
                }
                intent.putParcelableArrayListExtra("searchInfos", arrayList);
            } catch (org.json.JSONException unused) {
            }
        }
        intent.putExtra("nowUrl", string);
        intent.putExtra("urlList", stringArray);
        intent.putExtra("type", -255);
        intent.putExtra("isFromWebView", true);
        intent.putExtra("currentPos", jSONObject.optInt("currentPos", -1));
        j45.l.j(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d, "subapp", ".ui.gallery.GestureGalleryUI", intent, null);
        bVar.a();
    }
}
