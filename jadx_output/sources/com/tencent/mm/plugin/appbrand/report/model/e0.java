package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f87937a = new java.util.HashSet(java.util.Arrays.asList(uc1.d.NAME, uc1.g.NAME, uc1.k.NAME, uc1.m.NAME, com.tencent.mm.plugin.appbrand.jsapi.audio.x.NAME, ad1.e.NAME, yc1.q.NAME, com.tencent.mm.plugin.appbrand.jsapi.audio.a0.NAME, nd1.c.NAME, vb1.m.NAME, com.tencent.mm.plugin.appbrand.jsapi.audio.c0.NAME, "getCurrentRoute", uc1.v.NAME, com.tencent.mm.plugin.appbrand.jsapi.storage.p.NAME, com.tencent.mm.plugin.appbrand.jsapi.storage.v.NAME, "getSystemInfo", "hideToast", uc1.n1.NAME, "onAccelerometerChange", "onCompassChange", qc1.u.NAME, "onMapRegionChange", "onSocketClose", "onSocketError", "onSocketMessage", "onSocketOpen", if1.q.NAME, if1.p.NAME, if1.o.NAME, "onVideoTimeUpdate", com.tencent.mm.plugin.appbrand.jsapi.audio.k0.NAME, yc1.a0.NAME, com.tencent.mm.plugin.appbrand.jsapi.storage.c0.NAME, "reportIDKey", vd1.r.NAME, vd1.s.NAME, com.tencent.mm.plugin.appbrand.jsapi.storage.j0.NAME, com.tencent.mm.plugin.appbrand.jsapi.storage.k0.NAME, "showModal", "showToast", "syncAudioEvent", vb1.y.NAME, uc1.e2.NAME, com.tencent.mm.plugin.appbrand.jsapi.pe.NAME));

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f87938b = new com.tencent.mm.plugin.appbrand.report.model.z("AppBrandJsApiInvokeReportWorker", 1, 1, new java.util.concurrent.LinkedBlockingDeque());

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.model.d0 f87939c = new com.tencent.mm.plugin.appbrand.report.model.d0(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f87940d = java.util.regex.Pattern.compile(".*\"errMsg\":\"[^:]+:([^\"]+)\".*");

    /* renamed from: e, reason: collision with root package name */
    public static boolean f87941e = false;

    public static java.lang.String a(java.lang.String str) {
        java.lang.String group;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        java.util.regex.Matcher matcher = f87940d.matcher(str);
        return (!matcher.matches() || (group = matcher.group(1)) == null) ? "" : group;
    }

    public static int b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.startsWith("ok")) {
            return 1;
        }
        if (str.startsWith("fail cancel")) {
            return 3;
        }
        return str.startsWith("fail") ? 2 : 1;
    }
}
