package ns4;

/* loaded from: classes8.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f421062d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420) {
        this.f421062d = activityC19066x54c41420;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$setupViews$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long j17 = os4.h.f429812a;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < 600) {
            z17 = true;
        } else {
            os4.h.f429812a = android.os.SystemClock.elapsedRealtime();
            z17 = false;
        }
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$setupViews$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420 = this.f421062d;
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = activityC19066x54c41420.f260684f;
        if (viewOnFocusChangeListenerC22907xe18534c2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
            throw null;
        }
        java.lang.String m83183xfb85ada3 = viewOnFocusChangeListenerC22907xe18534c2.m83183xfb85ada3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m83183xfb85ada3, "getText(...)");
        int j18 = os4.h.j(m83183xfb85ada3, "100");
        if (j18 > 0) {
            ms4.n nVar = activityC19066x54c41420.f260687i;
            if (nVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            nVar.P6(6);
            activityC19066x54c41420.mo73823x964575a5();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click encash to cft ");
            ms4.n nVar2 = activityC19066x54c41420.f260687i;
            if (nVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            sb6.append(nVar2.f412600d);
            sb6.append(", ");
            sb6.append(j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", sb6.toString());
            long j19 = j18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "prepareEncashRequest, amount " + j19);
            ms4.n nVar3 = activityC19066x54c41420.f260687i;
            if (nVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            os4.a.a(nVar3.f412609p, java.lang.Boolean.TRUE);
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            nVar3.f412612s = uuid;
            nVar3.f412610q = j19;
            nVar3.O6(6, 1, 0, "");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 90);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            int i17 = nVar3.f412602f;
            java.lang.String str2 = nVar3.f412603g;
            int i18 = nVar3.f412601e;
            java.lang.String str3 = js4.r.f383100c;
            ms4.m mVar = new ms4.m(nVar3);
            ((c61.l7) b6Var).getClass();
            r45.m42 m42Var = new r45.m42();
            m42Var.set(1, db2.t4.f309704a.a(8949));
            m42Var.set(2, xy2.c.e(activityC19066x54c41420));
            m42Var.set(3, java.lang.Integer.valueOf(i18));
            m42Var.set(4, uuid);
            m42Var.set(5, java.lang.Long.valueOf(j19));
            m42Var.set(6, java.lang.Integer.valueOf(i17));
            m42Var.set(7, str2);
            m42Var.set(8, str3);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 8949;
            lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveprepareincomeencash";
            lVar.f152197a = m42Var;
            lVar.f152198b = new r45.n42();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
            wi6.p(a17);
            pq5.g l17 = wi6.l();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
            pm0.v.T(l17, new c61.v6(mVar)).f(activityC19066x54c41420);
            str = "(Landroid/view/View;)V";
        } else {
            str = "(Landroid/view/View;)V";
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$setupViews$clickListener$1", "android/view/View$OnClickListener", "onClick", str);
    }
}
