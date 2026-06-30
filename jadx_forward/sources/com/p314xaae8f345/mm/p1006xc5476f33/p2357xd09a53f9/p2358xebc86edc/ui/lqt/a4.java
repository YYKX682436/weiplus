package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class a4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 f259623d;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936) {
        this.f259623d = activityC19014x45f83936;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936.f259513y0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936 = this.f259623d;
        activityC19014x45f83936.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanAddUI", "show bankcard menu");
        if (activityC19014x45f83936.f259531w.isShown()) {
            activityC19014x45f83936.mo73823x964575a5();
        }
        hs4.d dVar = activityC19014x45f83936.Z;
        if (dVar == null || !dVar.a()) {
            activityC19014x45f83936.Z = new hs4.d(activityC19014x45f83936);
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_payment_select_remove_confirm_button_android, false);
            java.util.List list = activityC19014x45f83936.G;
            if (list == null) {
                list = new java.util.LinkedList();
            }
            int size = list.size();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c76 = activityC19014x45f83936.c7(activityC19014x45f83936.I.f462700h);
            if (c76 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c76.f69225xed6d60f6)) {
                for (int i18 = 0; i18 < list.size(); i18++) {
                    if (c76.f69225xed6d60f6.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) list.get(i18)).f69225xed6d60f6)) {
                        size = i18;
                    }
                }
            }
            if (c76 == null) {
                size = -1;
            }
            activityC19014x45f83936.Z.f366151c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.b3(activityC19014x45f83936, list);
            db5.g4 g4Var = new db5.g4(activityC19014x45f83936);
            g4Var.r(0, activityC19014x45f83936.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpz), null, activityC19014x45f83936.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80242x3fc51eb4), activityC19014x45f83936.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834), false);
            if (fj6) {
                g4Var.t(1, "", true);
            }
            hs4.d dVar2 = activityC19014x45f83936.Z;
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.c3 c3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.c3(activityC19014x45f83936);
            dVar2.f366155g = g4Var;
            dVar2.f366153e = c3Var;
            if (fj6) {
                dVar2.f366152d = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d3(activityC19014x45f83936, list);
            } else {
                dVar2.f366149a.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.e3(activityC19014x45f83936, list);
            }
            android.view.View inflate = android.view.View.inflate(activityC19014x45f83936, com.p314xaae8f345.mm.R.C30864xbddafb2a.btw, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ixu);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kpx);
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.cx_);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI", "showBankcardListMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI", "showBankcardListMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.findViewById(com.p314xaae8f345.mm.R.id.iwt).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.g3(activityC19014x45f83936));
            inflate.findViewById(com.p314xaae8f345.mm.R.id.iwt).setContentDescription(activityC19014x45f83936.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdv));
            hs4.d dVar3 = activityC19014x45f83936.Z;
            dVar3.f366149a.t(inflate);
            dVar3.f366158j = inflate;
            hs4.d dVar4 = activityC19014x45f83936.Z;
            dVar4.f366161m = size;
            dVar4.f366160l = true;
            if (fj6) {
                dVar4.f366159k = false;
            } else {
                dVar4.f366159k = true;
            }
            dVar4.f366149a.y(activityC19014x45f83936.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl_));
            activityC19014x45f83936.Z.d();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.h3(activityC19014x45f83936, textView), 500L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanAddUI", "mmBottomSheet != null && mmBottomSheet.isShowing(),dont show bottomSheet");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
