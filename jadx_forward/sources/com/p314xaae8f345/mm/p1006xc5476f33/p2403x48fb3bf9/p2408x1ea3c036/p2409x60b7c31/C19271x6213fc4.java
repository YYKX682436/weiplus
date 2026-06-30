package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask */
/* loaded from: classes12.dex */
public class C19271x6213fc4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.C19271x6213fc4> f38720x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.k6();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f6 f263775f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f263776g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f263777h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f263778i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f263779m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f263780n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Runnable f263781o;

    public /* synthetic */ C19271x6213fc4(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.u5 u5Var) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f263776g = parcel.readString();
        this.f263777h = parcel.readString();
        this.f263778i = parcel.readString();
        this.f263779m = parcel.readString();
        this.f263780n = parcel.readByte() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f263776g);
        parcel.writeString(this.f263777h);
        parcel.writeString(this.f263778i);
        parcel.writeString(this.f263779m);
        parcel.writeByte(this.f263780n ? (byte) 1 : (byte) 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f263781o;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.x5) runnable).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadMediaTask", "runInMainProcess");
        if (this.f263775f == null) {
            this.f263775f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j6(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(this.f263776g);
        if (b17 == null) {
            c();
            return;
        }
        int i17 = b17.f264275n;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b17, this.f263777h, this.f263776g, 20301, 202, 2, false, this.f263775f);
        } else if (i17 != 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f263777h, this.f263776g, 20302, 202, 2, false, this.f263775f);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f263777h, this.f263776g, 20302, 202, 2, false, this.f263775f);
        }
    }

    public C19271x6213fc4() {
    }

    private C19271x6213fc4(android.os.Parcel parcel) {
        v(parcel);
    }
}
