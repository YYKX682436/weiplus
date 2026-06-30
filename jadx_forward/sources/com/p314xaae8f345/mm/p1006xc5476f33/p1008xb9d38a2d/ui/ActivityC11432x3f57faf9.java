package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.account.ui.LoginSelectUI */
/* loaded from: classes11.dex */
public class ActivityC11432x3f57faf9 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f154924e = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f154925d;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getHeaderResourceId */
    public int mo48679xfc6e1bac() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570765bt1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576432b0;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        v61.g0 g0Var = v61.h0.f514974a;
        if (!com.p314xaae8f345.mm.ui.bk.A()) {
            super.onBackPressed();
            return;
        }
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(this);
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

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        if (m79335xcc101dd9() != null) {
            m79335xcc101dd9().setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) m79335xcc101dd9().getLayoutParams();
            layoutParams.width = com.p314xaae8f345.mm.ui.zk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.d_);
            m79335xcc101dd9().setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f154925d = m79336x8b97809d;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).m("phone_and_pad", true);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154925d).notifyDataSetChanged();
        v65.i.b(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("aspad", this, 1), null, new c01.i1(new c01.j1() { // from class: com.tencent.mm.plugin.account.ui.LoginSelectUI$$a
            @Override // c01.j1
            public final void a(boolean z17) {
                final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11432x3f57faf9 activityC11432x3f57faf9 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11432x3f57faf9.this;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11432x3f57faf9.f154924e;
                activityC11432x3f57faf9.getClass();
                if (z17) {
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginSelectUI$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11432x3f57faf9 activityC11432x3f57faf92 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11432x3f57faf9.this;
                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC11432x3f57faf92.f154925d).m("phone_and_pad", false);
                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC11432x3f57faf92.f154925d).notifyDataSetChanged();
                        }
                    });
                }
            }
        }, android.os.Build.BRAND.toLowerCase(), wo.w0.m() + android.os.Build.CPU_ABI, null), 1, null);
        if (com.p314xaae8f345.mm.ui.bk.Q()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154925d).h("phone_and_pad").L(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fe8));
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154925d).h("only_pad").L(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fe9));
        }
        v61.g0 g0Var = v61.h0.f514974a;
        if (com.p314xaae8f345.mm.ui.bk.A()) {
            m78560xe21cbbf(false);
        } else {
            mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x6(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str.equals("phone_and_pad")) {
            j45.l.h(this, "login_exdevice", ".ui.LoginAsExDeviceUI");
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559343c4, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.J(1570L, 1L);
        } else if (str.equals("only_pad")) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
            intent.putExtra("mobile_input_purpose", 1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginSelectUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginSelectUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.J(1570L, 0L);
        }
        return false;
    }
}
