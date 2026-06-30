package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class n2 extends k75.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 f266069e;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 o2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.t1 t1Var) {
        this.f266069e = o2Var;
    }

    @Override // k75.b, k75.c
    public void a() {
        super.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 o2Var = this.f266069e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = o2Var.f266100n;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c.R5;
        activityC19380x649e7d5c.Ta(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c2 = o2Var.f266100n;
        activityC19380x649e7d5c2.F4.setPadding(activityC19380x649e7d5c2.f265835q5, 0, 0, 0);
        o2Var.f266100n.F4.setX(0.0f);
        o2Var.f266100n.F4.setY(0.0f);
        o2Var.f266100n.J4.m74114x6f2f9a9a(8);
        if (!o2Var.f266100n.Da()) {
            o2Var.f266100n.J4.m74112x9e8eda7(8);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o2Var.f266100n.P9())) {
            o2Var.f266100n.J4.m74111x216d5aa0(true);
            o2Var.f266100n.J4.m74112x9e8eda7(8);
        } else {
            o2Var.f266100n.J4.m74111x216d5aa0(false);
            o2Var.f266100n.J4.m74112x9e8eda7(0);
        }
        o2Var.f266100n.Ma(0);
        o2Var.f266100n.Ra(0);
        if (!o2Var.f266100n.J4.k()) {
            o2Var.f266100n.J4.m();
            o2Var.f266100n.mo26063x7b383410();
        }
        if (fp.h.c(23)) {
            u75.d.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c3 = o2Var.f266100n;
            activityC19380x649e7d5c3.C9(activityC19380x649e7d5c3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
        if (android.text.TextUtils.isEmpty(o2Var.f266100n.N9())) {
            return;
        }
        o2Var.f266100n.J4.r();
    }

    @Override // k75.b, k75.c
    public void b() {
        super.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 o2Var = this.f266069e;
        o2Var.f266100n.T9(java.lang.Boolean.FALSE);
        o2Var.f266100n.Ma(8);
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 o2Var = this.f266069e;
        if (i17 == 0 || i17 == 11) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogStateTransitionState", "SearchWithFocusState processMessage = %d.", java.lang.Integer.valueOf(i17));
            if (o2Var.f266100n.P9().length() <= 0) {
                return false;
            }
            o2Var.o(o2Var.f266098i);
            return false;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = o2Var.f266100n;
            if (activityC19380x649e7d5c.K4) {
                activityC19380x649e7d5c.finish();
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.c5 c5Var = activityC19380x649e7d5c.f265824f5;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.u4 u4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.u4.Init;
            c5Var.a(u4Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c.wa(o2Var.f266100n, u4Var);
            return false;
        }
        if (i17 == 3 || i17 == 4) {
            o2Var.o(o2Var.f266096g);
            return false;
        }
        if (i17 != 5) {
            return false;
        }
        if (o2Var.f266100n.J4.m80966xdb574fcd().hasFocus()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15521, java.lang.Integer.valueOf(o2Var.f266100n.Y3), 2, o2Var.f266100n.J4.m80970x134c2d56(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(o2Var.f266100n.f265778b4));
            return false;
        }
        o2Var.o(o2Var.f266098i);
        return false;
    }

    @Override // k75.c, k75.a
    /* renamed from: getName */
    public java.lang.String mo51017xfb82e301() {
        return "SearchWithFocusState";
    }
}
