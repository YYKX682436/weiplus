package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class dc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14025xcad1379e f191474d;

    public dc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14025xcad1379e activityC14025xcad1379e) {
        this.f191474d = activityC14025xcad1379e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePrecheckLicenseUI$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14025xcad1379e activityC14025xcad1379e = this.f191474d;
        java.lang.String str = activityC14025xcad1379e.B;
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "TYPE_LICENSE") ? 9 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "TYPE_STANDARD") ? 11 : 0;
        if (activityC14025xcad1379e.F != 0 && activityC14025xcad1379e.G != 0 && i17 != 0) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.qd((zy2.zb) c17, i17, activityC14025xcad1379e.F, activityC14025xcad1379e.G, null, 8, null);
        }
        java.lang.String str2 = activityC14025xcad1379e.B;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "TYPE_LICENSE")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PATH", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_up_privacy");
            intent.putExtra("KEY_TYPE", "TYPE_STANDARD");
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", activityC14025xcad1379e.F);
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", activityC14025xcad1379e.G);
            intent.putExtra("KEY_COUNTDOWN_FINISH", activityC14025xcad1379e.E);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Jj(activityC14025xcad1379e, intent, 1001);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "TYPE_STANDARD")) {
            activityC14025xcad1379e.setResult(-1);
            activityC14025xcad1379e.finish();
        } else {
            activityC14025xcad1379e.e7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePrecheckLicenseUI$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
