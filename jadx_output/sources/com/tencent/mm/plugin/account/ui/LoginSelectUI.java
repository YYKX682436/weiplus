package com.tencent.mm.plugin.account.ui;

@ul5.d(0)
/* loaded from: classes11.dex */
public class LoginSelectUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f73391e = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f73392d;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getHeaderResourceId() {
        return com.tencent.mm.R.layout.f489232bt1;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494899b0;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        v61.g0 g0Var = v61.h0.f433441a;
        if (!com.tencent.mm.ui.bk.A()) {
            super.onBackPressed();
            return;
        }
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this);
        b17.addFlags(67108864);
        b17.putExtra("can_finish", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginSelectUI", "onBackPressed", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginSelectUI", "onBackPressed", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        db5.f.k(this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        if (getListView() != null) {
            getListView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getListView().getLayoutParams();
            layoutParams.width = com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.d_);
            getListView().setLayoutParams(layoutParams);
        }
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f73392d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).m("phone_and_pad", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f73392d).notifyDataSetChanged();
        v65.i.b(new com.tencent.mm.sdk.coroutines.LifecycleScope("aspad", this, 1), null, new c01.i1(new c01.j1() { // from class: com.tencent.mm.plugin.account.ui.LoginSelectUI$$a
            @Override // c01.j1
            public final void a(boolean z17) {
                final com.tencent.mm.plugin.account.ui.LoginSelectUI loginSelectUI = com.tencent.mm.plugin.account.ui.LoginSelectUI.this;
                int i17 = com.tencent.mm.plugin.account.ui.LoginSelectUI.f73391e;
                loginSelectUI.getClass();
                if (z17) {
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginSelectUI$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.account.ui.LoginSelectUI loginSelectUI2 = com.tencent.mm.plugin.account.ui.LoginSelectUI.this;
                            ((com.tencent.mm.ui.base.preference.h0) loginSelectUI2.f73392d).m("phone_and_pad", false);
                            ((com.tencent.mm.ui.base.preference.h0) loginSelectUI2.f73392d).notifyDataSetChanged();
                        }
                    });
                }
            }
        }, android.os.Build.BRAND.toLowerCase(), wo.w0.m() + android.os.Build.CPU_ABI, null), 1, null);
        if (com.tencent.mm.ui.bk.Q()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f73392d).h("phone_and_pad").L(getResources().getString(com.tencent.mm.R.string.fe8));
            ((com.tencent.mm.ui.base.preference.h0) this.f73392d).h("only_pad").L(getResources().getString(com.tencent.mm.R.string.fe9));
        }
        v61.g0 g0Var = v61.h0.f433441a;
        if (com.tencent.mm.ui.bk.A()) {
            setBackBtnVisible(false);
        } else {
            setBackBtn(new com.tencent.mm.plugin.account.ui.x6(this));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (str.equals("phone_and_pad")) {
            j45.l.h(this, "login_exdevice", ".ui.LoginAsExDeviceUI");
            overridePendingTransition(com.tencent.mm.R.anim.f477810c4, com.tencent.mm.R.anim.f477728p);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.J(1570L, 1L);
        } else if (str.equals("only_pad")) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
            intent.putExtra("mobile_input_purpose", 1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginSelectUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginSelectUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.J(1570L, 0L);
        }
        return false;
    }
}
