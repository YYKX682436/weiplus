package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask */
/* loaded from: classes7.dex */
public class C11918x149daf43 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11918x149daf43> f33653x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z5();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f160050f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160051g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f160052h;

    /* renamed from: i, reason: collision with root package name */
    public int f160053i;

    /* renamed from: m, reason: collision with root package name */
    public int f160054m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f160055n;

    public C11918x149daf43() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160050f = parcel.readString();
        this.f160051g = parcel.readString();
        this.f160052h = parcel.readString();
        this.f160053i = parcel.readInt();
        this.f160054m = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160050f);
        parcel.writeString(this.f160051g);
        parcel.writeString(this.f160052h);
        parcel.writeInt(this.f160053i);
        parcel.writeInt(this.f160054m);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f160055n;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w5) runnable).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        if (gm0.j1.b().f354787q) {
            android.util.Pair y07 = ((t81.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.b.class)).y0("appId", this.f160050f, 4, this.f160054m);
            if (((java.lang.Boolean) y07.first).booleanValue()) {
                r81.f.INSTANCE.b(((java.lang.Integer) y07.second).intValue(), 166);
            }
            k91.r1.a(this.f160050f, this.f160053i, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y5(this), !((java.lang.Boolean) y07.first).booleanValue());
        }
    }

    public C11918x149daf43(android.os.Parcel parcel) {
        v(parcel);
    }
}
