package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class h0 implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 f183746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.q f183747b;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, yz5.q qVar) {
        this.f183746a = i0Var;
        this.f183747b = qVar;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "postChooseShopPromotionLiteAction")) {
            return true;
        }
        yz5.q qVar = this.f183747b;
        this.f183746a.getClass();
        if (!(obj instanceof org.json.JSONObject)) {
            return true;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "[postChooseShopPromotionLiteAction] data:" + obj);
            java.lang.String optString = ((org.json.JSONObject) obj).optString("poiId");
            java.lang.String optString2 = ((org.json.JSONObject) obj).optString("productId");
            boolean optBoolean = ((org.json.JSONObject) obj).optBoolean("multiStorePromotion");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            qVar.mo147xb9724478(optString, optString2, java.lang.Boolean.valueOf(optBoolean));
            return true;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ActivityRouter", java.lang.String.valueOf(e17.getMessage()));
            return true;
        }
    }
}
