package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f159255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159259h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f159260i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159261m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159262n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f159263o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f159264p;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c0 c0Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, l81.b1 b1Var, java.lang.String str5, java.lang.String str6, int i18, boolean z17) {
        this.f159255d = i17;
        this.f159256e = str;
        this.f159257f = str2;
        this.f159258g = str3;
        this.f159259h = str4;
        this.f159260i = b1Var;
        this.f159261m = str5;
        this.f159262n = str6;
        this.f159263o = i18;
        this.f159264p = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f159255d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(i17) && !android.text.TextUtils.isEmpty(this.f159256e) && !android.text.TextUtils.isEmpty(this.f159257f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().k(this.f159258g, this.f159255d, this.f159256e, this.f159257f, 0L, 0L);
        }
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(i17);
        java.lang.String str = this.f159258g;
        if (a17) {
            java.lang.String str2 = this.f159259h;
            if (!android.text.TextUtils.isEmpty(str2)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5.class)).z0(str, i17, str2);
            }
        }
        l81.b1 b1Var = this.f159260i;
        b1Var.f398547b = str;
        b1Var.f398545a = this.f159261m;
        b1Var.f398549c = i17;
        b1Var.f398555f = this.f159262n;
        b1Var.f398551d = this.f159263o;
        b1Var.f398565k = mc1.c.f72820x366c91de;
        b1Var.f398546a0 = this.f159264p;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
    }
}
