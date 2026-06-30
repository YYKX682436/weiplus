package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiAppBrandNFCBase$CheckIsSupportHCETask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase$CheckIsSupportHCETask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.nfc.g();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.nfc.h f82392f;

    /* renamed from: g, reason: collision with root package name */
    public int f82393g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f82394h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f82395i;

    public JsApiAppBrandNFCBase$CheckIsSupportHCETask(com.tencent.mm.plugin.appbrand.jsapi.nfc.h hVar) {
        this(hVar, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f82393g = parcel.readInt();
        this.f82394h = parcel.readString();
        this.f82395i = 1 == parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f82393g);
        parcel.writeString(this.f82394h);
        parcel.writeInt(this.f82395i ? 1 : 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        x();
        com.tencent.mm.plugin.appbrand.jsapi.nfc.h hVar = this.f82392f;
        if (hVar != null) {
            int i17 = this.f82393g;
            java.lang.String str = this.f82394h;
            hVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAppBrandNFCBase", "checkIsSupport resultCallback errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
            if (i17 == 0) {
                com.tencent.mm.plugin.appbrand.jsapi.nfc.f fVar = hVar.f82402g;
                if (fVar != null) {
                    fVar.onResult(i17, str);
                    return;
                }
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = "unknown error";
            }
            com.tencent.mm.plugin.appbrand.jsapi.nfc.f fVar2 = hVar.f82402g;
            if (fVar2 != null) {
                fVar2.onResult(i17, str);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        if (!fd1.d.b()) {
            this.f82393g = 13000;
            this.f82394h = "not support NFC";
        } else if (!fd1.d.a()) {
            this.f82393g = 13002;
            this.f82394h = "not support HCE";
        } else if (!this.f82395i || fd1.d.c()) {
            this.f82393g = 0;
            this.f82394h = "support HCE and system NFC switch is opened";
        } else {
            this.f82393g = 13001;
            this.f82394h = "system NFC switch not opened";
        }
        c();
    }

    public JsApiAppBrandNFCBase$CheckIsSupportHCETask(com.tencent.mm.plugin.appbrand.jsapi.nfc.h hVar, boolean z17) {
        this.f82392f = null;
        this.f82392f = hVar;
        this.f82395i = z17;
    }

    public JsApiAppBrandNFCBase$CheckIsSupportHCETask(android.os.Parcel parcel) {
        this.f82392f = null;
        v(parcel);
    }
}
