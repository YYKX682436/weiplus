package com.p314xaae8f345.p592x631407a.api;

/* renamed from: com.tencent.midas.api.APMidasPayAPI */
/* loaded from: classes13.dex */
public class C4727x8a3e11bd {

    /* renamed from: ACCOUNT_TYPE_COMMON */
    public static final java.lang.String f20059x5e2aa75e = "common";

    /* renamed from: ACCOUNT_TYPE_SECURITY */
    public static final java.lang.String f20060xda945ff3 = "secrety";

    /* renamed from: ENV_DEV */
    public static final java.lang.String f20061xcc101583 = "dev";

    /* renamed from: ENV_RELEASE */
    public static final java.lang.String f20062x575e4a75 = "release";

    /* renamed from: ENV_TEST */
    public static final java.lang.String f20063xb5f9e0c4 = "test";

    /* renamed from: ENV_TESTING */
    public static final java.lang.String f20064xc194547e = "testing";

    /* renamed from: LANDSCAPE */
    public static final int f20065xfb5e029b = 0;

    /* renamed from: PAY_CHANNEL_BANK */
    public static final java.lang.String f20066xde09966f = "bank";

    /* renamed from: PAY_CHANNEL_ECOMMERCE_QQ */
    public static final java.lang.String f20067x95f729d2 = "wechat_ecommerce_qq";

    /* renamed from: PAY_CHANNEL_PAYSCORE */
    public static final java.lang.String f20068xbb10ed9d = "wechat_payscore";

    /* renamed from: PAY_CHANNEL_QQWALLET */
    public static final java.lang.String f20069x6cf280cc = "qqwallet";

    /* renamed from: PAY_CHANNEL_UNIONPAY */
    public static final java.lang.String f20070x56a6ea2c = "wechat_quickpass";

    /* renamed from: PAY_CHANNEL_WECHAT */
    public static final java.lang.String f20071xa606d699 = "wechat";

    /* renamed from: PORTRAINT */
    public static final int f20072xe997c75f = 1;
    private static final java.lang.String TAG = "APMidasPayAPI";

    /* renamed from: WX_COUPONS */
    public static final java.lang.String f20073xeceef98f = "wechatAddCardToWXCardPackage";

    /* renamed from: dataPath */
    private static java.lang.String f20074x6aa0e2ef = "";
    public static java.lang.String env = "release";

    /* renamed from: fromApplicationContext */
    public static android.content.Context f20075xfeeb2b89 = null;

    /* renamed from: logCallbackClassName */
    private static java.lang.String f20076x212ba67a = "";

    /* renamed from: logEnable */
    private static boolean f20077x5c1d31e7 = true;

    /* renamed from: screenType */
    private static int f20078xe71fadc6 = -1;

