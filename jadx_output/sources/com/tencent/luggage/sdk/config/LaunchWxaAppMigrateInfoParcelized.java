package com.tencent.luggage.sdk.config;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/config/LaunchWxaAppMigrateInfoParcelized;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class LaunchWxaAppMigrateInfoParcelized implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized> CREATOR = new ne.l();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f47310d;

    public LaunchWxaAppMigrateInfoParcelized(java.lang.String str) {
        this.f47310d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f47310d);
    }
}
