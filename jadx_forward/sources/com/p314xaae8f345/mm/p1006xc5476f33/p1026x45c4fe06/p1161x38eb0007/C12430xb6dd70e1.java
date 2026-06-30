package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007;

/* renamed from: com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannelList */
/* loaded from: classes7.dex */
public class C12430xb6dd70e1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12430xb6dd70e1> f35118x681a0c0c = new oh1.k1();

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f167548d;

    public C12430xb6dd70e1() {
        this.f167548d = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            parcel.writeParcelableList(this.f167548d, i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3[] c12429xdd32d5a3Arr = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3[this.f167548d.size()];
        this.f167548d.toArray(c12429xdd32d5a3Arr);
        parcel.writeParcelableArray(c12429xdd32d5a3Arr, i17);
    }

    public C12430xb6dd70e1(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f167548d = arrayList;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            parcel.readParcelableList(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3.class.getClassLoader());
            return;
        }
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3.class.getClassLoader());
        if (readParcelableArray == null || readParcelableArray.length <= 0) {
            return;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3 c12429xdd32d5a3 : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3[]) java.util.Arrays.copyOf(readParcelableArray, readParcelableArray.length, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.C12429xdd32d5a3[].class)) {
            this.f167548d.add(c12429xdd32d5a3);
        }
    }
}
