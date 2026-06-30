package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* renamed from: com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo */
/* loaded from: classes12.dex */
class C17194xb20112dd implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17194xb20112dd> f37897x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f239654d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f239655e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f239656f;

    public C17194xb20112dd(java.util.ArrayList arrayList, boolean z17, boolean z18) {
        this.f239654d = new java.util.ArrayList();
        this.f239654d = arrayList;
        this.f239655e = z17;
        this.f239656f = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f239654d);
        parcel.writeInt(this.f239655e ? 1 : 0);
        parcel.writeInt(this.f239656f ? 1 : 0);
    }

    public C17194xb20112dd(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f239654d = arrayList;
        parcel.readTypedList(arrayList, com.p314xaae8f345.p542x3306d5.smc.C4582x424c344.f19530x681a0c0c);
        this.f239655e = parcel.readInt() == 1;
        this.f239656f = parcel.readInt() == 1;
    }
}
