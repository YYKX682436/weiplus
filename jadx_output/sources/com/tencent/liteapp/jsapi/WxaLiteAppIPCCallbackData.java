package com.tencent.liteapp.jsapi;

/* loaded from: classes.dex */
public class WxaLiteAppIPCCallbackData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.liteapp.jsapi.WxaLiteAppIPCCallbackData> CREATOR = new jd.a();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f45994d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f45995e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f45996f;

    public WxaLiteAppIPCCallbackData(android.os.Parcel parcel) {
        this.f45994d = false;
        this.f45995e = null;
        this.f45996f = null;
        this.f45994d = parcel.readInt() == 1;
        this.f45995e = parcel.readString();
        this.f45996f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f45994d ? 1 : 0);
        parcel.writeString(this.f45995e);
        parcel.writeString(this.f45996f);
    }
}
