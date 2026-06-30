package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public enum v9 {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f172385d = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/wxawap/wapreportwxadevlog?action=complain_feedback&appid=%s&embeddedappid=%s&hostappid=%s&pageid=%s&from=%d&version_type=%d&version_code=%d&screenshot_localId=%s&sessionid=%s&business_appid=%s&msgid=%s&public_lib_version=%s&public_lib_version_str=%s&template_id=%s&roomId=%s#wechat_redirect";

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f172386e = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/mp/wacomplain?action=show&appid=%s&pageid=%s&from=%d&version_type=%d&version_code=%d#wechat_redirect";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f172387f;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9);
        f172387f = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/mp/waerrpage?appid=%s&type=upgrade&upgradetype=%d#wechat_redirect";
    }

    public static java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 c11832x1f85bd26) {
        if (c11832x1f85bd26 != null) {
            java.lang.String str = c11832x1f85bd26.f159011d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                try {
                    java.lang.String str2 = f172385d;
                    java.lang.Object[] objArr = new java.lang.Object[15];
                    objArr[0] = str;
                    objArr[1] = c11832x1f85bd26.f159012e;
                    objArr[2] = c11832x1f85bd26.f159013f;
                    java.lang.String str3 = c11832x1f85bd26.f159021q;
                    if (str3 == null) {
                        str3 = "";
                    }
                    objArr[3] = java.net.URLEncoder.encode(str3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    objArr[4] = java.lang.Integer.valueOf(c11832x1f85bd26.f159020p);
                    objArr[5] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(java.lang.Integer.valueOf(c11832x1f85bd26.f159017m), -1));
                    objArr[6] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(java.lang.Integer.valueOf(c11832x1f85bd26.f159018n), -1));
                    java.lang.String str4 = c11832x1f85bd26.f159023s;
                    if (str4 == null) {
                        str4 = "";
                    }
                    objArr[7] = java.net.URLEncoder.encode(str4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    java.lang.String str5 = c11832x1f85bd26.f159024t;
                    if (str5 == null) {
                        str5 = "";
                    }
                    objArr[8] = str5;
                    java.lang.String str6 = c11832x1f85bd26.f159025u;
                    if (str6 == null) {
                        str6 = "";
                    }
                    objArr[9] = java.net.URLEncoder.encode(str6, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    java.lang.String str7 = c11832x1f85bd26.f159026v;
                    if (str7 == null) {
                        str7 = "";
                    }
                    objArr[10] = java.net.URLEncoder.encode(str7, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    java.lang.String str8 = c11832x1f85bd26.f159027w;
                    if (str8 == null) {
                        str8 = "";
                    }
                    objArr[11] = str8;
                    java.lang.String str9 = c11832x1f85bd26.f159028x;
                    if (str9 == null) {
                        str9 = "";
                    }
                    objArr[12] = java.net.URLEncoder.encode(str9, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    java.lang.String str10 = c11832x1f85bd26.f159029y;
                    if (str10 == null) {
                        str10 = "";
                    }
                    objArr[13] = java.net.URLEncoder.encode(str10, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    java.lang.String str11 = c11832x1f85bd26.f159030z;
                    if (str11 == null) {
                        str11 = "";
                    }
                    objArr[14] = java.net.URLEncoder.encode(str11, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    return java.lang.String.format(str2, objArr);
                } catch (java.io.UnsupportedEncodingException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandUrlBuilders", "buildFeedbackUrl encode fail, invalid arguments");
                    return "";
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandUrlBuilders", "buildFeedbackUrl fail, null or nil appId");
        return "";
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandUrlBuilders", "buildLowVersionUrl fail, invalid arguments");
            return "";
        }
        return java.lang.String.format(java.util.Locale.US, f172387f, str, 3);
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9 m53268xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.class, str));
        return null;
    }
}
