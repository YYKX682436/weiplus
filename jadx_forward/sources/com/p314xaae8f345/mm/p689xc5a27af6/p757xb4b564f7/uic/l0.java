package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 f148879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var) {
        super(1);
        this.f148879d = n0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var;
        hb0.a state = (hb0.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgDeviceUIC", "init msgId:" + state.f361547g + " talker:" + state.f361549i);
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof eb0.c)) {
            eb0.c cVar = (eb0.c) dVar;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = cVar.f332238b;
            final com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var = this.f148879d;
            n0Var.f148893e = f9Var;
            java.lang.String str = state.f361549i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            n0Var.f148894f = str;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
            long j17 = state.f361547g;
            am.b6 b6Var = c5348xb8e1a564.f135674g;
            b6Var.f87752a = j17;
            b6Var.f87753b = state.f361549i;
            b6Var.f87755d = -1;
            c5348xb8e1a564.e();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("haveDeviceEvent result.isOk:");
            am.c6 c6Var = c5348xb8e1a564.f135675h;
            sb6.append(c6Var.f87869a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgDeviceUIC", sb6.toString());
            if (c6Var.f87869a) {
                em.a V6 = n0Var.V6();
                if (V6.f335572d == null) {
                    V6.f335572d = (android.widget.TextView) V6.f335569a.findViewById(com.p314xaae8f345.mm.R.id.t3q);
                }
                V6.f335572d.setVisibility(0);
                em.a V62 = n0Var.V6();
                if (V62.f335573e == null) {
                    V62.f335573e = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) V62.f335569a.findViewById(com.p314xaae8f345.mm.R.id.t3p);
                }
                V62.f335573e.setVisibility(0);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.feature.openmsg.uic.OpenMsgDeviceUIC$onCreate$1$1$deviceAdapter$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        db0.e eVar;
                        if (type != 1) {
                            if (type == 2) {
                                return new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.f0(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.this);
                            }
                            if (type == 3) {
                                return new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.i0(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.this);
                            }
                            throw new java.lang.Throwable("not support");
                        }
                        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var2 = com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.this;
                        db0.j jVar = n0Var2.f148895g;
                        if (jVar != null) {
                            if (jVar.f309366c == null) {
                                jVar.f309366c = new db0.h(jVar);
                            }
                            eVar = jVar.f309366c;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
                        } else {
                            eVar = null;
                        }
                        return new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.d0(n0Var2, eVar);
                    }
                }, arrayList, false);
                em.a V63 = n0Var.V6();
                if (V63.f335575g == null) {
                    V63.f335575g = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) V63.f335569a.findViewById(com.p314xaae8f345.mm.R.id.t3o);
                }
                V63.f335575g.mo7960x6cab2c8d(c22848x6ddd90cf);
                em.a V64 = n0Var.V6();
                if (V64.f335575g == null) {
                    V64.f335575g = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) V64.f335569a.findViewById(com.p314xaae8f345.mm.R.id.t3o);
                }
                V64.f335575g.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(n0Var.m80379x76847179(), 0, false));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5346xb93c92b5 c5346xb93c92b5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5346xb93c92b5();
                long j18 = state.f361547g;
                am.x5 x5Var = c5346xb93c92b5.f135670g;
                x5Var.f89879a = j18;
                x5Var.f89883e = state.f361549i;
                c5346xb93c92b5.e();
                am.y5 y5Var = c5346xb93c92b5.f135671h;
                if (y5Var.f89969c) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.List list = y5Var.f89967a;
                    if (list != null) {
                        java.util.ArrayList arrayList5 = (java.util.ArrayList) list;
                        int size = arrayList5.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = new com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2();
                            java.lang.Object obj2 = arrayList5.get(i18);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                            c10597xb1f0d2.f148120e = (java.lang.String) ((java.util.Map) obj2).get("deviceType");
                            java.lang.Object obj3 = arrayList5.get(i18);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
                            c10597xb1f0d2.f148119d = (java.lang.String) ((java.util.Map) obj3).get("deviceID");
                            java.lang.Object obj4 = arrayList5.get(i18);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
                            c10597xb1f0d2.f148121f = (java.lang.String) ((java.util.Map) obj4).get("displayName");
                            java.lang.Object obj5 = arrayList5.get(i18);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj5);
                            c10597xb1f0d2.f148122g = (java.lang.String) ((java.util.Map) obj5).get("iconUrl");
                            java.lang.Object obj6 = arrayList5.get(i18);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj6);
                            c10597xb1f0d2.f148123h = (java.lang.String) ((java.util.Map) obj6).get("ability");
                            java.lang.Object obj7 = arrayList5.get(i18);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj7);
                            c10597xb1f0d2.f148124i = (java.lang.String) ((java.util.Map) obj7).get("abilityInf");
                            c10597xb1f0d2.f148125m = "send_data_idle";
                            if (com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.T6(n0Var, cVar.f332238b, c10597xb1f0d2)) {
                                arrayList4.add(c10597xb1f0d2);
                            }
                        }
                    }
                    java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ob8);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    if (y5Var.f89968b != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgDeviceUIC", "iotDeviceInfo size =" + ((java.util.ArrayList) y5Var.f89968b).size());
                        java.util.List list2 = y5Var.f89968b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(list2, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.protocal.protobuf.MMIotDeviceInfo>");
                        java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
                        while (it.hasNext()) {
                            r45.pf4 pf4Var = (r45.pf4) it.next();
                            com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d22 = new com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2();
                            c10597xb1f0d22.f148119d = pf4Var.f464537e;
                            c10597xb1f0d22.f148128p = pf4Var.f464536d;
                            c10597xb1f0d22.f148121f = pf4Var.f464538f;
                            c10597xb1f0d22.f148122g = pf4Var.f464539g;
                            c10597xb1f0d22.f148129q = pf4Var.f464540h;
                            c10597xb1f0d22.f148127o = true;
                            if (com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.T6(n0Var, cVar.f332238b, c10597xb1f0d22)) {
                                int i19 = c10597xb1f0d22.f148128p;
                                if (i19 == 1) {
                                    arrayList2.add(c10597xb1f0d22);
                                } else if (i19 == 2) {
                                    c10597xb1f0d22.f148121f += ' ' + string;
                                    arrayList3.add(c10597xb1f0d22);
                                }
                            }
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d23 = new com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2();
                        c10597xb1f0d23.f148127o = true;
                        c10597xb1f0d23.f148119d = com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.f148891i;
                        c10597xb1f0d23.f148121f = n0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.c47);
                        arrayList2.add(c10597xb1f0d23);
                    }
                    java.util.Iterator it6 = arrayList2.iterator();
                    int i27 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i17 = 6;
                            break;
                        }
                        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d24 = (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2) it6.next();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10597xb1f0d24);
                        arrayList.add(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.e0(n0Var, c10597xb1f0d24, false, 2, null));
                        i27++;
                        i17 = 6;
                        if (i27 >= 6) {
                            break;
                        }
                    }
                    if (arrayList2.size() > i17) {
                        arrayList.add(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.j0(n0Var, false, 1, null));
                    }
                    if (arrayList2.size() > 0 && arrayList3.size() > 0) {
                        arrayList.add(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.g0(n0Var));
                    }
                    java.util.Iterator it7 = arrayList3.iterator();
                    int i28 = 0;
                    while (it7.hasNext()) {
                        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d25 = (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2) it7.next();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10597xb1f0d25);
                        arrayList.add(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.e0(n0Var, c10597xb1f0d25, false, 2, null));
                        i28++;
                        if (i28 >= i17) {
                            break;
                        }
                    }
                    if (n0Var.f148895g == null && (k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5.class)) != null) {
                        n0Var.f148895g = new db0.j(((zh1.p) k5Var).Ui(state.f361553p, state.f361551n, null, state.f361552o), arrayList.size());
                    }
                    if (arrayList3.size() > i17) {
                        arrayList.add(new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.j0(n0Var, false, 1, null));
                    }
                    c22848x6ddd90cf.m8146xced61ae5();
                }
            } else {
                em.a V65 = n0Var.V6();
                if (V65.f335572d == null) {
                    V65.f335572d = (android.widget.TextView) V65.f335569a.findViewById(com.p314xaae8f345.mm.R.id.t3q);
                }
                V65.f335572d.setVisibility(8);
                em.a V66 = n0Var.V6();
                if (V66.f335573e == null) {
                    V66.f335573e = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) V66.f335569a.findViewById(com.p314xaae8f345.mm.R.id.t3p);
                }
                V66.f335573e.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
