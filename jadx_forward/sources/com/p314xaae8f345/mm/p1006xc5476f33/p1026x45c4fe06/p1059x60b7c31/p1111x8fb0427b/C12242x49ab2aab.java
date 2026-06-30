package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask */
/* loaded from: classes7.dex */
public class C12242x49ab2aab extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12242x49ab2aab> f34831x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.b();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f164873f;

    /* renamed from: g, reason: collision with root package name */
    public int f164874g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f164875h;

    public C12242x49ab2aab() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f164873f = parcel.readString();
        this.f164874g = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f164873f);
        parcel.writeInt(this.f164874g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f164875h;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.d) runnable).run();
        }
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
            c();
        } else {
            this.f164874g = Bi.K(this.f164873f);
            c();
        }
    }

    public C12242x49ab2aab(android.os.Parcel parcel) {
        v(parcel);
    }
}
