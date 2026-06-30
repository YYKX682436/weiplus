package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes7.dex */
public abstract class k {
    public static android.webkit.WebResourceResponse a(com.p314xaae8f345.p3210x3857dc.y0 y0Var) {
        java.lang.String str;
        if (y0Var == null) {
            return null;
        }
        if (y0Var.f302160g) {
            try {
                return new android.webkit.WebResourceResponse(y0Var.f302154a, y0Var.f302155b, y0Var.f302156c, y0Var.f302157d, y0Var.f302158e, y0Var.f302159f);
            } catch (java.lang.Throwable th6) {
                by5.c4.d("SysWebDataTrans", "create webkit WebResourceResponse error", th6);
            }
        }
        android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse(y0Var.f302154a, y0Var.f302155b, y0Var.f302159f);
        if (y0Var.f302156c > 100 && (str = y0Var.f302157d) != null && !str.isEmpty()) {
            webResourceResponse.setStatusCodeAndReasonPhrase(y0Var.f302156c, y0Var.f302157d);
        }
        webResourceResponse.setResponseHeaders(y0Var.f302158e);
        return webResourceResponse;
    }
}
