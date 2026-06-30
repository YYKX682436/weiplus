package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class s3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154331d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        super(false);
        this.f154331d = activityC11351x975a7907;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        int i17;
        android.widget.ImageView imageView;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "click switch button");
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154331d;
        activityC11351x975a7907.mo48632xd46dd964();
        activityC11351x975a7907.mo48674x36654fab();
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.S1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC11351x975a7907.mo55332x76847179(), 1, false);
        android.view.View inflate = activityC11351x975a7907.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bnm, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.htn)).getPaint(), 0.8f);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.f568878od4).setImportantForAccessibility(2);
        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.aa_)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v4(activityC11351x975a7907, k0Var));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.hto);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.htp);
        viewGroup.setAccessibilityDelegate(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w4(activityC11351x975a7907));
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.x4(activityC11351x975a7907, imageView2, k0Var));
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.htq);
        android.widget.ImageView imageView3 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.htr);
        viewGroup2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y4(activityC11351x975a7907, imageView3, k0Var));
        viewGroup2.setAccessibilityDelegate(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z4(activityC11351x975a7907));
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.hts);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.htt);
        android.widget.ImageView imageView4 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.htu);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "aaPayCustomizeOpen switch is ：%s", java.lang.Boolean.TRUE);
        if (activityC11351x975a7907.k7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "!isOpenAAPayCustomize() || fromThirdParty()，dont show cumstomize");
            viewGroup3.setVisibility(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        viewGroup3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.a5(activityC11351x975a7907, imageView, k0Var));
        viewGroup3.setAccessibilityDelegate(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.b5(activityC11351x975a7907));
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.d5(activityC11351x975a7907, k0Var, inflate);
        if (activityC11351x975a7907.f154037h == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 2, 1);
            imageView2.setVisibility(0);
            imageView3.setVisibility(4);
            imageView.setVisibility(4);
        } else if (activityC11351x975a7907.f154038i == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, java.lang.Integer.valueOf(i17), 1);
            imageView2.setVisibility(4);
            imageView3.setVisibility(4);
            imageView.setVisibility(0);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 3, 1);
            imageView2.setVisibility(4);
            imageView3.setVisibility(0);
            imageView.setVisibility(4);
        }
        k0Var.f293389e = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.e5(activityC11351x975a7907, inflate);
        k0Var.e(true);
        k0Var.v();
    }
}
