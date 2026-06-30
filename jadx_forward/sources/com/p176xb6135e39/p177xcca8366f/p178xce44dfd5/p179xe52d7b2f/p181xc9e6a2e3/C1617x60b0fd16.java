package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand */
/* loaded from: classes15.dex */
public final class C1617x60b0fd16 extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.AbstractC1616xa2fa5d0f {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p181xc9e6a2e3.C1617x60b0fd16> f5319x681a0c0c = new c9.c();

    /* renamed from: d, reason: collision with root package name */
    public final long f125677d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f125678e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f125679f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f125680g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f125681h;

    /* renamed from: i, reason: collision with root package name */
    public final long f125682i;

    /* renamed from: m, reason: collision with root package name */
    public final long f125683m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f125684n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f125685o;

    /* renamed from: p, reason: collision with root package name */
    public final long f125686p;

    /* renamed from: q, reason: collision with root package name */
    public final int f125687q;

    /* renamed from: r, reason: collision with root package name */
    public final int f125688r;

    /* renamed from: s, reason: collision with root package name */
    public final int f125689s;

    public C1617x60b0fd16(long j17, boolean z17, boolean z18, boolean z19, boolean z27, long j18, long j19, java.util.List list, boolean z28, long j27, int i17, int i18, int i19) {
        this.f125677d = j17;
        this.f125678e = z17;
        this.f125679f = z18;
        this.f125680g = z19;
        this.f125681h = z27;
        this.f125682i = j18;
        this.f125683m = j19;
        this.f125684n = java.util.Collections.unmodifiableList(list);
        this.f125685o = z28;
        this.f125686p = j27;
        this.f125687q = i17;
        this.f125688r = i18;
        this.f125689s = i19;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f125677d);
        parcel.writeByte(this.f125678e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f125679f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f125680g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f125681h ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f125682i);
        parcel.writeLong(this.f125683m);
        java.util.List list = this.f125684n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i18 = 0; i18 < size; i18++) {
            c9.d dVar = (c9.d) list.get(i18);
            parcel.writeInt(dVar.f121243a);
            parcel.writeLong(dVar.f121244b);
            parcel.writeLong(dVar.f121245c);
        }
        parcel.writeByte(this.f125685o ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f125686p);
        parcel.writeInt(this.f125687q);
        parcel.writeInt(this.f125688r);
        parcel.writeInt(this.f125689s);
    }

    public C1617x60b0fd16(android.os.Parcel parcel, c9.c cVar) {
        this.f125677d = parcel.readLong();
        this.f125678e = parcel.readByte() == 1;
        this.f125679f = parcel.readByte() == 1;
        this.f125680g = parcel.readByte() == 1;
        this.f125681h = parcel.readByte() == 1;
        this.f125682i = parcel.readLong();
        this.f125683m = parcel.readLong();
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 < readInt; i17++) {
            arrayList.add(new c9.d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f125684n = java.util.Collections.unmodifiableList(arrayList);
        this.f125685o = parcel.readByte() == 1;
        this.f125686p = parcel.readLong();
        this.f125687q = parcel.readInt();
        this.f125688r = parcel.readInt();
        this.f125689s = parcel.readInt();
    }
}
