package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class h9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.h9 f84643a = new com.tencent.mm.plugin.appbrand.launching.h9();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f84644b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f84645c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f84646d = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (com.tencent.mm.plugin.appbrand.launching.precondition.z.b(r2, r6, r15, null, 8, null) != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(java.lang.String r15, int r16, k91.v5 r17, com.tencent.mm.plugin.appbrand.launching.z8 r18) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.h9.a(java.lang.String, int, k91.v5, com.tencent.mm.plugin.appbrand.launching.z8):boolean");
    }

    public static final boolean b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.launching.c9 b9Var;
        if (str2 == null || str2.length() == 0) {
            if (str == null || str.length() == 0) {
                return false;
            }
            b9Var = new com.tencent.mm.plugin.appbrand.launching.b9(str);
        } else {
            b9Var = new com.tencent.mm.plugin.appbrand.launching.a9(str2);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f84646d;
        boolean contains = concurrentHashMap.contains(b9Var);
        com.tencent.mm.plugin.appbrand.launching.h9 h9Var = f84643a;
        if (contains) {
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting d17 = h9Var.d(b9Var, "[UpdateNewWxaAttrsFailure]", true);
            if (d17 == null) {
                return false;
            }
            long j17 = d17.L;
            java.lang.Long l17 = (java.lang.Long) concurrentHashMap.remove(b9Var);
            if (l17 == null) {
                l17 = 0L;
            }
            long longValue = l17.longValue();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (java.lang.System.currentTimeMillis() - longValue <= j17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "checkIfUseBackupWxaAttrsForLaunchDirectly by [UpdateNewWxaAttrsFailure] interval[" + j17 + "ms] lastFailureTimestamp[" + longValue + "] key[" + b9Var + ']');
                return true;
            }
        }
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting d18 = h9Var.d(b9Var, "[MissedAppPkgFailure]", false);
        if (d18 == null) {
            return false;
        }
        long j18 = d18.L;
        java.lang.Long l18 = (java.lang.Long) f84645c.remove(b9Var);
        if (l18 == null) {
            l18 = 0L;
        }
        long longValue2 = l18.longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "checkIfUseBackupWxaAttrsForLaunchDirectly by [MissedAppPkgFailure] interval[" + j18 + "ms] lastFailureTimestamp[" + longValue2 + "] key[" + b9Var + ']');
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return java.lang.System.currentTimeMillis() - longValue2 <= j18;
    }

    public static final void c(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "clearLaunchFailedTimestamp(username:" + str + ", appId:" + str2 + ')');
        boolean z17 = str == null || str.length() == 0;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f84646d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f84645c;
        if (!z17) {
            concurrentHashMap2.remove(new com.tencent.mm.plugin.appbrand.launching.b9(str));
            concurrentHashMap.remove(new com.tencent.mm.plugin.appbrand.launching.b9(str));
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        concurrentHashMap2.remove(new com.tencent.mm.plugin.appbrand.launching.a9(str2));
        concurrentHashMap.remove(new com.tencent.mm.plugin.appbrand.launching.a9(str2));
    }

    public static final boolean e() {
        return com.tencent.mm.plugin.appbrand.networking.h.a() != 4;
    }

    public static final void g(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "removeWxaAttributesCache(username:" + str + ", appId:" + str2 + ')');
        boolean z17 = str == null || str.length() == 0;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f84644b;
        if (!z17) {
            concurrentHashMap.remove(new com.tencent.mm.plugin.appbrand.launching.b9(str));
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        concurrentHashMap.remove(new com.tencent.mm.plugin.appbrand.launching.a9(str2));
    }

    public final com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting d(com.tencent.mm.plugin.appbrand.launching.c9 c9Var, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting wxaAttributes$WxaDynamicInfo$Setting;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting wxaAttributes$WxaDynamicInfo$Setting2;
        k91.v5 k17;
        k91.o5 v07;
        k91.o5 v08;
        k91.v5 v5Var = (k91.v5) f84644b.get(c9Var);
        if (v5Var == null || (v08 = v5Var.v0()) == null || (wxaAttributes$WxaDynamicInfo$Setting2 = v08.f305706a) == null) {
            if (z17) {
                k91.m4 ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij();
                if (ij6 == null) {
                    wxaAttributes$WxaDynamicInfo$Setting2 = null;
                } else {
                    if (c9Var instanceof com.tencent.mm.plugin.appbrand.launching.b9) {
                        k17 = ij6.n1(((com.tencent.mm.plugin.appbrand.launching.b9) c9Var).f84527a, "dynamicInfo");
                    } else {
                        if (!(c9Var instanceof com.tencent.mm.plugin.appbrand.launching.a9)) {
                            throw new jz5.j();
                        }
                        k17 = ij6.k1(((com.tencent.mm.plugin.appbrand.launching.a9) c9Var).f84502a, "dynamicInfo");
                    }
                    if (k17 != null && (v07 = k17.v0()) != null) {
                        wxaAttributes$WxaDynamicInfo$Setting = v07.f305706a;
                        wxaAttributes$WxaDynamicInfo$Setting2 = wxaAttributes$WxaDynamicInfo$Setting;
                    }
                }
            }
            wxaAttributes$WxaDynamicInfo$Setting = null;
            wxaAttributes$WxaDynamicInfo$Setting2 = wxaAttributes$WxaDynamicInfo$Setting;
        }
        if (wxaAttributes$WxaDynamicInfo$Setting2 == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "getDynamicSettings with key:" + c9Var + ", reason:" + str + ", get settings:" + f84643a.f(wxaAttributes$WxaDynamicInfo$Setting2));
        return wxaAttributes$WxaDynamicInfo$Setting2;
    }

    public final java.lang.String f(com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting wxaAttributes$WxaDynamicInfo$Setting) {
        return "{OpenWxaWaitUpdateMaxMicSec:" + wxaAttributes$WxaDynamicInfo$Setting.I + ", OpenWxaWaitUpdateMaxMicSecForWeakNet:" + wxaAttributes$WxaDynamicInfo$Setting.f77408J + ", NextTryOpenWxaDisMicSec:" + wxaAttributes$WxaDynamicInfo$Setting.L + '}';
    }
}
