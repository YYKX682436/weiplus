package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/AppBrandPluginUpdateStatusChangeIPCMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "com/tencent/mm/plugin/appbrand/launching/h0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage */
/* loaded from: classes7.dex */
public final class C12329x5651dcf extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6> {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f165891e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f165892f;

    /* renamed from: g, reason: collision with root package name */
    public final ne1.j f165893g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f165894h;

    /* renamed from: i, reason: collision with root package name */
    public final int f165895i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f165896m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h0 f165890n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h0(null);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12329x5651dcf> f35049x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i0();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12329x5651dcf(java.lang.String appId, java.lang.String instanceId, ne1.j state, java.lang.String pluginAppId, int i17, java.lang.String str) {
        super(appId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAppId, "pluginAppId");
        this.f165891e = appId;
        this.f165892f = instanceId;
        this.f165893g = state;
        this.f165894h = pluginAppId;
        this.f165895i = i17;
        this.f165896m = str;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    /* renamed from: a, reason: from getter */
    public java.lang.String getF165891e() {
        return this.f165891e;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    public void b(ze.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        java.lang.String str = this.f165892f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = runtime.u0();
        boolean c17 = u46.l.c(str, u07 != null ? u07.f128810w : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runInLuggageProcess, appId:");
        sb6.append(runtime.f156336n);
        sb6.append(", this.instanceId:");
        sb6.append(this.f165892f);
        sb6.append(", runtime.instanceId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u08 = runtime.u0();
        sb6.append(u08 != null ? u08.f128810w : null);
        sb6.append(", proceed:");
        sb6.append(c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", sb6.toString());
        if (c17) {
            runtime.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j0(runtime, this));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f165891e);
        out.writeString(this.f165892f);
        ne1.j jVar = this.f165893g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVar, "<this>");
        out.writeInt(jVar.ordinal());
        out.writeString(this.f165894h);
        out.writeInt(this.f165895i);
        out.writeString(this.f165896m);
    }
}
