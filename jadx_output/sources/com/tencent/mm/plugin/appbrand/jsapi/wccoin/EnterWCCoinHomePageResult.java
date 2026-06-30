package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/EnterWCCoinHomePageResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/wccoin/l", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class EnterWCCoinHomePageResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.wccoin.l CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.l(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f83755d;

    public EnterWCCoinHomePageResult() {
        this.f83755d = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.f83755d = readString;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f83755d);
    }

    public EnterWCCoinHomePageResult(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f83755d = "";
        readParcel(parcel);
    }
}
