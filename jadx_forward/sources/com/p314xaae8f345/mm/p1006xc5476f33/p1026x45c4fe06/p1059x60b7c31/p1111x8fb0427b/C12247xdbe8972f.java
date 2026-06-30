package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask */
/* loaded from: classes7.dex */
public class C12247xdbe8972f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12247xdbe8972f> f34836x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.l0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f164898f;

    /* renamed from: g, reason: collision with root package name */
    public int f164899g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f164900h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f164901i;

    /* renamed from: m, reason: collision with root package name */
    public int f164902m;

    /* renamed from: n, reason: collision with root package name */
    public int f164903n;

    /* renamed from: o, reason: collision with root package name */
    public int f164904o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f164905p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f164906q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f164907r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f164908s = android.os.Process.myPid() + java.lang.String.valueOf(super.hashCode());

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f164909t;

    public final void B(java.lang.String str) {
        int length = str.length();
        int i17 = this.f164902m;
        if (length != this.f164903n + i17 + this.f164904o) {
            return;
        }
        this.f164905p = str.substring(0, i17);
        int i18 = this.f164902m;
        this.f164906q = str.substring(i18, this.f164903n + i18);
        int i19 = this.f164902m;
        int i27 = this.f164903n;
        this.f164907r = str.substring(i19 + i27, i19 + i27 + this.f164904o);
    }

    public void C(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.a(str, str2, str3) <= 102400) {
            this.f164901i = false;
            this.f164905p = str;
            this.f164906q = str2;
            this.f164907r = str3;
            return;
        }
        this.f164902m = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.a(str);
        this.f164903n = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.a(str2);
        this.f164904o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.a(str3);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.e(this.f164908s, str, str2, str3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetStorageTask", e17.getMessage());
        }
        this.f164901i = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f164898f = parcel.readString();
        this.f164899g = parcel.readInt();
        this.f164901i = parcel.readByte() != 0;
        this.f164902m = parcel.readInt();
        this.f164903n = parcel.readInt();
        this.f164904o = parcel.readInt();
        this.f164905p = parcel.readString();
        this.f164906q = parcel.readString();
        this.f164907r = parcel.readString();
        this.f164909t = parcel.readString();
        this.f164908s = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f164898f);
        parcel.writeInt(this.f164899g);
        parcel.writeByte(this.f164901i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f164902m);
        parcel.writeInt(this.f164903n);
        parcel.writeInt(this.f164904o);
        parcel.writeString(this.f164905p);
        parcel.writeString(this.f164906q);
        parcel.writeString(this.f164907r);
        parcel.writeString(this.f164909t);
        parcel.writeString(this.f164908s);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f164900h;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.h0) runnable).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o Bi;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 l17;
        if (this.f164901i) {
            try {
                try {
                    B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.c(this.f164908s));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetStorageTask", e17.getMessage());
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.b(this.f164908s);
            }
        }
        if (nd.f.a(oe.a.class) == null) {
            Bi = null;
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).getClass();
            Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Bi();
        }
        if (Bi == null) {
            this.f164909t = "fail:internal error get DB fail";
            this.f164905p = null;
            this.f164906q = null;
            this.f164907r = null;
            c();
            return;
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o.class) {
            l17 = Bi.l(this.f164899g, this.f164898f, this.f164905p, this.f164906q, this.f164907r);
        }
        this.f164909t = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.d(l17);
        this.f164905p = null;
        this.f164906q = null;
        this.f164907r = null;
        c();
    }
}
