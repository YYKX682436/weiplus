package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.SampleTask1 */
/* loaded from: classes.dex */
public class C11898x6be8b7a2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11898x6be8b7a2> f33633x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.y0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f159925f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f159926g;

    public C11898x6be8b7a2(java.lang.String str) {
        this.f159925f = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f159925f = parcel.readString();
        this.f159926g = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f159925f);
        parcel.writeString(this.f159926g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SampleTask", this.f159926g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SampleTask", this.f159925f);
        this.f159926g = "String from Main Process";
        c();
    }

    public C11898x6be8b7a2(android.os.Parcel parcel) {
        v(parcel);
    }
}
