package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e f273390d;

    public r(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e) {
        this.f273390d = activityC19725xad6fc40e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppChooserUI", "mDownloadOnClickListener");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e = this.f273390d;
        if (activityC19725xad6fc40e.f272866e != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0 e0Var = activityC19725xad6fc40e.Z6() ? activityC19725xad6fc40e.N : activityC19725xad6fc40e.f272866e.f273033e;
            if (e0Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0.UNINSTALL) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d0 d0Var = activityC19725xad6fc40e.P;
                if (d0Var != null && d0Var.f273084b.isShowing()) {
                    activityC19725xad6fc40e.P.f273084b.dismiss();
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19725xad6fc40e.f272882w.f())) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(activityC19725xad6fc40e.mo55332x76847179(), "com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI");
                    intent.putExtra("task_name", activityC19725xad6fc40e.f272882w.c());
                    intent.putExtra("task_download_type", 1);
                    jt.u b17 = activityC19725xad6fc40e.f272882w.b();
                    java.lang.String c17 = activityC19725xad6fc40e.f272882w.c();
                    if (b17.f383124d > 0) {
                        c17 = activityC19725xad6fc40e.getResources().getString(b17.f383124d);
                    } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f383125e)) {
                        c17 = b17.f383125e;
                    }
                    intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, c17);
                    intent.putExtra("icon_res_id", b17.f383121a);
                    if (activityC19725xad6fc40e.f272884y == 1) {
                        intent.putExtra("task_url", "http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10375");
                    } else {
                        intent.putExtra("task_url", activityC19725xad6fc40e.f272882w.d());
                    }
                    intent.putExtra("fileType", 1);
                    intent.putExtra("package_name", activityC19725xad6fc40e.f272882w.e());
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(activityC19725xad6fc40e, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI", "tryDownloadQB", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC19725xad6fc40e.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(activityC19725xad6fc40e, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI", "tryDownloadQB", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", activityC19725xad6fc40e.f272882w.f());
                    j45.l.j(activityC19725xad6fc40e.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent2, null);
                }
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z3 a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z3.a();
                int i17 = activityC19725xad6fc40e.f272879t;
                a17.getClass();
                if (i17 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10998, 2);
                } else if (i17 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11091, 2);
                }
                if (activityC19725xad6fc40e.f272879t == 0) {
                    if (activityC19725xad6fc40e.K) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11168, 4, java.lang.Integer.valueOf(activityC19725xad6fc40e.f272884y));
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11168, 3, java.lang.Integer.valueOf(activityC19725xad6fc40e.f272884y));
                    }
                }
                if (activityC19725xad6fc40e.f272879t == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 5, "");
                }
            } else if (e0Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0.DOWNLOADED) {
                long j17 = activityC19725xad6fc40e.M;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppChooserUI", "installRecommendApp");
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(j17).f178497g;
                zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19725xad6fc40e.mo55332x76847179();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l lVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l(activityC19725xad6fc40e);
                ((yb0.c) yVar).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(mo55332x76847179, str, lVar, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
