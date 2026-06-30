package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.h1 f90727a = new com.tencent.mm.plugin.appbrand.v8_snapshot.h1();

    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader nodeFakeCommLibReader = new com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader(null, 1, null);
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.v8_snapshot.j2.a(nodeFakeCommLibReader);
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.v8_snapshot.j2.b(nodeFakeCommLibReader);
        kotlin.jvm.internal.o.d(b17);
        int pkgVersion = nodeFakeCommLibReader.f90658d.pkgVersion();
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90773i;
        java.lang.String optString = jSONObject.optString("snapshotPath");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        long optLong = jSONObject.optLong("snapshotLastModified", 0L);
        long optLong2 = jSONObject.optLong("snapshotLength", 0L);
        java.lang.String optString2 = jSONObject.optString("snapshotBaseConfig", "{}");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("snapshotMetaInfo");
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        java.lang.String optString3 = jSONObject.optString("snapshotNodeConfig");
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        return new com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo(0, a17, b17, pkgVersion, l3Var, optString, optLong, optLong2, optString2, optJSONObject, true, optString3, 0, 0, 0, 28673, null);
    }

    public final com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo b() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NodeOnlySnapshotInfo#");
        int i17 = com.tencent.mm.plugin.appbrand.v8_snapshot.s3.f90820d;
        sb6.append(com.tencent.mm.plugin.appbrand.v8_snapshot.s3.f90820d);
        java.lang.String string = a17.getString(sb6.toString(), null);
        if (string == null) {
            return null;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(a(new org.json.JSONObject(string)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return (com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
    }
}
