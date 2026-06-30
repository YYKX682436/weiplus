package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.CreExtInfo */
/* loaded from: classes9.dex */
public class C19094x6e1bfd9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19094x6e1bfd9> f38674x681a0c0c = new at4.q();

    /* renamed from: d, reason: collision with root package name */
    public int f261156d;

    /* renamed from: e, reason: collision with root package name */
    public int f261157e;

    /* renamed from: f, reason: collision with root package name */
    public int f261158f;

    /* renamed from: g, reason: collision with root package name */
    public int f261159g;

    public C19094x6e1bfd9(android.os.Parcel parcel) {
        this.f261156d = parcel.readInt();
        this.f261157e = parcel.readInt();
        this.f261158f = parcel.readInt();
        this.f261159g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f261156d);
        parcel.writeInt(this.f261157e);
        parcel.writeInt(this.f261158f);
        parcel.writeInt(this.f261159g);
    }
}
