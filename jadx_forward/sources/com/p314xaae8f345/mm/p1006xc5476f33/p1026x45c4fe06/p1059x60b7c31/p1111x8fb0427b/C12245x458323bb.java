package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask */
/* loaded from: classes7.dex */
public class C12245x458323bb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12245x458323bb> f34834x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.w();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f164884f;

    /* renamed from: g, reason: collision with root package name */
    public int f164885g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f164886h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f164887i;

    /* renamed from: m, reason: collision with root package name */
    public int f164888m;

    /* renamed from: n, reason: collision with root package name */
    public int f164889n;

    /* renamed from: o, reason: collision with root package name */
    public int f164890o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f164891p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f164892q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f164893r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f164894s;

    public final void B(java.lang.String str) {
        int length = str.length();
        int i17 = this.f164889n;
        if (length != this.f164890o + i17) {
            return;
        }
        this.f164892q = str.substring(0, i17);
        int i18 = this.f164889n;
        this.f164893r = str.substring(i18, this.f164890o + i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f164884f = parcel.readString();
        this.f164885g = parcel.readInt();
        this.f164887i = parcel.readByte() != 0;
        this.f164888m = parcel.readInt();
        this.f164889n = parcel.readInt();
        this.f164890o = parcel.readInt();
        this.f164891p = parcel.readString();
        this.f164892q = parcel.readString();
        this.f164893r = parcel.readString();
        this.f164894s = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f164884f);
        parcel.writeInt(this.f164885g);
        parcel.writeByte(this.f164887i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f164888m);
        parcel.writeInt(this.f164889n);
        parcel.writeInt(this.f164890o);
        parcel.writeString(this.f164891p);
        parcel.writeString(this.f164892q);
        parcel.writeString(this.f164893r);
        parcel.writeString(this.f164894s);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        if (this.f164887i) {
            try {
                try {
                    B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.c(this.f164894s));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetStorageTask", e17.getMessage());
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.b(this.f164894s);
            }
        }
        java.lang.Runnable runnable = this.f164886h;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.o) runnable).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        if (((oe.a) nd.f.a(oe.a.class)) == null) {
            c();
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Bi();
        if (Bi == null) {
            c();
            return;
        }
        java.lang.Object[] o17 = Bi.o(this.f164885g, this.f164884f, this.f164891p);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1) o17[0]) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NONE) {
            java.lang.String str = (java.lang.String) o17[1];
            java.lang.String str2 = (java.lang.String) o17[2];
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.a(str, str2) > 102400) {
                this.f164889n = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.a(str);
                this.f164890o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.a(str2);
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.e(this.f164894s, str, str2);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetStorageTask", e17.getMessage());
                }
                this.f164887i = true;
            } else {
                this.f164887i = false;
                this.f164892q = str;
                this.f164893r = str2;
            }
        }
        c();
    }
}
