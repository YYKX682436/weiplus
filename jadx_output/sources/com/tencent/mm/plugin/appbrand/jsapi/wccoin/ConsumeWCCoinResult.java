package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/ConsumeWCCoinResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/wccoin/f", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class ConsumeWCCoinResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.wccoin.f CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.f(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f83752d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f83753e;

    public ConsumeWCCoinResult() {
        this.f83752d = "";
        this.f83753e = "";
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
        this.f83752d = readString;
        java.lang.String readString2 = parcel.readString();
        this.f83753e = readString2 != null ? readString2 : "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f83752d);
        dest.writeString(this.f83753e);
    }

    public ConsumeWCCoinResult(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f83752d = "";
        this.f83753e = "";
        readParcel(parcel);
    }
}
