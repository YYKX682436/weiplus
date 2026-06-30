package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/magicbrush_frame/appbrand_host/OnMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.OnMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage */
/* loaded from: classes7.dex */
public final class C12410xc56fbdc6 extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6> {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.C12410xc56fbdc6> f35092x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.d();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f167264e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f167265f;

    /* renamed from: g, reason: collision with root package name */
    public final int f167266g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12410xc56fbdc6(java.lang.String appId, java.lang.String removedAppId, int i17) {
        super(appId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(removedAppId, "removedAppId");
        this.f167264e = appId;
        this.f167265f = removedAppId;
        this.f167266g = i17;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    /* renamed from: a, reason: from getter */
    public java.lang.String getF167264e() {
        return this.f167264e;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    public void b(ze.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        runtime.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.e(runtime, this));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f167264e);
        out.writeString(this.f167265f);
        out.writeInt(this.f167266g);
    }
}
