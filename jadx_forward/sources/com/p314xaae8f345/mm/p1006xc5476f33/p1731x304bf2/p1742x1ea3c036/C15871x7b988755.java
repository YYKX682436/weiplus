package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* renamed from: com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo */
/* loaded from: classes8.dex */
public class C15871x7b988755 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15871x7b988755> f36922x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.n();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f221007d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f221008e;

    /* renamed from: f, reason: collision with root package name */
    public int f221009f;

    public C15871x7b988755() {
        this.f221008e = false;
        this.f221009f = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f221007d);
        parcel.writeInt(this.f221008e ? 1 : 0);
        parcel.writeInt(this.f221009f);
    }

    public C15871x7b988755(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.n nVar) {
        this.f221008e = false;
        this.f221009f = -1;
        this.f221007d = parcel.readString();
        this.f221008e = parcel.readInt() == 1;
        this.f221009f = parcel.readInt();
    }
}
