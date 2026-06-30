package com.tencent.mm.plugin.collect.ui;

/* loaded from: classes9.dex */
public class CollectHKMainUI extends com.tencent.mm.plugin.collect.ui.CollectMainUI {

    /* renamed from: h2, reason: collision with root package name */
    public boolean f96384h2 = false;

    @Override // com.tencent.mm.plugin.collect.ui.CollectMainUI, com.tencent.mm.wallet_core.ui.WalletPreferenceUI
    public boolean W6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ww1.t1) {
            ww1.t1 t1Var = (ww1.t1) m1Var;
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CollectHKMainUI", "net error: %s", m1Var);
            } else if (t1Var.f450285f == 0) {
                this.L = t1Var.f450287h;
                this.M = t1Var.f450298v;
                this.N = t1Var.f450295s;
                p7();
                if (com.tencent.mm.sdk.platformtools.t8.K0(t1Var.f450293q)) {
                    this.E1.setVisibility(8);
                } else {
                    this.B1.setText(t1Var.f450293q);
                    this.E1.setOnClickListener(new zw1.l0(this, t1Var));
                    this.E1.setVisibility(0);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(t1Var.f450296t)) {
                    this.H.setVisibility(8);
                } else {
                    this.I.setText(t1Var.f450296t);
                    this.I.setOnClickListener(new zw1.m0(this, t1Var));
                    this.H.setVisibility(0);
                }
                return true;
            }
            if (!this.f96384h2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.collect.ui.CollectMainUI
    public void b7() {
        gm0.j1.i();
        this.L = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_HK_PAY_URL_STRING, "");
        ww1.t1 t1Var = new ww1.t1(0, c01.z1.m());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            V6().d(t1Var, false);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectHKMainUI", "force load payurl");
        this.f96384h2 = true;
        V6().d(t1Var, true);
    }

    @Override // com.tencent.mm.plugin.collect.ui.CollectMainUI
    public java.lang.String f7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.N)) {
            this.N = com.tencent.mm.wallet_core.model.c2.b();
        }
        return this.N;
    }

    @Override // com.tencent.mm.plugin.collect.ui.CollectMainUI
    public java.lang.String j7() {
        return this.M;
    }

    @Override // com.tencent.mm.plugin.collect.ui.CollectMainUI
    public void k7() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.A.findViewById(com.tencent.mm.R.id.f483812c42);
        android.widget.ImageView imageView2 = (android.widget.ImageView) this.A.findViewById(com.tencent.mm.R.id.c3t);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.addRule(13);
        imageView2.setLayoutParams(layoutParams);
        if (com.tencent.mm.sdk.platformtools.m2.d().equals("zh_HK")) {
            imageView.setImageResource(com.tencent.mm.R.raw.collect_top_logo_hk_traditional);
            imageView2.setImageResource(com.tencent.mm.R.raw.collect_bottom_logo_hk_traditional);
        } else {
            imageView.setImageResource(com.tencent.mm.R.raw.collect_top_logo_hk);
            imageView2.setImageResource(com.tencent.mm.R.raw.collect_bottom_logo_hk);
        }
    }

    @Override // com.tencent.mm.plugin.collect.ui.CollectMainUI
    public void o7() {
        super.o7();
        if (this.V) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.c3d);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.c3d);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.collect.ui.CollectMainUI, com.tencent.mm.wallet_core.ui.WalletPreferenceUI, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.E1.setVisibility(8);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.c3d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.c4j);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V6().c(1335);
        addIconOptionMenu(0, com.tencent.mm.R.drawable.chy, new zw1.k0(this));
        t7();
    }

    @Override // com.tencent.mm.plugin.collect.ui.CollectMainUI, com.tencent.mm.wallet_core.ui.WalletPreferenceUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        V6().i(1335);
    }
}
