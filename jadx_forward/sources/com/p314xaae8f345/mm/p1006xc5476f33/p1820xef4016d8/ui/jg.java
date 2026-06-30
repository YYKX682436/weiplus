package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class jg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e f228593e;

    public jg(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e, java.lang.String str) {
        this.f228593e = activityC16380x9ede44e;
        this.f228592d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "click StatusLayout");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e.Y1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e = this.f228593e;
        activityC16380x9ede44e.d7(11);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 c6646xbe932a67 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67();
        c6646xbe932a67.f139948d = 15L;
        c6646xbe932a67.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s4 s4Var = activityC16380x9ede44e.V;
        java.lang.String str = s4Var.f227141h;
        java.lang.String str2 = s4Var.f227142i;
        if (activityC16380x9ede44e.f227898z1) {
            str = s4Var.f227147q;
            str2 = s4Var.f227148r;
        }
        bi4.c1 c1Var = new bi4.c1();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f436672d = "3";
        j0Var.f436674f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        arrayList2.add(j0Var);
        c1Var.b(this.f228592d);
        c1Var.f("red_packet_2022@inner");
        bi4.d1 d1Var = c1Var.f102567a;
        pj4.b0 b0Var = d1Var.f436470d;
        b0Var.f436509h = str;
        b0Var.f436511m = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s4 s4Var2 = activityC16380x9ede44e.V;
        b0Var.f436520v = s4Var2.f227143m;
        b0Var.f436521w = s4Var2.f227144n;
        c1Var.h(s4Var2.f227145o);
        c1Var.g(activityC16380x9ede44e.V.f227139f);
        d1Var.f436470d.f436507f = 2;
        c1Var.c(arrayList2);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Di(activityC16380x9ede44e.mo55332x76847179(), d1Var);
        activityC16380x9ede44e.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