    /* renamed from: H5Release */
    public static void m41345xd917425a() {
        if (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20451xade6267c != null) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20451xade6267c = null;
        }
        if (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20450x48fb3bf9 != null) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20450x48fb3bf9 = null;
        }
        if (com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20448xe618f103 != null) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20448xe618f103 = null;
        }
    }

    /* renamed from: InnerH5PayInit */
    public static void m41346x22f14eb5(android.app.Activity activity, android.webkit.WebView webView) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "InnerH5PayInit enter");
        if (m41349x27a5e4ae(activity)) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20420x94fcbcf4 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20416x9faba3ab;
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41770xb485b77d(activity, webView, null);
        }
    }

    /* renamed from: InnerH5PayInitX5 */
    public static void m41347x2bd88052(android.app.Activity activity, com.tencent.smtt.sdk.WebView webView) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "InnerH5PayInit enter");
        if (m41349x27a5e4ae(activity)) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20420x94fcbcf4 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20416x9faba3ab;
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41770xb485b77d(activity, null, webView);
        }
    }

    /* renamed from: checkInitCommParam */
    private static boolean m41348x21752589(android.content.Context context, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        if (!env.equals("release")) {
            try {
                if (ub.a.b().equals("com.tencent.unipay")) {
                    return true;
                }
                if (abstractC4741xef9abf3 == null) {
                    android.widget.Toast.makeText(context, "初始化request不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(abstractC4741xef9abf3.f20183xa3aefc97)) {
                    android.widget.Toast.makeText(context, "初始化offerid不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(abstractC4741xef9abf3.f20184xc3c3c505)) {
                    android.widget.Toast.makeText(context, "初始化openId不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(abstractC4741xef9abf3.f20185xb4b4e3b5)) {
                    android.widget.Toast.makeText(context, "初始化openKey不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(abstractC4741xef9abf3.f20193x243a3e51)) {
                    android.widget.Toast.makeText(context, "初始化sessionId不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(abstractC4741xef9abf3.f20194xfea94af0)) {
                    android.widget.Toast.makeText(context, "初始化sessionType不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(abstractC4741xef9abf3.f134673pf)) {
                    android.widget.Toast.makeText(context, "初始化pf不能为空", 1).show();
                    return false;
                }
                if (android.text.TextUtils.isEmpty(abstractC4741xef9abf3.f20186x659cc89)) {
                    android.widget.Toast.makeText(context, "初始化pfKey不能为空", 1).show();
                    return false;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return true;
    }

    /* renamed from: checkParams */
    private static boolean m41349x27a5e4ae(android.content.Context context) {
        if (context != null) {
            return true;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "checkParams() context/activity == Null");
        new java.lang.Throwable("APMidasPayAPI().checkParams() context/activity == Null");
        return false;
    }

    /* renamed from: closeAll */
    public static void m41350x4122c089() {
        com.p314xaae8f345.p592x631407a.p604xc5476f33.AbstractC4814x51d64550.m42133x4c6f0a7d();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    /* renamed from: consumeAsync */
    public static void m41351xcb3d33e0(android.app.Activity activity, java.util.List<com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250> list, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.InterfaceC4751x81f80d14 interfaceC4751x81f80d14) {
        java.lang.Class<?> cls;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "consumeAsync enter");
        if (m41349x27a5e4ae(activity)) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
            try {
                cls = java.lang.Class.forName(java.util.List.class.getName());
            } catch (java.lang.ClassNotFoundException e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "consumeAsync setEnv e:" + e17.toString());
                cls = null;
            }
            java.lang.Object m41798x2e7a5e = c4777x7a3dad2b.m41798x2e7a5e(activity, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20414xee33863c, new java.lang.Object[]{list, interfaceC4751x81f80d14}, new java.lang.Class[]{cls, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.InterfaceC4751x81f80d14.class});
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "consumeAsync ret " + m41798x2e7a5e);
            if (m41798x2e7a5e == null) {
                interfaceC4751x81f80d14.m41588xb583b4af(new java.util.ArrayList());
            }
        }
    }

    /* renamed from: directWxPay */
    public static void m41352x9dc22f9e(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4742x2925229b c4742x2925229b, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "directWxPay enter");
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41939xc4d61cee(c4742x2925229b, "sdk.direct.pay.enter", c4742x2925229b.f20215xd10bf576);
        if (!m41349x27a5e4ae(activity) || c4742x2925229b.m41523xed93140().isEmpty()) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "directWxPay params error");
            com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
            c4728x8ec3caec.f20116xdde293aa = 3;
            c4728x8ec3caec.f20109xb6c1d73b = -1;
            c4728x8ec3caec.f20113x51024cc9 = 2;
            c4728x8ec3caec.f20114xe55f0270 = -1;
            c4728x8ec3caec.f20118x938b9624 = "参数错误";
            interfaceC4731xabd5a6ab.mo41389xe81ffc73(c4728x8ec3caec);
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41939xc4d61cee(c4742x2925229b, "sdk.direct.pay.failure", c4742x2925229b.f20215xd10bf576 + "&resultCode=" + c4728x8ec3caec.f20116xdde293aa + "&resultMsg=" + c4728x8ec3caec.f20118x938b9624);
            return;
        }
        try {
            f20075xfeeb2b89 = activity.getApplicationContext();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("fromApplicationContext", e17.toString());
        }
        if (!ub.b.d()) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
            c4777x7a3dad2b.m41812x384b3c8(f20078xe71fadc6);
            c4777x7a3dad2b.m41802x9dc22f9e(activity, c4742x2925229b, interfaceC4731xabd5a6ab);
            return;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("directWxPay", "fast click");
        com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec2 = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
        c4728x8ec3caec2.f20116xdde293aa = -1;
        c4728x8ec3caec2.f20109xb6c1d73b = -1;
        c4728x8ec3caec2.f20113x51024cc9 = 2;
        c4728x8ec3caec2.f20114xe55f0270 = -1;
        c4728x8ec3caec2.f20118x938b9624 = "fast click";
        interfaceC4731xabd5a6ab.mo41389xe81ffc73(c4728x8ec3caec2);
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41939xc4d61cee(c4742x2925229b, "sdk.direct.pay.failure", c4742x2925229b.f20215xd10bf576 + "&resultCode=" + c4728x8ec3caec2.f20116xdde293aa + "&resultMsg=" + c4728x8ec3caec2.f20118x938b9624);
    }

    /* renamed from: getInfo */
    public static void m41353xfb80cd24(android.app.Activity activity, java.lang.String str, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.api.InterfaceC4730x6ddbdaa0 interfaceC4730x6ddbdaa0) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "getInfo enter");
        if (m41349x27a5e4ae(activity)) {
            try {
                f20075xfeeb2b89 = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("fromApplicationContext", e17.toString());
            }
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41930x1fc63b35();
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41938xcc24d221(abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20535x90537a32);
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41935xd303e5f0(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20535x90537a32, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20616xaea7776);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
            c4777x7a3dad2b.m41803xfb80cd24(activity, str, abstractC4741xef9abf3, interfaceC4730x6ddbdaa0);
        }
    }

    /* renamed from: getJSContent */
    public static java.lang.String m41354xadb4c05a(android.content.Context context) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "getJSContent enter");
        return !m41349x27a5e4ae(context) ? "" : com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41768xadb4c05a(context);
    }

    /* renamed from: getMidasCoreVersion */
    public static java.lang.String m41355xfb38a2d5(android.app.Activity activity) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "getMidasCoreVersion enter");
        return !m41349x27a5e4ae(activity) ? "" : com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42162x95f61f00(activity);
    }

    /* renamed from: getMidasPluginVersion */
    public static java.lang.String m41356x83dbbdc1() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "getMidasPluginVersion enter " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        if (!ub.a.b().equals("com.tencent.unipay")) {
            return "1.9.9m";
        }
        try {
            return f20075xfeeb2b89.getPackageManager().getPackageInfo(f20075xfeeb2b89.getPackageName(), 0).versionName;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APMidasCommMethod", "getApplicationVersion error:" + e17.toString());
            return "";
        }
    }

    /* renamed from: getMidasSDKVersion */
    public static java.lang.String m41357x40234522(android.app.Activity activity) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "getMidasSDKVersion enter");
        return m41355xfb38a2d5(activity);
    }

    /* renamed from: getPath */
    public static java.lang.String m41358xfb83cc9b() {
        return f20074x6aa0e2ef;
    }

    /* renamed from: h5PayHook */
    public static int m41359xf1af805e(android.app.Activity activity, android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "h5PayHook enter");
        if (!m41349x27a5e4ae(activity)) {
            return -33;
        }
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
        c4777x7a3dad2b.m41812x384b3c8(f20078xe71fadc6);
        return c4777x7a3dad2b.m41804x5d2dc9b(activity, webView, null, str, str2);
    }

    /* renamed from: h5PayHookX5 */
    public static int m41360x43d0ebbb(android.app.Activity activity, com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.smtt.export.external.interfaces.JsResult jsResult) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "h5PayHookX5 enter");
        if (!m41349x27a5e4ae(activity)) {
            return -33;
        }
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
        c4777x7a3dad2b.m41812x384b3c8(f20078xe71fadc6);
        return c4777x7a3dad2b.m41804x5d2dc9b(activity, null, webView, str, str2);
    }

    /* renamed from: h5PayInit */
    public static void m41361xf1aff04b(android.app.Activity activity, android.webkit.WebView webView) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "h5PayInit enter");
        if (m41349x27a5e4ae(activity)) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20420x94fcbcf4 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20417xb2708363;
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41770xb485b77d(activity, webView, null);
        }
    }

    /* renamed from: h5PayInitUnifier */
    public static void m41362x76988ed5(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.InterfaceC4732x70d4bec1 interfaceC4732x70d4bec1) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "h5PayInitUnifier enter");
        if (m41349x27a5e4ae(activity)) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20420x94fcbcf4 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20417xb2708363;
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41771x1dffab63(activity, interfaceC4732x70d4bec1);
        }
    }

    /* renamed from: h5PayInitX5 */
    public static void m41363x45751468(android.app.Activity activity, com.tencent.smtt.sdk.WebView webView) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "h5PayInitX5 enter");
        if (m41349x27a5e4ae(activity)) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41770xb485b77d(activity, null, webView);
        }
    }

    /* renamed from: hfCouponsRollBack */
    public static void m41364x8e18f653(android.app.Activity activity, java.lang.String str) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "hfCouponsRollBack enter");
        if (m41349x27a5e4ae(activity)) {
            new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b().m41797x2e7a5e(activity, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20400x5f88acac, new java.lang.Object[]{str});
        }
    }

    /* renamed from: init */
    public static void m41365x316510(android.content.Context context, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        if (context != null && abstractC4741xef9abf3 != null) {
            m41367xf3d96f1b(context, abstractC4741xef9abf3);
            if (m41348x21752589(context, abstractC4741xef9abf3)) {
                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41772x316510(context, abstractC4741xef9abf3);
                return;
            } else {
                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20437x926af579 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41775x926af579(context);
                return;
            }
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "init parameter is null!");
    }

    /* renamed from: initCommon */
    private static void m41367xf3d96f1b(android.content.Context context, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41927x84a935cd();
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41933x843386b9(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, abstractC4741xef9abf3);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4757x93559237.m41647xdcb50d5d(context.getApplicationContext(), f20077x5c1d31e7, f20076x212ba67a);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "init new enter");
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41935xd303e5f0(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20608x31c3c565);
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
    }

    /* renamed from: launchAbility */
    public static void m41368x334629f7(android.content.Context context, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.AbstractC4737x67fca45f abstractC4737x67fca45f, final android.os.ResultReceiver resultReceiver) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "launchAbility enter : " + abstractC4737x67fca45f.mo41426x9616526c());
        if (ub.b.d()) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("launchAbility", "isfast");
            if (resultReceiver != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("midas_callback_ability_postBack", abstractC4737x67fca45f.f20159x2d16c1a7);
                bundle.putInt("midas_callback_ability_code", -999);
                bundle.putString("midas_callback_ability_msg", "fast click");
                bundle.putBundle("midas_callback_ability_data", new android.os.Bundle());
                resultReceiver.send(-1, bundle);
                return;
            }
            return;
        }
        if (m41349x27a5e4ae(context)) {
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41930x1fc63b35();
            com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4743x7dd68fb2 c4743x7dd68fb2 = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4743x7dd68fb2();
            c4743x7dd68fb2.f20183xa3aefc97 = abstractC4737x67fca45f.f20154xa3aefc97;
            c4743x7dd68fb2.f20184xc3c3c505 = abstractC4737x67fca45f.f20155xc3c3c505;
            c4743x7dd68fb2.f20185xb4b4e3b5 = abstractC4737x67fca45f.f20156xb4b4e3b5;
            c4743x7dd68fb2.f20193x243a3e51 = abstractC4737x67fca45f.f20160x243a3e51;
            c4743x7dd68fb2.f20194xfea94af0 = abstractC4737x67fca45f.f20161xfea94af0;
            c4743x7dd68fb2.f134673pf = abstractC4737x67fca45f.f134672pf;
            c4743x7dd68fb2.f20186x659cc89 = abstractC4737x67fca45f.f20158x659cc89;
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41938xcc24d221(c4743x7dd68fb2, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20538xc5975291);
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41935xd303e5f0(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20538xc5975291, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20615x8fa1d142);
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20615x8fa1d142, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20597x6d2675d1, "MidasPlugin", abstractC4737x67fca45f.mo41426x9616526c());
            new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b().m41811x94f5d2(context, abstractC4737x67fca45f.mo41425x792022dd(), new android.os.ResultReceiver(new android.os.Handler()) { // from class: com.tencent.midas.api.APMidasPayAPI.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i17, android.os.Bundle bundle2) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.TAG, "launchAbility.onReceiveResult() resultCode=" + i17 + ", resultData=" + bundle2);
                    android.os.ResultReceiver resultReceiver2 = resultReceiver;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(i17, bundle2);
                        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41932x4994497e("launchAbility");
                        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42172x41012807();
                        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41601x4122ea2c();
                    }
                }
            });
        }
    }

    /* renamed from: launchNet */
    public static void m41369xd7c28cea(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4746x3fd7fe1d c4746x3fd7fe1d, com.p314xaae8f345.p592x631407a.api.InterfaceC4730x6ddbdaa0 interfaceC4730x6ddbdaa0) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "launchNet enter");
        if (m41349x27a5e4ae(activity)) {
            try {
                f20075xfeeb2b89 = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("fromApplicationContext", e17.toString());
            }
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41930x1fc63b35();
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41938xcc24d221(c4746x3fd7fe1d, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20539x4c038eb8);
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41935xd303e5f0(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20539x4c038eb8, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20617x31e699b5);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
            c4777x7a3dad2b.net(activity, c4746x3fd7fe1d, interfaceC4730x6ddbdaa0);
        }
    }

    /* renamed from: launchPay */
    public static void m41370xd7c293f5(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "launchPay enter");
        if (m41349x27a5e4ae(activity)) {
            try {
                f20075xfeeb2b89 = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("fromApplicationContext", e17.toString());
            }
            if (!ub.b.d()) {
                com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41930x1fc63b35();
                com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41938xcc24d221(abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20540x4c0395c3);
                com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41935xd303e5f0(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20540x4c0395c3, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20618x31e6a0c0);
                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
                c4777x7a3dad2b.m41812x384b3c8(f20078xe71fadc6);
                c4777x7a3dad2b.pay(activity, abstractC4741xef9abf3, interfaceC4731xabd5a6ab);
                return;
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("launchPay", "isfast");
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(TAG, "launchPay enter fast:" + interfaceC4731xabd5a6ab);
            com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
            c4728x8ec3caec.f20116xdde293aa = -1;
            c4728x8ec3caec.f20109xb6c1d73b = -1;
            c4728x8ec3caec.f20113x51024cc9 = 2;
            c4728x8ec3caec.f20114xe55f0270 = -1;
            c4728x8ec3caec.f20118x938b9624 = "fast click";
            interfaceC4731xabd5a6ab.mo41389xe81ffc73(c4728x8ec3caec);
        }
    }

    /* renamed from: launchPayScoreContract */
    public static void m41371xdea173cf(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84 c4744x18108f84, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "launchPayScoreContract enter");
        if (!m41349x27a5e4ae(activity) || c4744x18108f84 == null || android.text.TextUtils.isEmpty(c4744x18108f84.f20176x93447ae8.f20197x1eed3c76) || android.text.TextUtils.isEmpty(c4744x18108f84.f20176x93447ae8.f20199xb1fbba19) || android.text.TextUtils.isEmpty(c4744x18108f84.f20176x93447ae8.f20200x5fb88975)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "launchPayScoreContract params error");
            com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
            c4728x8ec3caec.f20116xdde293aa = 3;
            c4728x8ec3caec.f20109xb6c1d73b = -1;
            c4728x8ec3caec.f20113x51024cc9 = 2;
            c4728x8ec3caec.f20114xe55f0270 = -1;
            c4728x8ec3caec.f20118x938b9624 = "签约参数错误";
            interfaceC4731xabd5a6ab.mo41389xe81ffc73(c4728x8ec3caec);
            return;
        }
        try {
            f20075xfeeb2b89 = activity.getApplicationContext();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("fromApplicationContext", e17.toString());
        }
        if (!ub.b.d()) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
            c4777x7a3dad2b.m41812x384b3c8(f20078xe71fadc6);
            c4777x7a3dad2b.m41809x84e3d1fc(activity, c4744x18108f84, interfaceC4731xabd5a6ab);
            return;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("launchPayScoreContract", "fast click");
        com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec2 = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
        c4728x8ec3caec2.f20116xdde293aa = -1;
        c4728x8ec3caec2.f20109xb6c1d73b = -1;
        c4728x8ec3caec2.f20113x51024cc9 = 2;
        c4728x8ec3caec2.f20114xe55f0270 = -1;
        c4728x8ec3caec2.f20118x938b9624 = "fast click";
        interfaceC4731xabd5a6ab.mo41389xe81ffc73(c4728x8ec3caec2);
    }

    /* renamed from: launchPaySign */
    public static void m41372x4be4e352(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84 c4744x18108f84, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "launchPaySign enter");
        if (m41349x27a5e4ae(activity)) {
            try {
                f20075xfeeb2b89 = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("fromApplicationContext", e17.toString());
            }
            if (ub.b.d()) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("launchPaySign", "isfast");
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.w(TAG, "launchPaySign enter fast:" + interfaceC4731xabd5a6ab);
                com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
                c4728x8ec3caec.f20116xdde293aa = -1;
                c4728x8ec3caec.f20109xb6c1d73b = -1;
                c4728x8ec3caec.f20113x51024cc9 = 2;
                c4728x8ec3caec.f20114xe55f0270 = -1;
                c4728x8ec3caec.f20118x938b9624 = "fast click";
                interfaceC4731xabd5a6ab.mo41389xe81ffc73(c4728x8ec3caec);
                return;
            }
            if (android.text.TextUtils.isEmpty(c4744x18108f84.f20190xc84d8cc9)) {
                c4744x18108f84.f20190xc84d8cc9 = "wechattype=sign";
            } else {
                c4744x18108f84.f20190xc84d8cc9 += "&wechattype=sign";
            }
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
            c4777x7a3dad2b.m41812x384b3c8(f20078xe71fadc6);
            c4777x7a3dad2b.m41813x7c7825ab(activity, c4744x18108f84, interfaceC4731xabd5a6ab);
        }
    }

    /* renamed from: launchPurchaseFlow */
    public static void m41373xbb39522(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, final com.p314xaae8f345.p592x631407a.api.InterfaceC4729x4fd381af interfaceC4729x4fd381af) {
        boolean z17;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "launchPurchaseFlow enter");
        if (m41349x27a5e4ae(activity)) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
            if (abstractC4741xef9abf3 == null || !((z17 = abstractC4741xef9abf3 instanceof com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84))) {
                interfaceC4729x4fd381af.m41416x28ff69e(new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4738x9aafc798(3, ""), null);
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("launchPurchaseFlow", "parameter is error");
                return;
            }
            if (z17) {
                ((com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84) abstractC4741xef9abf3).f20227x8035e904 = true;
            }
            com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84 c4744x18108f84 = (com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84) abstractC4741xef9abf3;
            c4744x18108f84.f20178x2c2fa596 = false;
            c4744x18108f84.f20192xa7245f4 = "1";
            c4744x18108f84.f20229x86f18d3 = 2;
            m41370xd7c293f5(activity, abstractC4741xef9abf3, new com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab() { // from class: com.tencent.midas.api.APMidasPayAPI.2
                @Override // com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab
                /* renamed from: MidasPayCallBack */
                public void mo41389xe81ffc73(com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec) {
                    int m41400xcc234ba0 = c4728x8ec3caec.m41400xcc234ba0();
                    if (c4728x8ec3caec.f20116xdde293aa == 100) {
                        m41400xcc234ba0 = 101;
                    }
                    com.p314xaae8f345.p592x631407a.api.InterfaceC4729x4fd381af.this.m41416x28ff69e(new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4738x9aafc798(m41400xcc234ba0, c4728x8ec3caec.m41402x92f9076e()), c4728x8ec3caec.m41399x7e4fae02());
                }

                @Override // com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab
                /* renamed from: MidasPayNeedLogin */
                public void mo41390x9af5fe25() {
                    com.p314xaae8f345.p592x631407a.api.InterfaceC4729x4fd381af.this.m41417x1deca225();
                }
            });
        }
    }

    /* renamed from: launchWXMiniProgram */
    public static void m41374xdb77bfb9(android.content.Context context, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "launchWXMiniProgram enter");
        if (m41349x27a5e4ae(context)) {
            if (context instanceof android.app.Activity) {
                new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b().m41805xdb77bfb9(context, bundle, resultReceiver);
                return;
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("launchAbility", "context is not Activity : " + context);
            if (!"release".equals(env)) {
                android.widget.Toast.makeText(context.getApplicationContext(), "Input context must be Activity", 1).show();
            }
            if (resultReceiver != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("midas_callback_ability_code", -998);
                bundle2.putString("midas_callback_ability_msg", "context is not Activity ");
                bundle2.putBundle("midas_callback_ability_data", new android.os.Bundle());
                resultReceiver.send(-101, bundle2);
            }
        }
    }

    /* renamed from: launchWXMiniProgram_OnResponse */
    public static void m41375x866ccba6(android.content.Context context, int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "launchWXMiniProgram_OnResponse enter");
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "launchWXMiniProgram_OnResponse enter: bundle = " + bundle);
        if (m41349x27a5e4ae(context)) {
            if (context instanceof android.app.Activity) {
                new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b().m41806x866ccba6(context, i17, bundle);
                return;
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("launchAbility", "context is not Activity : " + context);
            if ("release".equals(env)) {
                return;
            }
            android.widget.Toast.makeText(context.getApplicationContext(), "Input context must be Activity", 1).show();
        }
    }

    /* renamed from: launchWeChat */
    public static void m41376x48533cd9(android.app.Activity activity, org.json.JSONObject jSONObject, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "launchWeChat enter");
        if (m41349x27a5e4ae(activity)) {
            try {
                f20075xfeeb2b89 = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("fromApplicationContext", e17.toString());
            }
            if (!ub.b.d()) {
                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
                com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
                c4777x7a3dad2b.m41812x384b3c8(f20078xe71fadc6);
                c4777x7a3dad2b.m41807x48533cd9(activity, jSONObject, interfaceC4731xabd5a6ab);
                return;
            }
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("launchWeChat", "isfast");
            com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
            c4728x8ec3caec.f20116xdde293aa = -1;
            c4728x8ec3caec.f20109xb6c1d73b = -1;
            c4728x8ec3caec.f20113x51024cc9 = 2;
            c4728x8ec3caec.f20114xe55f0270 = -1;
            c4728x8ec3caec.f20118x938b9624 = "fast click";
            interfaceC4731xabd5a6ab.mo41389xe81ffc73(c4728x8ec3caec);
        }
    }

    /* renamed from: launchWeb */
    public static void m41377xd7c2aea1(android.app.Activity activity, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab interfaceC4731xabd5a6ab) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "launchWeb enter");
        if (m41349x27a5e4ae(activity)) {
            try {
                f20075xfeeb2b89 = activity.getApplicationContext();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("fromApplicationContext", e17.toString());
            }
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41930x1fc63b35();
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41938xcc24d221(abstractC4741xef9abf3, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20541x4c03b06f);
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41935xd303e5f0(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20541x4c03b06f, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20620x31e6bb6c);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(env);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(f20077x5c1d31e7);
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
            c4777x7a3dad2b.m41812x384b3c8(f20078xe71fadc6);
            c4777x7a3dad2b.web(activity, abstractC4741xef9abf3, interfaceC4731xabd5a6ab);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 9 */
    /* renamed from: queryInventoryAsync */
    public static void m41378x1e365968(android.app.Activity activity, boolean z17, java.util.List<?> list, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.InterfaceC4750xe1c0ce9 interfaceC4750xe1c0ce9) {
        java.lang.Class<?> cls;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "queryInventoryAsync enter");
        if (m41349x27a5e4ae(activity)) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b c4777x7a3dad2b = new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b();
            try {
                cls = java.lang.Class.forName(java.util.List.class.getName());
            } catch (java.lang.ClassNotFoundException e17) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "queryInventoryAsync setEnv e:" + e17.toString());
                cls = null;
            }
            java.lang.Object m41798x2e7a5e = c4777x7a3dad2b.m41798x2e7a5e(activity, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20415x823a3708, new java.lang.Object[]{java.lang.Boolean.valueOf(z17), list, interfaceC4750xe1c0ce9}, new java.lang.Class[]{java.lang.Boolean.class, cls, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.InterfaceC4750xe1c0ce9.class});
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "queryInventoryAsync ret " + m41798x2e7a5e);
            if (m41798x2e7a5e == null) {
                interfaceC4750xe1c0ce9.m41587xf586ac5(new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4738x9aafc798(-1, ""), null);
            }
        }
    }

    /* renamed from: release */
    public static void m41379x41012807(android.app.Activity activity) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "release() enter");
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41787xa59246b3(activity);
    }

    /* renamed from: setCutoutEnable */
    public static void m41380x869e03f1(boolean z17) {
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20428xef62766f = z17;
    }

    /* renamed from: setEnv */
    public static void m41381xca02612b(java.lang.String str) {
        env = str;
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41788xca02612b(str);
        android.content.Context context = f20075xfeeb2b89;
        if (context != null && (context instanceof android.app.Activity)) {
            new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b().m41799x2e7a5e(f20075xfeeb2b89, "setEnv", new java.lang.Class[]{java.lang.String.class}, new java.lang.Object[]{str});
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("MidasPluginSDK", "env= " + env);
    }

    /* renamed from: setLogCallback */
    public static <T extends com.p314xaae8f345.p592x631407a.api.InterfaceC4733x84406d38> void m41382xcdae5de7(java.lang.Class<T> cls) {
        f20076x212ba67a = cls.getName();
    }

    /* renamed from: setLogEnable */
    public static void m41383xb7de63a5(boolean z17) {
        f20077x5c1d31e7 = z17;
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41790xb7de63a5(z17);
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41789x494a91fc(f20076x212ba67a);
        android.content.Context context = f20075xfeeb2b89;
        if (context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        new com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b().m41799x2e7a5e(f20075xfeeb2b89, "setLogEnable", new java.lang.Class[]{java.lang.Boolean.TYPE}, new java.lang.Object[]{java.lang.Boolean.valueOf(z17)});
    }

    /* renamed from: setLongConnection */
    public static void m41384xe9de6b7c(android.content.Context context, boolean z17) {
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41791xe9de6b7c(context, z17);
    }

    /* renamed from: setParentClassloader */
    public static void m41385x6b4fe43f(dalvik.system.DexClassLoader dexClassLoader) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "setParentClassloader enter classLoader:" + dexClassLoader);
        com.p314xaae8f345.p592x631407a.p604xc5476f33.C4810x459da6f5.m42112x34b4d05f(dexClassLoader);
    }

    /* renamed from: setPath */
    public static void m41386x764e93a7(java.lang.String str) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(TAG, "setPath enter path:" + str);
        f20074x6aa0e2ef = str;
    }

    /* renamed from: setScreenType */
    public static void m41387x384b3c8(android.app.Activity activity, int i17) {
        f20078xe71fadc6 = i17;
    }

    /* renamed from: setSoMonitorCallback */
    public static void m41388x37348181(com.p314xaae8f345.p592x631407a.api.InterfaceC4734x6cdbbf52 interfaceC4734x6cdbbf52) {
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20443x55b0c2db = interfaceC4734x6cdbbf52;
    }

    /* renamed from: init */
    public static void m41366x316510(android.content.Context context, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3, android.os.ResultReceiver resultReceiver) {
        m41367xf3d96f1b(context, abstractC4741xef9abf3);
        if (m41348x21752589(context, abstractC4741xef9abf3)) {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41773x316510(context, abstractC4741xef9abf3, resultReceiver);
        } else {
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20437x926af579 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41775x926af579(context);
        }
    }
}
