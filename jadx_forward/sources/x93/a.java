package x93;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx93/a;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiAddScreenshotShareItem", "invoke: appId=" + str + ", data=" + jSONObject + ", isFromView=" + z17);
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiAddScreenshotShareItem", "appId is null or empty");
            this.f224975e.b("appId is invalid");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiAddScreenshotShareItem", "data is null");
            this.f224975e.b("data is null");
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("itemList");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiAddScreenshotShareItem", "itemList is null or empty");
            this.f224975e.b("itemList is invalid");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.q();
        try {
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString("type");
                    if (optString != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1068531200) {
                            if (hashCode != 97555) {
                                if (hashCode == 1071831751 && optString.equals("gamecenter")) {
                                    qVar.f224979c = true;
                                    qVar.f224980d = optJSONObject.optJSONObject(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiAddScreenshotShareItem", "enable gamecenter share, extraData=" + qVar.f224980d);
                                }
                            } else if (optString.equals("biz")) {
                                qVar.f224978b = true;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiAddScreenshotShareItem", "enable biz share");
                            }
                        } else if (optString.equals("moment")) {
                            qVar.f224977a = true;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiAddScreenshotShareItem", "enable moment share");
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppJsApiAddScreenshotShareItem", "unknown type: " + optString);
                }
            }
            jd.c cVar = this.f224975e;
            long j17 = cVar.f380559c;
            long j18 = cVar.f380557a;
            synchronized (x93.c.class) {
                x93.c.f534256a = j17;
                x93.c.f534257b = qVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScreenshotShareConfigManager", "setConfig: pageId=" + j17 + ", config=" + qVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiAddScreenshotShareItem", "addScreenshotShareItem success, pageId=" + j17 + ", appUuid=" + j18);
            this.f224975e.d();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiAddScreenshotShareItem", e17, "parse itemList failed", new java.lang.Object[0]);
            this.f224975e.b("parse itemList failed: " + e17.getMessage());
        }
    }
}
