package com.tencent.mm.plugin.appbrand.jsapi.profile;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/ProfileResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/profile/g0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class ProfileResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final com.tencent.mm.plugin.appbrand.jsapi.profile.g0 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.profile.g0(null);

    /* renamed from: d, reason: collision with root package name */
    public int f82765d;

    /* renamed from: e, reason: collision with root package name */
    public int f82766e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f82767f;

    public ProfileResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f82765d = parcel.readInt();
        this.f82766e = parcel.readInt();
        this.f82767f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f82765d);
        dest.writeInt(this.f82766e);
        dest.writeString(this.f82767f);
    }

    public ProfileResult(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        readParcel(parcel);
    }
}
