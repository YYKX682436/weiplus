package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes8.dex */
public class x implements gm5.a {
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.y yVar) {
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        km5.b c17 = km5.u.c();
        int intValue = ((java.lang.Integer) bVar.a(0)).intValue();
        kd0.f2 f2Var = (kd0.f2) bVar.a(1);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yf();
        lVar.f152198b = new r45.zf();
        java.lang.String str = f2Var.f388167a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.d(intValue, str) ? 3 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.o(intValue, str) ? 4 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.h(intValue, str) ? 2 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.l(intValue, str) ? 1 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.n(intValue, str) ? 7 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.m(intValue, str) ? 5 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.k(intValue, str) ? 6 : com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.g(intValue, str) ? 9 : -1;
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wxpay_pay_batchgeturlinfo, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FetchQRCodeInfoService", "no abtest, fetchQRCodeInfo url:batchgeturlinfo");
            lVar.f152199c = "/cgi-bin/micromsg-bin/batchgeturlinfo";
            lVar.f152200d = 3964;
        } else if (i17 == 5 || i17 == 6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FetchQRCodeInfoService", "fetchQRCodeInfo url:pay-batchgeturlinfo");
            lVar.f152199c = "/cgi-bin/mmpay-bin/pay-batchgeturlinfo";
            lVar.f152200d = 14949;
            lVar.f152211o = 2;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FetchQRCodeInfoService", "fetchQRCodeInfo url:batchgeturlinfo");
            lVar.f152199c = "/cgi-bin/micromsg-bin/batchgeturlinfo";
            lVar.f152200d = 3964;
        }
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.yf yfVar = (r45.yf) a17.f152243a.f152217a;
        r45.zp3 zp3Var = new r45.zp3();
        zp3Var.f473800d = f2Var.f388167a;
        zp3Var.f473801e = i17;
        zp3Var.f473802f = f2Var.f388168b;
        zp3Var.f473803g = f2Var.f388169c;
        zp3Var.f473804h = f2Var.f388170d;
        zp3Var.f473805i = f2Var.f388171e;
        yfVar.f472563f = 1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(zp3Var);
        yfVar.f472561d = linkedList.size();
        yfVar.f472562e = linkedList;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h0.a(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.w(this, c17));
        return null;
    }
}
