package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask */
/* loaded from: classes.dex */
public class C12016x7c0046c7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.C12016x7c0046c7> f33892x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.a();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161390f;

    /* renamed from: g, reason: collision with root package name */
    public final int f161391g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.b f161392h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f161393i;

    /* renamed from: m, reason: collision with root package name */
    public int f161394m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f161395n;

    /* renamed from: o, reason: collision with root package name */
    public int f161396o;

    public C12016x7c0046c7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.b bVar) {
        this.f161390f = null;
        this.f161391g = -1;
        this.f161393i = false;
        this.f161394m = -1;
        this.f161395n = "not returned";
        this.f161396o = -1;
        this.f161390f = lVar;
        this.f161391g = i17;
        this.f161392h = bVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f161393i = parcel.readByte() != 0;
        this.f161394m = parcel.readInt();
        this.f161395n = parcel.readString();
        this.f161396o = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeByte(this.f161393i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f161394m);
        parcel.writeString(this.f161395n);
        parcel.writeInt(this.f161396o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        super.y();
        java.util.HashMap hashMap = new java.util.HashMap(3);
        hashMap.put("errCode", java.lang.Integer.valueOf(this.f161394m));
        hashMap.put("libVersionCode", java.lang.Integer.valueOf(this.f161396o));
        int i17 = this.f161394m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.b bVar = this.f161392h;
        int i18 = this.f161391g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161390f;
        if (i17 == 0) {
            lVar.a(i18, bVar.p("ok", hashMap));
        } else {
            lVar.a(i18, bVar.p("fail " + this.f161395n, hashMap));
        }
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5607x1be3864e c5607x1be3864e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5607x1be3864e();
        c5607x1be3864e.e();
        am.bg bgVar = c5607x1be3864e.f135933g;
        boolean z17 = bgVar.f87784a;
        this.f161393i = z17;
        this.f161394m = bgVar.f87785b;
        this.f161395n = bgVar.f87786c;
        this.f161396o = bgVar.f87787d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetIsSupportFaceTask", "hy: is support: %b, errCode: %d, errMsg: %s, ilbVersion: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f161394m), this.f161395n, java.lang.Integer.valueOf(this.f161396o));
        c();
    }

    public C12016x7c0046c7(android.os.Parcel parcel) {
        this.f161390f = null;
        this.f161391g = -1;
        this.f161393i = false;
        this.f161394m = -1;
        this.f161395n = "not returned";
        this.f161396o = -1;
        v(parcel);
    }
}
