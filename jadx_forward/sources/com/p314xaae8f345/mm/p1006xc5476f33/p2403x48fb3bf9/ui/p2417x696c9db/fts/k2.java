package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class k2 extends k75.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 f266026e;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 o2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.t1 t1Var) {
        this.f266026e = o2Var;
    }

    @Override // k75.b, k75.c
    public void a() {
        super.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = this.f266026e.f266100n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "setInitStatus originInputX:%f, currentInputX:%f isPageLoadFinish:%b isWebViewPreloaded:%b", java.lang.Float.valueOf(activityC19380x649e7d5c.f265826h5), java.lang.Float.valueOf(activityC19380x649e7d5c.F4.getX()), java.lang.Boolean.valueOf(activityC19380x649e7d5c.X4), java.lang.Boolean.valueOf(activityC19380x649e7d5c.A3));
        float f17 = activityC19380x649e7d5c.f265826h5;
        if (f17 > 0.0f) {
            activityC19380x649e7d5c.F4.setX(f17);
        }
        float f18 = activityC19380x649e7d5c.f265827i5;
        if (f18 > 0.0f) {
            activityC19380x649e7d5c.F4.setY(f18);
        }
        android.view.View view = activityC19380x649e7d5c.F4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC19380x649e7d5c.f265829k5.setBackgroundColor(activityC19380x649e7d5c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aac));
        android.view.View view2 = activityC19380x649e7d5c.Z4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC19380x649e7d5c.Ra(8);
        if (fp.h.c(23)) {
            activityC19380x649e7d5c.C9(activityC19380x649e7d5c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aac));
        }
        activityC19380x649e7d5c.J4.m80983xc23608e9(8);
        activityC19380x649e7d5c.J4.g();
        activityC19380x649e7d5c.F4.setPadding(0, 0, 0, 0);
        activityC19380x649e7d5c.f265778b4 = 0;
        activityC19380x649e7d5c.A5 = "";
        activityC19380x649e7d5c.ra();
        activityC19380x649e7d5c.J4.d();
        activityC19380x649e7d5c.J4.m80989x764b0e09(activityC19380x649e7d5c.ia());
        activityC19380x649e7d5c.J4.m74114x6f2f9a9a(8);
        activityC19380x649e7d5c.J4.m74112x9e8eda7(0);
        activityC19380x649e7d5c.Ma(8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = activityC19380x649e7d5c.f265348f;
        if (c22633x83752a59 != null) {
            android.view.View mo120158xfb86a31b = c22633x83752a59.mo120158xfb86a31b();
            mo120158xfb86a31b.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.i1(activityC19380x649e7d5c, mo120158xfb86a31b));
        }
        activityC19380x649e7d5c.Ta(true);
    }

    @Override // k75.b, k75.c
    public void b() {
        super.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = this.f266026e.f266100n;
        activityC19380x649e7d5c.f265829k5.setBackgroundColor(activityC19380x649e7d5c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.u4 u4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.u4.Search;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.o2 o2Var = this.f266026e;
        if (i17 != 0) {
            if (i17 == 1) {
                o2Var.f266100n.J4.f();
                o2Var.f266100n.f265824f5.a(u4Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c.wa(o2Var.f266100n, u4Var);
                o2Var.f266100n.F4.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
            } else if (i17 == 3) {
                o2Var.f266100n.V4 = true;
                o2Var.o(o2Var.f266097h);
            } else if (i17 == 4) {
                o2Var.f266100n.V4 = true;
                o2Var.o(o2Var.f266098i);
            } else if (i17 != 5) {
                if (i17 != 13) {
                    if (i17 == 14) {
                        o2Var.f266100n.J4.f();
                        o2Var.f266100n.J4.d();
                        o2Var.f266100n.f265823e5.a(u4Var, false);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c.wa(o2Var.f266100n, u4Var);
                        o2Var.f266100n.F4.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
                        o2Var.o(o2Var.f266098i);
                        o2Var.f266100n.V4 = true;
                    }
                }
            } else if (o2Var.f266100n.J4.m80966xdb574fcd().hasFocus() && o2Var.f266100n.P9().length() == 0) {
                o2Var.f266100n.J4.f();
                o2Var.f266100n.F4.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
                o2Var.f266100n.J4.m74114x6f2f9a9a(8);
                o2Var.f266100n.f265824f5.a(u4Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c.wa(o2Var.f266100n, u4Var);
                o2Var.f266100n.o9(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j2(this));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15521, java.lang.Integer.valueOf(o2Var.f266100n.Y3), 3, o2Var.f266100n.J4.m80970x134c2d56(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(o2Var.f266100n.f265778b4));
            }
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogStateTransitionState", "InitState processMessage = %d.", java.lang.Integer.valueOf(i17));
        if (o2Var.f266100n.P9().length() > 0) {
            o2Var.f266100n.J4.d();
            o2Var.f266100n.f265823e5.a(u4Var, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c.wa(o2Var.f266100n, u4Var);
            o2Var.f266100n.F4.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        }
        return false;
    }

    @Override // k75.c, k75.a
    /* renamed from: getName */
    public java.lang.String mo51017xfb82e301() {
        return "InitSate";
    }
}
