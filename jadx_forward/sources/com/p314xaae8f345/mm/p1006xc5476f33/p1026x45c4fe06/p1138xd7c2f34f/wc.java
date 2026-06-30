package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class wc implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g6 f166874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f166877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc f166878e;

    public wc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc xcVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g6 g6Var, java.lang.String str, java.lang.String str2, int i17) {
        this.f166878e = xcVar;
        this.f166874a = g6Var;
        this.f166875b = str;
        this.f166876c = str2;
        this.f166877d = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0
    public void a(int i17, java.lang.String str, boolean z17, r45.bl blVar, r45.j14 j14Var) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(j14Var != null ? j14Var.f459026f : 0);
        objArr[3] = j14Var != null ? j14Var.f459025e : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch fail, CGI errCode:%d, errMsg:%s, backendErrno:%d, backendErrmsg:%s", objArr);
        if (z17) {
            return;
        }
        this.f166878e.Di();
        this.f166874a.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.b(null, this.f166875b, null, this.f166876c, -3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0
    public void b(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, r45.bl blVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc xcVar = this.f166878e;
        xcVar.Di();
        if (z18 || xcVar.f166953d) {
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g6 g6Var = this.f166874a;
        java.lang.String str3 = this.f166876c;
        java.lang.String str4 = this.f166875b;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, invalid businessType");
            g6Var.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.b(null, str4, null, str3, -3);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1069;
        c12559xbdae8559.f169324g = str4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158856e = str4;
        c11812xa040dc98.f158855d = 4;
        c11812xa040dc98.f158863o = str3;
        c11812xa040dc98.f158862n = 5;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.e7(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null, str, str2, this.f166877d, -1, c12559xbdae8559, c11812xa040dc98, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch success");
            g6Var.d();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, launch fail");
            g6Var.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.b(null, str4, null, str3, -3);
        }
    }
}
