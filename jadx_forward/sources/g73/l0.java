package g73;

/* loaded from: classes15.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 f350819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260) {
        super(0);
        this.f350819d = abstractC16085x8c838260;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff = this.f350819d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.j.f298231b.b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.a.ExtDeviceHandoff_Open, java.lang.String.valueOf(handOff.mo65028xe67d4b7a()), handOff.getId(), c01.id.c(), g73.i.f350808a);
        g73.m2 m2Var = g73.o0.f350853p;
        java.util.List c17 = kz5.b0.c(this.f350819d);
        m2Var.getClass();
        m2Var.h(10, c17);
        if (this.f350819d instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc) {
            int i17 = !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? -1 : !g73.o0.f350850m.f158886f ? -2 : 0;
            if (g73.o0.f350852o) {
                g73.o0.f350844d.getClass();
                android.content.Intent intent = new android.content.Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
                intent.setPackage("com.tencent.mtt");
                try {
                    if (i17 == -2) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, i17);
                        jSONObject.put("des", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574201hf1));
                        intent.putExtra("key_reader_sdk_toast", jSONObject.toString());
                    } else if (i17 == -1) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, i17);
                        jSONObject2.put("des", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574200hf0));
                        intent.putExtra("key_reader_sdk_toast", jSONObject2.toString());
                    } else if (i17 == 0) {
                        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f78121x77ac3fa));
                        arrayList.add(resources);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/handoff/service/HandOffService", "notifyQbOpenResult", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/handoff/service/HandOffService", "notifyQbOpenResult", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, 0);
                        jSONObject3.put("des", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cff));
                        intent.putExtra("key_reader_sdk_toast", jSONObject3.toString());
                        intent.putExtra("key_reader_sdk_toast_icon", decodeResource);
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HandOffService", "notifyQbOpenResult() Exception%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                }
            } else {
                g73.o0.f350844d.getClass();
                if (i17 == -2) {
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.i(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574201hf1), 0);
                } else if (i17 == -1) {
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.i(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574200hf0), 0);
                } else if (i17 == 0) {
                    android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.h(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574202hf2));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
