package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile */
/* loaded from: classes8.dex */
public class C19542xf3901c27 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27> f38795x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.a0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f269895d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f269896e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f269897f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f269898g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f269899h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f269900i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f269901m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f269902n;

    /* renamed from: o, reason: collision with root package name */
    public int f269903o;

    /* renamed from: p, reason: collision with root package name */
    public int f269904p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f269905q;

    /* renamed from: r, reason: collision with root package name */
    public long f269906r;

    public C19542xf3901c27(android.os.Parcel parcel) {
        this.f269895d = parcel.readString();
        this.f269896e = parcel.readString();
        this.f269897f = parcel.readString();
        this.f269898g = parcel.readString();
        this.f269899h = parcel.readString();
        this.f269900i = parcel.readString();
        this.f269901m = parcel.readString();
        this.f269902n = parcel.readString();
        this.f269903o = parcel.readInt();
        this.f269904p = parcel.readInt();
        this.f269905q = parcel.readByte() != 0;
        this.f269906r = parcel.readLong();
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("key", this.f269895d);
            jSONObject.put("pkgId", this.f269896e);
            jSONObject.put("version", this.f269897f);
            jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, this.f269898g);
            jSONObject.put("rid", this.f269899h);
            jSONObject.put("mimeType", this.f269900i);
            jSONObject.put("md5", this.f269901m);
            jSONObject.put("downloadUrl", this.f269902n);
            jSONObject.put("size", this.f269903o);
            jSONObject.put("downloadNetType", this.f269904p);
            jSONObject.put("completeDownload", this.f269905q);
            jSONObject.put("createTime", this.f269906r);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public void b(wz4.c cVar) {
        if (cVar != null) {
            this.f269895d = cVar.f67861x4b6e619a;
            this.f269896e = cVar.f67864x29a55882;
            this.f269897f = cVar.f67867x8987ca93;
            this.f269898g = cVar.f67860xf1e9b966;
            this.f269899h = cVar.f67865x4b6e7c48;
            this.f269900i = cVar.f67863xcac8f733;
            this.f269901m = cVar.f67862x4b6e68b9;
            this.f269902n = cVar.f67858x238eb002;
            this.f269903o = cVar.f67866x22618426;
            this.f269904p = cVar.f67857xd4f0ff8a;
            this.f269905q = cVar.f67855xdf7ba986;
            this.f269906r = cVar.f67856xac3be4e;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f269895d);
        parcel.writeString(this.f269896e);
        parcel.writeString(this.f269897f);
        parcel.writeString(this.f269898g);
        parcel.writeString(this.f269899h);
        parcel.writeString(this.f269900i);
        parcel.writeString(this.f269901m);
        parcel.writeString(this.f269902n);
        parcel.writeInt(this.f269903o);
        parcel.writeInt(this.f269904p);
        parcel.writeByte(this.f269905q ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f269906r);
    }
}
