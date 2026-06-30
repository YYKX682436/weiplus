package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class tc implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166718c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f166719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f166720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f166721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc f166722g;

    public tc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc xcVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, android.content.Context context, int i18) {
        this.f166722g = xcVar;
        this.f166716a = str;
        this.f166717b = str2;
        this.f166718c = str3;
        this.f166719d = i17;
        this.f166720e = context;
        this.f166721f = i18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0
    public void a(int i17, java.lang.String str, boolean z17, r45.bl blVar, r45.j14 j14Var) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(j14Var != null ? j14Var.f459026f : 0);
        objArr[3] = j14Var != null ? j14Var.f459025e : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch fail, CGI errCode:%d, errMsg:%s, backendErrno:%d, backendErrmsg:%s", objArr);
        if (z17) {
            return;
        }
        this.f166722g.Di();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.e(this.f166716a, null, -2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0
    public void b(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, r45.bl blVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc xcVar = this.f166722g;
        xcVar.Di();
        if (z18 || xcVar.f166953d) {
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        java.lang.String str3 = this.f166716a;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, invalid businessType");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.e(str3, null, -4);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1055;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str4 = this.f166717b;
        sb6.append(fp.s0.a(str4 == null ? "" : str4));
        sb6.append(":");
        java.lang.String str5 = this.f166718c;
        sb6.append(str5);
        sb6.append(":");
        sb6.append(this.f166719d);
        c12559xbdae8559.f169324g = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        c11812xa040dc98.f158856e = str5;
        c11812xa040dc98.f158855d = 2;
        c11812xa040dc98.f158860i = str4;
        c11812xa040dc98.f158863o = str3;
        c11812xa040dc98.f158862n = 5;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.e7(this.f166720e, null, str, str2, this.f166721f, -1, c12559xbdae8559, c11812xa040dc98, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, launch fail");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.e(str3, null, -1);
        }
    }
}
