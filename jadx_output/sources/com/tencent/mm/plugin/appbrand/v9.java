package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public enum v9 {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f90852d = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/wxawap/wapreportwxadevlog?action=complain_feedback&appid=%s&embeddedappid=%s&hostappid=%s&pageid=%s&from=%d&version_type=%d&version_code=%d&screenshot_localId=%s&sessionid=%s&business_appid=%s&msgid=%s&public_lib_version=%s&public_lib_version_str=%s&template_id=%s&roomId=%s#wechat_redirect";

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f90853e = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/mp/wacomplain?action=show&appid=%s&pageid=%s&from=%d&version_type=%d&version_code=%d#wechat_redirect";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f90854f;

    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9);
        f90854f = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/mp/waerrpage?appid=%s&type=upgrade&upgradetype=%d#wechat_redirect";
    }

    public static java.lang.String a(com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams) {
        if (wxaExposedParams != null) {
            java.lang.String str = wxaExposedParams.f77478d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                try {
                    java.lang.String str2 = f90852d;
                    java.lang.Object[] objArr = new java.lang.Object[15];
                    objArr[0] = str;
                    objArr[1] = wxaExposedParams.f77479e;
                    objArr[2] = wxaExposedParams.f77480f;
                    java.lang.String str3 = wxaExposedParams.f77488q;
                    if (str3 == null) {
                        str3 = "";
                    }
                    objArr[3] = java.net.URLEncoder.encode(str3, com.tencent.mapsdk.internal.rv.f51270c);
                    objArr[4] = java.lang.Integer.valueOf(wxaExposedParams.f77487p);
                    objArr[5] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.o1(java.lang.Integer.valueOf(wxaExposedParams.f77484m), -1));
                    objArr[6] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.o1(java.lang.Integer.valueOf(wxaExposedParams.f77485n), -1));
                    java.lang.String str4 = wxaExposedParams.f77490s;
                    if (str4 == null) {
                        str4 = "";
                    }
                    objArr[7] = java.net.URLEncoder.encode(str4, com.tencent.mapsdk.internal.rv.f51270c);
                    java.lang.String str5 = wxaExposedParams.f77491t;
                    if (str5 == null) {
                        str5 = "";
                    }
                    objArr[8] = str5;
                    java.lang.String str6 = wxaExposedParams.f77492u;
                    if (str6 == null) {
                        str6 = "";
                    }
                    objArr[9] = java.net.URLEncoder.encode(str6, com.tencent.mapsdk.internal.rv.f51270c);
                    java.lang.String str7 = wxaExposedParams.f77493v;
                    if (str7 == null) {
                        str7 = "";
                    }
                    objArr[10] = java.net.URLEncoder.encode(str7, com.tencent.mapsdk.internal.rv.f51270c);
                    java.lang.String str8 = wxaExposedParams.f77494w;
                    if (str8 == null) {
                        str8 = "";
                    }
                    objArr[11] = str8;
                    java.lang.String str9 = wxaExposedParams.f77495x;
                    if (str9 == null) {
                        str9 = "";
                    }
                    objArr[12] = java.net.URLEncoder.encode(str9, com.tencent.mapsdk.internal.rv.f51270c);
                    java.lang.String str10 = wxaExposedParams.f77496y;
                    if (str10 == null) {
                        str10 = "";
                    }
                    objArr[13] = java.net.URLEncoder.encode(str10, com.tencent.mapsdk.internal.rv.f51270c);
                    java.lang.String str11 = wxaExposedParams.f77497z;
                    if (str11 == null) {
                        str11 = "";
                    }
                    objArr[14] = java.net.URLEncoder.encode(str11, com.tencent.mapsdk.internal.rv.f51270c);
                    return java.lang.String.format(str2, objArr);
                } catch (java.io.UnsupportedEncodingException unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUrlBuilders", "buildFeedbackUrl encode fail, invalid arguments");
                    return "";
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUrlBuilders", "buildFeedbackUrl fail, null or nil appId");
        return "";
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandUrlBuilders", "buildLowVersionUrl fail, invalid arguments");
            return "";
        }
        return java.lang.String.format(java.util.Locale.US, f90854f, str, 3);
    }

    public static com.tencent.mm.plugin.appbrand.v9 valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.v9.class, str));
        return null;
    }
}
