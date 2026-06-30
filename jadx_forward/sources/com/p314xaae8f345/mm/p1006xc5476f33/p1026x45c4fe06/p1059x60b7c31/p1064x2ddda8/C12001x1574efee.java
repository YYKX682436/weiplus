package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/auth/a2", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse */
/* loaded from: classes7.dex */
public final class C12001x1574efee extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a2 f33845x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a2(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f160885d;

    /* renamed from: e, reason: collision with root package name */
    public int f160886e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f160887f;

    public C12001x1574efee(java.lang.String requestTicket, int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestTicket, "requestTicket");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f160885d = requestTicket;
        this.f160886e = i17;
        this.f160887f = errMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600
    /* renamed from: readParcel */
    public void mo50320xdc053d3f(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(parcel);
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.f160885d = readString;
        this.f160886e = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        this.f160887f = readString2 != null ? readString2 : "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f160885d);
        parcel.writeInt(this.f160886e);
        parcel.writeString(this.f160887f);
    }
}
