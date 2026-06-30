package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCameraForImageSearch$ChooseResult", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/a9", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseResult */
/* loaded from: classes7.dex */
final class C11928xba1e0e3e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a9 f33661x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a9(null);

    /* renamed from: d, reason: collision with root package name */
    public int f160115d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386 f160116e;

    public C11928xba1e0e3e() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600
    /* renamed from: readParcel */
    public void mo50320xdc053d3f(android.os.Parcel in6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
        this.f160115d = in6.readInt();
        this.f160116e = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386) in6.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f160115d);
        dest.writeParcelable(this.f160116e, i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11928xba1e0e3e(android.os.Parcel in6) {
        super(in6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
    }
}
