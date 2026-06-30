package com.tencent.mm.plugin.appbrand.app;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class h9 extends com.tencent.mm.plugin.appbrand.app.l8 {
    static {
        new com.tencent.mm.plugin.appbrand.app.t8(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.app.l8, com.tencent.mm.plugin.appbrand.service.r5
    public void Eh(java.lang.String str, r.a aVar) {
        uk0.a.b(new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.app.d9.f75056d, new com.tencent.mm.plugin.appbrand.app.e9(aVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.app.l8, com.tencent.mm.plugin.appbrand.service.r5
    public void Ug(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.service.q5 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (str2 == null || str == null) {
            return;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        obtain.writeString(str);
        obtain.writeString(str2);
        obtain.setDataPosition(0);
        try {
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.app.l8, com.tencent.mm.plugin.appbrand.service.r5
    public km5.q g2(java.lang.String str) {
        pq5.g a17 = pq5.h.a();
        a17.K(new com.tencent.mm.plugin.appbrand.app.g9(str));
        return a17;
    }

    @Override // com.tencent.mm.plugin.appbrand.app.l8, com.tencent.mm.plugin.appbrand.service.r5
    public void oh(int i17, java.lang.String str, java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar;
        android.util.SparseArray sparseArray = com.tencent.mm.plugin.appbrand.jsapi.webview.a.f83870a;
        synchronized (sparseArray) {
            oVar = (com.tencent.mm.plugin.appbrand.jsapi.webview.o) sparseArray.get(i17);
        }
        if (oVar != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            of1.w1 w1Var = (of1.w1) oVar;
            jSONObject.put("htmlId", w1Var.getCoverViewId());
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
            jSONObject.put("arg", obj);
            w1Var.F(jSONObject);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.app.l8, com.tencent.mm.plugin.appbrand.service.r5
    public void p7(java.util.List list) {
        if (list == null) {
            return;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        obtain.writeStringList(list);
        obtain.setDataPosition(0);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, obtain, com.tencent.mm.plugin.appbrand.app.s8.class, new com.tencent.mm.plugin.appbrand.app.b9(obtain));
    }

    @Override // com.tencent.mm.plugin.appbrand.app.l8, com.tencent.mm.plugin.appbrand.service.r5
    public void sd(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.w9.f193053a;
        com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event sendDataToMiniProgramFromH5Event = new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event();
        sendDataToMiniProgramFromH5Event.f81271d = str;
        sendDataToMiniProgramFromH5Event.f81272e = str2;
        sendDataToMiniProgramFromH5Event.f81273f = i17;
        com.tencent.mm.ipcinvoker.extension.l.a(str3, sendDataToMiniProgramFromH5Event, com.tencent.mm.plugin.appbrand.app.a9.class, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.app.l8, com.tencent.mm.plugin.appbrand.service.r5
    public void xh(java.lang.String str) {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.app.y8.class, null);
    }
}
