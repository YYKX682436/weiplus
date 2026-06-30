package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/AppBrandPluginUpdateStatusChangeIPCMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "com/tencent/mm/plugin/appbrand/launching/h0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandPluginUpdateStatusChangeIPCMessage extends com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<com.tencent.mm.plugin.appbrand.o6> {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f84358e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f84359f;

    /* renamed from: g, reason: collision with root package name */
    public final ne1.j f84360g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f84361h;

    /* renamed from: i, reason: collision with root package name */
    public final int f84362i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f84363m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.h0 f84357n = new com.tencent.mm.plugin.appbrand.launching.h0(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage> CREATOR = new com.tencent.mm.plugin.appbrand.launching.i0();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandPluginUpdateStatusChangeIPCMessage(java.lang.String appId, java.lang.String instanceId, ne1.j state, java.lang.String pluginAppId, int i17, java.lang.String str) {
        super(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(pluginAppId, "pluginAppId");
        this.f84358e = appId;
        this.f84359f = instanceId;
        this.f84360g = state;
        this.f84361h = pluginAppId;
        this.f84362i = i17;
        this.f84363m = str;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: a, reason: from getter */
    public java.lang.String getF84358e() {
        return this.f84358e;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    public void b(ze.n nVar) {
        com.tencent.mm.plugin.appbrand.o6 runtime = (com.tencent.mm.plugin.appbrand.o6) nVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        java.lang.String str = this.f84359f;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = runtime.u0();
        boolean c17 = u46.l.c(str, u07 != null ? u07.f47277w : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runInLuggageProcess, appId:");
        sb6.append(runtime.f74803n);
        sb6.append(", this.instanceId:");
        sb6.append(this.f84359f);
        sb6.append(", runtime.instanceId:");
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08 = runtime.u0();
        sb6.append(u08 != null ? u08.f47277w : null);
        sb6.append(", proceed:");
        sb6.append(c17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", sb6.toString());
        if (c17) {
            runtime.I1(new com.tencent.mm.plugin.appbrand.launching.j0(runtime, this));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f84358e);
        out.writeString(this.f84359f);
        ne1.j jVar = this.f84360g;
        kotlin.jvm.internal.o.g(jVar, "<this>");
        out.writeInt(jVar.ordinal());
        out.writeString(this.f84361h);
        out.writeInt(this.f84362i);
        out.writeString(this.f84363m);
    }
}
