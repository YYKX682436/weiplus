package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$GetLocalResourceInfoTask */
/* loaded from: classes7.dex */
public class C19260x107b106 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19260x107b106> f38717x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.b0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f263656f;

    /* renamed from: g, reason: collision with root package name */
    public int f263657g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f263658h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f263659i;

    private C19260x107b106() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f263656f = parcel.readString();
        this.f263657g = parcel.readInt();
        this.f263658h = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f263656f);
        parcel.writeInt(this.f263657g);
        parcel.writeString(this.f263658h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f263659i;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.a0) runnable).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        int i17 = this.f263657g;
        if (i17 == 1) {
            this.f263658h = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.e(this.f263656f);
        } else if (i17 == 2) {
            this.f263658h = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(this.f263656f);
        }
        c();
    }

    public /* synthetic */ C19260x107b106(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.a0 a0Var) {
        this();
    }
}
