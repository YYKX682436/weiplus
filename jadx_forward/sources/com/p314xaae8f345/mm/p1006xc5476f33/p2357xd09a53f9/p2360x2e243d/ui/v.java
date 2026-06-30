package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* loaded from: classes9.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e f260179d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e activityC19024x28e2705e) {
        this.f260179d = activityC19024x28e2705e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e activityC19024x28e2705e = this.f260179d;
        if (id6 == com.p314xaae8f345.mm.R.id.f569189pc1) {
            at4.n a17 = at4.n.a();
            if (a17.b()) {
                db5.e1.s(activityC19024x28e2705e, a17.f95435b, activityC19024x28e2705e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
                yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(19, 1);
                activityC19024x28e2705e.U6(null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14422, 2);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.pc6) {
            java.lang.Object tag = view.getTag();
            long time = new java.util.Date().getTime();
            view.setTag(java.lang.Long.valueOf(time));
            if (tag != null && time - ((java.lang.Long) tag).longValue() < 1000) {
                yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
            intent.putExtra("rawUrl", activityC19024x28e2705e.f260095t.f67917xc70051c8);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC19024x28e2705e.mo55332x76847179(), intent);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOAN_ENTRANCE_RED_POINT_INT, java.lang.Integer.valueOf(activityC19024x28e2705e.f260095t.f67918x1f185da9));
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(6, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
