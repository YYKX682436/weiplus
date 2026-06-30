package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes4.dex */
public class q9 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f85083d = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.launching.p9.f84898p, "WxaJsApiPluginInfo")};

    public q9(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.launching.p9.f84898p, "WxaJsApiPluginInfo", dm.xc.f241120g);
    }

    public final boolean D0(java.lang.String str, byte[] bArr) {
        com.tencent.mm.plugin.appbrand.launching.p9 p9Var = new com.tencent.mm.plugin.appbrand.launching.p9();
        p9Var.field_appId = str;
        boolean z17 = get(p9Var, new java.lang.String[0]);
        p9Var.field_permissionProtoBlob = bArr;
        return z17 ? update(p9Var, new java.lang.String[0]) : insert(p9Var);
    }

    public boolean y0(java.lang.String str, r45.b10 b10Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || b10Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData,invalid input %s", str);
            return false;
        }
        try {
            if (!D0(str, b10Var.toByteArray())) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData appId:%s ok", str);
            return true;
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData,invalid CheckJsApiInfo %s", str);
            return false;
        }
    }

    public r45.b10 z0(java.lang.String str) {
        try {
            com.tencent.mm.plugin.appbrand.launching.p9 p9Var = new com.tencent.mm.plugin.appbrand.launching.p9();
            p9Var.field_appId = str;
            if (get(p9Var, new java.lang.String[0])) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "found info with appId(%s)", str);
                r45.b10 b10Var = new r45.b10();
                b10Var.parseFrom(p9Var.field_permissionProtoBlob);
                if (b10Var.f370425d.f192156a.length > 0) {
                    return b10Var;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "found info with appId(%s) but jsapi_control_bytes invalid", str);
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LaunchWxaJsApiPluginInfoStorage", e17, "get with appId(%s)", str);
            return null;
        }
    }
}
