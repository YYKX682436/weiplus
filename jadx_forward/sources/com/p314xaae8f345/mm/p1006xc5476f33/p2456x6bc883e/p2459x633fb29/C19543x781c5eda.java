package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgVersion */
/* loaded from: classes8.dex */
public class C19543x781c5eda implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda> f38796x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.v0();
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f269907d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f269908e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f269909f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f269910g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f269911h;

    /* renamed from: i, reason: collision with root package name */
    public long f269912i;

    /* renamed from: m, reason: collision with root package name */
    public long f269913m;

    /* renamed from: n, reason: collision with root package name */
    public int f269914n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f269915o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f269916p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f269917q;

    /* renamed from: r, reason: collision with root package name */
    public int f269918r;

    /* renamed from: s, reason: collision with root package name */
    public int f269919s;

    /* renamed from: t, reason: collision with root package name */
    public long f269920t;

    /* renamed from: u, reason: collision with root package name */
    public long f269921u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f269922v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f269923w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f269924x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f269925y;

    /* renamed from: z, reason: collision with root package name */
    public int f269926z;

    public C19543x781c5eda(android.os.Parcel parcel) {
        this.f269907d = parcel.readString();
        this.f269908e = parcel.readString();
        this.f269909f = parcel.readString();
        this.f269910g = parcel.readString();
        this.f269911h = parcel.readByte() != 0;
        this.f269912i = parcel.readLong();
        this.f269913m = parcel.readLong();
        this.f269914n = parcel.readInt();
        this.f269915o = parcel.readString();
        this.f269916p = parcel.readString();
        this.f269917q = parcel.readString();
        this.f269918r = parcel.readInt();
        this.f269919s = parcel.readInt();
        this.f269920t = parcel.readLong();
        this.f269921u = parcel.readLong();
        this.f269922v = parcel.readString();
        this.f269923w = parcel.readByte() != 0;
        this.f269924x = parcel.readByte() != 0;
        this.f269925y = parcel.readByte() != 0;
        this.f269926z = parcel.readInt();
        this.A = parcel.readInt();
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", this.f269908e);
            jSONObject.put("version", this.f269909f);
            jSONObject.put("pkgPath", this.f269910g);
            jSONObject.put("disableWvCache", this.f269911h);
            jSONObject.put("clearPkgTime", this.f269912i);
            jSONObject.put("checkIntervalTime", this.f269913m);
            jSONObject.put("packMethod", this.f269914n);
            jSONObject.put("domain", this.f269915o);
            jSONObject.put("md5", this.f269916p);
            jSONObject.put("downloadUrl", this.f269917q);
            jSONObject.put("pkgSize", this.f269918r);
            jSONObject.put("downloadNetType", this.f269919s);
            jSONObject.put("nextCheckTime", this.f269920t);
            jSONObject.put("charset", this.f269922v);
            jSONObject.put("bigPackageReady", this.f269923w);
            jSONObject.put("preloadFilesReady", this.f269924x);
            jSONObject.put("preloadFilesAtomic", this.f269925y);
            jSONObject.put("totalDownloadCount", this.f269926z);
            jSONObject.put("downloadTriggerType", this.A);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public void b(wz4.e eVar) {
        if (eVar != null) {
            this.f269907d = eVar.f67980x29a55882;
            this.f269908e = eVar.f67963x28d45f97;
            this.f269909f = eVar.f67986x8987ca93;
            this.f269910g = eVar.f67981x55b471cc;
            this.f269911h = eVar.f67971x721c7dc0;
            this.f269912i = eVar.f67968xebe402d1;
            this.f269913m = eVar.f67967xb432ae55;
            this.f269914n = eVar.f67978x98b09cbf;
            this.f269915o = eVar.f67972xf6c703a9;
            this.f269916p = eVar.f67976x4b6e68b9;
            this.f269917q = eVar.f67975x238eb002;
            this.f269918r = eVar.f67982x55b5eda8;
            this.f269919s = eVar.f67973xd4f0ff8a;
            this.f269920t = eVar.f67977xa5c53bd;
            this.f269921u = eVar.f67969xac3be4e;
            this.f269922v = eVar.f67966xa0a00f07;
            this.f269923w = eVar.f67965xe96d84d8;
            this.f269924x = eVar.f67984xc5b53450;
            this.f269925y = eVar.f67983xd4c8d11e;
            this.f269926z = eVar.f67985xcf3a6fe8;
            this.A = eVar.f67974x5fb864a5;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f269907d);
        parcel.writeString(this.f269908e);
        parcel.writeString(this.f269909f);
        parcel.writeString(this.f269910g);
        parcel.writeByte(this.f269911h ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f269912i);
        parcel.writeLong(this.f269913m);
        parcel.writeInt(this.f269914n);
        parcel.writeString(this.f269915o);
        parcel.writeString(this.f269916p);
        parcel.writeString(this.f269917q);
        parcel.writeInt(this.f269918r);
        parcel.writeInt(this.f269919s);
        parcel.writeLong(this.f269920t);
        parcel.writeLong(this.f269921u);
        parcel.writeString(this.f269922v);
        parcel.writeByte(this.f269923w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f269924x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f269925y ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f269926z);
        parcel.writeInt(this.A);
    }
}
