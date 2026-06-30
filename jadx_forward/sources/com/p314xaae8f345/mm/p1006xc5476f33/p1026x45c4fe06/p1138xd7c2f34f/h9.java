package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class h9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h9 f166176a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h9();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f166177b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f166178c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f166179d = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.z.b(r2, r6, r15, null, 8, null) != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(java.lang.String r15, int r16, k91.v5 r17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z8 r18) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h9.a(java.lang.String, int, k91.v5, com.tencent.mm.plugin.appbrand.launching.z8):boolean");
    }

    public static final boolean b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c9 b9Var;
        if (str2 == null || str2.length() == 0) {
            if (str == null || str.length() == 0) {
                return false;
            }
            b9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b9(str);
        } else {
            b9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a9(str2);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f166179d;
        boolean contains = concurrentHashMap.contains(b9Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h9 h9Var = f166176a;
        if (contains) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 d17 = h9Var.d(b9Var, "[UpdateNewWxaAttrsFailure]", true);
            if (d17 == null) {
                return false;
            }
            long j17 = d17.L;
            java.lang.Long l17 = (java.lang.Long) concurrentHashMap.remove(b9Var);
            if (l17 == null) {
                l17 = 0L;
            }
            long longValue = l17.longValue();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (java.lang.System.currentTimeMillis() - longValue <= j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "checkIfUseBackupWxaAttrsForLaunchDirectly by [UpdateNewWxaAttrsFailure] interval[" + j17 + "ms] lastFailureTimestamp[" + longValue + "] key[" + b9Var + ']');
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 d18 = h9Var.d(b9Var, "[MissedAppPkgFailure]", false);
        if (d18 == null) {
            return false;
        }
        long j18 = d18.L;
        java.lang.Long l18 = (java.lang.Long) f166178c.remove(b9Var);
        if (l18 == null) {
            l18 = 0L;
        }
        long longValue2 = l18.longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "checkIfUseBackupWxaAttrsForLaunchDirectly by [MissedAppPkgFailure] interval[" + j18 + "ms] lastFailureTimestamp[" + longValue2 + "] key[" + b9Var + ']');
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return java.lang.System.currentTimeMillis() - longValue2 <= j18;
    }

    public static final void c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "clearLaunchFailedTimestamp(username:" + str + ", appId:" + str2 + ')');
        boolean z17 = str == null || str.length() == 0;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f166179d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f166178c;
        if (!z17) {
            concurrentHashMap2.remove(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b9(str));
            concurrentHashMap.remove(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b9(str));
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        concurrentHashMap2.remove(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a9(str2));
        concurrentHashMap.remove(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a9(str2));
    }

    public static final boolean e() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.h.a() != 4;
    }

    public static final void g(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "removeWxaAttributesCache(username:" + str + ", appId:" + str2 + ')');
        boolean z17 = str == null || str.length() == 0;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f166177b;
        if (!z17) {
            concurrentHashMap.remove(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b9(str));
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        concurrentHashMap.remove(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a9(str2));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c9 c9Var, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 c11825xb74ac8c6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 c11825xb74ac8c62;
        k91.v5 k17;
        k91.o5 v07;
        k91.o5 v08;
        k91.v5 v5Var = (k91.v5) f166177b.get(c9Var);
        if (v5Var == null || (v08 = v5Var.v0()) == null || (c11825xb74ac8c62 = v08.f387239a) == null) {
            if (z17) {
                k91.m4 ij6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij();
                if (ij6 == null) {
                    c11825xb74ac8c62 = null;
                } else {
                    if (c9Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b9) {
                        k17 = ij6.n1(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b9) c9Var).f166060a, "dynamicInfo");
                    } else {
                        if (!(c9Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a9)) {
                            throw new jz5.j();
                        }
                        k17 = ij6.k1(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a9) c9Var).f166035a, "dynamicInfo");
                    }
                    if (k17 != null && (v07 = k17.v0()) != null) {
                        c11825xb74ac8c6 = v07.f387239a;
                        c11825xb74ac8c62 = c11825xb74ac8c6;
                    }
                }
            }
            c11825xb74ac8c6 = null;
            c11825xb74ac8c62 = c11825xb74ac8c6;
        }
        if (c11825xb74ac8c62 == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchTimeoutFallbackBackupWxaAttrUtils", "getDynamicSettings with key:" + c9Var + ", reason:" + str + ", get settings:" + f166176a.f(c11825xb74ac8c62));
        return c11825xb74ac8c62;
    }

    public final java.lang.String f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 c11825xb74ac8c6) {
        return "{OpenWxaWaitUpdateMaxMicSec:" + c11825xb74ac8c6.I + ", OpenWxaWaitUpdateMaxMicSecForWeakNet:" + c11825xb74ac8c6.f158941J + ", NextTryOpenWxaDisMicSec:" + c11825xb74ac8c6.L + '}';
    }
}
