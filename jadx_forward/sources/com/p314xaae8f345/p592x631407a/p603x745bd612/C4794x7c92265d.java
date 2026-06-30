package com.p314xaae8f345.p592x631407a.p603x745bd612;

/* renamed from: com.tencent.midas.jsbridge.APWebProtocol */
/* loaded from: classes13.dex */
public class C4794x7c92265d {

    /* renamed from: URL_KEY_HEAD_CONTROL */
    public static java.lang.String f20695xec2a4ce = "midasheader";

    /* renamed from: URL_KEY_HEAD_TITLE */
    public static java.lang.String f20696x8ccb8e09 = "midastitle";

    /* renamed from: WEBACTION_CLOSE */
    public static java.lang.String f20697x1645dbc3 = "closeWeb";

    /* renamed from: WEBACTION_GETCGIEXTEND */
    public static java.lang.String f20698xf1d7dcfe = "getCgiExtend";

    /* renamed from: WEBACTION_HEAD */
    public static java.lang.String f20699xe7f3e695 = "setHead";

    /* renamed from: AnalyzeWebEntry */
    public static void m41986x9e48aeca(android.app.Activity activity, java.lang.Object obj, com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4799x70d1e6ab interfaceC4799x70d1e6ab, java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.String> m42177xf5cb5db9 = com.p314xaae8f345.p592x631407a.p604xc5476f33.C4815x8f23358f.m42177xf5cb5db9(str);
        m42177xf5cb5db9.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        java.lang.String str2 = m42177xf5cb5db9.get("action");
        m42177xf5cb5db9.get("saveNumber");
        m42177xf5cb5db9.get("saveType");
        java.lang.String str3 = m42177xf5cb5db9.get("callback");
        if (f20698xf1d7dcfe.equals(str2)) {
            java.lang.String m41865x2d64afbf = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41865x2d64afbf();
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APWebResultPage", "sendCgiExtends() callback=" + str3 + ", extendStr=" + m41865x2d64afbf);
            if (!android.text.TextUtils.isEmpty(m41865x2d64afbf)) {
                try {
                    m41865x2d64afbf = java.net.URLEncoder.encode(m41865x2d64afbf, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                } catch (java.lang.Exception unused) {
                }
            }
            m41987x605ac472(obj, str3, m41865x2d64afbf);
            return;
        }
        if (!f20697x1645dbc3.equals(str2)) {
            if (f20699xe7f3e695.equals(str2)) {
                try {
                    interfaceC4799x70d1e6ab.mo41968xffa9f10(activity, m42177xf5cb5db9.get(f20695xec2a4ce), m42177xf5cb5db9.get(f20696x8ccb8e09));
                    return;
                } catch (java.lang.Exception unused2) {
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20633x5404a212, "", "");
        com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec = new com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec();
        c4728x8ec3caec.f20116xdde293aa = 100;
        c4728x8ec3caec.f20118x938b9624 = "关闭";
        com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.m41776x3161eff(c4728x8ec3caec);
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0016, code lost:
    
        if ((r1 instanceof org.json.JSONArray) != false) goto L8;
     */
    /* renamed from: H5CallBack */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m41987x605ac472(java.lang.Object r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            org.json.JSONTokener r1 = new org.json.JSONTokener     // Catch: java.lang.Throwable -> L19
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r1.nextValue()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto Ld
            goto L19
        Ld:
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L19
            r3 = 1
            if (r2 == 0) goto L14
        L12:
            r0 = r3
            goto L19
        L14:
            boolean r1 = r1 instanceof org.json.JSONArray     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L19
            goto L12
        L19:
            if (r0 == 0) goto L26
            java.lang.String r0 = "typeof window[\"%s\"]==='function' && window[\"%s\"](%s);"
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r5, r6}     // Catch: java.lang.Exception -> L68
            java.lang.String r6 = java.lang.String.format(r0, r6)     // Catch: java.lang.Exception -> L68
            goto L30
        L26:
            java.lang.String r0 = "typeof window[\"%s\"]==='function' && window[\"%s\"](\"%s\");"
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r5, r6}     // Catch: java.lang.Exception -> L68
            java.lang.String r6 = java.lang.String.format(r0, r6)     // Catch: java.lang.Exception -> L68
        L30:
            java.lang.String r0 = "callback"
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(r0, r5)     // Catch: java.lang.Exception -> L68
            java.lang.String r5 = "cb"
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i(r5, r6)     // Catch: java.lang.Exception -> L68
            boolean r5 = r4 instanceof android.webkit.WebView     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = "javascript:"
            if (r5 == 0) goto L52
            android.webkit.WebView r4 = (android.webkit.WebView) r4     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68
            r5.<init>(r0)     // Catch: java.lang.Exception -> L68
            r5.append(r6)     // Catch: java.lang.Exception -> L68
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L68
            r4.loadUrl(r5)     // Catch: java.lang.Exception -> L68
            goto L80
        L52:
            boolean r5 = r4 instanceof com.tencent.smtt.sdk.WebView     // Catch: java.lang.Exception -> L68
            if (r5 == 0) goto L80
            com.tencent.smtt.sdk.WebView r4 = (com.tencent.smtt.sdk.WebView) r4     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68
            r5.<init>(r0)     // Catch: java.lang.Exception -> L68
            r5.append(r6)     // Catch: java.lang.Exception -> L68
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L68
            r4.loadUrl(r5)     // Catch: java.lang.Exception -> L68
            goto L80
        L68:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "H5CallBack() ex = "
            r5.<init>(r6)
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "H5CallBack"
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(r5, r4)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p592x631407a.p603x745bd612.C4794x7c92265d.m41987x605ac472(java.lang.Object, java.lang.String, java.lang.String):void");
    }

    /* renamed from: hookH5Method */
    public static boolean m41988x47f0c251(android.app.Activity activity, android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult, com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4800xe864f226 interfaceC4800xe864f226) {
        if (android.text.TextUtils.isEmpty(str2) || !str2.startsWith("http://unipay.sdk.android/?")) {
            return false;
        }
        interfaceC4800xe864f226.mo41973x1b701f1a(webView, str, str2, jsResult);
        return true;
    }

    /* renamed from: hookH5Method */
    public static boolean m41989x47f0c251(android.app.Activity activity, com.tencent.smtt.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.smtt.export.external.interfaces.JsResult jsResult, com.p314xaae8f345.p592x631407a.p603x745bd612.InterfaceC4801x2ab9fa9 interfaceC4801x2ab9fa9) {
        if (android.text.TextUtils.isEmpty(str2) || !str2.startsWith("http://unipay.sdk.android/?")) {
            return false;
        }
        interfaceC4801x2ab9fa9.mo42008x1b701f1a(webView, str, str2, jsResult);
        return true;
    }
}
