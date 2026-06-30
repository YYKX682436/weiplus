package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewTask */
/* loaded from: classes7.dex */
public class C12100xc6f8f713 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f162454d = "MicroMsg.WxaOpenLiteAppBusinessViewTask";

    /* renamed from: e, reason: collision with root package name */
    private static final int f162455e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f162456f = "WeAppLaunchLiteAppResult";

    /* renamed from: g, reason: collision with root package name */
    private static final int f162457g = 10000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f162458h = 10001;

    /* renamed from: i, reason: collision with root package name */
    private static final int f162459i = 10002;

    /* renamed from: m, reason: collision with root package name */
    private static final int f162460m = 20000;

    /* renamed from: n, reason: collision with root package name */
    private static final int f162461n = 20001;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f162454d, "actionName:" + str + " data:" + obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12099xe9665e2b c12099xe9665e2b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12099xe9665e2b();
        if (f162456f.equals(str)) {
            if (obj instanceof org.json.JSONObject) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                try {
                    int i18 = jSONObject.has("errno") ? jSONObject.getInt("errno") : 0;
                    java.lang.String string = jSONObject.has("errMsg") ? jSONObject.getString("errMsg") : "";
                    org.json.JSONObject jSONObject2 = jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) ? jSONObject.getJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) : new org.json.JSONObject();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(i18 == 0 ? "ok: " : "fail: ");
                    sb6.append(string);
                    java.lang.String sb7 = sb6.toString();
                    c12099xe9665e2b.f162451d = i18;
                    c12099xe9665e2b.f162452e = sb7;
                    c12099xe9665e2b.f162453f = jSONObject2;
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f162454d, "fail: json parse fail:", e17);
                    c12099xe9665e2b.f162451d = 20000;
                    c12099xe9665e2b.f162452e = "fail: json parse fail";
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f162454d, "data is not json object");
                c12099xe9665e2b.f162451d = 20001;
                c12099xe9665e2b.f162452e = "fail: data is not json object";
            }
        }
        m50420x7b736e5c(c12099xe9665e2b);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12099xe9665e2b c12099xe9665e2b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12099xe9665e2b();
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12098x43491e41)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f162454d, "handleRequest, request not instance of WxaOpenLiteAppBusinessViewTask");
            c12099xe9665e2b.f162451d = 10000;
            c12099xe9665e2b.f162452e = "fail: request not instance of WxaOpenLiteAppBusinessViewTask";
            m50420x7b736e5c(c12099xe9665e2b);
            return;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12098x43491e41 c12098x43491e41 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12098x43491e41) abstractC11887x3610e10c;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", c12098x43491e41.f162447t);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, c12098x43491e41.f162448u);
        bundle.putString("query", c12098x43491e41.f162446s);
        bundle.putBoolean("isHalfScreen", c12098x43491e41.f162437g == 2);
        bundle.putLong("timeout", c12098x43491e41.f162434d);
        bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, c12098x43491e41.f162439i);
        bundle.putBoolean("withDownloadLoading", c12098x43491e41.f162443p);
        bundle.putBoolean("forbidRightGesture", c12098x43491e41.f162441n);
        bundle.putString("minVersion", c12098x43491e41.f162442o);
        if (c12098x43491e41.f162438h != 0) {
            ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
            bundle.putDouble("heightPercent", c12098x43491e41.f162438h / r0.heightPixels);
        } else {
            float f17 = c12098x43491e41.f162445r;
            if (f17 != 0.0f) {
                bundle.putDouble("heightPercent", f17);
            }
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
        c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.WA_APP;
        c3708xc1f46f80.f14312x721f2ec7 = c12098x43491e41.f162449v;
        try {
            c3708xc1f46f80.f14309xf0df6fda = new org.json.JSONObject(c12098x43491e41.f162450w);
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f162454d, "parse extraData fail");
        }
        bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r() { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewTask$$a
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
            /* renamed from: onDispatch */
            public final boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
                boolean d17;
                d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12100xc6f8f713.this.d(j17, str, obj, i17);
                return d17;
            }
        };
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(m50421x3c6fed6a(), bundle, c12098x43491e41.f162435e, c12098x43491e41.f162436f, sVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.n0(this));
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewTask.2
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c32 = c5675xda3892c3;
                am.ri riVar = c5675xda3892c32.f136001g;
                if (riVar.f89350a != 3) {
                    return false;
                }
                java.lang.String str = riVar.f89352c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12098x43491e41 c12098x43491e412 = c12098x43491e41;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, c12098x43491e412.f162447t)) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12100xc6f8f713.f162454d, "close liteapp appId " + c5675xda3892c32.f136001g.f89352c + ", " + c12098x43491e412.f162447t);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12099xe9665e2b c12099xe9665e2b2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12099xe9665e2b();
                c12099xe9665e2b2.f162451d = 10001;
                c12099xe9665e2b2.f162452e = "fail: close liteapp";
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12100xc6f8f713.this.m50420x7b736e5c(c12099xe9665e2b2);
                mo48814x2efc64();
                return false;
            }
        }.mo48813x58998cd();
    }
}
