package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19051x8c89d8ba f260535d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19051x8c89d8ba activityC19051x8c89d8ba) {
        this.f260535d = activityC19051x8c89d8ba;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pwd/ui/WalletLuckyMoneyRefundWayUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLuckyMoneyRefundWayUI", "mOriginWay click!!");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19051x8c89d8ba activityC19051x8c89d8ba = this.f260535d;
        gs4.f fVar = activityC19051x8c89d8ba.f260450i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.g2 g2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.g2(activityC19051x8c89d8ba, fVar);
        android.view.ViewGroup viewGroup = null;
        android.view.View inflate = android.view.View.inflate(activityC19051x8c89d8ba, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571167d83, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.m7j);
        int i17 = 0;
        if (fVar.f356623j.size() > 0) {
            java.util.Iterator it = fVar.f356623j.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                gs4.g gVar = (gs4.g) it.next();
                i18++;
                android.view.View inflate2 = android.view.View.inflate(activityC19051x8c89d8ba, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571168d84, viewGroup);
                linearLayout.addView(inflate2);
                if (i18 != 1) {
                    android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) inflate2.getLayoutParams();
                    if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                        layoutParams = new android.view.ViewGroup.MarginLayoutParams((android.view.ViewGroup.LayoutParams) layoutParams);
                    }
                    layoutParams.setMargins(i17, i65.a.b(activityC19051x8c89d8ba, 24), i17, i17);
                    inflate2.setLayoutParams(layoutParams);
                }
                android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.h5n);
                android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.obc);
                android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.nrk);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f356628d)) {
                    n11.a.b().h(gVar.f356627c, imageView, new o11.f().a());
                } else {
                    n11.a b17 = n11.a.b();
                    java.lang.String str = gVar.f356627c;
                    o11.f fVar2 = new o11.f();
                    fVar2.f423617h = gVar.f356628d;
                    b17.h(str, imageView, fVar2.a());
                }
                textView.setText(gVar.f356625a);
                textView2.setText(gVar.f356626b);
                viewGroup = null;
                i17 = 0;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC19051x8c89d8ba);
        u1Var.u(fVar.f356622i);
        u1Var.d(inflate);
        u1Var.n(activityC19051x8c89d8ba.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575102kr5));
        u1Var.k(activityC19051x8c89d8ba.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aa6));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.f2(g2Var));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pwd/ui/WalletLuckyMoneyRefundWayUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
