package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes13.dex */
public final class c implements android.os.Parcelable.Creator {
    public c(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult() { // from class: com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultResult
            public static final com.tencent.mm.plugin.appbrand.jsapi.pay.c CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.pay.c(null);

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
            public void readParcel(android.os.Parcel parcel2) {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                kotlin.jvm.internal.o.g(parcel2, "parcel");
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultResult[i17];
    }
}
