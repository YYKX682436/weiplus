package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class n6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34493x366c91de = 787;

    /* renamed from: NAME */
    public static final java.lang.String f34494x24728b = "previewMedia";

    /* renamed from: g, reason: collision with root package name */
    public final int f163484g = cf.b.a(this);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f163485h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f163486i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f163487m = new java.lang.Object();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        pa1.a aVar;
        pa1.e eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewMedia", "previewMedia data:%s", jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) e9Var.t3().u0();
        if (c11809xbc286be4 != null && c11809xbc286be4.k() && (aVar = (pa1.a) e9Var.V0().B1(pa1.a.class)) != null && (eVar = ((pa1.t) aVar).f434500x) != null) {
            r45.vd7 vd7Var = eVar.f434489a;
            if (vd7Var != null && vd7Var.f469671d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewMedia", "addCustomDataListener to report canvas data");
                java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnStartReportCanvasDataEvent", "startListeningOperationEvent, appId:%s", mo48798x74292566);
                if (na1.d.f417484i == null) {
                    na1.d.f417484i = new na1.b(mo48798x74292566, e9Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.B(mo48798x74292566, na1.d.f417484i);
            }
        }
        java.lang.String mo48798x742925662 = e9Var.mo48798x74292566();
        android.app.Activity Z0 = e9Var.Z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("sources");
        if (optJSONArray == null || V0 == null || V0.v1() == null) {
            e9Var.a(i17, o("fail:invalid data"));
            return;
        }
        int length = optJSONArray.length();
        java.lang.String[] strArr = new java.lang.String[length];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
            com.p314xaae8f345.mm.p859x62f6fe4.p866x633fb29.C10902xf7e1f39 c10902xf7e1f39 = new com.p314xaae8f345.mm.p859x62f6fe4.p866x633fb29.C10902xf7e1f39();
            c10902xf7e1f39.f150465d = optJSONObject.optString("url");
            c10902xf7e1f39.f150466e = optJSONObject.optString("type");
            c10902xf7e1f39.f150467f = optJSONObject.optString("poster");
            c10902xf7e1f39.f150468g = optJSONObject.optString("thumbUrl");
            strArr[i19] = c10902xf7e1f39.f150465d;
            if (!android.text.TextUtils.isEmpty(c10902xf7e1f39.f150467f)) {
                com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = V0.mo50354x59eafec1().mo49620x1d537609(c10902xf7e1f39.f150467f);
                if (mo49620x1d537609 != null) {
                    c10902xf7e1f39.f150467f = mo49620x1d537609.o();
                }
                if (c10902xf7e1f39.f150467f.startsWith("http") && !arrayList2.contains(c10902xf7e1f39.f150467f)) {
                    arrayList2.add(c10902xf7e1f39.f150467f);
                }
            }
            if (!android.text.TextUtils.isEmpty(c10902xf7e1f39.f150465d)) {
                com.p314xaae8f345.mm.vfs.r6 mo49620x1d5376092 = V0.mo50354x59eafec1().mo49620x1d537609(c10902xf7e1f39.f150465d);
                if (mo49620x1d5376092 != null) {
                    strArr[i19] = mo49620x1d5376092.o();
                    c10902xf7e1f39.f150465d = mo49620x1d5376092.o();
                }
                if (c10902xf7e1f39.f150465d.startsWith("http") && !"video".equalsIgnoreCase(c10902xf7e1f39.f150466e) && !arrayList2.contains(c10902xf7e1f39.f150465d)) {
                    arrayList2.add(c10902xf7e1f39.f150465d);
                }
            }
            if (!android.text.TextUtils.isEmpty(c10902xf7e1f39.f150468g)) {
                com.p314xaae8f345.mm.vfs.r6 mo49620x1d5376093 = V0.mo50354x59eafec1().mo49620x1d537609(c10902xf7e1f39.f150468g);
                if (mo49620x1d5376093 != null) {
                    c10902xf7e1f39.f150468g = mo49620x1d5376093.o();
                }
                if (c10902xf7e1f39.f150468g.startsWith("http") && !arrayList2.contains(c10902xf7e1f39.f150468g)) {
                    arrayList2.add(c10902xf7e1f39.f150468g);
                }
            }
            arrayList.add(c10902xf7e1f39);
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
        if (i18 < 0 || i18 >= length) {
            i18 = 0;
        }
        java.lang.String[] a17 = if1.a.a(strArr);
        java.lang.String[] b17 = if1.a.b(a17, strArr);
        int i29 = i18 >= a17.length ? 0 : i18;
        if (!(Z0 instanceof android.app.Activity)) {
            e9Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        synchronized (this.f163487m) {
            this.f163485h.clear();
            this.f163486i.clear();
            if (b17.length > 0) {
                this.f163485h.addAll(java.util.Arrays.asList(b17));
            }
        }
        if (arrayList2.isEmpty()) {
            e9Var.a(i17, C(Z0, V0, mo48798x742925662, jSONObject, a17, i29, arrayList));
            return;
        }
        java.lang.String[] strArr2 = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j6 j6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j6(this, a17, arrayList, Z0, V0, mo48798x742925662, jSONObject, i29, e9Var, i17);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(java.util.Arrays.asList(strArr2));
        for (java.lang.String str : strArr2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewMedia", "getImageFromDiskCache url:%s", str);
            if (str.startsWith("http")) {
                V0.a2().n(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l6(this, arrayList3, j6Var));
            }
        }
    }

    public final java.lang.String C(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, org.json.JSONObject jSONObject, java.lang.String[] strArr, int i17, java.util.ArrayList arrayList) {
        boolean optBoolean = jSONObject.optBoolean("showmenu", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewMedia", "showmenu:%b", java.lang.Boolean.valueOf(optBoolean));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("nowUrl", strArr[i17]);
        intent.putParcelableArrayListExtra("mediaSource", arrayList);
        intent.putExtra("urlList", strArr);
        intent.putExtra("type", -255);
        intent.putExtra("isFromWebView", true);
        intent.putExtra("isFromAppBrand", true);
        int i18 = v5Var.v1().getResources().getConfiguration().orientation;
        int i19 = i18 == 2 ? 0 : i18 == 1 ? 1 : -1;
        intent.putExtra("KOrientation", i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreviewMedia", "KOrientation:%d", java.lang.Integer.valueOf(i19));
        intent.putExtra("showmenu", optBoolean);
        uh1.a aVar = (uh1.a) v5Var.b(uh1.a.class);
        if (aVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.D)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiPreviewMedia", "config.referer is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q7.a(v5Var, jSONObject, intent, aVar.D);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) v5Var.t3().u0();
        if (c11809xbc286be4 != null) {
            intent.putExtra("wxaSessionId", c11809xbc286be4.f128809v);
            intent.putExtra("isFromAppBrandGame", c11809xbc286be4.k());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = c11809xbc286be4.f128802b2;
            if (c12559xbdae8559 != null) {
                intent.putExtra("wxaScene", c12559xbdae8559.f169323f);
            }
        }
        intent.putExtra("shouldShowScanQrCodeMenu", true);
        intent.putExtra("scanQrCodeGetA8KeyScene", 44);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 6);
        bundle.putString("stat_app_id", str);
        bundle.putString("stat_url", v5Var.X1());
        bundle.putString("wxappPathWithQuery", v5Var.Y1());
        intent.putExtra("_stat_obj", bundle);
        intent.setClassName(context, "com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI");
        try {
            int length = intent.getExtras().toString().length();
            if (length > 524288) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPreviewMedia", "data too large size:%d", java.lang.Integer.valueOf(length));
                return o("fail:data too large");
            }
            nf.g.a(context).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k6(this));
            j45.l.o(context, "subapp", ".ui.gallery.GestureGalleryUI", intent, this.f163484g, false);
            return o("ok");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiPreviewMedia", e17, "JsApiPreviewImage get size error", new java.lang.Object[0]);
            return o("fail");
        }
    }
}
