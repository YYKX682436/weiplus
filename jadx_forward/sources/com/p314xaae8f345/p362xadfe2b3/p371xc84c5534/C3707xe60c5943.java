package com.p314xaae8f345.p362xadfe2b3.p371xc84c5534;

/* renamed from: com.tencent.liteapp.report.WxaLiteAppStartReport */
/* loaded from: classes15.dex */
public class C3707xe60c5943 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943> f14304x681a0c0c = new ld.e();
    public final long A;
    public final long B;
    public int C;
    public long D;
    public long E;
    public long F;
    public long G;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageShowInfo H;
    public com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 I;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f127530d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f127531e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f127532f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f127533g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f127534h;

    /* renamed from: i, reason: collision with root package name */
    public long f127535i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f127536m;

    /* renamed from: n, reason: collision with root package name */
    public long f127537n;

    /* renamed from: o, reason: collision with root package name */
    public long f127538o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f127539p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f127540q;

    /* renamed from: r, reason: collision with root package name */
    public final long f127541r;

    /* renamed from: s, reason: collision with root package name */
    public final long f127542s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f127543t;

    /* renamed from: u, reason: collision with root package name */
    public long f127544u;

    /* renamed from: v, reason: collision with root package name */
    public long f127545v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f127546w;

    /* renamed from: x, reason: collision with root package name */
    public long f127547x;

    /* renamed from: y, reason: collision with root package name */
    public long f127548y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f127549z;

    public C3707xe60c5943() {
        this.f127530d = "";
        this.f127531e = "";
        this.f127532f = "";
        this.f127533g = false;
        this.f127534h = false;
        this.f127535i = 0L;
        this.f127536m = false;
        this.f127537n = 0L;
        this.f127538o = 0L;
        this.f127539p = false;
        this.f127540q = false;
        this.f127541r = 0L;
        this.f127542s = 0L;
        this.f127543t = false;
        this.f127544u = 0L;
        this.f127545v = 0L;
        this.f127546w = false;
        this.f127547x = 0L;
        this.f127548y = 0L;
        this.f127549z = false;
        this.A = 0L;
        this.B = 0L;
        this.C = 0;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.G = 0L;
        this.H = null;
        this.I = null;
    }

    public static void a(com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943) {
        if (c3707xe60c5943 == null || c3707xe60c5943.H == null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.LOAD_HOME_PAGE_SUCCESS);
        } else {
            abstractC3700xe41a2874.mo28895x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.LOAD_HOME_PAGE_SUCCESS, new ld.f(c3707xe60c5943));
        }
    }

    public java.lang.String b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", this.f127530d);
        jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, this.f127532f);
        jSONObject.put("query", this.f127531e);
        jSONObject.put("preloadEngineCost", this.f127545v);
        jSONObject.put("preloadBaseLibCost", this.f127548y);
        jSONObject.put("isPreloadPage", this.f127549z);
        jSONObject.put("checkCost", this.f127538o);
        jSONObject.put("showPageCost", this.E);
        jSONObject.put("appCost", this.F);
        jSONObject.put("renderPageCost", this.G);
        jSONObject.put("showPageResult", this.C);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageShowInfo pageShowInfo = this.H;
        if (pageShowInfo != null) {
            jSONObject.put("codeCacheSwitch", pageShowInfo.f37297x681f1d29);
            jSONObject.put("codeCacheResult", this.H.f37296x65712e12);
            jSONObject.put("compilePageCost", this.H.f37298x715c824f);
            jSONObject.put("evalPageCost", this.H.f37300xfe405fb8);
            jSONObject.put("evalBaseLibCost", this.H.f37299x24cd2da5);
            jSONObject.put("hitSnapshotSwitch", this.H.f37302x56f6388b);
            jSONObject.put("snapshotRuntimeType", this.H.f37303xb1c876ce);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, this.H.f37301xf0e1e4de);
        }
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f127530d);
        parcel.writeString(this.f127531e);
        parcel.writeString(this.f127532f);
        parcel.writeByte(this.f127533g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f127534h ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f127535i);
        parcel.writeByte(this.f127536m ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f127537n);
        parcel.writeLong(this.f127538o);
        parcel.writeByte(this.f127539p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f127540q ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f127541r);
        parcel.writeLong(this.f127542s);
        parcel.writeByte(this.f127543t ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f127544u);
        parcel.writeLong(this.f127545v);
        parcel.writeByte(this.f127546w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f127547x);
        parcel.writeLong(this.f127548y);
        parcel.writeByte(this.f127549z ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A);
        parcel.writeLong(this.B);
        parcel.writeInt(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
        parcel.writeLong(this.G);
    }

    public C3707xe60c5943(android.os.Parcel parcel) {
        this.f127530d = "";
        this.f127531e = "";
        this.f127532f = "";
        this.f127533g = false;
        this.f127534h = false;
        this.f127535i = 0L;
        this.f127536m = false;
        this.f127537n = 0L;
        this.f127538o = 0L;
        this.f127539p = false;
        this.f127540q = false;
        this.f127541r = 0L;
        this.f127542s = 0L;
        this.f127543t = false;
        this.f127544u = 0L;
        this.f127545v = 0L;
        this.f127546w = false;
        this.f127547x = 0L;
        this.f127548y = 0L;
        this.f127549z = false;
        this.A = 0L;
        this.B = 0L;
        this.C = 0;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.G = 0L;
        this.H = null;
        this.I = null;
        this.f127530d = parcel.readString();
        this.f127531e = parcel.readString();
        this.f127532f = parcel.readString();
        this.f127533g = parcel.readByte() != 0;
        this.f127534h = parcel.readByte() != 0;
        this.f127535i = parcel.readLong();
        this.f127536m = parcel.readByte() != 0;
        this.f127537n = parcel.readLong();
        this.f127538o = parcel.readLong();
        this.f127539p = parcel.readByte() != 0;
        this.f127540q = parcel.readByte() != 0;
        this.f127541r = parcel.readLong();
        this.f127542s = parcel.readLong();
        this.f127543t = parcel.readByte() != 0;
        this.f127544u = parcel.readLong();
        this.f127545v = parcel.readLong();
        this.f127546w = parcel.readByte() != 0;
        this.f127547x = parcel.readLong();
        this.f127548y = parcel.readLong();
        this.f127549z = parcel.readByte() != 0;
        this.A = parcel.readLong();
        this.B = parcel.readLong();
        this.C = parcel.readInt();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.readLong();
        this.G = parcel.readLong();
    }
}
