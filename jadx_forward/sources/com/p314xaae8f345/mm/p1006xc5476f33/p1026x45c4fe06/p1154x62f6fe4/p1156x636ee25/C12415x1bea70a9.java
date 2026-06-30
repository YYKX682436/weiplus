package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25;

/* renamed from: com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$IPCQueryPlaying */
/* loaded from: classes7.dex */
class C12415x1bea70a9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.C12415x1bea70a9> f35098x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.a();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f167287f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f167288g = false;

    public C12415x1bea70a9() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f167287f = parcel.readString();
        this.f167288g = parcel.readByte() != 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f167287f);
        parcel.writeByte(this.f167288g ? (byte) 1 : (byte) 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        this.f167288g = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a.c(this.f167287f);
    }

    public C12415x1bea70a9(android.os.Parcel parcel) {
        v(parcel);
    }
}
