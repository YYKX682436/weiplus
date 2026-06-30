package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\t\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u001aJ\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u000e\u0010\u0012R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/RequestMedicalInsurancePayRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "Landroid/os/Parcel;", "parcel", "Ljz5/f0;", "readParcel", "dest", "", "flags", "writeToParcel", "", "d", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "queryString", "e", "a", "c", "appId", "<init>", "()V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/pay/t2", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayRequest */
/* loaded from: classes7.dex */
final class C12208x9f564abf extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.t2 f34594x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.t2(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private java.lang.String queryString;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private java.lang.String appId;

    public C12208x9f564abf() {
        this.queryString = "";
        this.appId = "";
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.String getQueryString() {
        return this.queryString;
    }

    public final void c(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.appId = str;
    }

    public final void d(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.queryString = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12210x69394b55.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: readParcel */
    public void mo50318xdc053d3f(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.queryString = readString;
        java.lang.String readString2 = parcel.readString();
        this.appId = readString2 != null ? readString2 : "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.queryString);
        dest.writeString(this.appId);
    }

    public C12208x9f564abf(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.queryString = "";
        this.appId = "";
        mo50318xdc053d3f(parcel);
    }
}
