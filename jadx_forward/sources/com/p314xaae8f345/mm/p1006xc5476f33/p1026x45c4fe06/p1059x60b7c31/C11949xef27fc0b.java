package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask */
/* loaded from: classes4.dex */
public class C11949xef27fc0b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11949xef27fc0b> f33678x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.we();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160184f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160185g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160186h;

    /* renamed from: i, reason: collision with root package name */
    public int f160187i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f160188m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160189n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160190o;

    public C11949xef27fc0b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, int i18, boolean z17) {
        this.f160184f = k0Var;
        this.f160185g = lVar;
        this.f160186h = i17;
        this.f160187i = i18;
        this.f160188m = z17;
        this.f160190o = lVar.mo48798x74292566();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160187i = parcel.readInt();
        this.f160188m = parcel.readByte() != 0;
        this.f160189n = parcel.readByte() != 0;
        this.f160190o = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f160187i);
        parcel.writeByte(this.f160188m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f160189n ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f160190o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f160189n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160184f;
        int i17 = this.f160186h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160185g;
        if (z17) {
            lVar.a(i17, k0Var.o("ok"));
        } else {
            lVar.a(i17, k0Var.o("fail"));
        }
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        long a17 = c01.id.a();
        long j17 = a17 / 1000;
        if (a17 == 0) {
            a17 = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ju6 ju6Var = new r45.ju6();
        lVar.f152197a = ju6Var;
        lVar.f152198b = new r45.ku6();
        lVar.f152199c = "/cgi-bin/mmoc-bin/hardware/uploadminiappstep";
        lVar.f152200d = 1949;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        ju6Var.f459651d = this.f160190o;
        ju6Var.f459652e = this.f160187i;
        ju6Var.f459653f = this.f160188m;
        ju6Var.f459654g = (int) (a17 / 1000);
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ve(this), true);
    }

    public C11949xef27fc0b(android.os.Parcel parcel) {
        v(parcel);
    }
}
