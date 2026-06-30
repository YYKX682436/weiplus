package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25;

/* renamed from: com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$StopBackgroundMusicTask */
/* loaded from: classes11.dex */
class C12416xdf328581 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.C12416xdf328581> f35099x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.c();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f167289f;

    public C12416xdf328581() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f167289f = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f167289f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        boolean d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicClientService", "runInMainProcess");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a;
        java.lang.String str = hVar.f167294a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !str.equals(this.f167289f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicClientService", "appid not match cannot operate, preAppId:%s, appId:%s", str, this.f167289f);
            c();
            return;
        }
        if (!hVar.c(this.f167289f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicClientService", "appid not match cannot operate, can't not stop, preAppId:%s, appId:%s", str, this.f167289f);
            c();
            return;
        }
        if ((hVar.f167297d == null || hVar.f167298e == null) ? false : true) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.p3) hVar.f167298e).getClass();
            d17 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).zj();
        } else {
            d17 = b21.n.d();
        }
        if (d17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicClientService", "stop music ok");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMusicClientService", "stop music fail");
        }
        c();
    }

    public C12416xdf328581(android.os.Parcel parcel) {
        v(parcel);
    }
}
