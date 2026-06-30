package md3;

/* loaded from: classes.dex */
public final class t extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "openUrlWithExtraWebview";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        ((mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class))).wi(mq0.g0.f412095h);
        java.lang.String optString = data.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            s().mo146xb9724478(i(lc3.x.f399470d));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiOpenUrlWithExtraWebview", "url:" + optString);
        android.content.Intent putExtra = new android.content.Intent().putExtra("rawUrl", optString);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        int optInt = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
        putExtra.putExtra("geta8key_scene", optInt);
        java.lang.String optString2 = data.optString("adInfo", "");
        putExtra.putExtra("ad_info", optString2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        if (optString2.length() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiOpenUrlWithExtraWebview", "adInfo is set, length=" + optString2.length());
        }
        java.lang.String optString3 = data.optString("adUxInfo", "");
        qp3.a.c("MagicBrush", "openUrlWithExtraWebView", optString3, "param");
        java.lang.String optString4 = data.optString("adIsNeedReport");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString4 == null ? "" : optString4, "1")) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("ad_report_ux_info", optString3);
            bundle.putInt("ad_report_scene", optInt);
            bundle.putBoolean("ad_need_report", true);
            putExtra.putExtra("ad_report_bundle", bundle);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiOpenUrlWithExtraWebview", "adIsNeedReport=" + optString4 + ", adScene=" + optInt + " , adUxInfo:" + optString3);
        }
        putExtra.putExtra("ad_ux_info_for_jsapi_pay", optString3);
        java.lang.String optString5 = data.optString("commonUxInfo", "");
        qp3.a.d("MagicBrush", "openUrlWithExtraWebView", optString5, "param");
        putExtra.putExtra("common_ux_info_for_jsapi_pay", optString5);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        putExtra.putExtra("kBizSessionId", com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a);
        lc3.e eVar = this.f399423a;
        j45.l.j(eVar != null ? eVar.B0() : null, "webview", ".ui.tools.WebViewUI", putExtra, null);
        s().mo146xb9724478(k());
        try {
            java.lang.String optString6 = data.optString("adUxInfo", "");
            java.lang.String optString7 = data.optString("traceId", "");
            java.lang.String optString8 = data.optString("frameSetName", "");
            java.lang.String optString9 = data.optString("implType", "");
            java.lang.String optString10 = data.optString("bizName", "");
            java.lang.String optString11 = data.optString("bizScene", "");
            java.util.Map l17 = kz5.c1.l(new jz5.l("apiName", "openUrlWithExtraWebview"));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString6);
            if (optString6.length() > 0) {
                l17.put("uxinfo", optString6);
            }
            mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
            if (c0Var != null) {
                mq0.z zVar = mq0.z.f412180u;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString10);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString11);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString8);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString9);
                mq0.c0.ig(c0Var, zVar, optString10, optString11, optString7, optString8, optString9, null, l17, 64, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "[MBAd] reportFullLink38097Invoke failed", e17);
        }
    }
}
