package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask */
/* loaded from: classes7.dex */
public class C12109x280200b8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12109x280200b8> f34265x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.h();

    /* renamed from: f, reason: collision with root package name */
    public final int f162687f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162688g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162689h;

    public C12109x280200b8(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        this.f162687f = i17;
        this.f162688g = e9Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f162689h = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162689h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        org.json.JSONObject optJSONObject;
        org.json.JSONArray optJSONArray;
        org.json.JSONArray jSONArray;
        org.json.JSONArray jSONArray2;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f162689h);
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (optJSONArray2 != null) {
                int i17 = 0;
                while (i17 < optJSONArray2.length()) {
                    org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i17);
                    if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("objectDesc")) != null && (optJSONArray = optJSONObject.optJSONArray("media")) != null) {
                        int i18 = 0;
                        for (optJSONArray = optJSONObject.optJSONArray("media"); i18 < optJSONArray.length(); optJSONArray = jSONArray2) {
                            org.json.JSONObject optJSONObject3 = optJSONArray.optJSONObject(i18);
                            if (optJSONObject3 != null) {
                                java.lang.String optString = optJSONObject3.optString("url");
                                java.lang.String optString2 = optJSONObject3.optString("thumbUrl");
                                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
                                if (K0 || optString.startsWith("http")) {
                                    jSONArray = optJSONArray2;
                                    jSONArray2 = optJSONArray;
                                } else {
                                    ik1.b0 b0Var = new ik1.b0();
                                    jSONArray = optJSONArray2;
                                    jSONArray2 = optJSONArray;
                                    if (this.f162688g.mo50354x59eafec1().mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(optString)), null, false, b0Var) == j1Var) {
                                        optJSONObject3.put("url", b0Var.f373357a);
                                    }
                                }
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) && !optString2.startsWith("http")) {
                                    ik1.b0 b0Var2 = new ik1.b0();
                                    if (this.f162688g.mo50354x59eafec1().mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(optString2)), null, false, b0Var2) == j1Var) {
                                        optJSONObject3.put("thumbUrl", b0Var2.f373357a);
                                    }
                                    i18++;
                                    optJSONArray2 = jSONArray;
                                }
                            } else {
                                jSONArray = optJSONArray2;
                                jSONArray2 = optJSONArray;
                            }
                            i18++;
                            optJSONArray2 = jSONArray;
                        }
                    }
                    i17++;
                    optJSONArray2 = optJSONArray2;
                }
            }
            this.f162689h = jSONObject.toString();
        } catch (java.lang.Exception e17) {
            java.lang.String message = e17.getMessage();
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errMsg", message);
                jSONObject2.put("errCode", -1);
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray3);
            } catch (java.lang.Exception unused) {
            }
            this.f162689h = jSONObject2.toString();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiFetchSendingAndFailProfileFeed", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", this.f162688g.mo48798x74292566(), this.f162689h, java.lang.Integer.valueOf(this.f162687f), java.lang.Boolean.valueOf(this.f162688g.mo50262x39e05d35()));
        this.f162688g.a(this.f162687f, this.f162689h);
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.i(this), "JsApiFetchSendingAndFailProfileFeed");
    }

    public C12109x280200b8(android.os.Parcel parcel) {
        v(parcel);
    }
}
