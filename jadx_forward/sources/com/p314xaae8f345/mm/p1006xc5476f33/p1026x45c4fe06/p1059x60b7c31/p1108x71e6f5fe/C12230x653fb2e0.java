package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask */
/* loaded from: classes7.dex */
public class C12230x653fb2e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12230x653fb2e0> f34747x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.o();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f164469f;

    /* renamed from: g, reason: collision with root package name */
    public int f164470g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f164471h;

    /* renamed from: i, reason: collision with root package name */
    public int f164472i;

    /* renamed from: m, reason: collision with root package name */
    public int f164473m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f164474n;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f164469f = parcel.readString();
        this.f164470g = parcel.readInt();
        this.f164471h = parcel.readString();
        this.f164472i = parcel.readInt();
        this.f164473m = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f164469f);
        parcel.writeInt(this.f164470g);
        parcel.writeString(this.f164471h);
        parcel.writeInt(this.f164472i);
        parcel.writeInt(this.f164473m);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f164474n;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.l) runnable).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        w60.k wi6 = ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).wi(this.f164469f, null, 36, 0, this.f164472i, this.f164473m, null, o45.cg.a(), new byte[0]);
        com.p314xaae8f345.mm.p944x882e457a.z2.d(((com.p314xaae8f345.mm.p957x53236a1b.k0) wi6).f152889e, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.n(this, wi6), true);
    }
}
