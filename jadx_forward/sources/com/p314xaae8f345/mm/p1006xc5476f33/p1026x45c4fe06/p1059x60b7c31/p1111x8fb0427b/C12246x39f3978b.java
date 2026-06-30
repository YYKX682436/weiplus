package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask */
/* loaded from: classes7.dex */
public class C12246x39f3978b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12246x39f3978b> f34835x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.d0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f164895f;

    /* renamed from: g, reason: collision with root package name */
    public int f164896g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f164897h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f164895f = parcel.readString();
        this.f164896g = parcel.readInt();
        this.f164897h = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f164895f);
        parcel.writeInt(this.f164896g);
        parcel.writeString(this.f164897h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o Bi;
        if (nd.f.a(oe.a.class) == null) {
            Bi = null;
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).getClass();
            Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Bi();
        }
        if (Bi == null) {
            return;
        }
        Bi.q(this.f164896g, this.f164895f, this.f164897h);
    }
}
