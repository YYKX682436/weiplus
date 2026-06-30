package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand */
/* loaded from: classes15.dex */
public final class C1619x5d0d9678 extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.AbstractC1616xa2fa5d0f {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1619x5d0d9678> f5321x681a0c0c = new c9.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f125690d;

    public C1619x5d0d9678(java.util.List list) {
        this.f125690d = java.util.Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.util.List list = this.f125690d;
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            c9.h hVar = (c9.h) list.get(i18);
            parcel.writeLong(hVar.f121248a);
            parcel.writeByte(hVar.f121249b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f121250c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f121251d ? (byte) 1 : (byte) 0);
            java.util.List list2 = hVar.f121253f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i19 = 0; i19 < size2; i19++) {
                c9.g gVar = (c9.g) list2.get(i19);
                parcel.writeInt(gVar.f121246a);
                parcel.writeLong(gVar.f121247b);
            }
            parcel.writeLong(hVar.f121252e);
            parcel.writeByte(hVar.f121254g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f121255h);
            parcel.writeInt(hVar.f121256i);
            parcel.writeInt(hVar.f121257j);
            parcel.writeInt(hVar.f121258k);
        }
    }

    public C1619x5d0d9678(android.os.Parcel parcel, c9.f fVar) {
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            arrayList.add(new c9.h(parcel));
        }
        this.f125690d = java.util.Collections.unmodifiableList(arrayList);
    }
}
