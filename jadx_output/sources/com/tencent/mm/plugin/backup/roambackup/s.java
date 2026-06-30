package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.s f92721d = new com.tencent.mm.plugin.backup.roambackup.s();

    public s() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.NewRoamFetcher", "[+] Init iLink done.");
        com.tencent.wechat.aff.affroam.s0.f215981a = com.tencent.mm.plugin.backup.roambackup.p.f92671a;
        com.tencent.wechat.aff.affroam.x0.f216013b = com.tencent.mm.plugin.backup.roambackup.q.f92679a;
        com.tencent.wechat.aff.affroam.x0.f216012a = com.tencent.mm.plugin.backup.roambackup.r.f92683a;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.NewRoamFetcher", "[+] Register related zidl.");
        java.lang.String d17 = oo1.o.f347151a.d();
        com.tencent.wechat.aff.affroam.p1 p1Var = com.tencent.wechat.aff.affroam.p1.f215952b;
        com.tencent.mm.vfs.r6 r6Var = com.tencent.mm.plugin.backup.roambackup.v1.f92916c;
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.NewRoamFetcher", "mkdir for " + r6Var + ", ret=" + r6Var.J());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.NewRoamFetcher", "[+] Init manager done, phoneId=" + d17 + ", ret = %" + p1Var.i(r6Var.o(), gm0.j1.b().k(), d17, false));
        if (!(tn1.f.f().e().f420812o != 0)) {
            tn1.f.f().c();
        }
        com.tencent.mm.plugin.backup.roambackup.r0.f92685b.alive();
        return p1Var;
    }
}
