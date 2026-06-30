package com.p314xaae8f345.p362xadfe2b3.p370x60b7c31;

/* renamed from: com.tencent.liteapp.jsapi.WxaLiteAppIPCCallbackData */
/* loaded from: classes.dex */
public class C3706x6aa9ce58 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p370x60b7c31.C3706x6aa9ce58> f14303x681a0c0c = new jd.a();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f127527d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f127528e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f127529f;

    public C3706x6aa9ce58(android.os.Parcel parcel) {
        this.f127527d = false;
        this.f127528e = null;
        this.f127529f = null;
        this.f127527d = parcel.readInt() == 1;
        this.f127528e = parcel.readString();
        this.f127529f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f127527d ? 1 : 0);
        parcel.writeString(this.f127528e);
        parcel.writeString(this.f127529f);
    }
}
