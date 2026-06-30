package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v f148907d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v vVar) {
        super(1);
        this.f148907d = vVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        hb0.a state = (hb0.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof eb0.b)) {
            eb0.b bVar = (eb0.b) dVar;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            final com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v vVar = this.f148907d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = bVar.f332234b;
            if (c12473xe2bfc4b5 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5.class);
                if (k5Var != null && vVar.f148911e == null) {
                    vVar.f148911e = new db0.j(((zh1.p) k5Var).Ui(state.f361553p, state.f361551n, c12473xe2bfc4b5, state.f361552o), arrayList.size());
                }
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 : c12473xe2bfc4b5.f167785g) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12474x8b872a21);
                    arrayList.add(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.o(c12474x8b872a21));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgByAppBrandUIC", "fetchOpenMaterialsQuickly dataList:" + arrayList.size() + " collection:" + c12473xe2bfc4b5);
            if (arrayList.size() > 0) {
                em.a U6 = vVar.U6();
                if (U6.f335570b == null) {
                    U6.f335570b = (android.widget.TextView) U6.f335569a.findViewById(com.p314xaae8f345.mm.R.id.ser);
                }
                U6.f335570b.setVisibility(0);
                vVar.U6().b().setVisibility(0);
                int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 32);
                if (bVar.f332237e) {
                    vVar.U6().a().setVisibility(8);
                    com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v.T6(vVar, b17);
                    c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.feature.openmsg.uic.OpenMsgByAppBrandUIC$itemConvertFactory$1
                        @Override // in5.s
                        /* renamed from: getItemConvert */
                        public in5.r mo43555xf2bb75ea(int type) {
                            db0.e eVar;
                            db0.j jVar = com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v.this.f148911e;
                            if (jVar != null) {
                                if (jVar.f309365b == null) {
                                    jVar.f309365b = new db0.i(jVar);
                                }
                                eVar = jVar.f309365b;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
                            } else {
                                eVar = null;
                            }
                            return new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.q(eVar);
                        }
                    }, arrayList, false);
                } else if (arrayList.size() <= 3) {
                    vVar.U6().a().setVisibility(8);
                    com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v.T6(vVar, b17);
                    c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.feature.openmsg.uic.OpenMsgByAppBrandUIC$itemConvertFactory$1
                        @Override // in5.s
                        /* renamed from: getItemConvert */
                        public in5.r mo43555xf2bb75ea(int type) {
                            db0.e eVar;
                            db0.j jVar = com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v.this.f148911e;
                            if (jVar != null) {
                                if (jVar.f309365b == null) {
                                    jVar.f309365b = new db0.i(jVar);
                                }
                                eVar = jVar.f309365b;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
                            } else {
                                eVar = null;
                            }
                            return new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.q(eVar);
                        }
                    }, arrayList, false);
                } else {
                    vVar.U6().a().setVisibility(0);
                    com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v.T6(vVar, 0);
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.feature.openmsg.uic.OpenMsgByAppBrandUIC$itemConvertFactory$1
                        @Override // in5.s
                        /* renamed from: getItemConvert */
                        public in5.r mo43555xf2bb75ea(int type) {
                            db0.e eVar;
                            db0.j jVar = com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v.this.f148911e;
                            if (jVar != null) {
                                if (jVar.f309365b == null) {
                                    jVar.f309365b = new db0.i(jVar);
                                }
                                eVar = jVar.f309365b;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
                            } else {
                                eVar = null;
                            }
                            return new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.q(eVar);
                        }
                    }, new java.util.ArrayList(kz5.n0.K0(arrayList, 3)), false);
                    vVar.U6().a().setOnClickListener(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.r(vVar, b17, c22848x6ddd90cf2, arrayList));
                    c22848x6ddd90cf = c22848x6ddd90cf2;
                }
                c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.s(arrayList, vVar, c12473xe2bfc4b5, bVar);
                vVar.U6().b().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(vVar.m80379x76847179(), 1, false));
                vVar.U6().b().mo7960x6cab2c8d(c22848x6ddd90cf);
            } else {
                em.a U62 = vVar.U6();
                if (U62.f335570b == null) {
                    U62.f335570b = (android.widget.TextView) U62.f335569a.findViewById(com.p314xaae8f345.mm.R.id.ser);
                }
                U62.f335570b.setVisibility(8);
                vVar.U6().b().setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
