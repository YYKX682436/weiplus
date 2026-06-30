package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes11.dex */
public final class u5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "gamelifeManager";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        nc1.i iVar;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null || jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("functionType", -1);
        nc1.i.f336100d.getClass();
        nc1.i[] values = nc1.i.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                iVar = null;
                break;
            }
            iVar = values[i18];
            iVar.getClass();
            if (optInt == 0) {
                break;
            } else {
                i18++;
            }
        }
        if ((iVar != null ? com.tencent.mm.plugin.appbrand.jsapi.s5.f82924a[iVar.ordinal()] : -1) == 1) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.jsapi.r5.class, new com.tencent.mm.plugin.appbrand.jsapi.t5(e9Var, i17, this));
        } else {
            e9Var.a(i17, "fail wrong functiontype");
        }
    }
}
