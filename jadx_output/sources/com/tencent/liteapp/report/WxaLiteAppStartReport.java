package com.tencent.liteapp.report;

/* loaded from: classes15.dex */
public class WxaLiteAppStartReport implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.liteapp.report.WxaLiteAppStartReport> CREATOR = new ld.e();
    public final long A;
    public final long B;
    public int C;
    public long D;
    public long E;
    public long F;
    public long G;
    public com.tencent.mm.plugin.lite.LiteAppCenter.PageShowInfo H;
    public com.tencent.liteapp.gen.LiteAppReporter I;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f45997d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f45998e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f45999f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f46000g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f46001h;

    /* renamed from: i, reason: collision with root package name */
    public long f46002i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f46003m;

    /* renamed from: n, reason: collision with root package name */
    public long f46004n;

    /* renamed from: o, reason: collision with root package name */
    public long f46005o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f46006p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f46007q;

    /* renamed from: r, reason: collision with root package name */
    public final long f46008r;

    /* renamed from: s, reason: collision with root package name */
    public final long f46009s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f46010t;

    /* renamed from: u, reason: collision with root package name */
    public long f46011u;

    /* renamed from: v, reason: collision with root package name */
    public long f46012v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f46013w;

    /* renamed from: x, reason: collision with root package name */
    public long f46014x;

    /* renamed from: y, reason: collision with root package name */
    public long f46015y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f46016z;

    public WxaLiteAppStartReport() {
        this.f45997d = "";
        this.f45998e = "";
        this.f45999f = "";
        this.f46000g = false;
        this.f46001h = false;
        this.f46002i = 0L;
        this.f46003m = false;
        this.f46004n = 0L;
        this.f46005o = 0L;
        this.f46006p = false;
        this.f46007q = false;
        this.f46008r = 0L;
        this.f46009s = 0L;
        this.f46010t = false;
        this.f46011u = 0L;
        this.f46012v = 0L;
        this.f46013w = false;
        this.f46014x = 0L;
        this.f46015y = 0L;
        this.f46016z = false;
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

    public static void a(com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        if (wxaLiteAppStartReport == null || wxaLiteAppStartReport.H == null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.LOAD_HOME_PAGE_SUCCESS);
        } else {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.LOAD_HOME_PAGE_SUCCESS, new ld.f(wxaLiteAppStartReport));
        }
    }

    public java.lang.String b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", this.f45997d);
        jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, this.f45999f);
        jSONObject.put("query", this.f45998e);
        jSONObject.put("preloadEngineCost", this.f46012v);
        jSONObject.put("preloadBaseLibCost", this.f46015y);
        jSONObject.put("isPreloadPage", this.f46016z);
        jSONObject.put("checkCost", this.f46005o);
        jSONObject.put("showPageCost", this.E);
        jSONObject.put("appCost", this.F);
        jSONObject.put("renderPageCost", this.G);
        jSONObject.put("showPageResult", this.C);
        com.tencent.mm.plugin.lite.LiteAppCenter.PageShowInfo pageShowInfo = this.H;
        if (pageShowInfo != null) {
            jSONObject.put("codeCacheSwitch", pageShowInfo.codeCacheSwitch);
            jSONObject.put("codeCacheResult", this.H.codeCacheResult);
            jSONObject.put("compilePageCost", this.H.compilePageCost);
            jSONObject.put("evalPageCost", this.H.evalPageCost);
            jSONObject.put("evalBaseLibCost", this.H.evalBaseLibCost);
            jSONObject.put("hitSnapshotSwitch", this.H.hitSnapshotSwitch);
            jSONObject.put("snapshotRuntimeType", this.H.snapshotRuntimeType);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, this.H.extraInfo);
        }
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f45997d);
        parcel.writeString(this.f45998e);
        parcel.writeString(this.f45999f);
        parcel.writeByte(this.f46000g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46001h ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f46002i);
        parcel.writeByte(this.f46003m ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f46004n);
        parcel.writeLong(this.f46005o);
        parcel.writeByte(this.f46006p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46007q ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f46008r);
        parcel.writeLong(this.f46009s);
        parcel.writeByte(this.f46010t ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f46011u);
        parcel.writeLong(this.f46012v);
        parcel.writeByte(this.f46013w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f46014x);
        parcel.writeLong(this.f46015y);
        parcel.writeByte(this.f46016z ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A);
        parcel.writeLong(this.B);
        parcel.writeInt(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
        parcel.writeLong(this.G);
    }

    public WxaLiteAppStartReport(android.os.Parcel parcel) {
        this.f45997d = "";
        this.f45998e = "";
        this.f45999f = "";
        this.f46000g = false;
        this.f46001h = false;
        this.f46002i = 0L;
        this.f46003m = false;
        this.f46004n = 0L;
        this.f46005o = 0L;
        this.f46006p = false;
        this.f46007q = false;
        this.f46008r = 0L;
        this.f46009s = 0L;
        this.f46010t = false;
        this.f46011u = 0L;
        this.f46012v = 0L;
        this.f46013w = false;
        this.f46014x = 0L;
        this.f46015y = 0L;
        this.f46016z = false;
        this.A = 0L;
        this.B = 0L;
        this.C = 0;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.G = 0L;
        this.H = null;
        this.I = null;
        this.f45997d = parcel.readString();
        this.f45998e = parcel.readString();
        this.f45999f = parcel.readString();
        this.f46000g = parcel.readByte() != 0;
        this.f46001h = parcel.readByte() != 0;
        this.f46002i = parcel.readLong();
        this.f46003m = parcel.readByte() != 0;
        this.f46004n = parcel.readLong();
        this.f46005o = parcel.readLong();
        this.f46006p = parcel.readByte() != 0;
        this.f46007q = parcel.readByte() != 0;
        this.f46008r = parcel.readLong();
        this.f46009s = parcel.readLong();
        this.f46010t = parcel.readByte() != 0;
        this.f46011u = parcel.readLong();
        this.f46012v = parcel.readLong();
        this.f46013w = parcel.readByte() != 0;
        this.f46014x = parcel.readLong();
        this.f46015y = parcel.readLong();
        this.f46016z = parcel.readByte() != 0;
        this.A = parcel.readLong();
        this.B = parcel.readLong();
        this.C = parcel.readInt();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.readLong();
        this.G = parcel.readLong();
    }
}
