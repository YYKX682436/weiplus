package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask */
/* loaded from: classes7.dex */
public class C12066xe058977c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c> f34043x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.m();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f162017f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f162018g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162019h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f162020i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f162021m;

    public C12066xe058977c() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f162017f = parcel.readString();
        this.f162019h = parcel.readString();
        this.f162020i = parcel.readString();
        this.f162018g = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162017f);
        parcel.writeString(this.f162019h);
        parcel.writeString(this.f162020i);
        parcel.writeString(this.f162018g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f162021m;
        if (runnable != null) {
            runnable.run();
        }
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        if (!gm0.j1.b().f354787q) {
            c();
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f162019h, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(this.f162019h);
            z3Var.mo43621x7650bebc(0);
            z3Var.M1(this.f162020i);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(z3Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChattingTask", "%s save to contact_table", this.f162019h);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f162018g)) {
            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ri(this.f162018g, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.k(this));
        }
        ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ri(this.f162019h, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.l(this));
    }

    public C12066xe058977c(android.os.Parcel parcel) {
        v(parcel);
    }
}
