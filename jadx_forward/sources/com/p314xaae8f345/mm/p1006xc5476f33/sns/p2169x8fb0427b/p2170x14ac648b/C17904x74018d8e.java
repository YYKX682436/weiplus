package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask */
/* loaded from: classes4.dex */
public class C17904x74018d8e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.C17904x74018d8e> f38290x681a0c0c = new za4.m();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f246538f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f246539g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f246540h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f246541i;

    public C17904x74018d8e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        this.f246538f = parcel.readString();
        this.f246539g = parcel.readString();
        this.f246540h = parcel.readString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeToParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        parcel.writeString(this.f246538f);
        parcel.writeString(this.f246539g);
        parcel.writeString(this.f246540h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeToParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("runInClientProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        java.lang.Runnable runnable = this.f246541i;
        if (runnable != null) {
            runnable.run();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runInClientProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("runInMainProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        if (!gm0.j1.b().f354787q) {
            c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runInMainProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f246539g, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(this.f246539g);
            z3Var.mo43621x7650bebc(0);
            z3Var.M1(this.f246540h);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(z3Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageChattingTask", "%s save to contact_table", this.f246539g);
        }
        ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ri(this.f246539g, new za4.l(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runInMainProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    public C17904x74018d8e(android.os.Parcel parcel) {
        v(parcel);
    }
}
