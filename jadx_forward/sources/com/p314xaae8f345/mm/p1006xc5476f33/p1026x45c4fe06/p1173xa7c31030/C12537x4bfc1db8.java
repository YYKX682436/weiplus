package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030;

/* renamed from: com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$SetAppPerformanceModeTask */
/* loaded from: classes7.dex */
class C12537x4bfc1db8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.C12537x4bfc1db8> f35145x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.g();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f168855f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f168856g;

    private C12537x4bfc1db8() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f168855f = parcel.readString();
        this.f168856g = parcel.readByte() != 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f168855f);
        parcel.writeByte(this.f168856g ? (byte) 1 : (byte) 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().P2(this.f168855f + "_PerformancePanelEnabled", this.f168856g ? "1" : "0");
    }
}
