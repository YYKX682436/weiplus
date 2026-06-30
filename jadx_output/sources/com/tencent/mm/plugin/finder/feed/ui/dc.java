package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class dc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI f109941d;

    public dc(com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI) {
        this.f109941d = finderLivePrecheckLicenseUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePrecheckLicenseUI$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI = this.f109941d;
        java.lang.String str = finderLivePrecheckLicenseUI.B;
        int i17 = kotlin.jvm.internal.o.b(str, "TYPE_LICENSE") ? 9 : kotlin.jvm.internal.o.b(str, "TYPE_STANDARD") ? 11 : 0;
        if (finderLivePrecheckLicenseUI.F != 0 && finderLivePrecheckLicenseUI.G != 0 && i17 != 0) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.qd((zy2.zb) c17, i17, finderLivePrecheckLicenseUI.F, finderLivePrecheckLicenseUI.G, null, 8, null);
        }
        java.lang.String str2 = finderLivePrecheckLicenseUI.B;
        if (kotlin.jvm.internal.o.b(str2, "TYPE_LICENSE")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PATH", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_up_privacy");
            intent.putExtra("KEY_TYPE", "TYPE_STANDARD");
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", finderLivePrecheckLicenseUI.F);
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", finderLivePrecheckLicenseUI.G);
            intent.putExtra("KEY_COUNTDOWN_FINISH", finderLivePrecheckLicenseUI.E);
            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Jj(finderLivePrecheckLicenseUI, intent, 1001);
        } else if (kotlin.jvm.internal.o.b(str2, "TYPE_STANDARD")) {
            finderLivePrecheckLicenseUI.setResult(-1);
            finderLivePrecheckLicenseUI.finish();
        } else {
            finderLivePrecheckLicenseUI.e7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePrecheckLicenseUI$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
