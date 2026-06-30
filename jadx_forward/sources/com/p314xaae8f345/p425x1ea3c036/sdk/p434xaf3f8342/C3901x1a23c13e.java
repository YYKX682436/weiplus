package com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/config/LaunchWxaAppMigrateInfoParcelized;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized */
/* loaded from: classes7.dex */
public final class C3901x1a23c13e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3901x1a23c13e> f15684x681a0c0c = new ne.l();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f128843d;

    public C3901x1a23c13e(java.lang.String str) {
        this.f128843d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f128843d);
    }
}
