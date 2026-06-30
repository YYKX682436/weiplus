package hs3;

/* loaded from: classes4.dex */
public class r implements java.lang.Runnable {
    public r(hs3.s sVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        if (gm0.j1.a()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ks3.o0 o0Var = new ks3.p0().f393267a;
            if (o0Var.f393260d.size() > 0) {
                int i17 = 0;
                while (true) {
                    linkedList = o0Var.f393260d;
                    if (i17 >= linkedList.size()) {
                        break;
                    }
                    java.lang.String str = ((ks3.n0) linkedList.get(i17)).f393257d;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.u1("qqmail");
                    f9Var.e1(c01.w9.o("qqmail"));
                    f9Var.j1(0);
                    f9Var.d1(java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ihz), str));
                    f9Var.m124850x7650bebc(1);
                    f9Var.r1(3);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
                    i17++;
                }
                linkedList.clear();
                try {
                    gm0.j1.u().c().w(282625, android.util.Base64.encodeToString(o0Var.mo14344x5f01b1f6(), 0));
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareMailInfoMgr", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareMailInfoMgr", "save to config fail");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubCoreQQMail", "summeranrt onAccountPostReset notifyAllFail take[%d]ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
