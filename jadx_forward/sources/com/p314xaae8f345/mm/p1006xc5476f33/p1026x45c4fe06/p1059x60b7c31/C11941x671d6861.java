package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest */
/* loaded from: classes7.dex */
final class C11941x671d6861 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11941x671d6861> f33673x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.de();

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 f160153d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f160154e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f160155f;

    /* renamed from: g, reason: collision with root package name */
    private int f160156g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f160157h;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f160158i;

    /* renamed from: m, reason: collision with root package name */
    private int f160159m;

    /* renamed from: n, reason: collision with root package name */
    private java.lang.String f160160n;

    /* renamed from: o, reason: collision with root package name */
    private int f160161o;

    /* renamed from: p, reason: collision with root package name */
    private java.lang.String f160162p;

    /* renamed from: q, reason: collision with root package name */
    private java.lang.String f160163q;

    public C11941x671d6861() {
        this.f160157h = "";
        this.f160158i = "";
        this.f160159m = 0;
        this.f160160n = "";
        this.f160161o = 0;
        this.f160162p = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11942x1bf5e0f3.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: oneShotForeground */
    public boolean mo50401x34ca7fe3() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f160153d, i17);
        parcel.writeString(this.f160154e);
        parcel.writeString(this.f160155f);
        parcel.writeInt(this.f160156g);
        parcel.writeInt(this.f160159m);
        parcel.writeString(this.f160157h);
        parcel.writeString(this.f160158i);
        parcel.writeString(this.f160160n);
        parcel.writeInt(this.f160161o);
        parcel.writeString(this.f160162p);
        parcel.writeString(this.f160163q);
    }

    public C11941x671d6861(android.os.Parcel parcel) {
        this.f160157h = "";
        this.f160158i = "";
        this.f160159m = 0;
        this.f160160n = "";
        this.f160161o = 0;
        this.f160162p = "";
        this.f160153d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11941x671d6861.class.getClassLoader());
        this.f160154e = parcel.readString();
        this.f160155f = parcel.readString();
        this.f160156g = parcel.readInt();
        this.f160159m = parcel.readInt();
        this.f160157h = parcel.readString();
        this.f160158i = parcel.readString();
        this.f160160n = parcel.readString();
        this.f160161o = parcel.readInt();
        this.f160162p = parcel.readString();
        this.f160163q = parcel.readString();
    }
}
