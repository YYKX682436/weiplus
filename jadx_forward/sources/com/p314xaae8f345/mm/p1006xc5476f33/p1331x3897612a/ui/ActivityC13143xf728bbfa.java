package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui;

/* renamed from: com.tencent.mm.plugin.collect.ui.CollectHKMainUI */
/* loaded from: classes9.dex */
public class ActivityC13143xf728bbfa extends com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 {

    /* renamed from: h2, reason: collision with root package name */
    public boolean f177917h2 = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368
    public boolean W6(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ww1.t1) {
            ww1.t1 t1Var = (ww1.t1) m1Var;
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CollectHKMainUI", "net error: %s", m1Var);
            } else if (t1Var.f531818f == 0) {
                this.L = t1Var.f531820h;
                this.M = t1Var.f531831v;
                this.N = t1Var.f531828s;
                p7();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t1Var.f531826q)) {
                    this.E1.setVisibility(8);
                } else {
                    this.B1.setText(t1Var.f531826q);
                    this.E1.setOnClickListener(new zw1.l0(this, t1Var));
                    this.E1.setVisibility(0);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t1Var.f531829t)) {
                    this.H.setVisibility(8);
                } else {
                    this.I.setText(t1Var.f531829t);
                    this.I.setOnClickListener(new zw1.m0(this, t1Var));
                    this.H.setVisibility(0);
                }
                return true;
            }
            if (!this.f177917h2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7
    public void b7() {
        gm0.j1.i();
        this.L = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HK_PAY_URL_STRING, "");
        ww1.t1 t1Var = new ww1.t1(0, c01.z1.m());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L)) {
            V6().d(t1Var, false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectHKMainUI", "force load payurl");
        this.f177917h2 = true;
        V6().d(t1Var, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7
    public java.lang.String f7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.N)) {
            this.N = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b();
        }
        return this.N;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7
    public java.lang.String j7() {
        return this.M;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7
    public void k7() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.A.findViewById(com.p314xaae8f345.mm.R.id.f565345c42);
        android.widget.ImageView imageView2 = (android.widget.ImageView) this.A.findViewById(com.p314xaae8f345.mm.R.id.c3t);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.addRule(13);
        imageView2.setLayoutParams(layoutParams);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_HK")) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78883xf839c380);
            imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78874x3639a0);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78882x925cdb98);
            imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78873xc9c181b8);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7
    public void o7() {
        super.o7();
        if (this.V) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.c3d);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.c3d);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.E1.setVisibility(8);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.c3d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.c4j);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V6().c(1335);
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.C30861xcebc809e.chy, new zw1.k0(this));
        t7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        V6().i(1335);
    }
}
