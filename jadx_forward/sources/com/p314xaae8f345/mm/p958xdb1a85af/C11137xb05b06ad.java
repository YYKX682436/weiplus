package com.p314xaae8f345.mm.p958xdb1a85af;

/* renamed from: com.tencent.mm.modelsns.SnsAdClick */
/* loaded from: classes4.dex */
public class C11137xb05b06ad implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad> f32569x681a0c0c = new m21.c();

    /* renamed from: d, reason: collision with root package name */
    public int f152999d;

    /* renamed from: e, reason: collision with root package name */
    public int f153000e;

    /* renamed from: f, reason: collision with root package name */
    public long f153001f;

    /* renamed from: g, reason: collision with root package name */
    public int f153002g;

    /* renamed from: h, reason: collision with root package name */
    public int f153003h;

    /* renamed from: i, reason: collision with root package name */
    public long f153004i;

    /* renamed from: m, reason: collision with root package name */
    public int f153005m;

    /* renamed from: n, reason: collision with root package name */
    public int f153006n;

    /* renamed from: o, reason: collision with root package name */
    public long f153007o;

    /* renamed from: p, reason: collision with root package name */
    public long f153008p;

    /* renamed from: q, reason: collision with root package name */
    public final int f153009q;

    /* renamed from: r, reason: collision with root package name */
    public long f153010r;

    /* renamed from: s, reason: collision with root package name */
    public long f153011s;

    /* renamed from: t, reason: collision with root package name */
    public int f153012t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f153013u;

    public C11137xb05b06ad() {
        this.f153000e = 0;
        this.f153002g = 0;
        this.f153003h = 0;
        this.f153004i = 0L;
        this.f153005m = 0;
        this.f153006n = 0;
        this.f153007o = 0L;
        this.f153008p = 0L;
        this.f153009q = 0;
        this.f153010r = 0L;
        this.f153011s = 0L;
        this.f153012t = 0;
        this.f153013u = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f152999d);
        parcel.writeInt(this.f153000e);
        parcel.writeLong(this.f153001f);
        parcel.writeInt(this.f153002g);
        parcel.writeInt(this.f153003h);
        parcel.writeInt(this.f153005m);
        parcel.writeInt(this.f153006n);
        parcel.writeLong(this.f153004i);
        parcel.writeLong(this.f153008p);
        parcel.writeLong(this.f153010r);
        parcel.writeLong(this.f153011s);
        parcel.writeInt(this.f153012t);
        parcel.writeString(this.f153013u);
    }

    public C11137xb05b06ad(int i17, int i18, long j17, int i19, int i27) {
        this(i17, i18, j17, i19, i27, 0, 0, 0);
    }

    public C11137xb05b06ad(int i17, int i18, long j17, int i19, int i27, int i28) {
        this(i17, i18, j17, i19, i27, 0, 0, i28);
    }

    public C11137xb05b06ad(int i17, int i18, long j17, int i19, int i27, int i28, int i29, int i37) {
        this.f153004i = 0L;
        this.f153007o = 0L;
        this.f153008p = 0L;
        this.f153009q = 0;
        this.f153010r = 0L;
        this.f153011s = 0L;
        this.f153012t = 0;
        this.f153013u = "";
        this.f152999d = i17;
        this.f153000e = i18;
        this.f153001f = j17;
        this.f153002g = i19;
        this.f153003h = i27;
        this.f153005m = i28;
        this.f153006n = i29;
        this.f153009q = i37;
        this.f153004i = java.lang.System.currentTimeMillis();
    }
}
