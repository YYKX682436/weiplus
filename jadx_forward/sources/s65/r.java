package s65;

/* loaded from: classes11.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c f485042d;

    public r(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c) {
        this.f485042d = activityC20972xfb8eac1c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        uk.l lVar;
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = this.f485042d;
        if (activityC20972xfb8eac1c.f273852g.f485077r == 1) {
            s65.o0.g(activityC20972xfb8eac1c, 6, 0);
        }
        if (!fp.m.c().equals("mounted")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUpdaterUI", "no sdcard.");
            activityC20972xfb8eac1c.f273850e.dismiss();
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c.P6(activityC20972xfb8eac1c);
            return;
        }
        s65.x0 x0Var = activityC20972xfb8eac1c.f273852g;
        if ((x0Var.f485081v & 1) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUpdaterUI", "package has set external update mode");
            android.net.Uri parse = android.net.Uri.parse(activityC20972xfb8eac1c.f273852g.f485082w);
            android.content.Intent addFlags = new android.content.Intent("android.intent.action.VIEW", parse).addFlags(268435456);
            if (parse == null || addFlags == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(activityC20972xfb8eac1c, addFlags, false, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUpdaterUI", "parse market uri failed, jump to weixin.qq.com");
                android.content.Intent addFlags2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(com.p314xaae8f345.mm.ui.x2.f294072a)).addFlags(268435456);
                try {
                    com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c2 = this.f485042d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(addFlags2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC20972xfb8eac1c2, arrayList.toArray(), "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC20972xfb8eac1c2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC20972xfb8eac1c2, "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppUpdaterUI", e17, "", new java.lang.Object[0]);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppUpdaterUI", "parse market uri ok");
                try {
                    com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c3 = this.f485042d;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(addFlags);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(activityC20972xfb8eac1c3, arrayList2.toArray(), "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC20972xfb8eac1c3.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(activityC20972xfb8eac1c3, "com/tencent/mm/sandbox/updater/AppUpdaterUI$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppUpdaterUI", e18, "", new java.lang.Object[0]);
                }
            }
            activityC20972xfb8eac1c.R6();
            return;
        }
        java.lang.String c17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l.c(x0Var.f485069j, x0Var.f485080u);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17) && (lVar = activityC20972xfb8eac1c.f273852g.f485074o) != null) {
            c17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l.f273829f + lVar.f510035b + ".apk";
            if (!com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.c(c17) || !uk.b.a(c17)) {
                c17 = null;
            }
        }
        if (c17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppUpdaterUI", "update package already exist.");
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c.Q6(activityC20972xfb8eac1c, 8);
            if (activityC20972xfb8eac1c.f273852g.f485075p) {
                com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c.Q6(activityC20972xfb8eac1c, 0);
            } else {
                com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c.Q6(activityC20972xfb8eac1c, 9);
            }
            activityC20972xfb8eac1c.f273852g.l(1, true);
            ((s65.m) activityC20972xfb8eac1c.f273853h).c(c17);
            return;
        }
        int i18 = activityC20972xfb8eac1c.f273852g.f485077r;
        int i19 = activityC20972xfb8eac1c.f273852g.f485063d;
        s65.x0 x0Var2 = activityC20972xfb8eac1c.f273852g;
        int i27 = x0Var2.f485077r;
        if (i27 == 0) {
            x0Var2.m(false);
            return;
        }
        if (i27 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUpdaterUI", "silence download never go here!");
            return;
        }
        activityC20972xfb8eac1c.R6();
        android.content.Intent intent = new android.content.Intent(activityC20972xfb8eac1c.getIntent());
        intent.setClass(activityC20972xfb8eac1c, com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc.class);
        intent.putExtra("intent_extra_run_in_foreground", true);
        l85.h1.e(intent, "sandbox", true, j45.l.e("sandbox"));
        if (activityC20972xfb8eac1c.f273852g.f485080u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 56L, 1L, false);
        }
    }
}
