package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class s6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v6 f262148d;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v6 v6Var) {
        this.f262148d = v6Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v6 v6Var = this.f262148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions) ((java.util.ArrayList) v6Var.f262204d.f261599w.f262345d).get(i17);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(promotions.f261309i);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 activityC19117x82d08fb8 = v6Var.f262204d;
        if (K0) {
            java.lang.String d76 = activityC19117x82d08fb8.d7(promotions.f261312o);
            if ("-1".equals(d76) || "3".equals(d76)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.d(13472, activityC19117x82d08fb8.f261602z, java.lang.Integer.valueOf(promotions.f261313p), 1, java.lang.Long.valueOf(promotions.f261312o), java.lang.Long.valueOf(promotions.f261320w));
                g0Var.d(13033, 2, "", promotions.f261308h, promotions.f261306f, "");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(promotions.f261318u) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(promotions.f261319v)) {
                    int i18 = promotions.f261313p;
                    if (i18 == 1) {
                        activityC19117x82d08fb8.getClass();
                        activityC19117x82d08fb8.m83096xe7b1ccf7(new ss4.t(promotions, activityC19117x82d08fb8.m83107xcc3330f3(), activityC19117x82d08fb8.f261598v, promotions.f261320w));
                    } else if (i18 != 2 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(promotions.f261308h)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOrderInfoOldUI", "promotion's activityActionType != ACTION_TYPE_NORMAL and url is null,unknow option");
                    } else {
                        if (activityC19117x82d08fb8.B.containsKey(promotions.f261312o + "")) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.w6 w6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.w6) activityC19117x82d08fb8.B.get(promotions.f261312o + "");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoOldUI", "go to new url %s", w6Var.f262297a);
                            activityC19117x82d08fb8.g7();
                            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC19117x82d08fb8, w6Var.f262297a, false);
                            activityC19117x82d08fb8.C = false;
                        } else {
                            java.lang.String str = promotions.f261308h;
                            activityC19117x82d08fb8.f261597u = str;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z6 z6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z6(activityC19117x82d08fb8, promotions.f261312o + "", promotions.f261314q + "", promotions.f261315r + "", promotions.f261316s + "", activityC19117x82d08fb8.m83107xcc3330f3(), activityC19117x82d08fb8.f261602z, promotions.f261320w);
                            activityC19117x82d08fb8.g7();
                            activityC19117x82d08fb8.A = z6Var;
                            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.W(activityC19117x82d08fb8, str, false, 1);
                            activityC19117x82d08fb8.C = false;
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoOldUI", "promotion jump tiny app, username: %s, path: %s", promotions.f261318u, promotions.f261319v);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
                    java.lang.String str2 = promotions.f261318u;
                    am.nx nxVar = c6113xa3727625.f136390g;
                    nxVar.f88999a = str2;
                    java.lang.String str3 = promotions.f261319v;
                    if (str3 == null) {
                        str3 = "";
                    }
                    nxVar.f89000b = str3;
                    nxVar.f89002d = ad1.d.f23x366c91de;
                    nxVar.f89003e = activityC19117x82d08fb8.f261598v;
                    nxVar.f89001c = 0;
                    c6113xa3727625.e();
                    g0Var.d(14118, activityC19117x82d08fb8.f261598v, activityC19117x82d08fb8.m83107xcc3330f3(), 2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 activityC19117x82d08fb82 = v6Var.f262204d;
                    activityC19117x82d08fb82.A = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z6(activityC19117x82d08fb82, promotions.f261312o + "", promotions.f261314q + "", promotions.f261315r + "", promotions.f261316s + "", activityC19117x82d08fb8.m83107xcc3330f3(), activityC19117x82d08fb8.f261602z, promotions.f261320w);
                    activityC19117x82d08fb8.C = true;
                }
            }
        } else {
            if (((java.util.HashSet) activityC19117x82d08fb8.f261593q).contains(promotions.f261309i)) {
                ((java.util.HashSet) activityC19117x82d08fb8.f261593q).remove(promotions.f261309i);
            } else {
                ((java.util.HashSet) activityC19117x82d08fb8.f261593q).add(promotions.f261309i);
            }
            activityC19117x82d08fb8.f261591o.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
