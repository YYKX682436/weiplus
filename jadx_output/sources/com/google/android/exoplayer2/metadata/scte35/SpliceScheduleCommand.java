package com.google.android.exoplayer2.metadata.scte35;

/* loaded from: classes15.dex */
public final class SpliceScheduleCommand extends com.google.android.exoplayer2.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand> CREATOR = new c9.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f44157d;

    public SpliceScheduleCommand(java.util.List list) {
        this.f44157d = java.util.Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.util.List list = this.f44157d;
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            c9.h hVar = (c9.h) list.get(i18);
            parcel.writeLong(hVar.f39715a);
            parcel.writeByte(hVar.f39716b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f39717c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f39718d ? (byte) 1 : (byte) 0);
            java.util.List list2 = hVar.f39720f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i19 = 0; i19 < size2; i19++) {
                c9.g gVar = (c9.g) list2.get(i19);
                parcel.writeInt(gVar.f39713a);
                parcel.writeLong(gVar.f39714b);
            }
            parcel.writeLong(hVar.f39719e);
            parcel.writeByte(hVar.f39721g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f39722h);
            parcel.writeInt(hVar.f39723i);
            parcel.writeInt(hVar.f39724j);
            parcel.writeInt(hVar.f39725k);
        }
    }

    public SpliceScheduleCommand(android.os.Parcel parcel, c9.f fVar) {
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            arrayList.add(new c9.h(parcel));
        }
        this.f44157d = java.util.Collections.unmodifiableList(arrayList);
    }
}
