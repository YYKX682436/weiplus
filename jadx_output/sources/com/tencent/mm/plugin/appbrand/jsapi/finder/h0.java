package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class h0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "openFinderProfile";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (!(lVar.getF147807d() instanceof android.app.Activity)) {
            lVar.a(i17, "fail");
            return;
        }
        if (jSONObject == null) {
            lVar.a(i17, "fail:data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            lVar.a(i17, "fail:username is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", optString);
        android.content.Context f147807d = lVar.getF147807d();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f460472a;
            if (f147807d == null) {
                f147807d = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlin.jvm.internal.o.d(f147807d);
            e1Var.w(f147807d, intent);
        } else {
            if (f147807d == null) {
                f147807d = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            com.tencent.mm.plugin.appbrand.jsapi.finder.OpenFinderProfileProxy$FinderProfileRequest openFinderProfileProxy$FinderProfileRequest = new com.tencent.mm.plugin.appbrand.jsapi.finder.OpenFinderProfileProxy$FinderProfileRequest(intent);
            java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, openFinderProfileProxy$FinderProfileRequest, null, null);
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str2, jSONObject2));
    }
}
