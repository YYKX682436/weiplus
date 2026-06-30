package com.tencent.mm.plugin.appbrand.jsapi.transitcard.task;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/GetCardListTask;", "Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/AbsTransitCardTask;", "Lhe1/h;", "B", "Ljz5/f0;", "z", "<init>", "()V", "", "appId", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "je1/f", "luggage-commons-jsapi-transitcard-ext_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class GetCardListTask extends com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask {
    public static final je1.f CREATOR = new je1.f(null);

    public GetCardListTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask
    public he1.h B() {
        return new he1.e();
    }

    public final void H(int i17, java.lang.String str) {
        this.f83476m = false;
        this.f83473g = i17;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f83474h = str;
    }

    public final void I(org.json.JSONObject jSONObject, org.json.JSONArray jSONArray) {
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            this.f83475i = jSONObject2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.GetCardListTask", "writeFilteredCards error: " + e17.getMessage());
            H(10014, "write filtered result error: " + e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        C();
        if (!this.f83476m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, AIDL failed, skip CGI filter");
            c();
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f83475i);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (optJSONArray == null) {
                optJSONArray = jSONObject.optJSONArray("cards");
            }
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
            if (optJSONArray.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, empty card list, skip CGI filter");
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
                    kotlin.jvm.internal.o.d(optString);
                    if (optString.length() > 0) {
                        linkedHashSet.add(optString);
                    }
                }
                i17++;
            }
            if (linkedHashSet.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, no issuerID extracted from card list, return empty result");
                I(jSONObject, new org.json.JSONArray());
                c();
                return;
            }
            ee1.e b17 = ee1.g.b(this.f83472f, kz5.p0.f313996d, kz5.n0.S0(linkedHashSet));
            if (b17 instanceof ee1.c) {
                java.util.HashSet Q0 = kz5.n0.Q0(((ee1.c) b17).f251575b);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                int length2 = optJSONArray.length();
                for (int i18 = 0; i18 < length2; i18++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i18);
                    if (optJSONObject2 != null && Q0.contains(optJSONObject2.optString("issuerID", ""))) {
                        jSONArray.put(optJSONObject2);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, filter done, total=%d, validIssuer=%d, kept=%d", java.lang.Integer.valueOf(optJSONArray.length()), java.lang.Integer.valueOf(Q0.size()), java.lang.Integer.valueOf(jSONArray.length()));
                I(jSONObject, jSONArray);
            } else if (b17 instanceof ee1.b) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                ee1.b bVar = (ee1.b) b17;
                objArr[0] = java.lang.Integer.valueOf(bVar.f251571a);
                objArr[1] = java.lang.Integer.valueOf(bVar.f251572b);
                java.lang.String str = bVar.f251573c;
                objArr[2] = str != null ? str : "";
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, filter CGI network error, errType=%d, errCode=%d, errMsg=%s", objArr);
                H(10013, "filter cgi failed: " + str);
            } else if (b17 instanceof ee1.a) {
                ee1.a aVar = (ee1.a) b17;
                int i19 = aVar.f251569a;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
                java.lang.String str2 = aVar.f251570b;
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, filter CGI biz error, retCode=%d, retMsg=%s", valueOf, str2);
                H(i19, str2);
            } else if (b17 instanceof ee1.d) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runInMainProcess, filter CGI timeout: ");
                java.lang.String str3 = ((ee1.d) b17).f251576a;
                sb6.append(str3);
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.GetCardListTask", sb6.toString());
                H(10017, "filter cgi timeout: " + str3);
            }
            c();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.GetCardListTask", "runInMainProcess, parse resultData error: " + e17.getMessage());
            H(10014, "parse cardList error: " + e17.getMessage());
            c();
        }
    }

    public GetCardListTask(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f83472f = appId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCardListTask(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.o.g(parcel, "parcel");
    }
}
