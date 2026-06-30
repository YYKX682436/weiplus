package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/PublishTextStatusResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/tf", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class PublishTextStatusResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.tf CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.tf(null);

    /* renamed from: d, reason: collision with root package name */
    public int f78667d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f78668e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f78669f;

    public PublishTextStatusResult() {
        this.f78668e = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f78667d = parcel.readInt();
        this.f78668e = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt == 0) {
            this.f78669f = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        this.f78669f = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f78667d);
        dest.writeString(this.f78668e);
        byte[] bArr = this.f78669f;
        int length = bArr != null ? bArr.length : 0;
        dest.writeInt(length);
        if (length != 0) {
            dest.writeByteArray(this.f78669f);
        }
    }

    public PublishTextStatusResult(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f78668e = "";
        readParcel(parcel);
    }
}
