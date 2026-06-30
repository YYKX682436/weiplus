package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/k7;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class k7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f225173h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f225174i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f225172g = true;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f225175m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f225176n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f225177o = "";

    public final java.lang.String A(java.lang.String str, boolean z17) {
        java.lang.String str2 = str;
        this.f225174i = false;
        if (str2 == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiShareMediaToTimeline", "uri is empty");
            return null;
        }
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(str2)) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar = this.f224975e;
            java.lang.String zj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).zj(cVar.f380558b, cVar.f380557a, str2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zj6);
            if (!(zj6.length() == 0)) {
                return zj6;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiShareMediaToTimeline", "getFilePathByBothLocalId return empty result");
            return null;
        }
        if (r26.i0.y(str2, "http", false)) {
            this.f225174i = true;
            if (z17) {
                ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h7(str2, this));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d.a(this.f224975e.f380558b, str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i7(this));
            }
            return null;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiShareMediaToTimeline", "unsupported uri: ".concat(str2));
            return null;
        }
        int L = r26.n0.L(str, ";base64,", 0, false, 6, null);
        if (L != -1) {
            str2 = str2.substring(L + 8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
        }
        try {
            byte[] decode = android.util.Base64.decode(str2, 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            int length = decode.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(decode);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiShareMediaToTimeline", "loadBase64Image", "(Ljava/lang/String;)Ljava/lang/String;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiShareMediaToTimeline", "loadBase64Image", "(Ljava/lang/String;)Ljava/lang/String;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            if (decodeByteArray == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiShareMediaToTimeline", "bitmap decode error");
                return null;
            }
            java.lang.String str3 = this.f225175m + ("MMImage_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str2) + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
            if (ra3.h0.c(decodeByteArray, str3)) {
                ra3.h0.d(str3, decode);
                return str3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiShareMediaToTimeline", "saveBitmapToFile fail, filePath: " + str3);
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiShareMediaToTimeline", "error base64, decode failed %s", e17.getMessage());
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:28|(3:29|30|31)|(5:32|33|34|35|36)|(1:38)(2:49|(6:51|52|53|54|41|(2:43|44)(1:45))(1:57))|39|40|41|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0158  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k7.B(java.lang.String, java.lang.String):void");
    }

    public final void C(java.lang.String str) {
        this.f225177o = str;
        boolean z17 = true;
        java.lang.String A = A(this.f225176n, true);
        if (A != null && A.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            B(str, A);
        } else if (this.f225174i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiShareMediaToTimeline", "wait thumb cdn download ...");
        } else {
            this.f224976f.a("load thumb media fail");
        }
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("params is null");
            return;
        }
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.f(str, "bundle", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getLiteAppTempPath(...)");
        this.f225175m = f17;
        java.lang.String optString = jSONObject.optString("type", "");
        if (!optString.equals("image") && !optString.equals("video")) {
            this.f224976f.a("only support image | video");
        }
        this.f225172g = optString.equals("image");
        java.lang.String optString2 = jSONObject.optString("thumbUri", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        this.f225176n = optString2;
        this.f225173h = jSONObject.optJSONObject("tailInfo");
        java.lang.String A = A(jSONObject.optString("uri"), this.f225172g);
        if (A == null || A.length() == 0) {
            if (this.f225174i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiShareMediaToTimeline", "wait cdn download ...");
                return;
            } else {
                this.f224976f.a("load media fail");
                return;
            }
        }
        if (!this.f225172g) {
            if (!(this.f225176n.length() == 0)) {
                C(A);
                return;
            }
        }
        B(A, "");
    }
}
