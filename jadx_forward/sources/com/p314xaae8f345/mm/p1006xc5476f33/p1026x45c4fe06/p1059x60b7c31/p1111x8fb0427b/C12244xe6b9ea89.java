package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask */
/* loaded from: classes7.dex */
public class C12244xe6b9ea89 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12244xe6b9ea89> f34833x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.u();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f164878f;

    /* renamed from: g, reason: collision with root package name */
    public int f164879g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f164880h;

    /* renamed from: i, reason: collision with root package name */
    public int f164881i;

    /* renamed from: m, reason: collision with root package name */
    public int f164882m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f164883n;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f164878f = parcel.readString();
        this.f164879g = parcel.readInt();
        this.f164880h = parcel.createStringArrayList();
        this.f164881i = parcel.readInt();
        this.f164882m = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f164878f);
        parcel.writeInt(this.f164879g);
        parcel.writeStringList(this.f164880h);
        parcel.writeInt(this.f164881i);
        parcel.writeInt(this.f164882m);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f164883n;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.r) runnable).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o Bi;
        java.lang.Object[] t17;
        if (nd.f.a(oe.a.class) == null) {
            Bi = null;
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).getClass();
            Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Bi();
        }
        if (Bi == null) {
            c();
            return;
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o.class) {
            t17 = Bi.t(this.f164879g, this.f164878f);
        }
        this.f164880h = (java.util.ArrayList) t17[0];
        this.f164881i = (int) java.lang.Math.ceil(((java.lang.Integer) t17[1]).doubleValue() / 1000.0d);
        this.f164882m = (int) java.lang.Math.ceil(((java.lang.Integer) t17[2]).doubleValue() / 1000.0d);
        c();
    }
}
