package mz2;

/* loaded from: classes9.dex */
public class f1 implements pz2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mz2.g1 f414653a;

    public f1(mz2.g1 g1Var) {
        this.f414653a = g1Var;
    }

    @Override // pz2.c
    public void a(int i17, int i18, int i19, int i27) {
        mz2.g1 g1Var = this.f414653a;
        if (g1Var.f414657f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", "hy: event already end. ignore");
            return;
        }
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_SUCCESS");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "onSuccess()");
            g1Var.f414657f = true;
            ((pz2.a) gm0.j1.s(pz2.a.class)).O(g1Var.f414656e, i18);
            if (g1Var.f414657f) {
                g1Var.f414656e = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "callback OpenFingerPrintAuthEvent onSuccess()");
            g1Var.f();
            return;
        }
        if (i17 != 2007) {
            if (i17 == 2009) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: on error: %d", java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f8 = g1Var.f414656e;
                if (c5820xc13f26f8 != null) {
                    c5820xc13f26f8.f136128g.getClass();
                    re4.n.a(3, 0);
                }
                g1Var.f414657f = true;
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiv);
                g1Var.f();
                g1Var.b(i17, string);
                return;
            }
            if (i17 != 10308 && i17 != 2004 && i17 != 2005) {
                switch (i17) {
                    case 2000:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify timeout");
                        return;
                    case 2001:
                        g1Var.c(false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_TIMEOUT");
                        return;
                    case 2002:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_NO_MATCH");
                        g1Var.f414657f = false;
                        g1Var.f();
                        g1Var.c(true);
                        g1Var.b(1, "");
                        return;
                    default:
                        return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: on error: %d", java.lang.Integer.valueOf(i17));
        g1Var.f414657f = true;
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiv);
        if (i17 == 10308) {
            string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiw);
        } else if (i17 == 2007) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f82 = g1Var.f414656e;
            if (c5820xc13f26f82 != null) {
                int i28 = c5820xc13f26f82.f136128g.f89097b;
            }
            mz2.d2.IML.f414646f = true;
        } else if (i17 == 2005) {
            string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiz);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f83 = g1Var.f414656e;
            if (c5820xc13f26f83 != null) {
                int i29 = c5820xc13f26f83.f136128g.f89097b;
            }
        }
        g1Var.f();
        g1Var.b(2, string2);
    }
}
