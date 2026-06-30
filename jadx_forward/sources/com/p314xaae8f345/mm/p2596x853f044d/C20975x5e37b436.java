package com.p314xaae8f345.mm.p2596x853f044d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps */
/* loaded from: classes12.dex */
public class C20975x5e37b436 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2596x853f044d.C20975x5e37b436> f39172x681a0c0c = new com.p314xaae8f345.mm.p2596x853f044d.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f273870d = java.util.Collections.synchronizedList(new java.util.ArrayList(16));

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f273871e = java.util.Collections.synchronizedList(new java.util.ArrayList(32));

    public C20975x5e37b436(com.p314xaae8f345.mm.p2596x853f044d.a aVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(-33554431);
        java.util.List<com.p314xaae8f345.mm.p2596x853f044d.e> list = this.f273870d;
        parcel.writeInt(list.size());
        for (com.p314xaae8f345.mm.p2596x853f044d.e eVar : list) {
            parcel.writeLong(eVar.f273872a);
            parcel.writeLong(eVar.f273873b);
            parcel.writeLong(eVar.f273874c);
        }
        java.util.List<com.p314xaae8f345.mm.p2596x853f044d.f> list2 = this.f273871e;
        parcel.writeInt(list2.size());
        for (com.p314xaae8f345.mm.p2596x853f044d.f fVar : list2) {
            parcel.writeInt(fVar.f273875a);
            parcel.writeString(fVar.f273876b);
            parcel.writeString(fVar.f273877c);
        }
    }
}
