package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase$CheckIsSupportHCETask */
/* loaded from: classes7.dex */
public class C12190x3bdfcc33 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.C12190x3bdfcc33> f34552x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.g();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.h f163925f;

    /* renamed from: g, reason: collision with root package name */
    public int f163926g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f163927h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f163928i;

    public C12190x3bdfcc33(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.h hVar) {
        this(hVar, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f163926g = parcel.readInt();
        this.f163927h = parcel.readString();
        this.f163928i = 1 == parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f163926g);
        parcel.writeString(this.f163927h);
        parcel.writeInt(this.f163928i ? 1 : 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        super.y();
        x();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.h hVar = this.f163925f;
        if (hVar != null) {
            int i17 = this.f163926g;
            java.lang.String str = this.f163927h;
            hVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAppBrandNFCBase", "checkIsSupport resultCallback errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.f fVar = hVar.f163935g;
                if (fVar != null) {
                    fVar.mo51151x57429edc(i17, str);
                    return;
                }
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = "unknown error";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.f fVar2 = hVar.f163935g;
            if (fVar2 != null) {
                fVar2.mo51151x57429edc(i17, str);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        if (!fd1.d.b()) {
            this.f163926g = 13000;
            this.f163927h = "not support NFC";
        } else if (!fd1.d.a()) {
            this.f163926g = 13002;
            this.f163927h = "not support HCE";
        } else if (!this.f163928i || fd1.d.c()) {
            this.f163926g = 0;
            this.f163927h = "support HCE and system NFC switch is opened";
        } else {
            this.f163926g = 13001;
            this.f163927h = "system NFC switch not opened";
        }
        c();
    }

    public C12190x3bdfcc33(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.h hVar, boolean z17) {
        this.f163925f = null;
        this.f163925f = hVar;
        this.f163928i = z17;
    }

    public C12190x3bdfcc33(android.os.Parcel parcel) {
        this.f163925f = null;
        v(parcel);
    }
}
