package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class h0 implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.q f102214b;

    public h0(com.tencent.mm.plugin.finder.assist.i0 i0Var, yz5.q qVar) {
        this.f102213a = i0Var;
        this.f102214b = qVar;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (!kotlin.jvm.internal.o.b(str, "postChooseShopPromotionLiteAction")) {
            return true;
        }
        yz5.q qVar = this.f102214b;
        this.f102213a.getClass();
        if (!(obj instanceof org.json.JSONObject)) {
            return true;
        }
        try {
            com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "[postChooseShopPromotionLiteAction] data:" + obj);
            java.lang.String optString = ((org.json.JSONObject) obj).optString("poiId");
            java.lang.String optString2 = ((org.json.JSONObject) obj).optString("productId");
            boolean optBoolean = ((org.json.JSONObject) obj).optBoolean("multiStorePromotion");
            kotlin.jvm.internal.o.d(optString);
            kotlin.jvm.internal.o.d(optString2);
            qVar.invoke(optString, optString2, java.lang.Boolean.valueOf(optBoolean));
            return true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("Finder.ActivityRouter", java.lang.String.valueOf(e17.getMessage()));
            return true;
        }
    }
}
