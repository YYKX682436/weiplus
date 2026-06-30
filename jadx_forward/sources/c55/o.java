package c55;

/* loaded from: classes12.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c55.p f120287d;

    public o(c55.p pVar) {
        this.f120287d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed509;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/recovery/ui/RecoveryUI$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5092 = this.f120287d.f120288d.f120290e.f120299d;
        java.lang.Thread thread = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
        activityC19822xa98ed5092.getClass();
        d55.u.b("MicroMsg.recovery.ui", "restart WeChat", new java.lang.Object[0]);
        d55.w wVar = new d55.w(activityC19822xa98ed5092.getApplication(), "recovery_statistic");
        wVar.e();
        int mo123525xb58848b9 = wVar.mo123525xb58848b9("crash_count", 0);
        boolean mo123524x41a8a7f2 = wVar.mo123524x41a8a7f2("launch_recovery", false);
        boolean mo123524x41a8a7f22 = wVar.mo123524x41a8a7f2("launch_recovery_real", false);
        wVar.mo123524x41a8a7f2("recover_from_crash", false);
        int mo123525xb58848b92 = wVar.mo123525xb58848b9("recovery_status", -1);
        int mo123525xb58848b93 = wVar.mo123525xb58848b9("recovery_from", 0);
        int mo123525xb58848b94 = wVar.mo123525xb58848b9("recover_internal_status", 0);
        int mo123525xb58848b95 = wVar.mo123525xb58848b9("recover_launch_mode", 0);
        long mo123526xfb822ef2 = wVar.mo123526xfb822ef2("recover_running_time", 0L);
        wVar.mo123524x41a8a7f2("recover_is_discard", false);
        java.lang.String mo123527x2fec8307 = wVar.mo123527x2fec8307("recover_app_ver", "");
        wVar.g("crash_count", mo123525xb58848b9);
        wVar.mo123528x1c849219("launch_recovery", mo123524x41a8a7f2);
        wVar.mo123528x1c849219("launch_recovery_real", mo123524x41a8a7f22);
        wVar.mo123528x1c849219("recover_from_crash", true);
        wVar.mo123529xc5c55e60("recovery_status", mo123525xb58848b92);
        wVar.mo123529xc5c55e60("recovery_from", mo123525xb58848b93);
        wVar.mo123529xc5c55e60("recover_internal_status", mo123525xb58848b94);
        wVar.mo123529xc5c55e60("recover_launch_mode", mo123525xb58848b95);
        wVar.mo123530xf2e7ce2b("recover_running_time", mo123526xfb822ef2);
        wVar.mo123528x1c849219("recover_is_discard", false);
        wVar.mo123531xe4673800("recover_app_ver", mo123527x2fec8307);
        wVar.c();
        d55.u.a(activityC19822xa98ed5092.getApplicationContext());
        android.content.Intent launchIntentForPackage = activityC19822xa98ed5092.getApplication().getPackageManager().getLaunchIntentForPackage(activityC19822xa98ed5092.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(launchIntentForPackage);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC19822xa98ed5092, arrayList2.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "restart", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC19822xa98ed509 = activityC19822xa98ed5092;
            activityC19822xa98ed509.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC19822xa98ed509, "com/tencent/mm/recovery/ui/RecoveryUI", "restart", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC19822xa98ed509.overridePendingTransition(0, 0);
        } else {
            activityC19822xa98ed509 = activityC19822xa98ed5092;
        }
        activityC19822xa98ed509.finish();
        yj0.a.h(this, "com/tencent/mm/recovery/ui/RecoveryUI$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
