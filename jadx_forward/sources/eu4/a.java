package eu4;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void d(android.app.Activity activity, int i17, int i18) {
        super.d(activity, i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void e(android.app.Activity activity, cu4.f fVar, cu4.e eVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public boolean f() {
        return ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_FACEID_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public cu4.f i() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i.f262898a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i.f262898a = new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i();
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i.f262898a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    /* renamed from: init */
    public void mo74014x316510() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance;
        lVar.k(true);
        lVar.m(3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public boolean k(android.app.Activity activity, cu4.f fVar) {
        if (fVar != null && !((com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i) fVar).a(activity)) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f();
        am.n10 n10Var = c6244x161a780f.f136493g;
        n10Var.f88925a = 0;
        n10Var.f88926b = activity;
        c6244x161a780f.e();
        if (((java.lang.Integer) c6244x161a780f.f136494h.f89038a).intValue() != 17) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.class);
        intent.addFlags(131072);
        intent.putExtra("action", "action.verify_pattern");
        intent.putExtra("next_action", "next_action.goto_protected_page");
        intent.putExtra("page_intent", activity.getIntent());
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, m(activity));
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/faceid/FaceIdLockImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/walletlock/faceid/FaceIdLockImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.finish();
        return true;
    }
}
