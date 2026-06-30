package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public final class p0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1216;
    public static final java.lang.String NAME = "quickSendRedPacket";

    /* renamed from: g, reason: collision with root package name */
    public final int f82649g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("JsApiQuickSendRedPacket", "invode jsapi quick send red packet");
        if (c0Var == null) {
            return;
        }
        if (c0Var.t3() == null) {
            c0Var.a(i17, o("fail:internal error"));
            return;
        }
        if (jSONObject == null) {
            c0Var.a(i17, o("fail:invalid data"));
            return;
        }
        if (c0Var.getF147807d() instanceof com.tencent.mm.ui.MMFragmentActivity) {
            com.tencent.mars.xlog.Log.i("JsApiQuickSendRedPacket", "env.context is MMFragmentActivity");
            android.content.Context f147807d = c0Var.getF147807d();
            kotlin.jvm.internal.o.e(f147807d, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) f147807d;
            java.lang.String optString = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            java.lang.String optString2 = jSONObject.optString("materialId");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27809, 1, optString2, optString2, "", optString, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 12);
            rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string = c0Var.getF147807d().getString(com.tencent.mm.R.string.gk7);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.content.Intent Ni = ((qd0.q0) e1Var).Ni(mMFragmentActivity, string);
            Ni.putExtra("KQuickSendRedPacketSessionId", optString);
            Ni.putExtra("KQuickSendRedPacketMaterialId", optString2);
            Ni.putExtra("KQuickSendRedPacketFromMakeSkinMiniProgram", true);
            Ni.putExtra("key_from", 5);
            ((pg0.d3) ((qg0.c0) i95.n0.c(qg0.c0.class))).getClass();
            if (((j05.f) i95.n0.c(j05.f.class)) != null) {
                pf5.j0.a(Ni, fb3.e.class);
                pf5.j0.a(Ni, fb3.b.class);
            }
            nf.g.a(c0Var.getF147807d()).f(new com.tencent.mm.plugin.appbrand.jsapi.pay.o0(this, new java.lang.ref.WeakReference(c0Var), c0Var, i17));
            mMFragmentActivity.startActivityForResult(Ni, this.f82649g);
        }
    }
}
