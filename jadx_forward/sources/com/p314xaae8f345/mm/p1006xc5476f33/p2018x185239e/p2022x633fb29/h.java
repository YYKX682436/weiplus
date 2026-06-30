package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h f238380b = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h();

    /* renamed from: a, reason: collision with root package name */
    public final r45.qq4 f238381a = new r45.qq4();

    public void a(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, long j18) {
        r45.nq4 nq4Var = new r45.nq4();
        nq4Var.f463134h = str;
        nq4Var.f463133g = str2;
        nq4Var.f463131e = str3;
        nq4Var.f463132f = j18;
        nq4Var.f463130d = c01.w9.p() + (1000 * j17);
        this.f238381a.f465737d.add(nq4Var);
        b();
        new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g(j17, nq4Var).a();
    }

    public void b() {
        r45.qq4 qq4Var = this.f238381a;
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REMITTANCE_MSGCHECKTASKINFO_STRING_SYNC, android.util.Base64.encodeToString(qq4Var.mo14344x5f01b1f6(), 0));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgCheckTaskMgr", e17, "", new java.lang.Object[0]);
            qq4Var.f465737d.clear();
        }
    }
}
