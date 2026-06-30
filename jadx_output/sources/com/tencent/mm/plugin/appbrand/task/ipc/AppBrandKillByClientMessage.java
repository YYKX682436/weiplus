package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandKillByClientMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandKillByClientMessage extends com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<com.tencent.mm.plugin.appbrand.o6> {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage> CREATOR = new com.tencent.mm.plugin.appbrand.task.ipc.g();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f89038e;

    /* renamed from: f, reason: collision with root package name */
    public final int f89039f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.luggage.sdk.processes.c f89040g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandKillByClientMessage(java.lang.String appId, int i17) {
        super(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f89038e = appId;
        this.f89039f = i17;
        this.f89040g = com.tencent.luggage.sdk.processes.c.values()[i17];
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: a, reason: from getter */
    public java.lang.String getF47636d() {
        return this.f89038e;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(com.tencent.mm.plugin.appbrand.o6 runtime) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        if (!kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.task.ipc.h(this, runtime));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKillByClientMessage", "runInLuggageProcess killType:" + this.f89040g + ", web-kernel:" + com.tencent.xweb.WebView.getCurrentModuleWebCoreType());
        int ordinal = this.f89040g.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                com.tencent.xweb.a3.c(true);
                d(runtime);
                return;
            } else {
                if (ordinal != 4) {
                    d(runtime);
                    return;
                }
                android.app.Activity r07 = runtime.r0();
                if (r07 != null) {
                    r07.finish();
                    return;
                }
                return;
            }
        }
        com.tencent.xweb.a3.c(true);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_account_expired_enable, false)) {
            d(runtime);
            return;
        }
        android.app.Activity r08 = runtime.r0();
        if (r08 != null) {
            com.tencent.mm.plugin.appbrand.ui.m8.f89866a.a(r08);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            d(runtime);
        }
    }

    public final void d(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKillByClientMessage", "silentKill runtime:" + o6Var.f74803n);
        o6Var.L2(com.tencent.mm.plugin.appbrand.task.ipc.i.f89069d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f89038e);
        out.writeInt(this.f89039f);
    }
}
