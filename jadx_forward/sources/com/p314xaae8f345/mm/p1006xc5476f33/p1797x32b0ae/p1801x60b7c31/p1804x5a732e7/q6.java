package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes9.dex */
public class q6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225263g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f225264h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONObject f225265i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v6 f225266m = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v6(null);

    public final void A(org.json.JSONObject jSONObject, java.util.HashMap hashMap) {
        java.lang.String str;
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendAppMessage", "liteapp sendAppMessage params:" + hashMap);
        boolean optBoolean = jSONObject.optBoolean("isRecentForward");
        java.lang.String optString = jSONObject.optString("content");
        int optInt = jSONObject.optInt(ya.b.f77479x42930b2);
        if (optBoolean) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1865L, 12L, 1L, false);
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            java.util.ArrayList Ui = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m().Ui();
            if (!Ui.isEmpty()) {
                for (int i17 = 0; i17 < Ui.size(); i17++) {
                    o25.m2 m2Var = (o25.m2) Ui.get(i17);
                    if (optInt == i17 && optString.equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(m2Var.f424093a))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1865L, 13L, 1L, false);
                        z17 = true;
                        str = m2Var.f424093a;
                        break;
                    }
                }
            }
        }
        str = "";
        z17 = false;
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 0);
        intent.putExtra("webview_params", hashMap);
        intent.putExtra("callback_id", m93.j.a(this));
        if (z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1865L, 14L, 1L, false);
            intent.putExtra("Select_Conv_User", str);
        }
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendAppMessage", "continueForwardAction", "(Lorg/json/JSONObject;Ljava/util/HashMap;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendAppMessage", "continueForwardAction", "(Lorg/json/JSONObject;Ljava/util/HashMap;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final java.lang.String B(java.lang.String str) {
        java.lang.String zj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.class)).zj(this.f225263g, this.f224975e.f380557a, str);
        return !zj6.isEmpty() ? zj6 : str;
    }

    public final java.lang.String C(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", str);
            jSONObject.put("error", str2);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendAppMessage", e17.getMessage());
        }
        return java.lang.String.format("LiteAppJsApiSendAppMessage,%s,%s", jSONObject.toString().replace(",", ";"), str);
    }

    public void D(java.lang.String str) {
        final java.lang.String B = B(str);
        try {
            this.f225265i.put("thumbUrl", B);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendAppMessage", "invoke: failed to update thumbUrl in data", e17);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(B)) {
            return;
        }
        if (B.startsWith("http")) {
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(B, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.r6(this));
        } else if (com.p314xaae8f345.mm.vfs.w6.j(B)) {
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.jsapi.comms.q6$$e
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q6 q6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q6.this;
                    q6Var.getClass();
                    java.lang.String str2 = B;
                    android.graphics.Bitmap N = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.N(str2, 480, 480);
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(str2, N);
                    java.lang.String C = q6Var.C(q6Var.f225263g, "[pushThumbToCache] download localId picture error");
                    if (N == null || N.isRecycled()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(23449, C);
                    }
                }
            });
        }
    }

    public final void E(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504;
        java.lang.String str2 = this.f225263g;
        org.json.JSONObject jSONObject = this.f225265i;
        if (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v7) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1();
            c11300x89dbd7a1.f33249xa1713a8c = jSONObject.optString("url");
            c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
            c11286x34a5504.f33122xe4128443 = c11300x89dbd7a1;
            c11286x34a5504.f33130x6942258 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            c11286x34a5504.f33121x993583fc = jSONObject.optString("desc");
        } else {
            ja3.a aVar = new ja3.a();
            aVar.f33110xf01afcf6 = str2;
            aVar.f33107x346425 = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            aVar.f33111xa1713a8c = jSONObject.optString("url");
            aVar.f33109xca90681b = jSONObject.optInt(ya.b.f77502x92235c1b);
            aVar.f380145a = jSONObject.optString("minVersion");
            aVar.f380146b = jSONObject.optBoolean("isTransparent");
            aVar.f380147c = jSONObject.optBoolean("hideIcon");
            aVar.f380148d = jSONObject.optBoolean("forbidForward");
            java.lang.String optString = jSONObject.optString("oldImageInfo");
            if (!optString.isEmpty()) {
                aVar.f380150f = z05.a.a(optString);
            }
            aVar.f380149e = jSONObject.optString("imageConf");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("query");
            if (optJSONObject != null) {
                aVar.f33108x66f18c8 = optJSONObject.toString();
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55042 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(aVar);
            c11286x34a55042.f33130x6942258 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            c11286x34a55042.f33121x993583fc = jSONObject.optString("desc");
            c11286x34a5504 = c11286x34a55042;
        }
        c11286x34a5504.f33128x4f3b3aa0 = bArr;
        java.lang.String optString2 = this.f225265i.optString("srcId");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(optString2);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
        am.jt jtVar = c5987xfe669c12.f136282g;
        jtVar.f88613a = c11286x34a5504;
        jtVar.f88616d = str;
        jtVar.f88617e = 2;
        jtVar.f88614b = optString2;
        jtVar.f88615c = h17 == null ? "" : h17.f67372x453d1e07;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f225265i.optString("src_username"))) {
            jtVar.f88620h = null;
        } else {
            jtVar.f88618f = this.f225265i.optString("src_username");
            jtVar.f88619g = this.f225265i.optString("src_displayname");
        }
        jtVar.f88622j = this.f225265i.optString("url");
        jtVar.f88621i = this.f225265i.optString("url");
        c5987xfe669c12.e();
        db5.e1.T(c(), c().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    @Override // jd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r17, final org.json.JSONObject r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q6.a(java.lang.String, org.json.JSONObject, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void x(int i17, int i18, android.content.Intent intent) {
        byte[] bArr;
        if (i17 != 1) {
            this.f224976f.a("");
            return;
        }
        if (i18 != -1) {
            if (i18 == 0 || i18 == 1) {
                this.f224976f.a("cancel");
                return;
            } else {
                this.f224976f.a("");
                return;
            }
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
        if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
            this.f224976f.d(false);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (stringExtra == null) {
            return;
        }
        this.f225265i.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendAppMessage", "mmOnActivityResult fail, toUser is null");
            this.f224976f.a("");
        } else {
            java.lang.String optString = this.f225265i.optString("thumbUrl");
            byte[] bArr2 = null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                E(stringExtra, null);
            } else if (optString.startsWith("http")) {
                gk0.h hVar = new gk0.h(optString);
                gk0.k kVar = new gk0.k(0, 0);
                final g75.z Ui = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ui(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Bi(hVar, kVar), kVar, null, "");
                Ui.l("Common_HttpParams", hVar);
                try {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) p3325xe03a0797.p3326xc267989b.l.e(oz5.m.f431862d, new yz5.p() { // from class: com.tencent.mm.plugin.lite.jsapi.comms.q6$$f
                        @Override // yz5.p
                        /* renamed from: invoke */
                        public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                            return ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ni().a(g75.z.this, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
                        }
                    });
                    if (bitmap == null || bitmap.isRecycled()) {
                        if (bitmap == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendAppMessage", "[publicSendAppMgsEvent] thumb image is null");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendAppMessage", "[publicSendAppMgsEvent] thumb image is recycled");
                        }
                    } else if (!bitmap.isRecycled()) {
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                        E(stringExtra, bArr);
                    }
                    bArr = null;
                    E(stringExtra, bArr);
                } catch (java.lang.InterruptedException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendAppMessage", e17.getMessage());
                    E(stringExtra, null);
                }
            } else {
                android.graphics.Bitmap c17 = com.p314xaae8f345.mm.p786x600aa8b.e.c(optString);
                if (c17 == null || c17.isRecycled()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendAppMessage", "[publicSendAppMgsEvent] thumb image decode failed or recycled");
                } else if (!c17.isRecycled()) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                    c17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                    bArr2 = byteArrayOutputStream2.toByteArray();
                }
                E(stringExtra, bArr2);
            }
        }
        this.f224976f.d(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
