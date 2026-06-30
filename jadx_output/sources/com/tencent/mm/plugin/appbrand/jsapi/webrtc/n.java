package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public class n extends gb1.f {
    public static final int CTRL_INDEX = 1118;
    public static final java.lang.String NAME = "removeWebRTCRendererView";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.getInt("viewId");
    }

    @Override // gb1.f
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public boolean J(com.tencent.luggage.sdk.jsapi.component.b bVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.luggage.sdk.jsapi.component.service.y v37;
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e;
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRemoveWebRTCRendererView", "hy: try remove webrtc view " + i17);
        if (bVar == null || (v37 = bVar.v3()) == null || (f147808e = v37.getF147808e()) == null || (f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) f147808e.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)) == null) {
            return true;
        }
        f0Var.post(new com.tencent.mm.plugin.appbrand.jsapi.webrtc.m(view, jSONObject, bVar));
        return true;
    }
}
