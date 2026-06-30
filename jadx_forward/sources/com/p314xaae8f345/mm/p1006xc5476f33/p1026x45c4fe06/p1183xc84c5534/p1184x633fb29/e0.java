package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f169470a = new java.util.HashSet(java.util.Arrays.asList(uc1.d.f76853x24728b, uc1.g.f76873x24728b, uc1.k.f76889x24728b, uc1.m.f76891x24728b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.x.f33836x24728b, ad1.e.f26x24728b, yc1.q.f77528x24728b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33776x24728b, nd1.c.f72914x24728b, vb1.m.f77269x24728b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c0.f33780x24728b, "getCurrentRoute", uc1.v.f76923x24728b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.p.f34866x24728b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.v.f34872x24728b, "getSystemInfo", "hideToast", uc1.n1.f76895x24728b, "onAccelerometerChange", "onCompassChange", qc1.u.f76444x24728b, "onMapRegionChange", "onSocketClose", "onSocketError", "onSocketMessage", "onSocketOpen", if1.q.f69936x24728b, if1.p.f69934x24728b, if1.o.f69932x24728b, "onVideoTimeUpdate", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.k0.f33802x24728b, yc1.a0.f77516x24728b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.c0.f34842x24728b, "reportIDKey", vd1.r.f77297x24728b, vd1.s.f77299x24728b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.j0.f34856x24728b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.k0.f34860x24728b, "showModal", "showToast", "syncAudioEvent", vb1.y.f77281x24728b, uc1.e2.f76863x24728b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pe.f34671x24728b));

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f169471b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.z("AppBrandJsApiInvokeReportWorker", 1, 1, new java.util.concurrent.LinkedBlockingDeque());

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.d0 f169472c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.d0(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f169473d = java.util.regex.Pattern.compile(".*\"errMsg\":\"[^:]+:([^\"]+)\".*");

    /* renamed from: e, reason: collision with root package name */
    public static boolean f169474e = false;

    public static java.lang.String a(java.lang.String str) {
        java.lang.String group;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        java.util.regex.Matcher matcher = f169473d.matcher(str);
        return (!matcher.matches() || (group = matcher.group(1)) == null) ? "" : group;
    }

    public static int b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.startsWith("ok")) {
            return 1;
        }
        if (str.startsWith("fail cancel")) {
            return 3;
        }
        return str.startsWith("fail") ? 2 : 1;
    }
}
