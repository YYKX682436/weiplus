package ux4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lux4/e;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiOpenCameraForImageSearch", "[openCameraForImageSearch] app = " + str + ", data = " + jSONObject);
        android.content.Context c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.a((android.app.Activity) c17, "android.permission.CAMERA", 18, "", "")) {
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
            c11120x15dce88d.f152728h = 10000;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.g("", "", c11120x15dce88d, 10000000, 16);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            g17.f237214s = bool;
            g17.f237215t = java.lang.Boolean.FALSE;
            g17.f237217v = bool;
            g17.f237210o.f146316o = i65.a.r(c17, com.p314xaae8f345.mm.R.C30867xcad56011.hku);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("media_provider", g17);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
            intent.putExtra("proxyui_action_code_key", 14);
            intent.putExtra("record_provider", (android.os.Parcelable) bundle.get("media_provider"));
            intent.putExtra("request_code", 4300);
            int i17 = m93.j.f406598y + 1;
            m93.j.f406598y = i17;
            m93.j.f406599z.put(java.lang.Integer.valueOf(i17), this);
            intent.putExtra("callback_id", m93.j.f406598y);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/lite/LiteAppFeatureService", "startWxaLiteProxyUI", "(Lcom/tencent/mm/plugin/lite/api/LiteAppJsApi;Landroid/os/Bundle;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/lite/LiteAppFeatureService", "startWxaLiteProxyUI", "(Lcom/tencent/mm/plugin/lite/api/LiteAppJsApi;Landroid/os/Bundle;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void i(java.lang.String path, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiOpenCameraForImageSearch", "openSearchImgIPC, imgPath = " + path + ", source = " + i17);
        switch (i17) {
            case 18:
            case 20:
                i18 = 6;
                break;
            case 19:
            case 21:
                i18 = 7;
                break;
            default:
                i18 = 0;
                break;
        }
        tg0.f1 f1Var = (tg0.f1) i95.n0.c(tg0.f1.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((sg0.e) f1Var).wi(context, 11, i18, path);
    }
}
