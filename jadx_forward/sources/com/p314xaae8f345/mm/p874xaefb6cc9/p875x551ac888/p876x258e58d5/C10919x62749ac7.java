package com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5;

/* renamed from: com.tencent.mm.minigame.download.mmdownloader.WVADownloadState */
/* loaded from: classes7.dex */
public class C10919x62749ac7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11958x9d7bd883 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7> f29745x681a0c0c = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.n();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f150567m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f150568n;

    /* renamed from: o, reason: collision with root package name */
    public int f150569o;

    /* renamed from: p, reason: collision with root package name */
    public int f150570p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f150571q;

    /* renamed from: r, reason: collision with root package name */
    public int f150572r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f150573s;

    public C10919x62749ac7(android.os.Parcel parcel, com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.n nVar) {
        super(parcel);
        this.f150567m = parcel.readString();
        this.f150568n = parcel.readString();
        this.f150569o = parcel.readInt();
        this.f150570p = parcel.readInt();
        this.f150571q = parcel.readByte() != 0;
        this.f150572r = parcel.readInt();
        this.f150573s = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11958x9d7bd883
    public org.json.JSONObject a() {
        org.json.JSONObject a17 = super.a();
        try {
            a17.put("moduleName", this.f150567m);
            if (this.f150571q) {
                a17.put(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.f55428xd4f9e3fb, true);
                a17.put("oldVersion", this.f150572r);
            }
            java.lang.String str = this.f150573s;
            if (str != null) {
                a17.put("errorReason", str);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WVADownloadState", "toJSONObject error: %s", e17);
        }
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11958x9d7bd883, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f150567m);
        parcel.writeString(this.f150568n);
        parcel.writeInt(this.f150569o);
        parcel.writeInt(this.f150570p);
        parcel.writeByte(this.f150571q ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f150572r);
        parcel.writeString(this.f150573s);
    }
}
