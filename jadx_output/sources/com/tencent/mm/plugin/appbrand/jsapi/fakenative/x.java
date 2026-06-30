package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes4.dex */
public class x extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f81000d = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.jsapi.fakenative.w.f80999t, "LaunchBusinessWxaAppInfo")};

    public x(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.jsapi.fakenative.w.f80999t, "LaunchBusinessWxaAppInfo", null);
    }

    public boolean d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.w wVar = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.w();
        wVar.field_businessAppInfoKey = str;
        return super.delete(wVar, "businessAppInfoKey");
    }

    public com.tencent.mm.plugin.appbrand.jsapi.fakenative.w y0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.w wVar = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.w();
        wVar.field_businessAppInfoKey = str;
        if (super.get(wVar, "businessAppInfoKey")) {
            return wVar;
        }
        return null;
    }

    public boolean z0(java.lang.String str, byte[] bArr, long j17, long j18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.w wVar = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.w();
        wVar.field_businessAppInfoKey = str;
        wVar.field_duration = j17;
        wVar.field_respBuff = bArr;
        wVar.field_lastUpdateTime = j18;
        return y0(str) == null ? super.insert(wVar) : super.update(wVar, "businessAppInfoKey");
    }
}
