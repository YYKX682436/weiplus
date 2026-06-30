package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes4.dex */
public class q9 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f166616d = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p9.f166431p, "WxaJsApiPluginInfo")};

    public q9(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p9.f166431p, "WxaJsApiPluginInfo", dm.xc.f322653g);
    }

    public final boolean D0(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p9 p9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p9();
        p9Var.f69162x28d45f97 = str;
        boolean z17 = get(p9Var, new java.lang.String[0]);
        p9Var.f69163xe64199d1 = bArr;
        return z17 ? mo9952xce0038c9(p9Var, new java.lang.String[0]) : mo880xb970c2b9(p9Var);
    }

    public boolean y0(java.lang.String str, r45.b10 b10Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || b10Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData,invalid input %s", str);
            return false;
        }
        try {
            if (!D0(str, b10Var.mo14344x5f01b1f6())) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData appId:%s ok", str);
            return true;
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData,invalid CheckJsApiInfo %s", str);
            return false;
        }
    }

    public r45.b10 z0(java.lang.String str) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p9 p9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p9();
            p9Var.f69162x28d45f97 = str;
            if (get(p9Var, new java.lang.String[0])) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "found info with appId(%s)", str);
                r45.b10 b10Var = new r45.b10();
                b10Var.mo11468x92b714fd(p9Var.f69163xe64199d1);
                if (b10Var.f451958d.f273689a.length > 0) {
                    return b10Var;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "found info with appId(%s) but jsapi_control_bytes invalid", str);
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LaunchWxaJsApiPluginInfoStorage", e17, "get with appId(%s)", str);
            return null;
        }
    }
}
