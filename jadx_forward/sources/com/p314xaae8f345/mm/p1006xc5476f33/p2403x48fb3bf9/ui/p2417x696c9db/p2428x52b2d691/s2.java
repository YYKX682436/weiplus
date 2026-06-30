package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class s2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s2 f268045d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.f422323a.get("opCode");
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
        nw4.g gVar = env.f422396d;
        if (D1 != 0) {
            gVar.e(msg.f422546c, "gotoSetting:fail opCode is not defined", null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGotoSettingTAG", "opCode 0");
        android.content.Context context = env.f422393a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        java.lang.String str = zc.c.f552873c;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
            throw null;
        }
        intent.setData(android.net.Uri.fromParts("package", str, null));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGotoSetting", "openAppSettings", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGotoSetting", "openAppSettings", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        gVar.e(msg.f422546c, "gotoSetting:ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f0.f34795x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "gotoSetting";
    }
}
