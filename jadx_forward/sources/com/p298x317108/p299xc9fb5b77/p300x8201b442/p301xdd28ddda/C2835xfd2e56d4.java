package com.p298x317108.p299xc9fb5b77.p300x8201b442.p301xdd28ddda;

/* renamed from: com.iqoo.secure.antifraud.thirdpart.CheckRiskResult */
/* loaded from: classes13.dex */
public class C2835xfd2e56d4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p298x317108.p299xc9fb5b77.p300x8201b442.p301xdd28ddda.C2835xfd2e56d4> f9679x681a0c0c = new nb.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f127346d;

    /* renamed from: e, reason: collision with root package name */
    public final int f127347e;

    /* renamed from: f, reason: collision with root package name */
    public final int f127348f;

    public C2835xfd2e56d4(android.os.Parcel parcel) {
        this.f127346d = parcel.readInt();
        this.f127347e = parcel.readInt();
        this.f127348f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f127346d);
        parcel.writeInt(this.f127347e);
        parcel.writeInt(this.f127348f);
    }
}
