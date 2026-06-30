package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam */
/* loaded from: classes15.dex */
public class C12420xb1146e9c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c> f35103x681a0c0c = new lh1.d();

    /* renamed from: d, reason: collision with root package name */
    public int f167368d;

    /* renamed from: e, reason: collision with root package name */
    public int f167369e;

    /* renamed from: f, reason: collision with root package name */
    public int f167370f;

    /* renamed from: g, reason: collision with root package name */
    public int f167371g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f167372h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f167373i;

    /* renamed from: m, reason: collision with root package name */
    public int f167374m;

    /* renamed from: n, reason: collision with root package name */
    public double f167375n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f167376o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f167377p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.e f167378q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.l f167379r;

    public C12420xb1146e9c() {
        this.f167368d = 0;
        this.f167369e = 0;
        this.f167370f = 0;
        this.f167371g = 0;
        this.f167374m = 0;
        this.f167375n = 0.0d;
        this.f167376o = "";
        this.f167377p = "";
        this.f167378q = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.e.MIC;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f167368d);
        parcel.writeInt(this.f167369e);
        parcel.writeInt(this.f167370f);
        parcel.writeInt(this.f167371g);
        parcel.writeString(this.f167372h);
        parcel.writeString(this.f167373i);
        parcel.writeInt(this.f167374m);
        parcel.writeDouble(this.f167375n);
        parcel.writeString(this.f167376o);
        parcel.writeString(this.f167377p);
        parcel.writeInt(this.f167378q.ordinal());
    }

    public C12420xb1146e9c(android.os.Parcel parcel) {
        this.f167368d = 0;
        this.f167369e = 0;
        this.f167370f = 0;
        this.f167371g = 0;
        this.f167374m = 0;
        this.f167375n = 0.0d;
        this.f167376o = "";
        this.f167377p = "";
        this.f167378q = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.e.MIC;
        this.f167368d = parcel.readInt();
        this.f167369e = parcel.readInt();
        this.f167370f = parcel.readInt();
        this.f167371g = parcel.readInt();
        this.f167372h = parcel.readString();
        this.f167373i = parcel.readString();
        this.f167374m = parcel.readInt();
        this.f167375n = parcel.readDouble();
        this.f167376o = parcel.readString();
        this.f167377p = parcel.readString();
        this.f167378q = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.e.m51967xcee59d22()[parcel.readInt()];
    }
}
