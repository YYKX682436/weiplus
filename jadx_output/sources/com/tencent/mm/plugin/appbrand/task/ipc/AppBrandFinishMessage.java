package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandFinishMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "Lxe/a;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandFinishMessage extends com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<com.tencent.mm.plugin.appbrand.o6> implements xe.a {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandFinishMessage> CREATOR = new com.tencent.mm.plugin.appbrand.task.ipc.e();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f89035e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f89036f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f89037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandFinishMessage(java.lang.String appId, java.lang.String str, boolean z17) {
        super(appId);
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f89035e = appId;
        this.f89036f = str;
        this.f89037g = z17;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    /* renamed from: a, reason: from getter */
    public java.lang.String getF89035e() {
        return this.f89035e;
    }

    @Override // com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage
    public void b(ze.n nVar) {
        com.tencent.mm.plugin.appbrand.o6 runtime = (com.tencent.mm.plugin.appbrand.o6) nVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        if (!this.f89037g) {
            runtime.l0();
            return;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        runtime.f74794J.add(new com.tencent.mm.plugin.appbrand.task.ipc.f(countDownLatch));
        runtime.l0();
        if (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f89035e);
        out.writeString(this.f89036f);
        out.writeInt(this.f89037g ? 1 : 0);
    }
}
