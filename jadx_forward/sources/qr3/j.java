package qr3;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p14 f447625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.n14 f447626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qr3.o f447627f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.p14 p14Var, r45.n14 n14Var, qr3.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f447625d = p14Var;
        this.f447626e = n14Var;
        this.f447627f = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qr3.j(this.f447625d, this.f447626e, this.f447627f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qr3.j jVar = (qr3.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.p14 p14Var = this.f447625d;
        r45.n14 n14Var = this.f447626e;
        qr3.o oVar = this.f447627f;
        if (p14Var == null && n14Var == null && !oVar.O6().f235708e.r2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoSettingJsApiUIC", "show empty view!");
            oVar.P6(true, oVar.O6().f235707d);
        } else {
            if (x51.t1.b(oVar.f447639g)) {
                oVar.f447639g = n14Var != null ? n14Var.f462523d : null;
            }
            oVar.O6().f235721u.add(oVar);
            qr3.o.f447635m = n14Var;
            if (n14Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoSettingJsApiUIC", "resp == null");
            } else {
                java.util.LinkedList<r45.wb> linkedList = n14Var.f462524e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoSettingJsApiUIC", "scopeList.size = " + linkedList.size());
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (((r45.wb) it.next()).f470558f != 0) {
                        oVar.f447636d++;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoSettingJsApiUIC", "effectiveAuthScopeItemNum = " + oVar.f447636d);
                int i17 = oVar.f447636d;
                if (i17 > 0) {
                    for (int i18 = 0; i18 < 4; i18++) {
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) oVar.O6().f235707d).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(oVar.m80379x76847179(), null), -1);
                    }
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(oVar.m80379x76847179());
                    c21560x1fce98fb.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570219a23;
                    java.lang.String string = oVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bc6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{oVar.f447637e}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    c21560x1fce98fb.L(format);
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) oVar.O6().f235707d).d(c21560x1fce98fb, -1);
                    for (r45.wb wbVar : linkedList) {
                        if (wbVar.f470558f != 0) {
                            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe(oVar.m80379x76847179());
                            c21541x1c1b08fe.L(wbVar.f470557e);
                            c21541x1c1b08fe.L = wbVar.f470558f == 1;
                            c21541x1c1b08fe.C(wbVar.f470556d);
                            c21541x1c1b08fe.f279318v = false;
                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) oVar.O6().f235707d).d(c21541x1c1b08fe, -1);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoSettingJsApiUIC", "add preference: %s", wbVar.f470557e);
                        }
                    }
                    oVar.P6(false, oVar.O6().f235707d);
                } else if (i17 == 0 && n14Var.f462525f.size() == 0) {
                    oVar.O6().f235708e.r2();
                }
            }
            if (n14Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoSettingJsApiUIC", "resp == null");
            } else if (n14Var.f462525f.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoSettingJsApiUIC", "privacy_scope_item_list.size == 0");
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) oVar.O6().f235707d).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(oVar.m80379x76847179(), null), -1);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(oVar.m80379x76847179());
                c21560x1fce98fb2.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
                c21560x1fce98fb2.L(oVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bc8));
                c21560x1fce98fb2.C("NewBizInfoAuthMainUI");
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) oVar.O6().f235707d).d(c21560x1fce98fb2, -1);
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) oVar.O6().f235707d).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(oVar.m80379x76847179(), null), -1);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb3 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(oVar.m80379x76847179());
            c21560x1fce98fb3.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
            c21560x1fce98fb3.L(oVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.an6));
            c21560x1fce98fb3.C("NewBizInfoRecordUI");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) oVar.O6().f235707d).d(c21560x1fce98fb3, -1);
            oVar.P6(false, oVar.O6().f235707d);
        }
        return jz5.f0.f384359a;
    }
}
