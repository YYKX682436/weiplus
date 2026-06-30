package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiSetClipboardDataWC$ReportClipBoardTask */
/* loaded from: classes15.dex */
class C11940x6073573e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11940x6073573e> f33672x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ad();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f160150f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160151g;

    /* renamed from: h, reason: collision with root package name */
    public int f160152h;

    public C11940x6073573e(java.lang.String str, java.lang.String str2, int i17) {
        this.f160150f = str;
        this.f160151g = str2;
        this.f160152h = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160150f = parcel.readString();
        this.f160151g = parcel.readString();
        this.f160152h = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160150f);
        parcel.writeString(this.f160151g);
        parcel.writeInt(this.f160152h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        w04.a.INSTANCE.xd(5, this.f160152h, this.f160150f, this.f160151g);
    }

    public C11940x6073573e(android.os.Parcel parcel) {
        v(parcel);
    }
}
