package com.p314xaae8f345.p592x631407a.p603x745bd612;

/* renamed from: com.tencent.midas.jsbridge.APWebJSBridgeActivity */
/* loaded from: classes13.dex */
public class ActivityC4793x6b9f8206 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: KEY_REQUEST */
    private static final java.lang.String f20688xfb40986f = "key_request";

    /* renamed from: KEY_TYPE */
    private static final java.lang.String f20689x4e47ad3a = "key_pure_h5_pay";
    private static final java.lang.String TAG = "APWebJSBridgeActivity";

    /* renamed from: VALUE_PURE_H5 */
    private static final java.lang.String f20690x50b22a6 = "value_pure_h5_pay";

    /* renamed from: WEB_URL_POST */
    private static final java.lang.String f20691xb5eb363b = "/index.html";

    /* renamed from: WEB_URL_PRE */
    private static final java.lang.String f20692x5872f188 = "https://youxi.vip.qq.com/m/act/";

    /* renamed from: _hellAccFlag_ */
    private byte f20693x7f11beae;

    /* renamed from: webPage */
    private com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab f20694x48e9d803 = null;

    /* renamed from: constructUrl */
    private java.lang.String m41978x8907c618() {
        java.lang.String m41842xb9dc8b38;
        if (android.text.TextUtils.isEmpty(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41842xb9dc8b38())) {
            m41842xb9dc8b38 = f20692x5872f188 + com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41851xe17c3861() + f20691xb5eb363b;
            this.f20694x48e9d803.mo41968xffa9f10(this, ub.b.c(m41842xb9dc8b38, com.p314xaae8f345.p592x631407a.p603x745bd612.C4794x7c92265d.f20695xec2a4ce), ub.b.c(m41842xb9dc8b38, com.p314xaae8f345.p592x631407a.p603x745bd612.C4794x7c92265d.f20696x8ccb8e09));
            this.f20694x48e9d803.mo41972x60ad9731(m41842xb9dc8b38);
        } else {
            m41842xb9dc8b38 = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41842xb9dc8b38();
            this.f20694x48e9d803.mo41968xffa9f10(this, ub.b.c(m41842xb9dc8b38, com.p314xaae8f345.p592x631407a.p603x745bd612.C4794x7c92265d.f20695xec2a4ce), ub.b.c(m41842xb9dc8b38, com.p314xaae8f345.p592x631407a.p603x745bd612.C4794x7c92265d.f20696x8ccb8e09));
            this.f20694x48e9d803.mo41972x60ad9731(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41842xb9dc8b38());
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("constructUrl", m41842xb9dc8b38);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("offerId", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41851xe17c3861());
        hashMap.put("openId", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41852x28dae7fb());
        hashMap.put("openKey", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41853xf2821f7f());
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41871x23a7af9b());
        hashMap.put("sessionType", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41872xd87f91ba());
        hashMap.put("pf", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41855x5db1bec());
        hashMap.put("pfKey", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41856x74f772d3());
        hashMap.put("zoneId", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41875x3b9614dd());
        if (!m41842xb9dc8b38.contains("?")) {
            m41842xb9dc8b38 = m41842xb9dc8b38.concat("?");
        } else if (!m41842xb9dc8b38.endsWith("?")) {
            m41842xb9dc8b38 = m41842xb9dc8b38.concat("&");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(m41842xb9dc8b38);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                stringBuffer.append((java.lang.String) entry.getKey());
                stringBuffer.append("=");
                stringBuffer.append((java.lang.String) entry.getValue());
                stringBuffer.append("&");
            }
            if (!android.text.TextUtils.isEmpty(stringBuffer)) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
        } catch (java.lang.Exception unused) {
        }
        sb6.append(stringBuffer.toString());
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("constructUrl", sb7);
        return sb7;
    }

    /* renamed from: getPureH5PayURLParameters */
    private java.lang.String m41979x6b89bec(com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("m", "buy");
        hashMap.put(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130908t, "v3");
        hashMap.put("appid", abstractC4741xef9abf3.f20183xa3aefc97);
        hashMap.put("pf", abstractC4741xef9abf3.f134673pf);
        hashMap.put("n", abstractC4741xef9abf3.f20192xa7245f4);
        hashMap.put("sessionid", abstractC4741xef9abf3.f20193x243a3e51);
        hashMap.put("sessiontype", abstractC4741xef9abf3.f20194xfea94af0);
        hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5857xdf813330, abstractC4741xef9abf3.f20184xc3c3c505);
        hashMap.put("openkey", abstractC4741xef9abf3.f20185xb4b4e3b5);
        hashMap.put("zoneid", abstractC4741xef9abf3.f20195xd67ef1e7);
        hashMap.put("sdktype", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        java.lang.String m42162x95f61f00 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42162x95f61f00(this);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "app_version = " + m42162x95f61f00);
        hashMap.put("appversion", m42162x95f61f00);
        hashMap.put("request_from", com.p314xaae8f345.map.p511x696c9db.net.C4332xd10a8f1f.f16993xbd49c92c);
        hashMap.put("is_android_sdk_error_version", "1");
        hashMap.put("android_sdk_reserve", abstractC4741xef9abf3.f20190xc84d8cc9);
        hashMap.put("android_sdk_mpinfo_discountType", abstractC4741xef9abf3.f20182xc04d5cf1.f20208x20c1f01b);
        hashMap.put("android_sdk_mpinfo_discountUrl", abstractC4741xef9abf3.f20182xc04d5cf1.f20209xe006446e);
        hashMap.put("android_sdk_mpinfo_discoutId", abstractC4741xef9abf3.f20182xc04d5cf1.f20210xf8c64494);
        hashMap.put("android_sdk_mpinfo_drmInfo", abstractC4741xef9abf3.f20182xc04d5cf1.f20211x729a76ed);
        hashMap.put("android_sdk_mpinfo_extras", abstractC4741xef9abf3.f20182xc04d5cf1.f20212xb32aee63);
        hashMap.put("android_sdk_mpinfo_payChannel", abstractC4741xef9abf3.f20182xc04d5cf1.f20213xb6c1d73b);
        hashMap.put("android_sdk_extendInfo_unit", abstractC4741xef9abf3.f20176x93447ae8.f20205x36d984);
        hashMap.put("android_sdk_extendInfo_isShowListOtherNum", java.lang.String.valueOf(abstractC4741xef9abf3.f20176x93447ae8.f20202x523b89fb));
        hashMap.put("android_sdk_extendInfo_isShowNum", java.lang.String.valueOf(abstractC4741xef9abf3.f20176x93447ae8.f20203x58a962bf));
        if (abstractC4741xef9abf3 instanceof com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4743x7dd68fb2) {
            if ("hy_gameid".equals(abstractC4741xef9abf3.f20193x243a3e51) && "wc_actoken".equals(abstractC4741xef9abf3.f20194xfea94af0)) {
                hashMap.put("c", "wechat_game");
            } else if ("itopid".equals(abstractC4741xef9abf3.f20193x243a3e51)) {
                hashMap.put("c", "itop_game");
            } else {
                hashMap.put("c", "game");
            }
            if (!android.text.TextUtils.isEmpty(abstractC4741xef9abf3.f20192xa7245f4)) {
                hashMap.put("as", "1");
            }
        } else if (abstractC4741xef9abf3 instanceof com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84) {
            com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84 c4744x18108f84 = (com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84) abstractC4741xef9abf3;
            hashMap.put("c", "goods");
            if (c4744x18108f84.f20229x86f18d3 == 1) {
                hashMap.put("params", java.net.URLEncoder.encode(c4744x18108f84.f20226xa5656a2c));
            } else {
                hashMap.put("productid", c4744x18108f84.f20228xc058de06);
            }
        } else if (abstractC4741xef9abf3 instanceof com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4748x6578e190) {
            com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4748x6578e190 c4748x6578e190 = (com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4748x6578e190) abstractC4741xef9abf3;
            if ("uin".equals(abstractC4741xef9abf3.f20193x243a3e51) || com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5857xdf813330.equals(abstractC4741xef9abf3.f20193x243a3e51)) {
                hashMap.put("c", "qqsubscribe");
            } else {
                hashMap.put("c", "subscribe");
            }
            if (!android.text.TextUtils.isEmpty(c4748x6578e190.f20258xc14e566a)) {
                hashMap.put("as", "1");
                hashMap.put("productid", c4748x6578e190.f20258xc14e566a);
            }
            hashMap.put("service", c4748x6578e190.f20238x8d078642);
            hashMap.put("aid", c4748x6578e190.f20187xc84ac380);
            if (c4748x6578e190.f20234xd979c879) {
                hashMap.put("ap", "1");
            }
        } else if (abstractC4741xef9abf3 instanceof com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4745x1f8b011a) {
            com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4745x1f8b011a c4745x1f8b011a = (com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4745x1f8b011a) abstractC4741xef9abf3;
            hashMap.put("da", "1");
            hashMap.put("c", c4745x1f8b011a.f20238x8d078642.toLowerCase());
            hashMap.put("_newservice", "1");
            if (c4745x1f8b011a.f20234xd979c879) {
                hashMap.put("ap", "1");
            }
            if (!android.text.TextUtils.isEmpty(abstractC4741xef9abf3.f20192xa7245f4)) {
                hashMap.put("as", "1");
            }
            hashMap.put("aid", c4745x1f8b011a.f20187xc84ac380);
        }
        java.lang.String str = com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.env;
        if (com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20061xcc101583.equals(str)) {
            hashMap.put("sandbox", "2");
        } else if ("test".equals(str)) {
            hashMap.put("sandbox", "1");
        }
        return m41982xaeaf761f(hashMap);
    }

    /* renamed from: initUI */
    private void m41980xb96c6ba4() {
        this.f20694x48e9d803.mo41969xb96c6ba4(this);
        this.f20694x48e9d803.mo41970x141096a9(m41978x8907c618());
    }

    /* renamed from: initWebPage */
    private void m41981x979838d3() {
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20629x7f15aefe, "", "");
        if (com.p314xaae8f345.p592x631407a.p603x745bd612.C4796x1ec34c.m42002x4b37b7ba(this)) {
            this.f20694x48e9d803 = new com.p314xaae8f345.p592x631407a.p603x745bd612.C4797x4a4b9f17();
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20634x89db004b, "", "");
        } else {
            this.f20694x48e9d803 = new com.p314xaae8f345.p592x631407a.p603x745bd612.C4792x577d26e5();
            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20632x2215f49d, "", "");
        }
    }

    /* renamed from: map2UrlParams */
    public static java.lang.String m41982xaeaf761f(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : hashMap.entrySet()) {
                stringBuffer.append(entry.getKey());
                stringBuffer.append("=");
                stringBuffer.append(entry.getValue());
                stringBuffer.append("&");
            }
            if (!android.text.TextUtils.isEmpty(stringBuffer)) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
        } catch (java.lang.Exception unused) {
        }
        return stringBuffer.toString();
    }

    /* renamed from: startPureH5Pay */
    public static boolean m41984x81ab0241(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, " Calling into startPureH5Pay caller = " + java.lang.Thread.currentThread().getStackTrace()[3].toString());
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41940xebbf4a4d(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20540x4c0395c3, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20604xddcc0320, "scene=" + str2 + "&reason=" + str);
        if (context == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot start pure h5 pay with null context!");
            return false;
        }
        com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3 = com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20447x4bd21aae;
        if (abstractC4741xef9abf3 == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot start pure h5 pay with null request object!");
            return false;
        }
        return m41983x81ab0241(context, abstractC4741xef9abf3);
    }

    /* renamed from: toPureH5Pay */
    private void m41985x71b50448(com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        this.f20694x48e9d803.mo41971x71b50448(this, abstractC4741xef9abf3);
        java.lang.String str = "https://pay.qq.com/h5/index.shtml?" + m41979x6b89bec(abstractC4741xef9abf3);
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "To pure h5 pay full url = " + str);
        this.f20694x48e9d803.mo41970x141096a9(str);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (ub.a.f507523a == null) {
                ub.a.f507523a = new java.util.Stack();
            }
            ub.a.f507523a.push(this);
            m41981x979838d3();
            android.content.Intent intent = getIntent();
            if (intent == null || !f20690x50b22a6.equals(intent.getStringExtra(f20689x4e47ad3a))) {
                m41980xb96c6ba4();
            } else {
                m41985x71b50448((com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3) intent.getSerializableExtra(f20688xfb40986f));
            }
        } catch (java.lang.Exception e17) {
            java.lang.String m42156x651de627 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42156x651de627(e17);
            if (!android.text.TextUtils.isEmpty(m42156x651de627) && (m42156x651de627.contains("webview") || m42156x651de627.contains("Webview"))) {
                android.widget.Toast.makeText(this, "系统组件缺失，请退出重试", 0).show();
            }
            com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42137xf4344e09(this, 100, "返回");
            finish();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "onKey down = back!");
            com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
            c4728x8ec3caec.f20116xdde293aa = 100;
            c4728x8ec3caec.f20118x938b9624 = "返回";
            com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41776x3161eff(c4728x8ec3caec);
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    /* renamed from: startPureH5Pay */
    private static boolean m41983x81ab0241(android.content.Context context, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 abstractC4741xef9abf3) {
        if (context == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot start pure h5 pay with null context!");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(268435456);
        intent.setClass(context, com.p314xaae8f345.p592x631407a.p603x745bd612.ActivityC4793x6b9f8206.class);
        intent.putExtra(f20689x4e47ad3a, f20690x50b22a6);
        intent.putExtra(f20688xfb40986f, abstractC4741xef9abf3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/midas/jsbridge/APWebJSBridgeActivity", "startPureH5Pay", "(Landroid/content/Context;Lcom/tencent/midas/api/request/APMidasBaseRequest;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/midas/jsbridge/APWebJSBridgeActivity", "startPureH5Pay", "(Landroid/content/Context;Lcom/tencent/midas/api/request/APMidasBaseRequest;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
