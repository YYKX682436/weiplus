package z43;

/* loaded from: classes8.dex */
public class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f551654g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f551655h;

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        boolean z18;
        this.f551654g = str;
        this.f551655h = jSONObject;
        java.lang.String optString = jSONObject.optString("appId");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            this.f551654g = optString;
        }
        java.lang.String optString2 = jSONObject.optString("thumbUrl");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) && optString2.startsWith("http")) {
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(optString2, null);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = "";
        if (optString2 == null) {
            optString2 = "";
        }
        hashMap.put("img_url", optString2);
        hashMap.put("desc", jSONObject.optString("desc"));
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
        hashMap.put("appId", this.f551654g);
        hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714));
        hashMap.put("query", jSONObject.optString("query"));
        hashMap.put("bizData", jSONObject.optString("bizData"));
        hashMap.put(ya.b.f77502x92235c1b, java.lang.String.valueOf(jSONObject.optInt(ya.b.f77502x92235c1b)));
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4, java.lang.String.valueOf(jSONObject.optInt(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4)));
        hashMap.put("gameShareId", jSONObject.optString("gameShareId"));
        hashMap.put("gameShareData", jSONObject.optString("gameShareData"));
        hashMap.put("srcId", jSONObject.optString("srcId"));
        hashMap.put("isVideo", java.lang.String.valueOf(jSONObject.optInt("isVideo")));
        hashMap.put("duration", java.lang.String.valueOf(jSONObject.optInt("duration")));
        hashMap.put("isGameShareCard", "true");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendGameShareCard", "sendGameShareCard params:" + hashMap);
        boolean optBoolean = jSONObject.optBoolean("isRecentForward");
        java.lang.String optString3 = jSONObject.optString("content");
        int optInt = jSONObject.optInt(ya.b.f77479x42930b2);
        if (optBoolean) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1865L, 12L, 1L, false);
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            java.util.ArrayList Ui = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m().Ui();
            if (!Ui.isEmpty()) {
                for (int i17 = 0; i17 < Ui.size(); i17++) {
                    o25.m2 m2Var = (o25.m2) Ui.get(i17);
                    if (optInt == i17 && optString3.equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(m2Var.f424093a))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1865L, 13L, 1L, false);
                        z18 = true;
                        str2 = m2Var.f424093a;
                        break;
                    }
                }
            }
        }
        z18 = false;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("webview_params", hashMap);
        if (z18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1865L, 14L, 1L, false);
            intent.putExtra("Select_Conv_User", str2);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).sk(this, intent, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void x(int i17, int i18, android.content.Intent intent) {
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
        java.lang.String optString = this.f551655h.optString("thumbUrl");
        byte[] bArr = null;
        android.graphics.Bitmap Bi = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) ? optString.startsWith("http") ? ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(optString) : com.p314xaae8f345.mm.p786x600aa8b.e.c(this.f551655h.optString("thumbUrl")) : null;
        if (Bi != null && !Bi.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendGameShareCard", "thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        }
        ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).Ai(new com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16074x60a84deb(new com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138(this.f551654g, this.f551655h.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714), this.f551655h.optString("query"), this.f551655h.optString("bizData"), java.lang.Integer.valueOf(this.f551655h.optInt(ya.b.f77502x92235c1b)), this.f551655h.optInt(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4)), this.f551655h.optString("gameShareId"), this.f551655h.optString("gameShareData"), this.f551655h.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28), this.f551655h.optInt("isVideo"), this.f551655h.optInt("duration"), this.f551655h.optString("srcId"), this.f551655h.optString("desc")), bArr, stringExtra);
        db5.e1.T(c(), c().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6));
        this.f224976f.d(false);
    }
}
