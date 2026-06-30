package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class m2 extends k75.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 f266054e;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 o2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.t1 t1Var) {
        this.f266054e = o2Var;
    }

    @Override // k75.b, k75.c
    public void a() {
        super.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 o2Var = this.f266054e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = o2Var.f266100n;
        activityC19380x649e7d5c.F4.setPadding(activityC19380x649e7d5c.f265835q5, 0, 0, 0);
        o2Var.f266100n.F4.setX(0.0f);
        o2Var.f266100n.F4.setY(0.0f);
        o2Var.f266100n.J4.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c2 = o2Var.f266100n;
        if (!activityC19380x649e7d5c2.f265840v5) {
            android.view.View view = activityC19380x649e7d5c2.f265828j5;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchWithFocusNoResultState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchWithFocusNoResultState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        o2Var.f266100n.Ra(0);
        o2Var.f266100n.J4.m74114x6f2f9a9a(0);
        o2Var.f266100n.J4.m74112x9e8eda7(0);
        o2Var.f266100n.Ma(8);
    }

    @Override // k75.b, k75.c
    public void b() {
        super.b();
        this.f266054e.f266100n.T9(java.lang.Boolean.FALSE);
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 o2Var = this.f266054e;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogStateTransitionState", "SearchWithFocusState processMessage = MSG_SEARCH_KEY_DOWN.");
            if (o2Var.f266100n.P9().length() <= 0) {
                return false;
            }
            o2Var.f266100n.J4.f();
            o2Var.f266100n.J4.d();
            o2Var.o(o2Var.f266098i);
            return false;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = o2Var.f266100n;
            if (activityC19380x649e7d5c.K4) {
                activityC19380x649e7d5c.finish();
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.e5 e5Var = activityC19380x649e7d5c.f265825g5;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.u4 u4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.u4.Init;
            if (u4Var != e5Var.f266224q) {
                e5Var.a();
                e5Var.f266224q = u4Var;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c.wa(o2Var.f266100n, u4Var);
            return false;
        }
        if (i17 == 5) {
            if (!o2Var.f266100n.J4.m80966xdb574fcd().hasFocus()) {
                return false;
            }
            o2Var.o(o2Var.f266097h);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15521, java.lang.Integer.valueOf(o2Var.f266100n.Y3), 2, o2Var.f266100n.J4.m80970x134c2d56(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(o2Var.f266100n.f265778b4));
            return false;
        }
        if (i17 == 9) {
            o2Var.o(o2Var.f266096g);
            return false;
        }
        if (i17 != 10 || o2Var.f266100n.P9().length() <= 0) {
            return false;
        }
        o2Var.o(o2Var.f266098i);
        return false;
    }

    @Override // k75.c, k75.a
    /* renamed from: getName */
    public java.lang.String mo51017xfb82e301() {
        return "SearchWithFocusNoResultState";
    }
}
