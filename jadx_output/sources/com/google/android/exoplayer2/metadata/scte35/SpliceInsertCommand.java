package com.google.android.exoplayer2.metadata.scte35;

/* loaded from: classes15.dex */
public final class SpliceInsertCommand extends com.google.android.exoplayer2.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand> CREATOR = new c9.c();

    /* renamed from: d, reason: collision with root package name */
    public final long f44144d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f44145e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f44146f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f44147g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f44148h;

    /* renamed from: i, reason: collision with root package name */
    public final long f44149i;

    /* renamed from: m, reason: collision with root package name */
    public final long f44150m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f44151n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f44152o;

    /* renamed from: p, reason: collision with root package name */
    public final long f44153p;

    /* renamed from: q, reason: collision with root package name */
    public final int f44154q;

    /* renamed from: r, reason: collision with root package name */
    public final int f44155r;

    /* renamed from: s, reason: collision with root package name */
    public final int f44156s;

    public SpliceInsertCommand(long j17, boolean z17, boolean z18, boolean z19, boolean z27, long j18, long j19, java.util.List list, boolean z28, long j27, int i17, int i18, int i19) {
        this.f44144d = j17;
        this.f44145e = z17;
        this.f44146f = z18;
        this.f44147g = z19;
        this.f44148h = z27;
        this.f44149i = j18;
        this.f44150m = j19;
        this.f44151n = java.util.Collections.unmodifiableList(list);
        this.f44152o = z28;
        this.f44153p = j27;
        this.f44154q = i17;
        this.f44155r = i18;
        this.f44156s = i19;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f44144d);
        parcel.writeByte(this.f44145e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f44146f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f44147g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f44148h ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f44149i);
        parcel.writeLong(this.f44150m);
        java.util.List list = this.f44151n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            c9.d dVar = (c9.d) list.get(i18);
            parcel.writeInt(dVar.f39710a);
            parcel.writeLong(dVar.f39711b);
            parcel.writeLong(dVar.f39712c);
        }
        parcel.writeByte(this.f44152o ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f44153p);
        parcel.writeInt(this.f44154q);
        parcel.writeInt(this.f44155r);
        parcel.writeInt(this.f44156s);
    }

    public SpliceInsertCommand(android.os.Parcel parcel, c9.c cVar) {
        this.f44144d = parcel.readLong();
        this.f44145e = parcel.readByte() == 1;
        this.f44146f = parcel.readByte() == 1;
        this.f44147g = parcel.readByte() == 1;
        this.f44148h = parcel.readByte() == 1;
        this.f44149i = parcel.readLong();
        this.f44150m = parcel.readLong();
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            arrayList.add(new c9.d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f44151n = java.util.Collections.unmodifiableList(arrayList);
        this.f44152o = parcel.readByte() == 1;
        this.f44153p = parcel.readLong();
        this.f44154q = parcel.readInt();
        this.f44155r = parcel.readInt();
        this.f44156s = parcel.readInt();
    }
}
