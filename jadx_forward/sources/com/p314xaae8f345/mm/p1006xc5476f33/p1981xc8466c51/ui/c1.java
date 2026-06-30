package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes9.dex */
public class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 f236896d;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680) {
        this.f236896d = activityC16969x3ace7680;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680 = this.f236896d;
        java.lang.String t17 = bt3.g2.t(activityC16969x3ace7680.f236833v, activityC16969x3ace7680.f236831t, activityC16969x3ace7680.f236830s, 1);
        new android.content.Intent().setAction("android.intent.action.VIEW");
        if (4 == activityC16969x3ace7680.T6()) {
            activityC16969x3ace7680.C = false;
            activityC16969x3ace7680.a7();
        } else if (!o72.x1.t0(bw5.ar0.TingScene_ChatHistory, activityC16969x3ace7680.f236833v, t17)) {
            r45.gp0 gp0Var = activityC16969x3ace7680.f236833v;
            java.lang.String str = gp0Var.K;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = activityC16969x3ace7680.f236835x;
            bt3.g2.t(gp0Var, f9Var.Q0(), f9Var.m124847x74d37ac6(), 1);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F0(str)) {
                r45.gp0 gp0Var2 = activityC16969x3ace7680.f236833v;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = activityC16969x3ace7680.f236835x;
                java.lang.String t18 = bt3.g2.t(gp0Var2, f9Var2.Q0(), f9Var2.m124847x74d37ac6(), 1);
                java.lang.String str2 = activityC16969x3ace7680.f236833v.f456937d;
                re5.f0.a(t18);
                android.content.Intent intent = new android.content.Intent(activityC16969x3ace7680.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2717x62f6fe4.ActivityC22445xcae55707.class);
                pf5.j0.a(intent, re5.g0.class);
                intent.putExtra("KEY_PATH", t18);
                intent.putExtra("KEY_VIDEO_FILE_NAME", str2);
                intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39699xc6812768, true);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC16969x3ace7680, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "openByVideoPlayer", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC16969x3ace7680.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC16969x3ace7680, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "openByVideoPlayer", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).wi(activityC16969x3ace7680, t17, activityC16969x3ace7680.f236833v.K, 5);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
