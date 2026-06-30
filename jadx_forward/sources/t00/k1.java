package t00;

/* loaded from: classes7.dex */
public final class k1 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495874v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (i17 != 3) {
            callback.a();
            return;
        }
        data.toString();
        org.json.JSONObject optJSONObject = data.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (optJSONObject == null) {
            callback.a();
            return;
        }
        java.lang.String optString = optJSONObject.optString("op");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            callback.a();
            return;
        }
        if (context == 0 || !((z17 = context instanceof u00.a))) {
            callback.a();
            return;
        }
        u00.a aVar = z17 ? (u00.a) context : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "changeImage")) {
            int optInt = optJSONObject.optInt("currentIndex", 0);
            if (aVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.ecs.ActivityC18527xfa2b63b2 activityC18527xfa2b63b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.ecs.ActivityC18527xfa2b63b2) aVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg. EcsGestureGalleryUI", "onMbChangeImageToIndex: " + optInt);
                if (optInt < 0 || optInt >= activityC18527xfa2b63b2.f253732i2.size()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GestureGalleryUI", "setSelection fail, invalid position");
                } else {
                    com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = activityC18527xfa2b63b2.f253723e;
                    if (c22506x89e75b89 != null) {
                        c22506x89e75b89.setSelection(optInt);
                    }
                }
            }
            callback.b(null);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "updatePassBuffer")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("KEcsMBPassBufferToNative", optJSONObject.optString("passBuffer"));
            callback.b(null);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "updateCircleToSearchData")) {
            java.lang.String optString2 = optJSONObject.optString("extInfo");
            java.lang.String optString3 = optJSONObject.optString("reportInfoFor33399");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            L.putString("KPassExtInfoToSearch", optString2);
            L.putString("KPassReportInfoToSearch", optString3);
            callback.b(null);
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "closeImage")) {
            callback.a();
            return;
        }
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.ecs.ActivityC18527xfa2b63b2 activityC18527xfa2b63b22 = (com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.ecs.ActivityC18527xfa2b63b2) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg. EcsGestureGalleryUI", "onMbCloseImage");
            activityC18527xfa2b63b22.C7();
            activityC18527xfa2b63b22.L7(true);
        }
        callback.b(null);
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
