package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandFinishMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "Lxe/a;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandFinishMessage */
/* loaded from: classes7.dex */
public final class C12606x6310078e extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6> implements xe.a {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12606x6310078e> f35265x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.e();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f170568e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f170569f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f170570g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12606x6310078e(java.lang.String appId, java.lang.String str, boolean z17) {
        super(appId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f170568e = appId;
        this.f170569f = str;
        this.f170570g = z17;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    /* renamed from: a, reason: from getter */
    public java.lang.String getF170568e() {
        return this.f170568e;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    public void b(ze.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        if (!this.f170570g) {
            runtime.l0();
            return;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        runtime.f156327J.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.f(countDownLatch));
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f170568e);
        out.writeString(this.f170569f);
        out.writeInt(this.f170570g ? 1 : 0);
    }
}
