package com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/appmsg/ui/RecordDetailUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "feature-appmsg_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.appmsg.ui.RecordDetailUI */
/* loaded from: classes9.dex */
public final class ActivityC10460xf1280e36 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {
    public static final void U6(com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36 activityC10460xf1280e36, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        activityC10460xf1280e36.getClass();
        if (f9Var == null) {
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        n13.r rVar = new n13.r();
        rVar.f415651b = 1001;
        xd5.a aVar = new xd5.a();
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        int i17 = aVar.f125235d;
        aVar.set(i17 + 0, java.lang.Long.valueOf(m124847x74d37ac6));
        java.lang.String Q0 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        aVar.set(i17 + 1, Q0);
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.m126728xdc93280d(U1);
        aVar.n(cVar);
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activityC10460xf1280e36, aVar, rVar);
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570914em3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra = getIntent().getStringExtra("params");
        if (stringExtra == null) {
            finish();
            return;
        }
        hu.f fVar = new hu.f();
        fVar.m126727xb579bd1f(stringExtra);
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
        java.lang.String stringExtra3 = intent != null ? intent.getStringExtra("custom_send_text") : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordDetailUI", "want to send record msg, but toUser is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(fVar.q(), fVar.n());
        if (n17.m124847x74d37ac6() != fVar.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordDetailUI", "want to send record msg, but message info is null");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, false, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q, "showProgressDlg(...)");
        ((ku5.t0) ku5.t0.f394148d).g(new tu.c(stringExtra2, stringExtra3, n17, Q));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        l15.c cVar;
        jz5.f0 f0Var;
        java.util.List list;
        v05.b k17;
        java.lang.String str;
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("params");
        if (stringExtra == null) {
            finish();
        } else {
            hu.f fVar = new hu.f();
            fVar.m126727xb579bd1f(stringExtra);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k18 = pt0.f0.f439742b1.k(fVar.q(), fVar.n());
            java.lang.String str2 = "";
            java.lang.String str3 = null;
            if (k18 != null) {
                cVar = new l15.c();
                java.lang.String U1 = k18.U1();
                if (U1 == null) {
                    U1 = "";
                }
                cVar.m126728xdc93280d(U1);
            } else {
                cVar = null;
            }
            s15.w wVar = new s15.w();
            hu.f fVar2 = r26.n0.N(fVar.r()) ^ true ? fVar : null;
            jz5.f0 f0Var2 = jz5.f0.f384359a;
            if (fVar2 != null) {
                wVar.m126728xdc93280d(fVar2.r());
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                if (cVar != null) {
                    v05.b k19 = cVar.k();
                    if (k19 == null || (str = k19.m75945x2fec8307(k19.f513848e + 44)) == null) {
                        str = "";
                    }
                    wVar.m126728xdc93280d(str);
                } else {
                    f0Var2 = null;
                }
                if (f0Var2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordDetailUI", "invalid input");
                    finish();
                }
            }
            java.lang.String m134143x7531c8a2 = fVar.m134143x7531c8a2();
            if (!(!r26.n0.N(m134143x7531c8a2))) {
                m134143x7531c8a2 = null;
            }
            if (m134143x7531c8a2 == null) {
                if (cVar != null && (k17 = cVar.k()) != null) {
                    str3 = k17.m75945x2fec8307(k17.f449898d + 2);
                }
                m134143x7531c8a2 = str3 == null ? "" : str3;
            }
            mo54450xbf7c1df6(m134143x7531c8a2);
            java.text.SimpleDateFormat simpleDateFormat = vu.a.f521579a;
            s15.h hVar = (s15.h) kz5.n0.Z(wVar.j());
            s15.h hVar2 = (s15.h) kz5.n0.k0(wVar.j());
            java.lang.String e17 = vu.a.e(wVar, hVar != null ? hVar.Q() : 0L);
            java.lang.String e18 = vu.a.e(wVar, hVar2 != null ? hVar2.Q() : 0L);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17) && (hVar == null || (e17 = hVar.O()) == null)) {
                e17 = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e18) && (hVar2 == null || (e18 = hVar2.O()) == null)) {
                e18 = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e18)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordDetailItemEx", "subtitle time error!");
            } else {
                java.util.List g17 = new r26.t(" ").g(e17, 0);
                boolean isEmpty = g17.isEmpty();
                java.util.List list2 = kz5.p0.f395529d;
                if (!isEmpty) {
                    java.util.ListIterator listIterator = g17.listIterator(g17.size());
                    while (listIterator.hasPrevious()) {
                        if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                            list = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = list2;
                java.lang.String a17 = vu.a.a(((java.lang.String[]) list.toArray(new java.lang.String[0]))[0]);
                java.util.List g18 = new r26.t(" ").g(e18, 0);
                if (!g18.isEmpty()) {
                    java.util.ListIterator listIterator2 = g18.listIterator(g18.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            break;
                        }
                        if (!(((java.lang.String) listIterator2.previous()).length() == 0)) {
                            list2 = kz5.n0.K0(g18, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                java.lang.String a18 = vu.a.a(((java.lang.String[]) list2.toArray(new java.lang.String[0]))[0]);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, a18)) {
                    str2 = a17;
                } else {
                    str2 = a17 + ' ' + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jyc) + ' ' + a18;
                }
            }
            mo54449x3f86539a(str2);
            m78573x31241be9(mo55332x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            mo54448x9c8c0d33(new tu.a(this));
        }
        mo78530x8b45058f();
        java.lang.String stringExtra2 = getIntent().getStringExtra("params");
        if (stringExtra2 == null) {
            finish();
            return;
        }
        hu.f fVar3 = new hu.f();
        fVar3.m126727xb579bd1f(stringExtra2);
        boolean s17 = fVar3.s();
        if (s17) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new tu.g(this, pt0.f0.f439742b1.k(fVar3.q(), fVar3.n()), s17, fVar3));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(xu.k.class);
        set.add(xu.q.class);
        set.add(xu.p.class);
        set.add(xu.g.class);
    }
}
