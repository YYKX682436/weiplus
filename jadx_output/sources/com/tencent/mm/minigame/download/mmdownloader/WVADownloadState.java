package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes7.dex */
public class WVADownloadState extends com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState {
    public static final android.os.Parcelable.Creator<com.tencent.mm.minigame.download.mmdownloader.WVADownloadState> CREATOR = new com.tencent.mm.minigame.download.mmdownloader.n();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f69034m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f69035n;

    /* renamed from: o, reason: collision with root package name */
    public int f69036o;

    /* renamed from: p, reason: collision with root package name */
    public int f69037p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f69038q;

    /* renamed from: r, reason: collision with root package name */
    public int f69039r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f69040s;

    public WVADownloadState(android.os.Parcel parcel, com.tencent.mm.minigame.download.mmdownloader.n nVar) {
        super(parcel);
        this.f69034m = parcel.readString();
        this.f69035n = parcel.readString();
        this.f69036o = parcel.readInt();
        this.f69037p = parcel.readInt();
        this.f69038q = parcel.readByte() != 0;
        this.f69039r = parcel.readInt();
        this.f69040s = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState
    public org.json.JSONObject a() {
        org.json.JSONObject a17 = super.a();
        try {
            a17.put("moduleName", this.f69034m);
            if (this.f69038q) {
                a17.put(com.tencent.tinker.loader.SystemClassLoaderAdder.CHECK_DEX_FIELD, true);
                a17.put("oldVersion", this.f69039r);
            }
            java.lang.String str = this.f69040s;
            if (str != null) {
                a17.put("errorReason", str);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WVADownloadState", "toJSONObject error: %s", e17);
        }
        return a17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.appdownload.AppBrandDownloadState, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f69034m);
        parcel.writeString(this.f69035n);
        parcel.writeInt(this.f69036o);
        parcel.writeInt(this.f69037p);
        parcel.writeByte(this.f69038q ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f69039r);
        parcel.writeString(this.f69040s);
    }
}
