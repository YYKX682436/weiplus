package dt4;

/* loaded from: classes14.dex */
public final class o implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dt4.p f324798a;

    public o(dt4.p pVar) {
        this.f324798a = pVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        java.util.Iterator it;
        boolean z17;
        p012xc85e97e9.p093xedfae76a.c1 a18;
        java.util.LinkedList linkedList;
        p012xc85e97e9.p093xedfae76a.c1 a19;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ((java.util.ArrayList) this.f324798a.f324803c).remove(java.lang.Integer.valueOf(fVar.f152153f.hashCode()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder errCode:%s errMsg:%s errType:%s orders:%d", java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c, java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(((r45.sf) fVar.f152151d).f467195d.size()));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            java.util.LinkedList<r45.n25> orders = ((r45.sf) fVar.f152151d).f467195d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(orders, "orders");
            dt4.p pVar = this.f324798a;
            for (r45.n25 n25Var : orders) {
                int i17 = n25Var.f462561d;
                long j17 = 0;
                if (i17 == 1) {
                    r45.jz5 jz5Var = n25Var.f462562e;
                    if (jz5Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jz5Var.f459763d)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder order.sendOrder is empty");
                    } else {
                        p75.l0 G0 = dm.ec.G0(n25Var.f462562e.f459763d);
                        synchronized (jm0.k.f381803i) {
                            gm0.j1.b().c();
                            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                            }
                            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(xs4.b.class);
                        }
                        dm.ec ecVar = (dm.ec) G0.o(((xs4.b) a17).Q4(), dm.ec.class);
                        if (ecVar == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder sendOrder:" + n25Var.f462562e.f459763d + " record is empty");
                        } else {
                            r45.jz5 jz5Var2 = n25Var.f462562e;
                            int i18 = jz5Var2.f459765f;
                            if (i18 == 0 || (i18 == 2 && ((linkedList = jz5Var2.f459766g) == null || linkedList.isEmpty()))) {
                                pVar.r(ecVar);
                            } else {
                                java.util.LinkedList receivers = n25Var.f462562e.f459766g;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(receivers, "receivers");
                                java.util.Iterator it6 = receivers.iterator();
                                while (it6.hasNext()) {
                                    r45.lk5 lk5Var = (r45.lk5) it6.next();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder sendOrder, sendId:" + n25Var.f462562e.f459763d + " user:" + lk5Var.f461093d + " time:" + ecVar.v0() + " msgid:" + ecVar.u0() + " amount:" + lk5Var.f461094e);
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lk5Var.f461093d) && lk5Var.f461094e > j17) {
                                        java.lang.String str = n25Var.f462562e.f459763d + '_' + lk5Var.f461093d;
                                        p75.l0 G02 = dm.ec.G0(str);
                                        synchronized (jm0.k.f381803i) {
                                            gm0.j1.b().c();
                                            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                                                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                                            }
                                            a18 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(xs4.b.class);
                                        }
                                        dm.ec ecVar2 = (dm.ec) G02.o(((xs4.b) a18).Q4(), dm.ec.class);
                                        if (ecVar2 == null || ecVar2.y0() != lk5Var.f461094e) {
                                            dm.ec ecVar3 = new dm.ec();
                                            ecVar3.W0(str);
                                            ecVar3.P0(pVar.f324801a);
                                            it = it6;
                                            ecVar3.L0(lk5Var.f461095f * 1000);
                                            ecVar3.I0(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t(lk5Var.f461095f));
                                            ecVar3.J0(ecVar.u0());
                                            ecVar3.U0(lk5Var.f461093d);
                                            ecVar3.T0(ecVar.A0());
                                            ecVar3.Q0(lk5Var.f461094e);
                                            ecVar3.R0(2);
                                            pVar.q(ecVar3, ecVar2 == null);
                                            if (lk5Var.f461093d.equals(c01.z1.r())) {
                                                dm.ec ecVar4 = new dm.ec();
                                                ecVar4.W0(n25Var.f462562e.f459763d + "_my_" + lk5Var.f461093d);
                                                ecVar4.P0(pVar.f324801a);
                                                ecVar4.L0(ecVar3.v0());
                                                ecVar4.I0(ecVar3.t0());
                                                ecVar4.J0(ecVar.u0());
                                                ecVar4.U0(lk5Var.f461093d);
                                                ecVar4.T0(ecVar.A0());
                                                ecVar4.Q0(lk5Var.f461094e);
                                                z17 = true;
                                                ecVar4.R0(1);
                                                pVar.q(ecVar4, ecVar2 == null);
                                                it6 = it;
                                                j17 = 0;
                                            }
                                            z17 = true;
                                            it6 = it;
                                            j17 = 0;
                                        }
                                    }
                                    it = it6;
                                    z17 = true;
                                    it6 = it;
                                    j17 = 0;
                                }
                                if (n25Var.f462562e.f459765f == 2) {
                                    pVar.r(ecVar);
                                }
                            }
                        }
                    }
                } else if (i17 != 2) {
                    continue;
                } else {
                    r45.ik5 ik5Var = n25Var.f462563f;
                    if (ik5Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ik5Var.f458643d)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder order.receiveOrder is empty");
                    } else {
                        p75.l0 G03 = dm.ec.G0(n25Var.f462563f.f458643d);
                        synchronized (jm0.k.f381803i) {
                            gm0.j1.b().c();
                            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                            }
                            a19 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(xs4.b.class);
                        }
                        dm.ec ecVar5 = (dm.ec) G03.o(((xs4.b) a19).Q4(), dm.ec.class);
                        if (ecVar5 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder receiveOrder:" + n25Var.f462563f.f458643d + " record is empty");
                        } else {
                            r45.ik5 ik5Var2 = n25Var.f462563f;
                            int i19 = ik5Var2.f458648i;
                            if (i19 == 0 || (i19 == 2 && ik5Var2.f458646g <= 0)) {
                                pVar.r(ecVar5);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder receiverOrder, sendId:" + ecVar5.F0() + " user:" + ecVar5.D0() + " time:" + n25Var.f462563f.f458647h + " msgid:" + ecVar5.u0() + " amount:" + n25Var.f462563f.f458646g);
                                ecVar5.Q0(n25Var.f462563f.f458646g);
                                ecVar5.L0(n25Var.f462563f.f458647h * ((long) 1000));
                                ecVar5.I0(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t(n25Var.f462563f.f458647h));
                                pVar.q(ecVar5, false);
                            }
                        }
                    }
                }
            }
        }
        dt4.p.d(this.f324798a);
        ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) this.f324798a.f324804d).c();
        return null;
    }
}
