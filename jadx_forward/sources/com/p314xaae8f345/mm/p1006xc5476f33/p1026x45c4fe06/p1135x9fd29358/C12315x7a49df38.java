package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1135x9fd29358;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/language/AppBrandOnLanguageChangeIPCMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.language.AppBrandOnLanguageChangeIPCMessage */
/* loaded from: classes7.dex */
public class C12315x7a49df38 extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6> {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1135x9fd29358.C12315x7a49df38> f35041x681a0c0c = new mg1.b();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f165773e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f165774f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12315x7a49df38(java.lang.String appId, java.lang.String language) {
        super(appId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(language, "language");
        this.f165773e = appId;
        this.f165774f = language;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    /* renamed from: a, reason: from getter */
    public java.lang.String getF165773e() {
        return this.f165773e;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    public void b(ze.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChangeLanguageEventListenerIPCMessage", "runInLuggageProcess");
        runtime.I1(new mg1.c(runtime, this));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f165773e);
        out.writeString(this.f165774f);
    }
}
