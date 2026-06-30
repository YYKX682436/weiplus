package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* renamed from: com.tencent.mm.plugin.facedetect.model.FaceContextData */
/* loaded from: classes14.dex */
public class C13514xca0b073c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13514xca0b073c> f35507x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.x();

    /* renamed from: e, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13514xca0b073c f181483e;

    /* renamed from: d, reason: collision with root package name */
    public long f181484d;

    public C13514xca0b073c(android.os.Parcel parcel) {
        this.f181484d = -1L;
        this.f181484d = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f181484d);
    }
}
