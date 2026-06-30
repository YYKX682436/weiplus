package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class k4 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.p4 f263914a;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.p4 p4Var) {
        this.f263914a = p4Var;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.p4 p4Var = this.f263914a;
        if (!booleanValue) {
            p4Var.f263968d.c("share fail:system permission denied", null);
            return;
        }
        java.lang.String optString = p4Var.f263968d.f488130b.f426039c.optString("base64DataImg");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString);
        sd.b bVar = p4Var.f263968d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var = p4Var.f263969e;
        if (!K0) {
            byte[] decode = android.util.Base64.decode(optString, 2);
            int length = decode.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(decode);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/jsapi/JsApiShareCustomContent$1$1", "accept", "(Ljava/lang/Boolean;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj2, decodeByteArray, "com/tencent/mm/plugin/webview/luggage/jsapi/JsApiShareCustomContent$1$1", "accept", "(Ljava/lang/Boolean;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            bVar.f488130b.f426039c.remove("base64DataImg");
            j4Var.f263894f = j4Var.m("", decodeByteArray);
            try {
                bVar.f488130b.f426039c.put("imgPath", j4Var.f263894f);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareCustomContent", "err:" + e17.getMessage());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.f(j4Var, bVar);
    }
}
