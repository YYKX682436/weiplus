package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged */
/* loaded from: classes7.dex */
class C11737xeb4bc1f3 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11737xeb4bc1f3> f33519x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.s();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f158463d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f158464e;

    public C11737xeb4bc1f3(java.lang.String str, boolean z17) {
        this.f158463d = str;
        this.f158464e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158463d);
        parcel.writeByte(this.f158464e ? (byte) 1 : (byte) 0);
    }

    public C11737xeb4bc1f3(android.os.Parcel parcel) {
        this.f158463d = parcel.readString();
        this.f158464e = parcel.readByte() != 0;
    }
}
