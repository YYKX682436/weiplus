package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api;

/* renamed from: com.tencent.mm.plugin.normsg.api.CameraAvailable */
/* loaded from: classes13.dex */
public class C16752xd9b55904 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.api.C16752xd9b55904> f37711x681a0c0c = new fo3.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f233938d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f233939e;

    /* renamed from: f, reason: collision with root package name */
    public final long f233940f;

    public C16752xd9b55904(java.lang.String str, long j17, boolean z17) {
        this.f233938d = str;
        this.f233939e = z17;
        this.f233940f = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f233938d);
        parcel.writeByte(this.f233939e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f233940f);
    }

    public C16752xd9b55904(android.os.Parcel parcel) {
        this.f233938d = parcel.readString();
        this.f233939e = parcel.readByte() != 0;
        this.f233940f = parcel.readLong();
    }
}
