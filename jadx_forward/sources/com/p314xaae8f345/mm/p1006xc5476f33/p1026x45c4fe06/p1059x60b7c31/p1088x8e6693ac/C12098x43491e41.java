package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewRequest */
/* loaded from: classes7.dex */
public class C12098x43491e41 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12098x43491e41> f34161x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.l0();

    /* renamed from: d, reason: collision with root package name */
    public int f162434d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f162435e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f162436f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f162437g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f162438h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f162439i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f162440m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f162441n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f162442o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f162443p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f162444q = 0;

    /* renamed from: r, reason: collision with root package name */
    public float f162445r = 0.0f;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f162446s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f162447t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f162448u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f162449v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f162450w;

    public C12098x43491e41() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12100xc6f8f713.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: readParcel */
    public void mo50318xdc053d3f(android.os.Parcel parcel) {
        this.f162434d = parcel.readInt();
        this.f162435e = parcel.readInt() == 1;
        this.f162436f = parcel.readInt() == 1;
        this.f162437g = parcel.readInt();
        this.f162438h = parcel.readInt();
        this.f162439i = parcel.readInt() == 1;
        this.f162440m = parcel.readInt() == 1;
        this.f162441n = parcel.readInt() == 1;
        this.f162442o = parcel.readString();
        this.f162443p = parcel.readInt() == 1;
        this.f162444q = parcel.readInt();
        this.f162445r = parcel.readFloat();
        this.f162446s = parcel.readString();
        this.f162447t = parcel.readString();
        this.f162448u = parcel.readString();
        this.f162449v = parcel.readString();
        this.f162450w = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f162434d);
        parcel.writeInt(this.f162435e ? 1 : 0);
        parcel.writeInt(this.f162436f ? 1 : 0);
        parcel.writeInt(this.f162437g);
        parcel.writeInt(this.f162438h);
        parcel.writeInt(this.f162439i ? 1 : 0);
        parcel.writeInt(this.f162440m ? 1 : 0);
        parcel.writeInt(this.f162441n ? 1 : 0);
        parcel.writeString(this.f162442o);
        parcel.writeInt(this.f162443p ? 1 : 0);
        parcel.writeInt(this.f162444q);
        parcel.writeFloat(this.f162445r);
        parcel.writeString(this.f162446s);
        parcel.writeString(this.f162447t);
        parcel.writeString(this.f162448u);
        parcel.writeString(this.f162449v);
        parcel.writeString(this.f162450w);
    }

    public C12098x43491e41(android.os.Parcel parcel) {
        mo50318xdc053d3f(parcel);
    }
}
