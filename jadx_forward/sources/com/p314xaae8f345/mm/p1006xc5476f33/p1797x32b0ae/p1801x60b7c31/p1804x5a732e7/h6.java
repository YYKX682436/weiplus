package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225131g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225132h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225133i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f225134m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 f225135n;

    public h6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 o6Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, org.json.JSONObject jSONObject) {
        this.f225135n = o6Var;
        this.f225128d = str;
        this.f225129e = str2;
        this.f225130f = str3;
        this.f225131g = str4;
        this.f225132h = str5;
        this.f225133i = str6;
        this.f225134m = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g6 g6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.g6(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 o6Var = this.f225135n;
        o6Var.getClass();
        java.lang.String str = this.f225131g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String str2 = this.f225129e;
            boolean isEmpty = android.text.TextUtils.isEmpty(str2);
            java.lang.String str3 = this.f225128d;
            java.lang.String str4 = this.f225130f;
            if (isEmpty && !android.text.TextUtils.isEmpty(str4)) {
                g6Var.a(((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str3, o6Var.f224975e.f380557a, str4));
                return;
            }
            if (!android.text.TextUtils.isEmpty(str2) && android.text.TextUtils.isEmpty(str4) && ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(str2)) {
                g6Var.a(((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str3, o6Var.f224975e.f380557a, str2));
                return;
            } else {
                if (android.text.TextUtils.isEmpty(str2)) {
                    g6Var.a(null);
                    return;
                }
                if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                    g6Var.a(str2);
                    return;
                }
                if (!str2.startsWith("http")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live cover file not found: %s", str2);
                    g6Var.a(null);
                    return;
                } else {
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j6(o6Var, str2, g6Var));
                    return;
                }
            }
        }
        int indexOf = str.indexOf(";base64,");
        if (indexOf != -1) {
            str = str.substring(indexOf + 8);
        }
        try {
            byte[] decode = android.util.Base64.decode(str, 2);
            int length = decode.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(decode);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum", "prepareLivePhotoCover", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum$PathReadyCallback;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum", "prepareLivePhotoCover", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum$PathReadyCallback;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            if (decodeByteArray == null) {
                g6Var.a(null);
                return;
            }
            java.lang.String str5 = o6Var.f225237g + java.lang.String.format("MMImage_live_cover_%d_%d.jpg", java.lang.Long.valueOf(o6Var.f224975e.f380561e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            if (ra3.h0.c(decodeByteArray, str5)) {
                g6Var.a(str5);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "save live cover bitmap fail. path: %s", str5);
                g6Var.a(null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live cover base64 decode fail %s", e17.getMessage());
            g6Var.a(null);
        }
    }
}
