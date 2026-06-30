package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class vp implements com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hq {

    /* renamed from: a, reason: collision with root package name */
    public final long f243210a = java.lang.System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 f243211b;

    public vp(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7) {
        this.f243211b = activityC17486x3b418ac7;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.eq eqVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactUI", "[onLoading] type:%s", eqVar.name());
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = this.f243211b;
        android.view.View findViewById = activityC17486x3b418ac7.findViewById(com.p314xaae8f345.mm.R.id.o_j);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = activityC17486x3b418ac7.findViewById(com.p314xaae8f345.mm.R.id.lbl);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (eqVar == com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.eq.NORMAL) {
            activityC17486x3b418ac7.f242308p.setText(activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc));
        } else if (eqVar == com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.eq.OVER_ONE_MIN) {
            activityC17486x3b418ac7.f242308p.setText(activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2v));
        }
    }

    public void b(java.util.HashSet hashSet) {
        java.lang.String P0;
        java.lang.String a17;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(hashSet == null ? 0 : hashSet.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactUI", "[onResult] size:%s", objArr);
        if (hashSet != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = this.f243211b;
            java.util.ArrayList arrayList = activityC17486x3b418ac7.f242312t;
            arrayList.clear();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = hashSet.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                linkedList.add((java.lang.String) it.next());
                i17++;
                if (i17 % 200 == 0 || i17 == hashSet.size()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                    Bi.getClass();
                    iz5.a.g(null, linkedList.size() > 0);
                    java.lang.String str = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,type from rcontact  where ";
                    for (int i18 = 0; i18 < linkedList.size(); i18++) {
                        str = i18 != linkedList.size() - 1 ? str + "username = '" + ((java.lang.String) linkedList.get(i18)) + "' OR " : str + "username = '" + ((java.lang.String) linkedList.get(i18)) + "'";
                    }
                    android.database.Cursor B = Bi.f276604d.B(str + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ", null);
                    if (B != null) {
                        B.moveToFirst();
                        while (!B.isAfterLast()) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                            z3Var.mo9015xbf5d97fd(B);
                            if (z3Var.r2()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp ypVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp(activityC17486x3b418ac7, z3Var);
                                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = ypVar.f243333c;
                                if (z3Var2 == null) {
                                    P0 = null;
                                } else {
                                    P0 = z3Var2.P0();
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var2.w0())) {
                                        P0 = z3Var2.w0();
                                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P0)) {
                                        P0 = z3Var2.f2();
                                    }
                                }
                                if (android.text.TextUtils.isEmpty(P0)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UnfamiliarContactUI", "[%s:%s]", z3Var.d1(), z3Var.P0());
                                    a17 = "";
                                } else {
                                    a17 = com.p314xaae8f345.mm.p1004x2137b148.C11326x85391f34.a(P0.charAt(0));
                                }
                                ypVar.f243331a = (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) && a17.matches("[a-zA-Z]+$")) ? a17.toLowerCase().substring(0, 1) : com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7.B;
                                ypVar.f243332b = P0;
                                arrayList.add(ypVar);
                                B.moveToNext();
                            } else {
                                z3Var.P0();
                                B.moveToNext();
                            }
                        }
                        B.close();
                    }
                    linkedList.clear();
                }
            }
            java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hp(activityC17486x3b418ac7));
            activityC17486x3b418ac7.U6(arrayList);
        }
    }
}
