package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class v6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.f7 f284330d;

    public v6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.f7 f7Var) {
        this.f284330d = f7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.f7 f7Var = this.f284330d;
        int ordinal = f7Var.f282029i.ordinal();
        if (ordinal == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11288, 6);
            android.content.Context context = f7Var.f282022b;
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
                db5.e1.y(context, i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.azn), "", i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.azi), null);
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
                android.content.Context context2 = f7Var.f282022b;
                db5.e1.p(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.azl), 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.azg), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.azf), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.x6(f7Var), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.y6(f7Var));
            } else {
                db5.e1.j(f7Var.f282022b, com.p314xaae8f345.mm.R.C30867xcad56011.azk, 0, com.p314xaae8f345.mm.R.C30867xcad56011.azg, com.p314xaae8f345.mm.R.C30867xcad56011.azf, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.w6(f7Var), null);
            }
        } else if (ordinal == 2) {
            f7Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingQQMailFooterHandler", "dz[cancelDownload]");
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(f7Var.f282036p);
            f7Var.b();
        } else if (ordinal == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11288, 7);
            f7Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingQQMailFooterHandler", "dz[installQQMail]");
            java.lang.String str = f7Var.f282035o;
            ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(f7Var.f282022b, str, null, false);
        } else if (ordinal == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11288, 5);
            f7Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingQQMailFooterHandler", "dz[openQQMail]");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingQQMailFooterHandler", "mQQMailScheme = %s", f7Var.f282037q);
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f7Var.f282037q);
            android.content.Context context3 = f7Var.f282022b;
            if (K0) {
                intent = context3.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
            } else {
                intent = new android.content.Intent();
                intent.setData(android.net.Uri.parse(f7Var.f282037q));
                intent.addFlags(268435456);
                intent.addFlags(32768);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context3, intent, false, false)) {
                    intent = context3.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingQQMailFooterHandler", "intent = %s", intent);
            p95.a.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.z6(f7Var, intent));
        } else if (ordinal == 5 && f7Var.f282031k) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.f7.a(f7Var);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
