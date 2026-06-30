package vc1;

/* loaded from: classes13.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.q2 f516453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516454f;

    public c0(vc1.p1 p1Var, java.lang.String str, vc1.q2 q2Var, o91.d dVar) {
        this.f516454f = p1Var;
        this.f516452d = str;
        this.f516453e = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a;
        vc1.p1 p1Var = this.f516454f;
        java.lang.String str = this.f516452d;
        vc1.q2 q2Var = this.f516453e;
        p1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s updateMarker markerId:%s", p1Var, str);
        vc1.o1 z17 = p1Var.z(str);
        if (z17 != null) {
            vc1.o2 o2Var = q2Var.f516681s;
            rl1.f fVar = null;
            if (o2Var != null) {
                if (o2Var.f516584r == null && o2Var.f516585s == null) {
                    synchronized (p1Var.f516637w) {
                        z17.f516565e = null;
                    }
                } else {
                    z17.f516558b.f516681s = o2Var;
                    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a2 = z17.f516563c;
                    if (interfaceC4409x88f1805a2 != null) {
                        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                            vc1.o2 o2Var2 = q2Var.f516681s;
                            interfaceC4409x88f1805a2.mo37256x95d998f3(o2Var2.f516582p, o2Var2.f516583q);
                        } else {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vc1.f0(p1Var, interfaceC4409x88f1805a2, q2Var));
                        }
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a3 = z17.f516563c;
                    if (interfaceC4409x88f1805a3 == null || q2Var.f516681s.f516580n != 1) {
                        p1Var.J(z17);
                    } else {
                        p1Var.d0(interfaceC4409x88f1805a3);
                    }
                }
            }
            if (q2Var.f516682t != null) {
                z17.f516564d.mo37126xc84af884();
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 interfaceC26062x676db5b8 = z17.f516566f;
                if (interfaceC26062x676db5b8 != null && (interfaceC4409x88f1805a = z17.f516563c) != null) {
                    interfaceC4409x88f1805a.mo37246x63b3d9b2(interfaceC26062x676db5b8);
                }
                p1Var.S(str + "#label");
                com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 c4410xea4764e4 = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4();
                c4410xea4764e4.m37307x2c929929(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(q2Var.f516665c, q2Var.f516666d));
                java.util.LinkedList linkedList = vc1.i3.f516517a;
                synchronized (linkedList) {
                    if (linkedList.size() > 0) {
                        fVar = (rl1.f) linkedList.removeFirst();
                        if (fVar != null && android.view.ViewGroup.class.isInstance(fVar.getParent())) {
                            ((android.view.ViewGroup) fVar.getParent()).removeView(fVar);
                        }
                    }
                }
                if (fVar == null) {
                    fVar = new rl1.f(p1Var.f516593a);
                }
                fVar.a();
                fVar.m162696x1c5c5ff4(q2Var.f516682t.f516646b);
                fVar.m162698x3abfd950(q2Var.f516682t.f516647c);
                fVar.m162695x765074af(q2Var.f516682t.f516645a);
                fVar.m162697xe1b8c62(q2Var.f516682t.f516655k);
                fVar.m162694xc1f6fb8c(q2Var.f516682t.f516654j);
                vc1.p2 p2Var = q2Var.f516682t;
                fVar.b(p2Var.f516651g, p2Var.f516652h, p2Var.f516653i, p2Var.f516650f);
                fVar.m162699x35d036(q2Var.f516682t.f516648d);
                fVar.m162700x35d037(q2Var.f516682t.f516649e);
                vc1.p2 p2Var2 = q2Var.f516682t;
                int i17 = p2Var2.f516657m;
                int i18 = p2Var2.f516656l;
                if (i17 > -1 && i18 > -1) {
                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) fVar.f478702d.getLayoutParams();
                    layoutParams.width = i17;
                    layoutParams.height = i18;
                    fVar.f478702d.setLayoutParams(layoutParams);
                    fVar.invalidate();
                }
                fVar.measure(0, 0);
                c4410xea4764e4.m37268xabc2c2b5(fVar.m162692xa62d00d(), fVar.m162693xa62d00e());
                c4410xea4764e4.m37306x427c95ff(fVar);
                c4410xea4764e4.m37315x1bd1f072(true);
                c4410xea4764e4.tag(str + "#label");
                c4410xea4764e4.m37316xd4677478(q2Var.f516675m + 3);
                c4410xea4764e4.m37305x6219b84(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17474x283bb828);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q2Var.f516676n) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q2Var.f516677o)) {
                    c4410xea4764e4.m37296x2f238da1(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4402xa5f569c1(q2Var.f516676n, q2Var.f516677o));
                }
                p1Var.X(c4410xea4764e4, q2Var, true);
                if (android.text.TextUtils.isEmpty(q2Var.f516679q) || !q2Var.f516679q.contains("marker")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "addCollisionUnit for label");
                    z17.f516564d = p1Var.f516601e.mo98897xb5885626().mo98940xf4c43c3b(c4410xea4764e4);
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a4 = z17.f516563c;
                    if (interfaceC4409x88f1805a4 != null) {
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 mo37227x5ead30b5 = interfaceC4409x88f1805a4.mo37227x5ead30b5(ey5.x.h(c4410xea4764e4));
                        z17.f516566f = mo37227x5ead30b5;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        objArr[0] = java.lang.Boolean.valueOf(mo37227x5ead30b5 != null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "addCollisionUnit for label result:%b", objArr);
                    }
                }
                p1Var.r(str + "#label", z17);
            }
        }
    }
}
