package com.p314xaae8f345.p2833x33330b;

/* renamed from: com.tencent.mmkv.ParcelableMMKV */
/* loaded from: classes12.dex */
public final class C22995x3ecd368e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2833x33330b.C22995x3ecd368e> f40024x681a0c0c = new ir5.j();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f296705d;

    /* renamed from: e, reason: collision with root package name */
    public final int f296706e;

    /* renamed from: f, reason: collision with root package name */
    public final int f296707f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f296708g;

    public C22995x3ecd368e(com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b sharedPreferencesC22993x242b0b) {
        this.f296706e = -1;
        this.f296707f = -1;
        this.f296708g = null;
        this.f296705d = sharedPreferencesC22993x242b0b.m84101xc02e032a();
        this.f296706e = sharedPreferencesC22993x242b0b.m84038xd7662c9d();
        this.f296707f = sharedPreferencesC22993x242b0b.m84039x370dba02();
        this.f296708g = sharedPreferencesC22993x242b0b.m84051x8f754a11();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            parcel.writeString(this.f296705d);
            android.os.ParcelFileDescriptor fromFd = android.os.ParcelFileDescriptor.fromFd(this.f296706e);
            android.os.ParcelFileDescriptor fromFd2 = android.os.ParcelFileDescriptor.fromFd(this.f296707f);
            int i18 = i17 | 1;
            fromFd.writeToParcel(parcel, i18);
            fromFd2.writeToParcel(parcel, i18);
            java.lang.String str = this.f296708g;
            if (str != null) {
                parcel.writeString(str);
            }
        } catch (java.io.IOException unused) {
        }
    }

    public C22995x3ecd368e(java.lang.String str, int i17, int i18, java.lang.String str2, ir5.j jVar) {
        this.f296706e = -1;
        this.f296707f = -1;
        this.f296708g = null;
        this.f296705d = str;
        this.f296706e = i17;
        this.f296707f = i18;
        this.f296708g = str2;
    }
}
