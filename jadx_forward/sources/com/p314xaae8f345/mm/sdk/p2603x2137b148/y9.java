package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes.dex */
public abstract class y9 {
    public static java.lang.String a(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                return java.net.URLEncoder.encode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtilities", "URLEncode fail, throw : %s", e17.getMessage());
            }
        }
        return str;
    }
}
