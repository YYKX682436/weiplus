package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* renamed from: com.tencent.mm.plugin.appbrand.ReportStorageSizeTask */
/* loaded from: classes7.dex */
public class C11544x7f79c0cd extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11544x7f79c0cd> f33371x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.od();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f156410f;

    public static void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11544x7f79c0cd c11544x7f79c0cd) {
        java.lang.Integer valueOf;
        long j17;
        c11544x7f79c0cd.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Bi();
        if (Bi == null) {
            return;
        }
        int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.p.f157830a.a(c11544x7f79c0cd.f156410f);
        if (a17 != 1) {
            oe.a aVar = (oe.a) nd.f.a(oe.a.class);
            java.lang.String str = c11544x7f79c0cd.f156410f;
            valueOf = java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) aVar).b(str, a17, w81.a.f525339a.a(str, gm0.j1.b().h())).K(c11544x7f79c0cd.f156410f));
        } else {
            valueOf = java.lang.Integer.valueOf(Bi.K(c11544x7f79c0cd.f156410f));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[6];
        java.lang.String str2 = c11544x7f79c0cd.f156410f;
        objArr[0] = str2;
        objArr[1] = "";
        objArr[2] = "";
        objArr[3] = valueOf;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.e(str2));
        com.p314xaae8f345.mm.vfs.r6[] r6VarArr = null;
        com.p314xaae8f345.mm.vfs.r6[] H = (r6Var.m() && r6Var.y()) ? r6Var.H(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.w()) : null;
        long j18 = 0;
        if (H == null || H.length <= 0) {
            j17 = 0;
        } else {
            j17 = 0;
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : H) {
                j17 += r6Var2.C();
            }
        }
        objArr[4] = java.lang.Long.valueOf(j17);
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.e(c11544x7f79c0cd.f156410f));
        if (r6Var3.m() && r6Var3.y()) {
            r6VarArr = r6Var3.H(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.v());
        }
        if (r6VarArr != null && r6VarArr.length > 0) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var4 : r6VarArr) {
                j18 += r6Var4.C();
            }
        }
        objArr[5] = java.lang.Long.valueOf(j18);
        g0Var.d(14073, objArr);
    }

    public void C(java.lang.String str) {
        this.f156410f = str;
        d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f156410f = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f156410f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.nd(this));
    }
}
