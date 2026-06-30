package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveTask */
/* loaded from: classes7.dex */
class C12120x6984f338 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v implements p012xc85e97e9.p093xedfae76a.x {
    private C12120x6984f338() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ jz5.f0 b() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        r45.nw1 m76794xd0557130;
        m50421x3c6fed6a().mo273xed6858b4().a(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12119x18e3e510 c12119x18e3e510 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12119x18e3e510();
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12118x37c73fc)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiShareCurrentLive", "handleRequest, request not instance of ShareCurrentLiveRequest");
            m50420x7b736e5c(c12119x18e3e510);
            return;
        }
        java.lang.Long l17 = null;
        try {
            jSONObject = new org.json.JSONObject(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12118x37c73fc) abstractC11887x3610e10c).f162702d);
        } catch (java.lang.Throwable unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiShareCurrentLive", "data is null");
            m50420x7b736e5c(c12119x18e3e510);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiShareCurrentLive", "ShareCurrentLiveTask json:" + jSONObject);
        java.lang.String liveId = jSONObject.optString("liveID", "");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("instantDiscountActivityExtra");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("activityKey");
            java.lang.String optString2 = optJSONObject.optString("coverMaskImageURL");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("instantDiscountActivityKey", optString);
            bundle.putString("instantDiscountMaskUrl", optString2);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = m50421x3c6fed6a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12117x668c2da9 c12117x668c2da9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12117x668c2da9();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null && (c19792x256d2725 = c1Var.f410379n) != null && (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) != null) {
                l17 = java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0));
            }
            long Z = pm0.v.Z(liveId);
            if (l17 != null && Z == l17.longValue()) {
                efVar.l0(activity, bundle, c12117x668c2da9);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveFeatureService", "shareLiveToFriendFromJs failed, liveId " + Z + " does not match current liveId " + liveId);
            }
        }
        m50420x7b736e5c(c12119x18e3e510);
    }
}
