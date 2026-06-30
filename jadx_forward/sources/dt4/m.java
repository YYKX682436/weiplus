package dt4;

/* loaded from: classes14.dex */
public final class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dt4.p f324788a;

    public m(dt4.p pVar) {
        this.f324788a = pVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p012xc85e97e9.p093xedfae76a.c1 a18;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ((java.util.ArrayList) this.f324788a.f324803c).remove(java.lang.Integer.valueOf(fVar.f152153f.hashCode()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerDataCenter", "queryAAOrder errCode:%s errMsg:%s errType:%s cgiCount:%d orders:%d", java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c, java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(((java.util.ArrayList) this.f324788a.f324803c).size()), java.lang.Integer.valueOf(((r45.c) fVar.f152151d).f452719d.size()));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            java.util.LinkedList<r45.t> orders = ((r45.c) fVar.f152151d).f452719d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(orders, "orders");
            dt4.p pVar = this.f324788a;
            for (r45.t tVar : orders) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f467572d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedgerDataCenter", "queryAAOrder error:bill_no is null");
                } else {
                    p75.l0 G0 = dm.ec.G0(tVar.f467572d);
                    synchronized (jm0.k.f381803i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(xs4.b.class);
                    }
                    dm.ec ecVar = (dm.ec) G0.o(((xs4.b) a17).Q4(), dm.ec.class);
                    if (ecVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLedgerDataCenter", "queryAAOrder order:" + tVar.f467572d + " record is empty");
                    } else if (ecVar.z0() == 1) {
                        java.util.LinkedList<r45.b0> payer_list = tVar.f467575g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payer_list, "payer_list");
                        for (r45.b0 b0Var : payer_list) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerDataCenter", "queryAAOrder receiver, sendId:" + tVar.f467572d + " user:" + b0Var.f451917d + " time:" + b0Var.f451919f + " msgid:" + ecVar.u0() + " amount:" + b0Var.f451918e);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(tVar.f467572d);
                            sb6.append('_');
                            sb6.append(b0Var.f451917d);
                            java.lang.String sb7 = sb6.toString();
                            p75.l0 G02 = dm.ec.G0(sb7);
                            synchronized (jm0.k.f381803i) {
                                gm0.j1.b().c();
                                if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                                }
                                a18 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(xs4.b.class);
                            }
                            dm.ec ecVar2 = (dm.ec) G02.o(((xs4.b) a18).Q4(), dm.ec.class);
                            if (ecVar2 == null || ecVar2.y0() != b0Var.f451918e) {
                                dm.ec ecVar3 = new dm.ec();
                                ecVar3.W0(sb7);
                                ecVar3.P0(pVar.f324801a);
                                ecVar3.L0(b0Var.f451919f * 1000);
                                ecVar3.I0(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t(ecVar.v0()));
                                ecVar3.J0(ecVar.u0());
                                ecVar3.U0(b0Var.f451917d);
                                ecVar3.T0(ecVar.A0());
                                ecVar3.Q0(b0Var.f451918e);
                                ecVar3.R0(1);
                                pVar.q(ecVar3, ecVar2 == null);
                            }
                        }
                        if (tVar.f467574f == 2) {
                            pVar.r(ecVar);
                        }
                    } else {
                        java.util.LinkedList<r45.b0> payer_list2 = tVar.f467575g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(payer_list2, "payer_list");
                        for (r45.b0 b0Var2 : payer_list2) {
                            if (c01.z1.r().equals(b0Var2.f451917d)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerDataCenter", "queryAAOrder payer, sendId:" + tVar.f467572d + " time:" + b0Var2.f451919f + " msgid:" + ecVar.u0() + " amount:" + b0Var2.f451918e);
                                ecVar.Q0(b0Var2.f451918e);
                                ecVar.L0(((long) b0Var2.f451919f) * ((long) 1000));
                                ecVar.I0(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t(ecVar.v0()));
                                pVar.q(ecVar, false);
                            }
                        }
                    }
                }
            }
        }
        dt4.p.d(this.f324788a);
        ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) this.f324788a.f324804d).c();
        return null;
    }
}
