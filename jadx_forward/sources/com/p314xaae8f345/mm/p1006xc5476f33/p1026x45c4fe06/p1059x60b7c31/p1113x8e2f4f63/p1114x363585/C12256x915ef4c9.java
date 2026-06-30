package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/GetCardListTask;", "Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/AbsTransitCardTask;", "Lhe1/h;", "B", "Ljz5/f0;", "z", "<init>", "()V", "", "appId", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "je1/f", "luggage-commons-jsapi-transitcard-ext_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.GetCardListTask */
/* loaded from: classes15.dex */
public final class C12256x915ef4c9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6 {

    /* renamed from: CREATOR */
    public static final je1.f f34891x681a0c0c = new je1.f(null);

    public C12256x915ef4c9() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6
    public he1.h B() {
        return new he1.e();
    }

    public final void H(int i17, java.lang.String str) {
        this.f165009m = false;
        this.f165006g = i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f165007h = str;
    }

    public final void I(org.json.JSONObject jSONObject, org.json.JSONArray jSONArray) {
        try {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            this.f165008i = jSONObject2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.GetCardListTask", "writeFilteredCards error: " + e17.getMessage());
            H(10014, "write filtered result error: " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        C();
        if (!this.f165009m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, AIDL failed, skip CGI filter");
            c();
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f165008i);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (optJSONArray == null) {
                optJSONArray = jSONObject.optJSONArray("cards");
            }
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
            if (optJSONArray.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, empty card list, skip CGI filter");
                c();
                return;
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int length = optJSONArray.length();
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString("issuerID", "");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    if (optString.length() > 0) {
                        linkedHashSet.add(optString);
                    }
                }
                i17++;
            }
            if (linkedHashSet.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, no issuerID extracted from card list, return empty result");
                I(jSONObject, new org.json.JSONArray());
                c();
                return;
            }
            ee1.e b17 = ee1.g.b(this.f165005f, kz5.p0.f395529d, kz5.n0.S0(linkedHashSet));
            if (b17 instanceof ee1.c) {
                java.util.HashSet Q0 = kz5.n0.Q0(((ee1.c) b17).f333108b);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                int length2 = optJSONArray.length();
                for (int i18 = 0; i18 < length2; i18++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i18);
                    if (optJSONObject2 != null && Q0.contains(optJSONObject2.optString("issuerID", ""))) {
                        jSONArray.put(optJSONObject2);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, filter done, total=%d, validIssuer=%d, kept=%d", java.lang.Integer.valueOf(optJSONArray.length()), java.lang.Integer.valueOf(Q0.size()), java.lang.Integer.valueOf(jSONArray.length()));
                I(jSONObject, jSONArray);
            } else if (b17 instanceof ee1.b) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                ee1.b bVar = (ee1.b) b17;
                objArr[0] = java.lang.Integer.valueOf(bVar.f333104a);
                objArr[1] = java.lang.Integer.valueOf(bVar.f333105b);
                java.lang.String str = bVar.f333106c;
                objArr[2] = str != null ? str : "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, filter CGI network error, errType=%d, errCode=%d, errMsg=%s", objArr);
                H(10013, "filter cgi failed: " + str);
            } else if (b17 instanceof ee1.a) {
                ee1.a aVar = (ee1.a) b17;
                int i19 = aVar.f333102a;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
                java.lang.String str2 = aVar.f333103b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, filter CGI biz error, retCode=%d, retMsg=%s", valueOf, str2);
                H(i19, str2);
            } else if (b17 instanceof ee1.d) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runInMainProcess, filter CGI timeout: ");
                java.lang.String str3 = ((ee1.d) b17).f333109a;
                sb6.append(str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.GetCardListTask", sb6.toString());
                H(10017, "filter cgi timeout: " + str3);
            }
            c();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, parse resultData error: " + e17.getMessage());
            H(10014, "parse cardList error: " + e17.getMessage());
            c();
        }
    }

    public C12256x915ef4c9(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f165005f = appId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12256x915ef4c9(android.os.Parcel parcel) {
        super(parcel);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
    }
}
