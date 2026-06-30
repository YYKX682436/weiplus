package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class i6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34487x366c91de = 30;

    /* renamed from: NAME */
    public static final java.lang.String f34488x24728b = "previewImage";

    /* renamed from: g, reason: collision with root package name */
    public final int f163385g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String o17;
        int i18;
        pa1.a aVar;
        pa1.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) e9Var.t3().u0();
        if (c11809xbc286be4 != null && c11809xbc286be4.k() && (aVar = (pa1.a) e9Var.V0().B1(pa1.a.class)) != null && (eVar = ((pa1.t) aVar).f434500x) != null) {
            r45.vd7 vd7Var = eVar.f434489a;
            if (vd7Var != null && vd7Var.f469671d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewImage", "addCustomDataListener to report canvas data");
                java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnStartReportCanvasDataEvent", "startListeningOperationEvent, appId:%s", mo48798x74292566);
                if (na1.d.f417484i == null) {
                    na1.d.f417484i = new na1.b(mo48798x74292566, e9Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.B(mo48798x74292566, na1.d.f417484i);
            }
        }
        android.app.Activity Z0 = e9Var.Z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        java.lang.String mo48798x742925662 = e9Var.mo48798x74292566();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray == null || optJSONArray.length() <= 0 || V0 == null || V0.v1() == null) {
            o17 = o("fail:invalid data");
        } else {
            int length = optJSONArray.length();
            java.lang.String[] strArr = new java.lang.String[length];
            for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
                strArr[i19] = optJSONArray.optString(i19);
            }
            java.lang.Object opt = jSONObject.opt("current");
            if (opt instanceof java.lang.Integer) {
                i18 = ((java.lang.Integer) opt).intValue();
            } else if (opt instanceof java.lang.String) {
                int i27 = 0;
                for (int i28 = 0; i28 < length; i28++) {
                    if (opt.equals(strArr[i28])) {
                        i27 = i28;
                    }
                }
                i18 = i27;
            } else {
                i18 = 0;
            }
            for (int i29 = 0; i29 < length; i29++) {
                com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = V0.mo50354x59eafec1().mo49620x1d537609(strArr[i29]);
                if (mo49620x1d537609 == null) {
                    mo49620x1d537609 = V0.mo50354x59eafec1().mo49621x2f1a0d80(strArr[i29]);
                }
                if (mo49620x1d537609 != null) {
                    strArr[i29] = mo49620x1d537609.o();
                }
            }
            java.lang.String[] a17 = if1.a.a(strArr);
            java.lang.String[] b17 = if1.a.b(a17, strArr);
            if (i18 >= a17.length) {
                i18 = 0;
            }
            if (Z0 instanceof android.app.Activity) {
                boolean optBoolean = jSONObject.optBoolean("showmenu", true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewImage", "showmenu:%b", java.lang.Boolean.valueOf(optBoolean));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("nowUrl", a17[i18]);
                intent.putExtra("urlList", a17);
                intent.putExtra("type", -255);
                intent.putExtra("isFromWebView", true);
                intent.putExtra("isFromAppBrand", true);
                intent.putExtra("showmenu", optBoolean);
                int i37 = V0.v1().getResources().getConfiguration().orientation;
                int i38 = i37 == 2 ? 0 : i37 == 1 ? 1 : -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewImage", "KOrientation:%d", java.lang.Integer.valueOf(i38));
                intent.putExtra("KOrientation", i38);
                uh1.a aVar2 = (uh1.a) V0.b(uh1.a.class);
                if (aVar2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.D)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiPreviewImage", "config.referer is null");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q7.a(V0, jSONObject, intent, aVar2.D);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) V0.t3().u0();
                if (c11809xbc286be42 != null) {
                    intent.putExtra("wxaSessionId", c11809xbc286be42.f128809v);
                    intent.putExtra("isFromAppBrandGame", c11809xbc286be42.k());
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = c11809xbc286be42.f128802b2;
                    if (c12559xbdae8559 != null) {
                        intent.putExtra("wxaScene", c12559xbdae8559.f169323f);
                    }
                }
                intent.putExtra("shouldShowScanQrCodeMenu", true);
                intent.putExtra("scanQrCodeGetA8KeyScene", 44);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("stat_scene", 6);
                bundle.putString("stat_app_id", mo48798x742925662);
                bundle.putString("stat_url", V0.X1());
                bundle.putString("wxappPathWithQuery", V0.Y1());
                intent.putExtra("_stat_obj", bundle);
                intent.setClassName(Z0, "com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI");
                try {
                    int length2 = intent.getExtras().toString().length();
                    if (length2 > 524288) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPreviewImage", "data too large size:%d", java.lang.Integer.valueOf(length2));
                        o17 = o("fail:data too large");
                    } else {
                        nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.h6(this, b17));
                        j45.l.o(Z0, "subapp", ".ui.gallery.GestureGalleryUI", intent, this.f163385g, false);
                        o17 = o("ok");
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiPreviewImage", e17, "JsApiPreviewImage get size error", new java.lang.Object[0]);
                    o17 = o("fail");
                }
            } else {
                o17 = o("fail:internal error invalid android context");
            }
        }
        e9Var.a(i17, o17);
    }
}
