package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo */
/* loaded from: classes9.dex */
public class C19095xa9bd27fa implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19095xa9bd27fa> f38675x681a0c0c = new at4.r();

    /* renamed from: d, reason: collision with root package name */
    public int f261160d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19094x6e1bfd9 f261161e;

    public C19095xa9bd27fa(android.os.Parcel parcel) {
        this.f261160d = parcel.readInt();
        this.f261161e = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19094x6e1bfd9) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19094x6e1bfd9.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f261160d);
        parcel.writeParcelable(this.f261161e, i17);
    }
}
