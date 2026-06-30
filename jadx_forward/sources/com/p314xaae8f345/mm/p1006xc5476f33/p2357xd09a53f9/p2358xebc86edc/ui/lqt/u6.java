package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class u6 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb) {
        super(false);
        this.f259932d = activityC19020x7623dbfb;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        r45.kd kdVar;
        int i17;
        java.util.LinkedList linkedList;
        int i18;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259932d;
        long j17 = activityC19020x7623dbfb.T;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < 800) {
            return;
        }
        activityC19020x7623dbfb.T = android.os.SystemClock.elapsedRealtime();
        int i76 = activityC19020x7623dbfb.i7(activityC19020x7623dbfb.f259589h.m83183xfb85ada3(), "100");
        if (i76 > 0) {
            activityC19020x7623dbfb.mo73823x964575a5();
            int i27 = activityC19020x7623dbfb.S;
            int i28 = 1;
            if (i27 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "click save lqt");
                if (activityC19020x7623dbfb.q7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259202q.f259216l)) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z2 z2Var = activityC19020x7623dbfb.f259587f.f259152b;
                int i29 = activityC19020x7623dbfb.Z;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = activityC19020x7623dbfb.U;
                z2Var.getClass();
                ((km5.q) ((km5.q) km5.u.g(java.lang.Integer.valueOf(i76), java.lang.Integer.valueOf(i29), c19091x9511676c)).n(z2Var).h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.q6(this, i76))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.p6(this));
                return;
            }
            if (i27 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "click fetch lqt");
                if (activityC19020x7623dbfb.q7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259202q.f259217m)) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = activityC19020x7623dbfb.U;
                android.view.ViewGroup viewGroup = null;
                if (c19091x9511676c2 == null || c19091x9511676c2.v0()) {
                    kdVar = null;
                } else {
                    kdVar = new r45.kd();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3 = activityC19020x7623dbfb.U;
                    kdVar.f460129f = c19091x9511676c3.f69217xaef0808c;
                    kdVar.f460128e = c19091x9511676c3.f69223x58802fcb;
                    kdVar.f460127d = c19091x9511676c3.f69225xed6d60f6;
                    kdVar.f460130g = c19091x9511676c3.f69222x587fd4e1;
                }
                boolean z18 = false;
                int i37 = activityC19020x7623dbfb.G.m73818x2858fc88() != null ? activityC19020x7623dbfb.G.m73818x2858fc88().f452429d : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c4 = activityC19020x7623dbfb.U;
                if (c19091x9511676c4 != null && !c19091x9511676c4.v0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "choose bankcard");
                    int i07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i0(activityC19020x7623dbfb.f259589h.m83183xfb85ada3(), "100");
                    int i38 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.m1.b().a().f466830t;
                    if (i38 >= 0 && i07 > i38) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "choose slow redeem");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "showHalfBottomDialogForSlowRedeem");
                        r45.ry4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.m1.b().a();
                        if (a17 == null || (linkedList = a17.f466825o) == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "showHalfBottomDialogForSlowRedeem res == null ||  res.redeem_displayed_info == null");
                            return;
                        }
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            r45.pd pdVar = (r45.pd) it.next();
                            if (pdVar.f464485d.equals(activityC19020x7623dbfb.U.f69225xed6d60f6)) {
                                activityC19020x7623dbfb.G.b(pdVar.f464486e, z18);
                                r45.u66 u66Var = pdVar.f464487f;
                                activityC19020x7623dbfb.mo48632xd46dd964();
                                activityC19020x7623dbfb.mo73823x964575a5();
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC19020x7623dbfb.mo55332x76847179(), i28, 3);
                                z2Var2.m(activityC19020x7623dbfb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kp_), activityC19020x7623dbfb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpn));
                                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.n7 n7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.n7(activityC19020x7623dbfb, z2Var2);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.o7 o7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.o7(activityC19020x7623dbfb, z2Var2);
                                z2Var2.D = n7Var;
                                z2Var2.E = o7Var;
                                android.view.View inflate = android.view.View.inflate(activityC19020x7623dbfb.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bte, viewGroup);
                                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gwd)).setText(u66Var.f468622d);
                                z2Var2.s(inflate);
                                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(activityC19020x7623dbfb);
                                linearLayout.setOrientation(i28);
                                java.util.LinkedList linkedList2 = u66Var.f468624f;
                                int i39 = com.p314xaae8f345.mm.R.id.gw8;
                                int i47 = com.p314xaae8f345.mm.R.C30864xbddafb2a.btc;
                                if (linkedList2 == null || linkedList2.size() <= 0) {
                                    java.util.Iterator it6 = u66Var.f468623e.iterator();
                                    while (it6.hasNext()) {
                                        r45.if0 if0Var = (r45.if0) it6.next();
                                        if (if0Var != null && if0Var.f458514d != null) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.r7 r7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.r7(activityC19020x7623dbfb, if0Var);
                                            android.view.View view2 = (android.widget.LinearLayout) android.view.View.inflate(activityC19020x7623dbfb, com.p314xaae8f345.mm.R.C30864xbddafb2a.btc, null);
                                            activityC19020x7623dbfb.l7(if0Var.f458514d, if0Var.f458515e, if0Var.f458516f, (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.gw8), r7Var);
                                            linearLayout.addView(view2);
                                        }
                                    }
                                    viewGroup = null;
                                } else {
                                    int i48 = z18 ? 1 : 0;
                                    while (i48 < linkedList2.size()) {
                                        r45.if0 if0Var2 = (r45.if0) linkedList2.get(i48);
                                        if (if0Var2 == null) {
                                            i18 = i48;
                                            i19 = i47;
                                        } else {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.q7 q7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.q7(activityC19020x7623dbfb, if0Var2, z2Var2);
                                            if (i48 < linkedList2.size() - i28) {
                                                android.view.View view3 = (android.widget.LinearLayout) android.view.View.inflate(activityC19020x7623dbfb, i47, viewGroup);
                                                ((android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.gw9)).setVisibility(8);
                                                android.widget.TextView textView = (android.widget.TextView) view3.findViewById(i39);
                                                java.lang.String str = if0Var2.f458514d;
                                                java.lang.String str2 = if0Var2.f458515e;
                                                java.lang.String str3 = if0Var2.f458516f;
                                                i18 = i48;
                                                i19 = com.p314xaae8f345.mm.R.C30864xbddafb2a.btc;
                                                activityC19020x7623dbfb.l7(str, str2, str3, textView, q7Var);
                                                linearLayout.addView(view3);
                                            } else {
                                                i18 = i48;
                                                i19 = i47;
                                                android.view.View view4 = (android.widget.LinearLayout) android.view.View.inflate(activityC19020x7623dbfb, com.p314xaae8f345.mm.R.C30864xbddafb2a.btd, viewGroup);
                                                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                                                layoutParams.topMargin = i65.a.b(activityC19020x7623dbfb, 24);
                                                ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.gwb)).setText(if0Var2.f458514d);
                                                android.widget.TextView textView2 = (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.gwa);
                                                activityC19020x7623dbfb.l7("", if0Var2.f458515e, if0Var2.f458516f, textView2, q7Var);
                                                textView2.setAccessibilityDelegate(new com.p314xaae8f345.mm.p2802xd031a825.e(com.p314xaae8f345.p347x615374d.gen.EnumC3611x9c1951f.BUTTON));
                                                linearLayout.addView(view4, layoutParams);
                                            }
                                        }
                                        i48 = i18 + 1;
                                        i47 = i19;
                                        i28 = 1;
                                        viewGroup = null;
                                        i39 = com.p314xaae8f345.mm.R.id.gw8;
                                    }
                                }
                                z2Var2.j(linearLayout);
                                z2Var2.C();
                                activityC19020x7623dbfb.G.setVisibility(4);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20287, 4);
                                i28 = 1;
                                z18 = false;
                            }
                        }
                        return;
                    }
                    if (i38 >= 0 && i07 < i38) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "choose fast redeem");
                        i17 = 0;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.x2 x2Var = activityC19020x7623dbfb.f259587f.f259153c;
                        int i49 = activityC19020x7623dbfb.Z;
                        x2Var.getClass();
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(i76);
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i49);
                        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
                        km5.q qVar = new km5.q();
                        qVar.y(valueOf, valueOf2, valueOf3, kdVar);
                        qVar.n(x2Var);
                        ((km5.q) qVar.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t6(this, i76))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.s6(this));
                    }
                }
                i17 = i37;
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.x2 x2Var2 = activityC19020x7623dbfb.f259587f.f259153c;
                int i492 = activityC19020x7623dbfb.Z;
                x2Var2.getClass();
                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i76);
                java.lang.Integer valueOf22 = java.lang.Integer.valueOf(i492);
                java.lang.Integer valueOf32 = java.lang.Integer.valueOf(i17);
                km5.q qVar2 = new km5.q();
                qVar2.y(valueOf4, valueOf22, valueOf32, kdVar);
                qVar2.n(x2Var2);
                ((km5.q) qVar2.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t6(this, i76))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.s6(this));
            }
        }
    }
}
