package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductTask */
/* loaded from: classes7.dex */
public class C12125x3177e9b8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v implements p012xc85e97e9.p093xedfae76a.x {
    private C12125x3177e9b8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jz5.f0 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12124xaff33b90 c12124xaff33b90, java.lang.String str) {
        c12124xaff33b90.f162711d = str;
        m50420x7b736e5c(c12124xaff33b90);
        return null;
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
    /* renamed from: doPause */
    public final void m50980x6bee482b(p012xc85e97e9.p093xedfae76a.y yVar) {
        m50420x7b736e5c(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        org.json.JSONObject jSONObject;
        m50421x3c6fed6a().mo273xed6858b4().a(this);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12124xaff33b90 c12124xaff33b90 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12124xaff33b90();
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12123x4e57ed7c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Finder.JsApiShareFinderProduct", "handleRequest, request not instance of ShareFinderProductRequest");
            m50420x7b736e5c(c12124xaff33b90);
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12123x4e57ed7c) abstractC11887x3610e10c).f162710d);
        } catch (java.lang.Throwable unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Finder.JsApiShareFinderProduct", "data is null");
            m50420x7b736e5c(c12124xaff33b90);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiShareFinderProduct", "JsApiShareFinderProduct json:" + jSONObject);
        r45.zc4 zc4Var = new r45.zc4();
        zc4Var.set(0, jSONObject.optString("appId"));
        zc4Var.set(1, jSONObject.optString("productID"));
        zc4Var.set(2, jSONObject.optString("realProductId"));
        zc4Var.set(3, java.lang.Boolean.valueOf(jSONObject.optString("showShareType").equals("0")));
        zc4Var.set(4, jSONObject.optString("esSource"));
        zc4Var.set(5, jSONObject.optString("finderLiveToken"));
        zc4Var.set(6, jSONObject.optString("finderUsername"));
        zc4Var.set(7, jSONObject.optString("entranceGMsgID"));
        zc4Var.set(8, jSONObject.optString("promoterKey"));
        zc4Var.set(9, java.lang.Boolean.valueOf(jSONObject.optBoolean("showQRCodeEntrance")));
        zc4Var.set(10, java.lang.Boolean.valueOf(jSONObject.optBoolean("showCopyLinkEntrance")));
        zc4Var.set(11, java.lang.Boolean.valueOf(jSONObject.optBoolean("showComplaintEntrance")));
        zc4Var.set(12, jSONObject.optString("liteAppId"));
        zc4Var.set(13, jSONObject.optString("liteQuery"));
        zc4Var.set(18, 0);
        zc4Var.set(20, java.lang.Boolean.valueOf(jSONObject.optBoolean("canShowGiveGiftEntrance")));
        zc4Var.set(21, java.lang.Boolean.valueOf(jSONObject.optBoolean("hideGiveGiftEntrance", true)));
        zc4Var.set(25, java.lang.Boolean.valueOf(jSONObject.optBoolean("showShareTimeline")));
        zc4Var.set(26, java.lang.Boolean.valueOf(jSONObject.optBoolean("enableShareTimeline")));
        zc4Var.set(22, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(jSONObject.optString("cpsProductId", "0"))));
        java.lang.String optString = jSONObject.optString("targetUsername");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            zc4Var.set(3, bool);
            zc4Var.set(14, optString);
            zc4Var.set(23, bool);
            zc4Var.set(24, java.lang.Boolean.FALSE);
        }
        zc4Var.set(27, jSONObject.optString("passBuffer"));
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = m50421x3c6fed6a();
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductTask$$a
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                jz5.f0 b17;
                b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12125x3177e9b8.this.b(c12124xaff33b90, (java.lang.String) obj);
                return b17;
            }
        };
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var;
        v4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        v65.i.c(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("MicroMsg.FinderLiveFeatureService", activity, 0, 4, null), null, new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t4(zc4Var, activity, v4Var, lVar, null), 1, null);
    }
}
