package com.tencent.mm.plugin.appbrand.networking;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/networking/AppBrandWeakNetReceiver$WeakNetNotifyMessage", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandWeakNetReceiver$WeakNetNotifyMessage extends com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<com.tencent.mm.plugin.appbrand.o6> {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.networking.AppBrandWeakNetReceiver$WeakNetNotifyMessage> CREATOR = new com.tencent.mm.plugin.appbrand.networking.j();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f86068e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f86069f;

    /* renamed from: g, reason: collision with root package name */
    public final int f86070g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandWeakNetReceiver$WeakNetNotifyMessage(java.lang.String appId, boolean z17, int i17) {
        super(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f86068e = appId;
        this.f86069f = z17;
        this.f86070g = i17;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: a, reason: from getter */
    public java.lang.String getF86068e() {
        return this.f86068e;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    public void b(ze.n nVar) {
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17;
        final com.tencent.mm.plugin.appbrand.o6 runtime = (com.tencent.mm.plugin.appbrand.o6) nVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        boolean z17 = this.f86069f;
        int i17 = this.f86070g;
        if (z17 && (a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(runtime)) != null) {
            a17.F = i17;
        }
        com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode wxAppLibServerMode = runtime.Y1;
        final com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode wxAppLibServerMode2 = new com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode(z17, xh1.j.f454516f);
        if (wxAppLibServerMode != null && wxAppLibServerMode2.f86101d == wxAppLibServerMode.f86101d) {
            return;
        }
        runtime.I1(new java.lang.Runnable() { // from class: ze.n$$e
            @Override // java.lang.Runnable
            public final void run() {
                ze.n nVar2 = ze.n.this;
                com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode wxAppLibServerMode3 = wxAppLibServerMode2;
                if (wxAppLibServerMode3 != null) {
                    nVar2.Y1 = wxAppLibServerMode3;
                }
                com.tencent.luggage.sdk.jsapi.component.service.y C0 = nVar2.C0();
                com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode wxAppLibServerMode4 = nVar2.Y1;
                wxAppLibServerMode4.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, wxAppLibServerMode4.f86101d);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, wxAppLibServerMode4.f86102e.f454519d);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                C0.g("onToggleWxappLibServerMode", jSONObject2);
            }
        });
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWeakNetReceiver.AppBrandReceiver", "dispatchWxAppLibServerModeChanged " + wxAppLibServerMode2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f86068e);
        out.writeInt(this.f86069f ? 1 : 0);
        out.writeInt(this.f86070g);
    }
}
