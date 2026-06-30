package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class i1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 f259436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734) {
        super(false);
        this.f259436d = activityC19003x7959c734;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734 = this.f259436d;
        activityC19003x7959c734.f259383z.clear();
        hs4.d dVar = activityC19003x7959c734.f259377t;
        if (dVar != null && dVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "mmBottomSheet != null && mmBottomSheet.isShowing(),dont show bottomSheet");
            return;
        }
        activityC19003x7959c734.f259377t = new hs4.d(activityC19003x7959c734);
        java.util.List list = activityC19003x7959c734.f259365e;
        if (list == null) {
            list = new java.util.LinkedList();
        }
        int size = list.size();
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) list.get(i17);
            if (activityC19003x7959c734.f259366f != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69225xed6d60f6) && activityC19003x7959c734.f259366f.f69225xed6d60f6.equals(c19091x9511676c.f69225xed6d60f6)) {
                size = i17;
            }
        }
        if (activityC19003x7959c734.f259366f == null) {
            size = -1;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_payment_select_remove_confirm_button_android, false);
        activityC19003x7959c734.f259377t.f366151c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.n1(activityC19003x7959c734, list);
        db5.g4 g4Var = new db5.g4(activityC19003x7959c734);
        g4Var.r(0, activityC19003x7959c734.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfk), null, activityC19003x7959c734.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80242x3fc51eb4), activityC19003x7959c734.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834), false);
        if (fj6) {
            g4Var.t(1, "", true);
        }
        hs4.d dVar2 = activityC19003x7959c734.f259377t;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.o1(activityC19003x7959c734);
        dVar2.f366155g = g4Var;
        dVar2.f366153e = o1Var;
        if (fj6) {
            dVar2.f366152d = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.p1(activityC19003x7959c734, list);
        } else {
            dVar2.f366149a.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.q1(activityC19003x7959c734, list);
        }
        android.view.View inflate = android.view.View.inflate(activityC19003x7959c734, com.p314xaae8f345.mm.R.C30864xbddafb2a.btw, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ixu);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kef);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.cx_);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI", "showBankcardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI", "showBankcardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.findViewById(com.p314xaae8f345.mm.R.id.iwt).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.r1(activityC19003x7959c734));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.iwt).setContentDescription(activityC19003x7959c734.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdv));
        hs4.d dVar3 = activityC19003x7959c734.f259377t;
        dVar3.f366149a.t(inflate);
        dVar3.f366158j = inflate;
        hs4.d dVar4 = activityC19003x7959c734.f259377t;
        dVar4.f366161m = size;
        dVar4.f366160l = true;
        if (fj6) {
            dVar4.f366159k = false;
        } else {
            dVar4.f366159k = true;
        }
        dVar4.f366149a.y(activityC19003x7959c734.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl_));
        activityC19003x7959c734.f259377t.d();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.s1(activityC19003x7959c734, textView), 500L);
        activityC19003x7959c734.m83133x1e3567d1();
    }
}
