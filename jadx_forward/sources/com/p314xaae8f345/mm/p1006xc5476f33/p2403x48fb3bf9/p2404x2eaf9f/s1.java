package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes7.dex */
public final class s1 implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.q1 f263505a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.q1(null);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f263506b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.p1.f263439d);

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.q1 q1Var = f263505a;
        if (!q1Var.a()) {
            return false;
        }
        java.util.Iterator a17 = strArr != null ? p3321xbce91901.jvm.p3324x21ffc6bd.c.a(strArr) : null;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17 != null ? (java.lang.String) ((p3321xbce91901.jvm.p3324x21ffc6bd.b) a17).next() : null, "//webview")) {
            return false;
        }
        java.lang.String lowerCase = ((java.lang.String) ((p3321xbce91901.jvm.p3324x21ffc6bd.b) a17).next()).toLowerCase();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -2001485438:
                if (!lowerCase.equals("debugmanifest") || strArr.length <= 2) {
                    return false;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(strArr[2], "null")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().remove("DebugManifest");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putString("DebugManifest", strArr[2]);
                }
                return true;
            case -1938441725:
                if (!lowerCase.equals("opensnapoauth") || strArr.length <= 2) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putInt("openSnapOauth", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                return true;
            case -1825077803:
                if (!lowerCase.equals("debugpatch") || strArr.length <= 2) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putInt("debugPatchEnable", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                return true;
            case -1820984396:
                if (!lowerCase.equals("debugtoast") || strArr.length <= 2) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putInt("showDebugToast", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                return true;
            case -1379409117:
                if (!lowerCase.equals("disablewxjscodecache") || strArr.length <= 2) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putInt("disablewxjscodecache", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                return true;
            case -1354815177:
                if (!lowerCase.equals("commit") || strArr.length <= 2) {
                    return false;
                }
                java.lang.String str2 = strArr[2];
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "test")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putBoolean("webview_page_commit_mock", true);
                    if (q1Var.a()) {
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r1("commit mock enable"));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewCommand", "commit mock enable");
                    }
                } else {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "reset")) {
                        return false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putBoolean("webview_page_commit_mock", false);
                    if (q1Var.a()) {
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r1("commit mock reset"));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewCommand", "commit mock reset");
                    }
                }
                return true;
            case -1269849018:
                if (!lowerCase.equals("clearwuid")) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.n1 n1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.n1.f263424a;
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.n1.f263427d).mo141623x754a37bb()).W("AdWUID");
                return true;
            case -1102227849:
                if (!lowerCase.equals("debugcookie") || strArr.length <= 2) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putInt("debugCookie", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                return true;
            case -851227842:
                if (!lowerCase.equals("debugtransfer") || strArr.length <= 2) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putInt("debugTransfer", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                return true;
            case -630973766:
                if (!lowerCase.equals("opensdkopenfacedetect")) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().A("OpenSdkOpenFaceDetect", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], 1));
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a();
                return true;
            case -318798133:
                if (!lowerCase.equals("preauth") || strArr.length <= 2) {
                    return false;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = strArr.length;
                for (int i17 = 2; i17 < length; i17++) {
                    java.lang.String str3 = strArr[i17];
                    zq1.i0 i0Var = new zq1.i0();
                    i0Var.f556516a = str3;
                    i0Var.f556518c = ce1.f.f4364x366c91de;
                    i0Var.f556525j = 10001;
                    arrayList.add(i0Var);
                }
                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37958xae0bceea(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putBoolean("webview_use_a8key_lite_header", true);
                ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList);
                return true;
            case 1541692090:
                if (!lowerCase.equals("debugip") || strArr.length <= 2) {
                    return false;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(strArr[2], "null")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().remove("DebugLocalIP");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putString("DebugLocalIP", strArr[2]);
                }
                return true;
            case 1836011748:
                if (!lowerCase.equals("forcesharecard") || strArr.length <= 2) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putInt("forcesharecard", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                return true;
            case 2045106293:
                if (!lowerCase.equals("prefetchpkg") || strArr.length <= 2) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putInt("prefetchUsePkg", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr[2], -1));
                return true;
            case 2111305731:
                if (!lowerCase.equals("debugpatchinfo") || strArr.length <= 2) {
                    return false;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(strArr[2], "null")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putString("debugPatchInfo", "");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t1.a().putString("debugPatchInfo", strArr[2]);
                }
                return true;
            default:
                return false;
        }
    }
}
