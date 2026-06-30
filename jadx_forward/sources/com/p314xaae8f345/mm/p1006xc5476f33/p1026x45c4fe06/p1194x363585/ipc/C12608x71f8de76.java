package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandLaunchWxaAppInfoNotifyMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "com/tencent/mm/plugin/appbrand/task/ipc/l", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandLaunchWxaAppInfoNotifyMessage */
/* loaded from: classes7.dex */
public final class C12608x71f8de76 extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6> {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12608x71f8de76> f35267x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.j();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f170574e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Parcelable f170575f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12608x71f8de76(java.lang.String appId, android.os.Parcelable data) {
        super(appId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f170574e = appId;
        this.f170575f = data;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    /* renamed from: a, reason: from getter */
    public java.lang.String getF170574e() {
        return this.f170574e;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    public void b(ze.n nVar) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        final android.os.Parcelable parcelable = this.f170575f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILaunchWxaAppInfoNotify.RuntimeHelper[permission]", "handleIPCNotifyMessage runtime(%s %d), destroyed %b", runtime.f156336n, java.lang.Integer.valueOf(runtime.f156338p.f158814g), java.lang.Boolean.valueOf(runtime.L0()));
        if (runtime.L0()) {
            return;
        }
        runtime.F2(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.g7$$a
            /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
            /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 579
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.RunnableC12356x5c50131.run():void");
            }
        });
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f170574e);
        out.writeParcelable(this.f170575f, i17);
    }
}
