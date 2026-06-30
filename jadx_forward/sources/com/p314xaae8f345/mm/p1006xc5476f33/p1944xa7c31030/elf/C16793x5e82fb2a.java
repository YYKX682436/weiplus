package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf;

/* renamed from: com.tencent.mm.plugin.performance.elf.ElfCheckResponse */
/* loaded from: classes5.dex */
public class C16793x5e82fb2a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16793x5e82fb2a> f37719x681a0c0c = new xp3.f();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f234501d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f234502e;

    /* renamed from: f, reason: collision with root package name */
    public final long f234503f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f234504g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f234505h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f234506i;

    /* renamed from: m, reason: collision with root package name */
    public final long f234507m;

    /* renamed from: n, reason: collision with root package name */
    public final long f234508n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.Bundle f234509o;

    public C16793x5e82fb2a(boolean z17, long j17, boolean z18, boolean z19, java.lang.String str, java.lang.String str2, long j18) {
        this.f234504g = z19;
        this.f234501d = z18;
        this.f234506i = str;
        this.f234505h = str2;
        this.f234508n = j18;
        this.f234503f = j17;
        this.f234502e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m67527x9616526c() {
        return this.f234501d + "," + this.f234504g + "," + this.f234507m + "," + this.f234506i + "," + this.f234505h + "," + this.f234508n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f234501d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f234502e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f234503f);
        parcel.writeByte(this.f234504g ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f234505h);
        parcel.writeString(this.f234506i);
        parcel.writeLong(this.f234507m);
        parcel.writeLong(this.f234508n);
        parcel.writeBundle(this.f234509o);
    }

    public C16793x5e82fb2a(android.os.Parcel parcel) {
        this.f234501d = parcel.readByte() != 0;
        this.f234502e = parcel.readByte() != 0;
        this.f234503f = parcel.readLong();
        this.f234504g = parcel.readByte() != 0;
        this.f234505h = parcel.readString();
        this.f234506i = parcel.readString();
        this.f234507m = parcel.readLong();
        this.f234508n = parcel.readLong();
        this.f234509o = parcel.readBundle();
    }
}
