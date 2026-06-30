package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* renamed from: com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams */
/* loaded from: classes8.dex */
public class C15873x8354f860 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15873x8354f860> f36923x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.q();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15871x7b988755 f221020d;

    public C15873x8354f860(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.q qVar) {
        this.f221020d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15871x7b988755) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15871x7b988755.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f221020d, i17);
    }
}
