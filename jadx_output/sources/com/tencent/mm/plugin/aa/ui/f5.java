package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f72640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f72641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72642f;

    public f5(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, android.view.View view, android.view.View view2) {
        this.f72642f = launchAAUI;
        this.f72640d = view;
        this.f72641e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72642f;
        int b17 = i65.a.b(launchAAUI.getContext(), 32);
        int b18 = i65.a.b(launchAAUI.getContext(), 64);
        int b19 = i65.a.b(launchAAUI.getContext(), 96);
        int i17 = com.tencent.mm.plugin.aa.ui.LaunchAAUI.S1;
        int i18 = com.tencent.mm.ui.bl.b(launchAAUI.getContext()).y;
        int[] iArr = new int[2];
        android.view.View view = this.f72640d;
        view.getLocationOnScreen(iArr);
        boolean z17 = iArr[1] + view.getHeight() > (i18 * 2) / 3;
        android.view.View view2 = this.f72641e;
        if (z17) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.removeRule(12);
            layoutParams.addRule(3, com.tencent.mm.R.id.ofz);
            layoutParams.topMargin = b17;
            view2.setLayoutParams(layoutParams);
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
        layoutParams2.removeRule(3);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = b19;
        view2.setLayoutParams(layoutParams2);
        if (com.tencent.mm.plugin.aa.ui.LaunchAAUI.j7(launchAAUI, view2, view, b19) >= b17) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
        layoutParams2.removeRule(3);
        layoutParams3.addRule(12);
        layoutParams3.bottomMargin = b18;
        view2.setLayoutParams(layoutParams3);
        if (com.tencent.mm.plugin.aa.ui.LaunchAAUI.j7(launchAAUI, view2, view, b18) >= b17) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
        layoutParams4.removeRule(12);
        layoutParams4.addRule(3, com.tencent.mm.R.id.ofz);
        layoutParams4.topMargin = b17;
        view2.setLayoutParams(layoutParams4);
    }
}
