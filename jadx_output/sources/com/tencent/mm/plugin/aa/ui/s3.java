package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class s3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        super(false);
        this.f72798d = launchAAUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17;
        android.widget.ImageView imageView;
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "click switch button");
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72798d;
        launchAAUI.hideTenpayKB();
        launchAAUI.hideVKB();
        int i18 = com.tencent.mm.plugin.aa.ui.LaunchAAUI.S1;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) launchAAUI.getContext(), 1, false);
        android.view.View inflate = launchAAUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.bnm, (android.view.ViewGroup) null);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.htn)).getPaint(), 0.8f);
        inflate.findViewById(com.tencent.mm.R.id.f487345od4).setImportantForAccessibility(2);
        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.aa_)).setOnClickListener(new com.tencent.mm.plugin.aa.ui.v4(launchAAUI, k0Var));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hto);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.htp);
        viewGroup.setAccessibilityDelegate(new com.tencent.mm.plugin.aa.ui.w4(launchAAUI));
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.aa.ui.x4(launchAAUI, imageView2, k0Var));
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.htq);
        android.widget.ImageView imageView3 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.htr);
        viewGroup2.setOnClickListener(new com.tencent.mm.plugin.aa.ui.y4(launchAAUI, imageView3, k0Var));
        viewGroup2.setAccessibilityDelegate(new com.tencent.mm.plugin.aa.ui.z4(launchAAUI));
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hts);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.htt);
        android.widget.ImageView imageView4 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.htu);
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "aaPayCustomizeOpen switch is ：%s", java.lang.Boolean.TRUE);
        if (launchAAUI.k7()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "!isOpenAAPayCustomize() || fromThirdParty()，dont show cumstomize");
            viewGroup3.setVisibility(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            i17 = 8;
            imageView = imageView4;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "showAAPaySelectDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/LaunchAAUI", "showAAPaySelectDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            i17 = 8;
            imageView = imageView4;
        }
        viewGroup3.setOnClickListener(new com.tencent.mm.plugin.aa.ui.a5(launchAAUI, imageView, k0Var));
        viewGroup3.setAccessibilityDelegate(new com.tencent.mm.plugin.aa.ui.b5(launchAAUI));
        k0Var.f211872n = new com.tencent.mm.plugin.aa.ui.d5(launchAAUI, k0Var, inflate);
        if (launchAAUI.f72504h == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 2, 1);
            imageView2.setVisibility(0);
            imageView3.setVisibility(4);
            imageView.setVisibility(4);
        } else if (launchAAUI.f72505i == 4) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, java.lang.Integer.valueOf(i17), 1);
            imageView2.setVisibility(4);
            imageView3.setVisibility(4);
            imageView.setVisibility(0);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 3, 1);
            imageView2.setVisibility(4);
            imageView3.setVisibility(0);
            imageView.setVisibility(4);
        }
        k0Var.f211856e = new com.tencent.mm.plugin.aa.ui.e5(launchAAUI, inflate);
        k0Var.e(true);
        k0Var.v();
    }
}
